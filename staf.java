
package latihan3;

import latihan3.pegawai;

public class staf extends pegawai {
    private static final int gajistaf=50000;
    private static final int bonusstaf=10000;
    
    public int gaji(){
        return gajistaf;
    }
    public int bonus(){
        return bonusstaf;
    }
}
