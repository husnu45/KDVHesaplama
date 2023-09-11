
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        double price;      
        
        // Müşteriden Ürünün Fiyat Bilgisini Alma.
        
        Scanner getPriceFromCustomer = new Scanner (System.in);
        
        System.out.print("Please Enter the Price of Merchandise : ");
        
        price = getPriceFromCustomer.nextDouble();
        
        // Girilen Fiyatın 0 ile 1000 olma durumu ya da 1000'den büyük olma durumuna göre KDV Oranını belirleme.
        
        double vatRate = (price > 1000) ? 0.08 : 0.18;
        
        // KDV Miktarının ve KDV Dahil Fiyatın Hesaplanması
        
        double vatAmount = (price * vatRate);
        
        double priceIncludeVAT = price + vatAmount;
        
        // Çıktılarımız.
        
        System.out.println("Price without VAT : " + price);
        System.out.println("Price include VAT : " + priceIncludeVAT);
        System.out.println(price > 1000 ? "VAT Rate is %8 " : "VAT Rate is %18");
        
        
        
        
        
    }
    
}
