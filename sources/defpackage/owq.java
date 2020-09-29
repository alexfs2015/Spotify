package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.R;
import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper.Source;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Covers.Size;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import com.squareup.picasso.Picasso;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: owq reason: default package */
public final class owq extends c implements owp, oyn, a, a, a {
    private final ozi a;
    private final ozp b;
    private final oyq c;
    private final oys d;
    private final oyw e;
    private final oyu f;
    private final oww g;
    private final oyf h;
    private final oyk i;
    private final juf<uzx> j;
    private final oyo k;
    private final own l;
    private final wug m;
    private final rxt n;
    private final oyy o;
    private final rxg<uys, uzx, Policy> p;
    private final CompositeDisposable q = new CompositeDisposable();
    private boolean r;
    private boolean s;
    private int t = 100;
    private wuk u;
    private oye v;

    public owq(ozi ozi, ozp ozp, oyq oyq, oys oys, oyw oyw, oyu oyu, oww oww, oyf oyf, oyk oyk, juf<uzx> juf, rxj rxj, a aVar, oyo oyo, own own, wug wug, rxt rxt, String str, boolean z, boolean z2, oyy oyy) {
        a aVar2 = aVar;
        this.a = ozi;
        this.b = ozp;
        this.c = oyq;
        this.d = oys;
        this.e = oyw;
        this.f = oyu;
        this.g = oww;
        this.h = oyf;
        this.i = oyk;
        this.j = juf;
        this.k = oyo;
        this.l = own;
        this.m = wug;
        this.n = rxt;
        this.o = oyy;
        this.p = rxj.a(str, z, z2);
        aVar2.a(this);
        aVar2.a(this.a);
        aVar2.a(this.b);
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.t = bundle.getInt("range_length", 100);
        }
        this.g.a(bundle);
        owk owk = this.d.a;
        int i2 = bundle != null ? bundle.getInt("filter", 0) : 0;
        for (upp upp : owk.a) {
            if (i2 == upp.c) {
                owk.i = upp;
                upp.a = true;
            } else {
                upp.a = false;
            }
        }
        owk.i = (upp) jtc.a(owk.i, owk.k);
        oyq oyq = this.c;
        if (bundle != null) {
            oyq.c = bundle.getBoolean("scroll_position_restored", false);
        }
    }

    public final View a(LayoutInflater layoutInflater, Context context, ViewGroup viewGroup) {
        oye oye;
        LayoutInflater layoutInflater2 = layoutInflater;
        Context context2 = context;
        View a2 = this.g.a(context2, layoutInflater2, viewGroup);
        AppBarLayout a3 = this.g.a();
        oyf oyf = this.h;
        if (oyf.d || oyf.e || !oyf.f) {
            oxz oxz = oyf.b;
            oxy oxy = new oxy((LayoutInflater) oxz.a(LayoutInflater.from(oyf.a), 1), (Context) oxz.a(oyf.a, 2), (AppBarLayout) oxz.a(a3, 3), (Picasso) oxz.a(oxz.a.get(), 4), (oxu) oxz.a(oxz.b.get(), 5));
            oye = oxy;
        } else {
            oyc oyc = oyf.c;
            oye = new oyb((LayoutInflater) oyc.a(LayoutInflater.from(oyf.a), 1), (Context) oyc.a(oyf.a, 2), (AppBarLayout) oyc.a(a3, 3), (oxu) oyc.a(oyc.a.get(), 4));
        }
        this.v = oye;
        this.g.a(this.v);
        this.g.f();
        this.g.a((iqq) this.k);
        owk owk = this.d.a;
        b(owk.g.a(owk.h, owk.d, Lists.a((E[]) new SortOption[]{new SortOption(owk.f), new SortOption(owk.e)})));
        oys oys = this.d;
        oys.e = new upq(context2, layoutInflater2, oys.a.m);
        return a2;
    }

    public final void c() {
        i();
        oys oys = this.d;
        oys.a.c.add(oys);
    }

    public final void aP_() {
        oys oys = this.d;
        if (oys.e != null) {
            oys.e.a();
        }
        this.q.c();
    }

    public final void a(Bundle bundle) {
        bundle.putInt("range_length", this.t);
        bundle.putBoolean("scroll_position_restored", this.c.c);
        this.g.b(bundle);
        owk owk = this.d.a;
        if (owk.i != null) {
            bundle.putInt("filter", owk.i.c);
        }
    }

    private void i() {
        this.p.a(Integer.valueOf(0), Integer.valueOf(this.t));
        this.u = wud.a(vun.a((ObservableSource<T>) this.p.b(), BackpressureStrategy.BUFFER), this.l.a(), (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$8n9ieGVHn_LtcUTel_GvPuaLET4.INSTANCE).a(this.m).a((wun<? super T>) new $$Lambda$owq$QcJ_gToUFubsJc8ijxz79eak4A<Object>(this), (wun<Throwable>) new $$Lambda$owq$2rZ5y8QT6hPgyDXWd3H_OxiAc8<Throwable>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.j.a(th.getMessage());
    }

    /* access modifiers changed from: private */
    public void a(ho<uzx, tms> hoVar) {
        this.j.a(fay.a(hoVar.a));
        tms tms = (tms) fay.a(hoVar.b);
        if ((tms instanceof a) || (tms instanceof b)) {
            this.g.a((String) null, false);
            return;
        }
        c cVar = (c) tms;
        String str = cVar.a;
        this.g.a(str, cVar.b);
        this.g.a(str, (int) TimeUnit.MILLISECONDS.toSeconds(cVar.c));
    }

    public final void a(String str) {
        this.g.h();
    }

    public final void d() {
        this.g.b();
    }

    public final void g() {
        this.g.b();
    }

    public final void a(fyt fyt) {
        this.o.a(fyt, this.v);
    }

    public final void a(SortOption sortOption) {
        this.g.c();
        b(sortOption);
        hej.a(this.u);
        i();
    }

    public final void a(int i2) {
        this.t = i2;
        this.f.a.g = true;
        this.g.b();
        hej.a(this.u);
        i();
    }

    public final boolean h() {
        return this.s;
    }

    /* access modifiers changed from: private */
    public void a(rxs rxs) {
        this.v.a(rxs);
        this.g.b();
    }

    private void b(SortOption sortOption) {
        rxg<uys, uzx, Policy> rxg = this.p;
        ((rxi) rxg).l = true;
        rxg.a(false, this.d.a.a(), this.d.a.b());
        this.p.a(sortOption);
    }

    public final void a() {
        hej.a(this.u);
        oys oys = this.d;
        oys.a.c.remove(oys);
    }

    public final void a(uzx uzx, Context context) {
        Uri uri;
        boolean z = false;
        if (!this.r) {
            Show a2 = uzx.a();
            Covers b2 = a2.b();
            if (b2 == null) {
                uri = Uri.EMPTY;
            } else {
                uri = Uri.parse(b2.getImageUri(Size.LARGE));
            }
            Uri uri2 = uri;
            String c2 = a2.c();
            oyh oyh = new oyh(a2.a(), c2, twn.a(a2.f()), !fax.a(c2) ? twn.a(context.getString(R.string.show_header_description_by_publisher, new Object[]{c2})).toUpperCase(jrq.a(context)) : "", uri2);
            this.v.a((oyj) oyh);
            Uri e2 = oyh.e();
            CompositeDisposable compositeDisposable = this.q;
            rxt rxt = this.n;
            compositeDisposable.a(new rxr(rxt.a, rxt.b, e2).a().a((Consumer<? super T>) new $$Lambda$owq$ZhKfFSl8zN_l2g7DxxG_DzP2eg<Object>(this), (Consumer<? super Throwable>) $$Lambda$owq$2FtEl6ejiBul4ksC6T55oXgSUc.INSTANCE));
            this.g.a(oyh.a());
            this.r = true;
        }
        if (((uys[]) uzx.getItems()).length == 0) {
            this.g.i();
        }
        this.o.a(uzx.a());
        tur tur = new tur(new ArrayList(6), (uys[]) uzx.getItems(), new ArrayList(3));
        Show a3 = uzx.a();
        oyw oyw = this.e;
        if (!oyw.c && !oyw.d && oyw.e) {
            oyw.b.a = a3.getUri();
            oyw.b.b = a3.a();
            oyw.b.c = a3.g();
            oyw.a.a = a3.f();
            oyw.a.b = a3.c();
            tur.a(oyw.b);
            tur.a(oyw.a);
        }
        ozi ozi = this.a;
        if (ozi.b) {
            ozi.a(ozi.a(uzx.d()), Source.CREATOR_EXTENSION);
        }
        tur.a(ozi.a);
        ozp ozp = this.b;
        if (ozp.b) {
            tur.a(ozp.a);
        }
        oyq oyq = this.c;
        if (oyq.b) {
            oyq.a(uzx, tur);
        }
        oys oys = this.d;
        if (!oys.f) {
            oys.e.a(oys.a.a);
            owk owk = oys.a;
            ConsumptionOrder j2 = uzx.a().j();
            owk.b.clear();
            if (j2 == ConsumptionOrder.SEQUENTIAL) {
                owk.b.add(new SortOption(owk.f));
                owk.j = owk.g.a(owk.h, owk.f, owk.b);
            } else {
                owk.b.add(new SortOption(owk.e));
                owk.j = owk.g.a(owk.h, owk.e, owk.b);
            }
            oys.e.a(oys.a.b, oys.a.j);
            oys.f = true;
        }
        oys.a(uzx);
        oys.b();
        if (oys.a.c()) {
            oys.c.g = true;
        } else if (uzx.getUnrangedLength() == 0) {
            oys.c.g = false;
            oys.d.g = true;
        } else {
            oys.c.g = false;
            oys.d.g = false;
        }
        tur.a(oys.b);
        tur.b(oys.c);
        tur.b(oys.d);
        oyu oyu = this.f;
        tur.b(oyu.a);
        oyu.a.g = false;
        this.g.a(tur);
        oyq oyq2 = this.c;
        if (!oyq2.b && !oyq2.c) {
            oyq2.c = true;
            if (a3.j() != ConsumptionOrder.RECENT) {
                String d2 = a3.d();
                if (!fax.a(d2) && a3.g() && !fax.a(d2)) {
                    oyq2.a.d();
                    oyq2.a.b(d2);
                }
            }
        }
        if (uzx.getUnrangedLength() > ((uys[]) uzx.getItems()).length) {
            z = true;
        }
        this.s = z;
        this.g.e();
        this.g.g();
    }
}
