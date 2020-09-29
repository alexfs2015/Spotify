package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* renamed from: pxf reason: default package */
public final class pxf {
    private static final PublishSubject<pxn> a = PublishSubject.a();

    pxf() {
    }

    public static Observable<pxn> a() {
        return a;
    }

    public static void a(String str) {
        a.onNext(new a(str));
    }
}
