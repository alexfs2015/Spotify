package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$stm$ofo5BVDn5l0K99CHAqFCfvzTFwg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$stm$ofo5BVDn5l0K99CHAqFCfvzTFwg implements FlowableOnSubscribe {
    private final /* synthetic */ PeekScrollView f$0;

    public /* synthetic */ $$Lambda$stm$ofo5BVDn5l0K99CHAqFCfvzTFwg(PeekScrollView peekScrollView) {
        this.f$0 = peekScrollView;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        stm.a(this.f$0, flowableEmitter);
    }
}
