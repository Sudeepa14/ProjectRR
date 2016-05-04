import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JLabel;
import javax.swing.JSlider;

public class Controller {
	ArrayList<Process> DefaultProcesses=new ArrayList<Process>();
	Queue<Process> processes=new LinkedList<Process>();
	Queue<JLabel> proceed=new LinkedList<JLabel>();
	Queue<JLabel> turnArround=new LinkedList<JLabel>(); 
	Queue<JSlider> sliders=new LinkedList<JSlider>(); 
	
	Controller(int numOfProcesse,ArrayList<Integer> burstTime,ArrayList<Integer> arrivalTime,ArrayList<JSlider> sliders,ArrayList<JLabel> proceed,ArrayList<JLabel> turnArround){
		
		Process p1=new Process(1,0,0);
		Process p2=new Process(2,0,0);
		Process p3=new Process(3,0,0);
		Process p4=new Process(4,0,0);
		Process p5=new Process(5,0,0);
		
		p1.setMoniter(sliders.get(0),proceed.get(0),turnArround.get(0));
		p2.setMoniter(sliders.get(1),proceed.get(1),turnArround.get(1));
		p3.setMoniter(sliders.get(2),proceed.get(2),turnArround.get(2));
		p4.setMoniter(sliders.get(3),proceed.get(3),turnArround.get(3));
		p5.setMoniter(sliders.get(4),proceed.get(4),turnArround.get(4));
		
		DefaultProcesses.add(p1);
		DefaultProcesses.add(p2);
		DefaultProcesses.add(p3);
		DefaultProcesses.add(p4);
		DefaultProcesses.add(p5);
				
    	for(Process p:DefaultProcesses){
    		if(DefaultProcesses.indexOf(p)<numOfProcesse){
    			p.setBurstTime(burstTime.get(DefaultProcesses.indexOf(p)));
    			p.setArrivalTime(arrivalTime.get(DefaultProcesses.indexOf(p)));
    			processes.add(p);
    		}
    	}
	}
	public Queue<Process> getProcesses(){
		return processes;
	}
}

