package defpackage;

import java.util.Arrays;

/* renamed from: caz reason: default package */
final class caz extends cay {
    private final byte[] a;

    caz(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    /* access modifiers changed from: 0000 */
    public final byte[] c() {
        return this.a;
    }
}
