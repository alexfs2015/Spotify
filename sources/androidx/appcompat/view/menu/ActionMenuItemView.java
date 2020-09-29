package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;

public class ActionMenuItemView extends AppCompatTextView implements OnClickListener, androidx.appcompat.widget.ActionMenuView.a, defpackage.be.a {
    az a;
    public defpackage.ax.b b;
    public b c;
    private CharSequence e;
    private Drawable f;
    private cd g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    class a extends cd {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final bg a() {
            if (ActionMenuItemView.this.c != null) {
                return ActionMenuItemView.this.c.a();
            }
            return null;
        }

        public final boolean b() {
            if (ActionMenuItemView.this.b != null && ActionMenuItemView.this.b.a(ActionMenuItemView.this.a)) {
                bg a = a();
                if (a != null && a.e()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static abstract class b {
        public abstract bg a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.h = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.o.a.v, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(defpackage.o.a.w, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.e);
        if (this.f != null && (!this.a.i() || !this.h)) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.e : null);
        CharSequence contentDescription = this.a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.a.getTitle();
            }
            cr.a(this, charSequence);
            return;
        }
        cr.a(this, tooltipText);
    }

    public final az a() {
        return this.a;
    }

    public final void a(az azVar, int i2) {
        this.a = azVar;
        Drawable icon = azVar.getIcon();
        this.f = icon;
        int i3 = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i4 = this.k;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i4) / ((float) intrinsicWidth)));
                intrinsicWidth = i4;
            }
            int i5 = this.k;
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i5) / ((float) intrinsicHeight)));
                intrinsicHeight = i5;
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        g();
        this.e = azVar.a((defpackage.be.a) this);
        g();
        setId(azVar.getItemId());
        if (!azVar.isVisible()) {
            i3 = 8;
        }
        setVisibility(i3);
        setEnabled(azVar.isEnabled());
        if (azVar.hasSubMenu() && this.g == null) {
            this.g = new a();
        }
    }

    public final boolean a_() {
        return true;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean c_() {
        return c() && this.a.getIcon() == null;
    }

    public final boolean e() {
        return c();
    }

    public void onClick(View view) {
        defpackage.ax.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = f();
        g();
    }

    public void onMeasure(int i2, int i3) {
        boolean c2 = c();
        if (c2) {
            int i4 = this.j;
            if (i4 >= 0) {
                super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i2, i3);
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!c2 && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.hasSubMenu()) {
            cd cdVar = this.g;
            if (cdVar != null && cdVar.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }
}
