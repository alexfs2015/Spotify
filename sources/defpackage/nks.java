package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.music.R;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderView;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderViewBehavior;
import com.spotify.paste.widgets.internal.PasteFrameLayout;

/* renamed from: nks reason: default package */
public final class nks extends gwh {
    public final PasteFrameLayout a;
    private final RecyclerView b;
    private final RecyclerView c;
    private final View d;
    private final rsv e;
    private final wzi<fyh> f;
    private final GlueHeaderLayout g;
    private final DefaultHomeHeaderView h;
    private final DefaultHomeHeaderViewBehavior i;
    private final nkr j;
    private final nkp k;

    public nks(Context context, GlueHeaderLayout glueHeaderLayout, nkr nkr, wzi<fyh> wzi, nlw nlw, i iVar, DefaultHomeHeaderView defaultHomeHeaderView, DefaultHomeHeaderViewBehavior defaultHomeHeaderViewBehavior, View view, rsv rsv, nkp nkp) {
        this.j = nkr;
        this.k = nkp;
        this.h = defaultHomeHeaderView;
        this.i = defaultHomeHeaderViewBehavior;
        this.f = wzi;
        this.d = view;
        this.e = rsv;
        this.b = a(context);
        this.b.setId(R.id.home_body);
        this.b.a(iVar);
        this.b.setOverScrollMode(2);
        this.c = b(context);
        this.g = glueHeaderLayout;
        this.g.e((View) this.b);
        this.g.addView(this.c, new d(-1, -1));
        this.a = new PasteFrameLayout(context);
        this.a.setId(R.id.hub_glue_header_layout_container);
        this.a.addView(this.g, new LayoutParams(-1, -1));
        g();
        nlw.a(this.b);
        nlw.a(this.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        float f3 = 1.0f - f2;
        ((fyh) this.f.get()).b(f3);
        this.d.setAlpha(f3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gxb gxb) {
        View a2 = gxb.a((ViewGroup) this.g);
        if (!(a2 instanceof GlueHeaderViewV2)) {
            g();
            return;
        }
        this.g.a((GlueHeaderViewV2) a2, new GlueHeaderV2Behavior(), false);
        this.g.e = (fyh) this.f.get();
        if (this.d.getParent() != null) {
            this.g.removeView(this.d);
        }
        this.h.a((fvu) null);
    }

    private void g() {
        this.g.a(this.h, this.i, true);
        this.h.a((fvu) new $$Lambda$nks$xZWBY83UmvDyUW0H8ZmNh1pI1Lg(this));
        if (this.d.getParent() == null) {
            this.g.addView(this.d, 0);
        }
        this.g.a(false);
    }

    public final void a(Parcelable parcelable) {
        nkr.a(this.g, this.b, this.c, parcelable);
    }

    public final void a(gxb gxb) {
        super.a(gxb);
        gxb.a((c) new $$Lambda$nks$Nz7DktkcnR0Zq3tu64_La36SDsk(this, gxb));
    }

    public final void a(hcj hcj) {
        this.e.a(this.d, hcj.bundle("gradient"));
    }

    public final Parcelable b() {
        GlueHeaderLayout glueHeaderLayout = this.g;
        RecyclerView recyclerView = this.b;
        RecyclerView recyclerView2 = this.c;
        Parcelable d2 = ((i) fbp.a(recyclerView.d())).d();
        Parcelable d3 = ((i) fbp.a(recyclerView2.d())).d();
        Parcelable onSaveInstanceState = glueHeaderLayout.onSaveInstanceState();
        boolean z = true;
        View e2 = glueHeaderLayout.e(true);
        if (e2 != null && e2.getTop() == 0) {
            z = false;
        }
        return new nko(d2, d3, onSaveInstanceState, z);
    }

    public final RecyclerView c() {
        return this.b;
    }

    public final RecyclerView d() {
        return this.c;
    }

    public final View e() {
        return this.a;
    }

    public final void f() {
        nkp.a(this.g, this.b);
    }
}
