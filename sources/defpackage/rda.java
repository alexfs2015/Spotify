package defpackage;

import io.reactivex.Observable;

/* renamed from: rda reason: default package */
public final class rda implements a {
    private final fnz<rdd> a = fnz.a();

    public final void a(String str) {
        a(str, null);
    }

    public final void a(String str, String str2) {
        this.a.accept(rde.a(str, str2));
    }

    public final Observable<rdd> getObservable() {
        return this.a;
    }
}
