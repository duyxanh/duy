package lab03_duyanhng_haluu;

public interface HTWList<E> {
    public void add(E obj);
    public void remove(int idx);
    public int size();
    public boolean isEmpty();
    public E get(int i);
   
// 3-2 b)
    public void clear();
}
