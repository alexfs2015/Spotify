package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: ibx reason: default package */
public final class ibx implements ibu {
    private final SlotApi a;
    private final hzr b;
    private final tvm c;
    private final Scheduler d;
    private final CompositeDisposable e = new CompositeDisposable();

    public ibx(SlotApi slotApi, hzr hzr, tvm tvm, Scheduler scheduler) {
        this.a = slotApi;
        this.b = hzr;
        this.c = tvm;
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        Logger.b("rejectOptOutOffer success for %s slot and advance to next track", str);
        this.c.a();
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        String id = ad.id();
        CompositeDisposable compositeDisposable = this.e;
        hzr hzr = this.b;
        long longValue = l.longValue();
        String str = "clicked";
        compositeDisposable.a(hzr.a(str, id, longValue, null).a((Action) new $$Lambda$ibx$KTiXZVpjWFOKDwYCrST0_yWgoE(str, id), (Consumer<? super Throwable>) new $$Lambda$ibx$oH6PtinslJ8vxkQKtgK1ZJ_e2ug<Object>(str, id)));
        String dependentSlot = ad.getDependentSlot() != null ? ad.getDependentSlot() : "watchnow";
        this.e.a(this.a.a(dependentSlot, Intent.CLEAR).a(this.d).a((Action) new $$Lambda$ibx$nIzqaZmWhkLZIOCkEDAHsq3Xik(this, dependentSlot), (Consumer<? super Throwable>) new $$Lambda$ibx$b2VrlFTi46tb7xewJG9tqoDEKI8<Object>(dependentSlot)));
    }
}
