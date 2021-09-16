package pl.btc.jsfjava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {


    public static void main(String[] args) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName("JACEK");

        SessionFactory sessionFactory = buildSessionFactory(ProductEntity.class);
        Session session = sessionFactory.openSession();
        session.save(productEntity);

        ProductEntity product = session.get(ProductEntity.class,1);
        System.out.println(product.getName());


//        session.close();
//        sessionFactory.close();

    }


    public static SessionFactory buildSessionFactory(Class clazz){
        return new Configuration()
                .configure()
                .addAnnotatedClass(clazz)
                .buildSessionFactory();


    }
}
