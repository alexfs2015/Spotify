package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: kq reason: default package */
public final class kq implements lh {
    public li a = null;

    public final void b() {
        if (this.a == null) {
            this.a = new li(this);
        }
    }

    public final Lifecycle Y_() {
        b();
        return this.a;
    }

    public final void a(Event event) {
        this.a.a(event);
    }
}
