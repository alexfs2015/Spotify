package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.Flowable;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: tdx reason: default package */
public final class tdx {
    private static final iki<TrackAnnotation> b;
    xip a = xon.b();
    private final xii<PlayerTrack> c;
    private final kux d;
    private final kvl e;
    private final kvo f;
    private final xil g;

    static {
        iki iki = new iki(TrackAnnotation.createIntroAnnotation(), 0, 0, false);
        b = iki;
    }

    public tdx(Flowable<PlayerTrack> flowable, kux kux, kvl kvl, kvo kvo, xil xil) {
        this.c = wit.a((xfk<T>) flowable);
        this.d = kux;
        this.e = kvl;
        this.f = kvo;
        this.g = xil;
    }

    /* access modifiers changed from: private */
    public ikg<TrackAnnotation> a(TrackAnnotationSet trackAnnotationSet) {
        return this.f.call((xii<TrackAnnotationSet>) ScalarSynchronousObservable.d(trackAnnotationSet));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(kvn kvn, PlayerTrack playerTrack) {
        return this.d.a(playerTrack).b((xis<? super T>) kvn).e((xiy<? super T, ? extends R>) new $$Lambda$tdx$7i2ymFm8VgceqcqhnYEG3UICc2I<Object,Object>(this)).d((xiy<? super T, ? extends xii<? extends R>>) $$Lambda$J_FnQTme6hQVcaognEQ83BDFjMA.INSTANCE).c(EmptyObservableHolder.a()).c(b);
    }

    public final void a(kwc kwc) {
        kwc kwc2 = (kwc) fbp.a(kwc);
        this.a = this.c.b((xiy<? super T, ? extends U>) $$Lambda$UffjuocpeZXFAba747XMf6nEuyg.INSTANCE).h(new $$Lambda$tdx$imd3njfqKn5g7aAwxuv6bOj2e10(this, new kvn(kwc2))).a(this.g).a((xij<? super T>) new kvk<Object>(kwc2, (kvi) this.e.a.get()));
    }
}
