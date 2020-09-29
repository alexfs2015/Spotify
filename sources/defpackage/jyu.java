package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: jyu reason: default package */
public final class jyu implements vua<List<kai>> {
    private final wlc<igr> a;
    private final wlc<ign> b;
    private final wlc<jzv> c;
    private final wlc<jyl> d;

    private jyu(wlc<igr> wlc, wlc<ign> wlc2, wlc<jzv> wlc3, wlc<jyl> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static jyu a(wlc<igr> wlc, wlc<ign> wlc2, wlc<jzv> wlc3, wlc<jyl> wlc4) {
        return new jyu(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (List) vuf.a(Arrays.asList(new kai[]{(igr) this.a.get(), (ign) this.b.get(), (jzv) this.c.get(), (jyl) this.d.get()}), "Cannot return null from a non-@Nullable @Provides method");
    }
}
