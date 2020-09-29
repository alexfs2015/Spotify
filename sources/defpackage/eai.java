package defpackage;

import android.content.Context;

@cfp
/* renamed from: eai reason: default package */
public final class eai {
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
