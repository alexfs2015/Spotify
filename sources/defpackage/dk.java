package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: dk reason: default package */
public class dk implements dm {
    final RectF a = new RectF();

    private static C0094do e(dl dlVar) {
        return (C0094do) dlVar.c();
    }

    public final float a(dl dlVar) {
        return e(dlVar).a();
    }

    public void a() {
        C0094do.a = new a() {
            public final void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    dk.this.a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    Paint paint2 = paint;
                    canvas.drawArc(dk.this.a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(dk.this.a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(dk.this.a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(dk.this.a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint2);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint2);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    public final void a(dl dlVar, float f) {
        C0094do e = e(dlVar);
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (e.b != f2) {
                e.b = f2;
                e.c = true;
                e.invalidateSelf();
            }
            d(dlVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(dl dlVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0094do doVar = new C0094do(context.getResources(), colorStateList, f, f2, f3);
        doVar.d = dlVar.b();
        doVar.invalidateSelf();
        dlVar.a(doVar);
        d(dlVar);
    }

    public final void a(dl dlVar, ColorStateList colorStateList) {
        C0094do e = e(dlVar);
        e.a(colorStateList);
        e.invalidateSelf();
    }

    public final float b(dl dlVar) {
        return e(dlVar).b();
    }

    public final float c(dl dlVar) {
        return e(dlVar).b;
    }

    public final void d(dl dlVar) {
        Rect rect = new Rect();
        e(dlVar).getPadding(rect);
        dlVar.a((int) Math.ceil((double) e(dlVar).a()), (int) Math.ceil((double) e(dlVar).b()));
        dlVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
