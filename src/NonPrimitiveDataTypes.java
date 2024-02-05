public class NonPrimitiveDataTypes {

    public void displayNonPrimitiveData(){
        String str = "test";
        System.out.println("String str: "+str);

        String str1 = new String("test2");
        System.out.println("Another string :"+str1);

        int arr[] = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        for (int j : arr) {
            System.out.println(" Array : " + j);
        }
        System.out.println("First element of the array "+arr[0]);
    }
}
