//получить элемент по индексу
//вставить элемент
//удалить элемент по индексу
//очистить список
//узнать пустой ли список (возвращает булеан)
//узнать есть ли в списке элемент (возвращает булеан)

import java.util.Arrays;

public class ArrayList {

    private static final int INITIAL_LENGTH = 10;
    private int[] list;
    public int length;

    public ArrayList() {
        createNewList(INITIAL_LENGTH);
    }

    public ArrayList(int len) {
        createNewList(len);
    }

    // получение по индексу
    public int get(int index) {
        if (index >= list.length) {
            throw new IndexOutOfBoundsException("There's no such index.");
        }
        return list[index];
    }

    // вставка элемента
    public void put(int elem) {
        if (length == list.length) {
            expandList();
        }
        list[length] = elem;
        length++;
    }

    // удаление по индексу
    public void remove(int index) {
        if (index >= list.length) {
            throw new IndexOutOfBoundsException("There's no such index.");
        }
        int[] temp = new int[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i == index) {
                j--;
                continue;
            }
            temp[j] = list[i];
        }
        list = temp;
        length--;
    }

    // очистка списка
    public void clear() {
        createNewList(INITIAL_LENGTH);
    }

    // проверка на пустой
    public boolean isEmpty() {
        return length == 0;
    }

    // содержит ли элемент
    public boolean contains(int elem) {
        return Arrays.binarySearch(list, elem) >= 0;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(list[i]);
        }
    }

    private void createNewList(int len) {
        list = new int[len];
        length = 0;
    }

    private void expandList() {
        int len = length + (length / 2);
        list = Arrays.copyOf(list, len);
    }
}
