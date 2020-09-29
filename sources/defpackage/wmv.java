package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: wmv reason: default package */
public final class wmv {
    final wlf a;
    final wmu b;
    private final wlj c;
    private final wlt d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<wmh> h = new ArrayList();

    /* renamed from: wmv$a */
    public static final class a {
        final List<wmh> a;
        int b = 0;

        a(List<wmh> list) {
            this.a = list;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public wmv(wlf wlf, wmu wmu, wlj wlj, wlt wlt) {
        List<Proxy> list;
        this.a = wlf;
        this.b = wmu;
        this.c = wlj;
        this.d = wlt;
        wlx wlx = wlf.a;
        Proxy proxy = wlf.g;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List select = this.a.f.select(wlx.b());
            if (select == null || select.isEmpty()) {
                list = wmk.a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = wmk.a(select);
            }
        }
        this.e = list;
        this.f = 0;
    }

    public final boolean a() {
        return c() || !this.h.isEmpty();
    }

    public final a b() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                if (c()) {
                    List<Proxy> list = this.e;
                    int i = this.f;
                    this.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    a(proxy);
                    int size = this.g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        wmh wmh = new wmh(this.a, proxy, (InetSocketAddress) this.g.get(i2));
                        if (this.b.c(wmh)) {
                            this.h.add(wmh);
                        } else {
                            arrayList.add(wmh);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("No route to ");
                    sb.append(this.a.a.b);
                    sb.append("; exhausted proxy configurations: ");
                    sb.append(this.e);
                    throw new SocketException(sb.toString());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private void a(Proxy proxy) {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.a.a.b;
            i = this.a.a.c;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            List a2 = this.a.b.a(str);
            if (!a2.isEmpty()) {
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g.add(new InetSocketAddress((InetAddress) a2.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.a.b);
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }
}
