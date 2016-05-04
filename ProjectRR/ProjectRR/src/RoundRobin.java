import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin extends Thread{
	private Queue<Process> processQueue=new LinkedList<Process>();
	private int timeQuamtum;
	private  Process currentProcess;
    private int currentTime=-1;
    private LinkedList<Integer> arrivalTimeList=new LinkedList<Integer>();
    private Queue<Process> activeProcessQueue=new LinkedList<Process>();
    private int timePerAround=0;
    private Frame3 frame3; 
    
    public static void main(String[] args) {	
    	Frame1 f1=new Frame1();
    	f1.show();
    }
    RoundRobin(Queue<Process> ProcessQueue, int timeQuantum,LinkedList<Integer> arrivalTime,Frame3 frame3){
    	this.processQueue=ProcessQueue;
    	this.timeQuamtum=timeQuantum;
    	this.arrivalTimeList=arrivalTime;
    	this.frame3=frame3;
    }
    public void run(){
    	 while(processQueue.size()!=0){
    		 checkArrivalTime();
    		 frame3.setRemainingProcesses(processQueue.size()+activeProcessQueue.size()-1);
    		 try {
  				Thread.sleep(1000);
  			} catch (InterruptedException e) {
  				e.printStackTrace();
  			}
    		 while(activeProcessQueue.size()!=0){
    			 currentProcess=activeProcessQueue.remove();
    			 timePerAround=0;
    			 while(timePerAround<timeQuamtum && currentProcess.getRemaingTime()>0){
    				    timePerAround++;
    				    currentProcess.processing();
    				    currentProcess.setTurnArround(currentTime-currentProcess.getArrivalTime()+1);
    				    checkArrivalTime();  
		        		 try {
		     				Thread.sleep(1000);
		     			} catch (InterruptedException e) {
		     				e.printStackTrace();
		     			}
    			 }
    			 if(currentProcess.getRemaingTime()>0){
                 	activeProcessQueue.add(currentProcess);
                 }
    			 else if(currentProcess.getRemaingTime()==0){
    				 frame3.setRemainingProcesses(processQueue.size()+activeProcessQueue.size()-1);
    				 currentProcess.disableSlider();
                  }
    		 }
    	 }
    	 frame3.setStartEnabled();
    }
    public void checkArrivalTime(){
    	currentTime++;
    	frame3.setCurrentTime(currentTime);
    	for(int i:arrivalTimeList){
    		if(currentTime==i){
    			activeProcessQueue.add(processQueue.remove());
    			break;
    		}
    	}
    	
    }
}
