package controller;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.channels.GatheringByteChannel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import model.java_structures.ArbolRojoN;
import model.violations.VOMovingViolation;
import view.ViewManager;

public class Controller {

	private ArbolRojoN<String, VOMovingViolation> arbolRojoNegro;
	private ViewManager view;

	public Controller() {

		view = new ViewManager();
		arbolRojoNegro = new ArbolRojoN<String, VOMovingViolation>();

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		boolean fin=false;
		Controller controller = new Controller();

		while(!fin)
		{
			view.printMenu();

			int option = sc.nextInt();

			switch(option)
			{
			case 0:

				controller.loadMovingViolations();
				break;

			case 1:
				view.printMessage("Introduzca el objectID");
				String pObjectID = sc.nextLine();
				view.printMessage(controller.consultarObjectID(pObjectID));

			case 2:
				view.printMessage("Introduzca el rango de objestsID a bucar");
				String pMenor = sc.nextLine();
				String pMayor = sc.nextLine();
				view.printMessage(controller.consultarObjectIDsEnRango(pMenor, pMayor));

			case 3:	
				fin=true;
				sc.close();
				break;
			}
		}

	}


	public String consultarObjectID(String pObjectID){
		VOMovingViolation infraccion;
		infraccion = arbolRojoNegro.get(pObjectID);
		return infraccion.ToString();
	}
	public String consultarObjectIDsEnRango(String pMenor, String pMayor){
		Iterable<String> iter = arbolRojoNegro.keys(pMenor, pMayor);
		String r = "";
		for (String llave : iter) {
		VOMovingViolation infraccion;
		   infraccion = arbolRojoNegro.get(llave);
		   r += r +infraccion.ToString();
		   r += "\n";
		}
		return r;
	}
	
	public void loadMovingViolations() {
		Gson gson = new Gson();
		JsonReader reader;

		try {

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_January_2018.json"));
			readFiles(gson, reader, "Enero");

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_February_2018.json"));
			readFiles(gson, reader, "Febrero");

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_March_2018.json"));
			readFiles(gson, reader, "Marzo");

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_April_2018.json"));
			readFiles(gson, reader, "Abril");

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_May_2018.json"));
			readFiles(gson, reader, "Mayo");

			reader = new JsonReader(new FileReader("./data/Moving_Violations_Issued_in_June_2018.json"));
			readFiles(gson, reader, "Junio");
			
			System.out.println(arbolRojoNegro.size());
			System.out.println("-------------------");


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	private void readFiles(Gson pGson, JsonReader pReader, String pMes){
		int num = 0;
		VOMovingViolation[] lista = pGson.fromJson(pReader, VOMovingViolation[].class);
		System.out.println(lista.length);
		for(int i = 0; i<lista.length;i++){
			if(lista[i].getObjectID()==null){
				continue;
			}
			else{

				arbolRojoNegro.put(lista[i].getObjectID(),lista[i] );
				
			}
		}

		System.out.println("Se cargaron "+ num + " infracciones en el mes de "+pMes );
		System.out.println("-------------------");
	}
}





