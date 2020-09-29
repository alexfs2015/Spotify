package defpackage;

import java.io.PrintStream;
import java.util.Queue;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;

/* renamed from: wxs reason: default package */
public final class wxs implements wuk {
    public static final int b;
    public volatile Object a;
    private Queue<Object> c;
    private final int d;

    public final void unsubscribe() {
    }

    static {
        int i = wxr.a() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("Failed to set 'rx.buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
            }
        }
        b = i;
    }

    public static wxs a() {
        if (wzh.a()) {
            return new wxs(false, b);
        }
        return new wxs();
    }

    public static wxs b() {
        if (wzh.a()) {
            return new wxs(true, b);
        }
        return new wxs();
    }

    private wxs(Queue<Object> queue, int i) {
        this.c = queue;
        this.d = i;
    }

    private wxs(boolean z, int i) {
        this.c = z ? new wyl<>(i) : new wyt<>(i);
        this.d = i;
    }

    wxs() {
        this((Queue<Object>) new wxy<Object>(b), b);
    }

    public final void a(Object obj) {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.c;
            z = true;
            if (queue != null) {
                z2 = !queue.offer(NotificationLite.a(obj));
                z = false;
            } else {
                z2 = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    public final boolean c() {
        Queue<Object> queue = this.c;
        return queue == null || queue.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Queue<java.lang.Object> r0 = r4.c     // Catch:{ all -> 0x001d }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            return r1
        L_0x0008:
            java.lang.Object r2 = r0.poll()     // Catch:{ all -> 0x001d }
            java.lang.Object r3 = r4.a     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            r4.a = r1     // Catch:{ all -> 0x001d }
            r2 = r3
        L_0x001b:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            return r2
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxs.d():java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Queue<java.lang.Object> r0 = r3.c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r0
        L_0x0008:
            java.lang.Object r1 = r0.peek()     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r3.a     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            if (r2 == 0) goto L_0x0019
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1 = r2
        L_0x0019:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r1
        L_0x001b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxs.e():java.lang.Object");
    }

    public static boolean b(Object obj) {
        return NotificationLite.b(obj);
    }

    public static Object c(Object obj) {
        return NotificationLite.e(obj);
    }

    public final boolean isUnsubscribed() {
        return this.c == null;
    }
}
