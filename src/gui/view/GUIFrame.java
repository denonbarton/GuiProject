package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * Creates the frame for the GUI project.
 * 
 * @author dbar0540
 * @version 0.x Nov 9, 2015 added a refrence to the GUIPanel and installed it as
 *          the content pane added the setupFrame helper method
 */

public class GUIFrame extends JFrame
{
	private GuiController baseController;
	private GUIPanel basePanel;

	public GUIFrame(GuiController baseController)
	{
		this.baseController = baseController; // assign parameter to data
												// member.
		basePanel = new GUIPanel(baseController);
		setupFrame();

	}

	/**
	 * Helper method to setp the Frame and its structure
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel); // Sets the panel in the GUIFrame this
										// is REQUIRED
		// this.setResizable(false); // usually a good idea, but not required.
		this.setTitle("my window app"); // sets title
		this.setSize(500, 500); // sets the size
		this.setVisible(true); // must be the last line of code in the
								// setupFrame method
	}
}
