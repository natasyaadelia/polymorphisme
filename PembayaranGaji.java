
package latihan3;

import latihan3.staf;
import latihan3.direktur;
import latihan3.pegawai;

public class PembayaranGaji {
    public int hitunggaji(pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang+=((staf)peg).bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        staf ali = new staf();
        direktur angga = new direktur();
        System.out.println("Gaji yang dibayarkan untuk staf ="+pg.hitunggaji(ali));
        System.out.println("Gaji yang dibayarkan kepada direktur ="+pg.hitunggaji(angga));
    }
}
