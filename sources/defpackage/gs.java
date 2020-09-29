package defpackage;

import android.content.Context;
import java.util.WeakHashMap;

/* renamed from: gs reason: default package */
public final class gs {
    private static final WeakHashMap<Context, gs> a = new WeakHashMap<>();
    private final Context b;

    private gs(Context context) {
        this.b = context;
    }

    public static gs a(Context context) {
        gs gsVar;
        synchronized (a) {
            gsVar = (gs) a.get(context);
            if (gsVar == null) {
                gsVar = new gs(context);
                a.put(context, gsVar);
            }
        }
        return gsVar;
    }
}
