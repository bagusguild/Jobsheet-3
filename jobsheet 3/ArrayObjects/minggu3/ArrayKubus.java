public class ArrayKubus {
    public static void main(String[] args) {
        Kubus[] kArray = new Kubus[2];

        kArray[0] = new Kubus(10);
        kArray[1] = new Kubus(15);

        for(int i = 0;i < 2;i++){
            System.out.println("Kubus ke-"+(i+1)+" mempunyai volume : "+kArray[i].hitungvolume()+", dan luas permukaan : "+kArray[i].hitungLP());
            System.out.println(" ");
        }
    }
}
