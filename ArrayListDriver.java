public class ArrayListDriver {
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>(1);
        myList.add(10);
        System.out.println(myList);
        myList.add(20);
        System.out.println(myList);
        myList.add(30);
        System.out.println(myList);
        myList.add(40);
        System.out.println(myList);
        myList.add(50);
        System.out.println(myList);
        myList.add(100,0);
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.remove(15);
        System.out.println(myList);
        Integer value = myList.get(0);
        System.out.println("The value at location 0 is: " + value);
        System.out.println(myList);
        myList.set(99,12);
        System.out.println(myList);
        myList.indexOf(3);
        System.out.println(myList);
    }
}
