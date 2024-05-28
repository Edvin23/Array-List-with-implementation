public class ArrayList <E> implements ImplementationArrayList<E> {

    private int size;
    private int capacity;
    private E[] arrayList;
    private static final int initialCapacity = 10;

    public ArrayList() {
        this.capacity = this.initialCapacity;
        this.size = 0;
        arrayList = (E[]) new Object[this.capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arrayList = (E[]) new Object[this.capacity];
    }

    @Override
    public void add(E a) {

        if (this.size < this.capacity) {
            arrayList[size] = a;
            size++;
        } else {
            System.out.println("There is not enough space, reallocate will occur: ");
            this.reallocate();
            this.add(a);
        }
    }

    private void reallocate() {
        this.capacity *= 2;
        E[] temp = (E[]) new Object[this.capacity];
        for (int i = 0; i < arrayList.length; i++) {
            temp[i] = arrayList[i];
        }
        this.arrayList = temp;
    }

    @Override
    public void add(E a, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        } else if (index == size) {
            this.add(a);
        } else {
            if (this.size == this.capacity) {
                this.reallocate();
            }
            for (int i = size; i > index; i--) {
                this.arrayList[i] = this.arrayList[i - 1];
            }
            this.arrayList[index] = a;
            this.size++;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }
        E temp = arrayList[index];
        for (int i = index; i < size - 1; i++) {
            this.arrayList[i] = this.arrayList[i + 1];
        }
        this.size--;
        return temp;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }
        return arrayList[index];
    }

    @Override
    public void set(E a, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;

        }
        arrayList[index] = a;

    }

    @Override
    public int getSize() {

        return this.size;
    }

    @Override
    public int indexOf(E a) {
        arrayList[size] = a;                //insert into the array
        size++;                             //updates the number of elements in the array
        System.out.println(arrayList[(int) a]);//prints out the element in that location
        return -1;
        }

        public String toString () {
            String s = " ";
            for (int i = 0; i < this.size; i++) {
                s = s + arrayList[i] + ", ";
            }
            return s;
        }
    }



