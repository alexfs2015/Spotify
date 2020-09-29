package defpackage;

import rx.internal.operators.NotificationLite;

/* renamed from: hlj reason: default package */
final class hlj implements hll, kyj {
    final xac<Boolean> a = xac.a(Boolean.FALSE, true);

    public final void a() {
        this.a.onNext(Boolean.TRUE);
    }

    public final void b() {
        this.a.onNext(Boolean.FALSE);
    }

    public final boolean c() {
        Object obj;
        Object obj2 = this.a.a.latest;
        if (NotificationLite.d(obj2)) {
            obj = NotificationLite.e(obj2);
        } else {
            obj = null;
        }
        return ((Boolean) obj).booleanValue();
    }
}
