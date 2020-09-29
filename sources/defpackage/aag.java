package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import java.util.Collections;
import java.util.List;

/* renamed from: aag reason: default package */
public final class aag extends aac {
    private final xn g;

    aag(xc xcVar, Layer layer) {
        super(xcVar, layer);
        this.g = new xn(xcVar, this, new aaa("__container", layer.a));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    public final void b(Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.g.a(rectF, this.a);
    }

    /* access modifiers changed from: protected */
    public final void b(yz yzVar, int i, List<yz> list, yz yzVar2) {
        this.g.a(yzVar, i, list, yzVar2);
    }
}
