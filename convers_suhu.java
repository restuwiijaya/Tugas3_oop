package tugasoop3;

/**
 *
 * @author I Ketut Agus Restu Wijaya 20103347
 */
public class convers_suhu {

    private double Hasil, C, F;
   
    public void SetC (double nilai){
    this.C = nilai;
}
    public void SetF (double nilai){
    this.F = nilai;
}
    public void setHasil(double hsl){
    this.Hasil = hsl;
}
    public double getHasil(){
     return this.Hasil;
}
        public double Conversi(String jns){
        if(jns == "C2F")    
        this.Hasil=C*9/5+ 32; 
    
        else if(jns == "F2C")
        this.Hasil= F*5/9-32; 
        return this.Hasil;
    }
}