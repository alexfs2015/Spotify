package defpackage;

import androidx.recyclerview.widget.RecyclerView.u;

/* renamed from: ov reason: default package */
public final class ov {
    private dv<u, a> a = new dv<>();
    private ds<u> b = new ds<>();

    /* renamed from: ov$a */
    public static class a {
        private static defpackage.hq.a<a> d = new defpackage.hq.b(20);
        int a;
        androidx.recyclerview.widget.RecyclerView.f.b b;
        androidx.recyclerview.widget.RecyclerView.f.b c;

        private a() {
        }

        static a a() {
            a aVar = (a) d.a();
            return aVar == null ? new a() : aVar;
        }

        static void a(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }

        public static void b() {
            do {
            } while (d.a() != null);
        }
    }

    /* renamed from: ov$b */
    public interface b {
        void a(u uVar);

        void a(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar, androidx.recyclerview.widget.RecyclerView.f.b bVar2);

        void b(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar, androidx.recyclerview.widget.RecyclerView.f.b bVar2);

        void c(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar, androidx.recyclerview.widget.RecyclerView.f.b bVar2);
    }

    public androidx.recyclerview.widget.RecyclerView.f.b a(u uVar, int i) {
        androidx.recyclerview.widget.RecyclerView.f.b bVar;
        int a2 = this.a.a((Object) uVar);
        if (a2 < 0) {
            return null;
        }
        a aVar = (a) this.a.c(a2);
        if (aVar == null || (aVar.a & i) == 0) {
            return null;
        }
        aVar.a &= i ^ -1;
        if (i == 4) {
            bVar = aVar.b;
        } else if (i == 8) {
            bVar = aVar.c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((aVar.a & 12) == 0) {
            this.a.d(a2);
            a.a(aVar);
        }
        return bVar;
    }

    public final u a(long j) {
        return (u) this.b.a(j, null);
    }

    public final void a() {
        this.a.clear();
        this.b.c();
    }

    public final void a(long j, u uVar) {
        this.b.b(j, uVar);
    }

    public final void a(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar) {
        a aVar = (a) this.a.get(uVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(uVar, aVar);
        }
        aVar.b = bVar;
        aVar.a |= 4;
    }

    public final void a(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            u uVar = (u) this.a.b(size);
            a aVar = (a) this.a.d(size);
            if ((aVar.a & 3) == 3) {
                bVar.a(uVar);
            } else if ((aVar.a & 1) != 0) {
                if (aVar.b == null) {
                    bVar.a(uVar);
                } else {
                    bVar.a(uVar, aVar.b, aVar.c);
                }
            } else if ((aVar.a & 14) == 14) {
                bVar.b(uVar, aVar.b, aVar.c);
            } else if ((aVar.a & 12) == 12) {
                bVar.c(uVar, aVar.b, aVar.c);
            } else if ((aVar.a & 4) != 0) {
                bVar.a(uVar, aVar.b, null);
            } else if ((aVar.a & 8) != 0) {
                bVar.b(uVar, aVar.b, aVar.c);
            }
            a.a(aVar);
        }
    }

    public final boolean a(u uVar) {
        a aVar = (a) this.a.get(uVar);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    public final void b(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar) {
        a aVar = (a) this.a.get(uVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(uVar, aVar);
        }
        aVar.a |= 2;
        aVar.b = bVar;
    }

    public final boolean b(u uVar) {
        a aVar = (a) this.a.get(uVar);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public final void c(u uVar) {
        a aVar = (a) this.a.get(uVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(uVar, aVar);
        }
        aVar.a |= 1;
    }

    public final void c(u uVar, androidx.recyclerview.widget.RecyclerView.f.b bVar) {
        a aVar = (a) this.a.get(uVar);
        if (aVar == null) {
            aVar = a.a();
            this.a.put(uVar, aVar);
        }
        aVar.c = bVar;
        aVar.a |= 8;
    }

    public final void d(u uVar) {
        a aVar = (a) this.a.get(uVar);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    public final void e(u uVar) {
        int b2 = this.b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (uVar == this.b.c(b2)) {
                this.b.a(b2);
                break;
            } else {
                b2--;
            }
        }
        a aVar = (a) this.a.remove(uVar);
        if (aVar != null) {
            a.a(aVar);
        }
    }
}
