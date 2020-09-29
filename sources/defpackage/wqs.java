package defpackage;

import io.netty.channel.ChannelException;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wqs reason: default package */
public final class wqs extends wqm {
    private static final wyc h = wyd.a(wqs.class);
    private static final boolean i = wxu.a("io.netty.noKeySetOptimization", false);
    private static final int j;
    Selector b;
    int c;
    boolean d;
    private final wvl k = new wvl() {
        public final int a() {
            return wqs.this.i();
        }
    };
    private final Callable<Integer> l = new Callable<Integer>() {
        public final /* synthetic */ Object call() {
            return Integer.valueOf(wqs.super.d());
        }
    };
    private wqv m;
    private final SelectorProvider n;
    private final AtomicBoolean o = new AtomicBoolean();
    private final wqj p;
    private volatile int q = 50;

    static {
        int i2 = 0;
        if (wxu.b("sun.nio.ch.bugLevel") == null) {
            try {
                AccessController.doPrivileged(new PrivilegedAction<Void>() {
                    public final /* synthetic */ Object run() {
                        System.setProperty("sun.nio.ch.bugLevel", "");
                        return null;
                    }
                });
            } catch (SecurityException e) {
                h.b("Unable to get/set System Property: sun.nio.ch.bugLevel", (Throwable) e);
            }
        }
        int a = wxu.a("io.netty.selectorAutoRebuildThreshold", 512);
        if (a >= 3) {
            i2 = a;
        }
        j = i2;
        if (h.b()) {
            h.b("-Dio.netty.noKeySetOptimization: {}", (Object) Boolean.valueOf(i));
            h.b("-Dio.netty.selectorAutoRebuildThreshold: {}", (Object) Integer.valueOf(j));
        }
    }

    wqs(wqt wqt, Executor executor, SelectorProvider selectorProvider, wqj wqj, www www) {
        super(wqt, executor, false, a, www);
        if (selectorProvider == null) {
            throw new NullPointerException("selectorProvider");
        } else if (wqj != null) {
            this.n = selectorProvider;
            this.b = w();
            this.p = wqj;
        } else {
            throw new NullPointerException("selectStrategy");
        }
    }

    private void a(SelectionKey selectionKey, wqr wqr) {
        b I = wqr.I();
        if (!selectionKey.isValid()) {
            try {
                wqs K = wqr.K();
                if (K == this && K != null) {
                    I.b(I.i());
                }
            } catch (Throwable unused) {
            }
            return;
        }
        try {
            int readyOps = selectionKey.readyOps();
            if ((readyOps & 8) != 0) {
                selectionKey.interestOps(selectionKey.interestOps() & -9);
                I.n();
            }
            if ((readyOps & 4) != 0) {
                wqr.I().o();
            }
            if ((readyOps & 17) != 0 || readyOps == 0) {
                I.l();
                if (!wqr.c.isOpen()) {
                }
            }
        } catch (CancelledKeyException unused2) {
            I.b(I.i());
        }
    }

    private static void a(SelectionKey selectionKey, wqu<SelectableChannel> wqu) {
        try {
            selectionKey.channel();
            if (!selectionKey.isValid()) {
                a(wqu, selectionKey, null);
            }
        } catch (Exception e) {
            selectionKey.cancel();
            a(wqu, selectionKey, e);
        } catch (Throwable th) {
            selectionKey.cancel();
            a(wqu, selectionKey, null);
            throw th;
        }
    }

