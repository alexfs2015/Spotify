package defpackage;

import android.content.Intent;

/* renamed from: aky reason: default package */
public final class aky {
    private static volatile aky c;
    final akx a;
    akw b;
    private final mh d;

    private aky(mh mhVar, akx akx) {
        anl.a((Object) mhVar, "localBroadcastManager");
        anl.a((Object) akx, "profileCache");
        this.d = mhVar;
        this.a = akx;
    }

    static aky a() {
        if (c == null) {
            synchronized (aky.class) {
                if (c == null) {
                    c = new aky(mh.a(akq.g()), new akx());
                }
            }
        }
        return c;
    }

    private void a(akw akw, akw akw2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", akw);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", akw2);
        this.d.a(intent);
    }

    /* access modifiers changed from: 0000 */
    public void a(akw akw, boolean z) {
        akw akw2 = this.b;
        this.b = akw;
        if (z) {
            if (akw != null) {
                this.a.a(akw);
            } else {
                this.a.b();
            }
        }
        if (!ank.a(akw2, akw)) {
            a(akw2, akw);
        }
    }
}
