package defpackage;

import io.netty.channel.ChannelId;
import java.net.SocketAddress;

/* renamed from: wan reason: default package */
public interface wan extends Comparable<wan>, wbe, wgz {

    /* renamed from: wan$a */
    public interface a {
        defpackage.wcb.a a();

        void a(Object obj, wbi wbi);

        void a(SocketAddress socketAddress, SocketAddress socketAddress2, wbi wbi);

        void a(wbi wbi);

        void a(wbu wbu, wbi wbi);

        wbb b();

        void b(wbi wbi);

        SocketAddress c();

        SocketAddress d();

        void e();

        void f();

        void g();

        wbi i();
    }

    wao B();

    boolean C();

    boolean D();

    waz E();

    ChannelId a();

    boolean b();

    wbf c();

    vyw d();

    wbu e();

    boolean h();

    wan j();

    a l();
}
