package OptionalClass;

import java.util.Optional;

public class OptionalImplementation {
    public static void main(String[] args) {
        System.out.println("Running... ");

        // String mail = "alamfaizan173@gmail.com";


        // null pointer check 
        // if(mail != null){
        //     System.out.println(mail);
        // }else{
        //     System.out.println("Not present");
        // }


        String mail = "        alamfaizan173@gmail.com              ";
        // String mail = null;

        // Optional<String> optionalMail = Optional.ofNullable(mail);
        // System.out.println(optionalMail.orElse("Not present."));


        Optional<String> optional = Optional.of(mail);

        Optional<String> map = optional.filter((s) -> s.contains("alam")).map((s) -> {
            s = s.trim();
            for(int i = 0; i < 10; i++){
                s += s;
            }
            return s;
        });
        System.out.println(map);
        System.out.println("--------------------------------------------------------------");
        Optional<String> map1 = optional.filter((s) -> s.contains("faizan")).map(String::trim);
        // System.out.println(optional);
        System.out.println(map1);
    }
}
