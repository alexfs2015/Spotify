package defpackage;

import android.webkit.CookieManager;

/* renamed from: oju reason: default package */
public final class oju implements wig<CookieManager> {
    static {
        new oju();
    }

    public static CookieManager a() {
        return (CookieManager) wil.a(CookieManager.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a();
    }
}
