package defpackage;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;

/* renamed from: iz reason: default package */
public final class iz {

    /* renamed from: iz$a */
    public interface a {
        void a(boolean z);
    }

    /* renamed from: iz$b */
    public static class b implements TouchExplorationStateChangeListener {
        private a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public final void onTouchExplorationStateChanged(boolean z) {
            this.a.a(z);
        }
    }
}
