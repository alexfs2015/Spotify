package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatPopupWindow extends PopupWindow {
    private static final boolean a = (VERSION.SDK_INT < 21);
    private boolean b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        cp a2 = cp.a(context, attributeSet, a.bT, i, i2);
        if (a2.f(a.bV)) {
            a(a2.a(a.bV, false));
        }
        setBackgroundDrawable(a2.a(a.bU));
        a2.a.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (a && this.b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void a(boolean z) {
        if (a) {
            this.b = z;
        } else {
            jl.a((PopupWindow) this, z);
        }
    }
}
