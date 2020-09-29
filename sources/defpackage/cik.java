package defpackage;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@cfp
/* renamed from: cik reason: default package */
public final class cik {
    WeakHashMap<Context, cim> a = new WeakHashMap<>();

    public final Future<cii> a(Context context) {
        return cms.a((Callable<T>) new cil<T>(this, context));
    }
}
