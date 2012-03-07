package view.window;




import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Board;
import model.IPhysicsEngine;
import controller.EditListener;

/**
 * 
 * @author Andew White - 200939787
 * 
 * ApplicationWindow
 * 
 * @version 1.0 Started development of the GizmoBall GUI.
 *
 */
public class ApplicationWindow extends JFrame {
	
	private GizmoMenu menu;
	private ButtonArea buttonArea;
	private EditListener listener;
	
	private IPhysicsEngine physics;
	//private TriggerSystem trgsys;
	private Board board;
	private AnimationPanel boardView;
	
	public ApplicationWindow(){
		super("Gizmoball");
		listener = new EditListener();
		buttonArea = new ButtonArea(listener);
		//physics = new Physics();
	//	trgsys = new TriggerSystem();
		board = new Board(400, 400);
		
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		
		boardView = new AnimationPanel(board);
		
		JPanel panel = new JPanel();
	
		panel.setPreferredSize(new Dimension(400, 400));
		panel.add(boardView);
		
		JPanel contentPane = new JPanel();
		
		
		//menu = new GizmoMenu(boardView, physics, board);
		
		contentPane.setLayout(new BorderLayout());
		contentPane.setPreferredSize(new Dimension(500, 410));
		
		contentPane.add(panel, BorderLayout.LINE_START);
		contentPane.add(buttonArea.getButtonArea(), BorderLayout.AFTER_LINE_ENDS);
		
		
		setContentPane(contentPane);
		pack();
		requestFocus();
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

	}

	
	public boolean isFocusable(){
		return true;
	}
	
	public GizmoMenu getGizmoMenu(){
		return menu;
	}
	
	

}
