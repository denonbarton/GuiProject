package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gui.controller.GuiController;

/**
 * @author dbar0540
 * @version 0.1 NOV 9, 2015 Basic constructor setup.
 *
 */
public class GUIPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not Click the button");
		firstTextField = new JTextField("you can type words in here");
		
		setupPanel();
		setupLayout(); // yes... this order
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout); // needs to be the first line of the
									// setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);

	}

 //*  Helper method to hold ugly GUI layout code
 
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 73, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 1, SpringLayout.NORTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 10, SpringLayout.WEST, this);


	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("dont click it");
			}
		});
		}
	
}
