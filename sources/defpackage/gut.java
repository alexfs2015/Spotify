package defpackage;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.Collections;
import java.util.List;

/* renamed from: gut reason: default package */
public class gut extends androidx.recyclerview.widget.RecyclerView.a<a> {
    public final guu a;
    public final gun<List<? extends gzt>, gve> d = new gun<List<? extends gzt>, gve>() {
        public final /* synthetic */ Object b() {
            return gut.this.f.c;
        }

        public final /* bridge */ /* synthetic */ Object a() {
            return gut.this.f.e;
        }
    };
    private final gum e;
    /* access modifiers changed from: private */
    public final gux f;

    /* renamed from: gut$a */
    static final class a extends u {
        /* access modifiers changed from: 0000 */
        public final gvh<?> a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("HubsAdapter.");
            sb.append(super.toString());
            sb.append(" (");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }

        a(gvh<?> gvh) {
            super(gvh.b);
            this.a = gvh;
        }
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a aVar = (a) uVar;
        gvg f2 = f(i);
        aVar.a.a(i, f2.a, (b) this.a);
    }

    public gut(gum gum) {
        this.e = (gum) fay.a(gum);
        this.f = new gux(gum);
        this.a = new guu(this.f);
        a(true);
        a(this.f.f);
    }

    public void a(List<? extends gzt> list) {
        if (list == null || list.isEmpty()) {
            this.a.a();
        }
        gux gux = this.f;
        if (list != null) {
            gux.b = list;
            gux.c = gve.a(gux.a.g, list);
            return;
        }
        gux.b = Collections.emptyList();
        gux.c = gve.a;
    }

    public final int a(int i) {
        return f(i).b;
    }

    private gvg f(int i) {
        return this.f.get(i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(int r3) {
        /*
            r2 = this;
            gvg r3 = r2.f(r3)
            gzt r3 = r3.a
            java.lang.String r0 = r3.id()
            if (r0 == 0) goto L_0x000d
            r3 = r0
        L_0x000d:
            int r3 = r3.hashCode()
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gut.b(int):long");
    }

    public final int b() {
        return this.f.size();
    }

    public static gvh<?> d(u uVar) {
        if (uVar instanceof a) {
            return ((a) uVar).a;
        }
        throw new IllegalArgumentException("Not a HubsAdapter view holder");
    }

    public final void a(Parcelable parcelable) {
        this.a.a(parcelable);
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(gvh.a(i, viewGroup, this.e));
    }
}
