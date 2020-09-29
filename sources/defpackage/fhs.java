package defpackage;

import android.util.Base64;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: fhs reason: default package */
public final class fhs {
    public final KeyPair a;
    final long b;

    fhs(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fhs)) {
            return false;
        }
        fhs fhs = (fhs) obj;
        if (this.b != fhs.b || !this.a.getPublic().equals(fhs.a.getPublic()) || !this.a.getPrivate().equals(fhs.a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }
}
