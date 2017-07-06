package sk.jazzman.graphqlpostgres;

import org.crygier.graphql.GraphQLExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
@EntityScan
@SpringBootApplication
public class GraphqlPostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlPostgresApplication.class, args);
    }

//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public GraphQLExecutor graphqlExecutor() {
//        return new GraphQLExecutor(entityManager);
//    }
}
