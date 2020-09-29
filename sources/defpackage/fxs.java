package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView.HeaderInternalImageView;

/* renamed from: fxs reason: default package */
public final class fxs extends fxq {
    private final fxp t;
    private float u = -1.0f;
    private final int v;
    private int w;

    public fxs(PrettyHeaderView prettyHeaderView, ImageView imageView, View view, int i, fyh fyh) {
        super(prettyHeaderView, imageView, view, i);
        this.p = fyh;
        this.t = new fxp(this.b);
        this.v = vgl.b(imageView.getContext(), 16842836);
    }

    private InsetDrawable g(int i) {
        boolean z = this.f instanceof Button;
        int measuredHeight = this.f != null ? this.f.getMeasuredHeight() : 0;
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{this.v, i});
        if (z) {
            measuredHeight = this.l;
        }
        InsetDrawable insetDrawable = new InsetDrawable(gradientDrawable, 0, 0, 0, measuredHeight);
        return insetDrawable;
    }

    public final void a(int i, float f) {
        this.k = i;
        if (this.d) {
            int max = Math.max(i - this.h, 0);
            if (this.e) {
                this.c.offsetTopAndBottom((this.j + max) - this.c.getTop());
            }
        }
        if (this.d) {
            this.c.setAlpha(this.e ? Math.max(0.0f, Math.min(9.5f - (10.0f * f), 1.0f)) : Math.max(0.0f, Math.min(1.0f - (2.0f * f), 1.0f)));
        }
        this.t.a(i);
        if (this.p != null && !TextUtils.isEmpty(this.q)) {
            float max2 = e() ? Math.max(0.0f, (f * 4.0f) - 1.0f) / 3.0f : 1.0f;
            if (Math.abs(this.u - max2) >= 0.01f) {
                this.u = max2;
                if (jvi.b(this.b.getContext())) {
                    this.p.a(1.0f);
                    return;
                }
                this.p.a(max2);
            }
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
            this.g.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            i4 = this.g.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        if (this.d) {
            int mode = MeasureSpec.getMode(i2);
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                i2 = MeasureSpec.makeMeasureSpec(((((MeasureSpec.getSize(i2) - i3) - i4) - this.i) - this.h) - this.r, 1073741824);
            }
            this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
            if (this.f == null && this.c.getMeasuredHeight() < this.m) {
                this.c.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(((((this.m - i3) - i4) - this.i) - this.h) - this.r, 1073741824));
            }
            i5 = this.c.getMeasuredHeight();
        }
        int i6 = this.h + i5 + this.i + i3 + i4 + this.r;
        this.t.a(size, i6, g());
        this.o = size;
        this.n = i6;
    }

    public final void a(boolean z) {
        super.a(z);
        this.t.a = true;
    }

    public final void b(int i) {
        HeaderInternalImageView headerInternalImageView = (HeaderInternalImageView) this.b;
        if (headerInternalImageView.a && this.w != i) {
            this.w = i;
            int a = vgp.a(i, 0.4f);
            if (!ip.B(this.a) || VERSION.SDK_INT < 19) {
                headerInternalImageView.a(g(a));
                return;
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(this.v), g(a)});
            headerInternalImageView.a(transitionDrawable);
            transitionDrawable.startTransition(200);
        }
    }

    public final void b(int i, int i2) {
        int i3 = i2 - i;
        this.t.a();
        int i4 = this.i + this.h;
        this.j = i4;
        if (this.d) {
            int max = this.e ? Math.max(this.k - this.h, 0) + i4 : i4;
            int measuredHeight = this.c.getMeasuredHeight();
            this.c.layout(0, max, i3, max + measuredHeight);
            i4 += measuredHeight;
        }
        if (this.f != null) {
            int measuredWidth = (i3 - this.f.getMeasuredWidth()) / 2;
            this.f.layout(measuredWidth, i4, this.f.getMeasuredWidth() + measuredWidth, this.f.getMeasuredHeight() + i4);
        }
        if (this.g != null) {
            int g = g();
            this.g.layout(0, g, i3, this.g.getMeasuredHeight() + g);
        }
    }

    public final int g() {
        int i = this.h + this.i;
        if (this.d) {
            i += this.c.getMeasuredHeight();
        }
        int i2 = 0;
        if (this.f != null) {
            i2 = this.f.getMeasuredHeight();
        }
        return i + (i2 / 2) + this.r;
    }

    public final boolean h() {
        return true;
    }
}
