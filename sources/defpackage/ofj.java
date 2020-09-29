package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: ofj reason: default package */
public final class ofj {
    public final PublishSubject<Boolean> a = PublishSubject.a();

    public final void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }
}
