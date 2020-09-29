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

/* renamed from: ped reason: default package */
public final class ped extends c implements pec, a, a, a, sig {
    private final pgr a;
    private final pgy b;
    private final pfz c;
    private final pgb d;
    private final pgf e;
    private final pgd f;
    private final pej g;
    private final pfr h;
    private final pfw i;
    private final jwn<vml> j;
    private final sih k;
    private final pea l;
    private final xil m;
    private final shd n;
    private final pgh o;
    private final sgq<vkv, vml, Policy> p;
    private final CompositeDisposable q = new CompositeDisposable();
    private boolean r;
    private boolean s;
    private int t;
    private xip u;
    private pfq v;

    public ped(pgr pgr, pgy pgy, pfz pfz, pgb pgb, pgf pgf, pgd pgd, pej pej, pfr pfr, pfw pfw, jwn<vml> jwn, sgt sgt, a aVar, sih sih, pea pea, xil xil, shd shd, String str, boolean z, boolean z2, int i2, pgh pgh) {
        a aVar2 = aVar;
        this.a = pgr;
        this.b = pgy;
        this.c = pfz;
        this.d = pgb;
        this.e = pgf;
        this.f = pgd;
        this.g = pej;
        this.h = pfr;
        this.i = pfw;
        this.j = jwn;
        this.k = sih;
        this.l = pea;
        this.m = xil;
        this.n = shd;
        this.o = pgh;
        this.p = sgt.a(str, z, z2);
        this.t = i2;
        aVar2.a(this);
        aVar2.a(this.a);
        aVar2.a(this.b);
    }

    /* access modifiers changed from: private */
    public void a(ho<vml, tyn> hoVar) {
        this.j.a(fbp.a(hoVar.a));
        tyn tyn = (tyn) fbp.a(hoVar.b);
        if ((tyn instanceof a) || (tyn instanceof b)) {
            this.g.a((String) null, false);
            return;
        }
        c cVar = (c) tyn;
        String str = cVar.a;
        this.g.a(str, cVar.b);
        this.g.a(str, (int) TimeUnit.MILLISECONDS.toSeconds(cVar.c));
    }

    /* access modifiers changed from: private */
    public void a(shc shc) {
        this.v.a(shc);
        this.g.b();
    }

    private void b(SortOption sortOption) {
        sgq<vkv, vml, Policy> sgq = this.p;
        ((sgs) sgq).l = true;
        sgq.a(false, this.d.a.a(), this.d.a.b());
        this.p.a(sortOption);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.j.a(th.getMessage());
    }

