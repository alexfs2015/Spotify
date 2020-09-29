package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avm reason: default package */
public final class avm implements c {
    private final int a;
    private final List<aqv> b;

    public avm() {
        this(0);
    }

    public avm(int i) {
        this(i, Collections.singletonList(aqv.a(null, "application/cea-608", 0, null)));
    }

    public avm(int i, List<aqv> list) {
        this.a = i;
        this.b = list;
    }

    private awd a(b bVar) {
        return new awd(b(bVar));
    }

    private boolean a(int i) {
        return (i & this.a) != 0;
    }

    private List<aqv> b(b bVar) {
        int i;
        String str;
        List list;
        if (a(32)) {
            return this.b;
        }
        bea bea = new bea(bVar.d);
        List<aqv> list2 = this.b;
        while (bea.b() > 0) {
            int c = bea.b + bea.c();
            if (bea.c() == 134) {
                list2 = new ArrayList<>();
                int c2 = bea.c() & 31;
                for (int i2 = 0; i2 < c2; i2++) {
                    String e = bea.e(3);
                    int c3 = bea.c();
                    boolean z = (c3 & 128) != 0;
                    if (z) {
                        i = c3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte c4 = (byte) bea.c();
                    bea.d(1);
                    if (z) {
                        list = Collections.singletonList(new byte[]{(byte) ((c4 & 64) != 0 ? 1 : 0)});
                    } else {
                        list = null;
                    }
                    list2.add(aqv.a((String) null, str, (String) null, -1, 0, e, i, (ast) null, Long.MAX_VALUE, list));
                }
            }
            bea.c(c);
        }
        return list2;
    }

    public final SparseArray<awi> a() {
        return new SparseArray<>();
    }

    public final awi a(int i, b bVar) {
        if (i == 2) {
            return new avx(new avq(new awk(b(bVar))));
        }
        if (i == 3 || i == 4) {
            return new avx(new avv(bVar.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new avx(new avt());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new avx(new avs(a(bVar)));
                    }
                    if (i == 89) {
                        return new avx(new avo(bVar.c));
                    }
                    if (i != 138) {
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (a(16)) {
                                    return null;
                                } else {
                                    return new awc(new awe());
                                }
                            }
                        }
                        return new avx(new avj(bVar.b));
                    }
                    return new avx(new avn(bVar.b));
                } else if (a(4)) {
                    return null;
                } else {
                    return new avx(new avr(a(bVar), a(1), a(8)));
                }
            } else if (a(2)) {
                return null;
            } else {
                return new avx(new avu(bVar.b));
            }
        } else if (a(2)) {
            return null;
        } else {
            return new avx(new avl(false, bVar.b));
        }
    }
}
