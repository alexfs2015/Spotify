package rx.internal.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.CompositeException;

public enum ExceptionsUtils {
    ;
    
    private static final Throwable a = null;

    static {
        a = new Throwable("Terminated");
    }

    public static Throwable a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    public static boolean a(Throwable th) {
        return th == a;
    }

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).exceptions);
                arrayList.add(th);
                th3 = new CompositeException(arrayList, 0);
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }
}
