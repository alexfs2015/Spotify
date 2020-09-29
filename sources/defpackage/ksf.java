package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.Flowable;

/* renamed from: ksf reason: default package */
public final class ksf implements wut<wud<TrackAnnotationSet>, iht<TrackAnnotation>> {
    private final wud<PlayerState> a;
    private final jrp b;
    private final wug c;

    public ksf(Flowable<PlayerState> flowable, jrp jrp, wug wug) {
        this.a = vun.a((wrf<T>) flowable);
        this.b = jrp;
        this.c = wug;
    }

    /* renamed from: a */
    public final iht<TrackAnnotation> call(wud<TrackAnnotationSet> wud) {
        return new iht<>(wud.f(new $$Lambda$ksf$pfAYnhrCDBqnrT1tGvLy43f4iVA(this)), this.a.c((wut<? super T, Boolean>) new $$Lambda$ksf$sBIpV0GEu1jG6Tw65z41LTKYqwg<Object,Boolean>(this)).f(new $$Lambda$ksf$y4FBr9fPDeAHjXG7fbAL64_Zwo(this)).b().b((wun<? super T>) $$Lambda$ksf$_8MyxVapn5yhWgKdONbmYwcL8.INSTANCE), new ihu(), new ihs(this.c));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState.currentPlaybackPosition(this.b.a()) != -1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ihw a(PlayerState playerState) {
        krs krs = new krs(playerState.currentPlaybackPosition(this.b.a()), (double) playerState.playbackSpeed(), playerState.isPlaying(), playerState.isPaused(), playerState.duration());
        return krs;
    }

    /* access modifiers changed from: private */
    public ImmutableList<TrackAnnotation> a(TrackAnnotationSet trackAnnotationSet) {
        a aVar = new a();
        aVar.c(TrackAnnotation.createIntroAnnotation());
        aVar.b((Iterable<? extends E>) trackAnnotationSet.getAnnotations());
        return aVar.a();
    }
}
