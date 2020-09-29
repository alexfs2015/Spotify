package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.Wiggle;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
import com.spotify.music.playlist.ui.ItemConfiguration.LongClickAction;
import com.spotify.music.playlist.ui.ItemConfiguration.a;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.List;
import java.util.Map;

/* renamed from: onj reason: default package */
public final class onj implements oni {
    private final a A = new a() {
        public final void a(boolean z) {
        }

        public final void a(String str, boolean z) {
            if (!onj.this.b) {
                onj.this.a.a(str, z);
            }
            onj onj = onj.this;
            onj.c = str;
            onj.d = z;
        }
    };
    private boolean B;
    private ItemConfiguration C = ItemConfiguration.r().a();
    private boolean D;
    onu a;
    boolean b;
    String c;
    boolean d;
    private final sih e;
    private final String f;
    private final spi g;
    private orf h;
    private final onm i;
    private final Scheduler j;
    private final kxc k;
    private final txc l;
    private final ofa m;
    private final kxi n;
    private oix o;
    private final jmq p;
    private final lkn q;
    private final ItemListConfiguration r;
    private final onx s;
    private final tcn t;
    private final kxm u;
    private final List<b> v;
    private final CompositeDisposable w = new CompositeDisposable();
    private final CompletableSubject x = CompletableSubject.f();
    private final BehaviorSubject<ojc> y = BehaviorSubject.a();
    private final CompositeDisposable z = new CompositeDisposable();

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public onj(sih sih, String str, spi spi, onm onm, Scheduler scheduler, kxc kxc, txc txc, ofa ofa, kxi kxi, jmq jmq, lkn lkn, onx onx, tcn tcn, kxm kxm, List<b> list, ItemListConfiguration itemListConfiguration) {
        this.e = sih;
        this.f = str;
        this.g = spi;
        this.i = onm;
        this.j = scheduler;
        this.k = kxc;
        this.l = txc;
        this.m = ofa;
        this.n = kxi;
        this.p = jmq;
        this.q = lkn;
        this.r = itemListConfiguration;
        this.s = onx;
        this.t = tcn;
        this.u = kxm;
        this.v = list;
    }

    public final Completable a() {
        return this.x;
    }

