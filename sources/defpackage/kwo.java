package defpackage;

import android.content.Intent;

/* renamed from: kwo reason: default package */
public final class kwo {
    public final Intent a;
    public final gzp b;
    public final boolean c;

    /* renamed from: kwo$a */
    public static class a {
        public Intent a;
        public gzp b;
        public boolean c;

        public final kwo a() {
            return new kwo(this.a, this.b, this.c, 0);
        }
    }

    public /* synthetic */ kwo(Intent intent, gzp gzp, boolean z, byte b2) {
        this(intent, gzp, z);
    }

    private kwo(Intent intent, gzp gzp, boolean z) {
        this.a = intent;
        this.b = gzp;
        this.c = z;
    }
}
