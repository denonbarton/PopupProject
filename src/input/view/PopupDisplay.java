package input.view;

import javax.swing.JOptionPane;
/**
 *  this class provides popups for input and output
 * @author dbar0540
 * @version 1.0 9/24/15
 */
public class PopupDisplay
{
	/**
	 * Provides a Popup box for asking a question and allows the user to submit a text answer
	 * returns the user response as a String.
	 * @param input The supplied question for the Popup.
	 * @return he user's answer to the supplied question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * Shows the user the supplied String input in a Popup box.
	 * @param input input the text to be diplayed
	 */
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
