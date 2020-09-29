package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ili reason: default package */
public final class ili {
    /* access modifiers changed from: private */
    public static final byte[] c = new byte[0];
    /* access modifiers changed from: 0000 */
    public final OutputStream a;
    final ScheduledExecutorService b;
    /* access modifiers changed from: private */
    public final byte[] d = new byte[200000];
    /* access modifiers changed from: private */
    public final byte[] e = new byte[256];
    private final Deque<byte[]> f = new ArrayDeque();
    /* access modifiers changed from: private */
    public ScheduledFuture<?> g;
    /* access modifiers changed from: private */
    public byte h;
    /* access modifiers changed from: private */
    public final ilf i;

    public ili(OutputStream outputStream, ScheduledExecutorService scheduledExecutorService, ilf ilf) {
        this.a = outputStream;
        this.b = scheduledExecutorService;
        this.i = ilf;
    }

    /* access modifiers changed from: private */
    public ScheduledFuture<?> a(Runnable runnable, long j) {
        if (!this.b.isShutdown()) {
            return this.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public static void a(IOException iOException) {
        Logger.b(iOException, "ProtocolFraming Error %s", iOException.getMessage());
    }

    private synchronized void b(final int i2, final byte[] bArr) {
        this.g = a((Runnable) new Runnable() {
            private int a;

            public final void run() {
                ByteBuffer wrap = ByteBuffer.wrap(ili.this.d);
                ili.this.i.a(bArr, i2, 0, ili.this.h, wrap);
                if (this.a < 5) {
                    try {
                        wrap.array();
                        wrap.position();
                        ili.this.a.write(wrap.array(), 0, wrap.position());
                        this.a++;
                        double d2 = (double) i2;
                        Double.isNaN(d2);
                        long max = Math.max(750, Math.min(5000, (long) ((d2 / 35000.0d) * 5000.0d)));
                        ili.this.g = ili.this.a((Runnable) this, max);
                        Logger.b("Adaptive timeout = %d", Long.valueOf(max));
                    } catch (IOException e) {
                        ili.a(new IOException("Error sending data", e));
                        ili.this.a();
                        ili.f(ili.this);
                    }
                } else {
                    ili.a(new IOException("Message resent five times without being ACKed, giving up on this message"));
                    ili.this.a();
                    ili.f(ili.this);
                }
            }
        }, 0);
    }

    /* access modifiers changed from: private */
    public boolean c() {
        return this.g != null;
    }

    private void d() {
        Logger.b("Queue size %d", Integer.valueOf(this.f.size()));
    }

    static /* synthetic */ void f(ili ili) {
        if (ili.f.size() > 0) {
            byte[] bArr = (byte[]) ili.f.removeLast();
            ili.d();
            ili.a(bArr.length, bArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a() {
        if (this.g != null) {
            this.g.cancel(false);
            this.g = null;
        }
    }

    public final synchronized void a(final byte b2) {
        a((Runnable) new Runnable() {
            public final void run() {
                ByteBuffer wrap = ByteBuffer.wrap(ili.this.e);
                ili.this.i.a(ili.c, ili.c.length, 1, b2 == 0 ? (byte) 1 : 0, wrap);
                wrap.array();
                wrap.position();
                try {
                    ili.this.a.write(wrap.array(), 0, wrap.position());
                } catch (IOException e) {
                    ili.a(e);
                }
            }
        }, 0);
    }

    public final synchronized void a(int i2, byte[] bArr) {
        if (c()) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            if (this.f.size() < 100) {
                this.f.addFirst(bArr2);
            } else {
                Assertion.b("Queue full");
            }
            d();
            return;
        }
        b(i2, bArr);
    }

    public final synchronized void b(final byte b2) {
        AnonymousClass3 r0 = new Runnable() {
            public final void run() {
                if (!ili.this.c() || b2 == ili.this.h) {
                    Logger.c("ACK ignored. Invalid sequence #. Last sent data had %s got %s", Integer.toHexString(ili.this.h & 255), Integer.toHexString(b2 & 255));
                    return;
                }
                ili.this.a();
                ili.this.h = b2;
                ili.f(ili.this);
                Logger.b("ACK Accepted", new Object[0]);
            }
        };
        if (!this.b.isShutdown()) {
            this.b.execute(r0);
        }
    }
}
