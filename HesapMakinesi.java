
package hesapmakinesi;


public class HesapMakinesi extends Hesapla implements Ozelİslemler{
    int a;
    int b;
    HesapMakinesi(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Girilen sayilarin toplamı " +topla(a, b));
        System.out.println("Girilen sayilarin farki "+cikar(a, b));
        System.out.println("Girilen sayilarin carpimi "+carp(a, b));
        System.out.println("Girilen sayilarin bolomu "+ bol(a, b));
        
    }
    @Override
    public void kok_al(int a) {
        System.out.println("Girilen sayinin kökü"+Math.sqrt(a));
    }

    @Override
    public void ust_al(int alt, int ust) {
        System.out.println("Girilen sayinin "+ust+". kuvveti "+Math.pow(alt,ust));
    }
    
    
    
    public static void main(String[] args) {
        HesapMakinesi makine1 = new HesapMakinesi(10, 0);
        makine1.kok_al(25);
        makine1.ust_al(2, 3);
    }

    
}
class Hesapla{
    int sonuc = 1;
    float sonucc = (float) 1.0;
    public static int carp(int a, int b){
        return a*b;
    }
    public static double bol(int a, int b){
        try {
            return a/b;
        } catch (Exception e) {
            System.out.println("Hiçbir sayı sıfıra bolunemez");
        }
        return 0;
        
    }
    public static int topla (int a, int b){
            return a+b;
    }
    public static int cikar (int a, int b){
            return a-b;
    }
    
}
interface Ozelİslemler{
    public void kok_al(int a);
    public void ust_al(int alt,int ust);
}

