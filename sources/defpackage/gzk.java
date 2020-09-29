package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;

/* renamed from: gzk reason: default package */
final class gzk {
    static boolean a(RecyclerView recyclerView) {
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null || (RecyclerView.e(childAt) == 0 && ((i) fay.a(recyclerView.d())).l(childAt) == 0)) {
            return false;
        }
        return true;
    }
}
