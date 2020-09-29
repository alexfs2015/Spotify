package defpackage;

import io.netty.handler.codec.PrematureChannelClosureException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wdu reason: default package */
public final class wdu extends wbk<wek, wei> {
    /* access modifiers changed from: private */
    public final Queue<wee> d;
    /* access modifiers changed from: private */
    public boolean e;
    /* access modifiers changed from: private */
    public final AtomicLong f;
    /* access modifiers changed from: private */
    public final boolean g;

    /* renamed from: wdu$a */
    final class a extends wek {
        a(int i, int i2, int i3, boolean z) {
            super(i, i2, i3, z);
        }

        public final void a(wav wav, vyv vyv, List<Object> list) {
            if (wdu.this.e) {
                int b = b();
                if (b != 0) {
                    list.add(vyv.u(b));
                    return;
                }
                return;
            }
            super.a(wav, vyv, list);
            if (wdu.this.g) {
                int size = list.size();
                for (int size2 = list.size(); size2 < size; size2++) {
                    Object obj = list.get(size2);
                    if (obj != null && (obj instanceof weo)) {
                        wdu.this.f.decrementAndGet();
                    }
                }
            }
        }

        public final boolean a(wec wec) {
            int i = ((wej) wec).f().b;
            if (i == 100) {
                return true;
            }
            wee wee = (wee) wdu.this.d.poll();
            char charAt = wee.e.toString().charAt(0);
            if (charAt != 'C') {
                if (charAt == 'H' && wee.b.equals(wee)) {
                    return true;
                }
            } else if (i == 200 && wee.d.equals(wee)) {
                wdu.this.e = true;
                wdu.this.d.clear();
                return true;
            }
            return super.a(wec);
        }

        public final void b(wav wav) {
            super.b(wav);
            if (wdu.this.g) {
                long j = wdu.this.f.get();
                if (j > 0) {
                    StringBuilder sb = new StringBuilder("channel gone inactive with ");
                    sb.append(j);
                    sb.append(" missing response(s)");
                    wav.a((Throwable) new PrematureChannelClosureException(sb.toString()));
                }
            }
        }
    }

    /* renamed from: wdu$b */
    final class b extends wei {
        private b() {
        }

        /* synthetic */ b(wdu wdu, byte b) {
            this();
        }

        public final void a(wav wav, Object obj, List<Object> list) {
            if ((obj instanceof weh) && !wdu.this.e) {
                wdu.this.d.offer(((weh) obj).a());
            }
            super.a(wav, obj, list);
            if (wdu.this.g && (obj instanceof weo)) {
                wdu.this.f.incrementAndGet();
            }
        }
    }

    public wdu() {
        this(4096, 8192, 8192, false);
    }

    private wdu(int i, int i2, int i3, boolean z) {
        this(4096, 8192, 8192, false, true);
    }

    private wdu(int i, int i2, int i3, boolean z, boolean z2) {
        this.d = new ArrayDeque();
        this.f = new AtomicLong();
        a aVar = new a(i, i2, i3, true);
        O bVar = new b(this, 0);
        if (this.b == null) {
            String str = " to get combined.";
            if (aVar instanceof wbc) {
                StringBuilder sb = new StringBuilder("inboundHandler must not implement ");
                sb.append(wbc.class.getSimpleName());
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(bVar instanceof waw)) {
                this.b = aVar;
                this.c = bVar;
                this.g = z;
            } else {
                StringBuilder sb2 = new StringBuilder("outboundHandler must not implement ");
                sb2.append(waw.class.getSimpleName());
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("init() can not be invoked if ");
            sb3.append(wbk.class.getSimpleName());
            sb3.append(" was constructed with non-default constructor.");
            throw new IllegalStateException(sb3.toString());
        }
    }
}
