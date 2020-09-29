package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yb reason: default package */
public final class yb implements yc, yk, a, zo {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final List<ya> e;
    private final xq f;
    private List<yk> g;
    private zf h;

    public yb(xq xqVar, aaq aaq, aao aao) {
        this(xqVar, aaq, aao.a, a(xqVar, aaq, aao.b), a(aao.b));
    }

    yb(xq xqVar, aaq aaq, String str, List<ya> list, aac aac) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.f = xqVar;
        this.e = list;
        if (aac != null) {
            this.h = aac.a();
            this.h.a(aaq);
            this.h.a((a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            ya yaVar = (ya) list.get(size);
            if (yaVar instanceof yh) {
                arrayList.add((yh) yaVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((yh) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    private static aac a(List<aag> list) {
        for (int i = 0; i < list.size(); i++) {
            aag aag = (aag) list.get(i);
            if (aag instanceof aac) {
                return (aac) aag;
            }
        }
        return null;
    }

    private static List<ya> a(xq xqVar, aaq aaq, List<aag> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ya a2 = ((aag) list.get(i)).a(xqVar, aaq);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final void a() {
        this.f.invalidateSelf();
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.a.set(matrix);
        zf zfVar = this.h;
        if (zfVar != null) {
            this.a.preConcat(zfVar.a());
            i = (int) ((((((float) ((Integer) this.h.e.d()).intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            Object obj = this.e.get(size);
            if (obj instanceof yc) {
                ((yc) obj).a(canvas, this.a, i);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.a.set(matrix);
        zf zfVar = this.h;
        if (zfVar != null) {
            this.a.preConcat(zfVar.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ya yaVar = (ya) this.e.get(size);
            if (yaVar instanceof yc) {
                ((yc) yaVar).a(this.c, this.a);
                if (rectF.isEmpty()) {
                    rectF.set(this.c);
                } else {
                    rectF.set(Math.min(rectF.left, this.c.left), Math.min(rectF.top, this.c.top), Math.max(rectF.right, this.c.right), Math.max(rectF.bottom, this.c.bottom));
                }
            }
        }
    }

    public final <T> void a(T t, acn<T> acn) {
        zf zfVar = this.h;
        if (zfVar != null) {
            zfVar.a(t, acn);
        }
    }

    public final void a(List<ya> list, List<ya> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.e.size());
        arrayList.addAll(list);
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ya yaVar = (ya) this.e.get(size);
            yaVar.a(arrayList, this.e.subList(0, size));
            arrayList.add(yaVar);
        }
    }

    public final void a(zn znVar, int i, List<zn> list, zn znVar2) {
        if (znVar.a(this.d, i)) {
            if (!"__container".equals(this.d)) {
                znVar2 = znVar2.a(this.d);
                if (znVar.c(this.d, i)) {
                    list.add(znVar2.a((zo) this));
                }
            }
            if (znVar.d(this.d, i)) {
                int b2 = i + znVar.b(this.d, i);
                for (int i2 = 0; i2 < this.e.size(); i2++) {
                    ya yaVar = (ya) this.e.get(i2);
                    if (yaVar instanceof zo) {
                        ((zo) yaVar).a(znVar, b2, list, znVar2);
                    }
                }
            }
        }
    }

    public final String b() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final List<yk> c() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.e.size(); i++) {
                ya yaVar = (ya) this.e.get(i);
                if (yaVar instanceof yk) {
                    this.g.add((yk) yaVar);
                }
            }
        }
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public final Matrix d() {
        zf zfVar = this.h;
        if (zfVar != null) {
            return zfVar.a();
        }
        this.a.reset();
        return this.a;
    }

    public final Path e() {
        this.a.reset();
        zf zfVar = this.h;
        if (zfVar != null) {
            this.a.set(zfVar.a());
        }
        this.b.reset();
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ya yaVar = (ya) this.e.get(size);
            if (yaVar instanceof yk) {
                this.b.addPath(((yk) yaVar).e(), this.a);
            }
        }
        return this.b;
    }
}
