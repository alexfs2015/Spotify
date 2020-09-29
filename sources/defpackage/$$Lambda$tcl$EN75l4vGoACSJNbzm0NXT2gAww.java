package defpackage;

import com.spotify.music.newplaying.scroll.container.WidgetsContainer;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$tcl$EN75l4vGoACSJNbzm0NXT2g-Aww reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tcl$EN75l4vGoACSJNbzm0NXT2gAww implements FlowableOnSubscribe {
    private final /* synthetic */ tcl f$0;
    private final /* synthetic */ WidgetsContainer f$1;

    public /* synthetic */ $$Lambda$tcl$EN75l4vGoACSJNbzm0NXT2gAww(tcl tcl, WidgetsContainer widgetsContainer) {
        this.f$0 = tcl;
        this.f$1 = widgetsContainer;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.b(this.f$1, flowableEmitter);
    }
}
