package defpackage;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: ee reason: default package */
public final class ee {
    private static int a(ConstraintWidget constraintWidget) {
        if (constraintWidget.y() == DimensionBehaviour.MATCH_CONSTRAINT) {
            int n = (int) (constraintWidget.H == 0 ? ((float) constraintWidget.n()) * constraintWidget.G : ((float) constraintWidget.n()) / constraintWidget.G);
            constraintWidget.e(n);
            return n;
        } else if (constraintWidget.z() != DimensionBehaviour.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int m = (int) (constraintWidget.H == 1 ? ((float) constraintWidget.m()) * constraintWidget.G : ((float) constraintWidget.m()) / constraintWidget.G);
            constraintWidget.f(m);
            return m;
        }
    }

    private static int a(ConstraintWidget constraintWidget, int i) {
        int i2 = i << 1;
        ConstraintAnchor constraintAnchor = constraintWidget.A[i2];
        ConstraintAnchor constraintAnchor2 = constraintWidget.A[i2 + 1];
        if (constraintAnchor.d == null || constraintAnchor.d.b != constraintWidget.D || constraintAnchor2.d == null || constraintAnchor2.d.b != constraintWidget.D) {
            return 0;
        }
        return (int) (((float) (((constraintWidget.D.b(i) - constraintAnchor.b()) - constraintAnchor2.b()) - constraintWidget.b(i))) * (i == 0 ? constraintWidget.R : constraintWidget.S));
    }

