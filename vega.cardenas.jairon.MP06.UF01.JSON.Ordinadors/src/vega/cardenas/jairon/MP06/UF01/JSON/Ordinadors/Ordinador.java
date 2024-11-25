package vega.cardenas.jairon.MP06.UF01.JSON.Ordinadors;
import java.io.Serializable;

public class Ordinador implements Serializable {
	private transient String numSerie = "";
	private String marca = "";
	private String model = "";
	private int memoria = 0;
	private int discDur = 0;
	private String processador = "";
	
public Ordinador() {}

public Ordinador(String numSerie, String marca, String model, int memoria, int discDur, String processador ) {
	this.numSerie = numSerie;
	this.marca = marca;
	this.model = model;
	this.memoria = memoria;
	this.discDur = discDur;
	this.processador = processador;
}
	
	public String getNumSerie() {
		return numSerie;
	}
	
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public int getDiscDur() {
		return discDur;
	}
	
	public void setDiscDur(int discDur) {
		this.discDur = discDur;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}

	@Override
	public String toString() {
		return "Ordinador [numserie=" + numSerie + ", marca=" + marca + ", model=" + model + ", memoria=" + memoria + ", discDur=" + discDur + ", processador=" + processador + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
