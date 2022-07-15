package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;

import view.subs.Appearance;

public class GetData {
	public static Rectangle getFrameBounds() {
		return new Rectangle(360, 25, 340, 500);
	}
	
	public static Color getFrameBackgrounds() {
		return Color.BLACK;
	}

	public static String getTitle() {
		return "My Calculator";
	}

	public static boolean hasActiveSession() {
		return false;
	}

	public static Appearance getActiveSession() {
		return (Appearance) deserialize(getSessionLocation());
	}

	public static String getSessionLocation() {
		return "";
	}

	public static Object deserialize(String s) {
		return new Object();
	}

	public static Color getJComboBoxBackground() {
		return Color.LIGHT_GRAY;
	}

	public static Rectangle getJComboBoxBounds() {
		return new Rectangle(12, 20, 200, 30);
	}

	public static Color getJComboBoxForegound() {
		return Color.BLACK;
	}

	public static Font getJComboBoxFont() {
		return new Font("Microsoft JhengHei", Font.BOLD, 25);
	}
}
