package Main;

import javax.swing.*;

import Boundary.KabasujiFrame;
import Boundary.LevelBuilderFrame;
import Boundary.MainMenuPanel;
import Controller.RotateLeftController;
import Controller.RotateRightController;
import Game.Stock;
import View.PieceView;

import java.awt.*;
import java.awt.event.*;


public class LevelBuilderMain {
	public static void main(String[] args){
		Stock s = new Stock();
		final LevelBuilderFrame frame = new LevelBuilderFrame(s);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}      
		});
	}
}