package bt1_MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Thêm 1 phần tử vào cuối của danh sách
    // Thêm phần tử cần thêm vào danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = e;
    }


    //Cài đặt phương thức Get()
    //Phương thuc get() trả về phần tử vừa ở vị trí thứ i trong danh sách
    //Tham số đầu vào : số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index : " + i + ",Size : " + i);
        }
        return (E) elements[i];
    }

    // Xóa phần tu
    public E remove(int index) {
        Object temp = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements = Arrays.copyOf(elements, elements.length - 1);
        return (E) temp;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                size++;
            }
        }
        return size;
    }

    public E clone() {
        Object[] temp = new Object[size()];
        for (int i = 0; i < size(); i++) {
            temp[i] = elements[i];
        }
        return (E) temp;

    }
    public boolean contains(Object o) {
        for (int i = 0; i < size(); i++) {
            if(elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(Object o) {
        int index = 0;
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }

    public void clear(){
        elements = Arrays.copyOf(elements, 0);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
