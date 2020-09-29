package com.spotify.music.newplaying.scroll.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.spotify.music.R;
import io.reactivex.Flowable;
import java.util.LinkedHashSet;
import java.util.Set;

public class PeekScrollView extends ScrollView implements tdq {
    public final Set<a> a;
    public Flowable<tds> b;
    private int c;
    private int d;
    private ViewGroup e;
    private ViewGroup f;
    private TouchBlockingFrameLayout g;
    private tdr h;
    private Flowable<Boolean> i;

    public interface a {
        void onScrollChanged(int i, int i2);
    }

    public PeekScrollView(Context context) {
        this(context, null);
    }

    public PeekScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PeekScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new tdo();
        this.a = new LinkedHashSet();
        a(context, attributeSet);
        a(context);
        f();
    }

    public PeekScrollView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.h = new tdo();
        this.a = new LinkedHashSet();
        a(context, attributeSet);
        a(context);
        f();
    }

    private static void a(int i2) {
        fbp.a(i2 >= 0, (Object) "PeekHeight must be >=0");
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.peek_scroll_view, this);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.tcb.a.a);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.tcb.a.c, context.getResources().getDimensionPixelSize(R.dimen.tap_to_scroll_distance));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(defpackage.tcb.a.b, 0);
        obtainStyledAttributes.recycle();
        a(dimensionPixelSize);
        this.c = dimensionPixelSize;
    }

    private static void a(View view, int i2) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            int i3 = -i2;
            if (marginLayoutParams.topMargin != i3) {
                marginLayoutParams.topMargin = i3;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    private void a(View view, int i2, LayoutParams layoutParams) {
        if (view.getId() == R.id.root_container) {
            this.f = (ViewGroup) view;
            this.e = (ViewGroup) view.findViewById(R.id.fullscreen_container);
            this.g = (TouchBlockingFrameLayout) view.findViewById(R.id.touch_blocking_container);
            super.addView(view, i2, layoutParams);
        } else if (this.e.getChildCount() == 0) {
            this.e.addView(view, 0, layoutParams);
        } else if (this.g.getChildCount() == 0) {
            this.g.addView(view, 0, layoutParams);
            a((View) this.g, this.c);
        } else {
            this.f.addView(view, i2 - 1, layoutParams);
        }
    }

    private void f() {
        this.b = tdt.a(this).a(1).c();
        this.i = tdp.a(this).a(1).c();
    }

    public final Flowable<Object> a() {
        return this.g.a();
    }

    public void addView(View view) {
        a(view, -1, null);
    }

    public void addView(View view, int i2) {
        a(view, i2, null);
    }

    public void addView(View view, int i2, int i3) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        a(view, -1, generateDefaultLayoutParams);
    }

    public void addView(View view, int i2, LayoutParams layoutParams) {
        a(view, i2, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        a(view, -1, layoutParams);
    }

    public final void b() {
        this.h.a(this, Math.min(Math.min(this.g.getHeight() - this.c, getHeight() - this.c), this.d));
    }

    public final void c() {
        smoothScrollTo(0, 0);
    }

    public final Flowable<tds> d() {
        return this.b;
    }

    public final Flowable<Boolean> e() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.c == 0) {
            return super.fitSystemWindows(rect);
        }
        if (getFitsSystemWindows()) {
            boolean fitSystemWindows = super.fitSystemWindows(rect);
            if (!fitSystemWindows && rect.bottom > 0) {
                a((View) this.g, this.c + rect.bottom);
            }
            return fitSystemWindows;
        }
        if (rect.bottom > 0) {
            a((View) this.g, this.c + rect.bottom);
        }
        return super.fitSystemWindows(rect);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        for (a onScrollChanged : this.a) {
            onScrollChanged.onScrollChanged(i3, i5);
        }
    }
}
