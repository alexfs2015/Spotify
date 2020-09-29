package defpackage;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fgb reason: default package */
public final class fgb extends ffx {
    private final List<ffs<?>> a;
    private final Map<Class<?>, fgf<?>> b = new HashMap();
    private final fgd c;

    public fgb(Executor executor, Iterable<ffv> iterable, ffs<?>... ffsArr) {
        this.c = new fgd(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ffs.a(this.c, fgd.class, fgl.class, fgk.class));
        for (ffv components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, ffsArr);
        this.a = Collections.unmodifiableList(AnonymousClass1.b(arrayList));
        for (ffs a2 : this.a) {
            a(a2);
        }
        a();
    }

    private void a() {
        for (ffs ffs : this.a) {
            Iterator it = ffs.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    ffw ffw = (ffw) it.next();
                    if ((ffw.b == 1) && !this.b.containsKey(ffw.a)) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{ffs, ffw.a}));
                    }
                }
            }
        }
    }

    private <T> void a(ffs<T> ffs) {
        fgf fgf = new fgf(ffs.c, new fgh(ffs, this));
        for (Class put : ffs.a) {
            this.b.put(put, fgf);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    public final void a(boolean z) {
        for (ffs ffs : this.a) {
            if (ffs.a() || (ffs.b() && z)) {
                super.a((Class) ffs.a.iterator().next());
            }
        }
        this.c.a();
    }

    public final <T> fin<T> b(Class<T> cls) {
        bxo.a(cls, (Object) "Null interface requested.");
        return (fin) this.b.get(cls);
    }
}
