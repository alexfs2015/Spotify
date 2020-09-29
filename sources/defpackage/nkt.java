package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderView;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderViewBehavior;

/* renamed from: nkt reason: default package */
public final class nkt implements wig<nks> {
    private final wzi<Context> a;
    private final wzi<GlueHeaderLayout> b;
    private final wzi<nkr> c;
    private final wzi<fyh> d;
    private final wzi<nlw> e;
    private final wzi<i> f;
    private final wzi<DefaultHomeHeaderView> g;
    private final wzi<DefaultHomeHeaderViewBehavior> h;
    private final wzi<View> i;
    private final wzi<rsv> j;
    private final wzi<nkp> k;

    private nkt(wzi<Context> wzi, wzi<GlueHeaderLayout> wzi2, wzi<nkr> wzi3, wzi<fyh> wzi4, wzi<nlw> wzi5, wzi<i> wzi6, wzi<DefaultHomeHeaderView> wzi7, wzi<DefaultHomeHeaderViewBehavior> wzi8, wzi<View> wzi9, wzi<rsv> wzi10, wzi<nkp> wzi11) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
    }

    public static nkt a(wzi<Context> wzi, wzi<GlueHeaderLayout> wzi2, wzi<nkr> wzi3, wzi<fyh> wzi4, wzi<nlw> wzi5, wzi<i> wzi6, wzi<DefaultHomeHeaderView> wzi7, wzi<DefaultHomeHeaderViewBehavior> wzi8, wzi<View> wzi9, wzi<rsv> wzi10, wzi<nkp> wzi11) {
        nkt nkt = new nkt(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11);
        return nkt;
    }

    public final /* synthetic */ Object get() {
        nks nks = new nks((Context) this.a.get(), (GlueHeaderLayout) this.b.get(), (nkr) this.c.get(), this.d, (nlw) this.e.get(), (i) this.f.get(), (DefaultHomeHeaderView) this.g.get(), (DefaultHomeHeaderViewBehavior) this.h.get(), (View) this.i.get(), (rsv) this.j.get(), (nkp) this.k.get());
        return nks;
    }
}
