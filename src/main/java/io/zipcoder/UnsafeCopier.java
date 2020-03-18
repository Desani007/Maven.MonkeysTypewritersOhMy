package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {

        super(toCopy);
    }

    public void run() {
        String s="";
        while (stringIterator.hasNext()) {

            s = stringIterator.next();
            this.copied += s;

        }
        for(int i = 0; i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+ i);
    }
    }
}
