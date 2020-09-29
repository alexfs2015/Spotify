package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: mjy reason: default package */
public final class mjy extends a<u> implements gjl {
    private final View a;
    private final boolean d = true;
    private final jjf e;
    private final jrp f;
    private final String g;
    private final String h;
    private FrameLayout i;
    private boolean j;

    public final int b() {
        return 1;
    }

    public mjy(View view, boolean z, jjf jjf, jrp jrp, String str, String str2) {
        this.a = view;
        this.e = jjf;
        this.f = jrp;
        this.g = str;
        this.h = str2;
        this.a.setLayoutParams(new LayoutParams(-1, -2));
        a(true);
    }

    public final long b(int i2) {
        return (long) this.a.hashCode();
    }

    public final int a(int i2) {
        return this.a.hashCode();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        FrameLayout frameLayout = this.i;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.i = new FrameLayout(viewGroup.getContext());
        this.i.setLayoutParams(new LayoutParams(-1, -2));
        this.i.addView(this.a);
        return new u(this.i) {
        };
    }

    public final void a(u uVar, int i2) {
        uVar.o.setEnabled(this.d);
        if (!this.j) {
            jjf jjf = this.e;
            bf bfVar = new bf(null, "daily-mix-hub", this.g, null, 0, null, null, this.h, (double) this.f.a());
            jjf.a(bfVar);
            this.j = true;
        }
    }
}
