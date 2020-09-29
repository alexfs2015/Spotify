package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ResourceLeakDetector<T> {
    private static final Level a = Level.SIMPLE;
    /* access modifiers changed from: private */
    public static final int b;
    private static Level c;
    private static final wjw d = wjx.a(ResourceLeakDetector.class);
    private static final String[] p = {"io.netty.util.ReferenceCountUtil.touch(", "io.netty.buffer.AdvancedLeakAwareByteBuf.touch(", "io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer(", "io.netty.buffer.AdvancedLeakAwareByteBuf.recordLeakNonRefCountingOperation("};
    /* access modifiers changed from: private */
    public final a e;
    private final a f;
    /* access modifiers changed from: private */
    public final ReferenceQueue<Object> g;
    private final ConcurrentMap<String, Boolean> h;
    private final String i;
    private final int j;
    private final int k;
    private final long l;
    /* access modifiers changed from: private */
    public long m;
    private final AtomicBoolean n;
    private long o;

    public enum Level {
        DISABLED,
        SIMPLE,
        ADVANCED,
        PARANOID
    }

    final class a extends PhantomReference<Object> implements whj {
        private final String a;
        private final Deque<String> b;
        private final AtomicBoolean c;
        /* access modifiers changed from: private */
        public a d;
        /* access modifiers changed from: private */
        public a e;
        private int f;

        a(Object obj) {
            ReferenceQueue referenceQueue;
            if (obj != null) {
                referenceQueue = ResourceLeakDetector.this.g;
            } else {
                referenceQueue = null;
            }
            super(obj, referenceQueue);
            this.b = new ArrayDeque();
            if (obj != null) {
                if (ResourceLeakDetector.b().ordinal() >= Level.ADVANCED.ordinal()) {
                    this.a = ResourceLeakDetector.a((Object) null, 3);
                } else {
                    this.a = null;
                }
                synchronized (ResourceLeakDetector.this.e) {
                    this.d = ResourceLeakDetector.this.e;
                    this.e = ResourceLeakDetector.this.e.e;
                    ResourceLeakDetector.this.e.e.d = this;
                    ResourceLeakDetector.this.e.e = this;
                    ResourceLeakDetector.this.m = 1 + ResourceLeakDetector.this.m;
                }
                this.c = new AtomicBoolean();
                return;
            }
            this.a = null;
            this.c = new AtomicBoolean(true);
        }

        public final void a() {
            a((Object) null, 3);
        }

        public final void a(Object obj) {
            a(obj, 3);
        }

        private void a(Object obj, int i) {
            if (this.a != null) {
                String a2 = ResourceLeakDetector.a(obj, 3);
                synchronized (this.b) {
                    int size = this.b.size();
                    if (size == 0 || !((String) this.b.getLast()).equals(a2)) {
                        this.b.add(a2);
                    }
                    if (size > ResourceLeakDetector.b) {
                        this.b.removeFirst();
                        this.f++;
                    }
                }
            }
        }

        public final boolean b() {
            if (!this.c.compareAndSet(false, true)) {
                return false;
            }
            synchronized (ResourceLeakDetector.this.e) {
                ResourceLeakDetector.this.m = ResourceLeakDetector.this.m - 1;
                this.d.e = this.e;
                this.e.d = this.d;
                this.d = null;
                this.e = null;
            }
            return true;
        }

        public final String toString() {
            Object[] array;
            int i;
            if (this.a == null) {
                return "";
            }
            synchronized (this.b) {
                array = this.b.toArray();
                i = this.f;
            }
            StringBuilder sb = new StringBuilder(16384);
            sb.append(wjn.a);
            if (i > 0) {
                sb.append("WARNING: ");
                sb.append(i);
                sb.append(" leak records were discarded because the leak record count is limited to ");
                sb.append(ResourceLeakDetector.b);
                sb.append(". Use system property io.netty.leakDetection.maxRecords");
                sb.append(" to increase the limit.");
                sb.append(wjn.a);
            }
            sb.append("Recent access records: ");
            sb.append(array.length);
            sb.append(wjn.a);
            if (array.length > 0) {
                for (int length = array.length - 1; length >= 0; length--) {
                    sb.append('#');
                    sb.append(length + 1);
                    sb.append(':');
                    sb.append(wjn.a);
                    sb.append(array[length]);
                }
            }
            sb.append("Created at:");
            sb.append(wjn.a);
            sb.append(this.a);
            sb.setLength(sb.length() - wjn.a.length());
            return sb.toString();
        }
    }

    static {
        boolean z;
        String str = "io.netty.noResourceLeakDetection";
        String str2 = "io.netty.leakDetection.level";
        if (wjo.b(str) != null) {
            z = wjo.a(str, false);
            d.b("-Dio.netty.noResourceLeakDetection: {}", (Object) Boolean.valueOf(z));
            d.c("-Dio.netty.noResourceLeakDetection is deprecated. Use '-D{}={}' instead.", str2, a.name().toLowerCase());
        } else {
            z = false;
        }
        String upperCase = wjo.a(str2, wjo.a("io.netty.leakDetectionLevel", (z ? Level.DISABLED : a).name()).trim().toUpperCase()).trim().toUpperCase();
        Level level = a;
        Iterator it = EnumSet.allOf(Level.class).iterator();
        while (it.hasNext()) {
            Level level2 = (Level) it.next();
            if (upperCase.equals(level2.name()) || upperCase.equals(String.valueOf(level2.ordinal()))) {
                level = level2;
            }
        }
        String str3 = "io.netty.leakDetection.maxRecords";
        b = wjo.a(str3, 4);
        c = level;
        if (d.b()) {
            String str4 = "-D{}: {}";
            d.b(str4, str2, level.name().toLowerCase());
            d.b(str4, str3, Integer.valueOf(b));
        }
    }

    public static Level b() {
        return c;
    }

    public ResourceLeakDetector(Class<?> cls, int i2, long j2) {
        this(wjn.a(cls), i2, j2);
    }

    @Deprecated
    private ResourceLeakDetector(String str, int i2, long j2) {
        this.e = new a<>(null);
        this.f = new a<>(null);
        this.g = new ReferenceQueue<>();
        this.h = PlatformDependent.j();
        this.n = new AtomicBoolean();
        if (str == null) {
            throw new NullPointerException("resourceType");
        } else if (j2 > 0) {
            this.i = str;
            this.j = wjg.b(i2);
            this.k = this.j - 1;
            this.l = j2;
            this.e.e = this.f;
            this.f.d = this.e;
        } else {
            StringBuilder sb = new StringBuilder("maxActive: ");
            sb.append(j2);
            sb.append(" (expected: 1+)");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final whj a(T t) {
        Level level = c;
        if (level == Level.DISABLED) {
            return null;
        }
        if (level.ordinal() < Level.PARANOID.ordinal()) {
            long j2 = this.o + 1;
            this.o = j2;
            if ((j2 & ((long) this.k)) != 0) {
                return null;
            }
            a(level);
            return new a(t);
        }
        a(level);
        return new a(t);
    }

    private void a(Level level) {
        if (!d.e()) {
            while (true) {
                a aVar = (a) this.g.poll();
                if (aVar != null) {
                    aVar.b();
                } else {
                    return;
                }
            }
        } else {
            if (this.m * ((long) (level == Level.PARANOID ? 1 : this.j)) > this.l && this.n.compareAndSet(false, true)) {
                b(this.i);
            }
            while (true) {
                a aVar2 = (a) this.g.poll();
                if (aVar2 != null) {
                    aVar2.clear();
                    if (aVar2.b()) {
                        String aVar3 = aVar2.toString();
                        if (this.h.putIfAbsent(aVar3, Boolean.TRUE) == null) {
                            if (aVar3.isEmpty()) {
                                a(this.i);
                            } else {
                                a(this.i, aVar3);
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static void a(String str, String str2) {
        d.d("LEAK: {}.release() was not called before it's garbage-collected. See http://netty.io/wiki/reference-counted-objects.html for more information.{}", str, str2);
    }

    private void a(String str) {
        d.c("LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel() See http://netty.io/wiki/reference-counted-objects.html for more information.", str, "io.netty.leakDetection.level", Level.ADVANCED.name().toLowerCase(), wjn.a((Object) this));
    }

    private static void b(String str) {
        wjw wjw = d;
        StringBuilder sb = new StringBuilder("LEAK: You are creating too many ");
        sb.append(str);
        sb.append(" instances.  ");
        sb.append(str);
        sb.append(" is a shared resource that must be reused across the JVM,so that only a few instances are created.");
        wjw.e(sb.toString());
    }

    static String a(Object obj, int i2) {
        StackTraceElement[] stackTrace;
        boolean z;
        StringBuilder sb = new StringBuilder(4096);
        if (obj != null) {
            sb.append("\tHint: ");
            if (obj instanceof whl) {
                sb.append(((whl) obj).s());
            } else {
                sb.append(obj);
            }
            sb.append(wjn.a);
        }
        int i3 = i2;
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            if (i3 > 0) {
                i3--;
            } else {
                String stackTraceElement2 = stackTraceElement.toString();
                String[] strArr = p;
                int i4 = 0;
                while (true) {
                    if (i4 >= 4) {
                        z = false;
                        break;
                    } else if (stackTraceElement2.startsWith(strArr[i4])) {
                        z = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z) {
                    sb.append(9);
                    sb.append(stackTraceElement2);
                    sb.append(wjn.a);
                }
            }
        }
        return sb.toString();
    }

    public static boolean a() {
        return c.ordinal() > Level.DISABLED.ordinal();
    }
}
