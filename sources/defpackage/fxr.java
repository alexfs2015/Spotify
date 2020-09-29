package defpackage;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;

/* renamed from: fxr reason: default package */
public final class fxr extends fxq {
    public fxr(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i) {
        super(prettyHeaderView, imageView, view, i);
    }

    public final void a(int i) {
        if (this.c instanceof fyf) {
            ((fyf) this.c).c().setColorFilter(i);
        } else {
            super.a(i);
        }
    }

    public final void a(int i, float f) {
        int measuredHeight = this.a.getMeasuredHeight() - this.i;
        if (measuredHeight != 0) {
            this.p.a(0.0f);
            this.k = i;
            float f2 = (float) measuredHeight;
            float a = vge.a((float) this.h, f2, 0.0f, (float) (measuredHeight - this.h), (float) vge.a(this.h, measuredHeight, i));
            float f3 = ((float) this.h) / f2;
            ((fxo) this.c).a((int) a, vge.a(f3, 1.0f, 0.0f, 1.0f, vge.a(f3, 1.0f, f)));
        }
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        if (MeasureSpec.getMode(i) == 0) {
            i = MeasureSpec.makeMeasureSpec(200, 1073741824);
        }
        int size = MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.f != null) {
            this.f.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
            if (this.s && this.f.getMeasuredWidth() > size - (this.l * 2)) {
                int paddingLeft = this.f.getPaddingLeft() - ((this.f.getMeasuredWidth() - (size - (this.l * 2))) / 2);
                if (paddingLeft < 0) {
                    paddingLeft = 0;
                }
                this.f.setPadding(paddingLeft, 0, paddingLeft, 0);
                this.f.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
            }
            i3 = this.f.getMeasuredHeight();
            if (this.c instanceof fxo) {
                ((fxo) this.c).a(i3 / 2);
            }
        } else {
            i3 = 0;
        }
        if (this.g != null) {
            LayoutParams layoutParams = this.g.getLayoutParams();
            this.g.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), layoutParams == null ? MeasureSpec.makeMeasureSpec(0, 0) : MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
            i4 = this.g.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        if (this.d) {
            int mode = MeasureSpec.getMode(i2);
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                i2 = MeasureSpec.makeMeasureSpec((MeasureSpec.getSize(i2) - (i3 / 2)) - i4, 1073741824);
            }
            this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            if (this.f == null && this.c.getMeasuredHeight() < this.m) {
                this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec((this.m - (i3 / 2)) - i4, 1073741824));
            }
            i5 = this.c.getMeasuredHeight();
        }
        this.o = size;
        this.n = i5 + (i3 / 2) + i4;
    }

    public final void a(boolean z) {
        super.a(z);
        if (this.c instanceof fyf) {
            ((fyf) this.c).a(true);
        }
    }

    public final void b(int i) {
        ((fxo) this.c).b(i);
    }

    public final void b(int i, int i2) {
        int i3;
        int i4 = i2 - i;
        this.j = 0;
        if (this.d) {
            i3 = this.c.getMeasuredHeight() + 0;
            this.c.layout(0, 0, i4, i3);
        } else {
            i3 = 0;
        }
        if (this.f != null) {
            int measuredWidth = (i4 - this.f.getMeasuredWidth()) / 2;
            int measuredHeight = i3 - (this.f.getMeasuredHeight() / 2);
            this.f.layout(measuredWidth, measuredHeight, this.f.getMeasuredWidth() + measuredWidth, this.f.getMeasuredHeight() + measuredHeight);
        }
        if (this.g != null) {
            int g = g();
            this.g.layout(0, g, i4, this.g.getMeasuredHeight() + g);
        }
    }

    public final ImageView c() {
        return this.c instanceof fyf ? ((fyf) this.c).c() : super.c();
    }

    public final void c(int i) {
        this.h = i;
    }

    public final void d(int i) {
        this.i = i;
    }

    public final void e(int i) {
        super.e(i);
        ((fxn) this.c).c(i);
    }

    public final int g() {
        if (this.d) {
            return 0 + this.c.getMeasuredHeight();
        }
        return 0;
    }

    public final boolean h() {
        return false;
    }
}
