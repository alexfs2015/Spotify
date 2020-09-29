package defpackage;

import io.reactivex.subjects.BehaviorSubject;

/* renamed from: kyx reason: default package */
final class kyx implements kza {
    final BehaviorSubject<Boolean> a = BehaviorSubject.a();

    public final void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }
}
