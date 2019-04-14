import java.util.Arrays;
import java.util.List;

public class Komis {
    public static void main(String[] args) {
        List<Samochody> listSamochody = Arrays.asList(
                new Samochody("BMW","i3","Biały",200000,20000,5,true),
                new Samochody("Audi","TT","Czarny",900000,1,3,true),
                new Samochody("Fiat","Uno","Różowy",30000,500000,3,false),
                new Samochody("BMW","M4","Czerwony",250000,1000,4,true),
                new Samochody("Mercedes","AMG","Czarny",3000000,5,5,true),
                new Samochody("Audi","A4","Biały",3500000,2,4,true),
                new Samochody("Volvo","XC90","Szary",50000,6,3,false),
                new Samochody("BMW","i8","Biały",1000000,2,5,true),
                new Samochody("Fiat","Panda","Zielony",8000,85000,4,true),
                new Samochody("Mercedes","E36","Czarny",400000,200,3,true),
                new Samochody("BMW","M3","Szary",270000,2000,4,false)
        );

        int i=0;
        for(Samochody s : listSamochody)
        {
            if(s.getMarka().equals("BMW"))
            {
                i++;
            }
        }
        System.out.println("Liczba samochodów marki BMW: "+i);

        System.out.println("\n\n");
        listSamochody.stream()
                .filter(samochody -> samochody.getCena() < 50000)
                .filter(samochody -> samochody.getPrzebieg() <200000)
                .filter(samochody -> samochody.getDrzwi() == 4)
                .filter(samochody -> samochody.isKlimatyzacja() == true)
                .forEach(System.out::println);

        System.out.println("\n\n");

        // nie wiem jak wykonać 3 filtr
    }
}
