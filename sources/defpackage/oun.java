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

/* renamed from: oun reason: default package */
final class oun implements ova {
    private final CompletableSubject A = CompletableSubject.f();
    private oui B;
    private fys C;
    private fyt D;
    private ojc E;
    private osi F = osi.a;
    private final CompositeDisposable a = new CompositeDisposable();
    private final Activity b;
    private final ois c;
    private final ouq d;
    private final fyz e;
    private final spi f;
    private final hbj g;
    private final tcn h;
    private final ouw i;
    private final OffliningLogger j;
    private final ous k;
    private final uhs l;
    private final iww m;
    private final oul n;
    private final ToastieManager o;
    private final ohk p;
    private final ouu q;
    private orf r;
    private final Scheduler s;
    private final uxh t;
    private final uxt u;
    private final jsz v;
    private final oey w;
    private final ofj x;
    private final ouj y;
    private final spg z;

    /* access modifiers changed from: private */
    public static /* synthetic */ void e() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f() {
    }

    public final void a(Bundle bundle) {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public oun(Activity activity, ois ois, Scheduler scheduler, ouq ouq, fyz fyz, spi spi, hbj hbj, tcn tcn, ouw ouw, OffliningLogger offliningLogger, ous ous, uhs uhs, iww iww, ToastieManager toastieManager, ouu ouu, oul oul, uxh uxh, uxt uxt, jsz jsz, oey oey, ofj ofj, ouj ouj, spg spg, ohk ohk) {
        this.b = activity;
        this.c = ois;
        this.d = ouq;
        this.e = fyz;
        this.f = spi;
        this.g = hbj;
        this.h = tcn;
        this.i = ouw;
        this.j = offliningLogger;
        this.k = ous;
        this.l = uhs;
        this.m = iww;
        this.o = toastieManager;
        this.p = ohk;
        this.q = ouu;
        this.n = oul;
        this.s = scheduler;
        this.t = uxh;
        this.u = uxt;
        this.v = jsz;
        this.w = oey;
        this.x = ofj;
        this.y = ouj;
        this.z = spg;
    }

    public final Completable a() {
        return this.A;
    }

    public final void a(a aVar) {
        this.r = aVar.a();
        this.k.a();
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable c2 = aVar.b().c();
        ois ois = this.c;
        ois.getClass();
        Observable a2 = c2.a((BiPredicate<? super T, ? super T>) new $$Lambda$PjVYt5Nr9pG_VgyEij6HBWsUiE<Object,Object>(ois)).a(this.s);
        $$Lambda$oun$0S12Geg8qd1jTFfFqMNIIaflt4U r1 = new $$Lambda$oun$0S12Geg8qd1jTFfFqMNIIaflt4U(this);
        CompletableSubject completableSubject = this.A;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
        this.a.a(this.x.a.a(this.s).a((Consumer<? super T>) new $$Lambda$oun$cRQdkumlYKplJxQCYm0ZZKRYgDg<Object>(this), (Consumer<? super Throwable>) $$Lambda$oun$qMc3NvyYs8vB_kx2lqzuZiOefic.INSTANCE));
        oul oul = this.n;
        oul.a.c();
        oul.c.a((a) oul.b);
        oul.c.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ojc ojc) {
        this.E = ojc;
        ap_();
        this.A.onComplete();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        boolean z2 = !bool.booleanValue();
        fys fys = this.C;
        if (fys != null) {
            fys.a(z2);
        }
        oui oui = this.B;
        if (oui != null) {
            oui.a(z2);
        }
    }

    public final void az_() {
        ap_();
    }

    public final void d() {
        this.a.c();
        this.k.a.a(Disposables.a());
        oul oul = this.n;
        oul.a.c();
        oul.c.b(oul.b);
        oul.c.b();
    }

    public final void a(ViewGroup viewGroup) {
        fse a2 = fsi.a(this.b, viewGroup);
        gab.a(a2.getView(), this.b);
        viewGroup.addView(a2.getView(), 0);
        this.C = new fys(this.b, a2, new $$Lambda$oun$jVRHVtxwFMu6gZPtlvqrf2LCBH8(this));
        this.C.a(false);
        this.C.c(true);
        fys fys = this.C;
        if (fys != null) {
            this.B = new oui(fys);
            return;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.i.d();
        this.f.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.i.a();
    }

    public final void a(fyt fyt, a aVar, a aVar2, a aVar3) {
        Optional optional;
        Completable completable;
        fyt fyt2 = fyt;
        a aVar4 = aVar;
        fyt2.a((OnClickListener) new $$Lambda$oun$SSsWg6FQv7xAUKfTWEuiANEJDk(this));
        this.D = fyt2;
        ojc ojc = this.E;
        if (ojc != null) {
            fys fys = this.C;
            if (fys != null) {
                ((fys) fay.a(fys)).b(this.z.e());
                uyz a2 = ojc.a();
                if (aVar4 != null) {
                    aVar4.perform(a2, fyt2);
                } else {
                    fyt2.b(a2.a());
                    fyt2.a(uhs.a(a2.getImageUri(), a2.getUri(), true), SpotifyIconV2.PLAYLIST, false, true);
                }
                aVar2.perform(a2, fyt2);
                uyz a3 = ojc.a();
                String a4 = a3.a();
                boolean n2 = this.p.n();
                if (this.F.l()) {
                    ouu ouu = this.q;
                    $$Lambda$oun$V_FZD6kOfv1AJ1IgSIMrw9E89Y r1 = new $$Lambda$oun$V_FZD6kOfv1AJ1IgSIMrw9E89Y(this, n2);
                    if (n2) {
                        ToolbarMenuHelper.a(fyt2, (OnClickListener) r1);
                    } else {
                        ToolbarMenuHelper.a(fyt2, (int) R.string.playlist_toolbar_actionbar_item_play, (int) R.id.toolbar_menu_play, SpotifyIconV2.PLAY, (OnClickListener) r1);
                    }
                }
                if (a3.k()) {
                    if (this.p.f()) {
                        this.d.b(fyt2, this.g, a3.getUri());
                    }
                    if (this.p.j()) {
                        this.d.b(fyt2, a3.getUri(), a3.g(), new $$Lambda$oun$VIRIvn0Dwg75SsLaapViuzYE9K8(this, a3, !a3.g()));
                    }
                }
                if (this.p.l() && (a3.k() || a3.g())) {
                    this.d.a(fyt2, this.g, a3.getUri());
                } else if (a3.k()) {
                    this.d.a(fyt2, this.g, a3.getUri(), a4);
                }
                if (a3.k()) {
                    this.d.a(fyt2, a3.getUri(), a4, (fyq) new $$Lambda$oun$6ihmszirt8NwRJ8pCFT3WWzCGNI(this, a3));
                }
                boolean h2 = a3.h();
                if (!a3.k()) {
                    if (!h2) {
                        completable = this.u.a(a3.getUri());
                    } else {
                        completable = this.u.b(a3.getUri());
                    }
                    $$Lambda$oun$5jr0GHbgjQjnBzBGc91oEe_WU r2 = new $$Lambda$oun$5jr0GHbgjQjnBzBGc91oEe_WU(completable);
                    $$Lambda$oun$2yMVkYzpfOwWbQj7lGK7qK57Vg r12 = new $$Lambda$oun$2yMVkYzpfOwWbQj7lGK7qK57Vg(this, a3, h2, r2);
                    if (this.p.b()) {
                        this.e.a(fyt2, h2, (fyq) r12);
                    }
                    if (this.p.c()) {
                        this.e.b(fyt2, h2, r12);
                    } else {
                        this.d.a(fyt2, a3.getUri(), h2, (fyq) new $$Lambda$oun$F7mbfGMTMQy2uS3Wdjm8GAtBc(this, r2));
                    }
                }
                if (this.p.i() && !ojc.h()) {
                    oul oul = this.n;
                    uyz a5 = ojc.a();
                    oul.d = a5.getUri();
                    oul.e = ojc.b().b();
                    oul.b.a((tig) new tig(a5) {
                        private /* synthetic */ uyz a;

                        {
                            this.a = r2;
                        }

                        public final uzf a() {
                            return this.a.s();
                        }

                        public final boolean b() {
                            return !this.a.k() && !this.a.h();
                        }
                    });
                    int i2 = ojc.g() ? R.string.options_menu_download : R.string.options_menu_download_only_songs;
                    ouu ouu2 = this.q;
                    ouu2.d.a(fyt, ouu2.b, a3.s(), i2, (Runnable) new $$Lambda$oun$4nm8ZqcJRQMF6UJo8oIIM2c_1ZI(this, a3), (int) R.string.options_menu_undownload, (Runnable) new $$Lambda$oun$zTa267k5KUK4jNV2DqW6dTXcbhs(this, a3));
                }
                if (this.p.g() && !ojc.o()) {
                    ouu ouu3 = this.q;
                    ouu3.d.a(fyt, ouu3.b, a3.getUri(), a3.a(), ouu3.a, ouu3.c, fyt.a());
                }
                if (this.p.m()) {
                    ouq ouq = this.d;
                    oey oey = this.w;
                    oey.getClass();
                    ouq.b(fyt2, (fyq) new $$Lambda$GYgR7ieha_EAUgNuKL4yArkyufU(oey));
                    ouq ouq2 = this.d;
                    oey oey2 = this.w;
                    oey2.getClass();
                    ouq2.a(fyt2, (fyq) new $$Lambda$nDBwMidnXsSab9geuE9OVJ5mMXw(oey2));
                }
                uzd d2 = a3.d();
                if (d2 != null) {
                    String c2 = d2.c();
                    fyt2.c(fyt.a().getString(R.string.playlist_subtitle, new Object[]{c2}));
                    String imageUri = a3.getImageUri();
                    SpotifyUri b2 = SpotifyUri.b(new SpotifyUri(a3.getUri()).b);
                    fyz fyz = this.e;
                    $$Lambda$oun$Z1ji0N5gIKF4LKJKQ3QIdtgv6Zw r0 = new $$Lambda$oun$Z1ji0N5gIKF4LKJKQ3QIdtgv6Zw(this, a3, b2, imageUri, a4, fyt, c2);
                    fyz.a(fyt2, r0);
                }
                if (a3.o()) {
                    ous ous = this.k;
                    if (ous.b == null) {
                        optional = Optional.e();
                    } else {
                        optional = Optional.b(ous.b);
                    }
                    if (optional.b()) {
                        ouu ouu4 = this.q;
                        ouu4.d.a(fyt2, ouu4.b, (String) optional.c());
                    }
                }
                if (a3.k() || a3.h()) {
                    this.d.c(fyt2, a3.getUri(), a3.i(), new $$Lambda$oun$wGpDLDVA495AfKYmP8uiPDSuMlc(this, a3));
                }
                if (!ojc.n() && this.p.h()) {
                    ToolbarMenuHelper.a(fyt2, a3.getUri(), a3.a(), a3.getImageUri(), this.q.b);
                }
                aVar3.perform(a2, fyt2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, View view) {
        Completable completable;
        CompositeDisposable compositeDisposable = this.a;
        if (z2) {
            completable = this.r.c();
        } else {
            completable = this.r.b();
        }
        compositeDisposable.a(completable.a((Action) $$Lambda$oun$Qv5YTG7FjQqKyfz3LYGmYXQzJUs.INSTANCE, (Consumer<? super Throwable>) $$Lambda$oun$iQeE6qkjTbRAC6z8hJrjDSVp_z4.INSTANCE));
        if (this.p.k()) {
            this.h.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz, boolean z2) {
        this.a.a(this.t.a(uyz.getUri(), z2).a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$oun$mcFYPsafATgQUwcI89lCF9x3trI<Object>(this, z2, uyz))).a(this.s).a((Action) new $$Lambda$oun$6HZg342z4cdQ3N00lmcN0zil3I(this, uyz), (Consumer<? super Throwable>) $$Lambda$oun$mJ7N5EEbVKi28_qZtAZidInrAOs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ CompletableSource a(boolean z2, uyz uyz) {
        if (z2) {
            return this.u.a(uyz.getUri(), false);
        }
        return Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(uyz uyz) {
        this.v.a(!uyz.g() ? R.string.playlist_toast_now_collaborative : R.string.playlist_toast_now_uncollaborative, 0, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(uyz uyz) {
        CompositeDisposable compositeDisposable = this.a;
        Completable a2 = this.u.b(uyz.getUri()).a(this.s);
        spi spi = this.f;
        spi.getClass();
        compositeDisposable.a(a2.a((Action) new $$Lambda$YmdIl9WAGP73nTxgMmIvPSjB6rI(spi), (Consumer<? super Throwable>) $$Lambda$oun$KkUcwVpsU6nnoqAoNdfSJaJNlw.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz, boolean z2, wlc wlc) {
        this.i.a(uyz.getUri(), z2);
        this.a.a((Disposable) wlc.get());
        if (!z2 && this.p.a()) {
            this.o.a(uos.a(this.b.getString(R.string.playlist_toolbar_toastie_playlist_saved_to_your_library), 3000).c(R.color.white).b(R.color.black).a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wlc wlc) {
        this.a.a((Disposable) wlc.get());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(uyz uyz) {
        this.n.a(true);
        this.i.d(uyz.getUri(), true);
        this.j.a(uyz.getUri(), SourceElement.OPTIONS_MENU, true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(uyz uyz) {
        this.n.a(false);
        this.i.d(uyz.getUri(), false);
        this.j.a(uyz.getUri(), SourceElement.OPTIONS_MENU, false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz, SpotifyUri spotifyUri, String str, String str2, fyt fyt, String str3) {
        this.i.e();
        ArrayList arrayList = new ArrayList(this.m.a());
        if (!uyz.i()) {
            arrayList.remove(AppShareDestination.SNAPCHAT_STORIES);
        }
        this.m.a(spotifyUri.toString(), !TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY, null, str2, fyt.a().getString(R.string.share_by_owner, new Object[]{str3}), null, jnu.a, arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz) {
        this.a.a(this.u.a(uyz.getUri(), !uyz.i()).a(this.s).a((Action) new $$Lambda$oun$buA7KlFSHEAtr2FE2FIpHzJQR7A(this, uyz), (Consumer<? super Throwable>) $$Lambda$oun$aop6tkhIUGB8Q2dWb2zpNt75M.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uyz uyz) {
        this.v.a(!uyz.i() ? R.string.playlist_toast_published : R.string.playlist_toast_unpublished, 0, new Object[0]);
    }

    public final void a(osi osi) {
        this.F = (osi) fav.a(osi, osi.a);
        fys fys = this.C;
        if (fys != null) {
            fys.c(true);
        }
        ap_();
    }

    public final void ap_() {
        fys fys = this.C;
        if (fys != null) {
            fys.a();
        }
    }

    public final fxn b() {
        return this.B;
    }
}
