package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

/* renamed from: qj reason: default package */
public final class qj extends View implements ql {
    final View a;
    ViewGroup b;
    View c;
    Matrix d;
    private int e;
    private int f;
    private int g;
    private final Matrix h = new Matrix();
    private final OnPreDrawListener i = new OnPreDrawListener() {
        public final boolean onPreDraw() {
            qj qjVar = qj.this;
            qjVar.d = qjVar.a.getMatrix();
            ip.d(qj.this);
            if (!(qj.this.b == null || qj.this.c == null)) {
                qj.this.b.endViewTransition(qj.this.c);
                ip.d(qj.this.b);
                qj qjVar2 = qj.this;
                qjVar2.b = null;
                qjVar2.c = null;
            }
            return true;
        }
    };

    private qj(View view) {
        super(view.getContext());
        this.a = view;
        setLayerType(2, null);
    }

    public static ql a(View view, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        qj b2 = b(view);
        if (b2 == null) {
            while (true) {
                if (viewGroup instanceof FrameLayout) {
                    frameLayout = (FrameLayout) viewGroup;
                    break;
                }
                ViewParent parent = viewGroup.getParent();
                if (!(parent instanceof ViewGroup)) {
                    frameLayout = null;
                    break;
                }
                viewGroup = (ViewGroup) parent;
            }
            if (frameLayout == null) {
                return null;
            }
            b2 = new qj(view);
            frameLayout.addView(b2);
        }
        b2.e++;
        return b2;
    }

    public static void a(View view) {
        qj b2 = b(view);
        if (b2 != null) {
            b2.e--;
            if (b2.e <= 0) {
                ViewParent parent = b2.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.endViewTransition(b2);
                    viewGroup.removeView(b2);
                }
            }
        }
    }

    private static qj b(View view) {
        return (qj) view.getTag(R.id.ghost_view);
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.setTag(R.id.ghost_view, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.a.getTranslationY());
        this.f = iArr2[0] - iArr[0];
        this.g = iArr2[1] - iArr[1];
        this.a.getViewTreeObserver().addOnPreDrawListener(this.i);
        this.a.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.i);
        this.a.setVisibility(0);
        this.a.setTag(R.id.ghost_view, null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        this.h.set(this.d);
        this.h.postTranslate((float) this.f, (float) this.g);
        canvas.setMatrix(this.h);
        this.a.draw(canvas);
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        this.a.setVisibility(i2 == 0 ? 4 : 0);
    }
}
