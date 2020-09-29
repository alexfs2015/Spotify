package defpackage;

import io.netty.handler.codec.PrematureChannelClosureException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wsa reason: default package */
public final class wsa extends wpq<wsq, wso> {
    /* access modifiers changed from: private */
    public final Queue<wsk> d;
    /* access modifiers changed from: private */
    public boolean e;
    /* access modifiers changed from: private */
    public final AtomicLong f;
    /* access modifiers changed from: private */
    public final boolean g;

    /* renamed from: wsa$a */
    final class a extends wsq {
        a(int i, int i2, int i3, boolean z) {
            super(i, i2, i3, z);
        }

        public final void a(wpb wpb, wnb wnb, List<Object> list) {
            if (wsa.this.e) {
                int b = b();
                if (b != 0) {
                    list.add(wnb.u(b));
                    return;
                }
                return;
            }
            super.a(wpb, wnb, list);
            if (wsa.this.g) {
                int size = list.size();
                for (int size2 = list.size(); size2 < size; size2++) {
                    Object obj = list.get(size2);
                    if (obj != null && (obj instanceof wsu)) {
                        wsa.this.f.decrementAndGet();
                    }
                }
            }
        }

        public final boolean a(wsi wsi) {
            int i = ((wsp) wsi).f().b;
            if (i == 100) {
                return true;
            }
            wsk wsk = (wsk) wsa.this.d.poll();
            char charAt = wsk.e.toString().charAt(0);
            if (charAt != 'C') {
                if (charAt == 'H' && wsk.b.equals(wsk)) {
                    return true;
                }
            } else if (i == 200 && wsk.d.equals(wsk)) {
                wsa.this.e = true;
                wsa.this.d.clear();
                return true;
            }
            return super.a(wsi);
        }

        public final void b(wpb wpb) {
            super.b(wpb);
            if (wsa.this.g) {
                long j = wsa.this.f.get();
                if (j > 0) {
                    StringBuilder sb = new StringBuilder("channel gone inactive with ");
                    sb.append(j);
                    sb.append(" missing response(s)");
                    wpb.a((Throwable) new PrematureChannelClosureException(sb.toString()));
                }
            }
        }
    }

    /* renamed from: wsa$b */
    final class b extends wso {
        private b() {
        }

        /* synthetic */ b(wsa wsa, byte b) {
            this();
        }

        public final void a(wpb wpb, Object obj, List<Object> list) {
            if ((obj instanceof wsn) && !wsa.this.e) {
                wsa.this.d.offer(((wsn) obj).a());
            }
            super.a(wpb, obj, list);
            if (wsa.this.g && (obj instanceof wsu)) {
                wsa.this.f.incrementAndGet();
            }
        }
    }

    public wsa() {
        this(4096, 8192, 8192, false);
    }

    private wsa(int i, int i2, int i3, boolean z) {
        this(4096, 8192, 8192, false, true);
    }

    private wsa(int i, int i2, int i3, boolean z, boolean z2) {
        this.d = new ArrayDeque();
        this.f = new AtomicLong();
        a aVar = new a(i, i2, i3, true);
        O bVar = new b(this, 0);
        if (this.b == null) {
            String str = " to get combined.";
            if (aVar instanceof wpi) {
                StringBuilder sb = new StringBuilder("inboundHandler must not implement ");
                sb.append(wpi.class.getSimpleName());
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(bVar instanceof wpc)) {
                this.b = aVar;
                this.c = bVar;
                this.g = z;
            } else {
                StringBuilder sb2 = new StringBuilder("outboundHandler must not implement ");
                sb2.append(wpc.class.getSimpleName());
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("init() can not be invoked if ");
            sb3.append(wpq.class.getSimpleName());
            sb3.append(" was constructed with non-default constructor.");
            throw new IllegalStateException(sb3.toString());
        }
    }
}
