package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotation;
import com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet;
import io.reactivex.Flowable;

/* renamed from: kvo reason: default package */
public final class kvo implements xiy<xii<TrackAnnotationSet>, ikg<TrackAnnotation>> {
    private final xii<PlayerState> a;
    private final jtz b;
    private final xil c;

    public kvo(Flowable<PlayerState> flowable, jtz jtz, xil xil) {
        this.a = wit.a((xfk<T>) flowable);
        this.b = jtz;
        this.c = xil;
    }

    /* access modifiers changed from: private */
    public ImmutableList<TrackAnnotation> a(TrackAnnotationSet trackAnnotationSet) {
        a aVar = new a();
        aVar.c(TrackAnnotation.createIntroAnnotation());
        aVar.b((Iterable<? extends E>) trackAnnotationSet.getAnnotations());
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ikj a(PlayerState playerState) {
        kvb kvb = new kvb(playerState.currentPlaybackPosition(this.b.a()), (double) playerState.playbackSpeed(), playerState.isPlaying(), playerState.isPaused(), playerState.duration());
        return kvb;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean b(PlayerState playerState) {
        return Boolean.valueOf(playerState.currentPlaybackPosition(this.b.a()) != -1);
    }

    /* renamed from: a */
    public final ikg<TrackAnnotation> call(xii<TrackAnnotationSet> xii) {
        return new ikg<>(xii.e((xiy<? super T, ? extends R>) new $$Lambda$kvo$C9p0ueFdQC4mnFi3RgzNQCOX94<Object,Object>(this)), this.a.c((xiy<? super T, Boolean>) new $$Lambda$kvo$ntqOMxglaNof5qxb6ytxFnFCdB4<Object,Boolean>(this)).e((xiy<? super T, ? extends R>) new $$Lambda$kvo$vkVt2siv619_6Ozf_epOq4Cwzs<Object,Object>(this)).b().b((xis<? super T>) $$Lambda$kvo$sjRCWrNIhfAC0vemr8RVVqSRA.INSTANCE), new ikh(), new ikf(this.c));
    }
}
