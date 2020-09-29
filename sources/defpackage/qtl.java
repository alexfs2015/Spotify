package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import defpackage.qtl.a;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: qtl reason: default package */
public class qtl<T extends Enum<T>, D extends a<T>> extends androidx.recyclerview.widget.RecyclerView.a<fqg<fqe>> implements gjl {
    public b<T, D> a;
    public int d;
    private final ArrayList<f<T, D>> e = Lists.a();
    private final ArrayList<f<T, D>> f = Lists.a();

    /* renamed from: qtl$a */
    public interface a<T extends Enum<T>> {
        T a();

        long b();
    }

    /* renamed from: qtl$b */
    public interface b<T extends Enum<T>, D extends a<T>> {
        int a();

        D a(int i);
    }

    /* renamed from: qtl$c */
    public static abstract class c<T extends Enum<T>, D extends a<T>> {
        public abstract ImmutableSet<T> a();

        public abstract e b();

        public abstract d<T, D> c();

        public static <T extends Enum<T>, D extends a<T>> c<T, D> a(ImmutableSet<T> immutableSet, e eVar, d<T, D> dVar) {
            return new qtf(immutableSet, eVar, dVar);
        }
    }

    /* renamed from: qtl$d */
    public interface d<T extends Enum<T>, D extends a<T>> {
        void bind(fqe fqe, D d, int i);
    }

    /* renamed from: qtl$e */
    public interface e {
        fqe create(ViewGroup viewGroup);
    }

    /* renamed from: qtl$f */
    static class f<T extends Enum<T>, D extends a<T>> {
        public final c<T, D> a;
        public final int b;

        public f(c<T, D> cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    /* renamed from: qtl$g */
    public interface g<T extends Enum<T>, D extends a<T>> {
        ImmutableList<c<T, D>> a();
    }

    public final /* synthetic */ void a(u uVar, int i) {
        fqg fqg = (fqg) uVar;
        a f2 = f(i);
        d c2 = a((T) f2.a()).a.c();
        if (c2 != null) {
            a(c2, fqg.a, f2, i);
        }
    }

    public qtl() {
        a(true);
    }

    public final void a(g<T, D> gVar) {
        fdh R_ = gVar.a().R_();
        while (R_.hasNext()) {
            c cVar = (c) R_.next();
            f fVar = new f(cVar, this.f.size());
            this.f.add(fVar);
            fdh R_2 = cVar.a().iterator();
            while (R_2.hasNext()) {
                a((T) (Enum) R_2.next(), fVar);
            }
        }
    }

    public final int a(int i) {
        return a((T) f(i).a()).b;
    }

    public final int b() {
        b<T, D> bVar = this.a;
        if (bVar != null) {
            return bVar.a();
        }
        return 0;
    }

    public final long b(int i) {
        long b2 = f(i).b();
        return b2 == 0 ? (((long) this.d) << 32) | ((long) i) : b2;
    }

    /* access modifiers changed from: protected */
    public void a(d<T, D> dVar, fqe fqe, D d2, int i) {
        dVar.bind(fqe, d2, i);
    }

    private D f(int i) {
        return ((b) fay.a(this.a)).a(i);
    }

    private void a(T t, f<T, D> fVar) {
        int ordinal = t.ordinal();
        int size = this.e.size();
        if (ordinal >= size) {
            this.e.addAll(Collections.nCopies(((ordinal + 1) << 1) - size, null));
        }
        this.e.set(ordinal, fVar);
    }

    private f<T, D> a(T t) {
        int ordinal = t.ordinal();
        String str = "Type (%s) not supported";
        fay.a(ordinal, this.e.size(), String.format(str, new Object[]{t}));
        return (f) fay.a(this.e.get(ordinal), (Object) String.format(str, new Object[]{t}));
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fay.a(i, this.f.size(), "Bad view type");
        return fqg.a(((f) this.f.get(i)).a.b().create(viewGroup));
    }
}
