import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paintButtonEventListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new SwingPaint().show();
	}
}