    private static int a(ConstraintWidget constraintWidget, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int m;
        int i9;
        int i10;
        ConstraintWidget constraintWidget2 = constraintWidget;
        int i11 = i;
        boolean z2 = z;
        int i12 = 0;
        if (!constraintWidget2.W) {
            return 0;
        }
        boolean z3 = constraintWidget2.y.d != null && i11 == 1;
        if (z2) {
            i6 = constraintWidget2.M;
            i5 = constraintWidget.n() - constraintWidget2.M;
            i4 = i11 << 1;
            i3 = i4 + 1;
        } else {
            i6 = constraintWidget.n() - constraintWidget2.M;
            i5 = constraintWidget2.M;
            i3 = i11 << 1;
            i4 = i3 + 1;
        }
        if (constraintWidget2.A[i3].d == null || constraintWidget2.A[i4].d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int b = (constraintWidget2.A[i4].b() * i8) + a(constraintWidget, i);
        int i13 = (z3 ? i2 - i6 : i2) + b;
        int m2 = (i11 == 0 ? constraintWidget.m() : constraintWidget.n()) * i8;
        Iterator it = constraintWidget2.A[i4].a.f.iterator();
        while (it.hasNext()) {
            i12 = Math.max(i12, a(((eo) ((eq) it.next())).a.b, i11, z2, i13));
        }
        Iterator it2 = constraintWidget2.A[i7].a.f.iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i14 = Math.max(i14, a(((eo) ((eq) it2.next())).a.b, i11, z2, m2 + i13));
            it2 = it3;
        }
        if (z3) {
            i12 -= i6;
            m = i14 + i5;
        } else {
            m = i14 + ((i11 == 0 ? constraintWidget.m() : constraintWidget.n()) * i8);
        }
        int i15 = 1;
        if (i11 == 1) {
            Iterator it4 = constraintWidget2.y.a.f.iterator();
            int i16 = 0;
            while (it4.hasNext()) {
                Iterator it5 = it4;
                eo eoVar = (eo) ((eq) it4.next());
                if (i8 == i15) {
                    i16 = Math.max(i16, a(eoVar.a.b, i11, z2, i6 + i13));
                    it4 = it5;
                } else {
                    int i17 = i7;
                    i16 = Math.max(i16, a(eoVar.a.b, i11, z2, (i5 * i8) + i13));
                    it4 = it5;
                    i7 = i17;
                }
                i15 = 1;
            }
            i9 = i7;
            int i18 = i16;
            i10 = (constraintWidget2.y.a.f.size() <= 0 || z3) ? i18 : i8 == 1 ? i18 + i6 : i18 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b + Math.max(i12, Math.max(m, i10));
        int i19 = i13 + m2;
        if (i8 == -1) {
            int i20 = i13;
            i13 = i19;
            i19 = i20;
        }
        if (z2) {
            em.a(constraintWidget2, i11, i13);
            constraintWidget2.a(i13, i19, i11);
        } else {
            constraintWidget2.r.a(constraintWidget2, i11);
            constraintWidget2.e(i13, i11);
        }
        if (constraintWidget.i(i) == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.G != 0.0f) {
            constraintWidget2.r.a(constraintWidget2, i11);
        }
        if (!(constraintWidget2.A[i4].d == null || constraintWidget2.A[i9].d == null)) {
            ConstraintWidget constraintWidget3 = constraintWidget2.D;
            if (constraintWidget2.A[i4].d.b == constraintWidget3 && constraintWidget2.A[i9].d.b == constraintWidget3) {
                constraintWidget2.r.a(constraintWidget2, i11);
            }
        }
        return max;
    }

    private static int a(ej ejVar, int i) {
        int i2 = i << 1;
        List<ConstraintWidget> list = i == 0 ? ejVar.d : i == 1 ? ejVar.e : null;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) list.get(i4);
            int i5 = i2 + 1;
            i3 = Math.max(i3, a(constraintWidget, i, constraintWidget.A[i5].d == null || !(constraintWidget.A[i2].d == null || constraintWidget.A[i5].d == null), 0));
        }
        ejVar.c[i] = i3;
        return i3;
    }

    public static void a(ei eiVar) {
        if ((eiVar.an & 32) != 32) {
            b(eiVar);
            return;
        }
        eiVar.ao = true;
        eiVar.ai = false;
        eiVar.aj = false;
        eiVar.ak = false;
        ArrayList<ConstraintWidget> arrayList = eiVar.ar;
        List<ej> list = eiVar.ah;
        boolean z = eiVar.y() == DimensionBehaviour.WRAP_CONTENT;
        boolean z2 = eiVar.z() == DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (ConstraintWidget constraintWidget : arrayList) {
            constraintWidget.r = null;
            constraintWidget.Y = false;
            constraintWidget.b();
        }
        for (ConstraintWidget constraintWidget2 : arrayList) {
            if (constraintWidget2.r == null) {
                ej ejVar = new ej(new ArrayList(), true);
                list.add(ejVar);
                if (!a(constraintWidget2, ejVar, list, z3)) {
                    b(eiVar);
                    eiVar.ao = false;
                    return;
                }
            }
        }
        int i = 0;
        int i2 = 0;
        for (ej ejVar2 : list) {
            i = Math.max(i, a(ejVar2, 0));
            i2 = Math.max(i2, a(ejVar2, 1));
        }
        if (z) {
            eiVar.a(DimensionBehaviour.FIXED);
            eiVar.e(i);
            eiVar.ai = true;
            eiVar.aj = true;
            eiVar.al = i;
        }
        if (z2) {
            eiVar.b(DimensionBehaviour.FIXED);
            eiVar.f(i2);
            eiVar.ai = true;
            eiVar.ak = true;
            eiVar.am = i2;
        }
        a(list, 0, eiVar.m());
        a(list, 1, eiVar.n());
    }

    private static void a(ei eiVar, ConstraintWidget constraintWidget, ej ejVar) {
        ejVar.b = false;
        eiVar.ao = false;
        constraintWidget.W = false;
    }

    public static void a(List<ej> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ej ejVar = (ej) list.get(i3);
            HashSet<ConstraintWidget> hashSet = i == 0 ? ejVar.f : i == 1 ? ejVar.g : null;
            for (ConstraintWidget constraintWidget : hashSet) {
                if (constraintWidget.W) {
                    int i4 = i << 1;
                    ConstraintAnchor constraintAnchor = constraintWidget.A[i4];
                    ConstraintAnchor constraintAnchor2 = constraintWidget.A[i4 + 1];
                    if ((constraintAnchor.d == null || constraintAnchor2.d == null) ? false : true) {
                        em.a(constraintWidget, i, a(constraintWidget, i) + constraintAnchor.b());
                    } else if (constraintWidget.G == 0.0f || constraintWidget.i(i) != DimensionBehaviour.MATCH_CONSTRAINT) {
                        int i5 = i == 0 ? constraintWidget.K : i == 1 ? constraintWidget.L : 0;
                        int i6 = i2 - i5;
                        int b = i6 - constraintWidget.b(i);
                        constraintWidget.a(b, i6, i);
                        em.a(constraintWidget, i, b);
                    } else {
                        int a = a(constraintWidget);
                        int i7 = (int) constraintWidget.A[i4].a.d;
                        int i8 = i7 + a;
                        constraintAnchor2.a.c = constraintAnchor.a;
                        constraintAnchor2.a.d = (float) a;
                        constraintAnchor2.a.g = 1;
                        constraintWidget.a(i7, i8, i);
                    }
                }
            }
        }
    }

    private static boolean a(ConstraintWidget constraintWidget, ej ejVar, List<ej> list, boolean z) {
        if (constraintWidget == null) {
            return true;
        }
        constraintWidget.X = false;
        ei eiVar = (ei) constraintWidget.D;
        if (constraintWidget.r == null) {
            constraintWidget.W = true;
            ejVar.a.add(constraintWidget);
            constraintWidget.r = ejVar;
            if (constraintWidget.u.d == null && constraintWidget.w.d == null && constraintWidget.v.d == null && constraintWidget.x.d == null && constraintWidget.y.d == null && constraintWidget.z.d == null) {
                a(eiVar, constraintWidget, ejVar);
                if (z) {
                    return false;
                }
            }
            if (!(constraintWidget.v.d == null || constraintWidget.x.d == null)) {
                DimensionBehaviour dimensionBehaviour = DimensionBehaviour.WRAP_CONTENT;
                if (z) {
                    a(eiVar, constraintWidget, ejVar);
                    return false;
                } else if (!(constraintWidget.v.d.b == constraintWidget.D && constraintWidget.x.d.b == constraintWidget.D)) {
                    a(eiVar, constraintWidget, ejVar);
                }
            }
            if (!(constraintWidget.u.d == null || constraintWidget.w.d == null)) {
                DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (z) {
                    a(eiVar, constraintWidget, ejVar);
                    return false;
                } else if (!(constraintWidget.u.d.b == constraintWidget.D && constraintWidget.w.d.b == constraintWidget.D)) {
                    a(eiVar, constraintWidget, ejVar);
                }
            }
            if (((constraintWidget.y() == DimensionBehaviour.MATCH_CONSTRAINT) ^ (constraintWidget.z() == DimensionBehaviour.MATCH_CONSTRAINT)) && constraintWidget.G != 0.0f) {
                a(constraintWidget);
            } else if (constraintWidget.y() == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.z() == DimensionBehaviour.MATCH_CONSTRAINT) {
                a(eiVar, constraintWidget, ejVar);
                if (z) {
                    return false;
                }
            }
            if (((constraintWidget.u.d == null && constraintWidget.w.d == null) || ((constraintWidget.u.d != null && constraintWidget.u.d.b == constraintWidget.D && constraintWidget.w.d == null) || ((constraintWidget.w.d != null && constraintWidget.w.d.b == constraintWidget.D && constraintWidget.u.d == null) || (constraintWidget.u.d != null && constraintWidget.u.d.b == constraintWidget.D && constraintWidget.w.d != null && constraintWidget.w.d.b == constraintWidget.D)))) && constraintWidget.z.d == null && !(constraintWidget instanceof ek) && !(constraintWidget instanceof el)) {
                ejVar.d.add(constraintWidget);
            }
            if (((constraintWidget.v.d == null && constraintWidget.x.d == null) || ((constraintWidget.v.d != null && constraintWidget.v.d.b == constraintWidget.D && constraintWidget.x.d == null) || ((constraintWidget.x.d != null && constraintWidget.x.d.b == constraintWidget.D && constraintWidget.v.d == null) || (constraintWidget.v.d != null && constraintWidget.v.d.b == constraintWidget.D && constraintWidget.x.d != null && constraintWidget.x.d.b == constraintWidget.D)))) && constraintWidget.z.d == null && constraintWidget.y.d == null && !(constraintWidget instanceof ek) && !(constraintWidget instanceof el)) {
                ejVar.e.add(constraintWidget);
            }
            if (constraintWidget instanceof el) {
                a(eiVar, constraintWidget, ejVar);
                if (z) {
                    return false;
                }
                el elVar = (el) constraintWidget;
                for (int i = 0; i < elVar.af; i++) {
                    if (!a(elVar.ae[i], ejVar, list, z)) {
                        return false;
                    }
                }
            }
            for (ConstraintAnchor constraintAnchor : constraintWidget.A) {
                if (!(constraintAnchor.d == null || constraintAnchor.d.b == constraintWidget.D)) {
                    if (constraintAnchor.c == Type.CENTER) {
                        a(eiVar, constraintWidget, ejVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        eo eoVar = constraintAnchor.a;
                        if (!(constraintAnchor.d == null || constraintAnchor.d.d == constraintAnchor)) {
                            constraintAnchor.d.a.a(eoVar);
                        }
                    }
                    if (!a(constraintAnchor.d.b, ejVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (constraintWidget.r != ejVar) {
            ejVar.a.addAll(constraintWidget.r.a);
            ejVar.d.addAll(constraintWidget.r.d);
            ejVar.e.addAll(constraintWidget.r.e);
            if (!constraintWidget.r.b) {
                ejVar.b = false;
            }
            list.remove(constraintWidget.r);
            for (ConstraintWidget constraintWidget2 : constraintWidget.r.a) {
                constraintWidget2.r = ejVar;
            }
        }
        return true;
    }

    private static void b(ei eiVar) {
        eiVar.ah.clear();
        eiVar.ah.add(0, new ej(eiVar.ar));
    }
}
