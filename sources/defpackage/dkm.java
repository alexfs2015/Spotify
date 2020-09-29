package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: dkm reason: default package */
public final class dkm implements dlr {
    private final WeakReference<View> a;
    private final WeakReference<ckz> b;

    public dkm(View view, ckz ckz) {
        this.a = new WeakReference<>(view);
        this.b = new WeakReference<>(ckz);
    }

    public final View a() {
        return (View) this.a.get();
    }

    public final boolean b() {
        return this.a.get() == null || this.b.get() == null;
    }

    public final dlr c() {
        return new dkl((View) this.a.get(), (ckz) this.b.get());
    }
}
