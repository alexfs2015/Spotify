package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$tdt$rtTD3WUoDkTmoArYXEHDAhlPF20 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tdt$rtTD3WUoDkTmoArYXEHDAhlPF20 implements FlowableOnSubscribe {
    private final /* synthetic */ PeekScrollView f$0;

    public /* synthetic */ $$Lambda$tdt$rtTD3WUoDkTmoArYXEHDAhlPF20(PeekScrollView peekScrollView) {
        this.f$0 = peekScrollView;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        tdt.a(this.f$0, flowableEmitter);
    }
}
