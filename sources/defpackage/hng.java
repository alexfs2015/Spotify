package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader;
import com.spotify.mobile.android.service.media.browser.loaders.browse.SpaceItemsMediaItemLoader.ContentModel;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hng reason: default package */
public final class hng implements hni, jpb {
    private final Context a;
    private final hou b;
    private final hoz c;
    private final hmo d;
    private final RxResolver e;
    private final Scheduler f;
    private final hry g;
    private final hsn h;
    private final hpb i;
    private final CompositeDisposable j = new CompositeDisposable();
    private final BehaviorSubject<Boolean> k = BehaviorSubject.a();
    private final gsy l;
    private final Set<hpx> m;
    private final Map<String, hqx> n = new HashMap(10);
    private hpd[] o;
    private fpt p = new fpx("No flags available yet");
    private final jrp q;
    private String r;

    public hng(Context context, hmo hmo, hou hou, hoz hoz, RxResolver rxResolver, Scheduler scheduler, hry hry, hsn hsn, hpb hpb, jrp jrp, gsy gsy, Set<hpx> set) {
        this.a = context;
        this.c = hoz;
        this.d = hmo;
        this.b = hou;
        this.e = rxResolver;
        this.f = scheduler;
        this.g = hry;
        this.h = hsn;
        this.i = hpb;
        this.q = jrp;
        this.l = gsy;
        this.m = set;
    }

    public final void a(SessionState sessionState, htk htk) {
        this.r = sessionState.countryCode();
        if (this.o == null) {
            String countryCode = sessionState.countryCode();
            String currentUser = sessionState.currentUser();
            hpd[] hpdArr = new hpd[8];
            hpdArr[0] = htk.a();
            hpdArr[1] = this.h;
            hry hry = this.g;
            String str = countryCode;
            hpd[] hpdArr2 = hpdArr;
            String str2 = currentUser;
            SpaceItemsMediaItemLoader spaceItemsMediaItemLoader = new SpaceItemsMediaItemLoader(hry.a, hry.b, "/vanilla/v1/views/hub2/android-auto", countryCode, currentUser, hry.c, hry.d, hry.e, hry.f, hry.g, "com.spotify.home", ContentModel.STACK_SPACE, false, null);
            hpdArr2[2] = spaceItemsMediaItemLoader;
            hry hry2 = this.g;
            String str3 = str;
            String str4 = str2;
            SpaceItemsMediaItemLoader spaceItemsMediaItemLoader2 = new SpaceItemsMediaItemLoader(hry2.a, hry2.b, "/vanilla/v1/views/hub2/waze", str3, str4, hry2.c, hry2.d, hry2.e, hry2.f, hry2.g, "com.spotify.waze", ContentModel.COMPOSITE_SPACE, false, null);
            hpdArr2[3] = spaceItemsMediaItemLoader2;
            hry hry3 = this.g;
            SpaceItemsMediaItemLoader spaceItemsMediaItemLoader3 = new SpaceItemsMediaItemLoader(hry3.a, hry3.b, "/vanilla/v1/views/hub2/partner-wake", str3, str4, hry3.c, hry3.d, hry3.e, hry3.f, hry3.g, "com.spotify.wake", ContentModel.STACK_SPACE, false, null);
            hpdArr2[4] = spaceItemsMediaItemLoader3;
            hry hry4 = this.g;
            SpaceItemsMediaItemLoader spaceItemsMediaItemLoader4 = new SpaceItemsMediaItemLoader(hry4.a, hry4.b, "/vanilla/v1/views/hub2/partner-sleep", str3, str4, hry4.c, hry4.d, hry4.e, hry4.f, hry4.g, "com.spotify.sleep", ContentModel.STACK_SPACE, false, null);
            hpdArr2[5] = spaceItemsMediaItemLoader4;
            hpdArr2[6] = new hsq(this.e, str2, this.i);
            hsp hsp = new hsp(this.a, new rxj(this.e), this.l, new gkd(this.q), this.i);
            hpdArr2[7] = hsp;
            this.o = hpdArr2;
            this.c.a(this.o);
        }
        this.k.onNext(Boolean.TRUE);
    }

