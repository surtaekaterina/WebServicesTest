public class Adress {

    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public Adress(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }
}
