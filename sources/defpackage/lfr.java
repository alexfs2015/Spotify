package defpackage;

import android.content.Context;
import android.content.Intent;
import io.reactivex.functions.Function;

/* renamed from: lfr reason: default package */
public final class lfr implements wig<Function<Intent, Intent>> {
    private final wzi<Context> a;

    public static Function<Intent, Intent> a(Context context) {
        return (Function) wil.a(CC.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
