package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* renamed from: poj reason: default package */
public final class poj {
    private static final PublishSubject<por> a = PublishSubject.a();

    poj() {
    }

    public static Observable<por> a() {
        return a;
    }

    public static void a(String str) {
        a.onNext(new a(str));
    }
}
