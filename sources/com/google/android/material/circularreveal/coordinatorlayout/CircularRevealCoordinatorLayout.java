package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements ezr {
    private final ezq d = new ezq(this);

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.d.a();
    }

    public final void a(Canvas canvas) {
        super.draw(canvas);
    }

    public final void a(Drawable drawable) {
        this.d.a(drawable);
    }

    public final void a(d dVar) {
        this.d.a(dVar);
    }

    public final void b() {
        this.d.b();
    }

    public final d c() {
        return this.d.c();
    }

    public final void c_(int i) {
        this.d.a(i);
    }

    public final int d() {
        return this.d.b.getColor();
    }

    public void draw(Canvas canvas) {
        this.d.a(canvas);
    }

    public final boolean e() {
        return super.isOpaque();
    }

    public boolean isOpaque() {
        return this.d.d();
    }
}
