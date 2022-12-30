package etc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Something {
    static class Printer {
        public void print() {
            System.out.println("something to print...");
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        ReferenceQueue<Printer> printerReferenceQueue = new ReferenceQueue<>();
        PhantomReference<Printer> weakReference = new PhantomReference<>(printer, printerReferenceQueue);
        weakReference.get().print();
        printer = null;
        System.gc();

        weakReference.get().print();
    }
}
