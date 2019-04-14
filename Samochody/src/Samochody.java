public class Samochody {

    private String marka;
    private String model;
    private String kolor;
    private int cena;
    private double przebieg;
    private int drzwi;
    private boolean klimatyzacja;

    public Samochody(String marka,String model,String kolor, int cena, float przebieg, int drzwi, boolean klimatyzacja )
    {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.cena = cena;
        this.przebieg = przebieg;
        this.drzwi = drzwi;
        this.klimatyzacja = klimatyzacja;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getKolor() {
        return kolor;
    }

    public int getCena() {
        return cena;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public int getDrzwi() {
        return drzwi;
    }

    public boolean isKlimatyzacja() {
        return klimatyzacja;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setPrzebieg(double przebieg) {
        this.przebieg = przebieg;
    }

    public void setDrzwi(int drzwi) {
        this.drzwi = drzwi;
    }

    public void setKlimatyzacja(boolean klimatyzacja) {
        this.klimatyzacja = klimatyzacja;
    }

    @Override
    public String toString()
    {
        return "Samochód{" +
                "Marka:'" + marka + '\'' +
                ", Model: '" + model + '\'' +
                ", Kolor: '" + kolor + '\'' +
                ", Cena: '" + cena + '\'' +
                ", Przebieg: '" + przebieg + '\'' +
                ", Ilość drzwi: '" + drzwi + '\'' +
                ", Klimatyzacja: '" + klimatyzacja + '\'' +
                '}';
    }
}
