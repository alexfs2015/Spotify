package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: qfk reason: default package */
public final class qfk extends sa {
    private final View a;

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final int b() {
        return 1;
    }

    public qfk(View view) {
        this.a = (View) fay.a(view);
    }

    public final Object a(ViewGroup viewGroup, int i) {
        viewGroup.addView(this.a);
        return this.a;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.a);
    }
}
