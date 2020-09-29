package com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder.ShelfView.a;

public class PageIndicator extends View implements a, b {
    public ShelfGridRecyclerView a;
    public qky b;
    private int c;
    private int d;
    private Paint e;
    private Paint f;
    private int g;

    public PageIndicator(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.a);
            this.c = obtainStyledAttributes.getDimensionPixelSize(a.d, getContext().getResources().getDimensionPixelSize(R.dimen.page_indicator_size));
            this.d = obtainStyledAttributes.getDimensionPixelSize(a.e, getContext().getResources().getDimensionPixelSize(R.dimen.page_indicator_space));
            int color = obtainStyledAttributes.getColor(a.b, getContext().getResources().getColor(R.color.white));
            int color2 = obtainStyledAttributes.getColor(a.c, getContext().getResources().getColor(R.color.gray_background_30));
            obtainStyledAttributes.recycle();
            this.e = new Paint();
            a(color2, this.e);
            this.f = new Paint();
            a(color, this.f);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (a(this.a)) {
            d();
            return;
        }
        int b2 = b();
        if (b2 < 2) {
            d();
            return;
        }
        int i3 = (this.c * b2) + ((b2 > 6 ? 5 : b2 - 1) * this.d) + ip.i(this) + ip.j(this);
        int paddingTop = this.c + getPaddingTop() + getPaddingBottom();
        setVisibility(0);
        setMeasuredDimension(i3, paddingTop);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!a(this.a)) {
            int b2 = b();
            if (b2 >= 2) {
                int save = canvas.save();
                canvas.translate((float) ip.i(this), (float) getPaddingTop());
                float f2 = ((float) this.c) / 2.0f;
                int i = this.g;
                if (i >= 6) {
                    i = 5;
                }
                int i2 = 0;
                while (i2 < b2 && i2 < 6) {
                    if (i != i2) {
                        canvas.drawCircle(((float) ((this.c + this.d) * i2)) + f2, f2, f2, this.e);
                    }
                    i2++;
                }
                canvas.drawCircle(((float) (i * (this.c + this.d))) + f2, f2, f2, this.f);
                canvas.restoreToCount(save);
            }
        }
    }

    public final void a(int i) {
        if (this.b != null) {
            this.g = i / ShelfGridRecyclerView.p();
            postInvalidate();
        }
    }

    public final void a() {
        this.g = ((GridLayoutManager) fay.a((GridLayoutManager) this.a.d())).k() / ShelfGridRecyclerView.p();
        postInvalidate();
    }

    private static void a(int i, Paint paint) {
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        paint.setColor(i);
    }

    private static boolean a(ShelfGridRecyclerView shelfGridRecyclerView) {
        return shelfGridRecyclerView != null && ShelfGridRecyclerView.p() == 0;
    }

    private int b() {
        if (c() > 6) {
            return 6;
        }
        return c();
    }

    private int c() {
        ShelfGridRecyclerView shelfGridRecyclerView = this.a;
        if (shelfGridRecyclerView == null || shelfGridRecyclerView.c() == null) {
            return 0;
        }
        return (int) Math.ceil((double) (((float) ((RecyclerView.a) fay.a(this.a.c())).b()) / ((float) ShelfGridRecyclerView.p())));
    }

    private void d() {
        setVisibility(8);
        setMeasuredDimension(0, 0);
    }
}
