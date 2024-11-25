package vega.cardenas.jairon.MP06.UF01.JSON.Ordinadors;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
public class OrdinadorLogic {

    private Gson gson = new Gson();
    public OrdinadorLogic() {
        this.gson = new GsonBuilder()
                .excludeFieldsWithModifiers(java.lang.reflect.Modifier.TRANSIENT) // Exclou camps 'transient'
                .setPrettyPrinting() 
                .create();
    }

    public String serializeOrdinador(Ordinador ordinador) {
        return gson.toJson(ordinador);
    }

    public String serializeOrdinadors(List<Ordinador> ordinador) {
        return gson.toJson(ordinador);
    }

    public Ordinador deserializeOrdinador(String json) {
        return gson.fromJson(json, Ordinador.class);
    }

    public List<Ordinador> deserializeOrdinadors(String json) {
        Type listType = new TypeToken<ArrayList<Ordinador>>() {}.getType();
        return gson.fromJson(json, listType);
    }

    public void writeToFile(String filename, String json) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(json);
            System.out.println("S'ha gravat correctament al fitxer: " + filename);
        } catch (IOException e) {
            System.err.println("Error en escriure al fitxer: " + e.getMessage());
        }
    }

    public String readFromFile(String filename) {
        StringBuilder json = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch (IOException e) {
            System.err.println("Error en llegir el fitxer: " + e.getMessage());
        }
        return json.toString();
    }
}
