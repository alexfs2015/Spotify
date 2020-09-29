package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: cba reason: default package */
abstract class cba extends cay {
    private static final WeakReference<byte[]> b = new WeakReference<>(null);
    private WeakReference<byte[]> a = b;

    cba(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] d();
}
