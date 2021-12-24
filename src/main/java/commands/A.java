package commands;

import com.github.javafaker.Faker;
//import org.aeonbits.owner.ConfigFactory;

public class A {
    public static void main(String[] args) {
//        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
//        System.out.println(cfg.port());
//        System.out.println("Server " + cfg.hostname() + ":" + cfg.port() +
//                " will run " + cfg.maxThreads());

        Faker faker = new Faker();

        String streetName = faker.address().streetName();
        String number = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();

        System.out.println(String.format("%s\n%s\n%s\n%s",
                number,
                streetName,
                city,
                country));
    }
}
