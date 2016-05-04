import javax.swing.JLabel;
import javax.swing.JSlider;

public class Process {
	private int burstTime;
	private int remainingTime;
	private int proceedTime=0;
	private int processId;
	private int arrivalTime;
	private JSlider slider ;
	private JLabel proceed;
	private JLabel turnArround;
	Process(int processId ,int burstTime, int arrivalTime){
    	
    	this.processId=processId;
    	this.burstTime=burstTime;
    	this.arrivalTime=arrivalTime;
    	this.remainingTime=burstTime;
    	}
	public void processing(){
		if (proceedTime==0){
			slider.setMaximum(burstTime);
		}
		if(!slider.isEnabled()){
			slider.setEnabled(true);
		}
		proceedTime++;
		remainingTime--;

		slider.setValue(slider.getValue()+1);
		proceed.setText(Integer.toString(proceedTime));

	}
	
	public int getRemaingTime(){
		return remainingTime;
	}
	public void setRemaing(int time) {
		this.remainingTime=time;
	}
	public int getIdentifier(){
		return processId;
	}
	public int getProceedTime(){
		return proceedTime;
	}
	public int getArrivalTime(){
		return arrivalTime;
	}
	public void setBurstTime(int burstTime){
		this.burstTime=burstTime;
		this.remainingTime=burstTime;    	
	}
	public int getBurstTime(){
		return this.burstTime;
	}
	public int getStartedtime(){
		return 1;
	}
	public void setMoniter(JSlider slider,JLabel proceed,JLabel turnArround){	
		this.slider=slider;
		this.proceed=proceed;
		this.turnArround=turnArround;
	}
	public void setArrivalTime(int arrivalTime){
		this.arrivalTime=arrivalTime;
		
	}
	public void setTurnArround(int currentTime){
		turnArround.setText(Integer.toString(currentTime));
	}
    public void disableSlider(){
    	this.slider.setEnabled(false);
    }
}
