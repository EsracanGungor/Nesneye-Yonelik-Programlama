import java.util.Calendar;
import java.util.Scanner;

public class KalpAtisi {

    private   String ad;
   private  String soyad;
   private  int dogumgunu;
   private  int dogumayi;
   private  int dogumyili;
     private int yas;
    
    public KalpAtisi(String ad, String soyad,  int dogumgunu, int  dogumayi,int dogumyili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumgunu = dogumgunu;
        this.dogumayi = dogumayi;
        this.dogumyili = dogumyili; 
    }

    public KalpAtisi(String ad,String soyad) {
        this.ad=ad;
        this.soyad=soyad;
        this.yas = 30;
    }

    public void setAd(String isim) {
        ad = isim;
    }

    public String getAd() {
        return ad;
    }

    public void setSoyad(String soyisim) {
        soyad = soyisim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setDogumgunu(int dogumgunu) {
        this.dogumgunu = dogumgunu;
    }

    public int getDogumgunu() {
        return dogumgunu;
    }

    public void setDogumayi(int dogumayi) {
        this.dogumayi = dogumayi;
    }

    public int getDogumayi() {
        return dogumayi;
    }

    public void setDogumyili(int dogumyili) {
        this.dogumyili = dogumyili;
    }

    public int getDogumyili() {
        return dogumyili;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

     public     int yasHesaplama( ) {

    Calendar now = Calendar.getInstance();
    Calendar dob = Calendar.getInstance();

    dob.set( dogumyili,dogumayi,dogumgunu);
         
     int yas = now.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
     
         if (dogumyili==0||dogumayi==0||dogumgunu==0) {
             return 30;
         }
         
    else if(now.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) 
    {
        yas--;
    }

     
   return yas;
    }
    
    public  String idealKalpAtisSayisi() {
        int maxAtisSayisi = 220 - yasHesaplama();
        int a = (maxAtisSayisi * 50) / 100;
        int b = (maxAtisSayisi * 85) / 100;
       return  ("Ideal kalp atÄ±s sayisi:"+a + "-" + b+" araligindadir.");
        
    }

    public static void main(String[] args) {
        
    Scanner bilgi=new Scanner(System.in);
    
      KalpAtisi dizi[] = new KalpAtisi[10];
          
        for (int i = 0; i < 10; i++) {        
                   
            System.out.println("AdÄ±nÄ±zÄ± giriniz:");
          String ad1 = bilgi.nextLine();
            
          System.out.println("SoyadÄ±nÄ±zÄ± giriniz:");
            String soyad1 = bilgi.nextLine();
            
         System.out.println("Dogdugunuz yili giriniz:");
        int dogumyili1=bilgi.nextInt();
           
           System.out.println("Dogdugunuz ayi giriniz:");
        int dogumayi1=bilgi.nextInt();
           
            System.out.println("Dogdugunuz gunu giriniz:");
           int dogumgunu1=bilgi.nextInt();
                    bilgi.nextLine();
                    
            if(dogumyili1==0||dogumayi1==0||dogumgunu1==0){
        
         dizi[i]=new KalpAtisi(ad1,soyad1);
        
        }   
        else{
            
           dizi[i]=new KalpAtisi(ad1,soyad1,dogumgunu1,dogumayi1,dogumyili1);
            
            
           dizi[i].ad=ad1;
           dizi[i].soyad=soyad1;
           dizi[i].yas=dizi[i].yasHesaplama( );
          String atis=dizi[i].idealKalpAtisSayisi();
           } 
            
        }
       
        
         for(int i=0;i<10;i++){
    System.out.println("Kisinin adi:"+dizi[i].ad+" soyadi: "+dizi[i].soyad+" yasi: "+dizi[i].yasHesaplama());
    System.out.println(dizi[i].idealKalpAtisSayisi());
  
     
        }
    }
 }
        
      
