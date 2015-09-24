package input.view;

import javax.swing.JOptionPane;
/**
 *  this class provides popups for input and output
 * @author dbar0540
 * @version 1.0 9/24/15
 */

public class PopupDisplay
{

	public String getAnswer(String input)
	{
		String answer = "";
		
		return answer;
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displatResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
