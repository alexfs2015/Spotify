package defpackage;

import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$taf$agad7B695gj07EULj0CfM_pjGYs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$taf$agad7B695gj07EULj0CfM_pjGYs implements FlowableOnSubscribe {
    private final /* synthetic */ tal f$0;

    public /* synthetic */ $$Lambda$taf$agad7B695gj07EULj0CfM_pjGYs(tal tal) {
        this.f$0 = tal;
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
