package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import com.spotify.music.ondemandsharing.OnDemandSharingUtils;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: mzv reason: default package */
public final class mzv implements rfp {
    public final CompositeDisposable a = new CompositeDisposable();
    private final mzg b;
    private final CollectionStateProvider c;
    private final kxc d;
    private final kxi e;
    private final rfk f;
    private final sih g;
    private final Scheduler h;
    private final rfd i;
    private final spi j;
    private final hbj k;
    private final iww l;
    private final tio m;
    private final sje n;
    private final tiu o;
    private final tcn p;
    private final kvk q;
    private final Flowable<PlayerState> r;
    private final Callable<Boolean> s;
    private gzz t;
    private final ToastieManager u;
    private uos v;

    public final void a(String str) {
    }

    public /* synthetic */ void a(String str, List<String> list) {
        CC.$default$a(this, str, list);
    }

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public mzv(mzg mzg, CollectionStateProvider collectionStateProvider, kxc kxc, kxi kxi, rfk rfk, sih sih, rfd rfd, spi spi, hbj hbj, iww iww, sje sje, tiu tiu, kvk kvk, Callable<Boolean> callable, Scheduler scheduler, tcn tcn, tio tio, ToastieManager toastieManager, Flowable<PlayerState> flowable) {
        this.b = (mzg) fay.a(mzg);
        this.c = (CollectionStateProvider) fay.a(collectionStateProvider);
        this.d = (kxc) fay.a(kxc);
        this.e = (kxi) fay.a(kxi);
        this.f = (rfk) fay.a(rfk);
        this.g = (sih) fay.a(sih);
        this.h = scheduler;
        this.i = (rfd) fay.a(rfd);
        this.j = (spi) fay.a(spi);
        this.k = (hbj) fay.a(hbj);
        this.l = (iww) fay.a(iww);
        this.n = (sje) fay.a(sje);
        this.q = (kvk) fay.a(kvk);
        this.s = callable;
        this.o = tiu;
        this.p = (tcn) fay.a(tcn);
        this.m = (tio) fay.a(tio);
        this.u = (ToastieManager) fay.a(toastieManager);
        this.r = flowable;
    }

    public final void a(nab nab, rfq rfq, String str, boolean z, Uri uri, String str2, uos uos) {
        Observable observable;
        nab nab2 = nab;
        String str3 = str;
        fay.a(nab);
        fay.a(rfq);
        fay.a(str);
        this.v = (uos) fay.a(uos);
        if (this.t == null) {
            nab.a();
        }
        if (!TextUtils.isEmpty(str2)) {
            this.a.a(tiw.a(this.r, this.g.toString()).a(this.h).a((Consumer<? super T>) new $$Lambda$mzv$Zq9ARw_OTNnHnvXRrsQufqvq7U<Object>(this, str3), (Consumer<? super Throwable>) new $$Lambda$mzv$9HZ1aF9VqB4raKttazM9_X1iXiY<Object>(nab)));
        }
        CompositeDisposable compositeDisposable = this.a;
        gzz gzz = this.t;
        if (gzz != null) {
            observable = Observable.b(gzz);
        } else {
            observable = vun.b(this.b.a((String) fay.a(str)).a((c<? super T, ? extends R>) this.i));
        }
        Observable a2 = Observable.a((ObservableSource<? extends T1>) observable, (ObservableSource<? extends T2>) this.c.a(this.g.toString(), str3, str3), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$mzv$vxsYjPxHHp_eeiho1sc60X9wAa4<Object,Object,Object>(str3)).a(this.h);
        $$Lambda$mzv$avyjhDwbWMMvlMerUfoQlEplkMM r0 = new $$Lambda$mzv$avyjhDwbWMMvlMerUfoQlEplkMM(this, nab, rfq, str2, str, uri, z);
        compositeDisposable.a(a2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$mzv$4MUDmy6pXzdNU2rG5hGTHUNNQWc<Object>(nab)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nab nab, rfq rfq, String str, String str2, Uri uri, boolean z, ho hoVar) {
        this.t = (gzz) fay.a(hoVar.a);
        nab.a(this.t);
        rfq.a((rfo) hoVar.b);
        if (!TextUtils.isEmpty(str)) {
            tiu tiu = this.o;
            gzz gzz = (gzz) hoVar.a;
            boolean z2 = false;
            Logger.b("FreeTierTrack trackUri- %s, ShareId- %s, ExternalReferrer- %s", str2, str, uri);
            gzt a2 = tiu.a(gzz);
            if (a2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
            if (!tiu.c && a2 != null) {
                if (tiu.b.a.a() && (!str.isEmpty()) && OnDemandSharingUtils.a(uri)) {
                    z2 = true;
                }
                if (z2) {
                    tiu.a.a(guy.a("click", a2));
                }
            }
            tiu.c = true;
        }
        if (z) {
            this.n.a((gzz) hoVar.a);
        }
        if (((Boolean) this.s.call()).booleanValue()) {
            kvk kvk = this.q;
            gzz gzz2 = this.t;
            a aVar = new a();
            aVar.b = kvy.a(gzz2);
            aVar.c = true;
            kvk.a.a(aVar.a());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, gzz gzz, Map map) {
        a aVar = (a) map.get(str);
        if (aVar != null) {
            return ho.a(gzz, rfo.a(gzz, aVar.a(), aVar.b(), false));
        }
        throw new RuntimeException("No collection state for track");
    }

    public final void a(String str, boolean z) {
        if (!z) {
            this.e.a(str, true);
        } else {
            this.e.a(str, str, true);
        }
        this.f.a(!z, str, str);
    }

    public final void b(String str, boolean z) {
        if (!z) {
            this.d.b(str, str, true);
        } else {
            this.d.a(str, str, true);
        }
        this.f.b(!z, str, str);
    }

    public final void b(String str) {
        this.j.a(str);
    }

    public final void c(String str) {
        this.k.a(Collections.singletonList(str), this.g.toString(), str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.l.a(str, str2, (String) null, str3, str4, (String) null, jnu.a);
        this.f.a(str, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, PlayerTrack playerTrack) {
        Logger.b("Current PlayerTrack: %s", playerTrack.uri());
        if (playerTrack != null && playerTrack.uri().equals(str)) {
            this.p.a();
            return;
        }
        this.u.a(this.v);
        tio tio = this.m;
        String sih = this.g.toString();
        bf bfVar = r5;
        bf bfVar2 = new bf(null, "track/social-play", sih, null, 0, null, LogMessage.SEVERITY_ERROR, "snackbar", (double) tio.b.a());
        tio.a.a(bfVar);
        Logger.a("Log banner error impression - TargetUri: %s", sih);
    }
}
