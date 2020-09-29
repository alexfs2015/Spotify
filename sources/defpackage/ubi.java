package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: ubi reason: default package */
public final class ubi implements kkn<ubf> {
    public final PublishSubject<ubf> a = PublishSubject.a();

    /* renamed from: a */
    public final void accept(ubf ubf) {
        this.a.onNext(ubf);
    }
}
