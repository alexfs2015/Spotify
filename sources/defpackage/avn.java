package defpackage;

/* renamed from: avn reason: default package */
public final class avn implements avp {
    private final bea a = new bea(new byte[18]);
    private final String b;
    private String c;
    private atu d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private aqv i;
    private int j;
    private long k;

    public avn(String str) {
        this.b = str;
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }

    public final void a(long j2, boolean z) {
        this.k = j2;
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.c = dVar.c();
        this.d = atm.a(dVar.b(), 1);
    }

    public final void a(bea bea) {
        while (bea.b() > 0) {
            int i2 = this.e;
            boolean z = true;
            boolean z2 = false;
            if (i2 == 0) {
                while (true) {
                    if (bea.b() <= 0) {
                        break;
                    }
                    this.g <<= 8;
                    this.g |= bea.c();
                    if (arz.a(this.g)) {
                        this.a.a[0] = (byte) (this.g >>> 24);
                        this.a.a[1] = (byte) (this.g >> 16);
                        this.a.a[2] = (byte) (this.g >> 8);
                        this.a.a[3] = (byte) this.g;
                        this.f = 4;
                        this.g = 0;
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    this.e = 1;
                }
            } else if (i2 == 1) {
                byte[] bArr = this.a.a;
                int min = Math.min(bea.b(), 18 - this.f);
                bea.a(bArr, this.f, min);
                this.f += min;
                if (this.f != 18) {
                    z = false;
                }
                if (z) {
                    byte[] bArr2 = this.a.a;
                    if (this.i == null) {
                        this.i = arz.a(bArr2, this.c, this.b, null);
                        this.d.a(this.i);
                    }
                    this.j = arz.b(bArr2);
                    this.h = (long) ((int) ((((long) arz.a(bArr2)) * 1000000) / ((long) this.i.r)));
                    this.a.c(0);
                    this.d.a(this.a, 18);
                    this.e = 2;
                }
            } else if (i2 == 2) {
                int min2 = Math.min(bea.b(), this.j - this.f);
                this.d.a(bea, min2);
                this.f += min2;
                int i3 = this.f;
                int i4 = this.j;
                if (i3 == i4) {
                    this.d.a(this.k, 1, i4, 0, null);
                    this.k += this.h;
                    this.e = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final void b() {
    }
}
