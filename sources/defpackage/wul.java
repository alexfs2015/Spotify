package defpackage;

import java.util.HashSet;
import java.util.List;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.OnErrorThrowable;

/* renamed from: wul reason: default package */
public final class wul {
    public static RuntimeException a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    public static void b(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i2;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    public static Throwable c(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    public static void a(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new CompositeException(list, 0);
            }
        }
    }

    public static void a(Throwable th, wue<?> wue, Object obj) {
        b(th);
        wue.onError(OnErrorThrowable.a(th, obj));
    }

    public static void a(Throwable th, wue<?> wue) {
        b(th);
        wue.onError(th);
    }
}
