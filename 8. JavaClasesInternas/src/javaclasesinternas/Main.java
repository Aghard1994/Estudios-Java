
package javaclasesinternas;

public class Main {
    public static void main(String[] args) {
        
        Externa ext = new Externa();
        Externa.Interna in = ext.new Interna();
        System.out.println(in.y + ext.x);
        
        Estatico.Internou in2 = new Estatico.Internou();
        System.out.println(in2.y);
        
        IntExt ext2 = new IntExt();
        IntExt.Internai in3 = ext2.new Internai();
        System.out.println(in3.metodoInterno());
    }
}
