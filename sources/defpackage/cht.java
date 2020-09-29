package defpackage;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@cey
/* renamed from: cht reason: default package */
public final class cht {
    WeakHashMap<Context, chv> a = new WeakHashMap<>();

    public final Future<chr> a(Context context) {
        return cmb.a((Callable<T>) new chu<T>(this, context));
    }
}
