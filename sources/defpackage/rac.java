package defpackage;

import android.content.Context;

/* renamed from: rac reason: default package */
public final class rac {
    public boolean a;
    private final Context b;

    public rac(Context context) {
        this.b = context;
    }

    public final void a(boolean z) {
        if (this.a != z) {
            this.a = z;
            fsi.a(this.b).a(z);
        }
    }
}
