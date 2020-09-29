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

/* renamed from: nfd reason: default package */
public final class nfd extends guh {
    public final PasteFrameLayout a;
    private final RecyclerView b;
    private final RecyclerView c;
    private final View d;
    private final rjp e;
    private final wlc<fxn> f;
    private final GlueHeaderLayout g;
    private final DefaultHomeHeaderView h;
    private final DefaultHomeHeaderViewBehavior i;
    private final nfc j;
    private final nfa k;

    public nfd(Context context, GlueHeaderLayout glueHeaderLayout, nfc nfc, wlc<fxn> wlc, ngh ngh, i iVar, DefaultHomeHeaderView defaultHomeHeaderView, DefaultHomeHeaderViewBehavior defaultHomeHeaderViewBehavior, View view, rjp rjp, nfa nfa) {
        this.j = nfc;
        this.k = nfa;
        this.h = defaultHomeHeaderView;
        this.i = defaultHomeHeaderViewBehavior;
        this.f = wlc;
        this.d = view;
        this.e = rjp;
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
        ngh.a(this.b);
        ngh.a(this.c);
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

    public final void a(gvb gvb) {
        super.a(gvb);
        gvb.a((c) new $$Lambda$nfd$36K_ZIsjZZefGRbk2pZZPBRDyj4(this, gvb));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(gvb gvb) {
        View a2 = gvb.a((ViewGroup) this.g);
        if (!(a2 instanceof GlueHeaderViewV2)) {
            g();
            return;
        }
        this.g.a((GlueHeaderViewV2) a2, new GlueHeaderV2Behavior(), false);
        this.g.e = (fxn) this.f.get();
        if (this.d.getParent() != null) {
            this.g.removeView(this.d);
        }
        this.h.a((fva) null);
    }

    public final Parcelable b() {
        GlueHeaderLayout glueHeaderLayout = this.g;
        RecyclerView recyclerView = this.b;
        RecyclerView recyclerView2 = this.c;
        Parcelable d2 = ((i) fay.a(recyclerView.d())).d();
        Parcelable d3 = ((i) fay.a(recyclerView2.d())).d();
        Parcelable onSaveInstanceState = glueHeaderLayout.onSaveInstanceState();
        boolean z = true;
        View e2 = glueHeaderLayout.e(true);
        if (e2 != null && e2.getTop() == 0) {
            z = false;
        }
        return new nez(d2, d3, onSaveInstanceState, z);
    }

    public final void a(Parcelable parcelable) {
        nfc.a(this.g, this.b, this.c, parcelable);
    }

    public final void a(gzq gzq) {
        this.e.a(this.d, gzq.bundle("gradient"));
    }

    public final void f() {
        nfa.a(this.g, this.b);
    }

    private void g() {
        this.g.a(this.h, this.i, true);
        this.h.a((fva) new $$Lambda$nfd$Z1IYba6TL77RlNWtr7Lj5tL__I(this));
        if (this.d.getParent() == null) {
            this.g.addView(this.d, 0);
        }
        this.g.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(float f2) {
        float f3 = 1.0f - f2;
        ((fxn) this.f.get()).b(f3);
        this.d.setAlpha(f3);
    }
}
