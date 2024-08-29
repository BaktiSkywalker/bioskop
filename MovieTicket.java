package latihan_5;
import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] movies = {" Marta Adventure", " Romantic Marta", "Jambu Marta"};
        int[] prices = { 50000,  45000, 40000};

        boolean continueBuying = true;
        while (continueBuying) {
            System.out.println("Selamat datang di bioskop MARTA JURANG UJUNG!");
            System.out.println("Daftar film:");
            for (int i = 0; i < movies.length; i++) {
                System.out.println((i + 1) + ". " + movies[i] + " (Rp. " + prices[i] + ")");
            }

            
            System.out.print("Pilih film 1, 2, atau 3: ");
            int movieChoice = scanner.nextInt();
            int hargaPerTicket = prices[movieChoice - 1];

            
            System.out.print("Masukkan jumlah tiket: ");
            int numTickets = scanner.nextInt();

            
            int totalPrice = hargaPerTicket * numTickets;

            
            if (numTickets >= 3) {
                totalPrice *= 0.9; 
                System.out.println("Selamat anda mendapatkan diskon 10%!");
            }

            System.out.println("Total harga: Rp" + totalPrice);

            
            System.out.print("Masukkan uang pembayaran: Rp");
            int payment = scanner.nextInt();

            
            int change = payment - totalPrice;
            if (change > 0) {
                System.out.println("Kembalian: Rp" + change);
            } else if (change < 0) {
                System.out.println("Uang Anda kurang, Transaksi BATAL.");
                continue;
            }

            
            System.out.print("Ingin membeli tiket lagi? (ya/tidak): ");
            String answer = scanner.next();
            continueBuying = answer.equalsIgnoreCase("ya");
        }

        System.out.println("Terima kasih telah membeli tiket dan Selamat menonton" );
        
        scanner.close();
    }
}
