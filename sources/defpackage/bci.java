package defpackage;

import android.os.Handler;
import java.util.Collections;

/* renamed from: bci reason: default package */
public final class bci implements bca, bcu {
    private final bdr<defpackage.bca.a> a;
    private final bef b;
    private final bdn c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    /* renamed from: bci$a */
    public static final class a {
        public Handler a;
        public defpackage.bca.a b;
        private long c = 1000000;
        private int d = 2000;
        private bdn e = bdn.a;

        public final bci a() {
            bci bci = new bci(this.c, this.d, this.e, 0);
            Handler handler = this.a;
            if (handler != null) {
                defpackage.bca.a aVar = this.b;
                if (aVar != null) {
                    bci.a(handler, aVar);
                }
            }
            return bci;
        }
    }

    public bci() {
        this(1000000, 2000, bdn.a);
    }

    private bci(long j, int i2, bdn bdn) {
        this.a = new bdr<>();
        this.b = new bef(i2);
        this.c = bdn;
        this.i = j;
    }

    /* synthetic */ bci(long j, int i2, bdn bdn, byte b2) {
        this(j, i2, bdn);
    }

    public final synchronized long a() {
        return this.i;
    }

    public final void a(Handler handler, defpackage.bca.a aVar) {
        this.a.a(handler, aVar);
    }

    public final void a(defpackage.bca.a aVar) {
        this.a.a(aVar);
    }

    public final synchronized void a(boolean z) {
        if (z) {
            if (this.d == 0) {
                this.e = this.c.a();
            }
            this.d++;
        }
    }

    public final synchronized void a(boolean z, int i2) {
        if (z) {
            this.f += (long) i2;
        }
    }

    public final bcu b() {
        return this;
    }

    public final synchronized void b(boolean z) {
        defpackage.bef.a aVar;
        float f2;
        if (z) {
            int i2 = 0;
            bdl.b(this.d > 0);
            long a2 = this.c.a();
            int i3 = (int) (a2 - this.e);
            long j = (long) i3;
            this.g += j;
            this.h += this.f;
            if (i3 > 0) {
                float f3 = (float) ((this.f * 8000) / j);
                bef bef = this.b;
                int sqrt = (int) Math.sqrt((double) this.f);
                if (bef.f != 1) {
                    Collections.sort(bef.d, bef.a);
                    bef.f = 1;
                }
                if (bef.i > 0) {
                    defpackage.bef.a[] aVarArr = bef.e;
                    int i4 = bef.i - 1;
                    bef.i = i4;
                    aVar = aVarArr[i4];
                } else {
                    aVar = new defpackage.bef.a(0);
                }
                int i5 = bef.g;
                bef.g = i5 + 1;
                aVar.a = i5;
                aVar.b = sqrt;
                aVar.c = f3;
                bef.d.add(aVar);
                bef.h += sqrt;
                while (bef.h > bef.c) {
                    int i6 = bef.h - bef.c;
                    defpackage.bef.a aVar2 = (defpackage.bef.a) bef.d.get(0);
                    if (aVar2.b <= i6) {
                        bef.h -= aVar2.b;
                        bef.d.remove(0);
                        if (bef.i < 5) {
                            defpackage.bef.a[] aVarArr2 = bef.e;
                            int i7 = bef.i;
                            bef.i = i7 + 1;
                            aVarArr2[i7] = aVar2;
                        }
                    } else {
                        aVar2.b -= i6;
                        bef.h -= i6;
                    }
                }
                if (this.g >= 2000 || this.h >= 524288) {
                    bef bef2 = this.b;
                    if (bef2.f != 0) {
                        Collections.sort(bef2.d, bef.b);
                        bef2.f = 0;
                    }
                    float f4 = ((float) bef2.h) * 0.5f;
                    int i8 = 0;
                    while (true) {
                        if (i2 < bef2.d.size()) {
                            defpackage.bef.a aVar3 = (defpackage.bef.a) bef2.d.get(i2);
                            i8 += aVar3.b;
                            if (((float) i8) >= f4) {
                                f2 = aVar3.c;
                                break;
                            }
                            i2++;
                        } else {
                            f2 = bef2.d.isEmpty() ? Float.NaN : ((defpackage.bef.a) bef2.d.get(bef2.d.size() - 1)).c;
                        }
                    }
                    this.i = (long) f2;
                }
            }
            long j2 = this.f;
            long j3 = this.i;
            bdr<defpackage.bca.a> bdr = this.a;
            $$Lambda$bci$OOqWdHcdm_IQxDYEyGaWZ45SSMU r6 = new $$Lambda$bci$OOqWdHcdm_IQxDYEyGaWZ45SSMU(i3, j2, j3);
            bdr.a((defpackage.bdr.a<T>) r6);
            int i9 = this.d - 1;
            this.d = i9;
            if (i9 > 0) {
                this.e = a2;
            }
            this.f = 0;
        }
    }
}
