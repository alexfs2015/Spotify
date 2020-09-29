package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* renamed from: bpb reason: default package */
public final class bpb {
    final ein a;
    long b;
    final bpf c;
    List<Integer> d;
    final SparseIntArray e;
    LruCache<Integer, bof> f;
    final List<Integer> g;
    final Deque<Integer> h;
    bsz<defpackage.bpf.c> i;
    bsz<defpackage.bpf.c> j;
    Set<Object> k;
    private boolean l;
    private final int m;
    private final Handler n;
    private TimerTask o;
    private btd<defpackage.bpf.c> p;
    private btd<defpackage.bpf.c> q;
    private c r;
    private bow<boo> s;

    /* renamed from: bpb$a */
    class a implements btd<defpackage.bpf.c> {
        private a() {
        }

        /* synthetic */ a(bpb bpb, byte b) {
            this();
        }

        public final /* synthetic */ void onResult(btc btc) {
            Status B_ = ((defpackage.bpf.c) btc).B_();
            int i = B_.f;
            if (i != 0) {
                bpb.this.a.c(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), B_.g}), new Object[0]);
            }
            bpb bpb = bpb.this;
            bpb.i = null;
            if (!bpb.h.isEmpty()) {
                bpb.this.c();
            }
        }
    }

    /* renamed from: bpb$b */
    class b implements btd<defpackage.bpf.c> {
        private b() {
        }

        /* synthetic */ b(bpb bpb, byte b) {
            this();
        }

        public final /* synthetic */ void onResult(btc btc) {
            Status B_ = ((defpackage.bpf.c) btc).B_();
            int i = B_.f;
            if (i != 0) {
                bpb.this.a.c(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), B_.g}), new Object[0]);
            }
            bpb bpb = bpb.this;
            bpb.j = null;
            if (!bpb.h.isEmpty()) {
                bpb.this.c();
            }
        }
    }

    /* renamed from: bpb$c */
    public class c extends defpackage.bpf.a {
        public c() {
        }

        public final void a() {
            long b = bpb.b(bpb.this.c);
            if (b != bpb.this.b) {
                bpb bpb = bpb.this;
                bpb.b = b;
                bpb.a();
                if (bpb.this.b != 0) {
                    bpb.this.b();
                }
            }
        }

        public final void a(int[] iArr) {
            List<Integer> a2 = eic.a(iArr);
            if (!bpb.this.d.equals(a2)) {
                bpb.this.f();
                bpb.this.f.evictAll();
                bpb.this.g.clear();
                bpb bpb = bpb.this;
                bpb.d = a2;
                bpb.b(bpb);
                bpb.this.h();
                bpb.this.g();
            }
        }

        public final void a(int[] iArr, int i) {
            int i2;
            int length = iArr.length;
            if (i == 0) {
                i2 = bpb.this.d.size();
            } else {
                i2 = bpb.this.e.get(i, -1);
                if (i2 == -1) {
                    bpb.this.b();
                    return;
                }
            }
            bpb.this.f();
            bpb.this.d.addAll(i2, eic.a(iArr));
            bpb.b(bpb.this);
            Iterator it = bpb.this.k.iterator();
            while (it.hasNext()) {
                it.next();
            }
            bpb.this.g();
        }

        public final void a(bof[] bofArr) {
            HashSet hashSet = new HashSet();
            bpb.this.g.clear();
            int length = bofArr.length;
            int i = 0;
            while (i < length) {
                bof bof = bofArr[i];
                int i2 = bof.b;
                bpb.this.f.put(Integer.valueOf(i2), bof);
                int i3 = bpb.this.e.get(i2, -1);
                if (i3 == -1) {
                    bpb.this.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i3));
                    i++;
                }
            }
            for (Integer intValue : bpb.this.g) {
                int i4 = bpb.this.e.get(intValue.intValue(), -1);
                if (i4 != -1) {
                    hashSet.add(Integer.valueOf(i4));
                }
            }
            bpb.this.g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            bpb.this.f();
            bpb.a(bpb.this, eic.a((Collection<Integer>) arrayList));
            bpb.this.g();
        }

        public final void b(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                bpb.this.f.remove(Integer.valueOf(i2));
                int i3 = bpb.this.e.get(i2, -1);
                if (i3 == -1) {
                    bpb.this.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    i++;
                }
            }
            Collections.sort(arrayList);
            bpb.this.f();
            bpb.a(bpb.this, eic.a((Collection<Integer>) arrayList));
            bpb.this.g();
        }

        public final void c(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                bpb.this.f.remove(Integer.valueOf(i));
                int i2 = bpb.this.e.get(i, -1);
                if (i2 == -1) {
                    bpb.this.b();
                    return;
                }
                bpb.this.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                bpb.this.f();
                bpb.this.d.removeAll(eic.a(iArr));
                bpb.b(bpb.this);
                bpb.b(bpb.this, eic.a((Collection<Integer>) arrayList));
                bpb.this.g();
            }
        }
    }

    /* renamed from: bpb$d */
    class d implements bow<boo> {
        private d() {
        }

        /* synthetic */ d(bpb bpb, byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ void a(bou bou) {
        }

        public final /* bridge */ /* synthetic */ void a(bou bou, int i) {
        }

        public final /* synthetic */ void a(bou bou, String str) {
            bpb.this.a(((boo) bou).a());
        }

        public final /* synthetic */ void a(bou bou, boolean z) {
            boo boo = (boo) bou;
            if (boo.a() != null) {
                bpb.this.a(boo.a());
            }
        }

        public final /* synthetic */ void b(bou bou) {
            bpb.this.d();
            bpb.this.a();
        }

        public final /* synthetic */ void b(bou bou, int i) {
            bpb.this.d();
            bpb.this.a();
        }

        public final /* bridge */ /* synthetic */ void b(bou bou, String str) {
        }

        public final /* bridge */ /* synthetic */ void c(bou bou, int i) {
        }

        public final /* synthetic */ void d(bou bou, int i) {
            bpb.this.d();
        }
    }

    bpb(bpf bpf) {
        this(bpf, 0);
    }

    private bpb(bpf bpf, byte b2) {
        this.k = new HashSet();
        this.a = new ein("MediaQueue", 0);
        this.c = bpf;
        this.m = Math.max(20, 1);
        boo b3 = bom.a().b().b();
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.n = new eix(Looper.getMainLooper());
        this.f = new bqc(this, 20);
        this.o = new bqb(this);
        this.p = new a(this, 0);
        this.q = new b(this, 0);
        this.r = new c();
        this.s = new d(this, 0);
        bom.a().b().a(this.s, boo.class);
        if (b3 != null && b3.f()) {
            a(b3.a());
        }
    }

    static /* synthetic */ void a(bpb bpb, int[] iArr) {
        Iterator it = bpb.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static long b(bpf bpf) {
        boh f2 = bpf.f();
        if (f2 == null || f2.a()) {
            return 0;
        }
        return f2.b;
    }

    static /* synthetic */ void b(bpb bpb) {
        bpb.e.clear();
        for (int i2 = 0; i2 < bpb.d.size(); i2++) {
            bpb.e.put(((Integer) bpb.d.get(i2)).intValue(), i2);
        }
    }

    static /* synthetic */ void b(bpb bpb, int[] iArr) {
        Iterator it = bpb.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private final void i() {
        this.n.removeCallbacks(this.o);
    }

    private final void j() {
        bsz<defpackage.bpf.c> bsz = this.j;
        if (bsz != null) {
            bsz.b();
            this.j = null;
        }
    }

    private final void k() {
        bsz<defpackage.bpf.c> bsz = this.i;
        if (bsz != null) {
            bsz.b();
            this.i = null;
        }
    }

    public final int a(int i2) {
        bxo.b("Must be called from the main thread.");
        return this.e.get(i2, -1);
    }

    public final bof a(int i2, boolean z) {
        bxo.b("Must be called from the main thread.");
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        int intValue = ((Integer) this.d.get(i2)).intValue();
        bof bof = (bof) this.f.get(Integer.valueOf(intValue));
        if (bof == null && !this.h.contains(Integer.valueOf(intValue))) {
            while (this.h.size() >= this.m) {
                this.h.removeFirst();
            }
            this.h.add(Integer.valueOf(intValue));
            c();
        }
        return bof;
    }

    public final void a() {
        f();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        i();
        this.h.clear();
        j();
        k();
        h();
        g();
    }

    /* access modifiers changed from: 0000 */
    public final void a(bpf bpf) {
        if (bpf != null && this.c == bpf) {
            this.l = true;
            bpf.a((defpackage.bpf.a) this.r);
            long b2 = b(bpf);
            this.b = b2;
            if (b2 != 0) {
                b();
            }
        }
    }

    public final void b() {
        String str = "Must be called from the main thread.";
        bxo.b(str);
        if (this.l && this.b != 0 && this.j == null) {
            j();
            k();
            bpf bpf = this.c;
            bxo.b(str);
            this.j = !bpf.n() ? bpf.a(17, (String) null) : bpf.a((g) new bpj(bpf, bpf.a));
            this.j.a(this.q);
        }
    }

    public final void c() {
        i();
        this.n.postDelayed(this.o, 500);
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        bpf bpf = this.c;
        c cVar = this.r;
        bxo.b("Must be called from the main thread.");
        if (cVar != null) {
            bpf.c.remove(cVar);
        }
        this.l = false;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (!this.h.isEmpty() && this.i == null && this.l && this.b != 0) {
            bpf bpf = this.c;
            int[] a2 = eic.a((Collection<Integer>) this.h);
            bxo.b("Must be called from the main thread.");
            this.i = !bpf.n() ? bpf.a(17, (String) null) : bpf.a((g) new bpk(bpf, bpf.a, a2));
            this.i.a(this.p);
            this.h.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
