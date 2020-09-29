package defpackage;

import io.netty.channel.ChannelException;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

/* renamed from: wcv reason: default package */
public class wcv extends wck implements wct {
    private static final SelectorProvider h = SelectorProvider.provider();
    final wcu g;

    /* renamed from: wcv$a */
    final class a extends wcr {
        /* synthetic */ a(wcv wcv, wcv wcv2, Socket socket, byte b) {
            this(wcv2, socket);
        }

        private a(wcv wcv, Socket socket) {
            super(wcv, socket);
        }

        public final void j() {
            wcv.this.M();
        }
    }

    /* renamed from: wcv$b */
    final class b extends defpackage.wck.a {
        private b() {
            super();
        }

        /* synthetic */ b(wcv wcv, byte b) {
            this();
        }

        public final Executor k() {
            try {
                if (wcv.this.O().isOpen() && wcv.this.g.k() > 0) {
                    wcv.this.t();
                    return wig.a;
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    static {
        wjx.a(wcv.class);
    }

    private static SocketChannel a(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openSocketChannel();
        } catch (IOException e) {
            throw new ChannelException("Failed to open a socket.", e);
        }
    }

    public wcv() {
        this(h);
    }

    private wcv(SelectorProvider selectorProvider) {
        this(a(selectorProvider));
    }

    private wcv(SocketChannel socketChannel) {
        this(null, socketChannel);
    }

    private wcv(wan wan, SocketChannel socketChannel) {
        super(null, socketChannel);
        this.g = new a(this, this, socketChannel.socket(), 0);
    }

    /* access modifiers changed from: protected */
    public final SocketChannel O() {
        return (SocketChannel) super.J();
    }

    /* access modifiers changed from: private */
    public void c(wbi wbi) {
        try {
            P();
            wbi.b();
        } catch (Throwable th) {
            wbi.a(th);
        }
    }

    private void P() {
        if (PlatformDependent.c() >= 7) {
            ((SocketChannel) super.J()).shutdownInput();
        } else {
            ((SocketChannel) super.J()).socket().shutdownInput();
        }
    }

    public final void r() {
        s();
    }

    public final void s() {
        super.s();
        ((SocketChannel) super.J()).close();
    }

    public final int a(vyv vyv) {
        defpackage.wcb.a a2 = I().a();
        a2.c(vyv.h());
        return vyv.a((ScatteringByteChannel) (SocketChannel) super.J(), a2.e());
    }

    public final int b(vyv vyv) {
        return vyv.a((GatheringByteChannel) (SocketChannel) super.J(), vyv.g());
    }

    public final long a(wbw wbw) {
        return wbw.c();
    }

    /* renamed from: G */
    public final defpackage.wcl.a m() {
        return new b(this, 0);
    }

    public final boolean D() {
        SocketChannel socketChannel = (SocketChannel) super.J();
        return socketChannel.isOpen() && socketChannel.isConnected();
    }

    public final war F() {
        final wbi k = this.a.k();
        Executor k2 = ((b) I()).k();
        if (k2 != null) {
            k2.execute(new Runnable() {
                public final void run() {
                    wcv.this.c(k);
                }
            });
        } else {
            wcm K = K();
            if (K.j()) {
                c(k);
            } else {
                K.execute(new Runnable() {
                    public final void run() {
                        wcv.this.c(k);
                    }
                });
            }
        }
        return k;
    }

    public final SocketAddress o() {
        return ((SocketChannel) super.J()).socket().getLocalSocketAddress();
    }

    public final SocketAddress p() {
        return ((SocketChannel) super.J()).socket().getRemoteSocketAddress();
    }

    public final boolean a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            if (PlatformDependent.c() >= 7) {
                ((SocketChannel) super.J()).bind(socketAddress2);
            } else {
                ((SocketChannel) super.J()).socket().bind(socketAddress2);
            }
        }
        try {
            boolean connect = ((SocketChannel) super.J()).connect(socketAddress);
            if (!connect) {
                L().interestOps(8);
            }
            return connect;
        } catch (Throwable th) {
            s();
            throw th;
        }
    }

