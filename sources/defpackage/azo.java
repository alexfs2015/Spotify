package defpackage;

import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.util.List;

/* renamed from: azo reason: default package */
final class azo implements ayk {
    final int a;
    final azp b;
    int c = -1;

    public azo(azp azp, int i) {
        this.b = azp;
        this.a = i;
    }

    private boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    public final int a(aqw aqw, asm asm, boolean z) {
        if (d()) {
            azp azp = this.b;
            int i = this.c;
            if (!azp.i()) {
                int i2 = 0;
                if (!azp.e.isEmpty()) {
                    int i3 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i3 >= azp.e.size() - 1) {
                            break;
                        }
                        int i4 = ((azl) azp.e.get(i3)).a;
                        int length = azp.h.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (azp.s[i5] && azp.h[i5].b() == i4) {
                                    z2 = false;
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        if (!z2) {
                            break;
                        }
                        i3++;
                    }
                    ben.a((List<T>) azp.e, 0, i3);
                    azl azl = (azl) azp.e.get(0);
                    aqv aqv = azl.g;
                    if (!aqv.equals(azp.n)) {
                        azp.d.a(azp.a, aqv, azl.h, azl.i, azl.j);
                    }
                    azp.n = aqv;
                }
                int a2 = azp.h[i].a(aqw, asm, z, azp.w, azp.t);
                if (a2 == -5 && i == azp.i) {
                    int b2 = azp.h[i].b();
                    while (i2 < azp.e.size() && ((azl) azp.e.get(i2)).a != b2) {
                        i2++;
                    }
                    aqw.a = aqw.a.a(i2 < azp.e.size() ? ((azl) azp.e.get(i2)).g : azp.m);
                }
                return a2;
            }
        }
        return -3;
    }

    public final boolean a() {
        if (this.c != -3) {
            if (d()) {
                azp azp = this.b;
                if (azp.w || (!azp.i() && azp.h[this.c].a.c())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void b() {
        if (this.c != -2) {
            this.b.b.a();
            return;
        }
        ayo ayo = this.b.p;
        throw new SampleQueueMappingException(ayo.c[this.a].b[0].f);
    }

    public final int b_(long j) {
        int i = 0;
        if (d()) {
            azp azp = this.b;
            int i2 = this.c;
            if (!azp.i()) {
                ayj ayj = azp.h[i2];
                if (!azp.w || j <= ayj.a.e()) {
                    int b2 = ayj.b(j, true, true);
                    return b2 == -1 ? i : b2;
                }
                i = ayj.a.h();
            }
        }
    }

    public final void c() {
        bdl.a(this.c == -1);
        this.c = this.b.a(this.a);
    }
}
