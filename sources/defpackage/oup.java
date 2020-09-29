package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
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

/* renamed from: oup reason: default package */
public final class oup implements ouo {
    private boolean A;
    private ItemConfiguration B = ItemConfiguration.r().a();
    ova a;
    boolean b;
    String c;
    boolean d;
    private final sso e;
    private final String f;
    private final szp g;
    private oyl h;
    private final ous i;
    private final Scheduler j;
    private final lal k;
    private final ujf l;
    private final lar m;
    private oqb n;
    private final jpc o;
    private final lon p;
    private final ItemListConfiguration q;
    private final ovd r;
    private final tmu s;
    private final lav t;
    private final List<b> u;
    private final CompositeDisposable v = new CompositeDisposable();
    private final CompletableSubject w = CompletableSubject.f();
    private final BehaviorSubject<oqg> x = BehaviorSubject.a();
    private final CompositeDisposable y = new CompositeDisposable();
    private final a z = new a() {
        public final void a(String str, boolean z) {
            if (!oup.this.b) {
                oup.this.a.a(str, z);
            }
            oup oup = oup.this;
            oup.c = str;
            oup.d = z;
        }

        public final void a(boolean z) {
        }
    };

    public oup(sso sso, String str, szp szp, ous ous, Scheduler scheduler, lal lal, ujf ujf, lar lar, jpc jpc, lon lon, ovd ovd, tmu tmu, lav lav, List<b> list, ItemListConfiguration itemListConfiguration) {
        this.e = sso;
        this.f = str;
        this.g = szp;
        this.i = ous;
        this.j = scheduler;
        this.k = lal;
        this.l = ujf;
        this.m = lar;
        this.o = jpc;
        this.p = lon;
        this.q = itemListConfiguration;
        this.r = ovd;
        this.s = tmu;
        this.t = lav;
        this.u = list;
    }

    private static String a(vle vle) {
        vlf b2 = vle.b();
        if (b2 != null) {
            return b2.previewId();
        }
        vkv a2 = vle.a();
        if (a2 != null) {
            return a2.g();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.B = this.B.q().e(bool.booleanValue()).a();
        this.a.a(this.B);
    }

    /* access modifiers changed from: private */
    public void a(oqg oqg) {
        this.B = this.B.q().b(oqg.a().g()).c(this.q.p()).a(this.q.a() ? HeartAndBan.HEART_AND_BAN : HeartAndBan.NO_HEART_OR_BAN).a(this.q.n() == LongClickAction.SHOW_CONTEXT_MENU ? ItemConfiguration.LongClickAction.SHOW_CONTEXT_MENU : ItemConfiguration.LongClickAction.DO_NOTHING).d(this.q.q()).f(this.q.o()).g(this.q.b()).h(b(oqg)).i(b(oqg)).j(!this.q.t()).k(this.q.u()).m(this.q.w()).l(this.q.v()).n(this.q.x()).a();
        this.a.a(this.B);
        this.A = oqg.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ujk ujk) {
        this.b = ujk.h();
        this.a.a(ujk.b(), this.b);
        if (!this.b) {
            this.a.a(this.c, this.d);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vle vle, a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_playback_context_uri", this.f);
        bundle.putString("extra_playback_row_id", vle.d());
        bundle.putParcelable("extra_playback_playlist_endpoint_configuration", aVar);
        this.g.a(vle.getUri(), bundle);
    }

    private static String b(vle vle) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(vle));
        sb.append(vle.d());
        return sb.toString();
    }

