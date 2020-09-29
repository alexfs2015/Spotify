package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: mgn reason: default package */
public final class mgn implements wig<PackageManager> {
    private final wzi<Context> a;

    public static PackageManager a(Context context) {
        return (PackageManager) wil.a(context.getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
