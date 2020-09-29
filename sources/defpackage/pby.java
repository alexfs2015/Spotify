package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.music.R;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.music.spotlets.offline.util.OffliningLogger.SourceElement;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: pby reason: default package */
final class pby implements pcl {
    private final CompletableSubject A = CompletableSubject.f();
    private pbt B;
    private fzm C;
    private fzn D;
    private oqg E;
    private ozo F = ozo.a;
    private final CompositeDisposable a = new CompositeDisposable();
    private final Activity b;
    private final opw c;
    private final pcb d;
    private final fzt e;
    private final szp f;
    private final hec g;
    private final tmu h;
    private final pch i;
    private final OffliningLogger j;
    private final pcd k;
    private final utg l;
    private final izh m;
    private final pbw n;
    private final ToastieManager o;
    private final ooo p;
    private final pcf q;
    private oyl r;
    private final Scheduler s;
    private final vjj t;
    private final vjv u;
    private final jvf v;
    private final ome w;
    private final omn x;
    private final pbu y;
    private final szn z;

    public pby(Activity activity, opw opw, Scheduler scheduler, pcb pcb, fzt fzt, szp szp, hec hec, tmu tmu, pch pch, OffliningLogger offliningLogger, pcd pcd, utg utg, izh izh, ToastieManager toastieManager, pcf pcf, pbw pbw, vjj vjj, vjv vjv, jvf jvf, ome ome, omn omn, pbu pbu, szn szn, ooo ooo) {
        this.b = activity;
        this.c = opw;
        this.d = pcb;
        this.e = fzt;
        this.f = szp;
        this.g = hec;
        this.h = tmu;
        this.i = pch;
        this.j = offliningLogger;
        this.k = pcd;
        this.l = utg;
        this.m = izh;
        this.o = toastieManager;
        this.p = ooo;
        this.q = pcf;
        this.n = pbw;
        this.s = scheduler;
        this.t = vjj;
        this.u = vjv;
        this.v = jvf;
        this.w = ome;
        this.x = omn;
        this.y = pbu;
        this.z = szn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z2, vlc vlc) {
        return z2 ? this.u.a(vlc.getUri(), false) : Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.i.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        boolean z2 = !bool.booleanValue();
        fzm fzm = this.C;
        if (fzm != null) {
            fzm.a(z2);
        }
        pbt pbt = this.B;
        if (pbt != null) {
            pbt.a(z2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oqg oqg) {
        this.E = oqg;
        ao_();
        this.A.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc) {
        this.a.a(this.u.a(vlc.getUri(), !vlc.i()).a(this.s).a((Action) new $$Lambda$pby$RIbC4ME4n64Nijva6_7Z30FOKmg(this, vlc), (Consumer<? super Throwable>) $$Lambda$pby$a7UIQwcMSeAS5qpAsOHoyrBOQ4.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc, SpotifyUri spotifyUri, String str, String str2, fzn fzn, String str3) {
        this.i.e();
        ArrayList arrayList = new ArrayList(this.m.a());
        if (!vlc.i()) {
            arrayList.remove(AppShareDestination.SNAPCHAT_STORIES);
        }
        this.m.a(spotifyUri.toString(), !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY, null, str2, fzn.a().getString(R.string.share_by_owner, new Object[]{str3}), null, jqg.a, arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc, boolean z2) {
        this.a.a(this.t.a(vlc.getUri(), z2).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$pby$QRlISx__ARddlLQO3wTt5uGs9Cw<Object>(this, z2, vlc))).a(this.s).a((Action) new $$Lambda$pby$6yod8q5tuMCNzwmeyTNX3oTDAxE(this, vlc), (Consumer<? super Throwable>) $$Lambda$pby$TKXplnsByvo4If4Z7nNPqt674g.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc, boolean z2, wzi wzi) {
        this.i.a(vlc.getUri(), z2);
        this.a.a((Disposable) wzi.get());
        if (!z2 && this.p.a()) {
            this.o.a(uzy.a(this.b.getString(R.string.playlist_toolbar_toastie_playlist_saved_to_your_library), 3000).c(R.color.white).b(R.color.black).a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wzi wzi) {
        this.a.a((Disposable) wzi.get());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, View view) {
        this.a.a((z2 ? this.r.c() : this.r.b()).a((Action) $$Lambda$pby$s7LYAxKRvIxgwNv65BSPe30DM.INSTANCE, (Consumer<? super Throwable>) $$Lambda$pby$yIbdvqlxyxuO1K9RnudevwfD5og.INSTANCE));
        if (this.p.k()) {
            this.h.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.i.d();
        this.f.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vlc vlc) {
        this.v.a(!vlc.i() ? R.string.playlist_toast_published : R.string.playlist_toast_unpublished, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(vlc vlc) {
        this.n.a(false);
        this.i.d(vlc.getUri(), false);
        this.j.a(vlc.getUri(), SourceElement.OPTIONS_MENU, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(vlc vlc) {
        this.n.a(true);
        this.i.d(vlc.getUri(), true);
        this.j.a(vlc.getUri(), SourceElement.OPTIONS_MENU, true);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(vlc vlc) {
        CompositeDisposable compositeDisposable = this.a;
        Completable a2 = this.u.b(vlc.getUri()).a(this.s);
        szp szp = this.f;
        szp.getClass();
        compositeDisposable.a(a2.a((Action) new $$Lambda$GZQDc0k5WyzIgPkljSD6YWnUoJc(szp), (Consumer<? super Throwable>) $$Lambda$pby$XUpLo8wL116yeUh4cQH5Z0NUiq8.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(vlc vlc) {
        this.v.a(!vlc.g() ? R.string.playlist_toast_now_collaborative : R.string.playlist_toast_now_uncollaborative, 0, new Object[0]);
    }

    public final Completable a() {
        return this.A;
    }

    public final void a(Bundle bundle) {
    }

    public final void a(ViewGroup viewGroup) {
        fsy a2 = ftc.a(this.b, viewGroup);
        gav.a(a2.getView(), this.b);
        viewGroup.addView(a2.getView(), 0);
        this.C = new fzm(this.b, a2, new $$Lambda$pby$ImwQyZuVvQn9eAI_7Bb_OSbACBw(this));
        this.C.a(false);
        this.C.c(true);
        fzm fzm = this.C;
        if (fzm != null) {
            this.B = new pbt(fzm);
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final void a(fzn fzn, a aVar, a aVar2, a aVar3) {
        fzn fzn2 = fzn;
        a aVar4 = aVar;
        fzn2.a((OnClickListener) new $$Lambda$pby$BFmnsOm7AsBxxtbd2Y9d3SssbMo(this));
        this.D = fzn2;
        oqg oqg = this.E;
        if (oqg != null) {
            fzm fzm = this.C;
            if (fzm != null) {
                ((fzm) fbp.a(fzm)).b(this.z.e());
                vlc a2 = oqg.a();
                if (aVar4 != null) {
                    aVar4.perform(a2, fzn2);
                } else {
                    fzn2.b(a2.a());
                    fzn2.a(utg.a(a2.getImageUri(), a2.getUri(), true), SpotifyIconV2.PLAYLIST, false, true);
                }
                aVar2.perform(a2, fzn2);
                vlc a3 = oqg.a();
                String a4 = a3.a();
                boolean n2 = this.p.n();
                if (this.F.l()) {
                    pcf pcf = this.q;
                    $$Lambda$pby$Uo4WpdLiiGCxQl6n9C339l3jNWQ r1 = new $$Lambda$pby$Uo4WpdLiiGCxQl6n9C339l3jNWQ(this, n2);
                    if (n2) {
                        ToolbarMenuHelper.a(fzn2, (OnClickListener) r1);
                    } else {
                        ToolbarMenuHelper.a(fzn2, (int) R.string.playlist_toolbar_actionbar_item_play, (int) R.id.toolbar_menu_play, SpotifyIconV2.PLAY, (OnClickListener) r1);
                    }
                }
                if (a3.k()) {
                    if (this.p.f()) {
                        this.d.b(fzn2, this.g, a3.getUri());
                    }
                    if (this.p.j()) {
                        this.d.b(fzn2, a3.getUri(), a3.g(), new $$Lambda$pby$CJXsWqnDo1WvheyqEDifTDwnI(this, a3, !a3.g()));
                    }
                }
                if (this.p.l() && (a3.k() || a3.g())) {
                    this.d.a(fzn2, this.g, a3.getUri());
                } else if (a3.k()) {
                    this.d.a(fzn2, this.g, a3.getUri(), a4);
                }
                if (a3.k()) {
                    this.d.a(fzn2, a3.getUri(), a4, (fzk) new $$Lambda$pby$it00QJsFK_pzk7eNUUzzjX31Ug(this, a3));
                }
                boolean h2 = a3.h();
                if (!a3.k()) {
                    $$Lambda$pby$w24f_CHTw9JVLBn44rFo6cP7LDU r2 = new $$Lambda$pby$w24f_CHTw9JVLBn44rFo6cP7LDU(!h2 ? this.u.a(a3.getUri()) : this.u.b(a3.getUri()));
                    $$Lambda$pby$hTfVf1pEh9YnMWCZWGGRwynYH8 r12 = new $$Lambda$pby$hTfVf1pEh9YnMWCZWGGRwynYH8(this, a3, h2, r2);
                    if (this.p.b()) {
                        this.e.a(fzn2, h2, (fzk) r12);
                    }
                    if (this.p.c()) {
                        this.e.b(fzn2, h2, r12);
                    } else {
                        this.d.a(fzn2, a3.getUri(), h2, (fzk) new $$Lambda$pby$9pGcA0WfT3UxkHRPNLwq2QWEgdo(this, r2));
                    }
                }
                if (this.p.i() && !oqg.h()) {
                    pbw pbw = this.n;
                    vlc a5 = oqg.a();
                    pbw.d = a5.getUri();
                    pbw.e = oqg.b().b();
                    pbw.b.a((tsy) new tsy(a5) {
                        private /* synthetic */ vlc a;

                        {
                            this.a = r2;
                        }

                        public final vli a() {
                            return this.a.s();
                        }

                        public final boolean b() {
                            return !this.a.k() && !this.a.h();
                        }
                    });
                    int i2 = oqg.g() ? R.string.options_menu_download : R.string.options_menu_download_only_songs;
                    pcf pcf2 = this.q;
                    pcf2.d.a(fzn, pcf2.b, a3.s(), i2, (Runnable) new $$Lambda$pby$kgrxtg4KRakgxdMPH5KIy0hCWM(this, a3), (int) R.string.options_menu_undownload, (Runnable) new $$Lambda$pby$MBFLmzh0QkeFnqVJAlR8H08G7E(this, a3));
                }
                if (this.p.g() && !oqg.o()) {
                    pcf pcf3 = this.q;
                    pcf3.d.a(fzn, pcf3.b, a3.getUri(), a3.a(), pcf3.a, pcf3.c, fzn.a());
                }
                if (this.p.m()) {
                    pcb pcb = this.d;
                    ome ome = this.w;
                    ome.getClass();
                    pcb.b(fzn2, (fzk) new $$Lambda$xdO539FXHeqbiyhbC8bG4JvujF8(ome));
                    pcb pcb2 = this.d;
                    ome ome2 = this.w;
                    ome2.getClass();
                    pcb2.a(fzn2, (fzk) new $$Lambda$pUzulKAZ7dG4fsugO3x_tua4heI(ome2));
                }
                vlg d2 = a3.d();
                if (d2 != null) {
                    String c2 = d2.c();
                    fzn2.c(fzn.a().getString(R.string.playlist_subtitle, new Object[]{c2}));
                    String imageUri = a3.getImageUri();
                    SpotifyUri b2 = SpotifyUri.b(new SpotifyUri(a3.getUri()).b);
                    fzt fzt = this.e;
                    $$Lambda$pby$jKC7PVJmCqwrBNyRBVkNbv991Y r0 = new $$Lambda$pby$jKC7PVJmCqwrBNyRBVkNbv991Y(this, a3, b2, imageUri, a4, fzn, c2);
                    fzt.a(fzn2, r0);
                }
                if (a3.o()) {
                    pcd pcd = this.k;
                    Optional e2 = pcd.b == null ? Optional.e() : Optional.b(pcd.b);
                    if (e2.b()) {
                        pcf pcf4 = this.q;
                        pcf4.d.a(fzn2, pcf4.b, (String) e2.c());
                    }
                }
                if (a3.k() || a3.h()) {
                    this.d.c(fzn2, a3.getUri(), a3.i(), new $$Lambda$pby$wSZxRLP6pdvFfx_5BRaJqYuTPc(this, a3));
                }
                if (!oqg.n() && this.p.h()) {
                    ToolbarMenuHelper.a(fzn2, a3.getUri(), a3.a(), a3.getImageUri(), this.q.b);
                }
                aVar3.perform(a2, fzn2);
            }
        }
    }

    public final void a(a aVar) {
        this.r = aVar.a();
        this.k.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        opw opw = this.c;
        opw.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$NOnjttzPKmBGTL4ar_lrEjmVub8<Object,Object>(opw)).a(this.s);
        $$Lambda$pby$S06PbMY2fC0LrzjfEncasm7NZ5Q r1 = new $$Lambda$pby$S06PbMY2fC0LrzjfEncasm7NZ5Q(this);
        CompletableSubject completableSubject = this.A;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.a.a(this.x.a.a(this.s).a((Consumer<? super T>) new $$Lambda$pby$4viY5cfUtdCLmr0M485TOeY3T4Y<Object>(this), (Consumer<? super Throwable>) $$Lambda$pby$q4ZB4PADS9cHLsJocrWxTr2lIYE.INSTANCE));
        pbw pbw = this.n;
        pbw.a.c();
        pbw.c.a((a) pbw.b);
        pbw.c.a();
    }

    public final void a(ozo ozo) {
        this.F = (ozo) fbm.a(ozo, ozo.a);
        fzm fzm = this.C;
        if (fzm != null) {
            fzm.c(true);
        }
        ao_();
    }

    public final void ao_() {
        fzm fzm = this.C;
        if (fzm != null) {
            fzm.a();
        }
    }

    public final void ay_() {
        ao_();
    }

    public final fyh b() {
        return this.B;
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public final void d() {
        this.a.c();
        this.k.a.a(Disposables.a());
        pbw pbw = this.n;
        pbw.a.c();
        pbw.c.b(pbw.b);
        pbw.c.b();
    }
}
