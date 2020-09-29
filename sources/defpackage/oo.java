package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: oo reason: default package */
public final class oo extends ht {
    final RecyclerView c;
    public final a d = new a(this);

    /* renamed from: oo$a */
    public static class a extends ht {
        public Map<View, ht> c = new WeakHashMap();
        private oo d;

        public a(oo ooVar) {
            this.d = ooVar;
        }

        public final void a(View view, ja jaVar) {
            super.a(view, jaVar);
            if (!this.d.c.l() && this.d.c.d() != null) {
                this.d.c.d().a(view, jaVar);
                ht htVar = (ht) this.c.get(view);
                if (htVar != null) {
                    htVar.a(view, jaVar);
                }
            }
        }

        public final boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (!this.d.c.l() && this.d.c.d() != null) {
                ht htVar = (ht) this.c.get(view);
                if (htVar != null && htVar.a(view, i, bundle)) {
                    return true;
                }
                this.d.c.d();
            }
            return false;
        }

        public final ht c(View view) {
            return (ht) this.c.remove(view);
        }
    }

    public oo(RecyclerView recyclerView) {
        this.c = recyclerView;
    }

    public final void a(View view, ja jaVar) {
        super.a(view, jaVar);
        if (!this.c.l() && this.c.d() != null) {
            i d2 = this.c.d();
            d2.a(d2.i.e, d2.i.E, jaVar);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.c.l() || this.c.d() == null) {
            return false;
        }
        i d2 = this.c.d();
        return d2.a(d2.i.e, d2.i.E, i, bundle);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.c.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.d() != null) {
                recyclerView.d().a(accessibilityEvent);
            }
        }
    }
}
