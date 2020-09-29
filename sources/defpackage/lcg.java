package defpackage;

import io.reactivex.subjects.BehaviorSubject;

/* renamed from: lcg reason: default package */
final class lcg implements lcj {
    final BehaviorSubject<Boolean> a = BehaviorSubject.a();

    public final void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }
}
