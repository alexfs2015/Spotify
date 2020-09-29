package defpackage;

import android.content.Context;

@cfp
/* renamed from: eby reason: default package */
public final class eby {
    private final Object a = new Object();
    private ecf b;

    public final ecf a(Context context, cpp cpp) {
        ecf ecf;
        synchronized (this.a) {
            if (this.b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.b = new ecf(context, cpp, (String) dqe.f().a(dtg.a));
            }
            ecf = this.b;
        }
        return ecf;
    }
}
