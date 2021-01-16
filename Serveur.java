package com.rest.univ;

public class Serveur {
	String nom_serveur;
	int salaire_serveur;
	int salaire_jour ;
	int compte_jour;
	
	public Serveur(String nom) {
		this.nom_serveur = nom;
		this.salaire_serveur = 0 ;
		this.salaire_jour = 2000;
		this.compte_jour = 0;
		}
	
	public String getNom_serveur() {
		return nom_serveur;
	}

	public void setNom_serveur(String nom_serveur) {
		this.nom_serveur = nom_serveur;
	}

	public int getSalaire_serveur() {
		return salaire_serveur;
	}

	public void setSalaire_serveur(int salaire_serveur) {
		this.salaire_serveur = salaire_serveur;
	}

	public int getSalaire_jour() {
		return salaire_jour;
	}

	public void setSalaire_jour(int salaire_jour) {
		this.salaire_jour = salaire_jour;
	}

	public void present_au_restaurant(Serveur a){
		a.compte_jour = a.compte_jour +1;
		a.salaire_serveur = a.salaire_serveur + a.salaire_jour ;
	}
	
	 public void salaire_d_un_serveur(Serveur a){
		 if(a.compte_jour == 30){
			 System.out.println("le salaire de "+a.getNom_serveur()+"est : "+a.getSalaire_serveur());
		 }
		 else{
			 System.out.println("il ya un probleme ou il se peut que vous n 'avez pas travail encore durant un mois");
		 }
			
		}

}
