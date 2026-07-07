import entities.Pessoa;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args){
        var pessoa1 = new Pessoa(1, "Breno", "breno@mail.com");
        var pessoa2 = new Pessoa(2, "Luana", "luana@mail.com");
        var pessoa3 = new Pessoa(1, "Carlos", "carlos@mail.com");

        // faz conexão com o banco pelo nome dele definido no arquivo persistence
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aprendizado-1-maven");

        // cria o gerenciador de entidades
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(pessoa1);
        em.persist(pessoa2);
        em.persist(pessoa3);
        em.getTransaction().commit();

        System.out.println("Operação finalizada.");
    }
}
