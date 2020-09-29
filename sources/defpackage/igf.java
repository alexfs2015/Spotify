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

/* renamed from: igf reason: default package */
public final class igf {
    public final Observable<AdSlotEvent> a;
    public final Observable<AdSlotEvent> b = ObservablePublish.h(Observable.b((ObservableSource<? extends T>) this.f, (ObservableSource<? extends T>) this.a)).a();
    public final Observable<AdSlotEvent> c;
    public final Observable<AdSlotEvent> d;
    public final Observable<AdSlotEvent> e;
    private final Observable<AdSlotEvent> f;

    public igf(gmm<AdSlotEvent> gmm) {
        $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE r0 = $$Lambda$igf$b3RtrHNdT6Bw5KgvCWykfxWatE.INSTANCE;
        this.f = ObservablePublish.h(wit.b(gmm.resolve(a((igl) Format.AUDIO))).c((Consumer<? super Disposable>) new $$Lambda$igf$fKy6txCNOLZfxBNRfpUVQEIgJk<Object>(Format.AUDIO)).b((Consumer<? super T>) r0)).a();
        this.a = ObservablePublish.h(wit.b(gmm.resolve(a((igl) Format.VIDEO))).c((Consumer<? super Disposable>) new $$Lambda$igf$fKy6txCNOLZfxBNRfpUVQEIgJk<Object>(Format.VIDEO)).b((Consumer<? super T>) r0)).a();
        this.d = ObservablePublish.h(wit.b(gmm.resolve(a((igl) AdSlot.MARQUEE))).b((Consumer<? super T>) r0)).a();
        this.c = ObservablePublish.h(wit.b(gmm.resolve(a((igl) AdSlot.MOBILE_SCREENSAVER))).b((Consumer<? super T>) r0)).a();
        this.e = ObservablePublish.h(wit.b(gmm.resolve(a((igl) AdSlot.SPONSORED_PLAYLIST))).b((Consumer<? super T>) r0)).a();
    }

    private static Request a(igl igl) {
        return new Request(Request.SUB, igl.getCosmosEndpoint());
    }
}
