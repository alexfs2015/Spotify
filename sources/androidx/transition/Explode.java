package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.spotify.music.R;

public class Explode extends Visibility {
    private static final TimeInterpolator m = new DecelerateInterpolator();
    private static final TimeInterpolator n = new AccelerateInterpolator();
    private int[] o = new int[2];

    public Explode() {
        a((qs) new qb());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a((qs) new qb());
    }

    private void d(qu quVar) {
        View view = quVar.b;
        view.getLocationOnScreen(this.o);
        int[] iArr = this.o;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth() + i;
        int height = view.getHeight() + i2;
        quVar.a.put("android:explode:screenBounds", new Rect(i, i2, width, height));
    }

    public final void a(qu quVar) {
        super.a(quVar);
        d(quVar);
    }

    public final void b(qu quVar) {
        super.b(quVar);
        d(quVar);
    }

    public final Animator a(ViewGroup viewGroup, View view, qu quVar, qu quVar2) {
        if (quVar2 == null) {
            return null;
        }
        Rect rect = (Rect) quVar2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        a((View) viewGroup, rect, this.o);
        int[] iArr = this.o;
        return qw.a(view, quVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, m);
    }

    public final Animator a(ViewGroup viewGroup, View view, qu quVar) {
        float f;
        float f2;
        if (quVar == null) {
            return null;
        }
        Rect rect = (Rect) quVar.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) quVar.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        a((View) viewGroup, rect, this.o);
        int[] iArr2 = this.o;
        return qw.a(view, quVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), n);
    }

    private void a(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.o);
        int[] iArr2 = this.o;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect e = e();
        if (e == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = e.centerX();
            i = e.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a = a(centerX2, centerY);
        float f = centerX2 / a;
        float f2 = centerY / a;
        float a2 = a(view2, i2 - i3, i - i4);
        iArr[0] = Math.round(f * a2);
        iArr[1] = Math.round(a2 * f2);
    }

    private static float a(View view, int i, int i2) {
        return a((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    private static float a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
