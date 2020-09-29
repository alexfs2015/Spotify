package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;

/* renamed from: hcd reason: default package */
final class hcd {
    static boolean a(RecyclerView recyclerView) {
        View childAt = recyclerView.getChildAt(0);
        return (childAt == null || (RecyclerView.e(childAt) == 0 && ((i) fbp.a(recyclerView.d())).l(childAt) == 0)) ? false : true;
    }
}
