package defpackage;

import android.util.SparseArray;

/* renamed from: avj reason: default package */
public final class avj implements ast {
    private final bdt a;
    private final SparseArray<a> b;
    private final bdj c;
    private final avi d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private avh i;
    private asv j;
    private boolean k;

    /* renamed from: avj$a */
    static final class a {
        final auy a;
        final bdt b;
        final bdi c = new bdi(new byte[64]);
        boolean d;
        boolean e;
        boolean f;
        int g;
        long h;

        public a(auy auy, bdt bdt) {
            this.a = auy;
            this.b = bdt;
        }
    }

    static {
        $$Lambda$avj$o8c8s4zh1cGQMRQmlC5nOrytsDo r0 = $$Lambda$avj$o8c8s4zh1cGQMRQmlC5nOrytsDo.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ast[] a() {
        return new ast[]{new avj()};
    }

    public avj() {
        this(new bdt(0));
    }

    private avj(bdt bdt) {
        this.a = bdt;
        this.c = new bdj(4096);
        this.b = new SparseArray<>();
        this.d = new avi();
    }

    public final boolean a(asu asu) {
        byte[] bArr = new byte[14];
        asu.c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        asu.c(bArr[13] & 7);
        asu.c(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public final void a(asv asv) {
        this.j = asv;
    }

    public final void a(long j2, long j3) {
        if ((this.a.a() == -9223372036854775807L) || !(this.a.a == 0 || this.a.a == j3)) {
            bdt bdt = this.a;
            bdt.c = -9223372036854775807L;
            bdt.a(j3);
        }
        avh avh = this.i;
        if (avh != null) {
            avh.a(j3);
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            a aVar = (a) this.b.valueAt(i2);
            aVar.f = false;
            aVar.a.a();
        }
    }

    public final int a(asu asu, ata ata) {
        int i2;
        boolean z;
        long j2;
        long j3;
        asu asu2 = asu;
        ata ata2 = ata;
        long d2 = asu.d();
        int i3 = 1;
        if (!(d2 != -1) || this.d.c) {
            if (!this.k) {
                this.k = true;
                if (this.d.h != -9223372036854775807L) {
                    i2 = 4;
                    avh avh = r3;
                    avh avh2 = new avh(this.d.a, this.d.h, d2);
                    this.i = avh;
                    this.j.a(this.i.a());
                } else {
                    i2 = 4;
                    this.j.a(new b(this.d.h));
                }
            } else {
                i2 = 4;
            }
            avh avh3 = this.i;
            auy auy = null;
            if (avh3 != null && avh3.b()) {
                return this.i.a(asu2, ata2, (c) null);
            }
            asu.a();
            long b2 = d2 != -1 ? d2 - asu.b() : -1;
            if ((b2 != -1 && b2 < 4) || !asu2.b(this.c.a, 0, i2, true)) {
                return -1;
            }
            this.c.c(0);
            int i4 = this.c.i();
            if (i4 == 441) {
                return -1;
            }
            if (i4 == 442) {
                asu2.c(this.c.a, 0, 10);
                this.c.c(9);
                asu2.b((this.c.c() & 7) + 14);
                return 0;
            } else if (i4 == 443) {
                asu2.c(this.c.a, 0, 2);
                this.c.c(0);
                asu2.b(this.c.d() + 6);
                return 0;
            } else if (((i4 & -256) >> 8) != 1) {
                asu2.b(1);
                return 0;
            } else {
                int i5 = i4 & 255;
                a aVar = (a) this.b.get(i5);
                if (!this.e) {
                    if (aVar == null) {
                        if (i5 == 189) {
                            auy = new aus();
                            this.f = true;
                            this.h = asu.c();
                        } else if ((i5 & 224) == 192) {
                            auy = new ave();
                            this.f = true;
                            this.h = asu.c();
                        } else if ((i5 & 240) == 224) {
                            auy = new auz();
                            this.g = true;
                            this.h = asu.c();
                        }
                        if (auy != null) {
                            auy.a(this.j, new d(i5, 256));
                            aVar = new a(auy, this.a);
                            this.b.put(i5, aVar);
                        }
                    }
                    if (asu.c() > ((!this.f || !this.g) ? 1048576 : this.h + 8192)) {
                        this.e = true;
                        this.j.a();
                    }
                }
                asu2.c(this.c.a, 0, 2);
                this.c.c(0);
                int d3 = this.c.d() + 6;
                if (aVar == null) {
                    asu2.b(d3);
                } else {
                    this.c.a(d3);
                    asu2.b(this.c.a, 0, d3);
                    this.c.c(6);
                    bdj bdj = this.c;
                    bdj.a(aVar.c.a, 0, 3);
                    aVar.c.a(0);
                    aVar.c.b(8);
                    aVar.d = aVar.c.e();
                    aVar.e = aVar.c.e();
                    aVar.c.b(6);
                    aVar.g = aVar.c.c(8);
                    bdj.a(aVar.c.a, 0, aVar.g);
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
                    aVar.a.a(bdj);
                    aVar.a.b();
                    bdj bdj2 = this.c;
                    bdj2.b(bdj2.a.length);
                }
                return 0;
            }
        } else {
            avi avi = this.d;
            if (!avi.e) {
                int min = (int) Math.min(20000, asu.d());
                long d4 = asu.d() - ((long) min);
                if (asu.c() != d4) {
                    ata2.a = d4;
                } else {
                    asu.a();
                    asu2.c(avi.b.a, 0, min);
                    avi.b.c(0);
                    avi.b.b(min);
                    bdj bdj3 = avi.b;
                    int i6 = bdj3.b;
                    int i7 = bdj3.c - 4;
                    while (true) {
                        if (i7 < i6) {
                            j3 = -9223372036854775807L;
                            break;
                        }
                        if (avi.a(bdj3.a, i7) == 442) {
                            bdj3.c(i7 + 4);
                            j3 = avi.a(bdj3);
                            if (j3 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i7--;
                    }
                    avi.g = j3;
                    avi.e = true;
                    return 0;
                }
            } else if (avi.g == -9223372036854775807L) {
                return avi.a(asu2);
            } else {
                if (!avi.d) {
                    if (asu.c() != 0) {
                        ata2.a = 0;
                    } else {
                        int min2 = (int) Math.min(20000, asu.d());
                        asu.a();
                        asu2.c(avi.b.a, 0, min2);
                        avi.b.c(0);
                        avi.b.b(min2);
                        bdj bdj4 = avi.b;
                        int i8 = bdj4.b;
                        int i9 = bdj4.c;
                        while (true) {
                            if (i8 >= i9 - 3) {
                                j2 = -9223372036854775807L;
                                break;
                            }
                            if (avi.a(bdj4.a, i8) == 442) {
                                bdj4.c(i8 + 4);
                                j2 = avi.a(bdj4);
                                if (j2 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i8++;
                        }
                        avi.f = j2;
                        avi.d = true;
                        return 0;
                    }
                } else if (avi.f == -9223372036854775807L) {
                    return avi.a(asu2);
                } else {
                    avi.h = avi.a.b(avi.g) - avi.a.b(avi.f);
                    i3 = avi.a(asu2);
                }
            }
            return i3;
        }
    }
}
