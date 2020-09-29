package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@androidx.viewpager.widget.ViewPager.a
public class TabLayout extends HorizontalScrollView {
    private static final defpackage.hq.a<e> w = new defpackage.hq.c(16);
    private final int A;
    private final int B;
    private final int C;
    private int D;
    private int E;
    private final ArrayList<b> F;
    private b G;
    private ValueAnimator H;
    private sa I;
    private DataSetObserver J;
    private f K;
    private a L;
    private boolean M;
    private final defpackage.hq.a<g> N;
    final ArrayList<e> a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ColorStateList g;
    ColorStateList h;
    ColorStateList i;
    Drawable j;
    Mode k;
    float l;
    float m;
    final int n;
    int o;
    int p;
    int q;
    int r;
    boolean s;
    boolean t;
    boolean u;
    ViewPager v;
    private e x;
    /* access modifiers changed from: private */
    public final RectF y;
    private final d z;

    class a implements androidx.viewpager.widget.ViewPager.d {
        boolean a;

        a() {
        }

        public final void a(ViewPager viewPager, sa saVar, sa saVar2) {
            if (TabLayout.this.v == viewPager) {
                TabLayout.this.a(saVar2, this.a);
            }
        }
    }

    public interface b<T extends e> {
        void a(T t);
    }

    class c extends DataSetObserver {
        c() {
        }

        public final void onChanged() {
            TabLayout.this.d();
        }

        public final void onInvalidated() {
            TabLayout.this.d();
        }
    }

    class d extends LinearLayout {
        int a;
        final Paint b;
        int c = -1;
        float d;
        private final GradientDrawable e;
        private int f = -1;
        private int g = -1;
        private int h = -1;
        private ValueAnimator i;

        d(Context context) {
            super(context);
            setWillNotDraw(false);
            this.b = new Paint();
            this.e = new GradientDrawable();
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, float f2) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            this.c = i2;
            this.d = f2;
            a();
        }

