package ss10_list_queue_javacollection.practice.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {
    /**
     * Số lượng phần tử có trong MyArrayList.
     */
    private int size = 0;
    /**
     * Sức chứa của MyArrayList.
     */
    private static final int DEFAULT_CAPACCITY = 10;
    /**
     * Mảng này dùng để chứa các phần tử.
     */
    Object elememts[];


    /**
     * Sức chứa mặc định khi khởi tạo bằng constructor không tham số.
     */
    public MyArrayList() {
        elememts = new Object[DEFAULT_CAPACCITY];
    }

    /**
     * Phương thức constructor với sức chứa được truyền vào.
     *
     * @param capacity
     */

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elememts = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity " + capacity);
        }
    }

    public int size() {
        return  this.size;
    }

    /**
     * Phương thức clear ArrayList.
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elememts.length; i++){
            elememts[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào MyArrayList
     * @param element
     * @return
     */
    public boolean add(E element){
        if (elememts.length == size){
            this.ensureCapacity(5);
        }
        elememts[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index){
        if (index > elememts.length){
            throw new IllegalArgumentException("index:" + index);
        } else if (elememts.length == size) {
            this.ensureCapacity(5);
        }

        if (elememts[index] == null) {
            elememts[index] = element;
            size++;
        } else {
            for (int i = size+1; i >= index; i--){
                elememts[i] = elememts[i-1];
            }
            elememts[index] = element;
            size++;
        }
    }

    /**
     * Phương thức tăng kích thước của MyArrayList
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0) {
            int newSize = this.elememts.length + minCapacity;
            elememts = Arrays.copyOf(elememts, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }

}
