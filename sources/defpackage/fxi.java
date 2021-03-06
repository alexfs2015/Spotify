package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import defpackage.fxm;

/* renamed from: fxi reason: default package */
public abstract class fxi<T extends View & fxm> extends ViewGroup implements fxg {
    protected final T a;
    protected final PrettyHeaderView b;
    private final int c;
    /* access modifiers changed from: private */
    public int d;
    private View e;
    private View f;
    /* access modifiers changed from: private */
    public float g;
    /* access modifiers changed from: private */
    public boolean h;
    private final AnimatorListenerAdapter i = new AnimatorListenerAdapter() {
        public final void onAnimationCancel(Animator animator) {
            fxi.this.h = false;
        }

        public final void onAnimationEnd(Animator animator) {
            fxi.this.h = false;
        }
    };
    private final a j = new a() {
        public final void a(int i, float f) {
            fxi.this.d = i;
            fxi.this.b.a(i, f);
            if (!fxi.this.h) {
                fxi.this.h();
                fxi.this.i();
                fxi.this.j();
            }
        }
    };

    /* access modifiers changed from: protected */
    public abstract T a(Context context);

    public final View d() {
        return this;
    }

    static {
        new Property<fxi<?>, Float>(Float.class, "filterModeLevel") {
            public final /* synthetic */ Object get(Object obj) {
                return Float.valueOf(((fxi) obj).g);
            }

            public final /* synthetic */ void set(Object obj, Object obj2) {
                fxi.a((fxi) obj, ((Float) obj2).floatValue());
            }
        };
    }

    public fxi(Context context, View view, int i2) {
        super(context);
        this.c = i2;
        this.a = a(context);
        ((fxm) this.a).a(this.j);
        this.b = new PrettyHeaderView(context, view);
        this.b.b(this.c);
        ((fxm) this.a).a((View) this.b);
        ((fxm) this.a).b(this.c);
        addView(this.a);
        a(true);
    }

    public PrettyHeaderView b() {
        return this.b;
    }

    public final void a(fxn fxn) {
        this.b.a(fxn);
    }

    public final void a(String str) {
        this.b.a((CharSequence) str);
    }

    public final ImageView c() {
        return this.b.c();
    }

    public final void a(boolean z) {
        ((fxm) this.a).a(z);
    }

    public final void a(int i2) {
        ((fxm) this.a).a(i2);
    }

    public final void a(View view) {
        this.f = view;
        this.b.a(view);
        ((fxm) this.a).b(view);
        if (view != null) {
            j();
        }
    }

    public final void b(View view) {
        View view2 = this.e;
        if (view2 != null) {
            removeView(view2);
        }
        this.e = view;
        if (view != null) {
            addView(view);
            h();
            i();
        }
        requestLayout();
    }

    private int e() {
        float f2;
        View view = this.e;
        int i2 = 0;
        if (view == null) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        float f3 = ((float) this.d) / ((float) measuredHeight);
        if (f3 <= 1.0f) {
            f2 = uun.a(0.0f, 1.0f, 0.0f, (float) this.c, uun.a(0.0f, 1.0f, 1.0f, 0.4f, uun.a(0.0f, 1.0f, f3)));
        } else {
            View view2 = this.f;
            if (view2 != null) {
                i2 = view2.getMeasuredHeight();
            }
            f2 = (float) (((this.b.getMeasuredHeight() - (i2 / 2)) - this.d) - measuredHeight);
        }
        return (int) f2;
    }

    private float g() {
        if (this.e == null || !a()) {
            return 1.0f;
        }
        float a2 = uun.a(0.0f, 1.0f, uun.a(2.0f, 1.0f, 1.0f, 0.0f, ((float) Math.max(0, ((fxm) this.a).a() - this.d)) / ((float) this.e.getMeasuredHeight())));
        if (this.h) {
            a2 = Math.max(a2, 1.0f - this.g);
        }
        return a2;
    }

    /* access modifiers changed from: private */
    public void h() {
        View view = this.e;
        if (view != null) {
            view.offsetTopAndBottom(e() - this.e.getTop());
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        if (this.e != null) {
            float f2 = f();
            if (f2 < 0.01f) {
                this.e.setVisibility(4);
            } else {
                this.e.setVisibility(0);
            }
            this.e.setAlpha(f2);
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        View view = this.f;
        if (view != null) {
            view.setAlpha(g());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i2);
            View view = this.e;
            int i4 = 0;
            if (view != null) {
                view.measure(MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
                i4 = this.e.getMeasuredHeight();
            }
            this.b.b.c(i4);
            this.a.measure(MeasureSpec.makeMeasureSpec(size, 1073741824), i3);
            setMeasuredDimension(size, this.a.getMeasuredHeight());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(fxi.class.getSimpleName());
        sb.append(" doesn't support unspecified width.");
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        this.a.layout(0, 0, i6, i5 - i3);
        if (this.e != null) {
            int e2 = e();
            View view = this.e;
            view.layout(0, e2, i6, view.getMeasuredHeight() + e2);
        }
    }

    private boolean a() {
        return this.h;
    }

    private float f() {
        float f2;
        View view = this.e;
        float f3 = 0.0f;
        if (view == null) {
            f2 = 0.0f;
        } else {
            f2 = uun.a(0.0f, 1.0f, uun.a(0.75f, 0.1f, 0.0f, 1.0f, ((float) this.d) / ((float) view.getMeasuredHeight())));
        }
        if (this.e != null && a()) {
            f3 = this.g * uun.a(0.0f, 1.0f, uun.a(1.5f, 0.5f, 0.0f, 1.0f, ((float) Math.max(0, ((fxm) this.a).a() - this.d)) / ((float) this.e.getMeasuredHeight())));
        }
        return Math.max(f2, f3);
    }

    static /* synthetic */ void a(fxi fxi, float f2) {
        fxi.g = f2;
        fxi.h();
        fxi.i();
        fxi.j();
    }
}
