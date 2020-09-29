package defpackage;

import android.content.Context;
import android.content.Intent;
import io.reactivex.functions.Function;

/* renamed from: lce reason: default package */
public final class lce implements vua<Function<Intent, Intent>> {
    private final wlc<Context> a;

    public static Function<Intent, Intent> a(Context context) {
        return (Function) vuf.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
