package Kerucut;

public class Kerucut extends BinganRuing{
    int r;
    int t;
    int s;

    public Kerucut(int r,int t,int s) {
        this.r = r;
        this.t = t;
        this.s = s;
    }

    @Override
    public float luas(){
        return (float) (Math.PI * r * (r + s));
    }

    @Override
    public float volume(){
        return (float) (1/(float)3 * Math.PI * r * r * t);
    }
}
