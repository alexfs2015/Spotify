package defpackage;

import android.content.Context;

/* renamed from: tz reason: default package */
public final class tz {
    private static tz e;
    public tt a;
    public tu b;
    public tx c;
    public ty d;

    public static synchronized tz a(Context context, vb vbVar) {
        tz tzVar;
        synchronized (tz.class) {
            if (e == null) {
                e = new tz(context, vbVar);
            }
            tzVar = e;
        }
        return tzVar;
    }

    private tz(Context context, vb vbVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new tt(applicationContext, vbVar);
        this.b = new tu(applicationContext, vbVar);
        this.c = new tx(applicationContext, vbVar);
        this.d = new ty(applicationContext, vbVar);
    }
}
