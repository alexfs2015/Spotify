package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: wsk reason: default package */
public final class wsk {
    final defpackage.wlj.a a;
    public final wlx b;
    final List<defpackage.wry.a> c;
    final List<defpackage.wrv.a> d;
    final Executor e;
    final boolean f;
    private final Map<Method, wsl<?>> g = new ConcurrentHashMap();

    /* renamed from: wsk$a */
    public static final class a {
        private final wsg a;
        private defpackage.wlj.a b;
        private wlx c;
        private final List<defpackage.wry.a> d;
        private final List<defpackage.wrv.a> e;
        private Executor f;
        private boolean g;

        private a(wsg wsg) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = wsg;
        }

        public a() {
            this(wsg.a());
        }

        a(wsk wsk) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = wsg.a();
            this.b = wsk.a;
            this.c = wsk.b;
            int size = wsk.c.size() - this.a.e();
            for (int i = 1; i < size; i++) {
                this.d.add(wsk.c.get(i));
            }
            int size2 = wsk.d.size() - this.a.c();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.add(wsk.d.get(i2));
            }
            this.f = wsk.e;
            this.g = wsk.f;
        }

        public final a a(wmb wmb) {
            return a((defpackage.wlj.a) wsm.a(wmb, "client == null"));
        }

        private a a(defpackage.wlj.a aVar) {
            this.b = (defpackage.wlj.a) wsm.a(aVar, "factory == null");
            return this;
        }

        public final a a(String str) {
            wsm.a(str, "baseUrl == null");
            return a(wlx.f(str));
        }

        public final a a(wlx wlx) {
            wsm.a(wlx, "baseUrl == null");
            List<String> list = wlx.d;
            if ("".equals(list.get(list.size() - 1))) {
                this.c = wlx;
                return this;
            }
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(wlx);
            throw new IllegalArgumentException(sb.toString());
        }

        public final a a(defpackage.wry.a aVar) {
            this.d.add(wsm.a(aVar, "factory == null"));
            return this;
        }

        public final a a(defpackage.wrv.a aVar) {
            this.e.add(wsm.a(aVar, "factory == null"));
            return this;
        }

        public final wsk a() {
            if (this.c != null) {
                defpackage.wlj.a aVar = this.b;
                if (aVar == null) {
                    aVar = new wmb();
                }
                defpackage.wlj.a aVar2 = aVar;
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.addAll(this.a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.e());
                arrayList2.add(new wrt());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.d());
                wsk wsk = new wsk(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
                return wsk;
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    wsk(defpackage.wlj.a aVar, wlx wlx, List<defpackage.wry.a> list, List<defpackage.wrv.a> list2, Executor executor, boolean z) {
        this.a = aVar;
        this.b = wlx;
        this.c = list;
        this.d = list2;
        this.e = executor;
        this.f = z;
    }

    public final <T> T a(final Class<T> cls) {
        wsm.a(cls);
        if (this.f) {
            b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            private final wsg a = wsg.a();
            private final Object[] b = new Object[0];

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.a.a(method)) {
                    return this.a.a(method, cls, obj, objArr);
                }
                wsl a2 = wsk.this.a(method);
                if (objArr == null) {
                    objArr = this.b;
                }
                return a2.a(objArr);
            }
        });
    }

    private void b(Class<?> cls) {
        Method[] declaredMethods;
        wsg a2 = wsg.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a2.a(method)) {
                a(method);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final wsl<?> a(Method method) {
        wsl<?> wsl;
        wsl<?> wsl2 = (wsl) this.g.get(method);
        if (wsl2 != null) {
            return wsl2;
        }
        synchronized (this.g) {
            wsl = (wsl) this.g.get(method);
            if (wsl == null) {
                wsi a2 = wsi.a(this, method);
                Type genericReturnType = method.getGenericReturnType();
                if (wsm.d(genericReturnType)) {
                    throw wsm.a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                } else if (genericReturnType != Void.TYPE) {
                    wrv a3 = wsb.a(this, method);
                    Type a4 = a3.a();
                    if (a4 == wsj.class || a4 == wmf.class) {
                        StringBuilder sb = new StringBuilder("'");
                        sb.append(wsm.a(a4).getName());
                        sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                        throw wsm.a(method, sb.toString(), new Object[0]);
                    }
                    if (a2.a.equals("HEAD")) {
                        if (!Void.class.equals(a4)) {
                            throw wsm.a(method, "HEAD method must use Void as response type.", new Object[0]);
                        }
                    }
                    wsl<?> wsb = new wsb<>(a2, this.a, a3, wsb.a(this, method, a4));
                    this.g.put(method, wsb);
                    wsl = wsb;
                } else {
                    throw wsm.a(method, "Service methods cannot return void.", new Object[0]);
                }
            }
        }
        return wsl;
    }

    public final <T> wry<T, wme> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return a(null, type, annotationArr, annotationArr2);
    }

    private <T> wry<T, wme> a(defpackage.wry.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        wsm.a(type, "type == null");
        wsm.a(annotationArr, "parameterAnnotations == null");
        wsm.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            wry<T, wme> a2 = ((defpackage.wry.a) this.c.get(i)).a(type);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((defpackage.wry.a) this.c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> wry<wmg, T> a(defpackage.wry.a aVar, Type type, Annotation[] annotationArr) {
        wsm.a(type, "type == null");
        wsm.a(annotationArr, "annotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            wry<wmg, T> a2 = ((defpackage.wry.a) this.c.get(i)).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((defpackage.wry.a) this.c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> wry<T, String> a(Type type, Annotation[] annotationArr) {
        wsm.a(type, "type == null");
        wsm.a(annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i);
        }
        return d.a;
    }

    public final a a() {
        return new a(this);
    }
}
