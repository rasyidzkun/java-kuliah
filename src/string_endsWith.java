public class string_endsWith {
    public static void main(String[] args) {
        String data[] = {"Adi Ahmad", "Budi Waluyo", "Joko Ahmad", "Cecep Reza", "Dedik Prasetyo", "Dimas Ahmad", "Raffi Ahmad", "Ponaryo Astaman"};

        for(String nama : data) {
            if(nama.startsWith("Ahmad") || nama.endsWith("Ahmad")) {
                System.out.println(nama);
            }
        }
    }
}
