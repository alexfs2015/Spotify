package defpackage;

import android.content.Intent;

/* renamed from: kzx reason: default package */
public final class kzx {
    public final Intent a;
    public final hci b;
    public final boolean c;

    /* renamed from: kzx$a */
    public static class a {
        public Intent a;
        public hci b;
        public boolean c;

        public final kzx a() {
            return new kzx(this.a, this.b, this.c, 0);
        }
    }

    private kzx(Intent intent, hci hci, boolean z) {
        this.a = intent;
        this.b = hci;
        this.c = z;
    }

    public /* synthetic */ kzx(Intent intent, hci hci, boolean z, byte b2) {
        this(intent, hci, z);
    }
}
