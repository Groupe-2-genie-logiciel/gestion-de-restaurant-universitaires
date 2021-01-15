package com.rest.univ;

public class CompteEtudiant {
	private String nom_etudiant;
	private String prenom_etudiant;
	private String pin_etudiant;
	private String id;
	private int argent_etudiant;
	
	public CompteEtudiant(String nom,String prenom,String pin,int argent) {
		this.nom_etudiant = nom;
		this.prenom_etudiant = prenom;
		this.pin_etudiant = pin;
		this.argent_etudiant = argent;
		this.id = nom+prenom+pin;

		}
	/* 
	 * LA METHODE commander_plat_restaurant COMMANDE
	 * UN PLAT A UN ETUDIANT QUELCONQUE
	 */
	void commander_plat_restaurant(PlatRestaurant a,CompteEtudiant b,String mot_de_pass){
		String cdes = b.getPin_etudiant(); 
			int argt = b.getArgent_etudiant();
			 argt = argt - a.getPrix_plat();
		if(verifier_et_commander(a, b, mot_de_pass, cdes)){
			b.setArgent_etudiant(argt);
		int temp = a.getQuant_rest();
		temp--;
		a.setQuant_rest(temp);
			System.out.println("votre plat est commandé");
		}
		else {
			System.out.println("DESOLE SOIT LES PLATS SONT FINI OU VOUS AVEZ MAL RENSEIGNER OU MEME VOTRE COMPTE EST VIDE .");
		}
	}
	/*
	 * CETTE METHODE  VERIFIER SI LA QUANTITE DES PLAT RESTANTE EST SUPERIEURE A UN
	 *  ET SI L ARGENT DU CompteEtudiant QUELCONQUE EST SUFFISSANT POUR ACHETE UN PLAT
	 */
	private boolean verifier_et_commander(PlatRestaurant a, CompteEtudiant b, String code,
			String cdes) {
		return ((a.getQuant_rest()) >= 1)&&((b.getArgent_etudiant())>= (a.getPrix_plat()))&& (cdes.equalsIgnoreCase(code) );
	}
	public int getArgent_etudiant() {
		return argent_etudiant;
	}
	/*
	 * CETTE  METHODE setArgent_compteajoute AJOUTE
	 *  DE L ARGENT DANS L'ATTRIBUT argent_etudiant MAIS AVANT
	 *  IL FAIT VERIFICATION NECCESSAIRE AVANT L'AJOUT D'ARGENT
	 */
	public void setArgent_compte( CompteEtudiant a,int argent_compte) {
		//String ids = a.getNom_etudiant()+a.getPrenom_etudiant()+pin;
		//String tempID = a.getId();
		//if (tempID == ids){
			a.setArgent_etudiant(argent_etudiant);
			int tempArg = a.getArgent_etudiant();
			System.out.println("La somme "+argent_compte+ " FCA été bien ajouter. votre compte est maintenant à "+tempArg);
		
		//}
		
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}
	public String getPin_etudiant() {
		return pin_etudiant;
	}
	public void setPin_etudiant(String pin_etudiant) {
		this.pin_etudiant = pin_etudiant;
	}
	public void setArgent_etudiant(int argent_etudiant) {
		this.argent_etudiant += argent_etudiant;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
