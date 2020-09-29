package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.spotify.music.R;

/* renamed from: bk reason: default package */
public abstract class bk extends ViewGroup {
    protected final Context a;
    protected ActionMenuView b;
    protected bm c;
    protected int d;
    protected is e;
    private a f;
    private boolean g;
    private boolean h;

    /* renamed from: bk$a */
    public class a implements it {
        private boolean a = false;
        private int b;

        protected a() {
        }

        public final a a(is isVar, int i) {
            bk.this.e = isVar;
            this.b = i;
            return this;
        }

        public final void a(View view) {
            bk.super.setVisibility(0);
            this.a = false;
        }

        public final void b(View view) {
            if (!this.a) {
                bk bkVar = bk.this;
                bkVar.e = null;
                bk.super.setVisibility(this.b);
            }
        }

        public final void c(View view) {
            this.a = true;
        }
    }

    bk(Context context) {
        this(context, null);
    }

    bk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected bk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.a = context;
        } else {
            this.a = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected static int a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    protected static int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public is a(int i, long j) {
        is isVar = this.e;
        if (isVar != null) {
            isVar.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            is a2 = ip.n(this).a(1.0f);
            a2.a(j);
            a2.a((it) this.f.a(a2, i));
            return a2;
        }
        is a3 = ip.n(this).a(0.0f);
        a3.a(j);
        a3.a((it) this.f.a(a3, i));
        return a3;
    }

    public void a(int i) {
        this.d = i;
        requestLayout();
    }

    public boolean a() {
        bm bmVar = this.c;
        if (bmVar != null) {
            return bmVar.d();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, defpackage.o.a.a, R.attr.actionBarStyle, 0);
        a(obtainStyledAttributes.getLayoutDimension(defpackage.o.a.j, 0));
        obtainStyledAttributes.recycle();
        bm bmVar = this.c;
        if (bmVar != null) {
            bmVar.c();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            is isVar = this.e;
            if (isVar != null) {
                isVar.b();
            }
            super.setVisibility(i);
        }
    }
}
