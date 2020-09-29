package defpackage;

/* renamed from: ave reason: default package */
public final class ave implements auy {
    private final bdj a;
    private final asz b;
    private final String c;
    private String d;
    private atd e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public final void b() {
    }

    public ave() {
        this(null);
    }

    public ave(String str) {
        this.f = 0;
        this.a = new bdj(4);
        this.a.a[0] = -1;
        this.b = new asz();
        this.c = str;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    public final void a(asv asv, d dVar) {
        dVar.a();
        this.d = dVar.c();
        this.e = asv.a(dVar.b(), 1);
    }

    public final void a(long j2, boolean z) {
        this.l = j2;
    }

    public final void a(bdj bdj) {
        bdj bdj2 = bdj;
        while (bdj.b() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                byte[] bArr = bdj2.a;
                int i3 = bdj2.b;
                int i4 = bdj2.c;
                while (true) {
                    if (i3 >= i4) {
                        bdj2.c(i4);
                        break;
                    }
                    boolean z = (bArr[i3] & 255) == 255;
                    boolean z2 = this.i && (bArr[i3] & 224) == 224;
                    this.i = z;
                    if (z2) {
                        bdj2.c(i3 + 1);
                        this.i = false;
                        this.a.a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 == 1) {
                int min = Math.min(bdj.b(), 4 - this.g);
                bdj2.a(this.a.a, this.g, min);
                this.g += min;
                if (this.g >= 4) {
                    this.a.c(0);
                    if (!asz.a(this.a.i(), this.b)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        this.k = this.b.c;
                        if (!this.h) {
                            this.j = (((long) this.b.g) * 1000000) / ((long) this.b.d);
                            this.e.a(aqe.a(this.d, this.b.b, (String) null, -1, 4096, this.b.e, this.b.d, null, (asc) null, 0, this.c));
                            this.h = true;
                        }
                        this.a.c(0);
                        this.e.a(this.a, 4);
                        this.f = 2;
                    }
                }
            } else if (i2 == 2) {
                int min2 = Math.min(bdj.b(), this.k - this.g);
                this.e.a(bdj2, min2);
                this.g += min2;
                int i5 = this.g;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.e.a(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
