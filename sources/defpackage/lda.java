package defpackage;

import android.app.Application;

/* renamed from: lda reason: default package */
public final class lda implements wig<jty> {
    private final wzi<Application> a;
    private final wzi<vos> b;

    private lda(wzi<Application> wzi, wzi<vos> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lda a(wzi<Application> wzi, wzi<vos> wzi2) {
        return new lda(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (jty) wil.a(new lah((Application) this.a.get(), "com.spotify.music", false, (vos) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
