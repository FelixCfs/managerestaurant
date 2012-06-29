package uml.gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;


public class ���� {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			���� window = new ����();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.MIN);
		shell.setBackgroundMode(SWT.INHERIT_FORCE);
		shell.setBackgroundImage(SWTResourceManager.getImage(����.class, "/pic/\u80CC\u666F1.jpg"));
		shell.setSize(450, 540);
		shell.setText("��ע");

		text = new Text(shell, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI);
		text.setFont(SWTResourceManager.getFont("΢���ź�", 12, SWT.BOLD));
		text.setBounds(0, 0, 434, 502);
		text.setText("��ϵͳ�����򵥣�");
	}

}
