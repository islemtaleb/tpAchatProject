package com.esprit.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CategorieProduitMock {
	
@Mock
CategorieProduitRepository cp;
@InjectMocks
CategorieProduitServiceImpl cp2 ;


CategorieProduit c=CategorieProduit.builder().codeCategorie("123").libelleCategorie("libelle").build();
  List<CategorieProduit> list=new ArrayList<CategorieProduit>(){
	  {
		  add(CategorieProduit.builder().codeCategorie("1234").libelleCategorie("libelle1").build());
		  add(CategorieProduit.builder().codeCategorie("12345").libelleCategorie("libelle2").build());
		  
  }
	  
  
};}
