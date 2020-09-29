package defpackage;

import android.content.Context;

/* renamed from: riy reason: default package */
public final class riy {
    public boolean a;
    private final Context b;

    public riy(Context context) {
        this.b = context;
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            ftc.a(this.b).a(z);
        }
    }
}
