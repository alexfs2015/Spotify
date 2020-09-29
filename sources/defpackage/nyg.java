package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.m;

/* renamed from: nyg reason: default package */
public final class nyg extends m {
    private final Rect a = new Rect();

    nyg() {
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
            View childAt = recyclerView.getChildAt(i3);
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            RecyclerView.a(childAt, this.a);
            childAt.setAlpha(gw.a(((1.0f - (((float) (Math.max(paddingLeft - this.a.left, 0) + Math.max(this.a.right - width, 0))) / ((float) this.a.width()))) * 2.0f) - 1.0f, 0.0f, 1.0f));
        }
    }
}
