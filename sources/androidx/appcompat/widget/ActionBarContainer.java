package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.spotify.music.R;

public class ActionBarContainer extends FrameLayout {
    View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ip.a((View) this, (Drawable) new bl(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        this.b = obtainStyledAttributes.getDrawable(a.b);
        this.c = obtainStyledAttributes.getDrawable(a.d);
        this.j = obtainStyledAttributes.getDimensionPixelSize(a.j, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(a.c);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.e ? this.b == null && this.c == null : this.d == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    private static boolean a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void a(cj cjVar) {
        View view = this.a;
        if (view != null) {
            removeView(view);
        }
        this.a = cjVar;
        if (cjVar != null) {
            addView(cjVar);
            ViewGroup.LayoutParams layoutParams = cjVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cjVar.b = false;
        }
    }

    public final void a(boolean z) {
        this.g = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c.setState(getDrawableState());
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null && drawable3.isStateful()) {
            this.d.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.action_bar);
        this.i = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.a;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i4, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.e) {
            Drawable drawable = this.d;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.b != null) {
                if (this.h.getVisibility() == 0) {
                    this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else {
                    View view2 = this.i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.b.setBounds(0, 0, 0, 0);
                    } else {
                        this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                    }
                }
                z3 = true;
            }
            this.f = z4;
            if (z4) {
                Drawable drawable2 = this.c;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.h == null && MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            int i4 = this.j;
            if (i4 >= 0) {
                i3 = MeasureSpec.makeMeasureSpec(Math.min(i4, MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i2, i3);
        if (this.h != null) {
            int mode = MeasureSpec.getMode(i3);
            View view = this.a;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i5 = !a(this.h) ? b(this.h) : !a(this.i) ? b(this.i) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i5 + b(this.a), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.b && !this.e) || (drawable == this.c && this.f) || ((drawable == this.d && this.e) || super.verifyDrawable(drawable));
    }
}
