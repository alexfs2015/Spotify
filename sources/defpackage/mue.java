package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: mue reason: default package */
final class mue extends m {
    mue() {
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        i d = recyclerView.d();
        if (d != null) {
            float f = ((float) d.u) / 2.0f;
            int i3 = 0;
            while (i3 < d.r()) {
                View g = d.g(i3);
                if (g != null) {
                    g.setScaleY(((Math.min(f, Math.abs(f - (((float) (d.m(g) + d.k(g))) / 2.0f))) * -0.1f) / f) + 1.0f);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }
}
