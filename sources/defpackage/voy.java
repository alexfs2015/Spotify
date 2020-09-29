package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: voy reason: default package */
public final class voy implements vua<Callable<Boolean>> {
    private final wlc<Context> a;

    private voy(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static voy a(wlc<Context> wlc) {
        return new voy(wlc);
    }

    public static Callable<Boolean> a(Context context) {
        return (Callable) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
