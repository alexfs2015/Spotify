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

/* renamed from: nfc reason: default package */
public final class nfc implements ror {
    public final CompositeDisposable a = new CompositeDisposable();
    private final nen b;
    private final CollectionStateProvider c;
    private final lal d;
    private final lar e;
    private final rom f;
    private final sso g;
    private final Scheduler h;
    private final rof i;
    private final szp j;
    private final hec k;
    private final izh l;
    private final ttg m;
    private final stl n;
    private final ttm o;
    private final tmu p;
    private final kyt q;
    private final Flowable<PlayerState> r;
    private final Callable<Boolean> s;
    private hcs t;
    private final ToastieManager u;
    private uzy v;

    public nfc(nen nen, CollectionStateProvider collectionStateProvider, lal lal, lar lar, rom rom, sso sso, rof rof, szp szp, hec hec, izh izh, stl stl, ttm ttm, kyt kyt, Callable<Boolean> callable, Scheduler scheduler, tmu tmu, ttg ttg, ToastieManager toastieManager, Flowable<PlayerState> flowable) {
        this.b = (nen) fbp.a(nen);
        this.c = (CollectionStateProvider) fbp.a(collectionStateProvider);
        this.d = (lal) fbp.a(lal);
        this.e = (lar) fbp.a(lar);
        this.f = (rom) fbp.a(rom);
        this.g = (sso) fbp.a(sso);
        this.h = scheduler;
        this.i = (rof) fbp.a(rof);
        this.j = (szp) fbp.a(szp);
        this.k = (hec) fbp.a(hec);
        this.l = (izh) fbp.a(izh);
        this.n = (stl) fbp.a(stl);
        this.q = (kyt) fbp.a(kyt);
        this.s = callable;
        this.o = ttm;
        this.p = (tmu) fbp.a(tmu);
        this.m = (ttg) fbp.a(ttg);
        this.u = (ToastieManager) fbp.a(toastieManager);
        this.r = flowable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, hcs hcs, Map map) {
        a aVar = (a) map.get(str);
        if (aVar != null) {
            return ho.a(hcs, roq.a(hcs, aVar.a(), aVar.b(), false));
        }
        throw new RuntimeException("No collection state for track");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, PlayerTrack playerTrack) {
        Logger.b("Current PlayerTrack: %s", playerTrack.uri());
        if (playerTrack != null && playerTrack.uri().equals(str)) {
            this.p.a();
            return;
        }
        this.u.a(this.v);
        ttg ttg = this.m;
        String sso = this.g.toString();
        be beVar = r5;
        be beVar2 = new be(null, "track/social-play", sso, null, 0, null, LogMessage.SEVERITY_ERROR, "snackbar", (double) ttg.b.a());
        ttg.a.a(beVar);
        Logger.a("Log banner error impression - TargetUri: %s", sso);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nfi nfi, ros ros, String str, String str2, Uri uri, boolean z, ho hoVar) {
        this.t = (hcs) fbp.a(hoVar.a);
        nfi.a(this.t);
        ros.a((roq) hoVar.b);
        if (!TextUtils.isEmpty(str)) {
            ttm ttm = this.o;
            hcs hcs = (hcs) hoVar.a;
            boolean z2 = false;
            Logger.b("FreeTierTrack trackUri- %s, ShareId- %s, ExternalReferrer- %s", str2, str, uri);
            hcm a2 = ttm.a(hcs);
            if (a2 == null) {
                Logger.e("Can't find shuffle button view model.", new Object[0]);
            }
            if (!ttm.c && a2 != null) {
                if (ttm.b.a.a() && (!str.isEmpty()) && OnDemandSharingUtils.a(uri)) {
                    z2 = true;
                }
                if (z2) {
                    ttm.a.a(gwy.a("click", a2));
                }
            }
            ttm.c = true;
        }
        if (z) {
            this.n.a((hcs) hoVar.a);
        }
        if (((Boolean) this.s.call()).booleanValue()) {
            kyt kyt = this.q;
            hcs hcs2 = this.t;
            a aVar = new a();
            aVar.b = kzh.a(hcs2);
            aVar.c = true;
            kyt.a.a(aVar.a());
        }
    }

    public final void a(String str) {
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.l.a(str, str2, (String) null, str3, str4, (String) null, jqg.a);
        this.f.a(str, null);
    }

    public /* synthetic */ void a(String str, List<String> list) {
        CC.$default$a(this, str, list);
    }

    public final void a(String str, boolean z) {
        if (!z) {
            this.e.a(str, true);
        } else {
            this.e.a(str, str, true);
        }
        this.f.a(!z, str, str);
    }

    public final void a(nfi nfi, ros ros, String str, boolean z, Uri uri, String str2, uzy uzy) {
        nfi nfi2 = nfi;
        String str3 = str;
        fbp.a(nfi);
        fbp.a(ros);
        fbp.a(str);
        this.v = (uzy) fbp.a(uzy);
        if (this.t == null) {
            nfi.a();
        }
        if (!TextUtils.isEmpty(str2)) {
            this.a.a(tto.a(this.r, this.g.toString()).a(this.h).a((Consumer<? super T>) new $$Lambda$nfc$4Fq3c9bkPmeiSbtjlPDMbnzGGTI<Object>(this, str3), (Consumer<? super Throwable>) new $$Lambda$nfc$TFz5kl12yspLo4Xl9dTxPlnfaQ<Object>(nfi)));
        }
        CompositeDisposable compositeDisposable = this.a;
        hcs hcs = this.t;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) hcs != null ? Observable.b(hcs) : wit.b(this.b.a((String) fbp.a(str)).a((c<? super T, ? extends R>) this.i)), (ObservableSource<? extends T2>) this.c.a(this.g.toString(), str3, str3), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$nfc$bxnTEMNeI_MzCDGttzguzY2DaUI<Object,Object,Object>(str3)).a(this.h);
        $$Lambda$nfc$k4qwV3y2ZJCRF8x6T7VZNWqUoM r0 = new $$Lambda$nfc$k4qwV3y2ZJCRF8x6T7VZNWqUoM(this, nfi, ros, str2, str, uri, z);
        compositeDisposable.a(a2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) new $$Lambda$nfc$g_j4U1sIiOa2QQRGJ6tfaRBri_k<Object>(nfi)));
    }

    public /* synthetic */ void a(boolean z) {
        CC.$default$a(this, z);
    }

    public final void b(String str) {
        this.j.a(str);
    }

    public final void b(String str, boolean z) {
        if (!z) {
            this.d.b(str, str, true);
        } else {
            this.d.a(str, str, true);
        }
        this.f.b(!z, str, str);
    }

    public final void c(String str) {
        this.k.a(Collections.singletonList(str), this.g.toString(), str);
    }
}
