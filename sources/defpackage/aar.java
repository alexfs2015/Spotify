package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aar reason: default package */
public final class aar extends aaq {
    private yr<Float, Float> g;
    private final List<aaq> h = new ArrayList();
    private final RectF i = new RectF();
    private final RectF j = new RectF();

    /* renamed from: aar$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[MatteType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.Add     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.Invert     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aar.AnonymousClass1.<clinit>():void");
        }
    }

    public aar(xq xqVar, Layer layer, List<Layer> list, xo xoVar) {
        aaq aaq;
        super(xqVar, layer);
        zs zsVar = layer.s;
        if (zsVar != null) {
            this.g = zsVar.a();
            a(this.g);
            this.g.a((a) this);
        } else {
            this.g = null;
        }
        ds dsVar = new ds(xoVar.g.size());
        int size = list.size() - 1;
        aaq aaq2 = null;
        while (true) {
            if (size >= 0) {
                Layer layer2 = (Layer) list.get(size);
                switch (layer2.e) {
                    case Shape:
                        aaq = new aau(xqVar, layer2);
                        break;
                    case PreComp:
                        aaq = new aar(xqVar, layer2, (List) xoVar.b.get(layer2.g), xoVar);
                        break;
                    case Solid:
                        aaq = new aav(xqVar, layer2);
                        break;
                    case Image:
                        aaq = new aas(xqVar, layer2);
                        break;
                    case Null:
                        aaq = new aat(xqVar, layer2);
                        break;
                    case Text:
                        aaq = new aaw(xqVar, layer2);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(layer2.e);
                        xn.b(sb.toString());
                        aaq = null;
                        break;
                }
                if (aaq != null) {
                    dsVar.b(aaq.c.d, aaq);
                    if (aaq2 != null) {
                        aaq2.d = aaq;
                        aaq2 = null;
                    } else {
                        this.h.add(0, aaq);
                        int i2 = AnonymousClass1.a[layer2.u.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            aaq2 = aaq;
                        }
                    }
                }
                size--;
            } else {
                for (int i3 = 0; i3 < dsVar.b(); i3++) {
                    aaq aaq3 = (aaq) dsVar.a(dsVar.b(i3), null);
                    if (aaq3 != null) {
                        aaq aaq4 = (aaq) dsVar.a(aaq3.c.f, null);
                        if (aaq4 != null) {
                            aaq3.e = aaq4;
                        }
                    }
                }
                return;
            }
        }
    }

    public final void a(float f) {
        super.a(f);
        if (this.g != null) {
            f = ((float) ((long) (((Float) this.g.d()).floatValue() * 1000.0f))) / this.b.a.a();
        }
        if (this.c.m != 0.0f) {
            f /= this.c.m;
        }
        Layer layer = this.c;
        float b = f - (layer.n / layer.b.b());
        for (int size = this.h.size() - 1; size >= 0; size--) {
            ((aaq) this.h.get(size)).a(b);
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            ((aaq) this.h.get(size)).a(this.i, this.a);
            if (rectF.isEmpty()) {
                rectF.set(this.i);
            } else {
                rectF.set(Math.min(rectF.left, this.i.left), Math.min(rectF.top, this.i.top), Math.max(rectF.right, this.i.right), Math.max(rectF.bottom, this.i.bottom));
            }
        }
    }

    public final <T> void a(T t, acn<T> acn) {
        super.a(t, acn);
        if (t == xt.w) {
            if (acn == null) {
                this.g = null;
            } else {
                this.g = new zg(acn);
                a(this.g);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        String str = "CompositionLayer#draw";
        xn.c(str);
        canvas.save();
        this.j.set(0.0f, 0.0f, (float) this.c.o, (float) this.c.p);
        matrix.mapRect(this.j);
        for (int size = this.h.size() - 1; size >= 0; size--) {
            if (!this.j.isEmpty() ? canvas.clipRect(this.j) : true) {
                ((aaq) this.h.get(size)).a(canvas, matrix, i2);
            }
        }
        canvas.restore();
        xn.d(str);
    }

    /* access modifiers changed from: protected */
    public final void b(zn znVar, int i2, List<zn> list, zn znVar2) {
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            ((aaq) this.h.get(i3)).a(znVar, i2, list, znVar2);
        }
    }
}
