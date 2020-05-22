import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class Logger extends JFrame implements Runnable{
JPanel p1;
JButton b1,b2;
Thread th1;
int i=0;
	public Logger() {
	setVisible(true);
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p1=new JPanel();
	b1=new JButton("RECORD");
	b2=new JButton("STOP");
	p1.add(b1);
	p1.add(b2);
	getContentPane().add(p1);
	b1.addActionListener(e->actionB1(e));
	b2.addActionListener(e->actionB2(e));
	}

public void actionB1(ActionEvent e) {
	th1=new Thread(this);
	th1.start();
}
public void actionB2(ActionEvent e) {
//	th1=new Thread(this);
	th1.stop();
}
public void run()
{
	for(;;) {
		try {
			Robot r=new Robot();
			BufferedImage img= r.createScreenCapture(new Rectangle(
							getToolkit().getScreenSize()));
			ImageIO.write(img,"jpg",new File("c:\\pic\\"+i+".jpg"));
			i++;
			th1.sleep(300);
		}
		catch(Exception ex) {
			
		}
	}
}
public static void main(String args[])
{
	new Logger();
}}
