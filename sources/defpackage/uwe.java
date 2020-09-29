package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: uwe reason: default package */
public final class uwe {
    final ViewGroup a;
    public View b;
    private boolean c;

    public uwe(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(View view) {
        View view2 = this.b;
        if (view2 != view) {
            if (view2 != null) {
                this.a.removeView(view2);
            }
            this.b = view;
            if (view == null) {
                this.a.setVisibility(8);
                return;
            }
            this.b.setDuplicateParentStateEnabled(this.c);
            this.a.addView(view);
            this.a.setVisibility(0);
            final View view3 = (View) this.a.getParent();
            view3.post(new Runnable() {
                public final void run() {
                    if (uwe.this.b != null) {
                        Rect rect = new Rect();
                        uwe.this.a.getHitRect(rect);
                        int b2 = uts.b(24.0f, uwe.this.b.getResources());
                        rect.top = 0;
                        rect.left -= b2;
                        rect.bottom += b2;
                        rect.right += b2;
                        view3.setTouchDelegate(new TouchDelegate(rect, uwe.this.b));
                    }
                }
            });
        }
    }

    public final void a(boolean z) {
        this.c = z;
        this.a.setDuplicateParentStateEnabled(z);
        View view = this.b;
        if (view != null) {
            view.setDuplicateParentStateEnabled(z);
        }
    }

    public final void a() {
        View view = this.b;
        this.a.setVisibility(view != null ? view.getVisibility() : 8);
    }
}
