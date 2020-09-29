package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.Flowable;
import rx.internal.operators.EmptyObservableHolder;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: stq reason: default package */
public final class stq {
    private static final ihv<TrackAnnotation> b;
    wuk a = xaj.b();
    private final wud<PlayerTrack> c;
    private final kro d;
    private final ksc e;
    private final ksf f;
    private final wug g;

    static {
        ihv ihv = new ihv(TrackAnnotation.createIntroAnnotation(), 0, 0, false);
        b = ihv;
    }

    public stq(Flowable<PlayerTrack> flowable, kro kro, ksc ksc, ksf ksf, wug wug) {
        this.c = vun.a((wrf<T>) flowable);
        this.d = kro;
        this.e = ksc;
        this.f = ksf;
        this.g = wug;
    }

    public final void a(kst kst) {
        kst kst2 = (kst) fay.a(kst);
        this.a = this.c.b((wut<? super T, ? extends U>) $$Lambda$hS9MV1oOuY_qdOyMr9UoVuXvVFk.INSTANCE).i(new $$Lambda$stq$075ZVI0AyhMfVLErJAkrECJ9gj0(this, new kse(kst2))).a(this.g).a((wue<? super T>) new ksb<Object>(kst2, (krz) this.e.a.get()));
    }

    /* access modifiers changed from: private */
    public iht<TrackAnnotation> a(TrackAnnotationSet trackAnnotationSet) {
        return this.f.call((wud<TrackAnnotationSet>) ScalarSynchronousObservable.d(trackAnnotationSet));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(kse kse, PlayerTrack playerTrack) {
        return this.d.a(playerTrack).b((wun<? super T>) kse).f(new $$Lambda$stq$9MNdDmf_MyWDqja8hPzwjJi8o(this)).d((wut<? super T, ? extends wud<? extends R>>) $$Lambda$NjUZHKBKybi5ZTFOBCTT08fEXPc.INSTANCE).c(EmptyObservableHolder.a()).c(b);
    }
}
