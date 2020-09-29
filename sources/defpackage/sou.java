package defpackage;

import io.reactivex.FlowableTransformer;

/* renamed from: sou reason: default package */
public final class sou implements wig<sot> {
    private final wzi<soo> a;
    private final wzi<FlowableTransformer<hcs, hcs>> b;

    private sou(wzi<soo> wzi, wzi<FlowableTransformer<hcs, hcs>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sou a(wzi<soo> wzi, wzi<FlowableTransformer<hcs, hcs>> wzi2) {
        return new sou(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new sot((soo) this.a.get(), (FlowableTransformer) this.b.get());
    }
}
