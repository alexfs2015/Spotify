package defpackage;

import java.util.Collections;

/* renamed from: inf reason: default package */
public final class inf implements vua<gum> {
    private final wlc<gvv> a;
    private final wlc<ine> b;

    private inf(wlc<gvv> wlc, wlc<ine> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static inf a(wlc<gvv> wlc, wlc<ine> wlc2) {
        return new inf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.a.get()).a((ine) this.b.get()).a(Collections.emptyMap()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
