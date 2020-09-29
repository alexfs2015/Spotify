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

/* renamed from: ugx reason: default package */
public final class ugx extends androidx.recyclerview.widget.RecyclerView.a<u> implements gkv, ugf, wix {
    final Picasso a;
    public final uii d;
    public final uic e;
    public ugu f;
    public List<Object> g = new ArrayList();
    private final ufp h;
    private final ufn i;
    private final ugl j;
    private final ugi k;
    private final ugq l;
    private final ugz m;
    private final uif n;
    private final fej o = Hashing.b();

    /* renamed from: ugx$a */
    public static class a extends u {
        public a(View view) {
            super(view);
        }
    }

    public ugx(Picasso picasso, uii uii, uic uic, ufp ufp, ufn ufn, ugl ugl, ugi ugi, ugq ugq, ugz ugz, uif uif) {
        this.a = picasso;
        this.d = uii;
        this.e = uic;
        this.h = ufp;
        this.i = ufn;
        this.j = ugl;
        this.k = ugi;
        this.l = ugq;
        this.m = ugz;
        this.n = uif;
        this.d.b(true);
        a(true);
    }

    private ugu c() {
        ugu ugu = this.f;
        return ugu != null ? ugu : new ugu();
    }

    private int h(int i2) {
        return i2 - c().a().size();
    }

    public final int a(int i2) {
        Object obj = this.g.get(i2);
        return obj instanceof ugt ? this.l.a((ugt) obj) : this.k.a((vkv) obj);
    }

    public final int a(String str) {
        vkv[] b = c().b();
        for (int i2 = 0; i2 < b.length; i2++) {
            if (b[i2].getUri().equals(str)) {
                return i2 + c().a().size();
            }
        }
        return -1;
    }

    public final u a(ViewGroup viewGroup, int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? this.l.a(viewGroup, i2) : new a(this.j.c(viewGroup).getView()) : new a(this.j.b(viewGroup).getView()) : new a(this.j.a(viewGroup).getView());
    }

    public final void a(u uVar, int i2) {
        int a2 = a(i2);
        View view = uVar.o;
        int h2 = h(i2);
        if (a2 == 1) {
            this.d.a((ucv) fqz.a(view, ucv.class), h2);
        } else if (a2 == 2) {
            vkv f2 = f(h2);
            if (f2 != null) {
                ufn.a(view).a(this.h.a(f2.getHeader()));
            }
        } else if (a2 == 3) {
            this.e.a((ucs) fqz.a(view, ucs.class), h2);
        }
        Object obj = this.g.get(i2);
        if (obj instanceof ugt) {
            ugt ugt = (ugt) obj;
            if (ugt.g) {
                uVar.o.setVisibility(0);
                uVar.o.setLayoutParams(new LayoutParams(-1, -2));
                this.l.a(ugt, uVar, i2);
                return;
            }
            uVar.o.setVisibility(8);
            uVar.o.setLayoutParams(new LayoutParams(0, 0));
        }
    }

    public final void a(RecyclerView recyclerView) {
        super.a(recyclerView);
        recyclerView.a((m) new m() {
            public final void a(RecyclerView recyclerView, int i) {
                super.a(recyclerView, i);
                if (i == 0) {
                    ugx.this.a.c(ugg.c);
                } else {
                    ugx.this.a.b((Object) ugg.c);
                }
            }
        });
    }

    public final void a(String str, int i2) {
        int a2 = a(str);
        if (a2 >= 0) {
            this.n.a(i2);
            d_(a2);
        }
    }

    public final void a(String str, boolean z) {
        this.n.a(str, z);
        e();
    }

    public final void a(ugu ugu) {
        ArrayList arrayList = new ArrayList(ugu.d());
        arrayList.addAll(ugu.a());
        arrayList.addAll(Arrays.asList(ugu.b()));
        arrayList.addAll(ugu.c());
        this.m.a(this.g, (List<Object>) arrayList);
        b a2 = oa.a(this.m);
        this.f = ugu;
        this.g = arrayList;
        a2.a((androidx.recyclerview.widget.RecyclerView.a) this);
    }

    public final vkv[] a() {
        return c().b();
    }

    public final int b() {
        return this.g.size();
    }

    public final long b(int i2) {
        Object obj = this.g.get(i2);
        if (!(obj instanceof vkv)) {
            return this.o.a().a(obj.getClass().getCanonicalName(), fbi.c).a().c();
        }
        return this.o.a().a(f(h(i2)).getUri(), fbi.c).a().c();
    }

    public final void b(u uVar) {
        int e2 = uVar.e();
        if (e2 >= 0) {
            Object obj = this.g.get(e2);
            if (obj instanceof ugt) {
                ugt ugt = (ugt) obj;
                if (ugt.g) {
                    this.l.a(ugt, uVar);
                }
            }
        }
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

    public final vkv f(int i2) {
        return c().b()[i2];
    }

    public final boolean g(int i2) {
        List<Object> list = this.g;
        if ((list != null && i2 >= list.size()) || i2 < 0) {
            return false;
        }
        Object obj = this.g.get(i2);
        if (obj instanceof ugt) {
            return ((ugt) obj).a();
        }
        return false;
    }
}
