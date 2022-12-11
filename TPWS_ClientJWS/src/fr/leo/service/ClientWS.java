package fr.leo.service;

import java.util.List;

public class ClientWS {

	public static void main(String[] args) {
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();
		double resultat = stub.converionEuroToFranc(100);
		System.out.println("Conversion euro en francs : " + resultat + "\n");
		
		System.out.println("Liste des comptes : ");
		List<Compte> liste = stub.getComptes();
		for (Compte compte : liste) {
			System.out.println(compte.getCode());
			System.out.println(compte.getSolde());
		}
		
		System.out.println("");
		System.out.println("Solde du compte : ");
		Compte compte = stub.getCompte(1L);
		System.out.println(compte.getSolde());
	}
}
