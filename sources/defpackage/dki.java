package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: dki reason: default package */
public final class dki implements dlr {
    private WeakReference<duc> a;

    public dki(duc duc) {
        this.a = new WeakReference<>(duc);
    }

    public final View a() {
        duc duc = (duc) this.a.get();
        if (duc != null) {
            return duc.l();
        }
        return null;
    }

    public final boolean b() {
        return this.a.get() == null;
    }

    public final dlr c() {
        return new dkk((duc) this.a.get());
    }
}
