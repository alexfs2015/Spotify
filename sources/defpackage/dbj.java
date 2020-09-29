package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dbj reason: default package */
final class dbj {
    final ConcurrentHashMap<dbk, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    dbj() {
    }
}
