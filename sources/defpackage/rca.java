package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import defpackage.rca.a;
import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: rca reason: default package */
public class rca<T extends Enum<T>, D extends a<T>> extends androidx.recyclerview.widget.RecyclerView.a<fra<fqy>> implements gkw {
    public b<T, D> a;
    public int d;
    private final ArrayList<f<T, D>> e = Lists.a();
    private final ArrayList<f<T, D>> f = Lists.a();

    /* renamed from: rca$a */
    public interface a<T extends Enum<T>> {
        T a();

        long b();
    }

    /* renamed from: rca$b */
    public interface b<T extends Enum<T>, D extends a<T>> {
        int a();

        D a(int i);
    }

    /* renamed from: rca$c */
    public static abstract class c<T extends Enum<T>, D extends a<T>> {
        public static <T extends Enum<T>, D extends a<T>> c<T, D> a(ImmutableSet<T> immutableSet, e eVar, d<T, D> dVar) {
            return new rbu(immutableSet, eVar, dVar);
        }

        public abstract ImmutableSet<T> a();

        public abstract e b();

        public abstract d<T, D> c();
    }

    /* renamed from: rca$d */
    public interface d<T extends Enum<T>, D extends a<T>> {
        void bind(fqy fqy, D d, int i);
    }

    /* renamed from: rca$e */
    public interface e {
        fqy create(ViewGroup viewGroup);
    }

    /* renamed from: rca$f */
    static class f<T extends Enum<T>, D extends a<T>> {
        public final c<T, D> a;
        public final int b;

        public f(c<T, D> cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    /* renamed from: rca$g */
    public interface g<T extends Enum<T>, D extends a<T>> {
        ImmutableList<c<T, D>> a();
    }

    public rca() {
        a(true);
    }

    private f<T, D> a(T t) {
        int ordinal = t.ordinal();
        String str = "Type (%s) not supported";
        fbp.a(ordinal, this.e.size(), String.format(str, new Object[]{t}));
        return (f) fbp.a(this.e.get(ordinal), (Object) String.format(str, new Object[]{t}));
    }

    private void a(T t, f<T, D> fVar) {
        int ordinal = t.ordinal();
        int size = this.e.size();
        if (ordinal >= size) {
            this.e.addAll(Collections.nCopies(((ordinal + 1) << 1) - size, null));
        }
        this.e.set(ordinal, fVar);
    }

    private D f(int i) {
        return ((b) fbp.a(this.a)).a(i);
    }

    public final int a(int i) {
        return a((T) f(i).a()).b;
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        fbp.a(i, this.f.size(), "Bad view type");
        return fra.a(((f) this.f.get(i)).a.b().create(viewGroup));
    }

    public final /* synthetic */ void a(u uVar, int i) {
        fra fra = (fra) uVar;
        a f2 = f(i);
        d c2 = a((T) f2.a()).a.c();
        if (c2 != null) {
            a(c2, fra.a, f2, i);
        }
    }

    /* access modifiers changed from: protected */
    public void a(d<T, D> dVar, fqy fqy, D d2, int i) {
        dVar.bind(fqy, d2, i);
    }

    public final void a(g<T, D> gVar) {
        fdz R_ = gVar.a().R_();
        while (R_.hasNext()) {
            c cVar = (c) R_.next();
            f fVar = new f(cVar, this.f.size());
            this.f.add(fVar);
            fdz R_2 = cVar.a().iterator();
            while (R_2.hasNext()) {
                a((T) (Enum) R_2.next(), fVar);
            }
        }
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
}
