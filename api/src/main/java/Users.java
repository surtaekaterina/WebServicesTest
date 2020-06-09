import java.util.Map;


public class Users {

    Integer id;
    String name;
    String username;
    String email;
    Adress adress;
    String phone;
    String website;
    Company company;
    //Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Users(Integer id, String name, String username, String email, Adress adress, String phone, String website, Company company, Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.website = website;
        this.company = company;
        //this.additionalProperties = additionalProperties;
    }
}
