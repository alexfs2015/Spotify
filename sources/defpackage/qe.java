package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

/* renamed from: qe reason: default package */
public final class qe extends View implements qg {
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
            qe qeVar = qe.this;
            qeVar.d = qeVar.a.getMatrix();
            ip.d(qe.this);
            if (!(qe.this.b == null || qe.this.c == null)) {
                qe.this.b.endViewTransition(qe.this.c);
                ip.d(qe.this.b);
                qe qeVar2 = qe.this;
                qeVar2.b = null;
                qeVar2.c = null;
            }
            return true;
        }
    };

    public static qg a(View view, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        qe b2 = b(view);
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
            b2 = new qe(view);
            frameLayout.addView(b2);
        }
        b2.e++;
        return b2;
    }

    public static void a(View view) {
        qe b2 = b(view);
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

    private qe(View view) {
        super(view.getContext());
        this.a = view;
        setLayerType(2, null);
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

    public final void a(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    private static qe b(View view) {
        return (qe) view.getTag(R.id.ghost_view);
    }
}
