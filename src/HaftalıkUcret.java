public class HaftalıkUcret {
    Calışanlar calışanlar = new Calışanlar();

   private double bakiye;
    private int gelir;
    private int gider;

    public void gelir(int gelir) {
        gelir += gelir;
    }

    public void gider(int gider) {
        gider -= gider;
    }
    public void bakiye(double bakiye){
        bakiye=gelir-gider;
    }


    public int getGelir() {
        return gelir;
    }

    public int getGider() {
        return gider;
    }

    public void setGelir(int gelir) {
        this.gelir = gelir;
    }

    public void setGider(int gider) {
        this.gider = gider;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}

