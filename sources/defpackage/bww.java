package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: bww reason: default package */
public final class bww {
    private static final b a = new byb();

    /* renamed from: bww$a */
    public interface a<R extends bsl, T> {
        T a(R r);
    }

    /* renamed from: bww$b */
    public interface b {
        ApiException a(Status status);
    }

    private static <R extends bsl, T> exi<T> a(bsi<R> bsi, a<R, T> aVar) {
        b bVar = a;
        exj exj = new exj();
        bsi.a((defpackage.bsi.a) new byc(bsi, exj, aVar, bVar));
        return exj.a;
    }

    public static <R extends bsl, T extends bsk<R>> exi<T> a(bsi<R> bsi, T t) {
        return a(bsi, (a<R, T>) new byd<R,T>(t));
    }

    public static <R extends bsl> exi<Void> a(bsi<R> bsi) {
        return a(bsi, (a<R, T>) new bye<R,T>());
    }
}