    private void a(Set<SelectionKey> set) {
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                SelectionKey selectionKey = (SelectionKey) it.next();
                Object attachment = selectionKey.attachment();
                it.remove();
                if (attachment instanceof wqr) {
                    a(selectionKey, (wqr) attachment);
                } else {
                    a(selectionKey, (wqu) attachment);
                }
                if (!it.hasNext()) {
                    break;
                } else if (this.d) {
                    z();
                    Set selectedKeys = this.b.selectedKeys();
                    if (selectedKeys.isEmpty()) {
                        break;
                    }
                    it = selectedKeys.iterator();
                }
            }
        }
    }

    private static void a(wqu<SelectableChannel> wqu, SelectionKey selectionKey, Throwable th) {
        try {
            selectionKey.channel();
        } catch (Exception e) {
            h.d("Unexpected exception while running NioTask.channelUnregistered()", (Throwable) e);
        }
    }

    private void a(SelectionKey[] selectionKeyArr) {
        int i2 = 0;
        while (true) {
            SelectionKey selectionKey = selectionKeyArr[i2];
            if (selectionKey != null) {
                selectionKeyArr[i2] = null;
                Object attachment = selectionKey.attachment();
                if (attachment instanceof wqr) {
                    a(selectionKey, (wqr) attachment);
                } else {
                    a(selectionKey, (wqu) attachment);
                }
                if (this.d) {
                    while (true) {
                        i2++;
                        if (selectionKeyArr[i2] == null) {
                            break;
                        }
                        selectionKeyArr[i2] = null;
                    }
                    z();
                    selectionKeyArr = this.m.a();
                    i2 = -1;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private static void b(Throwable th) {
        h.d("Unexpected exception in the selector loop.", th);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException unused) {
        }
    }

    private Selector w() {
        try {
            final AbstractSelector openSelector = this.n.openSelector();
            if (i) {
                return openSelector;
            }
            final wqv wqv = new wqv();
            Object doPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public final Object run() {
                    try {
                        return Class.forName("sun.nio.ch.SelectorImpl", false, PlatformDependent.o());
                    } catch (ClassNotFoundException e) {
                        return e;
                    } catch (SecurityException e2) {
                        return e2;
                    }
                }
            });
            String str = "failed to instrument a special java.util.Set into: {}";
            if (doPrivileged instanceof Class) {
                final Class cls = (Class) doPrivileged;
                if (cls.isAssignableFrom(openSelector.getClass())) {
                    Object doPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() {
                        public final Object run() {
                            try {
                                Field declaredField = cls.getDeclaredField("selectedKeys");
                                Field declaredField2 = cls.getDeclaredField("publicSelectedKeys");
                                declaredField.setAccessible(true);
                                declaredField2.setAccessible(true);
                                declaredField.set(openSelector, wqv);
                                declaredField2.set(openSelector, wqv);
                                return null;
                            } catch (NoSuchFieldException e) {
                                return e;
                            } catch (IllegalAccessException e2) {
                                return e2;
                            } catch (RuntimeException e3) {
                                if ("java.lang.reflect.InaccessibleObjectException".equals(e3.getClass().getName())) {
                                    return e3;
                                }
                                throw e3;
                            }
                        }
                    });
                    if (doPrivileged2 instanceof Exception) {
                        this.m = null;
                        h.a(str, (Object) openSelector, (Object) (Exception) doPrivileged2);
                    } else {
                        this.m = wqv;
                        h.a("instrumented a special java.util.Set into: {}", (Object) openSelector);
                    }
                    return openSelector;
                }
            }
            if (doPrivileged instanceof Exception) {
                h.a(str, (Object) openSelector, (Object) (Exception) doPrivileged);
            }
            return openSelector;
        } catch (IOException e) {
            throw new ChannelException("failed to open a new selector", e);
        }
    }

    private void x() {
        wqv wqv = this.m;
        if (wqv != null) {
            a(wqv.a());
        } else {
            a(this.b.selectedKeys());
        }
    }

    private void y() {
        z();
        Set<SelectionKey> keys = this.b.keys();
        ArrayList<wqr> arrayList = new ArrayList<>(keys.size());
        for (SelectionKey selectionKey : keys) {
            Object attachment = selectionKey.attachment();
            if (attachment instanceof wqr) {
                arrayList.add((wqr) attachment);
            } else {
                selectionKey.cancel();
                a((wqu) attachment, selectionKey, null);
            }
        }
        for (wqr wqr : arrayList) {
            wqr.I().b(wqr.I().i());
        }
    }

    private void z() {
        this.d = false;
        try {
            this.b.selectNow();
        } catch (Throwable th) {
            h.d("Failed to update SelectionKeys.", th);
        }
    }

    public final Queue<Runnable> a(int i2) {
        return PlatformDependent.b(i2);
    }

    public final void a(boolean z) {
        if (!z && this.o.compareAndSet(false, true)) {
            this.b.wakeup();
        }
    }

    public final int d() {
        return a(Thread.currentThread()) ? super.d() : ((Integer) submit(this.l).aV_().d()).intValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b A[Catch:{ ConcurrentModificationException -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085 A[EDGE_INSN: B:43:0x0085->B:31:0x0085 ?: BREAK  , SYNTHETIC] */
    public final void e() {
        /*
            r9 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r9.a(r0)
            if (r0 != 0) goto L_0x0013
            wqs$6 r0 = new wqs$6
            r0.<init>()
            r9.execute(r0)
            return
        L_0x0013:
            java.nio.channels.Selector r0 = r9.b
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            java.nio.channels.Selector r1 = r9.w()     // Catch:{ Exception -> 0x00b4 }
            r2 = 0
        L_0x001d:
            java.util.Set r3 = r0.keys()     // Catch:{ ConcurrentModificationException -> 0x001d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ ConcurrentModificationException -> 0x001d }
        L_0x0025:
            boolean r4 = r3.hasNext()     // Catch:{ ConcurrentModificationException -> 0x001d }
            if (r4 == 0) goto L_0x0085     // Catch:{ ConcurrentModificationException -> 0x001d }
            java.lang.Object r4 = r3.next()     // Catch:{ ConcurrentModificationException -> 0x001d }
            java.nio.channels.SelectionKey r4 = (java.nio.channels.SelectionKey) r4     // Catch:{ ConcurrentModificationException -> 0x001d }
            java.lang.Object r5 = r4.attachment()     // Catch:{ ConcurrentModificationException -> 0x001d }
            boolean r6 = r4.isValid()     // Catch:{ Exception -> 0x0061 }
            if (r6 == 0) goto L_0x0025     // Catch:{ Exception -> 0x0061 }
            java.nio.channels.SelectableChannel r6 = r4.channel()     // Catch:{ Exception -> 0x0061 }
            java.nio.channels.SelectionKey r6 = r6.keyFor(r1)     // Catch:{ Exception -> 0x0061 }
            if (r6 == 0) goto L_0x0046     // Catch:{ Exception -> 0x0061 }
            goto L_0x0025     // Catch:{ Exception -> 0x0061 }
        L_0x0046:
            int r6 = r4.interestOps()     // Catch:{ Exception -> 0x0061 }
            r4.cancel()     // Catch:{ Exception -> 0x0061 }
            java.nio.channels.SelectableChannel r7 = r4.channel()     // Catch:{ Exception -> 0x0061 }
            java.nio.channels.SelectionKey r6 = r7.register(r1, r6, r5)     // Catch:{ Exception -> 0x0061 }
            boolean r7 = r5 instanceof defpackage.wqr     // Catch:{ Exception -> 0x0061 }
            if (r7 == 0) goto L_0x005e     // Catch:{ Exception -> 0x0061 }
            r7 = r5     // Catch:{ Exception -> 0x0061 }
            wqr r7 = (defpackage.wqr) r7     // Catch:{ Exception -> 0x0061 }
            r7.e = r6     // Catch:{ Exception -> 0x0061 }
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0061:
            r6 = move-exception
            wyc r7 = h     // Catch:{ ConcurrentModificationException -> 0x001d }
            java.lang.String r8 = "Failed to re-register a Channel to the new Selector."     // Catch:{ ConcurrentModificationException -> 0x001d }
            r7.d(r8, r6)     // Catch:{ ConcurrentModificationException -> 0x001d }
            boolean r7 = r5 instanceof defpackage.wqr     // Catch:{ ConcurrentModificationException -> 0x001d }
            if (r7 == 0) goto L_0x007f     // Catch:{ ConcurrentModificationException -> 0x001d }
            wqr r5 = (defpackage.wqr) r5     // Catch:{ ConcurrentModificationException -> 0x001d }
            wqr$b r4 = r5.I()     // Catch:{ ConcurrentModificationException -> 0x001d }
            wqr$b r5 = r5.I()     // Catch:{ ConcurrentModificationException -> 0x001d }
            wpo r5 = r5.i()     // Catch:{ ConcurrentModificationException -> 0x001d }
            r4.b(r5)     // Catch:{ ConcurrentModificationException -> 0x001d }
            goto L_0x0025     // Catch:{ ConcurrentModificationException -> 0x001d }
        L_0x007f:
            wqu r5 = (defpackage.wqu) r5     // Catch:{ ConcurrentModificationException -> 0x001d }
            a(r5, r4, r6)     // Catch:{ ConcurrentModificationException -> 0x001d }
            goto L_0x0025
        L_0x0085:
            r9.b = r1
            r0.close()     // Catch:{ all -> 0x008b }
            goto L_0x009b
        L_0x008b:
            r0 = move-exception
            wyc r1 = h
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x009b
            wyc r1 = h
            java.lang.String r3 = "Failed to close the old Selector."
            r1.d(r3, r0)
        L_0x009b:
            wyc r0 = h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Migrated "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " channel(s) to the new Selector."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.c(r1)
            return
        L_0x00b4:
            r0 = move-exception
            wyc r1 = h
            java.lang.String r2 = "Failed to create a new Selector."
            r1.d(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqs.e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160 A[Catch:{ all -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0002 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r16 = this;
            r1 = r16
        L_0x0002:
            wqj r0 = r1.p     // Catch:{ all -> 0x0156 }
            wvl r2 = r1.k     // Catch:{ all -> 0x0156 }
            boolean r3 = r16.c()     // Catch:{ all -> 0x0156 }
            int r0 = r0.a(r2, r3)     // Catch:{ all -> 0x0156 }
            r2 = -2
            if (r0 == r2) goto L_0x0002
            r2 = -1
            r3 = 0
            if (r0 == r2) goto L_0x0017
            goto L_0x0118
        L_0x0017:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o     // Catch:{ all -> 0x0156 }
            boolean r0 = r0.getAndSet(r3)     // Catch:{ all -> 0x0156 }
            java.nio.channels.Selector r2 = r1.b     // Catch:{ all -> 0x0156 }
            long r4 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x00e6 }
            wwz r6 = r16.o()     // Catch:{ CancelledKeyException -> 0x00e6 }
            r7 = 0
            if (r6 != 0) goto L_0x002e
            long r9 = defpackage.wxa.g     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x0039
        L_0x002e:
            long r9 = r6.c     // Catch:{ CancelledKeyException -> 0x00e6 }
            long r11 = defpackage.wwz.b     // Catch:{ CancelledKeyException -> 0x00e6 }
            long r11 = r4 - r11
            long r9 = r9 - r11
            long r9 = java.lang.Math.max(r7, r9)     // Catch:{ CancelledKeyException -> 0x00e6 }
        L_0x0039:
            long r9 = r9 + r4
            r6 = 0
        L_0x003b:
            long r11 = r9 - r4
            r13 = 500000(0x7a120, double:2.47033E-318)
            long r11 = r11 + r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 / r13
            r13 = 1
            int r14 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r14 > 0) goto L_0x0054
            if (r6 != 0) goto L_0x0051
            r2.selectNow()     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x00cd
        L_0x0051:
            r13 = r6
            goto L_0x00cd
        L_0x0054:
            boolean r14 = r16.c()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 == 0) goto L_0x0066
            java.util.concurrent.atomic.AtomicBoolean r14 = r1.o     // Catch:{ CancelledKeyException -> 0x00e6 }
            boolean r14 = r14.compareAndSet(r3, r13)     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 == 0) goto L_0x0066
            r2.selectNow()     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x00cd
        L_0x0066:
            int r14 = r2.select(r11)     // Catch:{ CancelledKeyException -> 0x00e6 }
            int r6 = r6 + 1
            if (r14 != 0) goto L_0x0051
            if (r0 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicBoolean r14 = r1.o     // Catch:{ CancelledKeyException -> 0x00e6 }
            boolean r14 = r14.get()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 != 0) goto L_0x0051
            boolean r14 = r16.c()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 != 0) goto L_0x0051
            boolean r14 = r16.p()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 != 0) goto L_0x0051
            boolean r14 = java.lang.Thread.interrupted()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r14 == 0) goto L_0x009a
            wyc r0 = h     // Catch:{ CancelledKeyException -> 0x00e6 }
            boolean r0 = r0.b()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r0 == 0) goto L_0x00cd
            wyc r0 = h     // Catch:{ CancelledKeyException -> 0x00e6 }
            java.lang.String r4 = "Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop."
            r0.b(r4)     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x00cd
        L_0x009a:
            long r14 = java.lang.System.nanoTime()     // Catch:{ CancelledKeyException -> 0x00e6 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancelledKeyException -> 0x00e6 }
            long r7 = r7.toNanos(r11)     // Catch:{ CancelledKeyException -> 0x00e6 }
            long r7 = r14 - r7
            int r11 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x00ac
            r6 = 1
            goto L_0x00c8
        L_0x00ac:
            int r4 = j     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r4 <= 0) goto L_0x00c8
            int r4 = j     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r6 < r4) goto L_0x00c8
            wyc r0 = h     // Catch:{ CancelledKeyException -> 0x00e6 }
            java.lang.String r4 = "Selector.select() returned prematurely {} times in a row; rebuilding Selector {}."
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ CancelledKeyException -> 0x00e6 }
            r0.c(r4, r5, r2)     // Catch:{ CancelledKeyException -> 0x00e6 }
            r16.e()     // Catch:{ CancelledKeyException -> 0x00e6 }
            java.nio.channels.Selector r2 = r1.b     // Catch:{ CancelledKeyException -> 0x00e6 }
            r2.selectNow()     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x00cd
        L_0x00c8:
            r4 = r14
            r7 = 0
            goto L_0x003b
        L_0x00cd:
            r0 = 3
            if (r13 <= r0) goto L_0x010b
            wyc r0 = h     // Catch:{ CancelledKeyException -> 0x00e6 }
            boolean r0 = r0.b()     // Catch:{ CancelledKeyException -> 0x00e6 }
            if (r0 == 0) goto L_0x010b
            wyc r0 = h     // Catch:{ CancelledKeyException -> 0x00e6 }
            java.lang.String r4 = "Selector.select() returned prematurely {} times in a row for Selector {}."
            int r13 = r13 + -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ CancelledKeyException -> 0x00e6 }
            r0.b(r4, r5, r2)     // Catch:{ CancelledKeyException -> 0x00e6 }
            goto L_0x010b
        L_0x00e6:
            r0 = move-exception
            wyc r4 = h     // Catch:{ all -> 0x0156 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x0156 }
            if (r4 == 0) goto L_0x010b
            wyc r4 = h     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r5.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.Class<java.nio.channels.CancelledKeyException> r6 = java.nio.channels.CancelledKeyException.class
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x0156 }
            r5.append(r6)     // Catch:{ all -> 0x0156 }
            java.lang.String r6 = " raised by a Selector {} - JDK bug?"
            r5.append(r6)     // Catch:{ all -> 0x0156 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0156 }
            r4.b(r5, r2, r0)     // Catch:{ all -> 0x0156 }
        L_0x010b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o     // Catch:{ all -> 0x0156 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0118
            java.nio.channels.Selector r0 = r1.b     // Catch:{ all -> 0x0156 }
            r0.wakeup()     // Catch:{ all -> 0x0156 }
        L_0x0118:
            r1.c = r3     // Catch:{ all -> 0x0156 }
            r1.d = r3     // Catch:{ all -> 0x0156 }
            int r2 = r1.q     // Catch:{ all -> 0x0156 }
            r3 = 100
            if (r2 != r3) goto L_0x012f
            r16.x()     // Catch:{ all -> 0x0129 }
            r16.s()     // Catch:{ all -> 0x0156 }
            goto L_0x015a
        L_0x0129:
            r0 = move-exception
            r2 = r0
            r16.s()     // Catch:{ all -> 0x0156 }
            throw r2     // Catch:{ all -> 0x0156 }
        L_0x012f:
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0156 }
            r16.x()     // Catch:{ all -> 0x0145 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0156 }
            long r6 = r6 - r4
            int r3 = r3 - r2
            long r3 = (long) r3     // Catch:{ all -> 0x0156 }
            long r6 = r6 * r3
            long r2 = (long) r2     // Catch:{ all -> 0x0156 }
            long r6 = r6 / r2
            r1.b(r6)     // Catch:{ all -> 0x0156 }
            goto L_0x015a
        L_0x0145:
            r0 = move-exception
            r6 = r0
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0156 }
            long r7 = r7 - r4
            int r3 = r3 - r2
            long r3 = (long) r3     // Catch:{ all -> 0x0156 }
            long r7 = r7 * r3
            long r2 = (long) r2     // Catch:{ all -> 0x0156 }
            long r7 = r7 / r2
            r1.b(r7)     // Catch:{ all -> 0x0156 }
            throw r6     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            b(r0)
        L_0x015a:
            boolean r0 = r16.q()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0002
            r16.y()     // Catch:{ all -> 0x016a }
            boolean r0 = r16.t()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x0002
            return
        L_0x016a:
            r0 = move-exception
            b(r0)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqs.f():void");
    }

    public final void g() {
        try {
            this.b.close();
        } catch (IOException e) {
            h.d("Failed to close a selector.", (Throwable) e);
        }
    }

    public final Runnable h() {
        Runnable h2 = super.h();
        if (this.d) {
            z();
        }
        return h2;
    }

    /* access modifiers changed from: 0000 */
    public final int i() {
        try {
            return this.b.selectNow();
        } finally {
            if (this.o.get()) {
                this.b.wakeup();
            }
        }
    }
}
