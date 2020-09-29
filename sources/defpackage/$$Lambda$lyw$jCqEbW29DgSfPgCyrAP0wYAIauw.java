package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$lyw$jCqEbW29DgSfPgCyrAP0wYAIauw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lyw$jCqEbW29DgSfPgCyrAP0wYAIauw implements FlowableOnSubscribe {
    private final /* synthetic */ lyw f$0;
    private final /* synthetic */ lxv f$1;

    public /* synthetic */ $$Lambda$lyw$jCqEbW29DgSfPgCyrAP0wYAIauw(lyw lyw, lxv lxv) {
        this.f$0 = lyw;
        this.f$1 = lxv;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}
