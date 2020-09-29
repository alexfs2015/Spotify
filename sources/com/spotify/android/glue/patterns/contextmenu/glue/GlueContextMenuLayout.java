package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import java.util.Iterator;
import java.util.List;

public class GlueContextMenuLayout extends LinearLayout {
    public ProgressBar a;
    public fup b;
    public int c;
    public int d;
    private StretchingGradientDrawable e;
    private final List<View> f = Lists.a();
    private final int g = vfj.a(16.0f, getResources());

    static class a extends TouchDelegate {
        private static final Rect b = new Rect();
        final List<TouchDelegate> a = Lists.a();

        public a(View view) {
            super(b, view);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Iterator it = this.a.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    TouchDelegate touchDelegate = (TouchDelegate) it.next();
                    motionEvent.setLocation(x, y);
                    if (touchDelegate.onTouchEvent(motionEvent) || z) {
                        z = true;
                    }
                }
            }
        }
    }

    public GlueContextMenuLayout(Context context) {
        super(context);
        b();
    }

    public GlueContextMenuLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public GlueContextMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    private void b() {
        int c2 = fr.c(getContext(), R.color.black);
        this.e = new StretchingGradientDrawable(gd.c(c2, 0), c2);
        ip.a((View) this, (Drawable) this.e);
        setClipToPadding(false);
    }

    private boolean c() {
        return !this.f.isEmpty();
    }

    public final void a() {
        for (View removeView : this.f) {
            removeView(removeView);
        }
        this.f.clear();
    }

    public final void a(int i) {
        this.a.setVisibility(i);
    }

    public final void a(View view) {
        this.f.add(view);
        addView(view);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int visibility = this.a.getVisibility();
        this.a.setVisibility(8);
        super.onLayout(z, i, i2, i3, i4);
        this.a.setVisibility(visibility);
        if (this.a.getVisibility() != 8) {
            int measuredHeight = ((View) getParent()).getMeasuredHeight();
            ProgressBar progressBar = this.a;
            int i5 = measuredHeight / 2;
            progressBar.layout(0, i5, progressBar.getMeasuredWidth(), this.a.getMeasuredHeight() + i5);
        }
        if (c()) {
            this.e.setGradientHeight(this.b.b());
        } else {
            this.e.setGradientHeight(getMeasuredHeight() / 2);
        }
        a aVar = new a(this);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            aVar.a.add(new TouchDelegate(new Rect(0, childAt.getTop(), getWidth(), childAt.getBottom()), childAt));
        }
        setTouchDelegate(aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        int visibility = this.a.getVisibility();
        this.a.setVisibility(8);
        int i4 = this.g;
        int i5 = 0;
        setPadding(i4, 0, i4, i4);
        super.onMeasure(i, i2);
        if (c()) {
            int max = Math.max(MeasureSpec.getSize(i2), ((View) getParent()).getMeasuredHeight()) - this.c;
            int measuredHeight2 = getMeasuredHeight();
            int size = (this.b == null ? 0 : 1) + this.f.size();
            if (max <= measuredHeight2 || size > this.d) {
                int min = Math.min(size, this.d);
                int i6 = 0;
                while (true) {
                    if (i5 > min) {
                        break;
                    }
                    measuredHeight = getChildAt(i5).getMeasuredHeight();
                    int i7 = i6 + measuredHeight;
                    int i8 = i5 + 1;
                    int measuredHeight3 = i8 <= min ? (int) (((float) i7) + (((float) getChildAt(i8).getMeasuredHeight()) * 0.465f)) : i7;
                    if (i5 == min || measuredHeight3 > max) {
                        i6 = (int) (((float) i6) + (((float) measuredHeight) * 0.465f));
                    } else {
                        i6 = i7;
                        i5 = i8;
                    }
                }
                i6 = (int) (((float) i6) + (((float) measuredHeight) * 0.465f));
                i3 = Math.max((max + this.c) - i6, vfj.b(16.0f, getResources()));
            } else {
                i3 = max - measuredHeight2;
            }
            int i9 = this.g;
            setPadding(i9, i3, i9, i9);
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        }
        this.a.measure(i, i2);
        this.a.setVisibility(visibility);
    }
}
