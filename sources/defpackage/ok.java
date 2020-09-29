package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.s;

/* renamed from: ok reason: default package */
public final class ok {
    public static int a(s sVar, oh ohVar, View view, View view2, i iVar, boolean z, boolean z2) {
        int i;
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(i.c(view), i.c(view2));
        int max = Math.max(i.c(view), i.c(view2));
        if (z2) {
            i = Math.max(0, (sVar.a() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(ohVar.b(view2) - ohVar.a(view))) / ((float) (Math.abs(i.c(view) - i.c(view2)) + 1)))) + ((float) (ohVar.b() - ohVar.a(view))));
    }

    public static int a(s sVar, oh ohVar, View view, View view2, i iVar, boolean z) {
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(i.c(view) - i.c(view2)) + 1;
        }
        return Math.min(ohVar.e(), ohVar.b(view2) - ohVar.a(view));
    }

    public static int b(s sVar, oh ohVar, View view, View view2, i iVar, boolean z) {
        if (iVar.r() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.a();
        }
        return (int) ((((float) (ohVar.b(view2) - ohVar.a(view))) / ((float) (Math.abs(i.c(view) - i.c(view2)) + 1))) * ((float) sVar.a()));
    }
}
