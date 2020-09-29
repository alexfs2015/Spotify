package defpackage;

import java.util.Arrays;

/* renamed from: ayz reason: default package */
public abstract class ayz extends ayt {
    public byte[] a;
    private volatile boolean b;

    public ayz(bce bce, bcg bcg, int i, aqv aqv, int i2, Object obj, byte[] bArr) {
        super(bce, bcg, 3, aqv, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.a = bArr;
    }

    public final void a() {
        this.b = true;
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i);

    public final void b() {
        try {
            this.l.a(this.e);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.b) {
                if (this.a == null) {
                    this.a = new byte[16384];
                } else if (this.a.length < i2 + 16384) {
                    this.a = Arrays.copyOf(this.a, this.a.length + 16384);
                }
                i = this.l.a(this.a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.b) {
                a(this.a, i2);
            }
        } finally {
            ben.a((bce) this.l);
        }
    }
}
