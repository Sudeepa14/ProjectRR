import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;

public class Frame2 extends JFrame {

	private JPanel contentPane;
	private ArrayList<Integer> burstTime =new ArrayList<Integer>();
	private LinkedList<Integer> arrivalTime=new LinkedList<Integer>();
	private int timeQuantum;
	private int nuOfProcesses;
	private ArrayList<JPanel> panelArrayList = new ArrayList<JPanel>();
	
	private ArrayList<JComboBox> BurstComboArrayList = new ArrayList<JComboBox>();
	private ArrayList<JComboBox> ArrivalComboArrayList = new ArrayList<JComboBox>();

	public Frame2(int numOfProcesse, int timeQuantum) {
		this.nuOfProcesses=numOfProcesse;
		this.timeQuantum=timeQuantum;

		setTitle("     Enter Process Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel1.setBounds(32, 57, 198, 193);
		contentPane.add(panel1);
		panel1.setLayout(null);
			
		JLabel lblProcess = new JLabel("Process 1");
		lblProcess.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProcess.setBounds(60, 11, 115, 32);
		panel1.add(lblProcess);
		
		JLabel lblNewLabel = new JLabel("Arrival Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 73, 93, 14);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Burust TIme");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 108, 93, 14);
		panel1.add(lblNewLabel_1);
		
		JComboBox cmbArrival1 = new JComboBox();
		cmbArrival1.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cmbArrival1.setBounds(117, 71, 56, 20);
		cmbArrival1.setSelectedIndex(0);
		panel1.add(cmbArrival1);
		ArrivalComboArrayList.add(cmbArrival1);
		
		cmbArrival1.setEnabled(false);
		
		JComboBox cmbBurst1 = new JComboBox();
		cmbBurst1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		cmbBurst1.setBounds(117, 107, 56, 20);	
		panel1.add(cmbBurst1);
		BurstComboArrayList.add(cmbBurst1);
		cmbBurst1.setEnabled(false);
		
		panel1.setEnabled(false);
		addJpanel(panel1);
	
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(242, 57, 198, 193);
		contentPane.add(panel2);
		
		
		
		JLabel lblProcess_1 = new JLabel("Process 2");
		lblProcess_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProcess_1.setBounds(60, 11, 115, 32);
		panel2.add(lblProcess_1);
		
		JLabel label_1 = new JLabel("Arrival Time");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 73, 93, 14);
		panel2.add(label_1);
		
