package designPatterns;

public class BuilderMain {

    public static void main(String[] args) {
        User alex = User.builder()
                .nume("Alex")
                .prenume("Alex")
                .varsta(20)
//                .telefon("0755555")
                .adresa("Adresa")
                .infoImportanta("info")
                .build();

        System.out.println(alex);
    }
}
