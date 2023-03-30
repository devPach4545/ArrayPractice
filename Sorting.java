public class Sorting {
    public static void selectionSort(double[] list) {
        for(int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for(int j = i+1; j < list.length; j++) {
                if(currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.println(list[i]);
        }   

    }

    public static void main(String[] args) {
        double a[] = {2,7,3,5,1};
        selectionSort(a);
    }
}
