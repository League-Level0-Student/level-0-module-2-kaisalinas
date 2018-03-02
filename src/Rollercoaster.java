import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "How tall are you in inches");
		int num = Integer.parseInt(a);
		if (num > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grow more first");
		}

	}
}