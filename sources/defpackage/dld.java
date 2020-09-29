package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: dld reason: default package */
public final class dld implements dmi {
    private final WeakReference<View> a;
    private final WeakReference<clq> b;

    public dld(View view, clq clq) {
        this.a = new WeakReference<>(view);
        this.b = new WeakReference<>(clq);
    }

    public final View a() {
        return (View) this.a.get();
    }

    public final boolean b() {
        return this.a.get() == null || this.b.get() == null;
    }

    public final dmi c() {
        return new dlc((View) this.a.get(), (clq) this.b.get());
    }
}
