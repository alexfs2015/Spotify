package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;

public class ActionBarContextView extends bk {
    public CharSequence f;
    public CharSequence g;
    public boolean h;
    private View i;
    private View j;
    private LinearLayout k;
    private TextView l;
    private TextView m;
    private int n;
    private int o;
    private int p;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        cp a = cp.a(context, attributeSet, a.x, i2, 0);
        ip.a((View) this, a.a(a.y));
        this.n = a.g(a.C, 0);
        this.o = a.g(a.B, 0);
        this.d = a.f(a.A, 0);
        this.p = a.g(a.z, R.layout.abc_action_mode_close_item_material);
        a.a.recycle();
    }

    private void d() {
        if (this.k == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.l = (TextView) this.k.findViewById(R.id.action_bar_title);
            this.m = (TextView) this.k.findViewById(R.id.action_bar_subtitle);
            if (this.n != 0) {
                this.l.setTextAppearance(getContext(), this.n);
            }
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
        }
        this.l.setText(this.f);
        this.m.setText(this.g);
        boolean z = !TextUtils.isEmpty(this.f);
        boolean z2 = !TextUtils.isEmpty(this.g);
        int i2 = 0;
        this.m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.k;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        if (this.k.getParent() == null) {
            addView(this.k);
        }
    }

    public final /* bridge */ /* synthetic */ is a(int i2, long j2) {
        return super.a(i2, j2);
    }

    public final void a(int i2) {
        this.d = i2;
    }

    public final void a(final aj ajVar) {
        View view = this.i;
        if (view == null) {
            this.i = LayoutInflater.from(getContext()).inflate(this.p, this, false);
            addView(this.i);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        this.i.findViewById(R.id.action_mode_close_button).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ajVar.c();
            }
        });
        ax axVar = (ax) ajVar.b();
        if (this.c != null) {
            this.c.g();
        }
        this.c = new bm(getContext());
        this.c.b(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        axVar.a((bd) this.c, this.a);
        this.b = (ActionMenuView) this.c.a((ViewGroup) this);
        ip.a((View) this.b, (Drawable) null);
        addView(this.b, layoutParams);
    }

    public final void a(View view) {
        View view2 = this.j;
        if (view2 != null) {
            removeView(view2);
        }
        this.j = view;
        if (view != null) {
            LinearLayout linearLayout = this.k;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.k = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void a(CharSequence charSequence) {
        this.f = charSequence;
        d();
    }

    public final void a(boolean z) {
        if (z != this.h) {
            requestLayout();
        }
        this.h = z;
    }

    public final boolean a() {
        if (this.c != null) {
            return this.c.d();
        }
        return false;
    }

    public final void b() {
        if (this.i == null) {
            c();
        }
    }

    public final void b(CharSequence charSequence) {
        this.g = charSequence;
        d();
    }

    public final void c() {
        removeAllViews();
        this.j = null;
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.e();
            this.c.h();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean a = cv.a(this);
        int paddingRight = a ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.i;
        if (!(view == null || view.getVisibility() == 8)) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = a(paddingRight, i6, a);
            paddingRight = a(a2 + a(this.i, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.k;
        if (!(linearLayout == null || this.j != null || linearLayout.getVisibility() == 8)) {
            paddingRight += a(this.k, paddingRight, paddingTop, paddingTop2, a);
        }
        View view2 = this.j;
        if (view2 != null) {
            a(view2, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        if (this.b != null) {
            a(this.b, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (MeasureSpec.getMode(i2) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i3) != 0) {
            int size = MeasureSpec.getSize(i2);
            int size2 = this.d > 0 ? this.d : MeasureSpec.getSize(i3);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = size2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.i;
            if (view != null) {
                int a = a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.b != null && this.b.getParent() == this) {
                paddingLeft = a(this.b, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.k;
            if (linearLayout != null && this.j == null) {
                if (this.h) {
                    this.k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.j;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i5 = Math.min(layoutParams.height, i5);
                }
                this.j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i4));
            }
            if (this.d <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                for (int i8 = 0; i8 < childCount; i8++) {
                    int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i7) {
                        i7 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
