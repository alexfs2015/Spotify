package defpackage;

import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ffh reason: default package */
public final class ffh extends ffd {
    private final List<fey<?>> a;
    private final Map<Class<?>, ffl<?>> b = new HashMap();
    private final ffj c;

    public final /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    public ffh(Executor executor, Iterable<ffb> iterable, fey<?>... feyArr) {
        this.c = new ffj(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(fey.a(this.c, ffj.class, ffr.class, ffq.class));
        for (ffb components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        Collections.addAll(arrayList, feyArr);
        this.a = Collections.unmodifiableList(AnonymousClass1.b(arrayList));
        for (fey a2 : this.a) {
            a(a2);
        }
        a();
    }

    public final <T> fht<T> b(Class<T> cls) {
        bwx.a(cls, (Object) "Null interface requested.");
        return (fht) this.b.get(cls);
    }

    public final void a(boolean z) {
        for (fey fey : this.a) {
            if (fey.a() || (fey.b() && z)) {
                super.a((Class) fey.a.iterator().next());
            }
        }
        this.c.a();
    }

    private <T> void a(fey<T> fey) {
        ffl ffl = new ffl(fey.c, new ffn(fey, this));
        for (Class put : fey.a) {
            this.b.put(put, ffl);
        }
    }

    private void a() {
        for (fey fey : this.a) {
            Iterator it = fey.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    ffc ffc = (ffc) it.next();
                    if ((ffc.b == 1) && !this.b.containsKey(ffc.a)) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{fey, ffc.a}));
                    }
                }
            }
        }
    }
}
