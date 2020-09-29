package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: rd reason: default package */
public final class rd implements re {
    private final ViewGroupOverlay a;

    public rd(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(View view) {
        this.a.add(view);
    }

    public final void b(View view) {
        this.a.remove(view);
    }
}
