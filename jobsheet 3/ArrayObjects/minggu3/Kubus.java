public class Kubus {
    public int sisi;

    public Kubus(int s) {
        sisi = s;
    }

    public Double hitungvolume(){
        return sisi*sisi*sisi;
    }

    public Double hitungLP(){
        return 6*(sisi*sisi);
    }
}
