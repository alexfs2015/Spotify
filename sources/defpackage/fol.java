package defpackage;

import android.os.Looper;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;

/* renamed from: fol reason: default package */
public final class fol {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean a(Observer<?> observer) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        observer.onSubscribe(Disposables.a());
        StringBuilder sb = new StringBuilder("Expected to be called on the main thread but was ");
        sb.append(Thread.currentThread().getName());
        observer.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
