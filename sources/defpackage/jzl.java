package defpackage;

import com.google.common.base.Optional;

/* renamed from: jzl reason: default package */
public final class jzl implements vua<jyh> {
    private final wlc<fpt> a;

    private jzl(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static jzl a(wlc<fpt> wlc) {
        return new jzl(wlc);
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        jyh jyh = new jyh();
        jyh.b = ((Boolean) fpt.a(jyz.e)).booleanValue();
        jyh.c = ((Integer) fpt.a(jyz.d)).intValue();
        jyh.a = Optional.c(fpt.a(jyz.b));
        return (jyh) vuf.a(jyh, "Cannot return null from a non-@Nullable @Provides method");
    }
}
