package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$sdv$UTjwy2v8_XygY45GR3uq5BUwjak reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sdv$UTjwy2v8_XygY45GR3uq5BUwjak implements FlowableOnSubscribe {
    private final /* synthetic */ sdv f$0;
    private final /* synthetic */ sfk f$1;

    public /* synthetic */ $$Lambda$sdv$UTjwy2v8_XygY45GR3uq5BUwjak(sdv sdv, sfk sfk) {
        this.f$0 = sdv;
        this.f$1 = sfk;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}
