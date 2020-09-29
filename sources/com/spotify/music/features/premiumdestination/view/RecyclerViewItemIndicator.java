package com.spotify.music.features.premiumdestination.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.music.R;

public class RecyclerViewItemIndicator extends View {
    public RecyclerView a;
    public final m b;
    public om c;
    private final int d;
    private final int e;
    /* access modifiers changed from: private */
    public float f;
    private final Paint g;
    private final Paint h;

    class a extends m {
        private a() {
        }

        /* synthetic */ a(RecyclerViewItemIndicator recyclerViewItemIndicator, byte b) {
            this();
        }

        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && RecyclerViewItemIndicator.this.c != null) {
                RecyclerViewItemIndicator recyclerViewItemIndicator = RecyclerViewItemIndicator.this;
                recyclerViewItemIndicator.f = (float) RecyclerView.f((View) fay.a(recyclerViewItemIndicator.c.a(recyclerView.d())));
                RecyclerViewItemIndicator.this.postInvalidate();
            }
        }
    }

    public RecyclerViewItemIndicator(Context context) {
        this(context, null);
    }

    public RecyclerViewItemIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.pasteDefaultsViewPagerIndicatorStyle);
    }

    public RecyclerViewItemIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new a(this, 0);
        uut.a(RecyclerViewItemIndicator.class, this);
        int b2 = uts.b(10.0f, context.getResources());
        int a2 = uts.a(6.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.pft.a.a, i, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(defpackage.pft.a.d, b2);
        this.e = obtainStyledAttributes.getDimensionPixelOffset(defpackage.pft.a.e, a2);
        int color = obtainStyledAttributes.getColor(defpackage.pft.a.c, -7829368);
        int color2 = obtainStyledAttributes.getColor(defpackage.pft.a.b, -1);
        obtainStyledAttributes.recycle();
        this.g = new Paint();
        this.g.setAntiAlias(true);
        this.g.setStyle(Style.FILL);
        this.g.setColor(color);
        this.h = new Paint();
        this.h.setAntiAlias(true);
        this.h.setStyle(Style.FILL);
        this.h.setColor(color2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        androidx.recyclerview.widget.RecyclerView.a aVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            aVar = null;
        } else {
            aVar = recyclerView.c();
        }
        int b2 = aVar != null ? aVar.b() : 0;
        if (b2 <= 1) {
            setVisibility(8);
            setMeasuredDimension(0, 0);
            return;
        }
        int i3 = this.d;
        int paddingLeft = (b2 * i3) + ((b2 - 1) * this.e) + getPaddingLeft() + getPaddingRight();
        int paddingTop = i3 + getPaddingTop() + getPaddingBottom();
        setVisibility(0);
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        androidx.recyclerview.widget.RecyclerView.a aVar;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null) {
            aVar = null;
        } else {
            aVar = recyclerView.c();
        }
        int b2 = aVar != null ? aVar.b() : 0;
        if (b2 > 1) {
            int save = canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            float f2 = ((float) this.d) / 2.0f;
            for (int i = 0; i < b2; i++) {
                canvas.drawCircle(((float) ((this.d + this.e) * i)) + f2, f2, f2, this.g);
            }
            boolean a2 = uur.a((View) this);
            float f3 = this.f;
            if (a2) {
                f3 = ((float) (b2 - 1)) - f3;
            }
            canvas.drawCircle((f3 * ((float) (this.d + this.e))) + f2, f2, f2, this.h);
            canvas.restoreToCount(save);
        }
    }
}