		JLabel label_2 = new JLabel("Burust TIme");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 108, 93, 14);
		panel2.add(label_2);
		
		JComboBox cmbArrival2 = new JComboBox();
		cmbArrival2.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cmbArrival2.setBounds(117, 71, 56, 20);
		cmbArrival2.setSelectedIndex(1);
		panel2.add(cmbArrival2);
		ArrivalComboArrayList.add(cmbArrival2);
		cmbArrival2.setEnabled(false);
		
		JComboBox cmbBurst2 = new JComboBox();
		cmbBurst2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		cmbBurst2.setBounds(117, 107, 56, 20);
		panel2.add(cmbBurst2);
		BurstComboArrayList.add(cmbBurst2);
		cmbBurst2.setEnabled(false);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel3.setBounds(450, 57, 198, 193);
		contentPane.add(panel3);
		
	
		JLabel lblProcess_2 = new JLabel("Process 3");
		lblProcess_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProcess_2.setBounds(60, 11, 115, 32);
		panel3.add(lblProcess_2);
		
		JLabel label_4 = new JLabel("Arrival Time");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(10, 73, 93, 14);
		panel3.add(label_4);
		
		JLabel label_5 = new JLabel("Burust TIme");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(10, 108, 93, 14);
		panel3.add(label_5);
		
		JComboBox cmbArrival3 = new JComboBox();
		cmbArrival3.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cmbArrival3.setBounds(117, 71, 56, 20);
		cmbArrival3.setSelectedIndex(2);
		panel3.add(cmbArrival3);
		ArrivalComboArrayList.add(cmbArrival3);
		cmbArrival3.setEnabled(false);
		
		JComboBox cmbBurst3 = new JComboBox();
		cmbBurst3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		cmbBurst3.setBounds(117, 107, 56, 20);
		panel3.add(cmbBurst3);
		BurstComboArrayList.add(cmbBurst3);
		cmbBurst3.setEnabled(false);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel4.setBounds(109, 287, 198, 193);
		contentPane.add(panel4);

		JLabel lbl = new JLabel("Process 4");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl.setBounds(60, 11, 115, 32);
		panel4.add(lbl);
		
		JLabel label_7 = new JLabel("Arrival Time");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(10, 73, 93, 14);
		panel4.add(label_7);
		
		JLabel label_8 = new JLabel("Burust TIme");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(10, 108, 93, 14);
		panel4.add(label_8);
		
		JComboBox cmbArrival4 = new JComboBox();
		cmbArrival4.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cmbArrival4.setBounds(117, 71, 56, 20);
		cmbArrival4.setSelectedIndex(3);
		panel4.add(cmbArrival4);
		ArrivalComboArrayList.add(cmbArrival4);
		cmbArrival4.setEnabled(false);
		
		JComboBox cmbBurst4 = new JComboBox();
		cmbBurst4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		cmbBurst4.setBounds(117, 107, 56, 20);
		panel4.add(cmbBurst4);
		BurstComboArrayList.add(cmbBurst4);
		cmbBurst4.setEnabled(false);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel5.setBounds(391, 287, 198, 193);
		contentPane.add(panel5);
		
		
		JLabel lblProcess_4 = new JLabel("Process 5");
		lblProcess_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProcess_4.setBounds(60, 11, 115, 32);
		panel5.add(lblProcess_4);
		
		JLabel label_10 = new JLabel("Arrival Time");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(10, 73, 93, 14);
		panel5.add(label_10);
		
		JLabel label_11 = new JLabel("Burust TIme");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(10, 108, 93, 14);
		panel5.add(label_11);
		
		JComboBox cmbArrival5 = new JComboBox();
		cmbArrival5.setModel(new DefaultComboBoxModel(new String[] {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cmbArrival5.setBounds(117, 71, 56, 20);
		cmbArrival5.setSelectedIndex(4);
		panel5.add(cmbArrival5);
		ArrivalComboArrayList.add(cmbArrival5);
		cmbArrival5.setEnabled(false);
		
		JComboBox cmbBurst5 = new JComboBox();
		cmbBurst5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"}));
		cmbBurst5.setBounds(117, 107, 56, 20);
		panel5.add(cmbBurst5);
		BurstComboArrayList.add(cmbBurst5);
		cmbBurst5.setEnabled(false);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getBurstTimes();
				getArrivalTimes();
				if(checker()==0){
					for(int com=0;com<nuOfProcesses;com++){
						 burstTime.add(Integer.parseInt((String) BurstComboArrayList.get(com).getSelectedItem()));
					}
					Frame3 frame3 =new Frame3(arrivalTime,burstTime,numOfProcesse,timeQuantum);
					frame3.setVisible(true);
	     			dispose();
				}
				arrivalTime= new LinkedList<Integer>();            
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(548, 529, 86, 28);		
		contentPane.add(btnNext);
	}

	public void addJpanel(JPanel jpanel){
		panelArrayList.add(jpanel);
	}
  
	public void disalePanels(int numOfProcesses){
		for(int com=0;com<nuOfProcesses;com++){
			BurstComboArrayList.get(com).setEnabled(true);
			ArrivalComboArrayList.get(com).setEnabled(true);
		}
	}
	public void getBurstTimes(){
		for(int com=0;com<nuOfProcesses;com++){
			 burstTime.add(Integer.parseInt((String) BurstComboArrayList.get(com).getSelectedItem()));
		}
	}
	@SuppressWarnings("deprecation")
	public void getArrivalTimes(){
		for(int com=0;com<nuOfProcesses;com++){
			 arrivalTime.add(Integer.parseInt((String) ArrivalComboArrayList.get(com).getSelectedItem()));
		}	
	}
	public int checker(){
		int counter1=-1;
		for (int i:arrivalTime){
			counter1++;
			int counter2=-1;
		    for(int j:arrivalTime){
					counter2++;
					if (i==j && counter1!=counter2){
						this.setEnabled(false);
						System.out.println(i+"this is the i");
						Error error=new Error(this);
						error.show();
						return 1;
					}
				}
		}
		return 0;
	}
	public Queue<Integer> getArrivalList(){
		return arrivalTime;
	}
	public ArrayList<Integer> getBurstList(){
		return burstTime;
	}
}
