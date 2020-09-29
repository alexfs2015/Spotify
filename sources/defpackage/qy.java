package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: qy reason: default package */
public final class qy implements qz {
    private final ViewGroupOverlay a;

    public qy(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public final void a(View view) {
        this.a.add(view);
    }

    public final void b(View view) {
        this.a.remove(view);
    }
}