    public final void N() {
        if (!((SocketChannel) super.J()).finishConnect()) {
            throw new Error();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.wbb r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L_0x0004:
            int r2 = r1.e
            if (r2 != 0) goto L_0x000c
            r17.H()
            return
        L_0x000c:
            wjc r2 = defpackage.wjc.b()
            wia<java.nio.ByteBuffer[]> r3 = defpackage.wbb.a
            java.lang.Object r3 = r3.a(r2)
            java.nio.ByteBuffer[] r3 = (java.nio.ByteBuffer[]) r3
            wbb$a r4 = r1.b
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x001e:
            r11 = 1
            if (r4 == 0) goto L_0x0027
            wbb$a r12 = r1.c
            if (r4 == r12) goto L_0x0027
            r12 = 1
            goto L_0x0028
        L_0x0027:
            r12 = 0
        L_0x0028:
            if (r12 == 0) goto L_0x009a
            java.lang.Object r12 = r4.b
            boolean r12 = r12 instanceof defpackage.vyv
            if (r12 == 0) goto L_0x009a
            boolean r12 = r4.j
            if (r12 != 0) goto L_0x0097
            java.lang.Object r12 = r4.b
            vyv r12 = (defpackage.vyv) r12
            int r13 = r12.c()
            int r14 = r12.d()
            int r14 = r14 - r13
            if (r14 <= 0) goto L_0x0097
            r15 = 2147483647(0x7fffffff, float:NaN)
            int r15 = r15 - r14
            long r5 = (long) r15
            int r15 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x009a
            long r5 = (long) r14
            long r8 = r8 + r5
            int r5 = r4.i
            r6 = -1
            if (r5 != r6) goto L_0x0059
            int r5 = r12.J()
            r4.i = r5
        L_0x0059:
            int r6 = r10 + r5
            int r15 = r3.length
            if (r6 <= r15) goto L_0x0076
            int r15 = r3.length
        L_0x005f:
            int r15 = r15 << r11
            if (r15 < 0) goto L_0x0070
            if (r6 > r15) goto L_0x005f
            java.nio.ByteBuffer[] r6 = new java.nio.ByteBuffer[r15]
            java.lang.System.arraycopy(r3, r7, r6, r7, r10)
            wia<java.nio.ByteBuffer[]> r3 = defpackage.wbb.a
            r3.a(r2, r6)
            r3 = r6
            goto L_0x0076
        L_0x0070:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0076:
            if (r5 != r11) goto L_0x0088
            java.nio.ByteBuffer r5 = r4.d
            if (r5 != 0) goto L_0x0082
            java.nio.ByteBuffer r5 = r12.n(r13, r14)
            r4.d = r5
        L_0x0082:
            int r6 = r10 + 1
            r3[r10] = r5
            r10 = r6
            goto L_0x0097
        L_0x0088:
            java.nio.ByteBuffer[] r5 = r4.c
            if (r5 != 0) goto L_0x0092
            java.nio.ByteBuffer[] r5 = r12.w()
            r4.c = r5
        L_0x0092:
            int r5 = defpackage.wbb.a(r5, r3, r10)
            r10 = r5
        L_0x0097:
            wbb$a r4 = r4.a
            goto L_0x001e
        L_0x009a:
            r1.f = r10
            r1.g = r8
            int r2 = r1.f
            long r4 = r1.g
            java.nio.channels.SelectableChannel r6 = super.J()
            java.nio.channels.SocketChannel r6 = (java.nio.channels.SocketChannel) r6
            if (r2 == 0) goto L_0x00f9
            if (r2 == r11) goto L_0x00cf
            wcu r8 = r0.g
            int r8 = r8.b()
            int r8 = r8 - r11
            r9 = 0
        L_0x00b5:
            if (r8 < 0) goto L_0x00cd
            long r12 = r6.write(r3, r7, r2)
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x00c2
            goto L_0x00f0
        L_0x00c2:
            long r4 = r4 - r12
            long r9 = r9 + r12
            int r12 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00ca
        L_0x00c8:
            r7 = 1
            goto L_0x00cd
        L_0x00ca:
            int r8 = r8 + -1
            goto L_0x00b5
        L_0x00cd:
            r11 = 0
            goto L_0x00f0
        L_0x00cf:
            r2 = r3[r7]
            wcu r3 = r0.g
            int r3 = r3.b()
            int r3 = r3 - r11
            r9 = 0
        L_0x00da:
            if (r3 < 0) goto L_0x00cd
            int r8 = r6.write(r2)
            if (r8 != 0) goto L_0x00e3
            goto L_0x00f0
        L_0x00e3:
            long r12 = (long) r8
            long r4 = r4 - r12
            long r9 = r9 + r12
            r12 = 0
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x00ed
            goto L_0x00c8
        L_0x00ed:
            int r3 = r3 + -1
            goto L_0x00da
        L_0x00f0:
            r1.d(r9)
            if (r7 != 0) goto L_0x0004
            r0.a(r11)
            return
        L_0x00f9:
            super.a(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wcv.a(wbb):void");
    }

    public final /* bridge */ /* synthetic */ SelectableChannel J() {
        return (SocketChannel) super.J();
    }

    public final /* bridge */ /* synthetic */ SocketAddress g() {
        return (InetSocketAddress) super.g();
    }

    public final /* bridge */ /* synthetic */ SocketAddress f() {
        return (InetSocketAddress) super.f();
    }

    public final /* bridge */ /* synthetic */ wao B() {
        return this.g;
    }
}