    public final void a(a aVar) {
        this.h = aVar.a();
        this.o = aVar.b();
        this.w.c();
        CompositeDisposable compositeDisposable = this.w;
        Observable a2 = aVar.b().c().a(this.j);
        $$Lambda$onj$0lUU4_Jvp0oLhJHJ74ePIu8ggnU r1 = new $$Lambda$onj$0lUU4_Jvp0oLhJHJ74ePIu8ggnU(this);
        CompletableSubject completableSubject = this.x;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        for (b c2 : this.v) {
            c2.c();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(ojc ojc) {
        this.y.onNext(ojc);
        this.x.onComplete();
    }

    public final void b() {
        this.w.c();
        for (b a2 : this.v) {
            a2.a();
        }
    }

    public final void a(onu onu) {
        this.a = onu;
        if (onu != null) {
            this.z.c();
            this.z.a(this.y.d((Consumer<? super T>) new $$Lambda$onj$zGiPrF3UMp0_HL_ID5YGHVOwOUM<Object>(this)));
            this.z.a(vun.b(this.q.a()).a(Functions.a()).a(this.j).a((Consumer<? super T>) new $$Lambda$onj$IZD5__UMgRdNhhDwSm_m33QN404<Object>(this), (Consumer<? super Throwable>) $$Lambda$onj$INeCOdlFi7dxAq1NaVrhI_sppiM.INSTANCE));
            if (this.r.u()) {
                this.z.a(this.l.b().a(this.j).a((Consumer<? super T>) new $$Lambda$onj$uY3De34WLk6tDe1yEy8Ta744u7I<Object>(this), (Consumer<? super Throwable>) $$Lambda$onj$0hs1PVrretk_Onke6k0WyzwQb7c.INSTANCE));
            }
            this.h.a(this.A);
            return;
        }
        this.z.c();
        this.h.b(this.A);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.C = this.C.q().e(bool.booleanValue()).a();
        this.a.a(this.C);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(txh txh) {
        this.b = txh.h();
        this.a.a(txh.b(), this.b);
        if (!this.b) {
            this.a.a(this.c, this.d);
        }
    }

    public final void a(int i2, uzb uzb) {
        this.i.a(uzb.getUri(), i2);
        uys a2 = uzb.a();
        uzc b2 = uzb.b();
        boolean z2 = false;
        boolean z3 = (a2 == null || a2.w() == MediaType.AUDIO) ? false : true;
        if (this.C.g() && uze.a(uzb)) {
            this.q.a(uzb.getUri(), this.f);
        } else if (b2 != null && this.r.u()) {
            String a3 = a(uzb);
            if (!fax.a(a3)) {
                this.l.b(a3, b(uzb));
                Wiggle v2 = this.r.v();
                if (v2 == Wiggle.ALWAYS || (!this.D && v2 == Wiggle.ONCE)) {
                    this.m.a.onNext(Boolean.TRUE);
                    this.D = true;
                }
            }
        } else if (a2 == null || z3 || !this.r.t()) {
            this.w.a(this.h.b((String) fay.a(uzb.d())).a((Action) $$Lambda$onj$rwhK2jvmQ9K2OKpO6WICpUO_8Fg.INSTANCE, (Consumer<? super Throwable>) $$Lambda$onj$zDRGup2ALRCqhZyH7atUiHnibYQ.INSTANCE));
            if (b2 != null && b2.isBanned() && this.r.o()) {
                z2 = true;
            }
            if (!z2 && ((z3 && this.r.l()) || (!z3 && this.r.k()))) {
                this.t.a();
            }
        } else {
            this.w.a(this.o.d().a((Consumer<? super T>) new $$Lambda$onj$2GJzaM6sEuf6BjHJvGVSoWsyhSk<Object>(this, uzb), (Consumer<? super Throwable>) $$Lambda$onj$G00kmc81rQHXQtZEMWKZtZAl0wk.INSTANCE));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzb uzb, a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_playback_context_uri", this.f);
        bundle.putString("extra_playback_row_id", uzb.d());
        bundle.putParcelable("extra_playback_playlist_endpoint_configuration", aVar);
        this.g.a(uzb.getUri(), bundle);
    }

    public final void a(int i2, uzb uzb, boolean z2, boolean z3) {
        String uri = uzb.getUri();
        this.i.a(uri, i2, z2);
        if (z2) {
            this.n.a(uri, true);
        } else {
            this.n.a(uri, this.f, true);
        }
    }

    public final void b(int i2, uzb uzb, boolean z2, boolean z3) {
        String uri = uzb.getUri();
        this.i.b(uri, i2, z2);
        if (z2) {
            this.k.b(uri, this.f, true);
            return;
        }
        this.k.a(uri, this.f, true);
        if (uzb.b() == null || !this.r.u()) {
            this.h.a(uri);
        } else {
            this.l.c(b(uzb));
        }
    }

    public final void b(int i2, uzb uzb) {
        Object obj;
        uzc b2 = uzb.b();
        uys a2 = uzb.a();
        String uri = uzb.getUri();
        if (b2 != null) {
            obj = b2.getOfflineState();
        } else if (a2 != null) {
            obj = a2.u();
        } else {
            obj = new f();
        }
        if (obj instanceof f) {
            this.u.a(uri);
        } else {
            this.u.b(uri);
        }
        this.i.c(uri, i2);
    }

    public final void a(int i2, uzb uzb, boolean z2) {
        this.i.d(uzb.getUri(), i2);
        if (z2) {
            this.w.a(this.h.a().a((Action) $$Lambda$onj$U1zGk6TUJBt7nOsdxajGa4leK5A.INSTANCE, (Consumer<? super Throwable>) $$Lambda$onj$p2xSYsDYTfddVZR4ku3qGNP4MnU.INSTANCE));
        } else if (!this.C.g() || !uze.a(uzb)) {
            this.w.a(this.h.b((String) fay.a(uzb.d())).a((Action) $$Lambda$onj$zCrIuv27xQNVlE7Vr5aczZVB5lA.INSTANCE, (Consumer<? super Throwable>) $$Lambda$onj$pBzKpN66023I1eGh9uSyLMwIZvc.INSTANCE));
        } else {
            this.q.a(uzb.getUri(), this.f);
        }
    }

    public final void c(int i2, uzb uzb) {
        this.i.e(uzb.getUri(), i2);
        this.s.a();
    }

    public final jms a(ooa ooa) {
        Optional optional;
        int c2 = ooa.c();
        String a2 = ooa.a();
        String b2 = ooa.b();
        this.i.b(a2, c2);
        LinkType linkType = jst.a(a2).b;
        String d2 = ooa.d();
        boolean z2 = false;
        if (linkType == LinkType.TRACK) {
            f i2 = this.p.a(a2, b2, this.f, this.r.m(), ooa.f()).a(this.e).a(this.r.e()).b(true).c(true).a(this.B, d2).g(false).h(!this.r.d()).i(!this.r.c());
            if (this.r.f() && !this.B) {
                z2 = true;
            }
            return i2.j(z2).f(this.B).a(this.f).a();
        } else if (linkType == LinkType.SHOW_EPISODE) {
            Map f2 = ooa.f();
            boolean z3 = ooa.e() != MediaType.AUDIO;
            i i3 = this.p.b(a2, b2, this.f, this.r.m(), f2).a(z3).a(this.e).b(!z3).d(!z3 || this.r.g()).e(true).f(this.r.e()).g(false).h(!z3).i(false);
            if (this.B) {
                optional = Optional.c(this.f);
            } else {
                optional = Optional.e();
            }
            return i3.a(optional, this.B ? Optional.c(d2) : Optional.e()).l(this.B).k(!this.r.d()).a();
        } else {
            StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
            sb.append(a2);
            Assertion.a(sb.toString());
            return jms.a;
        }
    }

    /* access modifiers changed from: private */
    public void a(ojc ojc) {
        LongClickAction longClickAction;
        a a2 = this.C.q().b(ojc.a().g()).c(this.r.p()).a(this.r.a() ? HeartAndBan.HEART_AND_BAN : HeartAndBan.NO_HEART_OR_BAN);
        if (this.r.n() == ItemListConfiguration.LongClickAction.SHOW_CONTEXT_MENU) {
            longClickAction = LongClickAction.SHOW_CONTEXT_MENU;
        } else {
            longClickAction = LongClickAction.DO_NOTHING;
        }
        this.C = a2.a(longClickAction).d(this.r.q()).f(this.r.o()).g(this.r.b()).h(b(ojc)).i(b(ojc)).j(!this.r.t()).k(this.r.u()).m(this.r.x()).l(this.r.w()).n(this.r.y()).a();
        this.a.a(this.C);
        this.B = ojc.m();
    }

    private boolean b(ojc ojc) {
        Optional s2 = this.r.s();
        if (!s2.b()) {
            return !ojc.g();
        }
        return ((Boolean) s2.c()).booleanValue();
    }

    private static String a(uzb uzb) {
        uzc b2 = uzb.b();
        if (b2 != null) {
            return b2.previewId();
        }
        uys a2 = uzb.a();
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    private static String b(uzb uzb) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(uzb));
        sb.append(uzb.d());
        return sb.toString();
    }
}
