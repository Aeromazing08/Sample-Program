import javax.swing.*;
public class Practice1
{
	public static void main(String[]args)	
	{
		String x1, y1;
		Double x, y, sum;


		System.out.println("Very Good ");
		x1 = JOptionPane.showInputDialog("Input number: ");
		y1 = JOptionPane.showInputDialog("Input number: ");

		x = Double.parseDouble(x1);
		y = Double.parseDouble(y1);

		sum = x+ y;

		JOptionPane.showMessageDialog(null, "Sum is : " + sum);
	}
}