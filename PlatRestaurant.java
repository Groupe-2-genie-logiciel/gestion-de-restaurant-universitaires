package com.rest.univ;

public class PlatRestaurant {
	String nom_plat;
	private int  prix_plat;
	private int quant_init;
	 private int quant_rest;
	public PlatRestaurant(String nom,int prix,int qte_init) {
		this.nom_plat = nom;
		 this.prix_plat = prix;
		 this.quant_init = qte_init;
		 this.quant_rest = qte_init;
	}
	public String getNom_plat() {
		return nom_plat;
	}
	public void setNom_plat(String nom_plat) {
		this.nom_plat = nom_plat;
	}
	public int getPrix_plat() {
		return prix_plat;
	}
	public void setPrix_plat(int prix_plat) {
		this.prix_plat = prix_plat;
	}
	public int getQuant_init() {
		return quant_init;
	}
	public void setQuant_init(int quant_init) {
		this.quant_init = quant_init;
	}
	public int getQuant_rest() {
		return quant_rest;
	}
	public void setQuant_rest(int quant_rest) {
		this.quant_rest = quant_rest;
	}
	

}
