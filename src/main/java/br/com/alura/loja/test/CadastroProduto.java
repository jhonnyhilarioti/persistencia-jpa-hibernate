package br.com.alura.loja.test;

import br.com.alura.loja.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroProduto {
    public static void main(String[] args){
        Produto celular = new Produto();

        celular.setNome("Xiaomi 10");
        celular.setDescricao("8GB Ram");
        celular.setPreco(new BigDecimal(2000));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("loja");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
