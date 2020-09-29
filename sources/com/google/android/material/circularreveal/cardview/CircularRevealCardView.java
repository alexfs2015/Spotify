package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;

public class CircularRevealCardView extends CardView implements ezr {
    private final ezq i = new ezq(this);

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.i.a();
    }

    public final void a(Canvas canvas) {
        super.draw(canvas);
    }

    public final void a(Drawable drawable) {
        this.i.a(drawable);
    }

    public final void a(d dVar) {
        this.i.a(dVar);
    }

    public final void b() {
        this.i.b();
    }

    public final d c() {
        return this.i.c();
    }

    public final void c_(int i2) {
        this.i.a(i2);
    }

    public final int d() {
        return this.i.b.getColor();
    }

    public void draw(Canvas canvas) {
        this.i.a(canvas);
    }

    public final boolean e() {
        return super.isOpaque();
    }

    public boolean isOpaque() {
        return this.i.d();
    }
}
