package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: ome reason: default package */
public final class ome {
    public final PublishSubject<Boolean> a = PublishSubject.a();
    public final PublishSubject<Boolean> b = PublishSubject.a();

    public final void a() {
        this.a.onNext(Boolean.TRUE);
    }

    public final void b() {
        this.b.onNext(Boolean.TRUE);
    }
}
