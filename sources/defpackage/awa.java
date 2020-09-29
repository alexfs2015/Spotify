package defpackage;

import android.util.SparseArray;

/* renamed from: awa reason: default package */
public final class awa implements atk {
    private final bek a;
    private final SparseArray<a> b;
    private final bea c;
    private final avz d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private avy i;
    private atm j;
    private boolean k;

    /* renamed from: awa$a */
    static final class a {
        final avp a;
        final bek b;
        final bdz c = new bdz(new byte[64]);
        boolean d;
        boolean e;
        boolean f;
        int g;
        long h;

        public a(avp avp, bek bek) {
            this.a = avp;
            this.b = bek;
        }
    }

    static {
        $$Lambda$awa$PehBDD8kDwaLoONCVPQWvX8gYA r0 = $$Lambda$awa$PehBDD8kDwaLoONCVPQWvX8gYA.INSTANCE;
    }

    public awa() {
        this(new bek(0));
    }

    private awa(bek bek) {
        this.a = bek;
        this.c = new bea(4096);
        this.b = new SparseArray<>();
        this.d = new avz();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] a() {
        return new atk[]{new awa()};
    }

    public final int a(atl atl, atr atr) {
        int i2;
        boolean z;
        long j2;
        long j3;
        atl atl2 = atl;
        atr atr2 = atr;
        long d2 = atl.d();
        int i3 = 1;
        if (!(d2 != -1) || this.d.c) {
            if (!this.k) {
                this.k = true;
                if (this.d.h != -9223372036854775807L) {
                    i2 = 4;
                    avy avy = r3;
                    avy avy2 = new avy(this.d.a, this.d.h, d2);
                    this.i = avy;
                    this.j.a(this.i.a());
                } else {
                    i2 = 4;
                    this.j.a(new b(this.d.h));
                }
            } else {
                i2 = 4;
            }
            avy avy3 = this.i;
            avp avp = null;
            if (avy3 != null && avy3.b()) {
                return this.i.a(atl2, atr2, (c) null);
            }
            atl.a();
            long b2 = d2 != -1 ? d2 - atl.b() : -1;
            if ((b2 != -1 && b2 < 4) || !atl2.b(this.c.a, 0, i2, true)) {
                return -1;
            }
            this.c.c(0);
            int i4 = this.c.i();
            if (i4 == 441) {
                return -1;
            }
            if (i4 == 442) {
                atl2.c(this.c.a, 0, 10);
                this.c.c(9);
                atl2.b((this.c.c() & 7) + 14);
                return 0;
            } else if (i4 == 443) {
                atl2.c(this.c.a, 0, 2);
                this.c.c(0);
                atl2.b(this.c.d() + 6);
                return 0;
            } else if (((i4 & -256) >> 8) != 1) {
                atl2.b(1);
                return 0;
            } else {
                int i5 = i4 & 255;
                a aVar = (a) this.b.get(i5);
                if (!this.e) {
                    if (aVar == null) {
                        if (i5 == 189) {
                            avp = new avj();
                            this.f = true;
                            this.h = atl.c();
                        } else if ((i5 & 224) == 192) {
                            avp = new avv();
                            this.f = true;
                            this.h = atl.c();
                        } else if ((i5 & 240) == 224) {
                            avp = new avq();
                            this.g = true;
                            this.h = atl.c();
                        }
                        if (avp != null) {
                            avp.a(this.j, new d(i5, 256));
                            aVar = new a(avp, this.a);
                            this.b.put(i5, aVar);
                        }
                    }
                    if (atl.c() > ((!this.f || !this.g) ? 1048576 : this.h + 8192)) {
                        this.e = true;
                        this.j.a();
                    }
                }
                atl2.c(this.c.a, 0, 2);
                this.c.c(0);
                int d3 = this.c.d() + 6;
                if (aVar == null) {
                    atl2.b(d3);
                } else {
                    this.c.a(d3);
                    atl2.b(this.c.a, 0, d3);
                    this.c.c(6);
                    bea bea = this.c;
                    bea.a(aVar.c.a, 0, 3);
                    aVar.c.a(0);
                    aVar.c.b(8);
                    aVar.d = aVar.c.e();
                    aVar.e = aVar.c.e();
                    aVar.c.b(6);
                    aVar.g = aVar.c.c(8);
                    bea.a(aVar.c.a, 0, aVar.g);
                    aVar.c.a(0);
                    aVar.h = 0;
                    if (aVar.d) {
                        aVar.c.b(i2);
                        long c2 = ((long) aVar.c.c(3)) << 30;
                        aVar.c.b(1);
                        long c3 = c2 | ((long) (aVar.c.c(15) << 15));
                        aVar.c.b(1);
                        long c4 = c3 | ((long) aVar.c.c(15));
                        aVar.c.b(1);
                        if (aVar.f || !aVar.e) {
                            z = true;
                        } else {
                            aVar.c.b(i2);
                            long c5 = ((long) aVar.c.c(3)) << 30;
                            z = true;
                            aVar.c.b(1);
                            long c6 = c5 | ((long) (aVar.c.c(15) << 15));
                            aVar.c.b(1);
                            long c7 = ((long) aVar.c.c(15)) | c6;
                            aVar.c.b(1);
                            aVar.b.b(c7);
                            aVar.f = true;
                        }
                        aVar.h = aVar.b.b(c4);
                    } else {
                        z = true;
                    }
                    aVar.a.a(aVar.h, z);
                    aVar.a.a(bea);
                    aVar.a.b();
                    bea bea2 = this.c;
                    bea2.b(bea2.a.length);
                }
                return 0;
            }
        } else {
            avz avz = this.d;
            if (!avz.e) {
                int min = (int) Math.min(20000, atl.d());
                long d4 = atl.d() - ((long) min);
                if (atl.c() != d4) {
                    atr2.a = d4;
                } else {
                    atl.a();
                    atl2.c(avz.b.a, 0, min);
                    avz.b.c(0);
                    avz.b.b(min);
                    bea bea3 = avz.b;
                    int i6 = bea3.b;
                    int i7 = bea3.c - 4;
                    while (true) {
                        if (i7 < i6) {
                            j3 = -9223372036854775807L;
                            break;
                        }
                        if (avz.a(bea3.a, i7) == 442) {
                            bea3.c(i7 + 4);
                            j3 = avz.a(bea3);
                            if (j3 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i7--;
                    }
                    avz.g = j3;
                    avz.e = true;
                    return 0;
                }
            } else if (avz.g == -9223372036854775807L) {
                return avz.a(atl2);
            } else {
                if (!avz.d) {
                    if (atl.c() != 0) {
                        atr2.a = 0;
                    } else {
                        int min2 = (int) Math.min(20000, atl.d());
                        atl.a();
                        atl2.c(avz.b.a, 0, min2);
                        avz.b.c(0);
                        avz.b.b(min2);
                        bea bea4 = avz.b;
                        int i8 = bea4.b;
                        int i9 = bea4.c;
                        while (true) {
                            if (i8 >= i9 - 3) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (avz.a(bea4.a, i8) == 442) {
                                bea4.c(i8 + 4);
                                j2 = avz.a(bea4);
                                if (j2 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i8++;
                        }
                        avz.f = j2;
                        avz.d = true;
                        return 0;
                    }
                } else if (avz.f == -9223372036854775807L) {
                    return avz.a(atl2);
                } else {
                    avz.h = avz.a.b(avz.g) - avz.a.b(avz.f);
                    i3 = avz.a(atl2);
                }
            }
            return i3;
        }
    }

    public final void a(long j2, long j3) {
        if ((this.a.a() == -9223372036854775807L) || !(this.a.a == 0 || this.a.a == j3)) {
            bek bek = this.a;
            bek.c = -9223372036854775807L;
            bek.a(j3);
        }
        avy avy = this.i;
        if (avy != null) {
            avy.a(j3);
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            a aVar = (a) this.b.valueAt(i2);
            aVar.f = false;
            aVar.a.a();
        }
    }

    public final void a(atm atm) {
        this.j = atm;
    }

    public final boolean a(atl atl) {
        byte[] bArr = new byte[14];
        atl.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        atl.c(bArr[13] & 7);
        atl.c(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
