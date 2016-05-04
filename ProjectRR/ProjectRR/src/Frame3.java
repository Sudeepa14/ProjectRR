import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Frame3 extends JFrame {
    //private Controller controller;
	private JPanel contentPane;
	private int timeQuantum;
	private ArrayList<Integer> burstList;
	private int numOfProcess;
	private LinkedList<Integer> arrivalQueue;
    private ArrayList<JLabel> proceedLabels=new ArrayList<JLabel>();
    private ArrayList<JLabel> turnArround=new ArrayList<JLabel>();
	private ArrayList<JSlider> slider=new ArrayList<JSlider>();
	private Controller controller;
	private Frame3 frame3;
	private JButton start;
	private ArrayList<JLabel> labels=new ArrayList<JLabel>();;
	private JLabel currentTime;
	private JLabel remaingProcesses;
	public Frame3(LinkedList<Integer> arrivalQueue,ArrayList<Integer> burstList,int numOfProcesse, int timeQuantum) {
		this.timeQuantum=timeQuantum;
		this.numOfProcess=numOfProcesse;
		this.arrivalQueue=arrivalQueue;
		this.burstList=burstList;
		this.frame3=this;
		setTitle("            Processes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 694, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(83, 11, 522, 87);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProcess1 = new JLabel("PROCESS 1");
		lblProcess1.setBounds(10, 24, 71, 26);
		panel.add(lblProcess1);
		
		JSlider sldr1 = new JSlider();
		sldr1.setBounds(91, 24, 222, 26);
		panel.add(sldr1);
		sldr1.setValue(0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(340, 11, 172, 65);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBurstTime = new JLabel("Proceed Time");
		lblBurstTime.setBounds(10, 11, 92, 14);
		panel_1.add(lblBurstTime);
		
		JLabel lblServiceTime = new JLabel("Service Time");
		lblServiceTime.setBounds(10, 36, 75, 14);
		panel_1.add(lblServiceTime);
		
		JLabel lblProcessed1 = new JLabel("");
		lblProcessed1.setBounds(112, 11, 46, 14);
		panel_1.add(lblProcessed1);
		
		
		JLabel lblService1 = new JLabel("");
		lblService1.setBounds(112, 36, 46, 14);
		panel_1.add(lblService1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBounds(83, 110, 522, 87);
		contentPane.add(panel_2);
		
		JLabel lblProcess = new JLabel("PROCESS 2");
		lblProcess.setBounds(10, 24, 71, 26);
		panel_2.add(lblProcess);
		
		JSlider sldr2 = new JSlider();
		sldr2.setValue(0);
		sldr2.setBounds(91, 24, 222, 26);
		panel_2.add(sldr2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(340, 11, 172, 65);
		panel_2.add(panel_3);
		
		JLabel lblProceedtime = new JLabel("Proceed Time ");
		lblProceedtime.setBounds(10, 11, 96, 14);
		panel_3.add(lblProceedtime);
		
		JLabel label_2 = new JLabel("Service Time");
		label_2.setBounds(10, 36, 75, 14);
		panel_3.add(label_2);
		
		JLabel lblProcessed2 = new JLabel("");
		lblProcessed2.setBounds(116, 11, 46, 14);
		panel_3.add(lblProcessed2);
		
		JLabel lblService2 = new JLabel("");
		lblService2.setBounds(116, 36, 46, 14);
		panel_3.add(lblService2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setLayout(null);
		panel_4.setBounds(83, 208, 522, 87);
		contentPane.add(panel_4);
		
		JLabel lblProcess_1 = new JLabel("PROCESS 3");
		lblProcess_1.setBounds(10, 24, 71, 26);
		panel_4.add(lblProcess_1);
		
		JSlider sldr3 = new JSlider();
		sldr3.setValue(0);
		sldr3.setBounds(91, 24, 222, 26);
		panel_4.add(sldr3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(341, 11, 171, 65);
		panel_4.add(panel_5);
		
		JLabel lblProceedtime_1 = new JLabel("Proceed Time ");
		lblProceedtime_1.setBounds(10, 11, 95, 14);
		panel_5.add(lblProceedtime_1);
		
		JLabel label_7 = new JLabel("Service Time");
		label_7.setBounds(10, 36, 75, 14);
		panel_5.add(label_7);
		
		JLabel lblProcessed3 = new JLabel("");
		lblProcessed3.setBounds(115, 11, 46, 14);
		panel_5.add(lblProcessed3);
		
		JLabel lblService3 = new JLabel("");
		lblService3.setBounds(115, 36, 46, 14);
		panel_5.add(lblService3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setLayout(null);
		panel_6.setBounds(83, 306, 522, 87);
		contentPane.add(panel_6);
		
		JLabel lblProcess_2 = new JLabel("PROCESS 4");
		lblProcess_2.setBounds(10, 24, 71, 26);
		panel_6.add(lblProcess_2);
		
		JSlider sldr4 = new JSlider();
		sldr4.setValue(0);
		sldr4.setBounds(91, 24, 222, 26);
		panel_6.add(sldr4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(343, 11, 169, 65);
		panel_6.add(panel_7);
		
		JLabel lblProceedtime_2 = new JLabel("Proceed Time ");
		lblProceedtime_2.setBounds(10, 11, 93, 14);
		panel_7.add(lblProceedtime_2);
		
		JLabel label_12 = new JLabel("Service Time");
		label_12.setBounds(10, 36, 75, 14);
		panel_7.add(label_12);
		
		JLabel lblProcessed4 = new JLabel("");
		lblProcessed4.setBounds(113, 11, 46, 14);
		panel_7.add(lblProcessed4);
		
		JLabel lblService4 = new JLabel("");
		lblService4.setBounds(113, 36, 46, 14);
		panel_7.add(lblService4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setLayout(null);
		panel_8.setBounds(83, 414, 522, 87);
		contentPane.add(panel_8);
		
		JLabel lblProcess_3 = new JLabel("PROCESS 5");
		lblProcess_3.setBounds(10, 24, 71, 26);
		panel_8.add(lblProcess_3);
		
		JSlider sldr5 = new JSlider();
		sldr5.setValue(0);
		sldr5.setBounds(91, 24, 222, 26);
		panel_8.add(sldr5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(342, 11, 170, 65);
		panel_8.add(panel_9);
		
		JLabel lblProceedtime_3 = new JLabel("Proceed Time ");
		lblProceedtime_3.setBounds(10, 11, 85, 14);
		panel_9.add(lblProceedtime_3);
		
		JLabel label_17 = new JLabel("Service Time");
		label_17.setBounds(10, 36, 75, 14);
		panel_9.add(label_17);
		
		JLabel lblProcessed5 = new JLabel("");
		lblProcessed5.setBounds(109, 11, 46, 14);
		panel_9.add(lblProcessed5);
		
		JLabel lblService5 = new JLabel("");
		lblService5.setBounds(109, 36, 46, 18);
		panel_9.add(lblService5);
		
		proceedLabels.add(lblProcessed1);
		proceedLabels.add(lblProcessed2);
		proceedLabels.add(lblProcessed3);
		proceedLabels.add(lblProcessed4);
		proceedLabels.add(lblProcessed5);
		
		turnArround.add(lblService1);
		turnArround.add(lblService2);
		turnArround.add(lblService3);
		turnArround.add(lblService4);
		turnArround.add(lblService5);
		
		sldr1.setEnabled(false);
		sldr2.setEnabled(false);
		sldr3.setEnabled(false);
		sldr4.setEnabled(false);
		sldr5.setEnabled(false);
		
		slider.add(sldr1);
		slider.add(sldr2);
		slider.add(sldr3);
		slider.add(sldr4);
		slider.add(sldr5);

		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnStart.setEnabled(false);
				for(JSlider slider:slider){
					slider.setValue(0);
				}
				for(JLabel lbl:labels){
					lbl.setText(" ");
				}
				startScheduling();
				RoundRobin rr=new  RoundRobin(controller.processes, timeQuantum, arrivalQueue,frame3);
				rr.start();
			}
		});
		
		btnStart.setBounds(548, 529, 86, 28);
		contentPane.add(btnStart);
		
		
		JLabel lblNewLabel = new JLabel("Current Time             =");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(40, 516, 168, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Remainng Processes  =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(40, 543, 148, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCurrentTime = new JLabel("0");
		lblCurrentTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentTime.setForeground(new Color(0, 0, 0));
		lblCurrentTime.setBounds(207, 511, 46, 23);
		contentPane.add(lblCurrentTime);
		
		JLabel lblRemaingProcesse = new JLabel("");
		lblRemaingProcesse.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRemaingProcesse.setBounds(207, 543, 46, 14);
		contentPane.add(lblRemaingProcesse);
		this.start=btnStart;
		
		labels.add(lblProcessed1);
		labels.add(lblProcessed2);
		labels.add(lblProcessed3);
		labels.add(lblProcessed4);
		labels.add(lblProcessed5);
		
		labels.add(lblService1);
		labels.add(lblService2);
		labels.add(lblService3);
		labels.add(lblService4);
		labels.add(lblService5);
		
		this.currentTime=lblCurrentTime;
		this.remaingProcesses=lblRemaingProcesse;
		
		JLabel lblS = new JLabel("s");
		lblS.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblS.setBounds(242, 514, 46, 19);
		contentPane.add(lblS);
	}
	public ArrayList<Integer> getArrivalList(){
		ArrayList<Integer> arrivalList=new ArrayList<Integer>();
		for(int i:arrivalQueue){
			arrivalList.add(i);
		}
		return arrivalList;
	}
	public void startScheduling(){
    	Controller controller= new Controller(numOfProcess, burstList, getArrivalList(),slider,proceedLabels,turnArround);
    	this.controller=controller;
	}
	public void setStartEnabled(){
		start.setEnabled(true);
	}
	public void setCurrentTime(int currentTiime){
		this.currentTime.setText(Integer.toString(currentTiime));
	}
	public void setRemainingProcesses(int numofprocesses){
		this.remaingProcesses.setText(Integer.toString(numofprocesses+1));
	}
}