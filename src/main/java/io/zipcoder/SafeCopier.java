package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier  {
    String toCopy;

    public SafeCopier(String toCopy) {
        super(toCopy);
        this.toCopy = toCopy;
    }

    public  synchronized  void run() {
        String s="";
        while (stringIterator.hasNext()) {

           s = stringIterator.next();
            this.copied += s;

        }
        for(int i = 0; i<5;i++) {

            System.out.println(Thread.currentThread().getName()+ i);
        }
    }
}
