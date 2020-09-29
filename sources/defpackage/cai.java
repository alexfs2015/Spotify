package defpackage;

import java.util.Arrays;

/* renamed from: cai reason: default package */
final class cai extends cah {
    private final byte[] a;

    cai(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* access modifiers changed from: 0000 */
    public final byte[] c() {
        return this.a;
    }
}
