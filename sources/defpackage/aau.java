package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

/* renamed from: aau reason: default package */
public final class aau extends aaq {
    private final yb g;

    aau(xq xqVar, Layer layer) {
        super(xqVar, layer);
        this.g = new yb(xqVar, this, new aao("__container", layer.a));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.a(rectF, this.a);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    public final void b(zn znVar, int i, List<zn> list, zn znVar2) {
        this.g.a(znVar, i, list, znVar2);
    }
}
