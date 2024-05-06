public class App {
    public static void mergeSort(String[][] arr, int comienzo , int finl) {
        if ((comienzo<finl)) {
           int medio=(comienzo+finl)/2;
           mergeSort(arr,comienzo,medio);
           mergeSort(arr,medio+1,finl);
           merge(arr,comienzo,medio,finl);

        }
    }
    public static void main(String[] args) throws Exception {
        String[][] computadoras = {
            {"hp","100.34","30"},
            {"Apple","200.5","20"},
            {"Lenovo","300.80","5"},
            {"Samsung","250.50","12"},
            {"Dell","230.00","13"},
            {"Sony","150.58","12"},
            {"Asus","178.00","11"},
            {"LG","210.98","15"}
        };
        mergeSort(computadoras, 0, computadoras.length-1);
        System.out.println("Productos:");
        for(String[] computadora:computadoras){
            System.out.println(computadora[0]+" - Costo: "+computadora[1]+ " - en venta:"+computadora[2]);
}
}
public static void merge (String[][]arr,int comienzo,int media,int finl){
    int x=media-comienzo+1;
    int y=finl-media;
    String[][] izquierda=new String[x][8];
    String[][]derecha=new String[y][8];
    for(int z=0; z < x ; z++){
        izquierda[z]=arr[comienzo+z];
    }
    for(int r=0; r<y; r++){
        derecha[r]=arr[media+1+r];
    }
    int z=0, r=0;
    int l=comienzo;
    while (z<x && r<y) {
        if (izquierda[z][0].compareTo(derecha[r][0])<=0){
            arr[l]= izquierda[z];
            z++;
            
        } else {
            arr[l]=derecha[r];
            r++;
        }
        l++;
    }
    while (z<x) {
        arr[l]=izquierda[z];
        z++;
        l++;
    }
    while (r<y) {
        arr[l]=derecha[r];
        r++;
        l++;
    }
}
}