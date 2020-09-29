package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: stm reason: default package */
public final class stm {
    /* access modifiers changed from: private */
    public static /* synthetic */ void a(PeekScrollView peekScrollView, FlowableEmitter flowableEmitter) {
        $$Lambda$stm$fOL7JQnJpvBGLvh07BUI_yTZN8 r0 = new $$Lambda$stm$fOL7JQnJpvBGLvh07BUI_yTZN8(flowableEmitter);
        peekScrollView.a.add(fay.a(r0));
        flowableEmitter.a(new $$Lambda$stm$w5Q_fr10amxiEXVYLireUsFRmo(peekScrollView, r0));
    }

    public static Flowable<stl> a(PeekScrollView peekScrollView) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$stm$ofo5BVDn5l0K99CHAqFCfvzTFwg<T>(peekScrollView), BackpressureStrategy.LATEST);
    }
}
