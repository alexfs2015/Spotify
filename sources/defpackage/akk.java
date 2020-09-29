package defpackage;

import android.content.Intent;

/* renamed from: akk reason: default package */
public final class akk {
    private static volatile akk c;
    final akj a;
    aki b;
    private final mc d;

    private akk(mc mcVar, akj akj) {
        amx.a((Object) mcVar, "localBroadcastManager");
        amx.a((Object) akj, "profileCache");
        this.d = mcVar;
        this.a = akj;
    }

    static akk a() {
        if (c == null) {
            synchronized (akk.class) {
                if (c == null) {
                    c = new akk(mc.a(akc.g()), new akj());
                }
            }
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    public void a(aki aki, boolean z) {
        aki aki2 = this.b;
        this.b = aki;
        if (z) {
            if (aki != null) {
                this.a.a(aki);
            } else {
                this.a.b();
            }
        }
        if (!amw.a(aki2, aki)) {
            a(aki2, aki);
        }
    }

    private void a(aki aki, aki aki2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", aki);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", aki2);
        this.d.a(intent);
    }
}
