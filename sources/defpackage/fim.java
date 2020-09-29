package defpackage;

import android.util.Base64;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: fim reason: default package */
public final class fim {
    public final KeyPair a;
    final long b;

    fim(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    /* access modifiers changed from: 0000 */
    public final String a() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: 0000 */
    public final String b() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fim)) {
            return false;
        }
        fim fim = (fim) obj;
        return this.b == fim.b && this.a.getPublic().equals(fim.a.getPublic()) && this.a.getPrivate().equals(fim.a.getPrivate());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }
}
