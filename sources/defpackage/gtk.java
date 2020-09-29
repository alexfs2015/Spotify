package defpackage;

import io.reactivex.subjects.BehaviorSubject;

/* renamed from: gtk reason: default package */
public final class gtk {
    public final BehaviorSubject<Boolean> a = BehaviorSubject.a();
    public boolean b;

    public final void a(boolean z) {
        this.b = z;
        this.a.onNext(Boolean.valueOf(this.b));
    }
}
