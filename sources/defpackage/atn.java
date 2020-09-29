package defpackage;

/* renamed from: atn reason: default package */
final class atn {
    final bdj a = new bdj(8);
    int b;

    /* access modifiers changed from: 0000 */
    public long a(asu asu) {
        int i = 0;
        asu.c(this.a.a, 0, 1);
        byte b2 = this.a.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (i2 ^ -1);
        asu.c(this.a.a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.a.a[i] & 255) + (i4 << 8);
        }
        this.b += i3 + 1;
        return (long) i4;
    }
}
