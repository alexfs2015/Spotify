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

/* renamed from: hmq reason: default package */
public final class hmq {
    private final CompositeDisposable a = new CompositeDisposable();
    private final hxc b;
    private final ids c;
    private final Scheduler d;
    private final idw e;
    private final ifi f;
    private final ieb g;
    private final idz h;
    private boolean i;

    /* renamed from: hmq$a */
    static class a implements Consumer<AdSlotEvent> {
        private final idz a;

        public final /* synthetic */ void accept(Object obj) {
            AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
            if (adSlotEvent.getFormat() == Format.AUDIO) {
                this.a.accept(adSlotEvent);
            }
        }

        public a(idz idz) {
            this.a = idz;
        }
    }

    public hmq(idw idw, ifi ifi, ieb ieb, idz idz, ids ids, Scheduler scheduler, hxc hxc) {
        this.e = idw;
        this.f = ifi;
        this.b = hxc;
        this.g = ieb;
        this.h = idz;
        this.c = ids;
        this.d = scheduler;
    }

    public final void a(hik hik, boolean z, boolean z2) {
        fay.a(hik);
        this.a.a(this.c.b.a((Predicate<? super T>) $$Lambda$hmq$F_JSpT3zTAsnBqqetIUMQ5Fiqsw.INSTANCE).a((Consumer<? super T>) new a<Object>(this.h), (Consumer<? super Throwable>) $$Lambda$hmq$LViEUw89tcg0N_57tZP1fGx79U.INSTANCE));
        if (hik.b) {
            b(AdSlot.PREROLL);
        }
        if (hik.a()) {
            b(AdSlot.WATCHNOW);
        }
        if (hik.c) {
            b(AdSlot.MIDROLL_WATCHNOW);
        }
        b(AdSlot.STREAM);
        ids ids = this.c;
        if (z) {
            this.a.a(a(AdSlot.MOBILE_SCREENSAVER).b((Consumer<? super T>) new $$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio<Object>(this, AdSlot.MOBILE_SCREENSAVER)).h(new $$Lambda$hmq$YYlLFvtSmgoy3Ev7ScUVrqknyo(ids)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hmq$ElE3TrotJMPMVWQKCYC85gU58Y<Object,Object>(this), false).a((Consumer<? super T>) this.g, (Consumer<? super Throwable>) $$Lambda$hmq$zm5e4mzO6W0rQc6_BnsXf0I7JAo.INSTANCE));
        }
        ids ids2 = this.c;
        if (z2) {
            this.a.a(a(AdSlot.SPONSORED_PLAYLIST).b((Consumer<? super T>) new $$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio<Object>(this, AdSlot.SPONSORED_PLAYLIST)).h(new $$Lambda$hmq$Tit2XtItpVNO8qxOhKdj3MvLkA(this, ids2)).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hmq$7_lQ0Y9wjaAnMTHG6d7WDC6YAg<Object,Object>(this), false).a((Consumer<? super T>) this.f, (Consumer<? super Throwable>) $$Lambda$hmq$NOyINM8zfiawIXcBcV492CQ9K2M.INSTANCE));
        }
        this.i = false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean c(AdSlotEvent adSlotEvent) {
        return Event.PLAY == adSlotEvent.getEvent();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(AdSlotEvent adSlotEvent) {
        return Observable.b(adSlotEvent).a(adSlotEvent.getAd().isPreview() ? AndroidSchedulers.a() : this.d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(AdSlotEvent adSlotEvent) {
        return Observable.b(adSlotEvent).a(adSlotEvent.getAd().isPreview() ? AndroidSchedulers.a() : this.d);
    }

    private Observable<Response> a(AdSlot adSlot) {
        return this.e.a(adSlot);
    }

    private void b(AdSlot adSlot) {
        this.a.a(a(adSlot).a((Consumer<? super T>) new $$Lambda$hmq$p10K80_FqBaCyEN7GOZiZ5vnzio<Object>(this, adSlot), (Consumer<? super Throwable>) new $$Lambda$hmq$zrMOTnzlElLt2fpl6FA_Y4RqfAw<Object>(adSlot)));
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

    public final void a() {
        this.i = true;
        Logger.b("AdSubscriptions are being destroyed.", new Object[0]);
        this.a.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(ids ids, Response response) {
        return ids.e.c((Consumer<? super Disposable>) $$Lambda$hmq$lrJDB87uoHNLcTdu7TsByeH2y8A.INSTANCE);
    }
}
