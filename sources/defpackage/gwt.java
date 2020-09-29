package defpackage;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.Collections;
import java.util.List;

/* renamed from: gwt reason: default package */
public class gwt extends androidx.recyclerview.widget.RecyclerView.a<a> {
    public final gwu a;
    public final gwn<List<? extends hcm>, gxe> d = new gwn<List<? extends hcm>, gxe>() {
        public final /* bridge */ /* synthetic */ Object a() {
            return gwt.this.f.e;
        }

        public final /* synthetic */ Object b() {
            return gwt.this.f.c;
        }
    };
    private final gwm e;
    /* access modifiers changed from: private */
    public final gwx f;

    /* renamed from: gwt$a */
    static final class a extends u {
        /* access modifiers changed from: 0000 */
        public final gxh<?> a;

        a(gxh<?> gxh) {
            super(gxh.b);
            this.a = gxh;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HubsAdapter.");
            sb.append(super.toString());
            sb.append(" (");
            sb.append(this.a);
            sb.append(')');
            return sb.toString();
        }
    }

    public gwt(gwm gwm) {
        this.e = (gwm) fbp.a(gwm);
        this.f = new gwx(gwm);
        this.a = new gwu(this.f);
        a(true);
        a(this.f.f);
    }

    public static gxh<?> d(u uVar) {
        if (uVar instanceof a) {
            return ((a) uVar).a;
        }
        throw new IllegalArgumentException("Not a HubsAdapter view holder");
    }

    private gxg f(int i) {
        return this.f.get(i);
    }

    public final int a(int i) {
        return f(i).b;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new a(gxh.a(i, viewGroup, this.e));
    }

    public final void a(Parcelable parcelable) {
        this.a.a(parcelable);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        a aVar = (a) uVar;
        gxg f2 = f(i);
        aVar.a.a(i, f2.a, (b) this.a);
    }

    public void a(List<? extends hcm> list) {
        if (list == null || list.isEmpty()) {
            this.a.a();
        }
        gwx gwx = this.f;
        if (list != null) {
            gwx.b = list;
            gwx.c = gxe.a(gwx.a.g, list);
            return;
        }
        gwx.b = Collections.emptyList();
        gwx.c = gxe.a;
    }

    public final int b() {
        return this.f.size();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(int r3) {
        /*
            r2 = this;
            gxg r3 = r2.f(r3)
            hcm r3 = r3.a
            java.lang.String r0 = r3.id()
            if (r0 == 0) goto L_0x000d
            r3 = r0
        L_0x000d:
            int r3 = r3.hashCode()
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gwt.b(int):long");
    }
}
