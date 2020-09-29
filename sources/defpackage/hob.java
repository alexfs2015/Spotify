package defpackage;

import rx.internal.operators.NotificationLite;

/* renamed from: hob reason: default package */
final class hob implements hod, lbs {
    final xog<Boolean> a = xog.a(Boolean.FALSE, true);

    public final void a() {
        this.a.onNext(Boolean.TRUE);
    }

    public final void b() {
        this.a.onNext(Boolean.FALSE);
    }

    public final boolean c() {
        Object obj = this.a.a.latest;
        return ((Boolean) (NotificationLite.d(obj) ? NotificationLite.e(obj) : null)).booleanValue();
    }
}
