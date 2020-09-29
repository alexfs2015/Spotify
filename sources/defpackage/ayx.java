package defpackage;

import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.util.List;

/* renamed from: ayx reason: default package */
final class ayx implements axt {
    final int a;
    final ayy b;
    int c = -1;

    public ayx(ayy ayy, int i) {
        this.b = ayy;
        this.a = i;
    }

    public final void c() {
        bcu.a(this.c == -1);
        this.c = this.b.a(this.a);
    }

    public final boolean a() {
        if (this.c != -3) {
            if (d()) {
                ayy ayy = this.b;
                if (ayy.w || (!ayy.i() && ayy.h[this.c].a.c())) {
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
        axx axx = this.b.p;
        throw new SampleQueueMappingException(axx.c[this.a].b[0].f);
    }

    public final int a(aqf aqf, arv arv, boolean z) {
        if (d()) {
            ayy ayy = this.b;
            int i = this.c;
            if (!ayy.i()) {
                int i2 = 0;
                if (!ayy.e.isEmpty()) {
                    int i3 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i3 >= ayy.e.size() - 1) {
                            break;
                        }
                        int i4 = ((ayu) ayy.e.get(i3)).a;
                        int length = ayy.h.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (ayy.s[i5] && ayy.h[i5].b() == i4) {
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
                    bdw.a((List<T>) ayy.e, 0, i3);
                    ayu ayu = (ayu) ayy.e.get(0);
                    aqe aqe = ayu.g;
                    if (!aqe.equals(ayy.n)) {
                        ayy.d.a(ayy.a, aqe, ayu.h, ayu.i, ayu.j);
                    }
                    ayy.n = aqe;
                }
                int a2 = ayy.h[i].a(aqf, arv, z, ayy.w, ayy.t);
                if (a2 == -5 && i == ayy.i) {
                    int b2 = ayy.h[i].b();
                    while (i2 < ayy.e.size() && ((ayu) ayy.e.get(i2)).a != b2) {
                        i2++;
                    }
                    aqf.a = aqf.a.a(i2 < ayy.e.size() ? ((ayu) ayy.e.get(i2)).g : ayy.m);
                }
                return a2;
            }
        }
        return -3;
    }

    public final int b_(long j) {
        int i = 0;
        if (d()) {
            ayy ayy = this.b;
            int i2 = this.c;
            if (!ayy.i()) {
                axs axs = ayy.h[i2];
                if (!ayy.w || j <= axs.a.e()) {
                    int b2 = axs.b(j, true, true);
                    return b2 == -1 ? i : b2;
                }
                i = axs.a.h();
            }
        }
    }

    private boolean d() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
