// Get the JOptionPane class
import javax.swing.JOptionPane;
public class ArithmeticCalGUI 
{

	public static void main(String[] args) 
	{

		//ask user to input first integer
		 String value1Str = JOptionPane.showInputDialog("Enter first integer: ");
		 
		// Obtain String value1str from input dialog and convert into int number1
		 int number1 = (int)Double.parseDouble(value1Str);
		 
		//ask user to input second integer
		 String value2Str = JOptionPane.showInputDialog("Enter second integer: ");
		 
		// Obtain String value2str from input dialog and convert into int number2
		 int number2 = (int) Double.parseDouble(value2Str);
		 
		 //calculate the sum
		 String strSum = "Sum is " + (number1 + number2);
		 
		 //display the result of Sum
		 JOptionPane.showMessageDialog(null, strSum);

		//calculate the difference
		 String strDifference = "Difference is " + (number1 - number2);
		 
		 //display the result of Difference
		 JOptionPane.showMessageDialog(null, strDifference);
		 
		//calculate the product
		 String strProduct = "Product is " + (number1 * number2);
		 
		 //display the result of Product
		 JOptionPane.showMessageDialog(null, strProduct);
		 
		//calculate the quotient
		 String strQuotient = "Quotient is " + (number1 / number2);
		 
		 //display the result of Quotient
		 JOptionPane.showMessageDialog(null, strQuotient);

	}

}
