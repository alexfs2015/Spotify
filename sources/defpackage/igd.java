package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent.Event;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: igd reason: default package */
public final class igd {
    public final BehaviorSubject<AdSlotEvent> a = BehaviorSubject.a();
    private final Observable<AdBreakState> b;
    private final igf c;
    private Disposable d;

    public igd(Observable<AdBreakState> observable, igf igf) {
        this.b = observable;
        this.c = igf;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ AdSlotEvent a(ho hoVar) {
        return (AdSlotEvent) hoVar.a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(AdSlotEvent adSlotEvent) {
        return adSlotEvent.getEvent() == Event.PLAY;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(ho hoVar) {
        return hoVar.b == AdBreakState.IN_PROGRESS;
    }

    public final void a() {
        Disposable disposable = this.d;
        if (disposable == null || disposable.b()) {
            Logger.b("Ad Break: Starting Ad Break Observable", new Object[0]);
            Logger.b("Ad Break: Building PLAY AdSlotEvent Observable", new Object[0]);
            Observable c2 = this.c.b.a((Predicate<? super T>) $$Lambda$igd$VNkuibiHbnTgy6T60oTuBPS5UBI.INSTANCE).a((ObservableSource<? extends U>) this.b, (BiFunction<? super T, ? super U, ? extends R>) $$Lambda$SWQjGjPgkz5nwUXGUA6GCjVJ6AA.INSTANCE).a((Predicate<? super T>) $$Lambda$igd$mqIX_JFHUYXHMU6dCg7XD3oCo44.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$igd$Ld87yhieTDMWXBqjs6furMVERl8.INSTANCE);
            BehaviorSubject<AdSlotEvent> behaviorSubject = this.a;
            behaviorSubject.getClass();
            this.d = c2.a((Consumer<? super T>) new $$Lambda$xt_suqzqqjE4GbBhK3d7O5BVAU<Object>(behaviorSubject), (Consumer<? super Throwable>) $$Lambda$igd$8hoDELzgaZ9_R52Qn1HGhmcchkI.INSTANCE);
            return;
        }
        Logger.b("Ad Break: Won't start Ad Break Observable since there's a subscription already", new Object[0]);
    }

    public final void b() {
        if (this.d != null) {
            Logger.b("Ad Break: Stopping Ad Break Observable", new Object[0]);
            this.d.bd_();
        }
    }
}
