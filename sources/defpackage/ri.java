package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: ri reason: default package */
public class ri {
    protected a a;

    /* renamed from: ri$a */
    static class a extends ViewGroup {
        ArrayList<Drawable> a = null;
        ri b;
        private ViewGroup c;
        private View d;

        static {
            try {
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, ri riVar) {
            super(context);
            this.c = viewGroup;
            this.d = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.b = riVar;
        }

        public final void a(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.c || viewGroup.getParent() == null || !ip.E(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.c.getLocationOnScreen(iArr2);
                    ip.h(view, iArr[0] - iArr2[0]);
                    ip.g(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(android.view.View r1) {
            /*
                r0 = this;
                super.removeView(r1)
                int r1 = r0.getChildCount()
                if (r1 != 0) goto L_0x0015
                java.util.ArrayList<android.graphics.drawable.Drawable> r1 = r0.a
                if (r1 == 0) goto L_0x0013
                int r1 = r1.size()
                if (r1 != 0) goto L_0x0015
            L_0x0013:
                r1 = 1
                goto L_0x0016
            L_0x0015:
                r1 = 0
            L_0x0016:
                if (r1 == 0) goto L_0x001d
                android.view.ViewGroup r1 = r0.c
                r1.removeView(r0)
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ri.a.b(android.view.View):void");
        }

        /* access modifiers changed from: protected */
        public final void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.c.getLocationOnScreen(iArr);
            this.d.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.d.getWidth(), this.d.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.a;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.a.get(i)).draw(canvas);
            }
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.c != null) {
                rect.offset(iArr[0], iArr[1]);
                ViewGroup viewGroup = this.c;
                if (viewGroup instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    this.d.getLocationOnScreen(iArr3);
                    int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                    rect.offset(iArr4[0], iArr4[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public final void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public final boolean verifyDrawable(Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.a;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }
    }

    ri(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    private static ViewGroup a(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public static ri c(View view) {
        ViewGroup a2 = a(view);
        if (a2 == null) {
            return null;
        }
        int childCount = a2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a2.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).b;
            }
        }
        return new rc(a2.getContext(), a2, view);
    }
}
