package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderView;
import com.spotify.music.features.home.common.viewbinder.DefaultHomeHeaderViewBehavior;

/* renamed from: nfe reason: default package */
public final class nfe implements vua<nfd> {
    private final wlc<Context> a;
    private final wlc<GlueHeaderLayout> b;
    private final wlc<nfc> c;
    private final wlc<fxn> d;
    private final wlc<ngh> e;
    private final wlc<i> f;
    private final wlc<DefaultHomeHeaderView> g;
    private final wlc<DefaultHomeHeaderViewBehavior> h;
    private final wlc<View> i;
    private final wlc<rjp> j;
    private final wlc<nfa> k;

    private nfe(wlc<Context> wlc, wlc<GlueHeaderLayout> wlc2, wlc<nfc> wlc3, wlc<fxn> wlc4, wlc<ngh> wlc5, wlc<i> wlc6, wlc<DefaultHomeHeaderView> wlc7, wlc<DefaultHomeHeaderViewBehavior> wlc8, wlc<View> wlc9, wlc<rjp> wlc10, wlc<nfa> wlc11) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
    }

    public static nfe a(wlc<Context> wlc, wlc<GlueHeaderLayout> wlc2, wlc<nfc> wlc3, wlc<fxn> wlc4, wlc<ngh> wlc5, wlc<i> wlc6, wlc<DefaultHomeHeaderView> wlc7, wlc<DefaultHomeHeaderViewBehavior> wlc8, wlc<View> wlc9, wlc<rjp> wlc10, wlc<nfa> wlc11) {
        nfe nfe = new nfe(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return nfe;
    }

    public final /* synthetic */ Object get() {
        nfd nfd = new nfd((Context) this.a.get(), (GlueHeaderLayout) this.b.get(), (nfc) this.c.get(), this.d, (ngh) this.e.get(), (i) this.f.get(), (DefaultHomeHeaderView) this.g.get(), (DefaultHomeHeaderViewBehavior) this.h.get(), (View) this.i.get(), (rjp) this.j.get(), (nfa) this.k.get());
        return nfd;
    }
}
