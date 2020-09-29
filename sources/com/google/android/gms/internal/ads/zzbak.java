package com.google.android.gms.internal.ads;

final class zzbak extends zzbao {
    private final int zzdpt;
    private final int zzdpu;

    zzbak(byte[] bArr, int i, int i2) {
        super(bArr);
        a(i, i + i2, bArr.length);
        this.zzdpt = i;
        this.zzdpu = i2;
    }

    public final byte a(int i) {
        int a = a();
        if (((a - (i + 1)) | i) >= 0) {
            return this.zzdpw[this.zzdpt + i];
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
        return this.zzdpu;
    }

    /* access modifiers changed from: protected */
    public final void a(byte[] bArr, int i) {
        System.arraycopy(this.zzdpw, f(), bArr, 0, i);
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.zzdpt;
    }
}
