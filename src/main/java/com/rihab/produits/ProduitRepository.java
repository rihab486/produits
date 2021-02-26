package com.rihab.produits;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rihab.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
