public class harmonikSeri {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        int n = numbers.length; // Eleman sayısı
        double harmonicSeriesSum = 0; // Elemanların harmonik serisinin toplamı


        // Elemanların harmonik serisinin toplamını hesapla
        for (int i = 0; i < n; i++) {
            harmonicSeriesSum += (1 / numbers[i]);
        }

        // Harmonik ortalama hesaplaması


        double harmonicMean = n / harmonicSeriesSum;

        // Sonucu ekrana yazdır
        System.out.println("Harmonik Ortalama: " + harmonicMean);


    }
}