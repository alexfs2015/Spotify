package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: auv reason: default package */
public final class auv implements c {
    private final int a;
    private final List<aqe> b;

    public auv() {
        this(0);
    }

    public auv(int i) {
        this(i, Collections.singletonList(aqe.a(null, "application/cea-608", 0, null)));
    }

    public auv(int i, List<aqe> list) {
        this.a = i;
        this.b = list;
    }

    public final SparseArray<avr> a() {
        return new SparseArray<>();
    }

    public final avr a(int i, b bVar) {
        if (i == 2) {
            return new avg(new auz(new avt(b(bVar))));
        }
        if (i == 3 || i == 4) {
            return new avg(new ave(bVar.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new avg(new avc());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new avg(new avb(a(bVar)));
                    }
                    if (i == 89) {
                        return new avg(new aux(bVar.c));
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
                                    return new avl(new avn());
                                }
                            }
                        }
                        return new avg(new aus(bVar.b));
                    }
                    return new avg(new auw(bVar.b));
                } else if (a(4)) {
                    return null;
                } else {
                    return new avg(new ava(a(bVar), a(1), a(8)));
                }
            } else if (a(2)) {
                return null;
            } else {
                return new avg(new avd(bVar.b));
            }
        } else if (a(2)) {
            return null;
        } else {
            return new avg(new auu(false, bVar.b));
        }
    }

    private avm a(b bVar) {
        return new avm(b(bVar));
    }

    private List<aqe> b(b bVar) {
        int i;
        String str;
        List list;
        if (a(32)) {
            return this.b;
        }
        bdj bdj = new bdj(bVar.d);
        List<aqe> list2 = this.b;
        while (bdj.b() > 0) {
            int c = bdj.b + bdj.c();
            if (bdj.c() == 134) {
                list2 = new ArrayList<>();
                int c2 = bdj.c() & 31;
                for (int i2 = 0; i2 < c2; i2++) {
                    String e = bdj.e(3);
                    int c3 = bdj.c();
                    boolean z = (c3 & 128) != 0;
                    if (z) {
                        i = c3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte c4 = (byte) bdj.c();
                    bdj.d(1);
                    if (z) {
                        list = Collections.singletonList(new byte[]{(byte) ((c4 & 64) != 0 ? 1 : 0)});
                    } else {
                        list = null;
                    }
                    list2.add(aqe.a((String) null, str, (String) null, -1, 0, e, i, (asc) null, Long.MAX_VALUE, list));
                }
            }
            bdj.c(c);
        }
        return list2;
    }

    private boolean a(int i) {
        return (i & this.a) != 0;
    }
}
