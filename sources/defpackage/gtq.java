package defpackage;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* renamed from: gtq reason: default package */
public final class gtq implements gtp {
    private final PublishSubject<Boolean> a = PublishSubject.a();
    private boolean b;

    public final void a(boolean z) {
        this.b = z;
        this.a.onNext(Boolean.valueOf(this.b));
    }

    public final boolean a() {
        return this.b;
    }

    public final Observable<Boolean> b() {
        return this.a;
    }
}
