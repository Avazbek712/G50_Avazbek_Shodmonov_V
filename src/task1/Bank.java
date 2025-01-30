package task1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    static int balance = 0;
    Lock lock = new ReentrantLock();

    public void increaseBalance() {
        try {
            lock.lock();
            balance++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printBalance() {
        System.out.println(balance);
    }
}
