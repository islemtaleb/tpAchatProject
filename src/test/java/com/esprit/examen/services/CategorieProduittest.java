package com.esprit.examen.services;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategorieProduittest {
	@Autowired
	CategorieProduitRepository cp;
	@Test
	public void add() {
		
		CategorieProduit c=CategorieProduit.builder().codeCategorie("123").libelleCategorie("libelle").build();
		CategorieProduit c2=cp.save(c);
		assertEquals(c.getIdCategorieProduit(), c2.getIdCategorieProduit());
		cp.delete(c2);
	}
	
	}


