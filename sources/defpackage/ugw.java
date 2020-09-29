package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: ugw reason: default package */
public final class ugw {

    /* renamed from: ugw$a */
    public static class a extends h {
        public final void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            super.a(rect, view, recyclerView, sVar);
            int a = sVar.a();
            int e = RecyclerView.e(view);
            if (a <= 0 || e != a - 1) {
                rect.set(0, 0, 0, 0);
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int childCount = recyclerView.getChildCount();
            int i = 0;
            int i2 = 0;
            while (i < childCount && i < 15) {
                i2 += recyclerView.getChildAt((childCount - i) - 1).getMeasuredHeight();
                i++;
            }
            int measuredHeight2 = (measuredHeight - i2) - view.getMeasuredHeight();
            if (measuredHeight2 < 0) {
                measuredHeight2 = 0;
            }
            rect.set(0, 0, 0, vfj.a((float) measuredHeight2, view.getResources()));
        }
    }
}
