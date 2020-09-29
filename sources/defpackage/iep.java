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

/* renamed from: iep reason: default package */
public final class iep implements Consumer<AdSlotEvent> {
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
    private final vst k;
    private final vst l;
    private final hxi m;
    private final SlotApi n;
    private final idq o;
    private final hzf p;
    private final Scheduler q;
    private final vti<Picasso> r;
    private final Scheduler s;
    /* access modifiers changed from: private */
    public Ad t;
    private Disposable u;
    private Disposable v;

    /* renamed from: iep$a */
    public interface a {
        void render(Ad ad);
    }

    public iep(Context context, hxi hxi, SlotApi slotApi, vti<Picasso> vti, idq idq, hzf hzf, Scheduler scheduler, Scheduler scheduler2) {
        this.a = context;
        this.m = hxi;
        this.n = slotApi;
        this.o = idq;
        this.p = hzf;
        this.q = scheduler;
        this.r = vti;
        this.s = scheduler2;
        this.d = true;
        this.k = new iew();
        this.l = new ieu();
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

    /* access modifiers changed from: private */
    public Observable<Long> a(long j2) {
        return Observable.a(j2, TimeUnit.MILLISECONDS, this.q);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a(AdSettingsModel adSettingsModel) {
        List<AdSettings> list = adSettingsModel.settings;
        if (list == null || list.isEmpty() || ((AdSettings) list.get(0)).display_time_interval == null) {
            return Long.valueOf(h);
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis((long) ((AdSettings) list.get(0)).display_time_interval.intValue()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Long l2) {
        this.j.onNext(l2);
        a(Intent.FETCH, "fetchAdFromSlot");
    }

    public final void d() {
        Disposable disposable = this.u;
        if (disposable != null && !disposable.b()) {
            this.u.bf_();
        }
    }

    public final void e() {
        Disposable disposable = this.v;
        if (disposable != null && !disposable.b()) {
            this.v.bf_();
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
                c((Ad) fay.a(this.t));
            }
        } else if (Event.DISCARD == adSlotEvent.getEvent()) {
            boolean f2 = f();
            this.t = null;
            if (f2) {
                a(Intent.FETCH, "fetchAdFromSlot");
            }
        }
    }

    private static boolean b(Ad ad) {
        return ad.getImages().isEmpty();
    }

    private void c(Ad ad) {
        if (!b(ad)) {
            a(ad).a((vrt) new vrt() {
                public final void a() {
                }

                public final void b() {
                    iep.this.t = null;
                }
            });
        }
    }

    public final vsl a(Ad ad) {
        vsl a2 = ((Picasso) this.r.get()).a(Uri.parse(((Image) ad.getImages().get(0)).getUrl()));
        if (!this.e || !ad.isProgrammatic()) {
            a2.a(this.k);
        } else {
            a2.a(this.l);
        }
        return a2.a();
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

    private void a(Intent intent, String str) {
        String slotId = AdSlot.MOBILE_SCREENSAVER.getSlotId();
        this.b.a(this.n.a(slotId, intent).a((Action) new $$Lambda$iep$7iGMMHJ9_JywvJyhDNMsv5f3Jg(str, slotId), (Consumer<? super Throwable>) new $$Lambda$iep$7FWK15UuzxO0_S3jokDHg7cOPg<Object>(str, slotId)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getFormat() == Format.AUDIO;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ho hoVar) {
        return (hoVar == null || hoVar.a == null || hoVar.b == null || ((Long) hoVar.b).longValue() != 0) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ho hoVar) {
        return a(i);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Long l2) {
        a(Intent.FETCH, "fetchAudioPlusLeaveBehind");
    }

    public final void b() {
        if (!this.c || !this.f || f()) {
            if (this.c && !f()) {
                d();
                AdSlot.MOBILE_SCREENSAVER.registerAdRequest(new $$Lambda$64BwZaoT1hU8NoZoQm0VFHeAvI4(this));
            }
            return;
        }
        e();
        AdSlot.MOBILE_SCREENSAVER.registerAdRequest(new $$Lambda$iep$mRBApNBN3R_RkD4KmXR0p5oVMs(this));
    }

    public final void c() {
        this.u = this.m.a(AdSlot.MOBILE_SCREENSAVER.getSlotId()).c((Function<? super T, ? extends R>) $$Lambda$iep$WA2_kTf0N2SWsPgotyF3kCxEqY.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$iep$0U_7CbMxHb8_4kTHVDpRFJXVwA.INSTANCE).h(new $$Lambda$iep$1BOtc3ImNckDYQzYXkYvEaeJIKE(this)).a((Consumer<? super T>) new $$Lambda$iep$GhHZCqY__ivG5CgXLMEOpfH5Rs<Object>(this), (Consumer<? super Throwable>) $$Lambda$iep$Be92EyMErm8f1aiOT8epsPcel4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i() {
        this.v = this.o.a.a((Predicate<? super T>) $$Lambda$iep$Gnhrtrdpp_0G7JTjvqWjQXkNmhs.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$y09uTlzqWf9z13tnhMZHRgtj_A.INSTANCE).a((Predicate<? super T>) $$Lambda$itys36exX590bsByaF0JdfZzrt8.INSTANCE).a(Functions.a()).b(this.q).a(this.s).a((ObservableSource<? extends U>) this.j, (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$onlb2BWUr_4tONNyjg0QLRlPTlA.INSTANCE).a((Predicate<? super T>) $$Lambda$iep$6MLCxwN4bL6LKqcYuzWEhfdqX5k.INSTANCE).h(new $$Lambda$iep$4e_DLiJ1ec8FjqaJv9fT_785fbY(this)).a((Consumer<? super T>) new $$Lambda$iep$iz9Itccle_QHAqjp86pR5vLdak<Object>(this), (Consumer<? super Throwable>) $$Lambda$iep$lq8JGjNBmsSKgSKfKVNoB8mFQ4w.INSTANCE);
        c();
    }
}
