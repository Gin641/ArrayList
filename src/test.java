public class test {
    public static void main(String[] args) {
        Mylist<Integer> mylist = new Mylist<Integer>(9);
        mylist.add(1);
        mylist.add(3);
        mylist.add(5);
        mylist.add(7);
        mylist.add(9);
        System.out.print("Size of myList: " + mylist.size() + "\n");
        System.out.print("my list: ");
        for (int i =0; i < mylist.size();i++){
            System.out.print(mylist.get(i) + "\t");
        }
        System.out.println();
        mylist.remote(1);
        System.out.print("myLish after remove values at 1st index: ");
        for (int i =0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + "\t");
        }
        System.out.println();
        System.out.println("MyList after clone: " + mylist.clone());
        System.out.print("5 = " + mylist.contains(5) + "\n" );
        System.out.print("Number 3 in" + mylist.indexOf(3) + " position" + "\n");
        mylist.add(7,15);
        System.out.print("myList after a values: ");
        for (int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + "\t");
        }
        System.out.println();
        System.out.print("Get value at 5th index: " + mylist.get(5) + "\n");
        mylist.ensureCapacity(11);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        System.out.print("Size of myList: " + mylist.size() + "\n");
        mylist.clear();
        System.out.print("myList after use clear method: ");
        for (int i = 0; i < mylist.size(); i++){
            System.out.print(mylist.get(i) + "\t");
        }
        System.out.println();
    }
}
