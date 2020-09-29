package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: udh reason: default package */
public final class udh implements kkn<udd> {
    final PublishSubject<udd> a = PublishSubject.a();

    /* renamed from: a */
    public final void accept(udd udd) {
        this.a.onNext(udd);
    }
}
