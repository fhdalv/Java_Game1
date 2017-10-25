import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Rock extends JFrame
{
	JPanel e, px, p, p1, p2, p3, p4, p5;
	JLabel lab1, lab2;
	JButton rock, paper, scissor;
	Random rand;
	JCheckBox stat;
	JTextArea ta;
	int win = 0, lose = 0, tie = 0;
	
	public Rock()
	{
		rand = new Random();
		
		p = new JPanel();
		add(p);
		p.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p.add(p1, BorderLayout.NORTH);
		p2 = new JPanel();
		p.add(p2, BorderLayout.EAST);
		p3 = new JPanel();
		p.add(p3, BorderLayout.WEST);
		p4 = new JPanel();
		p.add(p4, BorderLayout.SOUTH);
		p5 = new JPanel();
		p.add(p5, BorderLayout.CENTER);
		
		lab1 = new JLabel("Good Luck!");
		p5.add(lab1);
		
		rock = new JButton("ROCK");
		p1.add(rock);
		paper = new JButton("PAPER");
		p1.add(paper);
		scissor = new JButton("SCISSOR");
		p1.add(scissor);
		
		Dimension dim = new Dimension(250, 200);
		
		rock.setPreferredSize(dim);
		paper.setPreferredSize(dim);
		scissor.setPreferredSize(dim);
		
		
		Inner in = new Inner();
		rock.addActionListener(in);
		paper.addActionListener(in);
		scissor.addActionListener(in);
		
		
		lab2 = new JLabel("");
		p4.add(lab2);
		
		stat = new JCheckBox("StatisticS");
		p3.add(stat);
		Statistic s = new Statistic();
		stat.addItemListener(s);
		
		ta = new JTextArea(7,30);
		p2.add(ta);
		ta.setVisible(false);
		ta.setEditable(false);
		ta.setFont(new Font("Serif", Font.BOLD, 16));
		
		
		
		
		
		
	}
	
	public class Inner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int side = rand.nextInt(3);
			
			if(side == 0)
			{
				lab2.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\rock.jpg"));
				
				if(e.getSource() == rock)
				{
					paper.setVisible(false);
					scissor.setVisible(false);
					
					rock.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hrock.jpg"));
					rock.setBorderPainted(false);
					rock.setContentAreaFilled(false);
					rock.setRolloverEnabled(false);
					rock.setFocusPainted(false);
					rock.setText("");
					
					tie++;
					JOptionPane.showMessageDialog(null, "That's a tie!");
					paper.setVisible(true);
					scissor.setVisible(true);
					
					rock.setIcon(new ImageIcon(""));
					rock.setBorderPainted(true);
					rock.setContentAreaFilled(true);
					rock.setRolloverEnabled(true);
					rock.setFocusPainted(true);
					rock.setText("ROCK");
					
				}
				else if(e.getSource() == paper)
				{
					rock.setVisible(false);
					scissor.setVisible(false);
					
					paper.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hpaper.jpg"));
					paper.setBorderPainted(false);
					paper.setContentAreaFilled(false);
					paper.setRolloverEnabled(false);
					paper.setFocusPainted(false);
					paper.setText("");
					
					win++;
					JOptionPane.showMessageDialog(null, "You Lost!");
					rock.setVisible(true);
					scissor.setVisible(true);
					
					paper.setIcon(new ImageIcon(""));
					paper.setBorderPainted(true);
					paper.setContentAreaFilled(true);
					paper.setRolloverEnabled(true);
					paper.setFocusPainted(true);
					paper.setText("PAPER");
					
				}
				else if(e.getSource() == scissor)
				{
					rock.setVisible(false);
					paper.setVisible(false);
					
					scissor.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hscissor.jpg"));
					scissor.setBorderPainted(false);
					scissor.setContentAreaFilled(false);
					scissor.setRolloverEnabled(false);
					scissor.setFocusPainted(false);
					scissor.setText("");
					
					lose++;
					JOptionPane.showMessageDialog(null, "You Lost!");
					paper.setVisible(true);
					rock.setVisible(true);
					
					scissor.setIcon(new ImageIcon(""));
					scissor.setBorderPainted(true);
					scissor.setContentAreaFilled(true);
					scissor.setRolloverEnabled(true);
					scissor.setFocusPainted(true);
					scissor.setText("SCISSOR");
					
				}
				lab2.setIcon(new ImageIcon(""));
			}
			
			else if(side == 1)
			{
				lab2.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\paper.jpg"));
				
				if(e.getSource() == rock)
				{
					scissor.setVisible(false);
					paper.setVisible(false);
					
					rock.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hrock.jpg"));
					rock.setBorderPainted(false);
					rock.setContentAreaFilled(false);
					rock.setRolloverEnabled(false);
					rock.setFocusPainted(false);
					rock.setText("");
					
					lose++;
					JOptionPane.showMessageDialog(null, "You Lost!");
					paper.setVisible(true);
					scissor.setVisible(true);
					
					rock.setIcon(new ImageIcon(""));
					rock.setBorderPainted(true);
					rock.setContentAreaFilled(true);
					rock.setRolloverEnabled(true);
					rock.setFocusPainted(true);
					rock.setText("ROCK");
					
				}
				else if(e.getSource() == paper)
				{
					rock.setVisible(false);
					scissor.setVisible(false);
					
					paper.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hpaper.jpg"));
					paper.setBorderPainted(false);
					paper.setContentAreaFilled(false);
					paper.setRolloverEnabled(false);
					paper.setFocusPainted(false);
					paper.setText("");
					
					tie++;
					JOptionPane.showMessageDialog(null, "That's a tie!");
					rock.setVisible(true);
					scissor.setVisible(true);
					
					paper.setIcon(new ImageIcon(""));
					paper.setBorderPainted(true);
					paper.setContentAreaFilled(true);
					paper.setRolloverEnabled(true);
					paper.setFocusPainted(true);
					paper.setText("PAPER");
				}
				else if(e.getSource() == scissor)
				{
					rock.setVisible(false);
					paper.setVisible(false);
					
					scissor.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hscissor.jpg"));
					scissor.setBorderPainted(false);
					scissor.setContentAreaFilled(false);
					scissor.setRolloverEnabled(false);
					scissor.setFocusPainted(false);
					scissor.setText("");
					
					win++;
					JOptionPane.showMessageDialog(null, "You Lost!");
					paper.setVisible(true);
					rock.setVisible(true);
					
					scissor.setIcon(new ImageIcon(""));
					scissor.setBorderPainted(true);
					scissor.setContentAreaFilled(true);
					scissor.setRolloverEnabled(true);
					scissor.setFocusPainted(true);
					scissor.setText("SCISSOR");
				}
				lab2.setIcon(new ImageIcon(""));
			}
			
			else
			{
				lab2.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\scissor.jpg"));
				if(e.getSource() == rock)
				{
					paper.setVisible(false);
					scissor.setVisible(false);
					
					rock.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hrock.jpg"));
					rock.setBorderPainted(false);
					rock.setContentAreaFilled(false);
					rock.setRolloverEnabled(false);
					rock.setFocusPainted(false);
					rock.setText("");
					
					win++;
					JOptionPane.showMessageDialog(null, "You Win!");
					paper.setVisible(true);
					scissor.setVisible(true);
					
					rock.setIcon(new ImageIcon(""));
					rock.setBorderPainted(true);
					rock.setContentAreaFilled(true);
					rock.setRolloverEnabled(true);
					rock.setFocusPainted(true);
					rock.setText("ROCK");
					
				}
				else if(e.getSource() == paper)
				{
					rock.setVisible(false);
					scissor.setVisible(false);
					
					paper.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hpaper.jpg"));
					paper.setBorderPainted(false);
					paper.setContentAreaFilled(false);
					paper.setRolloverEnabled(false);
					paper.setFocusPainted(false);
					paper.setText("");
					
					lose++;
					JOptionPane.showMessageDialog(null, "You Lost!");
					rock.setVisible(true);
					scissor.setVisible(true);
					
					paper.setIcon(new ImageIcon(""));
					paper.setBorderPainted(true);
					paper.setContentAreaFilled(true);
					paper.setRolloverEnabled(true);
					paper.setFocusPainted(true);
					paper.setText("PAPER");
				}
				else if(e.getSource() == scissor)
				{
					rock.setVisible(false);
					paper.setVisible(false);
					
					scissor.setIcon(new ImageIcon("C:\\Users\\Fahad\\Downloads\\Assignment\\hscissor.jpg"));
					scissor.setBorderPainted(false);
					scissor.setContentAreaFilled(false);
					scissor.setRolloverEnabled(false);
					scissor.setFocusPainted(false);
					scissor.setText("");
					
					tie++;
					JOptionPane.showMessageDialog(null, "That's a tie!");
					paper.setVisible(true);
					rock.setVisible(true);
					
					scissor.setIcon(new ImageIcon(""));
					scissor.setBorderPainted(true);
					scissor.setContentAreaFilled(true);
					scissor.setRolloverEnabled(true);
					scissor.setFocusPainted(true);
					scissor.setText("SCISSOR");
				}
				lab2.setIcon(new ImageIcon(""));
			}
			ta.setText("Win: " + win + "\n" + "Lose: " + lose + "\n" + "Tie: " + tie);
		}
	}
	
	
	public class Statistic implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			if(stat.isSelected())
			{
				ta.setVisible(true);
			}
			else
			{
				ta.setVisible(false);
			}
		}
	}
}