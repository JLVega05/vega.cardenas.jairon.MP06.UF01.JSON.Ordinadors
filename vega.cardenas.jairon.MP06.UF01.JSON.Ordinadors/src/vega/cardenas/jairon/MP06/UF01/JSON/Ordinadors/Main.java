package vega.cardenas.jairon.MP06.UF01.JSON.Ordinadors;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static final String FITXER_INDIVIDUAL = "Fitxers/ordinador.json";
	private static final String FITXER_LLISTA = "Fitxers/ordinadors.json";
    public static void main(String[] args) {

    	Ordinador ordinador1 = new Ordinador("8531175", "Acer","Nitro N-50",16,1024,"Intel");
        Ordinador ordinador2 = new Ordinador("9312511", "MSI","GF63 Thin",32,512,"Intel");

        List<Ordinador> ordinadors = new ArrayList<>();
        ordinadors.add(ordinador1);
        ordinadors.add(ordinador2);

        OrdinadorLogic logic = new OrdinadorLogic();

        String jsonOrdinador = logic.serializeOrdinador(ordinador1);
        logic.writeToFile(FITXER_INDIVIDUAL, jsonOrdinador);

        String jsonOrdinadors = logic.serializeOrdinadors(ordinadors);
        logic.writeToFile(FITXER_LLISTA, jsonOrdinadors);

        String jsonOrdinadorFromFile = logic.readFromFile(FITXER_INDIVIDUAL);
        Ordinador deserializedOrdinador = logic.deserializeOrdinador(jsonOrdinadorFromFile);
        System.out.println("Alumne deserialitzat des de fitxer:");
        System.out.println(deserializedOrdinador);

        String jsonOrdinadorsFromFile = logic.readFromFile(FITXER_LLISTA);
        List<Ordinador> deserializedOrdinadors = logic.deserializeOrdinadors(jsonOrdinadorsFromFile);
        System.out.println("Llista d'Alumnes deserialitzada des de fitxer:");
        for (Ordinador ordinador : deserializedOrdinadors) {
            System.out.println(ordinador);
        }
    }
}
