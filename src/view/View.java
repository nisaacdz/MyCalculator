package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.subs.Appearance;
import view.subs.Appearance_Equations;

public class View {

	private static JFrame myFrame = new JFrame();

	private static String[] variables = { "BASIC", "BODMAS", "EQUATIONS", "SCIENTIFIC", "MATRICES", "COMPLEX",
			"SETTINGS" };

	private static Appearance panel;

	private static JComboBox<String> menu = new JComboBox<String>(variables);

	/**
	 * @wbp.parser.entryPoint
	 */
	public static void call() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				build();
			}
		});
	}

	public static void build() {
		if (GetData.hasActiveSession()) {
			panel = GetData.getActiveSession();
			myFrame.getContentPane().add(panel);
		} else {
			System.out.println("Has passed!");
			panel = new Appearance_Equations();
			myFrame.getContentPane().add(panel);
		}
		myFrame.setTitle(GetData.getTitle());
		myFrame.getContentPane().setBackground(GetData.getFrameBackgrounds());
		myFrame.setBounds(GetData.getFrameBounds());
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setResizable(false);
		myFrame.getContentPane().setLayout(null);

		menu.setBackground(GetData.getJComboBoxBackground());
		menu.setBounds(GetData.getJComboBoxBounds());
		menu.setForeground(GetData.getJComboBoxForegound());
		menu.setFont(GetData.getJComboBoxFont());
		menu.setSelectedItem("EQUATIONS");
		myFrame.getContentPane().add(menu);

		myFrame.setVisible(true);
	}

}
