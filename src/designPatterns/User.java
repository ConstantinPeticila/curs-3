package designPatterns;

public class User {

    String nume;
    String prenume;
    String telefon;
    String email;
    Integer varsta;
    String adresa;
    String infoImportanta;

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", varsta=" + varsta +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    static class UserBuilder{
       private String nume;
       private String prenume;
       private String telefon;
       private String email;
       private Integer varsta;
       private String adresa;
       private String infoImportanta;

       public UserBuilder infoImportanta(String infoImportanta){
           this.infoImportanta = infoImportanta;
           return this;
       }

       public UserBuilder nume(String nume){
           this.nume = nume;
           return this;
       }
       public UserBuilder prenume(String prenume){
           this.prenume = prenume;
           return this;
       }

       public UserBuilder adresa(String adresa){
           this.adresa = adresa;
           return this;
       }

       public UserBuilder telefon(String telefon){
           this.telefon = telefon;
           return this;
       }

       public UserBuilder varsta(Integer varsta){
           this.varsta = varsta;
           return this;
       }

       public User build(){
           User user = new User();
           user.adresa = this.adresa;
           user.nume = this.nume;
           user.prenume = this.prenume;
           user.telefon = this.telefon;
           user.varsta = this.varsta;
           user.email =  this.email;
           user.infoImportanta = this.infoImportanta;
           return user;
       }
   }
}
