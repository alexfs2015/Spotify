package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: ibt reason: default package */
public final class ibt implements ibu {
    private final hzr a;
    private final SlotApi b;
    private final tvm c;
    private final Scheduler d;
    private final CompositeDisposable e = new CompositeDisposable();

    public ibt(hzr hzr, SlotApi slotApi, tvm tvm, Scheduler scheduler) {
        this.a = hzr;
        this.b = slotApi;
        this.c = tvm;
        this.d = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        Logger.b(" success for %s slot and skip to next track (video)", str);
        this.c.a();
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        String id = ad.id();
        CompositeDisposable compositeDisposable = this.e;
        hzr hzr = this.a;
        long longValue = l.longValue();
        String str = "clicked";
        compositeDisposable.a(hzr.a(str, id, longValue, null).a((Action) new $$Lambda$ibt$hIDHODKCZsDAbqa92rbRviFzxTU(str, id), (Consumer<? super Throwable>) new $$Lambda$ibt$W8EPuAh5_Lo18wUZoobjPOCBfJQ<Object>(str, id)));
        String dependentSlot = ad.getDependentSlot();
        Logger.b("acceptOptInOffer (video)", new Object[0]);
        if (dependentSlot == null) {
            dependentSlot = "watchnow";
        }
        this.e.a(this.b.a(dependentSlot, Intent.NEXT_TRACK).a(this.d).a((Action) new $$Lambda$ibt$I4PWffONMO7iwdeYGcABXwQGoEc(this, dependentSlot), (Consumer<? super Throwable>) new $$Lambda$ibt$NFjQZgPWVUhgmzWnoAa3lg1uzls<Object>(dependentSlot)));
    }
}
