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

/* renamed from: uwh reason: default package */
public final class uwh extends androidx.recyclerview.widget.RecyclerView.a<c> implements gjk {
    public final List<a<?>> a;
    private int d;
    private final boolean e;
    private final SparseArray<b> f;
    private int g;

    /* renamed from: uwh$a */
    public class a<H extends u> extends androidx.recyclerview.widget.RecyclerView.c {
        public androidx.recyclerview.widget.RecyclerView.a<H> a;
        int b;
        int c;
        int d;
        boolean e;
        SparseIntArray f;

        /* synthetic */ a(uwh uwh, androidx.recyclerview.widget.RecyclerView.a aVar, byte b2) {
            this(aVar);
        }

        private a(androidx.recyclerview.widget.RecyclerView.a<H> aVar) {
            this.e = true;
            this.f = new SparseIntArray();
            this.a = aVar;
            aVar.a((androidx.recyclerview.widget.RecyclerView.c) this);
        }

        public final void a() {
            uwh.this.a();
            uwh.this.e();
        }

        public final void a(int i, int i2) {
            uwh.this.a(this.c + i, i2);
        }

        public final void b(int i, int i2) {
            uwh.this.c(this.c + i, i2);
            uwh.a(uwh.this, this.b + 1, i2);
        }

        public final void c(int i, int i2) {
            uwh.this.d(this.c + i, i2);
            uwh.a(uwh.this, this.b + 1, -i2);
        }

        public final void a(int i, int i2, int i3) {
            uwh uwh = uwh.this;
            int i4 = this.c;
            uwh.b(i + i4, i4 + i2);
        }
    }

    /* renamed from: uwh$b */
    static class b {
        final int a;
        final int b;

        /* synthetic */ b(int i, int i2, byte b2) {
            this(i, i2);
        }

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* renamed from: uwh$c */
    static class c extends u {
        final u a;

        /* synthetic */ c(u uVar, byte b) {
            this(uVar);
        }

        private c(u uVar) {
            super(uVar.o);
            this.a = uVar;
        }
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

    public final /* synthetic */ void b(u uVar) {
        c cVar = (c) uVar;
        ((a) this.a.get(((b) this.f.get(cVar.t)).a)).a.b(cVar.a);
    }

    public final /* synthetic */ void c(u uVar) {
        c cVar = (c) uVar;
        ((a) this.a.get(((b) this.f.get(cVar.t)).a)).a.c(cVar.a);
    }

    public uwh() {
        this(false);
    }

    public uwh(boolean z) {
        this.a = new ArrayList();
        this.f = new SparseArray<>();
        this.g = 1;
        this.e = z;
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

    public a<?> f(int i) {
        for (a<?> aVar : this.a) {
            if (aVar.d == i) {
                return aVar;
            }
        }
        return null;
    }

    public final int b() {
        return this.d;
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

    public final String c(int i) {
        a j = j(i);
        androidx.recyclerview.widget.RecyclerView.a<H> aVar = j.a;
        String str = aVar instanceof gjk ? ((gjk) aVar).c(i - j.c) : aVar instanceof gjl ? null : "unknown";
        if (str == null) {
            return String.valueOf(j.d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(j.d));
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final long b(int i) {
        a j = j(i);
        return j.a.b(i - j.c) ^ ((long) j.hashCode());
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        for (a aVar : this.a) {
            aVar.a.a(recyclerView);
        }
    }

    public final void b(RecyclerView recyclerView) {
        super.b(recyclerView);
        for (a aVar : this.a) {
            aVar.a.b(recyclerView);
        }
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

    public final int g(int i) {
        k(i);
        for (a aVar : this.a) {
            if (aVar.d == i) {
                return aVar.c;
            }
        }
        return -1;
    }

    public final void a(int... iArr) {
        a(false, iArr);
    }

    public final void b(int... iArr) {
        a(true, iArr);
    }

    public final boolean h(int i) {
        k(i);
        a f2 = f(i);
        boolean z = false;
        if (f2 == null) {
            return false;
        }
        boolean z2 = f2.e;
        if (f2.a.b() > 0) {
            z = true;
        }
        f2.e = z;
        if (z2 != f2.e) {
            a();
            e();
        }
        return f2.e;
    }

    public void a(boolean z, int... iArr) {
        boolean z2 = false;
        for (int i : iArr) {
            k(i);
            a f2 = f(i);
            if (!(f2 == null || f2.e == z)) {
                f2.e = z;
                z2 = true;
            }
        }
        if (z2) {
            a();
            e();
        }
    }

    public final boolean i(int i) {
        k(i);
        a f2 = f(i);
        return f2 != null && f2.e;
    }

    private static void k(int i) {
        Assertion.a("Its not allowed to do actions using the SECTION_ID_NONE id", i != Integer.MIN_VALUE);
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

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        b bVar = (b) this.f.get(i);
        return new c(((a) this.a.get(bVar.a)).a.b(viewGroup, bVar.b), 0);
    }

    static /* synthetic */ void a(uwh uwh, int i, int i2) {
        while (i < uwh.a.size()) {
            if (((a) uwh.a.get(i)).e) {
                a aVar = (a) uwh.a.get(i);
                aVar.c += i2;
            }
            i++;
        }
        uwh.d += i2;
    }
}
