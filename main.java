import javax.swing.JOptionPane;

public class main {

	public static void main (String[] args) {
		
		String nameEmploy = " ";
		    nameEmploy = (JOptionPane.showInputDialog("Enter The Employee Name"));
		    
		int numDays = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number of Work Days"));
		
		int dailyWage = 500;
		int philHealth = 220;
		int sss = 330;
		int monthlyWage = dailyWage*numDays;
		int healthSSS = sss+philHealth;
		int totalMonthly = monthlyWage-healthSSS;
		
		JOptionPane.showMessageDialog(null, "name: " +nameEmploy+ "\nnumDays: " + numDays + "\nMonthly Salary: $" + totalMonthly);
	}
}