import java.awt.*;		
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class MainForm extends JFrame implements ActionListener{
JMenuBar mb1;
JMenu mDesktop,mHelp;
JMenuItem mLogger,mView,mExit,mAbout;

public MainForm() {
	setVisible(true);
	setSize(600,600);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mb1=new JMenuBar();
	mDesktop=new JMenu("Desktop");
	mHelp=new JMenu("Help");
	mLogger=new JMenuItem("Logger");
	mView=new JMenuItem("View");
	mExit=new JMenuItem("Exit");
	mAbout=new JMenuItem("About");
	mb1.add(mDesktop);
	mb1.add(mHelp);
	mDesktop.add(mLogger);
	mDesktop.add(mView);
	mDesktop.add(mExit);
	mHelp.add(mAbout);
	setJMenuBar(mb1);
	mDesktop.addActionListener(this);
	mHelp.addActionListener(this);
	mLogger.addActionListener(this);
	mView.addActionListener(this);
	mExit.addActionListener(this);
	mAbout.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==mLogger) {
		Logger frm = new Logger();
		frm.setVisible(true);
		
	}
	if(e.getSource()==mView) {
		View frm1=new View();
		frm1.setVisible(true);
	}
	
	if (e.getSource()==mAbout) {
		JOptionPane.showMessageDialog(null,"Developed by:Shreya Nema" );
	}
	}
	

public static void main(String args[]) {
new MainForm();	
}
}