    public final void a() {
        this.j.c();
        this.k.onNext(Boolean.FALSE);
        hpd[] hpdArr = this.o;
        if (hpdArr != null) {
            this.c.b(hpdArr);
            this.o = null;
        }
        hmo hmo = this.d;
        for (a a2 : hmo.b.values()) {
            a2.a();
        }
        hmo.b.clear();
        hoz hoz = this.c;
        synchronized (hoz.a) {
            for (hpd a3 : hoz.c) {
                a3.a();
            }
            hoz.b.removeCallbacksAndMessages(null);
        }
    }

    public final void a(hnd hnd, Bundle bundle, hpe hpe, long j2, long j3, String str) {
        hpx hpx;
        String a2 = hnd.a();
        hqx hqx = (hqx) this.n.get(a2);
        if (hqx == null) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hpx = null;
                    break;
                }
                hpx = (hpx) it.next();
                if (hpx.a(a2)) {
                    break;
                }
            }
            if (hpx != null) {
                hqx = hpx.a();
                this.n.put(a2, hqx);
            }
        }
        if (hqx == null) {
            CompositeDisposable compositeDisposable = this.j;
            Observable c2 = this.k.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).c(1);
            $$Lambda$hng$K1Q0iG5ECUVdIoRfHNwhRAp6MWg r0 = new $$Lambda$hng$K1Q0iG5ECUVdIoRfHNwhRAp6MWg(this, hnd, bundle, hpe, str, j2, j3);
            compositeDisposable.a(c2.a((Consumer<? super T>) r0, (Consumer<? super Throwable>) $$Lambda$hng$UOk6tM6Ukax5bz8JSkgV3yZ_rEQ.INSTANCE));
            return;
        }
        CompositeDisposable compositeDisposable2 = this.j;
        Observable c3 = this.k.a((Predicate<? super T>) $$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).c(1);
        hnd hnd2 = hnd;
        $$Lambda$hng$kURYYdiLV00zNlmhwWyNTsbek r2 = new $$Lambda$hng$kURYYdiLV00zNlmhwWyNTsbek(this, hnd, hqx);
        ObjectHelper.a(r2, "mapper is null");
        Observable a3 = RxJavaPlugins.a((Observable<T>) new ObservableSwitchMapSingle<T>(c3, r2, false)).a(this.f);
        $$Lambda$hng$gsNQiWrIbsyeENvwysV2UrH8x4Y r02 = new $$Lambda$hng$gsNQiWrIbsyeENvwysV2UrH8x4Y(this, hpe, str, hnd2, j2, j3);
        compositeDisposable2.a(a3.a((Consumer<? super T>) r02, (Consumer<? super Throwable>) new $$Lambda$hng$xQeurPV8l07MmYgFwyzTlbLfibc<Object>(hpe)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hnd hnd, Bundle bundle, hpe hpe, String str, long j2, long j3, Boolean bool) {
        Bundle bundle2 = bundle;
        hpe hpe2 = hpe;
        this.c.a(hnd.a(), bundle, hpe);
        this.b.a(str, hnd.a(), j2, j3);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(hpe hpe, String str, hnd hnd, long j2, long j3, List list) {
        hpe.a(list);
        this.b.a(str, hnd.a(), j2, j3);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(hpe hpe, Throwable th) {
        hpe.a(Collections.emptyList());
        Logger.e(th, "error loading data", new Object[0]);
    }

    public final void a(fpt fpt) {
        fay.a(fpt);
        this.p = fpt;
        this.c.d = fpt;
    }

    public final fpt b() {
        return this.p;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(hnd hnd, hqx hqx, Boolean bool) {
        return hqx.a(hnd, this.r);
    }
}
