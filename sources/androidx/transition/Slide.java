package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final TimeInterpolator m = new DecelerateInterpolator();
    private static final TimeInterpolator n = new AccelerateInterpolator();
    private static final a q = new b() {
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final a r = new b() {
        public final float a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ip.f(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() + ((float) viewGroup.getWidth()) : view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final a s = new c() {
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };
    private static final a t = new b() {
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final a u = new b() {
        public final float a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ip.f(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() - ((float) viewGroup.getWidth()) : view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final a v = new c() {
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };
    private a o = v;
    private int p = 80;

    interface a {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    static abstract class b implements a {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    static abstract class c implements a {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        c(80);
    }

    public Slide(int i) {
        c(48);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qu.f);
        int a2 = gc.a(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        c(a2);
    }

    private void c(int i) {
        if (i == 3) {
            this.o = q;
        } else if (i == 5) {
            this.o = t;
        } else if (i == 48) {
            this.o = s;
        } else if (i == 80) {
            this.o = v;
        } else if (i == 8388611) {
            this.o = r;
        } else if (i == 8388613) {
            this.o = u;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.p = i;
        qt qtVar = new qt();
        qtVar.a = i;
        a((qx) qtVar);
    }

    private static void d(qz qzVar) {
        int[] iArr = new int[2];
        qzVar.b.getLocationOnScreen(iArr);
        qzVar.a.put("android:slide:screenPosition", iArr);
    }

    public final Animator a(ViewGroup viewGroup, View view, qz qzVar) {
        if (qzVar == null) {
            return null;
        }
        int[] iArr = (int[]) qzVar.a.get("android:slide:screenPosition");
        return rb.a(view, qzVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.o.a(viewGroup, view), this.o.b(viewGroup, view), n);
    }

    public final Animator a(ViewGroup viewGroup, View view, qz qzVar, qz qzVar2) {
        if (qzVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) qzVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return rb.a(view, qzVar2, iArr[0], iArr[1], this.o.a(viewGroup, view), this.o.b(viewGroup, view), translationX, translationY, m);
    }

    public final void a(qz qzVar) {
        super.a(qzVar);
        d(qzVar);
    }

    public final void b(qz qzVar) {
        super.b(qzVar);
        d(qzVar);
    }
}
