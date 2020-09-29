package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: jwe reason: default package */
public final class jwe<T> {
    private final jtt<T> a;

    public jwe(jtt<T> jtt) {
        this.a = jtt;
    }

    public final Observable<T> a(String str, String str2) {
        return a(str, str2).c((Function<? super T, ? extends R>) new $$Lambda$jwe$knHC1Qrxz0PuVaFYjIj2N438Juw<Object,Object>(str2));
    }

    public final Observable<Map<String, T>> a(String str, String... strArr) {
        return vun.b(wuh.a(this.a.a().a(str, strArr)));
    }
}
