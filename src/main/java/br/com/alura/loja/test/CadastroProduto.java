package br.com.alura.loja.test;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();

        celular.setNome("Xiaomi 10");
        celular.setDescricao("8GB Ram");
        celular.setPreco(new BigDecimal(2000));

        EntityManager entityManager = JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(entityManager);

        entityManager.getTransaction().begin();
        dao.cadastrar(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
