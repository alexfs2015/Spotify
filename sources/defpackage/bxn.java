package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: bxn reason: default package */
public final class bxn {
    private static final b a = new bys();

    /* renamed from: bxn$a */
    public interface a<R extends btc, T> {
        T a(R r);
    }

    /* renamed from: bxn$b */
    public interface b {
        ApiException a(Status status);
    }

    public static <R extends btc> exz<Void> a(bsz<R> bsz) {
        return a(bsz, (a<R, T>) new byv<R,T>());
    }

    public static <R extends btc, T extends btb<R>> exz<T> a(bsz<R> bsz, T t) {
        return a(bsz, (a<R, T>) new byu<R,T>(t));
    }

    private static <R extends btc, T> exz<T> a(bsz<R> bsz, a<R, T> aVar) {
        b bVar = a;
        eya eya = new eya();
        bsz.a((defpackage.bsz.a) new byt(bsz, eya, aVar, bVar));
        return eya.a;
    }
}
