package com.rihab.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rihab.produits.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit("pc azuz",2500.500,new Date());
	produitRepository.save(prod);
	}
	@Test
	public void testFindProduit()
	{
	Produit p = produitRepository.findById(2L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepository.findById(4L).get();
	p.setPrixProduit(2000.0);
	produitRepository.save(p);
	System.out.println(p);
	}
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(3L);
	}
	@Test
	public void testFindAllProduits()
	{
		List<Produit> prods = produitRepository.findAll();
		
		for (Produit p:prods)
			 System.out.println(p);
		
	}
	

}
