package defpackage;

import android.os.Handler;
import java.util.Collections;

/* renamed from: bbr reason: default package */
public final class bbr implements bbj, bcd {
    private final bda<defpackage.bbj.a> a;
    private final bdo b;
    private final bcw c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private long i;

    /* renamed from: bbr$a */
    public static final class a {
        public Handler a;
        public defpackage.bbj.a b;
        private long c = 1000000;
        private int d = 2000;
        private bcw e = bcw.a;

        public final bbr a() {
            bbr bbr = new bbr(this.c, this.d, this.e, 0);
            Handler handler = this.a;
            if (handler != null) {
                defpackage.bbj.a aVar = this.b;
                if (aVar != null) {
                    bbr.a(handler, aVar);
                }
            }
            return bbr;
        }
    }

    public final bcd b() {
        return this;
    }

    /* synthetic */ bbr(long j, int i2, bcw bcw, byte b2) {
        this(j, i2, bcw);
    }

    public bbr() {
        this(1000000, 2000, bcw.a);
    }

    private bbr(long j, int i2, bcw bcw) {
        this.a = new bda<>();
        this.b = new bdo(i2);
        this.c = bcw;
        this.i = j;
    }

    public final synchronized long a() {
        return this.i;
    }

    public final void a(Handler handler, defpackage.bbj.a aVar) {
        this.a.a(handler, aVar);
    }

    public final void a(defpackage.bbj.a aVar) {
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

    public final synchronized void b(boolean z) {
        defpackage.bdo.a aVar;
        float f2;
        if (z) {
            int i2 = 0;
            bcu.b(this.d > 0);
            long a2 = this.c.a();
            int i3 = (int) (a2 - this.e);
            long j = (long) i3;
            this.g += j;
            this.h += this.f;
            if (i3 > 0) {
                float f3 = (float) ((this.f * 8000) / j);
                bdo bdo = this.b;
                int sqrt = (int) Math.sqrt((double) this.f);
                if (bdo.f != 1) {
                    Collections.sort(bdo.d, bdo.a);
                    bdo.f = 1;
                }
                if (bdo.i > 0) {
                    defpackage.bdo.a[] aVarArr = bdo.e;
                    int i4 = bdo.i - 1;
                    bdo.i = i4;
                    aVar = aVarArr[i4];
                } else {
                    aVar = new defpackage.bdo.a(0);
                }
                int i5 = bdo.g;
                bdo.g = i5 + 1;
                aVar.a = i5;
                aVar.b = sqrt;
                aVar.c = f3;
                bdo.d.add(aVar);
                bdo.h += sqrt;
                while (bdo.h > bdo.c) {
                    int i6 = bdo.h - bdo.c;
                    defpackage.bdo.a aVar2 = (defpackage.bdo.a) bdo.d.get(0);
                    if (aVar2.b <= i6) {
                        bdo.h -= aVar2.b;
                        bdo.d.remove(0);
                        if (bdo.i < 5) {
                            defpackage.bdo.a[] aVarArr2 = bdo.e;
                            int i7 = bdo.i;
                            bdo.i = i7 + 1;
                            aVarArr2[i7] = aVar2;
                        }
                    } else {
                        aVar2.b -= i6;
                        bdo.h -= i6;
                    }
                }
                if (this.g >= 2000 || this.h >= 524288) {
                    bdo bdo2 = this.b;
                    if (bdo2.f != 0) {
                        Collections.sort(bdo2.d, bdo.b);
                        bdo2.f = 0;
                    }
                    float f4 = ((float) bdo2.h) * 0.5f;
                    int i8 = 0;
                    while (true) {
                        if (i2 < bdo2.d.size()) {
                            defpackage.bdo.a aVar3 = (defpackage.bdo.a) bdo2.d.get(i2);
                            i8 += aVar3.b;
                            if (((float) i8) >= f4) {
                                f2 = aVar3.c;
                                break;
                            }
                            i2++;
                        } else {
                            f2 = bdo2.d.isEmpty() ? Float.NaN : ((defpackage.bdo.a) bdo2.d.get(bdo2.d.size() - 1)).c;
                        }
                    }
                    this.i = (long) f2;
                }
            }
            long j2 = this.f;
            long j3 = this.i;
            bda<defpackage.bbj.a> bda = this.a;
            $$Lambda$bbr$clqaf6Bq3ndY5uvGmdGDI203pAA r6 = new $$Lambda$bbr$clqaf6Bq3ndY5uvGmdGDI203pAA(i3, j2, j3);
            bda.a((defpackage.bda.a<T>) r6);
            int i9 = this.d - 1;
            this.d = i9;
            if (i9 > 0) {
                this.e = a2;
            }
            this.f = 0;
        }
    }
}
