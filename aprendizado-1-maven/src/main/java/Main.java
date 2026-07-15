import entities.Pessoa;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa(1, "Breno", "breno@mail.com");
        var pessoa2 = new Pessoa(2, "Luana", "luana@mail.com");
        var pessoa3 = new Pessoa(3, "Carlos", "carlos@mail.com");

        // faz conexão com o banco pelo nome dele definido no arquivo persistence
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meu-banco");

        // cria o gerenciador de entidades
        EntityManager em = emf.createEntityManager();

        // inserção
//        em.getTransaction().begin();
//        em.persist(pessoa1);
//        em.persist(pessoa2);
//        em.persist(pessoa3);
//        em.getTransaction().commit();

        // busca por id
//        Pessoa person = em.find(Pessoa.class, 2);
//        System.out.println("Pessoa encontrada: " + person.getNome());

        // busca todos os registros
//        List<Pessoa> personList = em.createQuery("from Pessoa", Pessoa.class).getResultList();
//        personList.forEach(person -> System.out.println(person.getNome()));

        // atualiza por id
//        em.getTransaction().begin();
//        Pessoa person = em.find(Pessoa.class, 1);
//        person.setEmail("breno@atualizado.com");
//        person.setNome("Breno atualizado");
//        em.getTransaction().commit();

        // remove por id
//        em.getTransaction().begin();
//        Pessoa person = em.find(Pessoa.class, 3);
//        em.remove(person);
//        em.getTransaction().commit();

        System.out.println("Operação finalizada.");
    }

}
