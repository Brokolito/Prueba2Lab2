package data;

import model.Cafe;
import model.Cafeteria;

import java.io.*;
import java.util.ArrayList;

public class GestorDatos {
	private String direccionArchivo;

	public GestorDatos(String direccionArchivo) {
		this.direccionArchivo = direccionArchivo;
	}

	public ArrayList<Cafe> obtenerCafes() {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public boolean agregarCafe(Cafe cafe) {
		boolean lineaVacia=false;
		try{
			File archivo=new File(this.direccionArchivo);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			FileWriter fileWriter = new FileWriter(archivo, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			if (lineaVacia == false) {
				bufferedWriter.newLine();
			}
			//bufferedWriter.write(cliente.toString());
			bufferedWriter.write(cafe.getGCafe()+","+cafe.getMmAgua()+","
					+cafe.getSize()+","+cafe.getOptIngrediente());
			bufferedWriter.close();
			fileWriter.close();
			return true;
		}catch (Exception e){
			System.out.println("Error al ingresar hora de llegada, favor contactar con administrador");
			return false;
		}
	}

	public boolean modificaCafeteria(Cafeteria cafeteria) {
		String textoArchivo = "";
		try {
			File archivo = new File(this.direccionArchivo);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			// Comprobamos si existe
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			//Lee cada linea del archivo hasta que la linea sea nula
			while ((textoArchivo = bufferedReader.readLine()) != null) {
				String[] data = textoArchivo.split(",");
			}
			//Con eso corroboramos que el cliente no esta registrado por RUT
			fileReader.close();
			bufferedReader.close();
			return true;
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return false;
	}
}