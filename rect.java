
package praktikum;
public class rect {
    // ada 4 variable utama yang menentukan titik sudut persegi panjang
    public int x1, y1, x2, y2;
    
    /** ini adalah constructor utama **/
    public rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    /* constructor dengan panjang dan lebar dimulai dari koodinat 0,0*/
    public rect(int width, int height) {
        this(0, 0, width, height);
    }
    
    /** constructor persegi nol. */
    public rect(){
        this(0, 0, 0 , 0);
    }
    /** method untuk menggeser persegi panjang */
    public void move(int deltax, int deltay){
        x1 += deltax; x2 += deltax;
        y1 += deltax; y2 += deltax;
    }
    
    /** method untuk memeriksa apa satu titik di dalam persegi panjang */
    public boolean isInside(int x, int y){
        return ((x >= x1)&& (x <= x2)&& (y >= y1)&& (y <= y2)); }
    
    /** method untuk menggabung (union) persegi panjang */
    public rect union (rect r) {
        return new rect
                (   (this.x1 < r.x1) ? this.x1 : r.x1,
                    (this.y1 < r.y1) ? this.y1 : r.y1,
                    (this.x2 > r.x2) ? this.x2 : r.x2,
                    (this.y2 > r.y2) ? this.y2 : r.y2);
                }
    /** method untuk mengetahui perpotongan dua perdegi panjang */
    public rect intersection(rect r){
        rect result = new rect(
                (this.x1 > r.x1) ? this.x1 : r.x1,
                (this.y1 > r.y1) ? this.y1 : r.y1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y2 < r.y2) ? this.y2 : r.y2);
        if (result.x1 > result.x2) {
            result.x1 = result.x2 = 0;
        }
        if (result.y1 > result.y2) {
            result.y1 = result.y2 = 0;
        }
        return result;
    }
    }
    

