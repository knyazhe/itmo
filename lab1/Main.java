
public class Main {
    public static void main(String[] args) {
        short[] c = new short[14];
        for (short i = 4; i <= 17; ++i){
            c[i-4] = i;
        }
        float[] x = new float[10];
        for(int i = 0; i <10; ++i){
            x[i] = (float) (Math.random()*30-15);
        }
        float[][] s = new float[14][10];
        for (int i = 0; i < 14; ++i){
            for (int j = 0; j < 10; ++j){
                if (c[i] == 9){
                    s[i][j]=(float) Math.atan(Math.pow(Math.E, Math.cbrt(-Math.pow(Math.cos(x[j]),2))));
                } else if (c[i] == 4 || c[i] == 6 || c[i] == 10 || c[i] == 11 || c[i] == 12 || c[i] == 13 || c[i] == 16) {
                    s[i][j]=(float) Math.sin(Math.cbrt(Math.cos(x[j])));
                } else {
                    s[i][j] = (float) Math.log(Math.pow(Math.cos(Math.pow(Math.E, Math.atan(Math.pow(x[j]*Math.E/3+1, 2)))), 2));
                }
            }
        }
        for (int i = 0; i < 14; ++ i){
            for ( int j = 0; j < 10; ++ j){
                System.out.format("%.5f ", s[i][j]);
            }
            System.out.println("\n");
        }
    }
}