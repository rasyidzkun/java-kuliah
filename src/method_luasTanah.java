public class method_luasTanah {
    public static void main(String[] args) {
        int panjangTanah1 = 100, lebarTanah1 = 70, panjangTanah2 = 200, lebarTanah2 = 150, panjangTanah3 = 80;
        System.out.println(luasTanah(panjangTanah1, lebarTanah1));
        System.out.println(luasTanah(panjangTanah2, lebarTanah2));
        System.out.println(luasTanah(panjangTanah3, panjangTanah3));
    }

    static int luasTanah(int panjang, int lebar) {
        return panjang * lebar;
    }
}