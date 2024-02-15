package lab03_duyanhng_haluu;

public class HTWArrayList<E> implements HTWList<E>{

    private int capacity = 10;

    // private E[] data = new E[capacity];
    private E[] data = (E[])(new Object[capacity]);  // work around for line 5

    private int size = 0;

    // add "element" to the end of list
    public void add(E element) {
        if (size == capacity) {
            // array is full, new array needed
            capacity = capacity * 2;
            E[] temp = (E[])(new Object[capacity]);

            // for (int i = 0; i <data.length; i++) {
                // temp[i] = data[i];
            // }

            // equivalent to lines 19--21
            System.arraycopy(data, 0, temp, 0, data.length);

            data = temp;
        }
        data[size] = element;
        size++;
    }

// 3-2 
// a)
    public void add(int idx, E obj) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {
            capacity = 2 * capacity;
            E[] temp = (E[]) (new Object[capacity]);
            System.arraycopy(data,src.Pos:0, temp, destPos:0, data.length);
            data = temp;
        }
        System.arraycopy(data, idx, data, idx+1, size-idx);
        data[idx] = obj;
        size++;
    }
        

// a)
    @Override
    public void clear(){
        E[] temp = (E[]) (new Object[capacity]);
        data = temp;
    }

// a)
    public String toString(){
        String s = "";
        for (int i = 0; i < size; i++){
            s = s + data[i] + ", ";
        }
        return s;
    }

    // remove the element at position idx
    public void remove(int idx) {
        if (idx >= 0 && idx < size){
            for (int i = idx; i < size-1; i++) {
                data[i] = data[i+1];
            }
            size--;
        } else {
            throw new IndexOutOfBoundExcpetion();
        }
    }

    public E get(int idx) {
        if (idx >= 0 && idx < size) {
            return data[idx];
        } else {
            throw new IndexOutOfBoundExcpetion();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // HTWArrayList<String> htwArrayList = new HTWArrayList<String>();
        HTWArrayList<String> htwArrayList = new HTWArrayList<>(); // equivalent to line 59
        htwArrayList.add("King 0");
        htwArrayList.add("King 1");
        htwArrayList.add("King 2");
        htwArrayList.add("King 3");
        htwArrayList.add("King 4");

        HTWArrayList<Integer> integerHTWArrayList = new HTWArrayList<Integer>();
        integerHTWArrayList.add(42);
        integerHTWArrayList.add(4);
        integerHTWArrayList.add(2);

        for (int i = 0; i < htwArrayList.size(); i++) {
            System.out.println(htwArrayList.get(i));
        }
    }
    }

// a)
    @Override
    public void clear(){
        E[] temp = (E[]) (new Object[capacity]);
        data = temp;
        int size = 0;
    }

// a)
    public String toString(){
        String s = "";
        for (int i = 0; i < size; i++){
            s = s + data[i] + ", ";
        }
        return s;
    }

    // remove the element at position idx
    public void remove(int idx) {
        if (idx >= 0 && idx < size){
            for (int i = idx; i < size-1; i++) {
                data[i] = data[i+1];
            }
            size--;
        } else {
            throw new IndexOutOfBoundExcpetion();
        }
    }

    public E get(int idx) {
        if (idx >= 0 && idx < size) {
            return data[idx];
        } else {
            throw new IndexOutOfBoundExcpetion();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // HTWArrayList<String> htwArrayList = new HTWArrayList<String>();
        HTWArrayList<String> htwArrayList = new HTWArrayList<>(); // equivalent to line 59
        htwArrayList.add("King 0");
        htwArrayList.add("King 1");
        htwArrayList.add("King 2");
        htwArrayList.add("King 3");
        htwArrayList.add("King 4");

        HTWArrayList<Integer> integerHTWArrayList = new HTWArrayList<Integer>();
        integerHTWArrayList.add(42);
        integerHTWArrayList.add(4);
        integerHTWArrayList.add(2);

        for (int i = 0; i < htwArrayList.size(); i++) {
            System.out.println(htwArrayList.get(i));
        }
    }

