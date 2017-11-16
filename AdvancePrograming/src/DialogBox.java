import java.util.Scanner;

import javax.swing.JOptionPane;

public class DialogBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String intrest;
		intrest = JOptionPane.showInputDialog("Enter the intrest rate anual: ");
		
		double In = Double.parseDouble(intrest);
		//System.out.printf("Monthly Intrest rate is %.2f\n", In/1200);
		String output = "The Monthly intrest rate is $"+ In/12;
		JOptionPane.showMessageDialog(null, output);

	}

}
