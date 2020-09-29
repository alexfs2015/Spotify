package defpackage;

import android.webkit.CookieManager;

/* renamed from: oco reason: default package */
public final class oco implements vua<CookieManager> {
    static {
        new oco();
    }

    public static CookieManager a() {
        return (CookieManager) vuf.a(CookieManager.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
