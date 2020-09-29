package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import java.util.Map;

/* renamed from: krj reason: default package */
public final class krj {
    /* access modifiers changed from: private */
    public static Observable<krc> a(krn krn, String str, String str2, long j, Map<String, String> map) {
        return krn.a.a(str, str2, j, map).a(krc.a(str)).g(new $$Lambda$krj$kQQM82yM35Fa8CQK6oEiZ7wYWKw(str)).d();
    }

    public static ObservableTransformer<e, krc> a(krn krn) {
        return new $$Lambda$krj$IDRpDEg2SpbLrm1WaQZQuKN8w(krn);
    }

    public static ObservableTransformer<d, krc> b(krn krn) {
        return new $$Lambda$krj$l39kXSA5PGJjZFjMWYWgmmEZ1z4(krn);
    }
}
