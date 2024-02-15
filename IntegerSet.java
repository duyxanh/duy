package lab03_duyanhng_haluu;

// 3-5
public class IntegerSet {
    private int capacity = 1;
    private int[] values = new int[capacity];
    private int size = 0;

    private void extendArray() {
        int[] temp = new int[this.capacity * 2];
        System.arraycopy(this.values, 0, temp, 0, this.capacity);
        this.capacity = this.capacity * 2;
        this.values = temp;
    }

    public void add(int e) {
        if (this.contains(e)) {
            return;
        }
        if (this.size == this.capacity) { //extending  the array for bigger capacity
            this.extendArray();
        }
        this.values[this.size] = e;
        this.size++;
    }

    public void remove(int e) {
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] == e) {
                // we need to remove the element at the position i
                for (int j = i; j < this.values.length-1; j++) {
                    this.values[j] = this.values[j+1];
                }
                // and then adjust size and return
                size--;
                return;
            }
        }
    }

    public boolean contains(int e) {
        for (int i = 0; i < this.size; i++) {
            if (this.values[i] == e) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IntegerSet set =new IntegerSet();
        set.add(10);
        System.out.println(Arrays.toString(set.values));
        set.add(10);
        System.out.println(Arrays.toString(set.values));
        set.add(20);
        System.out.println(Arrays.toString(set.values));
        set.remove(10);
        System.out.println(Arrays.toString(set.values));
        set.add(30);
        System.out.println(Arrays.toString(set.values));
        System.out.println(set.contains(10));
        System.out.println(set.contains(20));
        System.out.println(set.contains(2));
    }
}