    private boolean b(oqg oqg) {
        Optional s2 = this.q.s();
        return !s2.b() ? !oqg.g() : ((Boolean) s2.c()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(oqg oqg) {
        this.x.onNext(oqg);
        this.w.onComplete();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    public final Completable a() {
        return this.w;
    }

    public final jpe a(ovg ovg) {
        int c2 = ovg.c();
        String a2 = ovg.a();
        String b2 = ovg.b();
        this.i.b(a2, c2);
        LinkType linkType = jva.a(a2).b;
        String d2 = ovg.d();
        boolean z2 = false;
        if (linkType == LinkType.TRACK) {
            f i2 = this.o.a(a2, b2, this.f, this.q.m(), ovg.f()).a(this.e).a(this.q.e()).b(true).c(true).a(this.A, d2).g(false).h(!this.q.d()).i(!this.q.c());
            if (this.q.f() && !this.A) {
                z2 = true;
            }
            return i2.j(z2).f(this.A).a(this.f).a();
        } else if (linkType == LinkType.SHOW_EPISODE) {
            Map f2 = ovg.f();
            boolean z3 = ovg.e() != MediaType.AUDIO;
            return this.o.b(a2, b2, this.f, this.q.m(), f2).a(z3).a(this.e).b(!z3).d(!z3 || this.q.g()).e(true).f(this.q.e()).g(false).h(!z3).i(false).a(this.A ? Optional.c(this.f) : Optional.e(), this.A ? Optional.c(d2) : Optional.e()).l(this.A).k(!this.q.d()).a();
        } else {
            StringBuilder sb = new StringBuilder("Unsupported uri for building context menu. Only track and episode supported. was: ");
            sb.append(a2);
            Assertion.a(sb.toString());
            return jpe.a;
        }
    }

    public final void a(int i2, vle vle) {
        this.i.a(vle.getUri(), i2);
        vkv a2 = vle.a();
        vlf b2 = vle.b();
        boolean z2 = true;
        boolean z3 = (a2 == null || a2.w() == MediaType.AUDIO) ? false : true;
        if (this.B.g() && vlh.a(vle)) {
            this.p.a(vle.getUri(), this.f);
        } else if (b2 != null && this.q.u()) {
            String a3 = a(vle);
            if (!fbo.a(a3)) {
                this.l.b(a3, b(vle));
            }
        } else if (a2 == null || z3 || !this.q.t()) {
            this.v.a(this.h.b((String) fbp.a(vle.d())).a((Action) $$Lambda$oup$612uI6sebniSdi9QnjNiTUStE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oup$9PwArf1CAuJyudbyOpijYwRqLR0.INSTANCE));
            if (b2 == null || !b2.isBanned() || !this.q.o()) {
                z2 = false;
            }
            if (!z2 && ((z3 && this.q.l()) || (!z3 && this.q.k()))) {
                this.s.a();
            }
        } else {
            this.v.a(this.n.d().a((Consumer<? super T>) new $$Lambda$oup$9umc68IRUN4ey634L6jJjezpdtM<Object>(this, vle), (Consumer<? super Throwable>) $$Lambda$oup$aDCWpovqd9UfAEwt74QB7C1IrXE.INSTANCE));
        }
    }

    public final void a(int i2, vle vle, boolean z2) {
        this.i.d(vle.getUri(), i2);
        if (z2) {
            this.v.a(this.h.a().a((Action) $$Lambda$oup$IOI07sSyca_ZKkWLROo28LXgrDI.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oup$1uOdSos3NgJZ7_QEK64qBPPaAwk.INSTANCE));
        } else if (!this.B.g() || !vlh.a(vle)) {
            this.v.a(this.h.b((String) fbp.a(vle.d())).a((Action) $$Lambda$oup$xp8I8qSsTObFqxPCMtJtoBehsQ0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oup$SgyGtzCT6N830QONLvrVI_ekfcw.INSTANCE));
        } else {
            this.p.a(vle.getUri(), this.f);
        }
    }

    public final void a(int i2, vle vle, boolean z2, boolean z3) {
        String uri = vle.getUri();
        this.i.a(uri, i2, z2);
        if (z2) {
            this.m.a(uri, true);
        } else {
            this.m.a(uri, this.f, true);
        }
    }

    public final void a(a aVar) {
        this.h = aVar.a();
        this.n = aVar.b();
        this.v.c();
        CompositeDisposable compositeDisposable = this.v;
        Observable a2 = aVar.b().c().a(this.j);
        $$Lambda$oup$JAY6dV7x2qS5koYcWeyW0P8KPkE r1 = new $$Lambda$oup$JAY6dV7x2qS5koYcWeyW0P8KPkE(this);
        CompletableSubject completableSubject = this.w;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        for (b c2 : this.u) {
            c2.c();
        }
    }

    public final void a(ova ova) {
        this.a = ova;
        if (ova != null) {
            this.y.c();
            this.y.a(this.x.d((Consumer<? super T>) new $$Lambda$oup$WAo9MpA0jV7yUrczEKFkvnPPpM<Object>(this)));
            this.y.a(wit.b(this.p.a()).a(Functions.a()).a(this.j).a((Consumer<? super T>) new $$Lambda$oup$y3iyjfWtIVXz6fg2gzLzBryVuo<Object>(this), (Consumer<? super Throwable>) $$Lambda$oup$iXBAHNA9JPs_uKQf7rKU2qThREs.INSTANCE));
            if (this.q.u()) {
                this.y.a(this.l.b().a(this.j).a((Consumer<? super T>) new $$Lambda$oup$I6QkDwGCyoUDi1QGp9VY1F3dlKw<Object>(this), (Consumer<? super Throwable>) $$Lambda$oup$_bHfbom9VVu1mnB6FvaRYEOwxeM.INSTANCE));
            }
            this.h.a(this.z);
            return;
        }
        this.y.c();
        this.h.b(this.z);
    }

    public final void b() {
        this.v.c();
        for (b a2 : this.u) {
            a2.a();
        }
    }

    public final void b(int i2, vle vle) {
        vlf b2 = vle.b();
        vkv a2 = vle.a();
        String uri = vle.getUri();
        Object obj = b2 != null ? b2.getOfflineState() : a2 != null ? a2.u() : new f();
        if (obj instanceof f) {
            this.t.a(uri);
        } else {
            this.t.b(uri);
        }
        this.i.c(uri, i2);
    }

    public final void b(int i2, vle vle, boolean z2, boolean z3) {
        String uri = vle.getUri();
        this.i.b(uri, i2, z2);
        if (z2) {
            this.k.b(uri, this.f, true);
            return;
        }
        this.k.a(uri, this.f, true);
        if (vle.b() == null || !this.q.u()) {
            this.h.a(uri);
        } else {
            this.l.c(b(vle));
        }
    }

    public final void c(int i2, vle vle) {
        this.i.e(vle.getUri(), i2);
        this.r.a();
    }
}
