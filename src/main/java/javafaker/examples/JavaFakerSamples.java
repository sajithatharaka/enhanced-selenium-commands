package javafaker.examples;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class JavaFakerSamples {
    public static void main(String[] args) {
        Faker fake=new Faker(new Locale("ja"));
        System.out.println("First Name "+fake.name().firstName());
        System.out.println("Last Name "+fake.name().lastName());
        System.out.println("Full Name "+fake.name().fullName());
        System.out.println("Phone "+fake.phoneNumber().cellPhone());
        System.out.println("Email "+fake.internet().emailAddress());
        System.out.println("Address "+fake.address().fullAddress());
        System.out.println("Job "+fake.job().position());
        System.out.println("DOB "+fake.date().birthday());

        //Dates
        System.out.println("Future Date "+fake.date().future(1, TimeUnit.DAYS));
        System.out.println("Past Date "+fake.date().past(1,TimeUnit.DAYS));

        //Books
        System.out.println("Title "+fake.book().title());
        System.out.println("Author "+fake.book().author());
        System.out.println("Publisher "+fake.book().publisher());

        //Currency
        System.out.println("Name "+fake.currency().name());
        System.out.println("Code "+fake.currency().code());

        //Company
        System.out.println("Name "+fake.company().name());
        System.out.println("Logo "+fake.company().logo());
        System.out.println("Industry "+fake.company().industry());
        System.out.println("URL "+fake.company().url());

        //Demography
        System.out.println("Gender "+fake.demographic().sex());
        System.out.println("Education "+fake.demographic().educationalAttainment());
        System.out.println("Marital Status "+fake.demographic().maritalStatus());
    }
}
