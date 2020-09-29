package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastSeekBar extends View {
    public b a;
    /* access modifiers changed from: private */
    public boolean b;
    private Integer c;
    private List<a> d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final Paint j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private Runnable o;

    public static class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return Integer.valueOf(0).hashCode();
        }
    }

    public static class b {
        public int a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a == ((b) obj).a;
        }

        public final int hashCode() {
            Integer valueOf = Integer.valueOf(0);
            return Arrays.hashCode(new Object[]{valueOf, Integer.valueOf(this.a), valueOf, valueOf, valueOf, Boolean.FALSE});
        }
    }

    class c extends AccessibilityDelegate {
        private c() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.a.a);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.a());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            if (bzo.b() && view.isEnabled()) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (bzo.b() && (i == 4096 || i == 8192)) {
                CastSeekBar.this.b = true;
                int i2 = CastSeekBar.this.a.a / 20;
                if (i == 8192) {
                    i2 = -i2;
                }
                CastSeekBar castSeekBar = CastSeekBar.this;
                CastSeekBar.a(castSeekBar, castSeekBar.a() + i2);
                CastSeekBar.this.b = false;
            }
            return false;
        }

        /* synthetic */ c(CastSeekBar castSeekBar, byte b) {
            this();
        }
    }

    public CastSeekBar(Context context) {
        this(context, null);
    }

    static /* synthetic */ void a(CastSeekBar castSeekBar, int i2) {
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = new ArrayList();
        setAccessibilityDelegate(new c(this, 0));
        this.j = new Paint(1);
        this.j.setStyle(Style.FILL);
        this.e = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.g = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        this.h = context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size) / 2.0f;
        this.i = context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_radius);
        this.a = new b();
        this.a.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, defpackage.boc.a.a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(defpackage.boc.a.c, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(defpackage.boc.a.d, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(defpackage.boc.a.e, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(defpackage.boc.a.b, 0);
        this.k = context.getResources().getColor(resourceId);
        this.l = context.getResources().getColor(resourceId2);
        this.m = context.getResources().getColor(resourceId3);
        this.n = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(resolveSizeAndState((int) (this.e + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i2, 0), resolveSizeAndState((int) (this.f + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i3, 0));
    }

    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int a2 = a();
        int save2 = canvas.save();
        canvas.translate(0.0f, (float) (measuredHeight / 2));
        int max = Math.max(0, 0);
        if (max > 0) {
            a(canvas, 0, max, measuredWidth, this.m);
        }
        if (a2 > max) {
            a(canvas, max, a2, measuredWidth, this.k);
        }
        if (this.a.a > a2) {
            a(canvas, a2, this.a.a, measuredWidth, this.m);
        }
        canvas.restoreToCount(save2);
        List<a> list = this.d;
        if (list != null && !list.isEmpty()) {
            this.j.setColor(this.n);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            for (a aVar : this.d) {
                if (aVar != null) {
                    canvas.drawCircle((((float) Math.min(0, this.a.a)) * ((float) measuredWidth2)) / ((float) this.a.a), (float) (measuredHeight2 / 2), this.i, this.j);
                }
            }
        }
        isEnabled();
        canvas.restoreToCount(save);
    }

    private final void a(Canvas canvas, int i2, int i3, int i4, int i5) {
        this.j.setColor(i5);
        float f2 = (float) i4;
        float f3 = ((((float) i2) * 1.0f) / ((float) this.a.a)) * f2;
        float f4 = ((((float) i3) * 1.0f) / ((float) this.a.a)) * f2;
        float f5 = this.g;
        canvas.drawRect(f3, -f5, f4, f5, this.j);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        isEnabled();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Runnable runnable = this.o;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }
}
