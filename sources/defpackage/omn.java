package defpackage;

import io.reactivex.subjects.PublishSubject;

/* renamed from: omn reason: default package */
public final class omn {
    public final PublishSubject<Boolean> a = PublishSubject.a();

    public final void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }
}
