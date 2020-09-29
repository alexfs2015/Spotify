package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: lgs reason: default package */
public final class lgs implements wig<Context> {
    private final wzi<Fragment> a;

    public static Context a(Fragment fragment) {
        return (Context) wil.a(fragment.o(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Fragment) this.a.get());
    }
}
