package defpackage;

import android.content.Context;

@cey
/* renamed from: dzr reason: default package */
public final class dzr {
    private Context a;

    public final void a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = context;
        }
    }
}
