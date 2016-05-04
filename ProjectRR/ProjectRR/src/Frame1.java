import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {
	
	private int timeQuantum;
	private int numberOfProcesses;
    private Frame2 frame2;
	private JPanel contentPane;

	public Frame1() {
		setTitle("   Select The Processes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select The Time Quantum");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(141, 334, 218, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelectTheNumber = new JLabel("Select The Number Of Processes");
		lblSelectTheNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSelectTheNumber.setBounds(141, 398, 218, 37);
		contentPane.add(lblSelectTheNumber);

		JComboBox cmbTime = new JComboBox();
		cmbTime.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cmbTime.setSelectedIndex(3);
		cmbTime.setBounds(477, 339, 74, 28);
		contentPane.add(cmbTime);
		
		JComboBox cmbProcesses = new JComboBox();
		cmbProcesses.setModel(new DefaultComboBoxModel(new String[] {"3", "2", "3", "4", "5"}));
		cmbProcesses.setBounds(477, 403, 74, 28);
		contentPane.add(cmbProcesses);
		
		JLabel lblNewLabel_1 = new JLabel("Round Robin");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setBounds(178, 111, 352, 74);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				timeQuantum=Integer.parseInt((String) cmbTime.getSelectedItem());
				numberOfProcesses=Integer.parseInt( (String) cmbProcesses.getSelectedItem());
				Frame2 frame2= new Frame2(numberOfProcesses,timeQuantum);
				frame2.disalePanels(numberOfProcesses);
         		frame2.show();
			    dispose();
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNext.setBounds(548, 529, 86, 28);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel_2 = new JLabel("s");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(564, 344, 46, 14);
		contentPane.add(lblNewLabel_2);
		
	}
	public int getNumberOfProcesses(){
        return this.numberOfProcesses;			
	}
	public int getTimeQuantum(){
		return this.timeQuantum;
	}
	public void setNumberOfProcesses(int numberOfProcesses){
        this.numberOfProcesses=numberOfProcesses;			
	}
	public void setTimeQuantum(int timeQuantum){
		this.timeQuantum=timeQuantum;
	}
}
