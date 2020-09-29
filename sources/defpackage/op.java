package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: op reason: default package */
public final class op {
    public static int a(s sVar, om omVar, View view, View view2, i iVar, boolean z) {
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(i.c(view) - i.c(view2)) + 1;
        }
        return Math.min(omVar.e(), omVar.b(view2) - omVar.a(view));
    }

    public static int a(s sVar, om omVar, View view, View view2, i iVar, boolean z, boolean z2) {
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (sVar.a() - Math.max(i.c(view), i.c(view2))) - 1) : Math.max(0, Math.min(i.c(view), i.c(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(omVar.b(view2) - omVar.a(view))) / ((float) (Math.abs(i.c(view) - i.c(view2)) + 1)))) + ((float) (omVar.b() - omVar.a(view))));
    }

    public static int b(s sVar, om omVar, View view, View view2, i iVar, boolean z) {
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.a();
        }
        return (int) ((((float) (omVar.b(view2) - omVar.a(view))) / ((float) (Math.abs(i.c(view) - i.c(view2)) + 1))) * ((float) sVar.a()));
    }
}
