package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: mck reason: default package */
public final class mck implements vua<PackageManager> {
    private final wlc<Context> a;

    public static PackageManager a(Context context) {
        return (PackageManager) vuf.a(context.getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
