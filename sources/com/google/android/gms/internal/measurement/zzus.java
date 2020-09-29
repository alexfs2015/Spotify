package com.google.android.gms.internal.measurement;

final class zzus extends zzux {
    private final int zzbuy;
    private final int zzbuz;

    zzus(byte[] bArr, int i, int i2) {
        super(bArr);
        a(i, i + i2, bArr.length);
        this.zzbuy = i;
        this.zzbuz = i2;
    }

    public final byte a(int i) {
        int a = a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.zzbvb[this.zzbuy + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(a);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final int a() {
        return this.zzbuz;
    }

    /* access modifiers changed from: 0000 */
    public final byte b(int i) {
        return this.zzbvb[this.zzbuy + i];
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return this.zzbuy;
    }
}
