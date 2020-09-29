package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$tkm$LXll36pG5sE6ywflxS1TP0PLkRE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tkm$LXll36pG5sE6ywflxS1TP0PLkRE implements FlowableOnSubscribe {
    private final /* synthetic */ tks f$0;

    public /* synthetic */ $$Lambda$tkm$LXll36pG5sE6ywflxS1TP0PLkRE(tks tks) {
        this.f$0 = tks;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a((b) new b(flowableEmitter) {
            public final void a() {
                r2.a(Boolean.TRUE);
            }

            public final void b() {
                r2.a(Boolean.FALSE);
            }
        });
    }
}
