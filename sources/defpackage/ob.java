package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: ob reason: default package */
public final class ob extends h {
    private static final int[] a = {16843284};
    private Drawable b;
    private int c;
    private final Rect d = new Rect();

    public ob(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.c = 1;
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!(recyclerView.d() == null || this.b == null)) {
            int i5 = 0;
            if (this.c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i4 = recyclerView.getPaddingLeft();
                    i3 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i4, recyclerView.getPaddingTop(), i3, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i3 = recyclerView.getWidth();
                    i4 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.a(childAt, this.d);
                    int round = this.d.bottom + Math.round(childAt.getTranslationY());
                    this.b.setBounds(i4, round - this.b.getIntrinsicHeight(), i3, round);
                    this.b.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
            } else {
                i = recyclerView.getHeight();
                i2 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                i.a(childAt2, this.d);
                int round2 = this.d.right + Math.round(childAt2.getTranslationX());
                this.b.setBounds(round2 - this.b.getIntrinsicWidth(), i2, round2, i);
                this.b.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
        Drawable drawable = this.b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
