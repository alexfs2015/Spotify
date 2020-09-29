package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: gvd reason: default package */
public final class gvd {
    final gvc a;
    private final SparseArray<a> b;
    private final gum c;
    private final b d;

    /* renamed from: gvd$a */
    static final class a {
        final ArrayList<gvh<?>> a;
        private int b;

        private a() {
            this.a = new ArrayList<>(5);
            this.b = 5;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean a(gvh<?> gvh) {
            fay.a(gvh);
            return this.a.size() < this.b && this.a.add(gvh);
        }
    }

    public gvd(gum gum) {
        this(gum, new gvc(gum));
    }

    private gvd(gum gum, gvc gvc) {
        this(gum, gvc, new guv(gvc));
    }

    gvd(gum gum, gvc gvc, b bVar) {
        this.b = new SparseArray<>();
        this.c = (gum) fay.a(gum);
        this.a = (gvc) fay.a(gvc);
        this.d = (b) fay.a(bVar);
    }

    public final void a(gvh<?> gvh) {
        ((a) this.b.get(gvh.a)).a(gvh);
    }

    private gvh<?> a(gzt gzt, ViewGroup viewGroup) {
        int i = this.a.a(gzt).b;
        a aVar = (a) this.b.get(i);
        if (aVar == null) {
            aVar = new a(0);
            this.b.put(i, aVar);
        }
        gvh<?> gvh = aVar.a.isEmpty() ? null : (gvh) aVar.a.remove(aVar.a.size() - 1);
        return gvh != null ? gvh : gvh.a(i, viewGroup, this.c);
    }

    private void a(gvh<?> gvh, gzt gzt, int i) {
        gvh.a(i, this.a.a(gzt).a, this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gvh<?> a(defpackage.gvh<?> r3, defpackage.gzt r4, android.view.ViewGroup r5, int r6) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0012
            gvc r0 = r2.a
            gvg r0 = r0.a(r4)
            int r0 = r0.b
            int r1 = r3.a
            if (r0 != r1) goto L_0x000f
            goto L_0x0013
        L_0x000f:
            r2.a(r3)
        L_0x0012:
            r3 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x0019
            gvh r3 = r2.a(r4, r5)
        L_0x0019:
            r2.a(r3, r4, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvd.a(gvh, gzt, android.view.ViewGroup, int):gvh");
    }
}
