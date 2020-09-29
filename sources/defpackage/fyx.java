package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: fyx reason: default package */
final class fyx extends sf {
    private final View a;

    public fyx(View view) {
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

    public final int b() {
        return 1;
    }
}
