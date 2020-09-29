package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: wnz reason: default package */
final class wnz extends wob {
    private final Method b;
    private final Method c;
    private final Method d;
    private final Class<?> e;
    private final Class<?> f;

    /* renamed from: wnz$a */
    static class a implements InvocationHandler {
        boolean a;
        String b;
        private final List<String> c;

        a(List<String> list) {
            this.c = list;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<String> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = wmk.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.c.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.b = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.c.get(0);
                    this.b = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    private wnz(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.b = method;
        this.c = method2;
        this.d = method3;
        this.e = cls;
        this.f = cls2;
    }

    public final void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List a2 = a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(wob.class.getClassLoader(), new Class[]{this.e, this.f}, new a(a2));
            this.b.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw wmk.a("unable to set alpn", (Exception) e2);
        }
    }

    public final void b(SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw wmk.a("unable to remove alpn", (Exception) e2);
        }
    }

    public final String a(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.c.invoke(null, new Object[]{sSLSocket}));
            if (!aVar.a && aVar.b == null) {
                wob.a.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.a) {
                return null;
            } else {
                return aVar.b;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw wmk.a("unable to get selected protocol", (Exception) e2);
        }
    }

    public static wob a() {
        String str = "org.eclipse.jetty.alpn.ALPN";
        try {
            Class cls = Class.forName(str);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("$Provider");
            Class cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("$ClientProvider");
            Class cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("$ServerProvider");
            Class cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            Method method2 = method;
            wnz wnz = new wnz(method2, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
            return wnz;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
