package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView.a;
import io.reactivex.FlowableEmitter;

/* renamed from: -$$Lambda$tdt$EVSaCIzMp8y6otsDeAE_AMZFl7s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tdt$EVSaCIzMp8y6otsDeAE_AMZFl7s implements a {
    private final /* synthetic */ FlowableEmitter f$0;

    public /* synthetic */ $$Lambda$tdt$EVSaCIzMp8y6otsDeAE_AMZFl7s(FlowableEmitter flowableEmitter) {
        this.f$0 = flowableEmitter;
    }

    public final void onScrollChanged(int i, int i2) {
        this.f$0.a(new tdn(i, i2));
    }
}
