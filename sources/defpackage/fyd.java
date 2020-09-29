package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: fyd reason: default package */
final class fyd extends sa {
    private final View a;

    public final int b() {
        return 1;
    }

    public fyd(View view) {
        this.a = view;
    }

    public final Object a(ViewGroup viewGroup, int i) {
        if (this.a.getParent() != viewGroup) {
            viewGroup.addView(this.a);
        }
        return this.a;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(this.a);
    }

    public final boolean a(View view, Object obj) {
        return view == this.a;
    }
}
