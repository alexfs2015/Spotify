package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager.d;
import androidx.viewpager.widget.ViewPager.e;
import com.comscore.streaming.ContentType;
import java.lang.ref.WeakReference;
import java.util.Locale;

@androidx.viewpager.widget.ViewPager.a
public class PagerTitleStrip extends ViewGroup {
    private static final int[] n = {16842804, 16842901, 16842904, 16842927};
    private static final int[] o = {16843660};
    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    float e = -1.0f;
    int f;
    int g;
    private int h = -1;
    private int i;
    private boolean j;
    private boolean k;
    private final a l = new a();
    private WeakReference<sf> m;
    private int p;

    class a extends DataSetObserver implements d, e {
        private int a;

        a() {
        }

        public final void a(int i) {
            this.a = i;
        }

        public final void a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.a(i, f, false);
        }

        public final void a(ViewPager viewPager, sf sfVar, sf sfVar2) {
            PagerTitleStrip.this.a(sfVar, sfVar2);
        }

        public final void b(int i) {
            if (this.a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.a(pagerTitleStrip.a.c, PagerTitleStrip.this.a.b);
                float f = 0.0f;
                if (PagerTitleStrip.this.e >= 0.0f) {
                    f = PagerTitleStrip.this.e;
                }
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                pagerTitleStrip2.a(pagerTitleStrip2.a.c, f, true);
            }
        }

        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.a(pagerTitleStrip.a.c, PagerTitleStrip.this.a.b);
            float f = 0.0f;
            if (PagerTitleStrip.this.e >= 0.0f) {
                f = PagerTitleStrip.this.e;
            }
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            pagerTitleStrip2.a(pagerTitleStrip2.a.c, f, true);
        }
    }

    static class b extends SingleLineTransformationMethod {
        private Locale a;

        b(Context context) {
            this.a = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            jm.a(this.b, resourceId);
            jm.a(this.c, resourceId);
            jm.a(this.d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f2 = (float) dimensionPixelSize;
            this.b.setTextSize(0, f2);
            this.c.setTextSize(0, f2);
            this.d.setTextSize(0, f2);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.b.setTextColor(color);
            this.c.setTextColor(color);
            this.d.setTextColor(color);
        }
        this.i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.g = this.c.getTextColors().getDefaultColor();
        this.p = 153;
        int i2 = (this.p << 24) | (this.g & 16777215);
        this.b.setTextColor(i2);
        this.d.setTextColor(i2);
        this.b.setEllipsize(TruncateAt.END);
        this.c.setEllipsize(TruncateAt.END);
        this.d.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, o);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            a(this.b);
            a(this.c);
            a(this.d);
        } else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.f = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void a(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    /* access modifiers changed from: 0000 */
    public int a() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public void a(int i2) {
        this.f = i2;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, float f2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        float f3 = f2;
        if (i7 != this.h) {
            a(i7, this.a.b);
        } else if (!z && f3 == this.e) {
            return;
        }
        this.k = true;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredWidth3 = this.d.getMeasuredWidth();
        int i8 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i9 = paddingRight + i8;
        int i10 = (width - (paddingLeft + i8)) - i9;
        float f4 = 0.5f + f3;
        if (f4 > 1.0f) {
            f4 -= 1.0f;
        }
        int i11 = ((width - i9) - ((int) (((float) i10) * f4))) - i8;
        int i12 = measuredWidth2 + i11;
        int baseline = this.b.getBaseline();
        int baseline2 = this.c.getBaseline();
        int baseline3 = this.d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i13 = max - baseline;
        int i14 = max - baseline2;
        int i15 = max - baseline3;
        int i16 = measuredWidth3;
        int measuredHeight = this.d.getMeasuredHeight() + i15;
        int max2 = Math.max(Math.max(this.b.getMeasuredHeight() + i13, this.c.getMeasuredHeight() + i14), measuredHeight);
        int i17 = this.i & ContentType.LONG_FORM_ON_DEMAND;
        if (i17 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i17 != 80) {
            i5 = i13 + paddingTop;
            i3 = i14 + paddingTop;
            i4 = paddingTop + i15;
            TextView textView = this.c;
            textView.layout(i11, i3, i12, textView.getMeasuredHeight() + i3);
            int min = Math.min(paddingLeft, (i11 - this.f) - measuredWidth);
            TextView textView2 = this.b;
            textView2.layout(min, i5, measuredWidth + min, textView2.getMeasuredHeight() + i5);
            int max3 = Math.max((width - paddingRight) - i16, i12 + this.f);
            TextView textView3 = this.d;
            textView3.layout(max3, i4, max3 + i16, textView3.getMeasuredHeight() + i4);
            this.e = f2;
            this.k = false;
        } else {
            i6 = (height - paddingBottom) - max2;
        }
        i5 = i13 + i6;
        i3 = i14 + i6;
        i4 = i6 + i15;
        TextView textView4 = this.c;
        textView4.layout(i11, i3, i12, textView4.getMeasuredHeight() + i3);
        int min2 = Math.min(paddingLeft, (i11 - this.f) - measuredWidth);
        TextView textView22 = this.b;
        textView22.layout(min2, i5, measuredWidth + min2, textView22.getMeasuredHeight() + i5);
        int max32 = Math.max((width - paddingRight) - i16, i12 + this.f);
        TextView textView32 = this.d;
        textView32.layout(max32, i4, max32 + i16, textView32.getMeasuredHeight() + i4);
        this.e = f2;
        this.k = false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i2, sf sfVar) {
        int b2 = sfVar != null ? sfVar.b() : 0;
        this.j = true;
        CharSequence charSequence = null;
        this.b.setText((i2 <= 0 || sfVar == null) ? null : sfVar.b(i2 - 1));
        this.c.setText((sfVar == null || i2 >= b2) ? null : sfVar.b(i2));
        int i3 = i2 + 1;
        if (i3 < b2 && sfVar != null) {
            charSequence = sfVar.b(i3);
        }
        this.d.setText(charSequence);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.h = i2;
        if (!this.k) {
            a(i2, this.e, false);
        }
        this.j = false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(sf sfVar, sf sfVar2) {
        if (sfVar != null) {
            sfVar.b((DataSetObserver) this.l);
            this.m = null;
        }
        if (sfVar2 != null) {
            sfVar2.a((DataSetObserver) this.l);
            this.m = new WeakReference<>(sfVar2);
        }
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            this.h = -1;
            this.e = -1.0f;
            a(viewPager.c, sfVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            sf sfVar = viewPager.b;
            viewPager.c((e) this.l);
            viewPager.a((d) this.l);
            this.a = viewPager;
            WeakReference<sf> weakReference = this.m;
            a(weakReference != null ? (sf) weakReference.get() : null, sfVar);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            a(viewPager.b, (sf) null);
            this.a.c((e) null);
            this.a.b((d) this.l);
            this.a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.a != null) {
            float f2 = this.e;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            a(this.h, f2, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int i4;
        if (MeasureSpec.getMode(i2) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = getChildMeasureSpec(i3, paddingTop, -2);
            int size = MeasureSpec.getSize(i2);
            int childMeasureSpec2 = getChildMeasureSpec(i2, (int) (((float) size) * 0.2f), -2);
            this.b.measure(childMeasureSpec2, childMeasureSpec);
            this.c.measure(childMeasureSpec2, childMeasureSpec);
            this.d.measure(childMeasureSpec2, childMeasureSpec);
            if (MeasureSpec.getMode(i3) == 1073741824) {
                i4 = MeasureSpec.getSize(i3);
            } else {
                i4 = Math.max(a(), this.c.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i4, i3, this.c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }
}
