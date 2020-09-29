package defpackage;

import com.spotify.rcs.model.proto.Platform;

/* renamed from: lfi reason: default package */
public final class lfi implements wig<rxl> {
    private final wzi<jty> a;
    private final wzi<juc> b;

    private lfi(wzi<jty> wzi, wzi<juc> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lfi a(wzi<jty> wzi, wzi<juc> wzi2) {
        return new lfi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        jty jty = (jty) this.a.get();
        return (rxl) wil.a(new a().a(jty.c()).b(jty.a()).c(((juc) this.b.get()).b()).a(Platform.ANDROID).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
