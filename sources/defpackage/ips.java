package defpackage;

import java.util.Collections;

/* renamed from: ips reason: default package */
public final class ips implements wig<gwm> {
    private final wzi<gxw> a;
    private final wzi<ipr> b;

    private ips(wzi<gxw> wzi, wzi<ipr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ips a(wzi<gxw> wzi, wzi<ipr> wzi2) {
        return new ips(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.a.get()).a((ipr) this.b.get()).a(Collections.emptyMap()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
