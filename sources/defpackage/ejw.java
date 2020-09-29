package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ejw reason: default package */
final class ejw {
    private final ConcurrentHashMap<ejx, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    ejw() {
    }

    public final List<Throwable> a(Throwable th) {
        Reference poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        List<Throwable> list = (List) this.a.get(new ejx(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> list2 = (List) this.a.putIfAbsent(new ejx(th, this.b), vector);
        return list2 == null ? vector : list2;
    }
}
