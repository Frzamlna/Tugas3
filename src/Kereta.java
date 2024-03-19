public class Kereta {
    // Deklarasi kelas publik bernama "Kereta".
    private String jenisKereta;
    // Deklarasi atribut private bertipe String bernama "jenisKereta".
    private int ticketTersedia;
    // Deklarasi atribut private bertipe int bernama "ticketTersedia".
    private Ticket ticket;
    // Deklarasi atribut private bertipe objek "Ticket" bernama "ticket".

    // Constructor default yang menginisialisasi "jenisKereta" dengan "komuter", "ticketTersedia" dengan 1000, dan membuat objek baru "ticket" dari kelas "Ticket".
    public Kereta() {
        this.jenisKereta = "komuter";
        this.ticketTersedia = 1000;
        this.ticket = new Ticket();
    }
    // Constructor dengan parameter "jenis" dan "jumlah" yang menginisialisasi "jenisKereta", "ticketTersedia", dan membuat objek baru "ticket" dengan parameter "jenis" dan "jumlah".
    public Kereta(String jenis, int jumlah) {
        this.jenisKereta = jenis;
        this.ticketTersedia = jumlah;
        this.ticket = new Ticket(jenis, jumlah);
    }
    // Method public yang menambahkan nama penumpang ke daftar penumpang dan mengurangi jumlah tiket tersedia.
    public void tambahTiket(String nama) {
        String[]  dataNama = new String[ticket.getNamaPenumpang().length + 1];
        System.arraycopy(ticket.getNamaPenumpang(), 0, dataNama, 0, ticket.getNamaPenumpang() .length);
        dataNama[dataNama.length - 1] = nama;
        ticket.setNamaPenumpang(dataNama);
        ticketTersedia--;

        System.out.println("==================================================");
        System.out.println("Tiket berhasil dipesan");
    }
    // Method public yang menambahkan nama, asal, dan tujuan penumpang ke daftar penumpang dan mengurangi jumlah tiket tersedia.
    public void tambahTiket(String nama, String asal, String tujuan) {
        if(ticket.getNamaPenumpang().length < ticketTersedia){
        String[]  dataNama = new String[ticket.getNamaPenumpang().length + 1];
        System.arraycopy(ticket.getNamaPenumpang(), 0, dataNama, 0, ticket.getNamaPenumpang() .length);
        dataNama[dataNama.length - 1] = nama;
        ticket.setNamaPenumpang(dataNama);
        
        String[] dataAsal = new String[ticket.getAsal() .length + 1];
        System.arraycopy(ticket.getAsal(), 0, dataAsal, 0, ticket.getAsal().length);
        dataAsal[dataAsal.length - 1] = asal;
        ticket.setAsal(dataAsal);

        String[] dataTujuan = new String[ticket.getTujuan().length + 1];
        System.arraycopy(ticket.getTujuan(), 0, dataTujuan, 0, ticket.getTujuan().length);
        dataTujuan[dataTujuan.length -1 ]=tujuan;
        ticket.setTujuan(dataTujuan);

        if(ticketTersedia - ticket.getNamaPenumpang().length < 30){
            System.out.println("==================================================");
            System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + (ticketTersedia - ticket.getNamaPenumpang().length));
        } else {
            System.out.println("==================================================");
            System.out.println("Tiket berhasil dipesan");
        }       

        } else {
        System.out.println("==================================================");
        System.out.println("kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya"); 
        }       

    }

    public void tampilkanTiket() {
        System.out.println("==================================================");
        System.out.println("Daftar penumpang kereta api " + this.jenisKereta + ": ");
        System.out.println("----------------------------");

        for  (int i = 0; i < ticket.getNamaPenumpang() .length ;i++) {    
            if (this.jenisKereta.equals("komuter")) {
                System.out.print("\nNama      : " + ticket.getNamaPenumpang() [i]);
            }  else {
                System.out.print("\nNama      : " + ticket.getNamaPenumpang() [i]);
                System.out.print("\nAsal      : " + ticket.getAsal() [i]);
                System.out.println("\nTujuan    : " + ticket.getTujuan() [i]);   
                System.out.println("----------------------------");
            }
        }
    }
    


}
