package TicTacToe_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ticTacToe {

	private JFrame frame;
	private String startPlayer="X";
	private int xCount=0;    // wins of X
	private int oCount=0;   // wins of O
	
	private Label btn1;
	private Label btn2;
	private Label btn3;
	private Label btn4;
	private Label btn5;
	private Label btn6;
	private Label btn7;
	private Label btn8;
	private Label btn9;
	
	private JTextField txtCountX;
	private JTextField txtCountO;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticTacToe window = new ticTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ticTacToe() {
		initialize();
		gameScore();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 700);   // increased window size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("");
		JButton btn5 = new JButton("");
		JButton btn6 = new JButton("");
		JButton btn7 = new JButton("");
		JButton btn8 = new JButton("");
		JButton btn9 = new JButton("");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn1.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn1.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 80));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
//		JButton [][] buttonarry new JButton[3][3]; 
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn2.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn2.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn3.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn3.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer = new JLabel("Player X:");
		lblPlayer.setFont(new Font("Lucida Grande", Font.BOLD, 34));
		panel_4.add(lblPlayer, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		txtCountX = new JTextField();
		txtCountX.setFont(new Font("Lucida Grande", Font.BOLD, 80));
		txtCountX.setHorizontalAlignment(SwingConstants.CENTER);
		txtCountX.setText("0");
		panel_5.add(txtCountX, BorderLayout.CENTER);
		txtCountX.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn4.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn4.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_7.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn5.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn5.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_8.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn6.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn6.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_6.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer_1 = new JLabel("Player O:");
		lblPlayer_1.setFont(new Font("Lucida Grande", Font.BOLD, 34));
		panel_9.add(lblPlayer_1, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		txtCountO = new JTextField();
		txtCountO.setText("0");
		txtCountO.setFont(new Font("Lucida Grande", Font.BOLD, 80));
		txtCountO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_10.add(txtCountO, BorderLayout.CENTER);
		txtCountO.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn7.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn7.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_11.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn8.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn8.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_12.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startPlayer);
				if (startPlayer.equalsIgnoreCase("X")){
					btn9.setForeground(Color.GREEN);   // setting different colors for X,O
				}
				else{
					btn9.setForeground(Color.BLUE);
				}
				switchPlayer();
				winningGame();
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 80));
		panel_14.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");  
		btnReset.addActionListener(new ActionListener() {   // functionality of reset button
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				
				btn1.setBackground(Color.LIGHT_GRAY);
				btn2.setBackground(Color.LIGHT_GRAY);
				btn3.setBackground(Color.LIGHT_GRAY);
				btn4.setBackground(Color.LIGHT_GRAY);
				btn5.setBackground(Color.LIGHT_GRAY);
				btn6.setBackground(Color.LIGHT_GRAY);
				btn7.setBackground(Color.LIGHT_GRAY);
				btn8.setBackground(Color.LIGHT_GRAY);
				btn9.setBackground(Color.LIGHT_GRAY);
				
			}
		});
		btnReset.setFont(new Font("Lucida Grande", Font.ITALIC, 34));
		panel_13.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				int input=JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe", JOptionPane.YES_NO_OPTION);
				if  (input==0){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.ITALIC, 34));
		panel_15.add(btnExit, BorderLayout.CENTER);
	}

	
	/// methods
	
	private void gameScore(){    // putting score on both the players' labels
		txtCountX.setText(String.valueOf(xCount));
		txtCountO.setText(String.valueOf(oCount));
	}
	
	private void switchPlayer(){            // changing player
		if (startPlayer.equalsIgnoreCase("X")){
			startPlayer="O";
		}
		else{
			startPlayer="X";
		}
	}
	
	
	private void winningGame(){
		String b1=btn1.getText();
		String b2=btn2.getText();
		String b3=btn3.getText();
		String b4=btn4.getText();
		String b5=btn5.getText();
		String b6=btn6.getText();
		String b7=btn7.getText();
		String b8=btn8.getText();
		String b9=btn9.getText(); 
		
		if ((b1=="X") && (b2=="X") && (b3=="X")){    // row1
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b6=="X") && (b4=="X") && (b5=="X")){   // row2
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b7=="X") && (b8=="X") && (b9=="X")){   //row3
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b1=="X") && (b5=="X") && (b9=="X")){   // diagonal1
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b3=="X") && (b5=="X") && (b7=="X")){   // diagonal2
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b1=="X") && (b4=="X") && (b7=="X")){    // column 1
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b2=="X") && (b5=="X") && (b8=="X")){   // column2
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b3=="X") && (b6=="X") && (b9=="X")){    //column 3
			JOptionPane.showMessageDialog(frame, "Player X wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		
		/////////// for O
		
		if ((b1=="O") && (b2=="O") && (b3=="O")){    // row1
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			gameScore();
		}
		if ((b6=="O") && (b4=="O") && (b5=="O")){   // row2
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b7=="O") && (b8=="O") && (b9=="O")){   //row3
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b1=="O") && (b5=="O") && (b9=="O")){   // diagonal1
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b3=="O") && (b5=="O") && (b7=="O")){   // diagonal2
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b1=="O") && (b4=="O") && (b7=="O")){    // column 1
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b2=="O") && (b5=="O") && (b8=="O")){   // column2
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		if ((b3=="O") && (b6=="O") && (b9=="O")){    //column 3
			JOptionPane.showMessageDialog(frame, "Player O wins !","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			oCount++;
			gameScore();
		}
		
	}
	
	
	
	

}
