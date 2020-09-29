package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: lde reason: default package */
public final class lde implements vua<Context> {
    private final wlc<Fragment> a;

    public static Context a(Fragment fragment) {
        return (Context) vuf.a(fragment.o(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Fragment) this.a.get());
    }
}
