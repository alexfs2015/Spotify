package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: qon reason: default package */
public final class qon extends sf {
    private final View a;

    public qon(View view) {
        this.a = (View) fbp.a(view);
    }

    public final Object a(ViewGroup viewGroup, int i) {
        viewGroup.addView(this.a);
        return this.a;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.a);
    }

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final int b() {
        return 1;
    }
}
