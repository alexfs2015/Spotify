package defpackage;

import android.content.Context;

@cey
/* renamed from: ebh reason: default package */
public final class ebh {
    private final Object a = new Object();
    private ebo b;

    public final ebo a(Context context, coy coy) {
        ebo ebo;
        synchronized (this.a) {
            if (this.b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.b = new ebo(context, coy, (String) dpn.f().a(dsp.a));
            }
            ebo = this.b;
        }
        return ebo;
    }
}
