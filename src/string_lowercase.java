public class string_lowercase {
    public static void main(String[] args) {
        String s = new String("Hallo, nama saya Adi, alamat saya di Kediri. Saya jurusan Teknik Informatika di UNP Kediri.");
        System.out.println(s + "\n");
        
        String sLowerCase = s.toLowerCase();
        System.out.println(sLowerCase + "\n");
        System.out.println("Huruf yang diubah menjadi huruf kecil: " + s.charAt(17) +","+ s.charAt(37) +","+ s.charAt(45) +","+ 
        s.charAt(58) +","+ s.charAt(65) +","+ s.charAt(80) +","+ 
        s.charAt(81) +","+ s.charAt(82) +","+ s.charAt(84) + "\n");

        System.out.println(sLowerCase.replace("adi", "agus")
        .replace("kediri", "surabaya")
        .replace("jurusan", "prodi")
        .replace("informatika", "mesin"));
    }
}