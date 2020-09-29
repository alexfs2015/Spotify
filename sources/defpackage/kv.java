package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;

/* renamed from: kv reason: default package */
public final class kv implements lm {
    public ln a = null;

    public final Lifecycle Y_() {
        b();
        return this.a;
    }

    public final void a(Event event) {
        this.a.a(event);
    }

    public final void b() {
        if (this.a == null) {
            this.a = new ln(this);
        }
    }
}
