package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: rq reason: default package */
final class rq implements rr {
    private final WindowId a;

    rq(View view) {
        this.a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rq) && ((rq) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
