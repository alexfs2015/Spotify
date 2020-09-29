package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: fvv reason: default package */
public final class fvv {
    private static final b a = new b(0);

    /* renamed from: fvv$a */
    static class a implements d {
        private final NestedScrollView a;

        private a(NestedScrollView nestedScrollView) {
            this.a = nestedScrollView;
        }

        /* synthetic */ a(NestedScrollView nestedScrollView, byte b) {
            this(nestedScrollView);
        }

        public final void a(int i) {
            this.a.b(i);
        }

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: fvv$b */
    static class b implements d {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a(int i) {
        }

        public final boolean a() {
            return false;
        }
    }

    /* renamed from: fvv$c */
    static class c implements d {
        private final RecyclerView a;

        public c(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        public final void a(int i) {
            this.a.a(0, i);
        }

        public final boolean a() {
            return !this.a.isLayoutSuppressed();
        }
    }

    /* renamed from: fvv$d */
    public interface d {
        void a(int i);

        boolean a();
    }

    public static d a(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return new c((RecyclerView) childAt);
            }
            if (childAt instanceof NestedScrollView) {
                return new a((NestedScrollView) childAt, 0);
            }
        }
        return a;
    }
}
