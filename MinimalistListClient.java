package lab03_duyanhng_haluu;

//3-3 
//a)
public class MinimalistListClient {

    public int getMinimum(MinimalistList<Integer> list) {
        if(list.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        int min = Integer.MAX_VALUE;
        while(!list.isEmpty()) {
            int current = list.getFirst();
            if (current < min) {
                min = current;
            }
            list = list.tail();
            
        } 
        return min;
    }

    public int getSize(MinimalistList<Integer> list) {
        int count = 0;
        while(!list.isEmpty()){
            count++;
            list = list.tail();
        }
        return count;
    }

    public static void main(String[] args) {
        MinimalistList<Integer> intList = new MinimalistList<>();
        intList.addFirst(42);
        intList.addFirst(21);
        intList.addFirst(1);
        intList.addFirst(81);

        MinimalistListClient client = new MinimalistListClient();

        System.out.println(client.getMinimum(intList));
        System.out.println(client.getSize(intList));

    }
}
