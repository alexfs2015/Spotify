package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: mor reason: default package */
public final class mor extends a<u> implements gkw {
    private final View a;
    private final boolean d = true;
    private final jlr e;
    private final jtz f;
    private final String g;
    private final String h;
    private FrameLayout i;
    private boolean j;

    public mor(View view, boolean z, jlr jlr, jtz jtz, String str, String str2) {
        this.a = view;
        this.e = jlr;
        this.f = jtz;
        this.g = str;
        this.h = str2;
        this.a.setLayoutParams(new LayoutParams(-1, -2));
        a(true);
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
            jlr jlr = this.e;
            be beVar = new be(null, "daily-mix-hub", this.g, null, 0, null, null, this.h, (double) this.f.a());
            jlr.a(beVar);
            this.j = true;
        }
    }

    public final int b() {
        return 1;
    }

    public final long b(int i2) {
        return (long) this.a.hashCode();
    }
}
