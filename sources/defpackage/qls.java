package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.spotify.music.R;

/* renamed from: qls reason: default package */
final class qls extends h {
    final GradientDrawable a;
    private final Rect b = new Rect();

    qls(Context context, RecyclerView recyclerView, int i) {
        this.a = (GradientDrawable) vhg.a(context, i);
        this.a.setCallback(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, int i2) {
        this.a.setColors(new int[]{i, i2});
    }

    public final void a(Canvas canvas, RecyclerView recyclerView) {
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null && RecyclerView.e(childAt) <= 0 && gwt.d(recyclerView.b(childAt)).a == R.id.hub_glue_background) {
            int width = this.b.width();
            int height = this.b.height();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (!(width == measuredWidth && height == measuredHeight)) {
                this.b.set(0, 0, measuredWidth, measuredHeight);
                this.a.setBounds(this.b);
            }
            canvas.save();
            canvas.translate(0.0f, (float) childAt.getTop());
            this.a.draw(canvas);
            canvas.restore();
        }
    }
}
