package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: jym reason: default package */
public final class jym<T> {
    private final jwb<T> a;

    public jym(jwb<T> jwb) {
        this.a = jwb;
    }

    public final Observable<T> a(String str, String str2) {
        return a(str, str2).c((Function<? super T, ? extends R>) new $$Lambda$jym$6Z9cBY0vDKFtDvB2miM34YjKBnc<Object,Object>(str2));
    }

    public final Observable<Map<String, T>> a(String str, String... strArr) {
        return wit.b(xim.a(this.a.a().a(str, strArr)));
    }
}
