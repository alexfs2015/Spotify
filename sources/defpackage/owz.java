package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: owz reason: default package */
public final class owz extends sa {
    private final List<View> a;
    private final boolean b;

    public owz(List<View> list, boolean z) {
        if (!list.isEmpty()) {
            this.a = list;
            this.b = z;
            return;
        }
        throw new IllegalArgumentException("List of views must not be empty.");
    }

    private int a(int i) {
        return this.b ? d() - i : i;
    }

    public final int b() {
        return this.a.size();
    }

    public final Object a(ViewGroup viewGroup, int i) {
        View view = (View) this.a.get(a(i));
        if (view.getParent() != viewGroup) {
            viewGroup.addView(view);
        }
        return view;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) this.a.get(a(i)));
    }

    public final boolean a(View view, Object obj) {
        return view.equals(obj);
    }

    public final int a(Object obj) {
        if (!(obj instanceof View)) {
            return -1;
        }
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return indexOf;
        }
        return a(indexOf);
    }

    public final int d() {
        if (this.b) {
            return b() - 1;
        }
        return 0;
    }
}
