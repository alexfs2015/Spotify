package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: hzl reason: default package */
public final class hzl implements hzi {
    private final SlotApi a;
    private final hxf b;
    private final tju c;
    private final Scheduler d;
    private final CompositeDisposable e = new CompositeDisposable();

    public hzl(SlotApi slotApi, hxf hxf, tju tju, Scheduler scheduler) {
        this.a = slotApi;
        this.b = hxf;
        this.c = tju;
        this.d = scheduler;
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        String id = ad.id();
        CompositeDisposable compositeDisposable = this.e;
        hxf hxf = this.b;
        long longValue = l.longValue();
        String str = "clicked";
        compositeDisposable.a(hxf.a(str, id, longValue, null).a((Action) new $$Lambda$hzl$T_XvkaykHbVqlNH8i18Xta805Bs(str, id), (Consumer<? super Throwable>) new $$Lambda$hzl$qkO0kkJVF6YXLuxfZFYSVDsA2Qo<Object>(str, id)));
        String dependentSlot = ad.getDependentSlot() != null ? ad.getDependentSlot() : "watchnow";
        this.e.a(this.a.a(dependentSlot, Intent.CLEAR).a(this.d).a((Action) new $$Lambda$hzl$NYhRCtIWeg92evIV54RNid8mgiU(this, dependentSlot), (Consumer<? super Throwable>) new $$Lambda$hzl$9RnrZCUa3_ji7H3pP3Zuii7rF7Q<Object>(dependentSlot)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        Logger.b("rejectOptOutOffer success for %s slot and advance to next track", str);
        this.c.a();
    }
}
