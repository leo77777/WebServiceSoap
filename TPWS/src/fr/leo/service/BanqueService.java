package fr.leo.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import fr.leo.metier.Compte;

@WebService(name="BanqueWS")
public class BanqueService {
	
	@WebMethod(operationName="ConverionEuroToFranc")
	public double conversion( @WebParam(name="montant") double mt){
		return mt * 5;
	}
	
	@WebMethod
	public Compte getCompte( @WebParam(name="code") Long code){
		return new Compte(code, Math.random()*10000, new Date());
	}
	
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> cptes = new ArrayList<>();
		cptes.add(new Compte(1L, Math.random()*10000, new Date()));
		cptes.add(new Compte(2L, Math.random()*10000, new Date()));
		return cptes;
	}
}
