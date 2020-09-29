package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vhx reason: default package */
public final class vhx extends androidx.recyclerview.widget.RecyclerView.a<c> implements gkv {
    private final List<a<?>> a;
    private int d;
    private final boolean e;
    private final SparseArray<b> f;
    private int g;

    /* renamed from: vhx$a */
    class a<H extends u> extends androidx.recyclerview.widget.RecyclerView.c {
        androidx.recyclerview.widget.RecyclerView.a<H> a;
        int b;
        int c;
        int d;
        boolean e;
        SparseIntArray f;

        private a(androidx.recyclerview.widget.RecyclerView.a<H> aVar) {
            this.e = true;
            this.f = new SparseIntArray();
            this.a = aVar;
            aVar.a((androidx.recyclerview.widget.RecyclerView.c) this);
        }

        /* synthetic */ a(vhx vhx, androidx.recyclerview.widget.RecyclerView.a aVar, byte b2) {
            this(aVar);
        }

        public final void a() {
            vhx.this.a();
            vhx.this.e();
        }

        public final void a(int i, int i2) {
            vhx.this.a(this.c + i, i2);
        }

        public final void a(int i, int i2, int i3) {
            vhx vhx = vhx.this;
            int i4 = this.c;
            vhx.b(i + i4, i4 + i2);
        }

        public final void b(int i, int i2) {
            vhx.this.c(this.c + i, i2);
            vhx.a(vhx.this, this.b + 1, i2);
        }

        public final void c(int i, int i2) {
            vhx.this.d(this.c + i, i2);
            vhx.a(vhx.this, this.b + 1, -i2);
        }
    }

    /* renamed from: vhx$b */
    static class b {
        final int a;
        final int b;

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        /* synthetic */ b(int i, int i2, byte b2) {
            this(i, i2);
        }
    }

    /* renamed from: vhx$c */
    static class c extends u {
        final u a;

        private c(u uVar) {
            super(uVar.o);
            this.a = uVar;
        }

        /* synthetic */ c(u uVar, byte b) {
            this(uVar);
        }
    }

    public vhx() {
        this(false);
    }

    public vhx(boolean z) {
        this.a = new ArrayList();
        this.f = new SparseArray<>();
        this.g = 1;
        this.e = z;
    }

    static /* synthetic */ void a(vhx vhx, int i, int i2) {
        while (i < vhx.a.size()) {
            if (((a) vhx.a.get(i)).e) {
                a aVar = (a) vhx.a.get(i);
                aVar.c += i2;
            }
            i++;
        }
        vhx.d += i2;
    }

    private a<?> j(int i) {
        int i2 = 0;
        Object obj = this.a.get(0);
        while (true) {
            a<?> aVar = (a) obj;
            if (i < aVar.c + aVar.a.b() && aVar.e) {
                return aVar;
            }
            i2++;
            obj = this.a.get(i2);
        }
    }

    private a<?> k(int i) {
        for (a<?> aVar : this.a) {
            if (aVar.d == i) {
                return aVar;
            }
        }
        return null;
    }

    private static void l(int i) {
        Assertion.a("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
    }

    public final int a(int i) {
        a j = j(i);
        int a2 = j.a.a(i - j.c);
        if (this.e) {
            this.f.put(a2, new b(j.b, a2, 0));
            return a2;
        }
        int i2 = j.f.get(a2, -1);
        if (i2 == -1) {
            i2 = this.g;
            this.g = i2 + 1;
            j.f.put(a2, i2);
            this.f.put(i2, new b(j.b, a2, 0));
        }
        return i2;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        b bVar = (b) this.f.get(i);
        return new c(((a) this.a.get(bVar.a)).a.b(viewGroup, bVar.b), 0);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int i = 0;
        for (a aVar : this.a) {
            if (aVar.e) {
                aVar.c = i;
                i += aVar.a.b();
            }
        }
        this.d = i;
    }

    public final <H extends u> void a(androidx.recyclerview.widget.RecyclerView.a<H> aVar, int i) {
        int size = this.a.size();
        a aVar2 = new a(this, aVar, 0);
        aVar2.c = this.d;
        aVar2.b = size;
        aVar2.d = i;
        this.a.add(aVar2);
        this.d += aVar.b();
        if (aVar.b() > 0) {
            c(this.d, aVar.b());
        }
    }

    public final void a(androidx.recyclerview.widget.RecyclerView.c cVar) {
        if (!this.b.a()) {
            boolean z = true;
            Iterator it = this.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((a) it.next()).a.c) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            a(z);
        }
        super.a(cVar);
    }

    public final /* synthetic */ void a(u uVar) {
        c cVar = (c) uVar;
        ((a) this.a.get(((b) this.f.get(cVar.t)).a)).a.a(cVar.a);
    }

    public final /* synthetic */ void a(u uVar, int i) {
        c cVar = (c) uVar;
        a j = j(i);
        j.a.a(cVar.a, i - j.c);
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        for (a aVar : this.a) {
            aVar.a.a(recyclerView);
        }
    }

    public void a(boolean z, int... iArr) {
        boolean z2 = false;
        for (int i : iArr) {
            l(i);
            a k = k(i);
            if (!(k == null || k.e == z)) {
                k.e = z;
                z2 = true;
            }
        }
        if (z2) {
            a();
            e();
        }
    }

    public final void a(int... iArr) {
        a(false, iArr);
    }

    public final int b() {
        return this.d;
    }

    public final long b(int i) {
        a j = j(i);
        return j.a.b(i - j.c) ^ ((long) j.hashCode());
    }

    public final /* synthetic */ void b(u uVar) {
        c cVar = (c) uVar;
        ((a) this.a.get(((b) this.f.get(cVar.t)).a)).a.b(cVar.a);
    }

    public final void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        for (a aVar : this.a) {
            aVar.a.b(recyclerView);
        }
    }

    public final void b(int... iArr) {
        a(true, iArr);
    }

    public final String c(int i) {
        a j = j(i);
        androidx.recyclerview.widget.RecyclerView.a<H> aVar = j.a;
        String str = aVar instanceof gkv ? ((gkv) aVar).c(i - j.c) : aVar instanceof gkw ? null : "unknown";
        if (str == null) {
            return String.valueOf(j.d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(j.d));
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final /* synthetic */ void c(u uVar) {
        c cVar = (c) uVar;
        ((a) this.a.get(((b) this.f.get(cVar.t)).a)).a.c(cVar.a);
    }

    public final boolean c(int... iArr) {
        if (this.a.isEmpty()) {
            return false;
        }
        for (int i = 0; i <= 0; i++) {
            if (k(iArr[0]) == null) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i) {
        return ((a) fbp.a(k(i))).a.b();
    }

    public final int g(int i) {
        l(i);
        for (a aVar : this.a) {
            if (aVar.d == i) {
                return aVar.c;
            }
        }
        return -1;
    }

    public final boolean h(int i) {
        l(i);
        a k = k(i);
        boolean z = false;
        if (k == null) {
            return false;
        }
        boolean z2 = k.e;
        if (k.a.b() > 0) {
            z = true;
        }
        k.e = z;
        if (z2 != k.e) {
            a();
            e();
        }
        return k.e;
    }

    public final boolean i(int i) {
        l(i);
        a k = k(i);
        return k != null && k.e;
    }
}
