package defpackage;

import com.spotify.music.toastie.ToastieManager;

/* renamed from: uzv reason: default package */
public final class uzv implements wig<ToastieManager> {
    private final wzi<vsm> a;
    private final wzi<uzw> b;

    private uzv(wzi<vsm> wzi, wzi<uzw> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static uzv a(wzi<vsm> wzi, wzi<uzw> wzi2) {
        return new uzv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (ToastieManager) wil.a(new ToastieManager((vsm) this.a.get(), (uzw) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
