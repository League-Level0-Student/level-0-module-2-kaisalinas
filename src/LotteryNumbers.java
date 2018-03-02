import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		int name = new Random().nextInt(1000);
		JOptionPane.showMessageDialog(null, name + "");

	}
}