        public final void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (VERSION.SDK_INT < 23 && this.f != i2) {
                requestLayout();
                this.f = i2;
            }
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (MeasureSpec.getMode(i2) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.r == 1 && TabLayout.this.p == 1) {
                    int childCount = getChildCount();
                    int i4 = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            i4 = Math.max(i4, childAt.getMeasuredWidth());
                        }
                    }
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.b(16) << 1)) {
                            boolean z2 = false;
                            for (int i6 = 0; i6 < childCount; i6++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i6).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout = TabLayout.this;
                            tabLayout.p = 0;
                            tabLayout.a(false);
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
                return;
            }
            this.i.cancel();
            b(this.c, Math.round((1.0f - this.i.getAnimatedFraction()) * ((float) this.i.getDuration())));
        }

        private void a() {
            int i2;
            int i3;
            View childAt = getChildAt(this.c);
            if (childAt == null || childAt.getWidth() <= 0) {
                i3 = -1;
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (!TabLayout.this.t && (childAt instanceof g)) {
                    a((g) childAt, TabLayout.this.y);
                    i3 = (int) TabLayout.this.y.left;
                    i2 = (int) TabLayout.this.y.right;
                }
                if (this.d > 0.0f && this.c < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.c + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.t && (childAt2 instanceof g)) {
                        a((g) childAt2, TabLayout.this.y);
                        left = (int) TabLayout.this.y.left;
                        right = (int) TabLayout.this.y.right;
                    }
                    float f2 = this.d;
                    i3 = (int) ((((float) left) * f2) + ((1.0f - f2) * ((float) i3)));
                    i2 = (int) ((((float) right) * f2) + ((1.0f - f2) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, int i3) {
            if (i2 != this.g || i3 != this.h) {
                this.g = i2;
                this.h = i3;
                ip.d(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(final int i2, int i3) {
            ValueAnimator valueAnimator = this.i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.i.cancel();
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                a();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!TabLayout.this.t && (childAt instanceof g)) {
                a((g) childAt, TabLayout.this.y);
                left = (int) TabLayout.this.y.left;
                right = (int) TabLayout.this.y.right;
            }
            final int i4 = left;
            final int i5 = right;
            final int i6 = this.g;
            final int i7 = this.h;
            if (!(i6 == i4 && i7 == i5)) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.i = valueAnimator2;
                valueAnimator2.setInterpolator(eyd.b);
                valueAnimator2.setDuration((long) i3);
                valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
                AnonymousClass1 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        d.this.a(eyd.a(i6, i4, animatedFraction), eyd.a(i7, i5, animatedFraction));
                    }
                };
                valueAnimator2.addUpdateListener(r3);
                valueAnimator2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        d dVar = d.this;
                        dVar.c = i2;
                        dVar.d = 0.0f;
                    }
                });
                valueAnimator2.start();
            }
        }

        public final void draw(Canvas canvas) {
            int i2 = 0;
            int intrinsicHeight = TabLayout.this.j != null ? TabLayout.this.j.getIntrinsicHeight() : 0;
            int i3 = this.a;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.q;
            if (i4 == 0) {
                i2 = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i4 == 1) {
                i2 = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i4 != 2) {
                intrinsicHeight = i4 != 3 ? 0 : getHeight();
            }
            int i5 = this.g;
            if (i5 >= 0 && this.h > i5) {
                Drawable f2 = gm.f(TabLayout.this.j != null ? TabLayout.this.j : this.e);
                f2.setBounds(this.g, i2, this.h, intrinsicHeight);
                if (VERSION.SDK_INT == 21) {
                    f2.setColorFilter(this.b.getColor(), Mode.SRC_IN);
                } else {
                    gm.a(f2, this.b.getColor());
                }
                f2.draw(canvas);
            }
            super.draw(canvas);
        }

        private void a(g gVar, RectF rectF) {
            int b2 = gVar.b();
            if (b2 < TabLayout.this.b(24)) {
                b2 = TabLayout.this.b(24);
            }
            int left = (gVar.getLeft() + gVar.getRight()) / 2;
            int i2 = b2 / 2;
            rectF.set((float) (left - i2), 0.0f, (float) (left + i2), 0.0f);
        }
    }

    public static class e {
        public Object a;
        Drawable b;
        CharSequence c;
        CharSequence d;
        int e = -1;
        View f;
        public TabLayout g;
        public g h;

        public final e a(View view) {
            this.f = view;
            c();
            return this;
        }

        public final e a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.h.setContentDescription(charSequence);
            }
            this.c = charSequence;
            c();
            return this;
        }

        public final void a() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                tabLayout.b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public final boolean b() {
            TabLayout tabLayout = this.g;
            if (tabLayout != null) {
                return tabLayout.b() == this.e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            g gVar = this.h;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public static class f implements androidx.viewpager.widget.ViewPager.e {
        private final WeakReference<TabLayout> a;
        private int b;
        private int c;

        public f(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        public final void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        public final void a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.c != 2 || this.b == 1;
                if (!(this.c == 2 && this.b == 0)) {
                    z = true;
                }
                tabLayout.a(i, f, z2, z);
            }
        }

        public final void b(int i) {
            TabLayout tabLayout = (TabLayout) this.a.get();
            if (tabLayout != null && tabLayout.b() != i && i < tabLayout.a.size()) {
                int i2 = this.c;
                tabLayout.a(tabLayout.a(i), i2 == 0 || (i2 == 2 && this.b == 0));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.c = 0;
            this.b = 0;
        }
    }

    class g extends LinearLayout {
        private e a;
        private TextView b;
        private ImageView c;
        private View d;
        private TextView e;
        private ImageView f;
        private Drawable g;
        private int h = 2;

        /* JADX WARNING: type inference failed for: r10v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r10v7 */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r10v9 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(android.content.Context r10) {
            /*
                r8 = this;
                com.google.android.material.tabs.TabLayout.this = r9
                r8.<init>(r10)
                r0 = 2
                r8.h = r0
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.n
                r2 = 0
                if (r1 == 0) goto L_0x002d
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.n
                android.graphics.drawable.Drawable r10 = defpackage.ab.b(r10, r1)
                r8.g = r10
                android.graphics.drawable.Drawable r10 = r8.g
                if (r10 == 0) goto L_0x002f
                boolean r10 = r10.isStateful()
                if (r10 == 0) goto L_0x002f
                android.graphics.drawable.Drawable r10 = r8.g
                int[] r1 = r8.getDrawableState()
                r10.setState(r1)
                goto L_0x002f
            L_0x002d:
                r8.g = r2
            L_0x002f:
                android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
                r10.<init>()
                r1 = r10
                android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
                r3 = 0
                r1.setColor(r3)
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r1 = r1.i
                r4 = 1
                if (r1 == 0) goto L_0x0087
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r5 = 925353388(0x3727c5ac, float:1.0E-5)
                r1.setCornerRadius(r5)
                r5 = -1
                r1.setColor(r5)
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r5 = r5.i
                android.content.res.ColorStateList r5 = defpackage.ezx.a(r5)
                int r6 = android.os.Build.VERSION.SDK_INT
                r7 = 21
                if (r6 < r7) goto L_0x0074
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.u
                if (r3 == 0) goto L_0x0068
                r10 = r2
            L_0x0068:
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                boolean r3 = r3.u
                if (r3 == 0) goto L_0x006f
                r1 = r2
            L_0x006f:
                r0.<init>(r5, r10, r1)
                r10 = r0
                goto L_0x0087
            L_0x0074:
                android.graphics.drawable.Drawable r1 = defpackage.gm.f(r1)
                defpackage.gm.a(r1, r5)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
                r0[r3] = r10
                r0[r4] = r1
                r2.<init>(r0)
                r10 = r2
            L_0x0087:
                defpackage.ip.a(r8, r10)
                com.google.android.material.tabs.TabLayout r10 = com.google.android.material.tabs.TabLayout.this
                r10.invalidate()
                int r10 = r9.b
                int r0 = r9.c
                int r1 = r9.d
                int r2 = r9.e
                defpackage.ip.b(r8, r10, r0, r1, r2)
                r10 = 17
                r8.setGravity(r10)
                boolean r9 = r9.s
                r9 = r9 ^ r4
                r8.setOrientation(r9)
                r8.setClickable(r4)
                android.content.Context r9 = r8.getContext()
                r10 = 1002(0x3ea, float:1.404E-42)
                in r9 = defpackage.in.a(r9, r10)
                defpackage.ip.a(r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.g.<init>(com.google.android.material.tabs.TabLayout, android.content.Context):void");
        }

        /* access modifiers changed from: protected */
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.g;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.g.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.a.a();
            return true;
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.d;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(androidx.appcompat.app.ActionBar.a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(androidx.appcompat.app.ActionBar.a.class.getName());
        }

        public final void onMeasure(int i2, int i3) {
            int size = MeasureSpec.getSize(i2);
            int mode = MeasureSpec.getMode(i2);
            int i4 = TabLayout.this.o;
            if (i4 > 0 && (mode == 0 || size > i4)) {
                i2 = MeasureSpec.makeMeasureSpec(TabLayout.this.o, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.b != null) {
                float f2 = TabLayout.this.l;
                int i5 = this.h;
                ImageView imageView = this.c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.m;
                    }
                } else {
                    i5 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int a2 = jm.a(this.b);
                if (f2 != textSize || (a2 >= 0 && i5 != a2)) {
                    if (TabLayout.this.r == 1 && f2 > textSize && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.b.setTextSize(0, f2);
                        this.b.setMaxLines(i5);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(e eVar) {
            if (eVar != this.a) {
                this.a = eVar;
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            View view;
            e eVar = this.a;
            Drawable drawable = null;
            if (eVar != null) {
                view = eVar.f;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.d = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                this.e = (TextView) view.findViewById(16908308);
                TextView textView2 = this.e;
                if (textView2 != null) {
                    this.h = jm.a(textView2);
                }
                this.f = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.d;
                if (view2 != null) {
                    removeView(view2);
                    this.d = null;
                }
                this.e = null;
                this.f = null;
            }
            boolean z = false;
            if (this.d == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    addView(imageView2, 0);
                    this.c = imageView2;
                }
                if (!(eVar == null || eVar.b == null)) {
                    drawable = gm.f(eVar.b).mutate();
                }
                if (drawable != null) {
                    gm.a(drawable, TabLayout.this.h);
                    if (TabLayout.this.k != null) {
                        gm.a(drawable, TabLayout.this.k);
                    }
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    addView(textView3);
                    this.b = textView3;
                    this.h = jm.a(this.b);
                }
                jm.a(this.b, TabLayout.this.f);
                if (TabLayout.this.g != null) {
                    this.b.setTextColor(TabLayout.this.g);
                }
                a(this.b, this.c);
            } else if (!(this.e == null && this.f == null)) {
                a(this.e, this.f);
            }
            if (eVar != null && !TextUtils.isEmpty(eVar.d)) {
                setContentDescription(eVar.d);
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }

        private void a(TextView textView, ImageView imageView) {
            CharSequence charSequence;
            CharSequence charSequence2;
            e eVar = this.a;
            Drawable mutate = (eVar == null || eVar.b == null) ? null : gm.f(this.a.b).mutate();
            e eVar2 = this.a;
            if (eVar2 != null) {
                charSequence = eVar2.c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int b2 = (!z || imageView.getVisibility() != 0) ? 0 : TabLayout.this.b(8);
                if (TabLayout.this.s) {
                    if (b2 != ia.b(marginLayoutParams)) {
                        ia.b(marginLayoutParams, b2);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (b2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = b2;
                    ia.b(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            e eVar3 = this.a;
            if (eVar3 != null) {
                charSequence2 = eVar3.d;
            } else {
                charSequence2 = null;
            }
            if (z) {
                charSequence2 = null;
            }
            cr.a(this, charSequence2);
        }

        /* access modifiers changed from: 0000 */
        public int b() {
            View[] viewArr = {this.b, this.c, this.d};
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            for (int i4 = 0; i4 < 3; i4++) {
                View view = viewArr[i4];
                if (view != null && view.getVisibility() == 0) {
                    i3 = z ? Math.min(i3, view.getLeft()) : view.getLeft();
                    i2 = z ? Math.max(i2, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i2 - i3;
        }

        static /* synthetic */ void a(g gVar, Canvas canvas) {
            Drawable drawable = gVar.g;
            if (drawable != null) {
                drawable.setBounds(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
                gVar.g.draw(canvas);
            }
        }
    }

    public static class h implements fai {
        private final ViewPager a;

        public h(ViewPager viewPager) {
            this.a = viewPager;
        }

        public final void a(e eVar) {
            this.a.b(eVar.e);
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new ArrayList<>();
        this.y = new RectF();
        this.o = Integer.MAX_VALUE;
        this.F = new ArrayList<>();
        this.N = new defpackage.hq.b(12);
        setHorizontalScrollBarEnabled(false);
        this.z = new d(context);
        super.addView(this.z, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a2 = ezs.a(context, attributeSet, defpackage.eyc.a.ch, i2, 2132017907, defpackage.eyc.a.cE);
        d dVar = this.z;
        int dimensionPixelSize = a2.getDimensionPixelSize(defpackage.eyc.a.cs, -1);
        if (dVar.a != dimensionPixelSize) {
            dVar.a = dimensionPixelSize;
            ip.d(dVar);
        }
        d dVar2 = this.z;
        int color = a2.getColor(defpackage.eyc.a.cp, 0);
        if (dVar2.b.getColor() != color) {
            dVar2.b.setColor(color);
            ip.d(dVar2);
        }
        Drawable b2 = ezv.b(context, a2, defpackage.eyc.a.cn);
        if (this.j != b2) {
            this.j = b2;
            ip.d(this.z);
        }
        int i3 = a2.getInt(defpackage.eyc.a.cr, 0);
        if (this.q != i3) {
            this.q = i3;
            ip.d(this.z);
        }
        this.t = a2.getBoolean(defpackage.eyc.a.cq, true);
        ip.d(this.z);
        int dimensionPixelSize2 = a2.getDimensionPixelSize(defpackage.eyc.a.cx, 0);
        this.e = dimensionPixelSize2;
        this.d = dimensionPixelSize2;
        this.c = dimensionPixelSize2;
        this.b = dimensionPixelSize2;
        this.b = a2.getDimensionPixelSize(defpackage.eyc.a.cA, this.b);
        this.c = a2.getDimensionPixelSize(defpackage.eyc.a.cB, this.c);
        this.d = a2.getDimensionPixelSize(defpackage.eyc.a.cz, this.d);
        this.e = a2.getDimensionPixelSize(defpackage.eyc.a.cy, this.e);
        this.f = a2.getResourceId(defpackage.eyc.a.cE, 2132017602);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f, defpackage.o.a.cM);
        try {
            this.l = (float) obtainStyledAttributes.getDimensionPixelSize(defpackage.o.a.cN, 0);
            this.g = ezv.a(context, obtainStyledAttributes, defpackage.o.a.cQ);
            obtainStyledAttributes.recycle();
            if (a2.hasValue(defpackage.eyc.a.cF)) {
                this.g = ezv.a(context, a2, defpackage.eyc.a.cF);
            }
            if (a2.hasValue(defpackage.eyc.a.cD)) {
                this.g = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{a2.getColor(defpackage.eyc.a.cD, 0), this.g.getDefaultColor()});
            }
            this.h = ezv.a(context, a2, defpackage.eyc.a.cl);
            this.k = ezt.a(a2.getInt(defpackage.eyc.a.cm, -1), null);
            this.i = ezv.a(context, a2, defpackage.eyc.a.cC);
            this.E = a2.getInt(defpackage.eyc.a.co, 300);
            this.A = a2.getDimensionPixelSize(defpackage.eyc.a.cv, -1);
            this.B = a2.getDimensionPixelSize(defpackage.eyc.a.cu, -1);
            this.n = a2.getResourceId(defpackage.eyc.a.ci, 0);
            this.D = a2.getDimensionPixelSize(defpackage.eyc.a.cj, 0);
            this.r = a2.getInt(defpackage.eyc.a.cw, 1);
            this.p = a2.getInt(defpackage.eyc.a.ck, 0);
            this.s = a2.getBoolean(defpackage.eyc.a.ct, false);
            this.u = a2.getBoolean(defpackage.eyc.a.cG, false);
            a2.recycle();
            Resources resources = getResources();
            this.m = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.C = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            ip.b(this.z, this.r == 0 ? Math.max(0, this.D - this.b) : 0, 0, 0, 0);
            int i4 = this.r;
            if (i4 == 0) {
                this.z.setGravity(8388611);
            } else if (i4 == 1) {
                this.z.setGravity(1);
            }
            a(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void a(int i2, float f2, boolean z2) {
        a(i2, 0.0f, true, true);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.z.getChildCount()) {
            if (z3) {
                this.z.a(i2, f2);
            }
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.H.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                d(round);
            }
        }
    }

    public final void a(e eVar) {
        b(eVar, this.a.isEmpty());
    }

    private void b(e eVar, boolean z2) {
        a(eVar, this.a.size(), z2);
    }

    private void a(e eVar, int i2, boolean z2) {
        if (eVar.g == this) {
            a(eVar, i2);
            d(eVar);
            if (z2) {
                eVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void a(TabItem tabItem) {
        e a2 = a();
        if (tabItem.a != null) {
            a2.a(tabItem.a);
        }
        if (tabItem.b != null) {
            a2.b = tabItem.b;
            a2.c();
        }
        if (tabItem.c != 0) {
            a2.a(LayoutInflater.from(a2.h.getContext()).inflate(tabItem.c, a2.h, false));
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            a2.d = tabItem.getContentDescription();
            a2.c();
        }
        a(a2);
    }

    public final void a(b bVar) {
        if (!this.F.contains(bVar)) {
            this.F.add(bVar);
        }
    }

    private void b(b bVar) {
        this.F.remove(bVar);
    }

    public final e a() {
        e e2 = e();
        e2.g = this;
        e2.h = c(e2);
        return e2;
    }

    private static e e() {
        e eVar = (e) w.a();
        return eVar == null ? new e() : eVar;
    }

    public final int b() {
        e eVar = this.x;
        if (eVar != null) {
            return eVar.e;
        }
        return -1;
    }

    public final void c() {
        int childCount = this.z.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            g gVar = (g) this.z.getChildAt(childCount);
            this.z.removeViewAt(childCount);
            if (gVar != null) {
                gVar.a(null);
                gVar.setSelected(false);
                this.N.a(gVar);
            }
            requestLayout();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            it.remove();
            eVar.g = null;
            eVar.h = null;
            eVar.a = null;
            eVar.b = null;
            eVar.c = null;
            eVar.d = null;
            eVar.e = -1;
            eVar.f = null;
            w.a(eVar);
        }
        this.x = null;
    }

    private void a(ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.v;
        if (viewPager2 != null) {
            f fVar = this.K;
            if (fVar != null) {
                viewPager2.b((androidx.viewpager.widget.ViewPager.e) fVar);
            }
            a aVar = this.L;
            if (aVar != null) {
                this.v.b((androidx.viewpager.widget.ViewPager.d) aVar);
            }
        }
        b bVar = this.G;
        if (bVar != null) {
            b(bVar);
            this.G = null;
        }
        if (viewPager != null) {
            this.v = viewPager;
            if (this.K == null) {
                this.K = new f(this);
            }
            this.K.a();
            viewPager.a((androidx.viewpager.widget.ViewPager.e) this.K);
            this.G = new h(viewPager);
            a(this.G);
            sa saVar = viewPager.b;
            if (saVar != null) {
                a(saVar, z2);
            }
            if (this.L == null) {
                this.L = new a();
            }
            a aVar2 = this.L;
            aVar2.a = z2;
            viewPager.a((androidx.viewpager.widget.ViewPager.d) aVar2);
            a(viewPager.c, 0.0f, true);
        } else {
            this.v = null;
            a((sa) null, false);
        }
        this.M = z3;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.M) {
            a((ViewPager) null, true, false);
            this.M = false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(sa saVar, boolean z2) {
        sa saVar2 = this.I;
        if (saVar2 != null) {
            DataSetObserver dataSetObserver = this.J;
            if (dataSetObserver != null) {
                saVar2.b(dataSetObserver);
            }
        }
        this.I = saVar;
        if (z2 && saVar != null) {
            if (this.J == null) {
                this.J = new c();
            }
            saVar.a(this.J);
        }
        d();
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        c();
        sa saVar = this.I;
        if (saVar != null) {
            int b2 = saVar.b();
            for (int i2 = 0; i2 < b2; i2++) {
                b(a().a(this.I.b(i2)), false);
            }
            ViewPager viewPager = this.v;
            if (viewPager != null && b2 > 0) {
                int i3 = viewPager.c;
                if (i3 != b() && i3 < this.a.size()) {
                    a(a(i3), true);
                }
            }
        }
    }

    private g c(e eVar) {
        g gVar = (g) this.N.a();
        if (gVar == null) {
            gVar = new g(getContext());
        }
        gVar.a(eVar);
        gVar.setFocusable(true);
        gVar.setMinimumWidth(g());
        if (TextUtils.isEmpty(eVar.d)) {
            gVar.setContentDescription(eVar.c);
        } else {
            gVar.setContentDescription(eVar.d);
        }
        return gVar;
    }

    private void d(e eVar) {
        this.z.addView(eVar.h, eVar.e, f());
    }

    public void addView(View view) {
        a(view);
    }

    public void addView(View view, int i2) {
        a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private void a(View view) {
        if (view instanceof TabItem) {
            a((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private LayoutParams f() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private void a(LayoutParams layoutParams) {
        if (this.r == 1 && this.p == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int b(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i2 = 0; i2 < this.z.getChildCount(); i2++) {
            View childAt = this.z.getChildAt(i2);
            if (childAt instanceof g) {
                g.a((g) childAt, canvas);
            }
        }
        super.onDraw(canvas);
    }

    private void c(int i2) {
        boolean z2;
        if (i2 != -1) {
            if (getWindowToken() != null && ip.B(this)) {
                d dVar = this.z;
                int childCount = dVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        z2 = false;
                        break;
                    } else if (dVar.getChildAt(i3).getWidth() <= 0) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    int scrollX = getScrollX();
                    int a2 = a(i2, 0.0f);
                    if (scrollX != a2) {
                        if (this.H == null) {
                            this.H = new ValueAnimator();
                            this.H.setInterpolator(eyd.b);
                            this.H.setDuration((long) this.E);
                            this.H.addUpdateListener(new AnimatorUpdateListener() {
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                                }
                            });
                        }
                        this.H.setIntValues(new int[]{scrollX, a2});
                        this.H.start();
                    }
                    this.z.b(i2, this.E);
                    return;
                }
            }
            a(i2, 0.0f, true);
        }
    }

    private void d(int i2) {
        int childCount = this.z.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.z.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(e eVar) {
        a(eVar, true);
    }

    /* access modifiers changed from: 0000 */
    public final void a(e eVar, boolean z2) {
        int i2;
        e eVar2 = this.x;
        if (eVar2 != eVar) {
            if (eVar != null) {
                i2 = eVar.e;
            } else {
                i2 = -1;
            }
            if (z2) {
                if ((eVar2 == null || eVar2.e == -1) && i2 != -1) {
                    a(i2, 0.0f, true);
                } else {
                    c(i2);
                }
                if (i2 != -1) {
                    d(i2);
                }
            }
            this.x = eVar;
            if (eVar2 != null) {
                f(eVar2);
            }
            if (eVar != null) {
                e(eVar);
            }
        } else if (eVar2 != null) {
            g(eVar);
            c(eVar.e);
        }
    }

    private void e(e eVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            ((b) this.F.get(size)).a(eVar);
        }
    }

    private void f(e eVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size);
        }
    }

    private void g(e eVar) {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size);
        }
    }

    private int a(int i2, float f2) {
        int i3 = 0;
        if (this.r != 0) {
            return 0;
        }
        View childAt = this.z.getChildAt(i2);
        int i4 = i2 + 1;
        View childAt2 = i4 < this.z.getChildCount() ? this.z.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f2);
        return ip.f(this) == 0 ? left + i5 : left - i5;
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.z.getChildCount(); i2++) {
            View childAt = this.z.getChildAt(i2);
            childAt.setMinimumWidth(g());
            a((LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    private int g() {
        int i2 = this.A;
        if (i2 != -1) {
            return i2;
        }
        if (this.r == 0) {
            return this.C;
        }
        return 0;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final e a(int i2) {
        if (i2 < 0 || i2 >= this.a.size()) {
            return null;
        }
        return (e) this.a.get(i2);
    }

    public boolean shouldDelayChildPressedState() {
        if (Math.max(0, ((this.z.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0) {
            return true;
        }
        return false;
    }

    private void a(e eVar, int i2) {
        eVar.e = i2;
        this.a.add(i2, eVar);
        int size = this.a.size();
        while (true) {
            i2++;
            if (i2 < size) {
                ((e) this.a.get(i2)).e = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z2;
        int size = this.a.size();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z2 = false;
                break;
            }
            e eVar = (e) this.a.get(i4);
            if (eVar != null && eVar.b != null && !TextUtils.isEmpty(eVar.c)) {
                z2 = true;
                break;
            }
            i4++;
        }
        int b2 = b((!z2 || this.s) ? 48 : 72) + getPaddingTop() + getPaddingBottom();
        int mode = MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            i3 = MeasureSpec.makeMeasureSpec(Math.min(b2, MeasureSpec.getSize(i3)), 1073741824);
        } else if (mode == 0) {
            i3 = MeasureSpec.makeMeasureSpec(b2, 1073741824);
        }
        int size2 = MeasureSpec.getSize(i2);
        if (MeasureSpec.getMode(i2) != 0) {
            int i5 = this.B;
            if (i5 <= 0) {
                i5 = size2 - b(56);
            }
            this.o = i5;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.r;
            if (i6 == 0 ? childAt.getMeasuredWidth() < getMeasuredWidth() : !(i6 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth())) {
                z3 = true;
            }
            if (z3) {
                childAt.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }
}
