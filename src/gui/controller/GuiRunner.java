package gui.controller;

import gui.controller.GuiController;

/**
 * Starts the ChatBot program
 * @author dbar0540
 * @version 1.0 10/21/15
 */

public class GuiRunner
{
	public static void main (String [] args)
	{
	GuiController myGuiController = new GuiController();
	myGuiController.start();
	}
	
}