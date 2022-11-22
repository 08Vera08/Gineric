import java.util.Random;

class MagicBox<T> {
    private int n;
    private T arr[];

    MagicBox(int n) {
        this.n = n;
        arr = (T[]) new Object[n];
    }

    boolean add(T item) {
        int k = -1;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == null) {
                k = i;
                break;
            }
        }
        if (k > -1) {
            arr[k] = item;
            return true;
        } else {
            return false;
        }
    }

    T pick() {
        int k = -1;
        for (int i = 0; i < this.n; ++i) {
            if (this.arr[i] == null) {
                k = i;
                break;
            }
        }
        if (k > -1) {
            throw new RuntimeException("Коробка еще не полна, свободых мест: " + Integer.toString(this.n - k));
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(this.n);
            return arr[randomInt];
        }
    }
}
