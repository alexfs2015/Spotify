package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$sej$qbUfHSVfLsQcjnPegqiFVkTTryk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sej$qbUfHSVfLsQcjnPegqiFVkTTryk implements FlowableOnSubscribe {
    private final /* synthetic */ shr f$0;
    private final /* synthetic */ upd f$1;

    public /* synthetic */ $$Lambda$sej$qbUfHSVfLsQcjnPegqiFVkTTryk(shr shr, upd upd) {
        this.f$0 = shr;
        this.f$1 = upd;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        sej.a(this.f$0, this.f$1, flowableEmitter);
    }
}
