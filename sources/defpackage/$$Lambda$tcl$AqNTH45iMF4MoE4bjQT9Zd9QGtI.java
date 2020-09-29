package defpackage;

import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.FlowableEmitter;

/* renamed from: -$$Lambda$tcl$AqNTH45iMF4MoE4bjQT9Zd9QGtI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tcl$AqNTH45iMF4MoE4bjQT9Zd9QGtI implements OnScrollChangedListener {
    private final /* synthetic */ tcl f$0;
    private final /* synthetic */ WidgetsContainer f$1;
    private final /* synthetic */ FlowableEmitter f$2;

    public /* synthetic */ $$Lambda$tcl$AqNTH45iMF4MoE4bjQT9Zd9QGtI(tcl tcl, WidgetsContainer widgetsContainer, FlowableEmitter flowableEmitter) {
        this.f$0 = tcl;
        this.f$1 = widgetsContainer;
        this.f$2 = flowableEmitter;
    }

    public final void onScrollChanged() {
        this.f$0.a(this.f$1, this.f$2);
    }
}
