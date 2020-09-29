package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: hph reason: default package */
public final class hph {
    private final CompositeDisposable a = new CompositeDisposable();
    private final hzo b;
    private final igf c;
    private final Scheduler d;
    private final igj e;
    private final ihv f;
    private final igo g;
    private final igm h;
    private boolean i;

    /* renamed from: hph$a */
    static class a implements Consumer<AdSlotEvent> {
        private final igm a;

        public a(igm igm) {
            this.a = igm;
        }

        public final /* synthetic */ void accept(Object obj) {
            AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
            if (adSlotEvent.getFormat() == Format.AUDIO) {
                this.a.accept(adSlotEvent);
            }
        }
    }

    public hph(igj igj, ihv ihv, igo igo, igm igm, igf igf, Scheduler scheduler, hzo hzo) {
        this.e = igj;
        this.f = ihv;
        this.b = hzo;
        this.g = igo;
        this.h = igm;
        this.c = igf;
        this.d = scheduler;
    }

    private Observable<Response> a(AdSlot adSlot) {
        return this.e.a(adSlot);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(AdSlotEvent adSlotEvent) {
        return Observable.b(adSlotEvent).a(adSlotEvent.getAd().isPreview() ? AndroidSchedulers.a() : this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(igf igf, Response response) {
        return igf.e.c((Consumer<? super Disposable>) $$Lambda$hph$pYB4XjvluvzWUaUNWm5u_fEguOw.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AdSlot adSlot, Response response) {
        if (response.getStatus() < 200 || response.getStatus() >= 300) {
            Logger.b("failed to register %s because %s", adSlot.slot_id, response.getBodyString());
        } else {
            Logger.c("registered adslot %s", adSlot.slot_id);
        }
        adSlot.onRegistered(this.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(AdSlotEvent adSlotEvent) {
        return Observable.b(adSlotEvent).a(adSlotEvent.getAd().isPreview() ? AndroidSchedulers.a() : this.d);
    }

    private void b(AdSlot adSlot) {
        this.a.a(a(adSlot).a((Consumer<? super T>) new $$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY<Object>(this, adSlot), (Consumer<? super Throwable>) new $$Lambda$hph$sscFlhu3hvnon9U7CyQ1aJqi0c<Object>(adSlot)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(AdSlotEvent adSlotEvent) {
        return Event.PLAY == adSlotEvent.getEvent();
    }

    public final void a() {
        this.i = true;
        Logger.b("AdSubscriptions are being destroyed.", new Object[0]);
        this.a.c();
    }

    public final void a(hle hle, boolean z, boolean z2) {
        fbp.a(hle);
        this.a.a(this.c.b.a((Predicate<? super T>) $$Lambda$hph$Vzh6_JBE5hJ_CpTqzNVE8UGYMWc.INSTANCE).a((Consumer<? super T>) new a<Object>(this.h), (Consumer<? super Throwable>) $$Lambda$hph$HgGZdGD50qzJDFkZJzcKNb_Rc.INSTANCE));
        if (hle.b) {
            b(AdSlot.PREROLL);
        }
        if (hle.a()) {
            b(AdSlot.WATCHNOW);
        }
        if (hle.c) {
            b(AdSlot.MIDROLL_WATCHNOW);
        }
        b(AdSlot.STREAM);
        igf igf = this.c;
        if (z) {
            this.a.a(a(AdSlot.MOBILE_SCREENSAVER).b((Consumer<? super T>) new $$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY<Object>(this, AdSlot.MOBILE_SCREENSAVER)).h(new $$Lambda$hph$PHqxVg8Gmb6egKzxK84Vd9Mzp0E(igf)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hph$kHnYYFcsG13gjt922kS6ENTZCE<Object,Object>(this), false).a((Consumer<? super T>) this.g, (Consumer<? super Throwable>) $$Lambda$hph$EUxUU_GDPc0VMlmgjcPLj2wctlk.INSTANCE));
        }
        igf igf2 = this.c;
        if (z2) {
            this.a.a(a(AdSlot.SPONSORED_PLAYLIST).b((Consumer<? super T>) new $$Lambda$hph$I8NZm2ybr9p4mcOrqBHeFteT_pY<Object>(this, AdSlot.SPONSORED_PLAYLIST)).h(new $$Lambda$hph$dbSN92ylOjoPadWMLnPNAhIy74U(this, igf2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hph$frg3ljsUa00nv_zNwKYTSqpasPU<Object,Object>(this), false).a((Consumer<? super T>) this.f, (Consumer<? super Throwable>) $$Lambda$hph$ANBQmj0yFVZltRPQgb3hizvi_8.INSTANCE));
        }
        this.i = false;
    }
}
