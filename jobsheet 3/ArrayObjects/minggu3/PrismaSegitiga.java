public class PrismaSegitiga {
    public int alas, tinggi, tinggiPrisma, c;

    public PrismaSegitiga(int a, int t, int tp){
        alas = a;
        tinggi = t;
        tinggiPrisma = tp;
    }

    public int hitungLA(){
        return alas*tinggi/2;
    }

    public int hitungvolume(){
        return hitungLA()*tinggiPrisma;
    }

    public void cariC(){
        c = ((alas*alas)+(tinggi*tinggi));
        System.out.println("Segitiga pada alas prisma mempunyai sisi miring "+(Math.sqrt(c)));
    }

    public Double hitungLP(){
        return (2*hitungLA())+(tinggiPrisma*alas)+(tinggiPrisma*tinggi)+(tinggiPrisma*(Math.sqrt(c)));
    }

}


