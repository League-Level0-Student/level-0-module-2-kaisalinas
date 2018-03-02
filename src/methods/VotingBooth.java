package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "How old are you");
		int num = Integer.parseInt(a);
		if (num > 18) {
			JOptionPane.showInputDialog(null, "Who do you think should be the president");
		} else {
			JOptionPane.showMessageDialog(null, "No one cares about what you think");
		}

	}
}
