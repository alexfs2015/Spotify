package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: hzh reason: default package */
public final class hzh implements hzi {
    private final hxf a;
    private final SlotApi b;
    private final tju c;
    private final Scheduler d;
    private final CompositeDisposable e = new CompositeDisposable();

    public hzh(hxf hxf, SlotApi slotApi, tju tju, Scheduler scheduler) {
        this.a = hxf;
        this.b = slotApi;
        this.c = tju;
        this.d = scheduler;
    }

    /* renamed from: a */
    public final void accept(Ad ad, Long l) {
        String id = ad.id();
        CompositeDisposable compositeDisposable = this.e;
        hxf hxf = this.a;
        long longValue = l.longValue();
        String str = "clicked";
        compositeDisposable.a(hxf.a(str, id, longValue, null).a((Action) new $$Lambda$hzh$tXjQqpAEqnaYzjYzvwVLkPZWuac(str, id), (Consumer<? super Throwable>) new $$Lambda$hzh$2jMZHC5XQw81jljrxt7fT0F1A0E<Object>(str, id)));
        String dependentSlot = ad.getDependentSlot();
        Logger.b("acceptOptInOffer (video)", new Object[0]);
        if (dependentSlot == null) {
            dependentSlot = "watchnow";
        }
        this.e.a(this.b.a(dependentSlot, Intent.NEXT_TRACK).a(this.d).a((Action) new $$Lambda$hzh$vzxCkFNjFCbdPeyIacMEqQO_8o(this, dependentSlot), (Consumer<? super Throwable>) new $$Lambda$hzh$gWTwEdRPNv2gGUv0DhHnVA5N8s<Object>(dependentSlot)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        Logger.b(" success for %s slot and skip to next track (video)", str);
        this.c.a();
    }
}
