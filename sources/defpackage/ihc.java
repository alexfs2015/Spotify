package defpackage;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi.Intent;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSettingsModel;
import com.spotify.mobile.android.spotlets.ads.model.AdSettingsModel.AdSettings;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.spotlets.ads.model.Image;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ihc reason: default package */
public final class ihc implements Consumer<AdSlotEvent> {
    private static long h = TimeUnit.MINUTES.toMillis(5);
    private static long i = TimeUnit.SECONDS.toMillis(155);
    public final Context a;
    public final CompositeDisposable b = new CompositeDisposable();
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public a g;
    private final PublishSubject<Long> j = PublishSubject.a();
    private final wgz k;
    private final wgz l;
    private final hzu m;
    private final SlotApi n;
    private final igd o;
    private final ibr p;
    private final Scheduler q;
    private final who<Picasso> r;
    private final Scheduler s;
    /* access modifiers changed from: private */
    public Ad t;
    private Disposable u;
    private Disposable v;

    /* renamed from: ihc$a */
    public interface a {
        void render(Ad ad);
    }

    public ihc(Context context, hzu hzu, SlotApi slotApi, who<Picasso> who, igd igd, ibr ibr, Scheduler scheduler, Scheduler scheduler2) {
        this.a = context;
        this.m = hzu;
        this.n = slotApi;
        this.o = igd;
        this.p = ibr;
        this.q = scheduler;
        this.r = who;
        this.s = scheduler2;
        this.d = true;
        this.k = new ihj();
        this.l = new ihh();
    }

    /* access modifiers changed from: private */
    public Observable<Long> a(long j2) {
        return Observable.a(j2, TimeUnit.MILLISECONDS, this.q);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ho hoVar) {
        return a(i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(AdSettingsModel adSettingsModel) {
        List<AdSettings> list = adSettingsModel.settings;
        return (list == null || list.isEmpty() || ((AdSettings) list.get(0)).display_time_interval == null) ? Long.valueOf(h) : Long.valueOf(TimeUnit.SECONDS.toMillis((long) ((AdSettings) list.get(0)).display_time_interval.intValue()));
    }

    private void a(Intent intent, String str) {
        String slotId = AdSlot.MOBILE_SCREENSAVER.getSlotId();
        this.b.a(this.n.a(slotId, intent).a((Action) new $$Lambda$ihc$5ILzoh7c7bSc_DX1pdIfpURuVJs(str, slotId), (Consumer<? super Throwable>) new $$Lambda$ihc$e5HHgao4MeR4jqnKCfKi_JVd5rU<Object>(str, slotId)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        a(Intent.FETCH, "fetchAudioPlusLeaveBehind");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Long l2) {
        this.j.onNext(l2);
        a(Intent.FETCH, "fetchAdFromSlot");
    }

    private static boolean b(Ad ad) {
        return ad.getImages().isEmpty();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.AUDIO;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ho hoVar) {
        return (hoVar == null || hoVar.a == null || hoVar.b == null || ((Long) hoVar.b).longValue() != 0) ? false : true;
    }

    private void c(Ad ad) {
        if (!b(ad)) {
            a(ad).a((wfz) new wfz() {
                public final void a() {
                }

                public final void b() {
                    ihc.this.t = null;
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.v = this.o.a.a((Predicate<? super T>) $$Lambda$ihc$jAxED0oDiHFzBjV5kT8PnqoNp9M.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a((Predicate<? super T>) $$Lambda$itys36exX590bsByaF0JdfZzrt8.INSTANCE).a(Functions.a()).b(this.q).a(this.s).a((ObservableSource<? extends U>) this.j, (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$onlb2BWUr_4tONNyjg0QLRlPTlA.INSTANCE).a((Predicate<? super T>) $$Lambda$ihc$EIGnTE8RQ9aTr9GDw4ga4ym9WU.INSTANCE).h(new $$Lambda$ihc$qrkeArmLGhht2ovsZBKndEJQwBE(this)).a((Consumer<? super T>) new $$Lambda$ihc$C8IT5wCJRLsYht8N8t1SGIOzyp8<Object>(this), (Consumer<? super Throwable>) $$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9Pyfs.INSTANCE);
        c();
    }

    public final wgr a(Ad ad) {
        wgr a2 = ((Picasso) this.r.get()).a(Uri.parse(((Image) ad.getImages().get(0)).getUrl()));
        if (!this.e || !ad.isProgrammatic()) {
            a2.a(this.k);
        } else {
            a2.a(this.l);
        }
        return a2.a();
    }

    public final void a() {
        a(Intent.NOW, "triggerNextAdOnSlot");
        Ad ad = this.t;
        if (ad != null) {
            if (b(ad)) {
                Logger.b("Consumed dummy ad", new Object[0]);
            } else {
                this.g.render(ad);
            }
            this.t = null;
        }
    }

    /* renamed from: a */
    public void accept(AdSlotEvent adSlotEvent) {
        if (Event.AVAILABLE == adSlotEvent.getEvent()) {
            Ad ad = adSlotEvent.getAd();
            this.t = ad;
            if (ad.isPreview()) {
                a();
            } else {
                c((Ad) fbp.a(this.t));
            }
        } else if (Event.DISCARD == adSlotEvent.getEvent()) {
            boolean f2 = f();
            this.t = null;
            if (f2) {
                a(Intent.FETCH, "fetchAdFromSlot");
            }
        }
    }

    public final void b() {
        if (!this.c || !this.f || f()) {
            if (this.c && !f()) {
                d();
                AdSlot.MOBILE_SCREENSAVER.registerAdRequest(new $$Lambda$mz_0fhdAN38_JGy7_iUss1dSbf8(this));
            }
            return;
        }
        e();
        AdSlot.MOBILE_SCREENSAVER.registerAdRequest(new $$Lambda$ihc$3jjjWbsloHU6gZahVlwV85a79g4(this));
    }

    public final void c() {
        this.u = this.m.a(AdSlot.MOBILE_SCREENSAVER.getSlotId()).c((Function<? super T, ? extends R>) $$Lambda$ihc$SknOYPBidD1NopyeTk6NChGQl0.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$ihc$bBvYWUNAwDpw9DId9QxdjKykrhk.INSTANCE).h(new $$Lambda$ihc$lTz45b9Ospp3d0_w9ycHJpzbTQ(this)).a((Consumer<? super T>) new $$Lambda$ihc$1uYJWmpYv6vkq_P8yMjVH3_6iQw<Object>(this), (Consumer<? super Throwable>) $$Lambda$ihc$_XAhsBs5evBjKZkkON8ciEMipfU.INSTANCE);
    }

    public final void d() {
        Disposable disposable = this.u;
        if (disposable != null && !disposable.b()) {
            this.u.bd_();
        }
    }

    public final void e() {
        Disposable disposable = this.v;
        if (disposable != null && !disposable.b()) {
            this.v.bd_();
        }
    }

    public final boolean f() {
        return this.t != null;
    }

    public final boolean g() {
        return this.a.getResources().getConfiguration().orientation == 1;
    }

    public final boolean h() {
        return this.g != null;
    }
}
