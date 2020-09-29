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

/* renamed from: bok reason: default package */
public final class bok {
    final ehw a;
    long b;
    final boo c;
    List<Integer> d;
    final SparseIntArray e;
    LruCache<Integer, bno> f;
    final List<Integer> g;
    final Deque<Integer> h;
    bsi<defpackage.boo.c> i;
    bsi<defpackage.boo.c> j;
    Set<Object> k;
    private boolean l;
    private final int m;
    private final Handler n;
    private TimerTask o;
    private bsm<defpackage.boo.c> p;
    private bsm<defpackage.boo.c> q;
    private c r;
    private bof<bnx> s;

    /* renamed from: bok$a */
    class a implements bsm<defpackage.boo.c> {
        private a() {
        }

        public final /* synthetic */ void onResult(bsl bsl) {
            Status B_ = ((defpackage.boo.c) bsl).B_();
            int i = B_.f;
            if (i != 0) {
                bok.this.a.c(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), B_.g}), new Object[0]);
            }
            bok bok = bok.this;
            bok.i = null;
            if (!bok.h.isEmpty()) {
                bok.this.c();
            }
        }

        /* synthetic */ a(bok bok, byte b) {
            this();
        }
    }

    /* renamed from: bok$b */
    class b implements bsm<defpackage.boo.c> {
        private b() {
        }

        public final /* synthetic */ void onResult(bsl bsl) {
            Status B_ = ((defpackage.boo.c) bsl).B_();
            int i = B_.f;
            if (i != 0) {
                bok.this.a.c(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), B_.g}), new Object[0]);
            }
            bok bok = bok.this;
            bok.j = null;
            if (!bok.h.isEmpty()) {
                bok.this.c();
            }
        }

        /* synthetic */ b(bok bok, byte b) {
            this();
        }
    }

    /* renamed from: bok$c */
    public class c extends defpackage.boo.a {
        public c() {
        }

        public final void a(int[] iArr) {
            List<Integer> a2 = ehl.a(iArr);
            if (!bok.this.d.equals(a2)) {
                bok.this.f();
                bok.this.f.evictAll();
                bok.this.g.clear();
                bok bok = bok.this;
                bok.d = a2;
                bok.b(bok);
                bok.this.h();
                bok.this.g();
            }
        }

        public final void a(int[] iArr, int i) {
            int i2;
            int length = iArr.length;
            if (i == 0) {
                i2 = bok.this.d.size();
            } else {
                i2 = bok.this.e.get(i, -1);
                if (i2 == -1) {
                    bok.this.b();
                    return;
                }
            }
            bok.this.f();
            bok.this.d.addAll(i2, ehl.a(iArr));
            bok.b(bok.this);
            Iterator it = bok.this.k.iterator();
            while (it.hasNext()) {
                it.next();
            }
            bok.this.g();
        }

        public final void b(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                bok.this.f.remove(Integer.valueOf(i2));
                int i3 = bok.this.e.get(i2, -1);
                if (i3 == -1) {
                    bok.this.b();
                    return;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    i++;
                }
            }
            Collections.sort(arrayList);
            bok.this.f();
            bok.a(bok.this, ehl.a((Collection<Integer>) arrayList));
            bok.this.g();
        }

        public final void c(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                bok.this.f.remove(Integer.valueOf(i));
                int i2 = bok.this.e.get(i, -1);
                if (i2 == -1) {
                    bok.this.b();
                    return;
                }
                bok.this.e.delete(i);
                arrayList.add(Integer.valueOf(i2));
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList);
                bok.this.f();
                bok.this.d.removeAll(ehl.a(iArr));
                bok.b(bok.this);
                bok.b(bok.this, ehl.a((Collection<Integer>) arrayList));
                bok.this.g();
            }
        }

        public final void a(bno[] bnoArr) {
            HashSet hashSet = new HashSet();
            bok.this.g.clear();
            int length = bnoArr.length;
            int i = 0;
            while (i < length) {
                bno bno = bnoArr[i];
                int i2 = bno.b;
                bok.this.f.put(Integer.valueOf(i2), bno);
                int i3 = bok.this.e.get(i2, -1);
                if (i3 == -1) {
                    bok.this.b();
                    return;
                } else {
                    hashSet.add(Integer.valueOf(i3));
                    i++;
                }
            }
            for (Integer intValue : bok.this.g) {
                int i4 = bok.this.e.get(intValue.intValue(), -1);
                if (i4 != -1) {
                    hashSet.add(Integer.valueOf(i4));
                }
            }
            bok.this.g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            bok.this.f();
            bok.a(bok.this, ehl.a((Collection<Integer>) arrayList));
            bok.this.g();
        }

        public final void a() {
            long b = bok.b(bok.this.c);
            if (b != bok.this.b) {
                bok bok = bok.this;
                bok.b = b;
                bok.a();
                if (bok.this.b != 0) {
                    bok.this.b();
                }
            }
        }
    }

    /* renamed from: bok$d */
    class d implements bof<bnx> {
        private d() {
        }

        public final /* bridge */ /* synthetic */ void a(bod bod) {
        }

        public final /* bridge */ /* synthetic */ void a(bod bod, int i) {
        }

        public final /* bridge */ /* synthetic */ void b(bod bod, String str) {
        }

        public final /* bridge */ /* synthetic */ void c(bod bod, int i) {
        }

        public final /* synthetic */ void d(bod bod, int i) {
            bok.this.d();
        }

        public final /* synthetic */ void a(bod bod, boolean z) {
            bnx bnx = (bnx) bod;
            if (bnx.a() != null) {
                bok.this.a(bnx.a());
            }
        }

        public final /* synthetic */ void b(bod bod, int i) {
            bok.this.d();
            bok.this.a();
        }

        public final /* synthetic */ void b(bod bod) {
            bok.this.d();
            bok.this.a();
        }

        public final /* synthetic */ void a(bod bod, String str) {
            bok.this.a(((bnx) bod).a());
        }

        /* synthetic */ d(bok bok, byte b) {
            this();
        }
    }

    bok(boo boo) {
        this(boo, 0);
    }

    private bok(boo boo, byte b2) {
        this.k = new HashSet();
        this.a = new ehw("MediaQueue", 0);
        this.c = boo;
        this.m = Math.max(20, 1);
        bnx b3 = bnv.a().b().b();
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.n = new eig(Looper.getMainLooper());
        this.f = new bpl(this, 20);
        this.o = new bpk(this);
        this.p = new a(this, 0);
        this.q = new b(this, 0);
        this.r = new c();
        this.s = new d(this, 0);
        bnv.a().b().a(this.s, bnx.class);
        if (b3 != null && b3.f()) {
            a(b3.a());
        }
    }

    public final bno a(int i2, boolean z) {
        bwx.b("Must be called from the main thread.");
        if (i2 < 0 || i2 >= this.d.size()) {
            return null;
        }
        int intValue = ((Integer) this.d.get(i2)).intValue();
        bno bno = (bno) this.f.get(Integer.valueOf(intValue));
        if (bno == null && !this.h.contains(Integer.valueOf(intValue))) {
            while (this.h.size() >= this.m) {
                this.h.removeFirst();
            }
            this.h.add(Integer.valueOf(intValue));
            c();
        }
        return bno;
    }

    public final int a(int i2) {
        bwx.b("Must be called from the main thread.");
        return this.e.get(i2, -1);
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

    public final void b() {
        bsi<defpackage.boo.c> bsi;
        String str = "Must be called from the main thread.";
        bwx.b(str);
        if (this.l && this.b != 0 && this.j == null) {
            j();
            k();
            boo boo = this.c;
            bwx.b(str);
            if (!boo.n()) {
                bsi = boo.a(17, (String) null);
            } else {
                bsi = boo.a((g) new bos(boo, boo.a));
            }
            this.j = bsi;
            this.j.a(this.q);
        }
    }

    public final void c() {
        i();
        this.n.postDelayed(this.o, 500);
    }

    private final void i() {
        this.n.removeCallbacks(this.o);
    }

    private final void j() {
        bsi<defpackage.boo.c> bsi = this.j;
        if (bsi != null) {
            bsi.b();
            this.j = null;
        }
    }

    private final void k() {
        bsi<defpackage.boo.c> bsi = this.i;
        if (bsi != null) {
            bsi.b();
            this.i = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(boo boo) {
        if (boo != null && this.c == boo) {
            this.l = true;
            boo.a((defpackage.boo.a) this.r);
            long b2 = b(boo);
            this.b = b2;
            if (b2 != 0) {
                b();
            }
        }
    }

    static long b(boo boo) {
        bnq f2 = boo.f();
        if (f2 == null || f2.a()) {
            return 0;
        }
        return f2.b;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        boo boo = this.c;
        c cVar = this.r;
        bwx.b("Must be called from the main thread.");
        if (cVar != null) {
            boo.c.remove(cVar);
        }
        this.l = false;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        bsi<defpackage.boo.c> bsi;
        if (!this.h.isEmpty() && this.i == null && this.l && this.b != 0) {
            boo boo = this.c;
            int[] a2 = ehl.a((Collection<Integer>) this.h);
            bwx.b("Must be called from the main thread.");
            if (!boo.n()) {
                bsi = boo.a(17, (String) null);
            } else {
                bsi = boo.a((g) new bot(boo, boo.a, a2));
            }
            this.i = bsi;
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

    static /* synthetic */ void b(bok bok) {
        bok.e.clear();
        for (int i2 = 0; i2 < bok.d.size(); i2++) {
            bok.e.put(((Integer) bok.d.get(i2)).intValue(), i2);
        }
    }

    static /* synthetic */ void a(bok bok, int[] iArr) {
        Iterator it = bok.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    static /* synthetic */ void b(bok bok, int[] iArr) {
        Iterator it = bok.k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
