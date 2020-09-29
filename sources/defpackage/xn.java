package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xn reason: default package */
public final class xn implements xo, xw, a, za {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final List<xm> e;
    private final xc f;
    private List<xw> g;
    private yr h;

    private static List<xm> a(xc xcVar, aac aac, List<zs> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            xm a2 = ((zs) list.get(i)).a(xcVar, aac);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    private static zo a(List<zs> list) {
        for (int i = 0; i < list.size(); i++) {
            zs zsVar = (zs) list.get(i);
            if (zsVar instanceof zo) {
                return (zo) zsVar;
            }
        }
        return null;
    }

    xn(xc xcVar, aac aac, String str, List<xm> list, zo zoVar) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.f = xcVar;
        this.e = list;
        if (zoVar != null) {
            this.h = zoVar.a();
            this.h.a(aac);
            this.h.a((a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            xm xmVar = (xm) list.get(size);
            if (xmVar instanceof xt) {
                arrayList.add((xt) xmVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((xt) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    public final void a() {
        this.f.invalidateSelf();
    }

    public final String b() {
        return this.d;
    }

    public final void a(List<xm> list, List<xm> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.e.size());
        arrayList.addAll(list);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            xm xmVar = (xm) this.e.get(size);
            xmVar.a(arrayList, this.e.subList(0, size));
            arrayList.add(xmVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public final List<xw> c() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                xm xmVar = (xm) this.e.get(i);
                if (xmVar instanceof xw) {
                    this.g.add((xw) xmVar);
                }
            }
        }
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final Matrix d() {
        yr yrVar = this.h;
        if (yrVar != null) {
            return yrVar.a();
        }
        this.a.reset();
        return this.a;
    }

    public final Path e() {
        this.a.reset();
        yr yrVar = this.h;
        if (yrVar != null) {
            this.a.set(yrVar.a());
        }
        this.b.reset();
        for (int size = this.e.size() - 1; size >= 0; size--) {
            xm xmVar = (xm) this.e.get(size);
            if (xmVar instanceof xw) {
                this.b.addPath(((xw) xmVar).e(), this.a);
            }
        }
        return this.b;
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.set(matrix);
        yr yrVar = this.h;
        if (yrVar != null) {
            this.a.preConcat(yrVar.a());
            i = (int) ((((((float) ((Integer) this.h.e.d()).intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Object obj = this.e.get(size);
            if (obj instanceof xo) {
                ((xo) obj).a(canvas, this.a, i);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        yr yrVar = this.h;
        if (yrVar != null) {
            this.a.preConcat(yrVar.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            xm xmVar = (xm) this.e.get(size);
            if (xmVar instanceof xo) {
                ((xo) xmVar).a(this.c, this.a);
                if (rectF.isEmpty()) {
                    rectF.set(this.c);
                } else {
                    rectF.set(Math.min(rectF.left, this.c.left), Math.min(rectF.top, this.c.top), Math.max(rectF.right, this.c.right), Math.max(rectF.bottom, this.c.bottom));
                }
            }
        }
    }

    public final <T> void a(T t, abz<T> abz) {
        yr yrVar = this.h;
        if (yrVar != null) {
            yrVar.a(t, abz);
        }
    }

    public xn(xc xcVar, aac aac, aaa aaa) {
        this(xcVar, aac, aaa.a, a(xcVar, aac, aaa.b), a(aaa.b));
    }

    public final void a(yz yzVar, int i, List<yz> list, yz yzVar2) {
        if (yzVar.a(this.d, i)) {
            if (!"__container".equals(this.d)) {
                yzVar2 = yzVar2.a(this.d);
                if (yzVar.c(this.d, i)) {
                    list.add(yzVar2.a((za) this));
                }
            }
            if (yzVar.d(this.d, i)) {
                int b2 = i + yzVar.b(this.d, i);
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    xm xmVar = (xm) this.e.get(i2);
                    if (xmVar instanceof za) {
                        ((za) xmVar).a(yzVar, b2, list, yzVar2);
                    }
                }
            }
        }
    }
}
