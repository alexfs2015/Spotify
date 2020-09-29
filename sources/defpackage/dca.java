package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dca reason: default package */
final class dca {
    final ConcurrentHashMap<dcb, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    dca() {
    }
}