    private void i() {
        this.p.a(Integer.valueOf(0), Integer.valueOf(this.t));
        this.u = xii.a(wit.a((ObservableSource<T>) this.p.b(), BackpressureStrategy.BUFFER), this.l.a(), (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$QXf2eQfaVXQlvxb_DwVwx7cC0tU.INSTANCE).a(this.m).a((xis<? super T>) new $$Lambda$ped$HMZ4zkHakMMtCNOUtvdSk1iUk_Y<Object>(this), (xis<Throwable>) new $$Lambda$ped$TbYftTyEv8UTOgedpzEm7RjoCCI<Throwable>(this));
    }

    public final View a(LayoutInflater layoutInflater, Context context, ViewGroup viewGroup) {
        pfq pfq;
        LayoutInflater layoutInflater2 = layoutInflater;
        Context context2 = context;
        View a2 = this.g.a(context2, layoutInflater2, viewGroup);
        AppBarLayout a3 = this.g.a();
        pfr pfr = this.h;
        if (pfr.d || pfr.e || !pfr.f) {
            pfl pfl = pfr.b;
            pfk pfk = new pfk((LayoutInflater) pfl.a(LayoutInflater.from(pfr.a), 1), (Context) pfl.a(pfr.a, 2), (AppBarLayout) pfl.a(a3, 3), (Picasso) pfl.a(pfl.a.get(), 4), (pfg) pfl.a(pfl.b.get(), 5));
            pfq = pfk;
        } else {
            pfo pfo = pfr.c;
            pfq = new pfn((LayoutInflater) pfo.a(LayoutInflater.from(pfr.a), 1), (Context) pfo.a(pfr.a, 2), (AppBarLayout) pfo.a(a3, 3), (pfg) pfo.a(pfo.a.get(), 4));
        }
        this.v = pfq;
        this.g.a(this.v);
        this.g.f();
        this.g.a((itd) this.k);
        pdx pdx = this.d.a;
        b(pdx.g.a(pdx.h, pdx.d, Lists.a((E[]) new SortOption[]{new SortOption(pdx.f), new SortOption(pdx.e)})));
        pgb pgb = this.d;
        pgb.e = new vav(context2, layoutInflater2, pgb.a.m);
        return a2;
    }

    public final void a() {
        hhf.a(this.u);
        pgb pgb = this.d;
        pgb.a.c.remove(pgb);
    }

    public final void a(int i2) {
        this.t = i2;
        this.f.a.g = true;
        this.g.b();
        hhf.a(this.u);
        i();
    }

    public final void a(Bundle bundle) {
        bundle.putInt("range_length", this.t);
        bundle.putBoolean("scroll_position_restored", this.c.c);
        this.g.b(bundle);
        pdx pdx = this.d.a;
        if (pdx.i != null) {
            bundle.putInt("filter", pdx.i.c);
        }
    }

    public final void a(SortOption sortOption) {
        this.g.c();
        b(sortOption);
        hhf.a(this.u);
        i();
    }

    public final void a(fzn fzn) {
        this.o.a(fzn, this.v);
    }

    public final void a(String str) {
        this.g.h();
    }

    public final void a(vml vml, Context context) {
        boolean z = false;
        if (!this.r) {
            Show a2 = vml.a();
            Covers b2 = a2.b();
            Uri parse = b2 == null ? Uri.EMPTY : Uri.parse(b2.getImageUri(Size.LARGE));
            String c2 = a2.c();
            pft pft = new pft(a2.a(), c2, uiq.a(a2.f()), !fbo.a(c2) ? uiq.a(context.getString(R.string.show_header_description_by_publisher, new Object[]{c2})).toUpperCase(jua.a(context)) : "", parse);
            this.v.a((pfv) pft);
            Uri e2 = pft.e();
            CompositeDisposable compositeDisposable = this.q;
            shd shd = this.n;
            compositeDisposable.a(new shb(shd.a, shd.b, e2).a().a((Consumer<? super T>) new $$Lambda$ped$xqAdGGMTYvDSLRb3eqb5uHzhgA<Object>(this), (Consumer<? super Throwable>) $$Lambda$ped$5RhHdqhb85eztZ1gecaSfSn8WbA.INSTANCE));
            this.g.a(pft.a());
            this.r = true;
        }
        if (((vkv[]) vml.getItems()).length == 0) {
            this.g.i();
        }
        this.o.a(vml.a());
        ugu ugu = new ugu(new ArrayList(6), (vkv[]) vml.getItems(), new ArrayList(3));
        Show a3 = vml.a();
        pgf pgf = this.e;
        if (!pgf.c && !pgf.d && pgf.e) {
            pgf.b.a = a3.getUri();
            pgf.b.b = a3.a();
            pgf.b.c = a3.g();
            pgf.a.a = a3.f();
            pgf.a.b = a3.c();
            ugu.a(pgf.b);
            ugu.a(pgf.a);
        }
        pgr pgr = this.a;
        if (pgr.b) {
            pgr.a(pgr.a(vml.d()), Source.CREATOR_EXTENSION);
        }
        ugu.a(pgr.a);
        pgy pgy = this.b;
        if (pgy.b) {
            ugu.a(pgy.a);
        }
        pfz pfz = this.c;
        if (pfz.b) {
            pfz.a(vml, ugu);
        }
        pgb pgb = this.d;
        if (!pgb.f) {
            pgb.e.a(pgb.a.a);
            pdx pdx = pgb.a;
            ConsumptionOrder j2 = vml.a().j();
            pdx.b.clear();
            if (j2 == ConsumptionOrder.SEQUENTIAL) {
                pdx.b.add(new SortOption(pdx.f));
                pdx.j = pdx.g.a(pdx.h, pdx.f, pdx.b);
            } else {
                pdx.b.add(new SortOption(pdx.e));
                pdx.j = pdx.g.a(pdx.h, pdx.e, pdx.b);
            }
            pgb.e.a(pgb.a.b, pgb.a.j);
            pgb.f = true;
        }
        pgb.a(vml);
        pgb.b();
        if (pgb.a.c()) {
            pgb.c.g = true;
        } else if (vml.getUnrangedLength() == 0) {
            pgb.c.g = false;
            pgb.d.g = true;
        } else {
            pgb.c.g = false;
            pgb.d.g = false;
        }
        ugu.a(pgb.b);
        ugu.b(pgb.c);
        ugu.b(pgb.d);
        pgd pgd = this.f;
        ugu.b(pgd.a);
        pgd.a.g = false;
        this.g.a(ugu);
        pfz pfz2 = this.c;
        if (!pfz2.b && !pfz2.c) {
            pfz2.c = true;
            if (a3.j() != ConsumptionOrder.RECENT) {
                String d2 = a3.d();
                if (!fbo.a(d2) && a3.g() && !fbo.a(d2)) {
                    pfz2.a.d();
                    pfz2.a.b(d2);
                }
            }
        }
        if (vml.getUnrangedLength() > ((vkv[]) vml.getItems()).length) {
            z = true;
        }
        this.s = z;
        this.g.e();
        this.g.g();
    }

    public final void aN_() {
        pgb pgb = this.d;
        if (pgb.e != null) {
            pgb.e.a();
        }
        this.q.c();
    }

    public final void c() {
        i();
        pgb pgb = this.d;
        pgb.a.c.add(pgb);
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.t = bundle.getInt("range_length", this.t);
        }
        this.g.a(bundle);
        pdx pdx = this.d.a;
        int i2 = bundle != null ? bundle.getInt("filter", 0) : 0;
        for (vau vau : pdx.a) {
            if (i2 == vau.c) {
                pdx.i = vau;
                vau.a = true;
            } else {
                vau.a = false;
            }
        }
        pdx.i = (vau) jvi.a(pdx.i, pdx.k);
        pfz pfz = this.c;
        if (bundle != null) {
            pfz.c = bundle.getBoolean("scroll_position_restored", false);
        }
    }

    public final void d() {
        this.g.b();
    }

    public final void g() {
        this.g.b();
    }

    public final boolean h() {
        return this.s;
    }
}
