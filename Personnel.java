package com.rest.univ;

public class Personnel {
	String nom_personnel;
	int salaire_personnel;
	int salaire_jour ;
	int compte_jour;
	
	public Personnel(String nom) {
		this.nom_personnzl = nom;
		this.salaire_personnel = 0 ;
		this.salaire_jour = 2000;
		this.compte_jour = 0;
		}
	
	public String getNom_personnel() {
		return nom_personnel;
	}

	public void setNom_personnel(String nom_personnel) {
		this.nom_personnel = nom_personnel;
	}

	public int getSalaire_personnel() {
		return salaire_personnel;
	}

	public void setSalaire_personnel(int salaire_personnel) {
		this.salaire_personnel = salaire_personnel;
	}

	public int getSalaire_jour() {
		return salaire_jour;
	}

	public void setSalaire_jour(int salaire_jour) {
		this.salaire_jour = salaire_jour;
	}
	public int getCompte_jour() {
		return salaire_personnel;
	}

	public void setCompte_jour(int salaire_personnel) {
		this.salaire_personnel = salaire_personel;
	}

	public void present_au_restaurant(Personnel a){
		a.compte_jour = a.compte_jour +1;
		a.salaire_personnel = a.salaire_personnel + a.salaire_jour ;
	}
	
	 public void salaire_d_un_personnel(Personnel a){
		 if(a.compte_jour == 30){
			 System.out.println("le salaire de "+a.getNom_personnel()+"est : "+a.getSalaire_personnel());
		 }
		 else{
			 System.out.println("il ya un probleme ou il se peut que vous n 'avez pas travail encore durant un mois");
		 }
			
		}
		public void remettre_a_zero_compt_de_jour(Personnel b){
			 if(b.compte_jour == 30){
			 	b.setCompte_jour(0);
			 	System.out.println(b.getNom_personnel()+" votre comptage de jour de travail"
			 	+ "a atteint 30, nous avons remis a remis zero")
			 }
			 else{
			 	System.out.println(b.getNom_personnel()+" votre comptage de jour de travail n a pas atteint 30")
			 }
		}

		public void remettre_a_zero_salaire_personnel(Personnel b){
			 	b.setSalaire_personnel(0);
			 	System.out.println(b.getNom_personnel()+" votre  salaire a ete bien mis a zero")
			 }

}
