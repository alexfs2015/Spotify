package defpackage;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservablePublish;

/* renamed from: ids reason: default package */
public final class ids {
    public final Observable<AdSlotEvent> a;
    public final Observable<AdSlotEvent> b = ObservablePublish.h(Observable.a((ObservableSource<? extends T>) this.f, (ObservableSource<? extends T>) this.a)).a();
    public final Observable<AdSlotEvent> c;
    public final Observable<AdSlotEvent> d;
    public final Observable<AdSlotEvent> e;
    private final Observable<AdSlotEvent> f;

    public ids(gky<AdSlotEvent> gky) {
        $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk r0 = $$Lambda$ids$jEglpenkSZqkNeWvx2QiiSF9_dk.INSTANCE;
        this.f = ObservablePublish.h(vun.b(gky.resolve(a((idy) Format.AUDIO))).c((Consumer<? super Disposable>) new $$Lambda$ids$yqzSOI_rL9k7AH1byErXYeZFDRw<Object>(Format.AUDIO)).b((Consumer<? super T>) r0)).a();
        this.a = ObservablePublish.h(vun.b(gky.resolve(a((idy) Format.VIDEO))).c((Consumer<? super Disposable>) new $$Lambda$ids$yqzSOI_rL9k7AH1byErXYeZFDRw<Object>(Format.VIDEO)).b((Consumer<? super T>) r0)).a();
        this.d = ObservablePublish.h(vun.b(gky.resolve(a((idy) AdSlot.MARQUEE))).b((Consumer<? super T>) r0)).a();
        this.c = ObservablePublish.h(vun.b(gky.resolve(a((idy) AdSlot.MOBILE_SCREENSAVER))).b((Consumer<? super T>) r0)).a();
        this.e = ObservablePublish.h(vun.b(gky.resolve(a((idy) AdSlot.SPONSORED_PLAYLIST))).b((Consumer<? super T>) r0)).a();
    }

    private static Request a(idy idy) {
        return new Request(Request.SUB, idy.getCosmosEndpoint());
    }
}
