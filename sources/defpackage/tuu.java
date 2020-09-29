package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.m;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.hash.Hashing;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: tuu reason: default package */
public final class tuu extends androidx.recyclerview.widget.RecyclerView.a<u> implements gjk, tuc, vur {
    final Picasso a;
    public final twf d;
    public final tvz e;
    public final twc f;
    public tur g;
    public List<Object> h = new ArrayList();
    private final ttm i;
    private final ttk j;
    private final tui k;
    private final tuf l;
    private final tun m;
    private final tuw n;
    private final fdr o = Hashing.b();

    /* renamed from: tuu$a */
    public static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public tuu(Picasso picasso, twf twf, tvz tvz, ttm ttm, ttk ttk, tui tui, tuf tuf, tun tun, tuw tuw, twc twc) {
        this.a = picasso;
        this.d = twf;
        this.e = tvz;
        this.i = ttm;
        this.j = ttk;
        this.k = tui;
        this.l = tuf;
        this.m = tun;
        this.n = tuw;
        this.f = twc;
        this.d.b(true);
        a(true);
    }

    public final void a(tur tur) {
        ArrayList arrayList = new ArrayList(tur.d());
        arrayList.addAll(tur.a());
        arrayList.addAll(Arrays.asList(tur.b()));
        arrayList.addAll(tur.c());
        this.n.a(this.h, (List<Object>) arrayList);
        b a2 = nv.a(this.n);
        this.g = tur;
        this.h = arrayList;
        a2.a((androidx.recyclerview.widget.RecyclerView.a) this);
    }

    private tur c() {
        tur tur = this.g;
        return tur != null ? tur : new tur();
    }

    public final String c(int i2) {
        int a2 = a(i2);
        if (a2 == -1) {
            return "unknown";
        }
        if (a2 != 1) {
            String str = "is control segment";
            if (a2 == 2 || a2 != 3) {
                return str;
            }
        }
        return "is audio episode";
    }

    public final long b(int i2) {
        Object obj = this.h.get(i2);
        if (!(obj instanceof uys)) {
            return this.o.a().a(obj.getClass().getCanonicalName(), far.c).a().c();
        }
        return this.o.a().a(f(h(i2)).getUri(), far.c).a().c();
    }

    public final u a(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new a(this.k.a(viewGroup).getView());
        }
        if (i2 == 2) {
            return new a(this.k.b(viewGroup).getView());
        }
        if (i2 != 3) {
            return this.m.a(viewGroup, i2);
        }
        return new a(this.k.c(viewGroup).getView());
    }

    public final void a(u uVar, int i2) {
        int a2 = a(i2);
        View view = uVar.o;
        int h2 = h(i2);
        if (a2 == 1) {
            this.d.a((tqs) fqf.a(view, tqs.class), h2);
        } else if (a2 == 2) {
            uys f2 = f(h2);
            if (f2 != null) {
                ttk.a(view).a(this.i.a(f2.getHeader()));
            }
        } else if (a2 == 3) {
            this.e.a((tqp) fqf.a(view, tqp.class), h2);
        }
        Object obj = this.h.get(i2);
        if (obj instanceof tuq) {
            tuq tuq = (tuq) obj;
            if (tuq.g) {
                uVar.o.setVisibility(0);
                uVar.o.setLayoutParams(new LayoutParams(-1, -2));
                this.m.a(tuq, uVar, i2);
                return;
            }
            uVar.o.setVisibility(8);
            uVar.o.setLayoutParams(new LayoutParams(0, 0));
        }
    }

    public final void b(u uVar) {
        int e2 = uVar.e();
        if (e2 >= 0) {
            Object obj = this.h.get(e2);
            if (obj instanceof tuq) {
                tuq tuq = (tuq) obj;
                if (tuq.g) {
                    this.m.a(tuq, uVar);
                }
            }
        }
    }

    public final int b() {
        return this.h.size();
    }

    public final int a(int i2) {
        Object obj = this.h.get(i2);
        if (obj instanceof tuq) {
            return this.m.a((tuq) obj);
        }
        return this.l.a((uys) obj);
    }

    private int h(int i2) {
        return i2 - c().a().size();
    }

    public final uys f(int i2) {
        return c().b()[i2];
    }

    public final uys[] a() {
        return c().b();
    }

    public final void a(String str, boolean z) {
        this.f.a(str, z);
        e();
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                super.a(recyclerView, i);
                if (i == 0) {
                    tuu.this.a.c(tud.c);
                } else {
                    tuu.this.a.b((Object) tud.c);
                }
            }
        });
    }

    public final boolean g(int i2) {
        List<Object> list = this.h;
        if ((list != null && i2 >= list.size()) || i2 < 0) {
            return false;
        }
        Object obj = this.h.get(i2);
        if (obj instanceof tuq) {
            return ((tuq) obj).a();
        }
        return false;
    }

    public final int a(String str) {
        uys[] b = c().b();
        for (int i2 = 0; i2 < b.length; i2++) {
            if (b[i2].getUri().equals(str)) {
                return i2 + c().a().size();
            }
        }
        return -1;
    }
}
