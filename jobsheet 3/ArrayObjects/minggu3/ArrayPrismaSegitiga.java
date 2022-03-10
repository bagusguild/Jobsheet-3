public class ArrayPrismaSegitiga {
    public static void main(String[] args) {
        PrismaSegitiga[] psArray = new PrismaSegitiga[2];

        psArray[0] = new PrismaSegitiga(3, 4, 10);
        psArray[1] = new PrismaSegitiga(6, 8, 15);

        for(int i = 0;i < 2;i++){
            psArray[i].hitungLA();
            psArray[i].cariC();
            System.out.println("Prisma ke-"+(i+1)+" mempunyai volume : "+psArray[i].hitungvolume()+", dan luas permukaan : "+psArray[i].hitungLP());
            System.out.println(" ");
        }
    }
}
