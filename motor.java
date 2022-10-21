class motor{
    private double harga;
    private double TotalBayar;

  
    public motor(double harga, int jumlah){
        this.harga = harga;
        this.TotalBayar = harga * (double)jumlah;

    }

    public motor(double harga, double jumlah){
        this.harga = harga;
        this.TotalBayar = harga * jumlah;
    }

    public double getTotalBayar(){
        return TotalBayar;
    }
}

public class Main {
     public static void main (String[] args){
        motor beat = new motor(17000000, 1);
        motor vario = new motor(34000000, 2);
        motor aerox = new motor(25000000, 1);
        motor fino  = new motor(17000000, 1);

        System.out.println("Perhitungan harga motor");
        System.out.println("harga motor beat : " + beat.getTotalBayar());
        System.out.println("harga motor vario : " + vario.getTotalBayar());
        System.out.println("harga motor aeorx : " +aerox.getTotalBayar());
        System.out.println("harga motor fino : " + fino.getTotalBayar());
    }
}