package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class CircularRevealFrameLayout extends FrameLayout implements eza {
    private final eyz a = new eyz(this);

    public CircularRevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    public final d c() {
        return this.a.c();
    }

    public final void a(d dVar) {
        this.a.a(dVar);
    }

    public final int d() {
        return this.a.b.getColor();
    }

    public final void c_(int i) {
        this.a.a(i);
    }

    public final void a(Drawable drawable) {
        this.a.a(drawable);
    }

    public void draw(Canvas canvas) {
        this.a.a(canvas);
    }

    public final void a(Canvas canvas) {
        super.draw(canvas);
    }

    public boolean isOpaque() {
        return this.a.d();
    }

    public final boolean e() {
        return super.isOpaque();
    }
}
