public class string_stringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hallo, nama saya Adi, alamat saya di Kediri. Saya jurusan Teknik Informatika di UNP Kediri.");
        System.out.println(s.insert(20, " Sucipto")
        .replace(45, 51, "Blitar")
        .delete(51, 52)
        .delete(52, 56)
        .insert(86, "GRI")
        .delete(96, 97)
        .insert(96, " Jawa Timur."));
    }
}
