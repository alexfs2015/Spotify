package defpackage;

import com.spotify.music.newplaying.scroll.view.PeekScrollView.a;
import io.reactivex.FlowableEmitter;

/* renamed from: -$$Lambda$stm$fOL7JQnJpvBGLvh07BU-I_yTZN8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$stm$fOL7JQnJpvBGLvh07BUI_yTZN8 implements a {
    private final /* synthetic */ FlowableEmitter f$0;

    public /* synthetic */ $$Lambda$stm$fOL7JQnJpvBGLvh07BUI_yTZN8(FlowableEmitter flowableEmitter) {
        this.f$0 = flowableEmitter;
    }

    public final void onScrollChanged(int i, int i2) {
        this.f$0.a(new stg(i, i2));
    }
}
