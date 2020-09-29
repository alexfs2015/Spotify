package defpackage;

import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$sse$QEvzzQys0dkwDy6CtbqSq6OYbQI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sse$QEvzzQys0dkwDy6CtbqSq6OYbQI implements FlowableOnSubscribe {
    private final /* synthetic */ sse f$0;
    private final /* synthetic */ WidgetsContainer f$1;

    public /* synthetic */ $$Lambda$sse$QEvzzQys0dkwDy6CtbqSq6OYbQI(sse sse, WidgetsContainer widgetsContainer) {
        this.f$0 = sse;
        this.f$1 = widgetsContainer;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.b(this.f$1, flowableEmitter);
    }
}
