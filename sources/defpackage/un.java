package defpackage;

import android.content.Context;

/* renamed from: un reason: default package */
public final class un {
    private static un e;
    public uh a;
    public ui b;
    public ul c;
    public um d;

    private un(Context context, vp vpVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new uh(applicationContext, vpVar);
        this.b = new ui(applicationContext, vpVar);
        this.c = new ul(applicationContext, vpVar);
        this.d = new um(applicationContext, vpVar);
    }

    public static synchronized un a(Context context, vp vpVar) {
        un unVar;
        synchronized (un.class) {
            if (e == null) {
                e = new un(context, vpVar);
            }
            unVar = e;
        }
        return unVar;
    }
}
