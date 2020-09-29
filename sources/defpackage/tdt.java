package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: tdt reason: default package */
public final class tdt {
    public static Flowable<tds> a(PeekScrollView peekScrollView) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$tdt$rtTD3WUoDkTmoArYXEHDAhlPF20<T>(peekScrollView), BackpressureStrategy.LATEST);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(PeekScrollView peekScrollView, FlowableEmitter flowableEmitter) {
        $$Lambda$tdt$EVSaCIzMp8y6otsDeAE_AMZFl7s r0 = new $$Lambda$tdt$EVSaCIzMp8y6otsDeAE_AMZFl7s(flowableEmitter);
        peekScrollView.a.add(fbp.a(r0));
        flowableEmitter.a(new $$Lambda$tdt$aRc7CBmyIP3Q1Q9r6pjYsL3YLp8(peekScrollView, r0));
    }
}
