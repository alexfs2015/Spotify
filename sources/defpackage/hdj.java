package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.j;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.Locale;

/* renamed from: hdj reason: default package */
public final class hdj {
    private static final a<View> a = new a<View>() {
        public final String toString() {
            return "SCROLL";
        }
    };

    private static int a(int i, RecyclerView recyclerView, boolean z) {
        a c = recyclerView.c();
        if (!(c instanceof gwt)) {
            throw new IllegalArgumentException("RecyclerView not managed by Hubs!");
        } else if (i >= 0 && (!z || i < c.b())) {
            return i;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Index out of bounds: %d (count: %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(c.b())}));
        }
    }

    public static void a(View view, hcm hcm, a<View> aVar) {
        a(view, hcm, aVar, hdk.a);
    }

    public static void a(View view, hcm hcm, a<View> aVar, int[] iArr) {
        if (iArr.length > 0) {
            throw new UnsupportedOperationException("Component does not support scrolling");
        }
    }

    public static void a(final RecyclerView recyclerView, final a<View> aVar, int... iArr) {
        if (iArr.length > 0) {
            final int a2 = a(iArr[0], recyclerView, aVar != a);
            i d = recyclerView.d();
            recyclerView.f();
            if (d instanceof LinearLayoutManager) {
                ((LinearLayoutManager) d).a(a2, 0);
            } else {
                recyclerView.d(a2);
            }
            u g = recyclerView.g(a2);
            final int[] a3 = hdk.a(iArr);
            if (g != null) {
                b(aVar, a3, g.o, recyclerView);
                return;
            }
            recyclerView.a((j) new j() {
                public final void a(View view) {
                    if (a2 == RecyclerView.e(view)) {
                        hdj.b(aVar, a3, view, recyclerView);
                        recyclerView.b((j) this);
                    }
                }

                public final void b(View view) {
                }
            });
        }
    }

    public static void a(RecyclerView recyclerView, int... iArr) {
        a(recyclerView, a, iArr);
    }

    /* access modifiers changed from: private */
    public static void b(a<View> aVar, int[] iArr, View view, RecyclerView recyclerView) {
        gwt.d(recyclerView.b(view)).a(aVar, iArr);
    }
}
