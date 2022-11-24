import java.util.Random;

class MagicBox<T> {
    private int size;
    private T arr[];

    MagicBox(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
    }

    boolean add(T item) {
        int counter = -1;
        for (int i = 0; i < size; ++i) {
            if (arr[i] == null) {
                counter = i;
                break;
            }
        }
        if (counter > -1) {
            arr[counter] = item;
            return true;
        } else {
            return false;
        }
    }

    T pick() {
        int counter = -1;
        for (int i = 0; i < this.size; ++i) {
            if (this.arr[i] == null) {
                counter = i;
                break;
            }
        }
        if (counter > -1) {
            throw new RuntimeException("Коробка еще не полна, свободых мест: " + Integer.toString(this.size - counter));
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(this.size);
            return arr[randomInt];
        }
    }
}
