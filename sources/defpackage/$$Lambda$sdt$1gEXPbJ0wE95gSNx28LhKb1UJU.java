package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$sdt$1gEXPbJ-0wE95gSNx28LhKb1UJU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sdt$1gEXPbJ0wE95gSNx28LhKb1UJU implements FlowableOnSubscribe {
    private final /* synthetic */ sdt f$0;
    private final /* synthetic */ sfk f$1;

    public /* synthetic */ $$Lambda$sdt$1gEXPbJ0wE95gSNx28LhKb1UJU(sdt sdt, sfk sfk) {
        this.f$0 = sdt;
        this.f$1 = sfk;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, flowableEmitter);
    }
}
