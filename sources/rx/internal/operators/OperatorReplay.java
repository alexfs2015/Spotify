package rx.internal.operators;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class OperatorReplay<T> extends xno<T> implements xip {
    private static xix d = new xix() {
        public final Object call() {
            return new UnboundedReplayBuffer(16);
        }
    };
    private xii<? extends T> a;
    private AtomicReference<b<T>> b;
    private xix<? extends a<T>> c;

    static class BoundedReplayBuffer<T> extends AtomicReference<Node> implements a<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long index;
        int size;
        Node tail;

        public BoundedReplayBuffer() {
            Node node = new Node(null, 0);
            this.tail = node;
            set(node);
        }

        private void a(Node node) {
            this.tail.set(node);
            this.tail = node;
            this.size++;
        }

        public final void a() {
            Object a = NotificationLite.a();
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
        }

        public final void a(T t) {
            Object a = NotificationLite.a(t);
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
            b();
        }

        public final void a(Throwable th) {
            Object a = NotificationLite.a(th);
            long j = this.index + 1;
            this.index = j;
            a(new Node(a, j));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            r0 = (rx.internal.operators.OperatorReplay.Node) r12.index;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            if (r0 != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
            r0 = (rx.internal.operators.OperatorReplay.Node) get();
            r12.index = r0;
            r12.b(r0.index);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            r1 = r12.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
            if (r1 != null) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
            r2 = r12.get();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
            if (r6 == r2) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
            r8 = (rx.internal.operators.OperatorReplay.Node) r0.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
            if (r8 == null) goto L_0x007f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
            r0 = r8.value;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
            if (rx.internal.operators.NotificationLite.a(r1, r0) == false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
            r12.index = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
            if (r12.isUnsubscribed() == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
            r12.index = null;
            defpackage.xiq.b(r2);
            r12.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
            r1.onError(rx.exceptions.OnErrorThrowable.a(r2, rx.internal.operators.NotificationLite.e(r0)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
            if (r6 == 0) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
            r12.index = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008c, code lost:
            if (r2 == Long.MAX_VALUE) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008e, code lost:
            r12.c(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0091, code lost:
            monitor-enter(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0095, code lost:
            if (r12.missed != false) goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0097, code lost:
            r12.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0099, code lost:
            monitor-exit(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x009b, code lost:
            r12.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x009d, code lost:
            monitor-exit(r12);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(rx.internal.operators.OperatorReplay.InnerProducer<T> r12) {
            /*
                r11 = this;
                monitor-enter(r12)
                boolean r0 = r12.emitting     // Catch:{ all -> 0x00a3 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r12.missed = r1     // Catch:{ all -> 0x00a3 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a3 }
                return
            L_0x000a:
                r12.emitting = r1     // Catch:{ all -> 0x00a3 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a3 }
            L_0x000d:
                boolean r0 = r12.isUnsubscribed()
                if (r0 == 0) goto L_0x0014
                return
            L_0x0014:
                java.lang.Object r0 = r12.index
                rx.internal.operators.OperatorReplay$Node r0 = (rx.internal.operators.OperatorReplay.Node) r0
                if (r0 != 0) goto L_0x0027
                java.lang.Object r0 = r11.get()
                rx.internal.operators.OperatorReplay$Node r0 = (rx.internal.operators.OperatorReplay.Node) r0
                r12.index = r0
                long r1 = r0.index
                r12.b(r1)
            L_0x0027:
                boolean r1 = r12.isUnsubscribed()
                if (r1 == 0) goto L_0x002e
                return
            L_0x002e:
                xio<? super T> r1 = r12.child
                if (r1 != 0) goto L_0x0033
                return
            L_0x0033:
                long r2 = r12.get()
                r4 = 0
                r6 = r4
            L_0x003a:
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 == 0) goto L_0x007f
                java.lang.Object r8 = r0.get()
                rx.internal.operators.OperatorReplay$Node r8 = (rx.internal.operators.OperatorReplay.Node) r8
                if (r8 == 0) goto L_0x007f
                java.lang.Object r0 = r8.value
                r9 = 0
                boolean r10 = rx.internal.operators.NotificationLite.a(r1, r0)     // Catch:{ all -> 0x005e }
                if (r10 == 0) goto L_0x0052
                r12.index = r9     // Catch:{ all -> 0x005e }
                return
            L_0x0052:
                r9 = 1
                long r6 = r6 + r9
                boolean r0 = r12.isUnsubscribed()
                if (r0 == 0) goto L_0x005c
                return
            L_0x005c:
                r0 = r8
                goto L_0x003a
            L_0x005e:
                r2 = move-exception
                r12.index = r9
                defpackage.xiq.b(r2)
                r12.unsubscribe()
                boolean r12 = rx.internal.operators.NotificationLite.c(r0)
                if (r12 != 0) goto L_0x007e
                boolean r12 = rx.internal.operators.NotificationLite.b(r0)
                if (r12 != 0) goto L_0x007e
                java.lang.Object r12 = rx.internal.operators.NotificationLite.e(r0)
                java.lang.Throwable r12 = rx.exceptions.OnErrorThrowable.a(r2, r12)
                r1.onError(r12)
            L_0x007e:
                return
            L_0x007f:
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 == 0) goto L_0x0091
                r12.index = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 == 0) goto L_0x0091
                r12.c(r6)
            L_0x0091:
                monitor-enter(r12)
                boolean r0 = r12.missed     // Catch:{ all -> 0x00a0 }
                r1 = 0
                if (r0 != 0) goto L_0x009b
                r12.emitting = r1     // Catch:{ all -> 0x00a0 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a0 }
                return
            L_0x009b:
                r12.missed = r1     // Catch:{ all -> 0x00a0 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a0 }
                goto L_0x000d
            L_0x00a0:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a0 }
                throw r0
            L_0x00a3:
                r0 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a3 }
                goto L_0x00a7
            L_0x00a6:
                throw r0
            L_0x00a7:
                goto L_0x00a6
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.BoundedReplayBuffer.a(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }

        /* access modifiers changed from: 0000 */
        public void b() {
        }
    }

    static final class InnerProducer<T> extends AtomicLong implements xik, xip {
        private static final long serialVersionUID = -4453897557930727610L;
        xio<? super T> child;
        boolean emitting;
        Object index;
        boolean missed;
        final b<T> parent;
        final AtomicLong totalRequested = new AtomicLong();

        public InnerProducer(b<T> bVar, xio<? super T> xio) {
            this.parent = bVar;
            this.child = xio;
        }

        public final void a(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 < 0 || j != 0) {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                b(j);
                this.parent.b(this);
                this.parent.a.a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b(long j) {
            long j2;
            long j3;
            do {
                j2 = this.totalRequested.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!this.totalRequested.compareAndSet(j2, j3));
        }

        public final long c(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j3 = j2 - j;
                    if (j3 < 0) {
                        StringBuilder sb = new StringBuilder("More produced (");
                        sb.append(j);
                        sb.append(") than requested (");
                        sb.append(j2);
                        sb.append(")");
                        throw new IllegalStateException(sb.toString());
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public final void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                b<T> bVar = this.parent;
                if (!bVar.c) {
                    synchronized (bVar.d) {
                        if (!bVar.c) {
                            xlv<InnerProducer<T>> xlv = bVar.d;
                            T[] tArr = xlv.e;
                            int i = xlv.b;
                            int a = xlv.a(hashCode()) & i;
                            T t = tArr[a];
                            boolean z = true;
                            if (t != null) {
                                if (!t.equals(this)) {
                                    while (true) {
                                        a = (a + 1) & i;
                                        T t2 = tArr[a];
                                        if (t2 != null) {
                                            if (t2.equals(this)) {
                                                xlv.a(a, tArr, i);
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    xlv.a(a, tArr, i);
                                }
                            }
                            if (bVar.d.c != 0) {
                                z = false;
                            }
                            if (z) {
                                bVar.e = b.b;
                            }
                            bVar.f++;
                        }
                    }
                }
                this.parent.b(this);
                this.child = null;
            }
        }
    }

    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final long index;
        final Object value;

        public Node(Object obj, long j) {
            this.value = obj;
            this.index = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        public SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            if (this.size > this.limit) {
                Node node = (Node) ((Node) get()).get();
                if (node != null) {
                    this.size--;
                    set(node);
                    return;
                }
                throw new IllegalStateException("Empty list!");
            }
        }
    }

    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements a<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;

        public UnboundedReplayBuffer(int i) {
            super(16);
        }

        public final void a() {
            add(NotificationLite.a());
            this.size++;
        }

        public final void a(T t) {
            add(NotificationLite.a(t));
            this.size++;
        }

        public final void a(Throwable th) {
            add(NotificationLite.a(th));
            this.size++;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            if (r13.isUnsubscribed() == false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            r0 = r12.size;
            r1 = (java.lang.Integer) r13.index;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            if (r1 == null) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
            r1 = r1.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            r3 = r13.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
            if (r3 != null) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
            r4 = r13.get();
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
            if (r8 == r4) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
            if (r1 >= r0) goto L_0x006c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
            r10 = get(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
            if (rx.internal.operators.NotificationLite.a(r3, r10) == false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
            if (r13.isUnsubscribed() == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
            r1 = r1 + 1;
            r8 = r8 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
            defpackage.xiq.b(r0);
            r13.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0060, code lost:
            r3.onError(rx.exceptions.OnErrorThrowable.a(r0, rx.internal.operators.NotificationLite.e(r10)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
            if (r8 == 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
            r13.index = java.lang.Integer.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007d, code lost:
            if (r4 == Long.MAX_VALUE) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
            r13.c(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
            monitor-enter(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0085, code lost:
            if (r13.missed != false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0087, code lost:
            r13.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0089, code lost:
            monitor-exit(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x008a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x008b, code lost:
            r13.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x008d, code lost:
            monitor-exit(r13);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(rx.internal.operators.OperatorReplay.InnerProducer<T> r13) {
            /*
                r12 = this;
                monitor-enter(r13)
                boolean r0 = r13.emitting     // Catch:{ all -> 0x0093 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r13.missed = r1     // Catch:{ all -> 0x0093 }
                monitor-exit(r13)     // Catch:{ all -> 0x0093 }
                return
            L_0x000a:
                r13.emitting = r1     // Catch:{ all -> 0x0093 }
                monitor-exit(r13)     // Catch:{ all -> 0x0093 }
            L_0x000d:
                boolean r0 = r13.isUnsubscribed()
                if (r0 == 0) goto L_0x0014
                return
            L_0x0014:
                int r0 = r12.size
                java.lang.Object r1 = r13.index
                java.lang.Integer r1 = (java.lang.Integer) r1
                r2 = 0
                if (r1 == 0) goto L_0x0022
                int r1 = r1.intValue()
                goto L_0x0023
            L_0x0022:
                r1 = 0
            L_0x0023:
                xio<? super T> r3 = r13.child
                if (r3 != 0) goto L_0x0028
                return
            L_0x0028:
                long r4 = r13.get()
                r6 = 0
                r8 = r6
            L_0x002f:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L_0x006c
                if (r1 >= r0) goto L_0x006c
                java.lang.Object r10 = r12.get(r1)
                boolean r10 = rx.internal.operators.NotificationLite.a(r3, r10)     // Catch:{ all -> 0x004d }
                if (r10 == 0) goto L_0x0040
                return
            L_0x0040:
                boolean r10 = r13.isUnsubscribed()
                if (r10 == 0) goto L_0x0047
                return
            L_0x0047:
                int r1 = r1 + 1
                r10 = 1
                long r8 = r8 + r10
                goto L_0x002f
            L_0x004d:
                r0 = move-exception
                defpackage.xiq.b(r0)
                r13.unsubscribe()
                boolean r13 = rx.internal.operators.NotificationLite.c(r10)
                if (r13 != 0) goto L_0x006b
                boolean r13 = rx.internal.operators.NotificationLite.b(r10)
                if (r13 != 0) goto L_0x006b
                java.lang.Object r13 = rx.internal.operators.NotificationLite.e(r10)
                java.lang.Throwable r13 = rx.exceptions.OnErrorThrowable.a(r0, r13)
                r3.onError(r13)
            L_0x006b:
                return
            L_0x006c:
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 == 0) goto L_0x0082
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r13.index = r0
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                r13.c(r8)
            L_0x0082:
                monitor-enter(r13)
                boolean r0 = r13.missed     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x008b
                r13.emitting = r2     // Catch:{ all -> 0x0090 }
                monitor-exit(r13)     // Catch:{ all -> 0x0090 }
                return
            L_0x008b:
                r13.missed = r2     // Catch:{ all -> 0x0090 }
                monitor-exit(r13)     // Catch:{ all -> 0x0090 }
                goto L_0x000d
            L_0x0090:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0090 }
                throw r0
            L_0x0093:
                r0 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x0093 }
                goto L_0x0097
            L_0x0096:
                throw r0
            L_0x0097:
                goto L_0x0096
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.UnboundedReplayBuffer.a(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }
    }

    interface a<T> {
        void a();

        void a(T t);

        void a(Throwable th);

        void a(InnerProducer<T> innerProducer);
    }

    static final class b<T> extends xio<T> implements xip {
        static final InnerProducer[] b = new InnerProducer[0];
        final a<T> a;
        volatile boolean c;
        final xlv<InnerProducer<T>> d = new xlv<>();
        InnerProducer<T>[] e = b;
        volatile long f;
        final AtomicBoolean g = new AtomicBoolean();
        private boolean h;
        private long i;
        private boolean j;
        private boolean k;
        private long l;
        private long m;
        private volatile xik n;
        private List<InnerProducer<T>> o;
        private boolean p;

        public b(a<T> aVar) {
            this.a = aVar;
            request(0);
        }

        private void a(long j2, long j3) {
            long j4 = this.m;
            xik xik = this.n;
            long j5 = j2 - j3;
            if (j5 != 0) {
                this.l = j2;
                if (xik == null) {
                    long j6 = j4 + j5;
                    if (j6 < 0) {
                        j6 = Long.MAX_VALUE;
                    }
                    this.m = j6;
                } else if (j4 != 0) {
                    this.m = 0;
                    xik.a(j4 + j5);
                } else {
                    xik.a(j5);
                }
            } else {
                if (!(j4 == 0 || xik == null)) {
                    this.m = 0;
                    xik.a(j4);
                }
            }
        }

        private InnerProducer<T>[] b() {
            InnerProducer<T>[] innerProducerArr;
            synchronized (this.d) {
                T[] tArr = this.d.e;
                int length = tArr.length;
                innerProducerArr = new InnerProducer[length];
                System.arraycopy(tArr, 0, innerProducerArr, 0, length);
            }
            return innerProducerArr;
        }

        private void c() {
            InnerProducer<T>[] innerProducerArr = this.e;
            if (this.i != this.f) {
                synchronized (this.d) {
                    innerProducerArr = this.e;
                    T[] tArr = this.d.e;
                    int length = tArr.length;
                    if (innerProducerArr.length != length) {
                        innerProducerArr = new InnerProducer[length];
                        this.e = innerProducerArr;
                    }
                    System.arraycopy(tArr, 0, innerProducerArr, 0, length);
                    this.i = this.f;
                }
            }
            a<T> aVar = this.a;
            for (InnerProducer<T> innerProducer : innerProducerArr) {
                if (innerProducer != null) {
                    aVar.a(innerProducer);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            add(xon.a((xir) new xir() {
                public final void call() {
                    if (!b.this.c) {
                        synchronized (b.this.d) {
                            if (!b.this.c) {
                                xlv<InnerProducer<T>> xlv = b.this.d;
                                xlv.c = 0;
                                xlv.e = (Object[]) new Object[0];
                                b.this.f++;
                                b.this.c = true;
                            }
                        }
                    }
                }
            }));
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(InnerProducer<T> innerProducer) {
            if (this.c) {
                return false;
            }
            synchronized (this.d) {
                if (this.c) {
                    return false;
                }
                xlv<InnerProducer<T>> xlv = this.d;
                T[] tArr = xlv.e;
                int i2 = xlv.b;
                int a2 = xlv.a(innerProducer.hashCode()) & i2;
                T t = tArr[a2];
                if (t != null) {
                    if (!t.equals(innerProducer)) {
                        while (true) {
                            a2 = (a2 + 1) & i2;
                            T t2 = tArr[a2];
                            if (t2 != null) {
                                if (t2.equals(innerProducer)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    this.f++;
                    return true;
                }
                tArr[a2] = innerProducer;
                int i3 = xlv.c + 1;
                xlv.c = i3;
                if (i3 >= xlv.d) {
                    T[] tArr2 = xlv.e;
                    int length = tArr2.length;
                    int i4 = length << 1;
                    int i5 = i4 - 1;
                    T[] tArr3 = (Object[]) new Object[i4];
                    int i6 = xlv.c;
                    while (true) {
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            break;
                        }
                        do {
                            length--;
                        } while (tArr2[length] == null);
                        int a3 = xlv.a(tArr2[length].hashCode()) & i5;
                        if (tArr3[a3] != null) {
                            do {
                                a3 = (a3 + 1) & i5;
                            } while (tArr3[a3] != null);
                        }
                        tArr3[a3] = tArr2[length];
                        i6 = i7;
                    }
                    xlv.b = i5;
                    xlv.d = (int) (((float) i4) * xlv.a);
                    xlv.e = tArr3;
                }
                this.f++;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
            r0 = r9.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
            if (r10 == null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
            r3 = java.lang.Math.max(r0, r10.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            r10 = b();
            r3 = r10.length;
            r5 = r0;
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
            if (r4 >= r3) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
            r7 = r10[r4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
            if (r7 == null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
            r5 = java.lang.Math.max(r5, r7.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
            a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
            if (isUnsubscribed() == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
            if (r9.k != false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0061, code lost:
            r9.j = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0064, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0065, code lost:
            r9.k = false;
            r10 = r9.o;
            r9.o = null;
            r0 = r9.p;
            r9.p = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0071, code lost:
            r3 = r9.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
            if (r10 == null) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
            r10 = r10.iterator();
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
            if (r10.hasNext() == false) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
            r5 = java.lang.Math.max(r5, ((rx.internal.operators.OperatorReplay.InnerProducer) r10.next()).totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0092, code lost:
            if (r0 == false) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
            r10 = b();
            r0 = r10.length;
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
            if (r1 >= r0) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
            r7 = r10[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
            if (r7 == null) goto L_0x00aa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a0, code lost:
            r5 = java.lang.Math.max(r5, r7.totalRequested.get());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00aa, code lost:
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ad, code lost:
            a(r5, r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(rx.internal.operators.OperatorReplay.InnerProducer<T> r10) {
            /*
                r9 = this;
                boolean r0 = r9.isUnsubscribed()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                monitor-enter(r9)
                boolean r0 = r9.j     // Catch:{ all -> 0x00b4 }
                r1 = 1
                if (r0 == 0) goto L_0x0024
                if (r10 == 0) goto L_0x001e
                java.util.List<rx.internal.operators.OperatorReplay$InnerProducer<T>> r0 = r9.o     // Catch:{ all -> 0x00b4 }
                if (r0 != 0) goto L_0x001a
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00b4 }
                r0.<init>()     // Catch:{ all -> 0x00b4 }
                r9.o = r0     // Catch:{ all -> 0x00b4 }
            L_0x001a:
                r0.add(r10)     // Catch:{ all -> 0x00b4 }
                goto L_0x0020
            L_0x001e:
                r9.p = r1     // Catch:{ all -> 0x00b4 }
            L_0x0020:
                r9.k = r1     // Catch:{ all -> 0x00b4 }
                monitor-exit(r9)     // Catch:{ all -> 0x00b4 }
                return
            L_0x0024:
                r9.j = r1     // Catch:{ all -> 0x00b4 }
                monitor-exit(r9)     // Catch:{ all -> 0x00b4 }
                long r0 = r9.l
                r2 = 0
                if (r10 == 0) goto L_0x0037
                java.util.concurrent.atomic.AtomicLong r10 = r10.totalRequested
                long r3 = r10.get()
                long r3 = java.lang.Math.max(r0, r3)
                goto L_0x0052
            L_0x0037:
                rx.internal.operators.OperatorReplay$InnerProducer[] r10 = r9.b()
                int r3 = r10.length
                r5 = r0
                r4 = 0
            L_0x003e:
                if (r4 >= r3) goto L_0x0051
                r7 = r10[r4]
                if (r7 == 0) goto L_0x004e
                java.util.concurrent.atomic.AtomicLong r7 = r7.totalRequested
                long r7 = r7.get()
                long r5 = java.lang.Math.max(r5, r7)
            L_0x004e:
                int r4 = r4 + 1
                goto L_0x003e
            L_0x0051:
                r3 = r5
            L_0x0052:
                r9.a(r3, r0)
            L_0x0055:
                boolean r10 = r9.isUnsubscribed()
                if (r10 == 0) goto L_0x005c
                return
            L_0x005c:
                monitor-enter(r9)
                boolean r10 = r9.k     // Catch:{ all -> 0x00b1 }
                if (r10 != 0) goto L_0x0065
                r9.j = r2     // Catch:{ all -> 0x00b1 }
                monitor-exit(r9)     // Catch:{ all -> 0x00b1 }
                return
            L_0x0065:
                r9.k = r2     // Catch:{ all -> 0x00b1 }
                java.util.List<rx.internal.operators.OperatorReplay$InnerProducer<T>> r10 = r9.o     // Catch:{ all -> 0x00b1 }
                r0 = 0
                r9.o = r0     // Catch:{ all -> 0x00b1 }
                boolean r0 = r9.p     // Catch:{ all -> 0x00b1 }
                r9.p = r2     // Catch:{ all -> 0x00b1 }
                monitor-exit(r9)     // Catch:{ all -> 0x00b1 }
                long r3 = r9.l
                if (r10 == 0) goto L_0x0091
                java.util.Iterator r10 = r10.iterator()
                r5 = r3
            L_0x007a:
                boolean r1 = r10.hasNext()
                if (r1 == 0) goto L_0x0092
                java.lang.Object r1 = r10.next()
                rx.internal.operators.OperatorReplay$InnerProducer r1 = (rx.internal.operators.OperatorReplay.InnerProducer) r1
                java.util.concurrent.atomic.AtomicLong r1 = r1.totalRequested
                long r7 = r1.get()
                long r5 = java.lang.Math.max(r5, r7)
                goto L_0x007a
            L_0x0091:
                r5 = r3
            L_0x0092:
                if (r0 == 0) goto L_0x00ad
                rx.internal.operators.OperatorReplay$InnerProducer[] r10 = r9.b()
                int r0 = r10.length
                r1 = 0
            L_0x009a:
                if (r1 >= r0) goto L_0x00ad
                r7 = r10[r1]
                if (r7 == 0) goto L_0x00aa
                java.util.concurrent.atomic.AtomicLong r7 = r7.totalRequested
                long r7 = r7.get()
                long r5 = java.lang.Math.max(r5, r7)
            L_0x00aa:
                int r1 = r1 + 1
                goto L_0x009a
            L_0x00ad:
                r9.a(r5, r3)
                goto L_0x0055
            L_0x00b1:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00b1 }
                throw r10
            L_0x00b4:
                r10 = move-exception
                monitor-exit(r9)     // Catch:{ all -> 0x00b4 }
                goto L_0x00b8
            L_0x00b7:
                throw r10
            L_0x00b8:
                goto L_0x00b7
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.b.b(rx.internal.operators.OperatorReplay$InnerProducer):void");
        }

        public final void onCompleted() {
            if (!this.h) {
                this.h = true;
                try {
                    this.a.a();
                    c();
                } finally {
                    unsubscribe();
                }
            }
        }

        public final void onError(Throwable th) {
            if (!this.h) {
                this.h = true;
                try {
                    this.a.a(th);
                    c();
                } finally {
                    unsubscribe();
                }
            }
        }

        public final void onNext(T t) {
            if (!this.h) {
                this.a.a(t);
                c();
            }
        }

        public final void setProducer(xik xik) {
            if (this.n == null) {
                this.n = xik;
                b(null);
                c();
                return;
            }
            throw new IllegalStateException("Only a single producer can be set on a Subscriber.");
        }
    }

    private OperatorReplay(defpackage.xii.a<T> aVar, xii<? extends T> xii, AtomicReference<b<T>> atomicReference, xix<? extends a<T>> xix) {
        super(aVar);
        this.a = xii;
        this.b = atomicReference;
        this.c = xix;
    }

    public static <T> xno<T> a(xii<? extends T> xii, final int i) {
        return i == Integer.MAX_VALUE ? a(xii, d) : a(xii, (xix<? extends a<T>>) new xix<a<T>>() {
            public final /* synthetic */ Object call() {
                return new SizeBoundReplayBuffer(i);
            }
        });
    }

    private static <T> xno<T> a(xii<? extends T> xii, final xix<? extends a<T>> xix) {
        final AtomicReference atomicReference = new AtomicReference();
        return new OperatorReplay(new defpackage.xii.a<T>() {
            public final /* synthetic */ void call(Object obj) {
                b bVar;
                xio xio = (xio) obj;
                while (true) {
                    bVar = (b) atomicReference.get();
                    if (bVar != null) {
                        break;
                    }
                    b bVar2 = new b((a) xix.call());
                    bVar2.a();
                    if (atomicReference.compareAndSet(bVar, bVar2)) {
                        bVar = bVar2;
                        break;
                    }
                }
                InnerProducer innerProducer = new InnerProducer(bVar, xio);
                bVar.a(innerProducer);
                xio.add(innerProducer);
                bVar.a.a(innerProducer);
                xio.setProducer(innerProducer);
            }
        }, xii, atomicReference, xix);
    }

    public static <T> xno<T> d(xii<? extends T> xii) {
        return a(xii, d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.xis<? super defpackage.xip> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay$b<T>> r0 = r4.b
            java.lang.Object r0 = r0.get()
            rx.internal.operators.OperatorReplay$b r0 = (rx.internal.operators.OperatorReplay.b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isUnsubscribed()
            if (r1 == 0) goto L_0x0029
        L_0x0010:
            rx.internal.operators.OperatorReplay$b r1 = new rx.internal.operators.OperatorReplay$b
            xix<? extends rx.internal.operators.OperatorReplay$a<T>> r2 = r4.c
            java.lang.Object r2 = r2.call()
            rx.internal.operators.OperatorReplay$a r2 = (rx.internal.operators.OperatorReplay.a) r2
            r1.<init>(r2)
            r1.a()
            java.util.concurrent.atomic.AtomicReference<rx.internal.operators.OperatorReplay$b<T>> r2 = r4.b
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0000
            r0 = r1
        L_0x0029:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.g
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x003c
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.g
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            r5.call(r0)
            if (r2 == 0) goto L_0x0047
            xii<? extends T> r5 = r4.a
            r5.a(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.OperatorReplay.d(xis):void");
    }

    public final boolean isUnsubscribed() {
        b bVar = (b) this.b.get();
        return bVar == null || bVar.isUnsubscribed();
    }

    public final void unsubscribe() {
        this.b.lazySet(null);
    }
}
