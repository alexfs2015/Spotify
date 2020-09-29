package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.FlowableEmitter;

/* renamed from: -$$Lambda$sse$VHFeoMAJnnN3Fos7QtK5a7d8CcE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sse$VHFeoMAJnnN3Fos7QtK5a7d8CcE implements OnScrollChangedListener {
    private final /* synthetic */ sse f$0;
    private final /* synthetic */ WidgetsContainer f$1;
    private final /* synthetic */ FlowableEmitter f$2;

    public /* synthetic */ $$Lambda$sse$VHFeoMAJnnN3Fos7QtK5a7d8CcE(sse sse, WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        this.f$0 = sse;
        this.f$1 = widgetsContainer;
        this.f$2 = flowableEmitter;
    }

    public final void onScrollChanged() {
        this.f$0.a(this.f$1, this.f$2);
    }
}
