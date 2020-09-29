package defpackage;

import android.app.Application;
import android.content.ContentResolver;

/* renamed from: ldb reason: default package */
public final class ldb implements wig<ContentResolver> {
    private final wzi<Application> a;

    private ldb(wzi<Application> wzi) {
        this.a = wzi;
    }

    public static ldb a(wzi<Application> wzi) {
        return new ldb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ContentResolver) wil.a(((Application) this.a.get()).getContentResolver(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
