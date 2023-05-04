package view;

import controller.cafeteriaController;
import model.Cafe;

import javax.swing.*;
import java.util.ArrayList;

public class eliminarCafeView extends JFrame {

	private JButton cancelarButton;
	private JButton eliminarButton;
	private JComboBox comboBox1;
	private JPanel panel;

	public eliminarCafeView()  {
		setLocationRelativeTo(null); // Centramos la ventana en la pantalla
		setSize(450, 600);
		setContentPane(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Eliminar Cafes");
		ActionListeners();	}

	public void ActionListeners() {
		throw new UnsupportedOperationException();
	}

	public void inicializarComboBox() {
		cafeteriaController cafeteriaController=new cafeteriaController();
		ArrayList<Cafe> cafes= cafeteriaController.obtenerCafes();
		for (int i = 0; i <cafes.size() ; i++) {
			comboBox1.addItem(cafes.get(i));
		}
	}
}