package defpackage;

import android.app.Application;

/* renamed from: qhq reason: default package */
public final class qhq implements wig<siq> {
    private final wzi<Application> a;
    private final wzi<rwl> b;

    private qhq(wzi<Application> wzi, wzi<rwl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qhq a(wzi<Application> wzi, wzi<rwl> wzi2) {
        return new qhq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (siq) wil.a(new sir((Application) this.a.get(), (rwl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
