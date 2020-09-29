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

/* renamed from: xgp reason: default package */
public final class xgp {
    final defpackage.wzp.a a;
    public final xad b;
    final List<defpackage.xgd.a> c;
    final List<defpackage.xga.a> d;
    final Executor e;
    final boolean f;
    private final Map<Method, xgq<?>> g = new ConcurrentHashMap();

    /* renamed from: xgp$a */
    public static final class a {
        private final xgl a;
        private defpackage.wzp.a b;
        private xad c;
        private final List<defpackage.xgd.a> d;
        private final List<defpackage.xga.a> e;
        private Executor f;
        private boolean g;

        public a() {
            this(xgl.a());
        }

        private a(xgl xgl) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = xgl;
        }

        a(xgp xgp) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = xgl.a();
            this.b = xgp.a;
            this.c = xgp.b;
            int size = xgp.c.size() - this.a.e();
            for (int i = 1; i < size; i++) {
                this.d.add(xgp.c.get(i));
            }
            int size2 = xgp.d.size() - this.a.c();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.add(xgp.d.get(i2));
            }
            this.f = xgp.e;
            this.g = xgp.f;
        }

        private a a(defpackage.wzp.a aVar) {
            this.b = (defpackage.wzp.a) xgr.a(aVar, "factory == null");
            return this;
        }

        public final a a(String str) {
            xgr.a(str, "baseUrl == null");
            return a(xad.f(str));
        }

        public final a a(xad xad) {
            xgr.a(xad, "baseUrl == null");
            List<String> list = xad.d;
            if ("".equals(list.get(list.size() - 1))) {
                this.c = xad;
                return this;
            }
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(xad);
            throw new IllegalArgumentException(sb.toString());
        }

        public final a a(xah xah) {
            return a((defpackage.wzp.a) xgr.a(xah, "client == null"));
        }

        public final a a(defpackage.xga.a aVar) {
            this.e.add(xgr.a(aVar, "factory == null"));
            return this;
        }

        public final a a(defpackage.xgd.a aVar) {
            this.d.add(xgr.a(aVar, "factory == null"));
            return this;
        }

        public final xgp a() {
            if (this.c != null) {
                defpackage.wzp.a aVar = this.b;
                if (aVar == null) {
                    aVar = new xah();
                }
                defpackage.wzp.a aVar2 = aVar;
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.addAll(this.a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + this.a.e());
                arrayList2.add(new xfy());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.d());
                xgp xgp = new xgp(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
                return xgp;
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    xgp(defpackage.wzp.a aVar, xad xad, List<defpackage.xgd.a> list, List<defpackage.xga.a> list2, Executor executor, boolean z) {
        this.a = aVar;
        this.b = xad;
        this.c = list;
        this.d = list2;
        this.e = executor;
        this.f = z;
    }

    private <T> xgd<T, xak> a(defpackage.xgd.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        xgr.a(type, "type == null");
        xgr.a(annotationArr, "parameterAnnotations == null");
        xgr.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            xgd<T, xak> a2 = ((defpackage.xgd.a) this.c.get(i)).a(type);
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
            sb.append(((defpackage.xgd.a) this.c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    private void b(Class<?> cls) {
        Method[] declaredMethods;
        xgl a2 = xgl.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a2.a(method)) {
                a(method);
            }
        }
    }

    public final <T> T a(final Class<T> cls) {
        xgr.a(cls);
        if (this.f) {
            b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            private final xgl a = xgl.a();
            private final Object[] b = new Object[0];

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.a.a(method)) {
                    return this.a.a(method, cls, obj, objArr);
                }
                xgq a2 = xgp.this.a(method);
                if (objArr == null) {
                    objArr = this.b;
                }
                return a2.a(objArr);
            }
        });
    }

    public final <T> xgd<T, String> a(Type type, Annotation[] annotationArr) {
        xgr.a(type, "type == null");
        xgr.a(annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.c.get(i);
        }
        return d.a;
    }

    public final <T> xgd<T, xak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return a(null, type, annotationArr, annotationArr2);
    }

    public final <T> xgd<xam, T> a(defpackage.xgd.a aVar, Type type, Annotation[] annotationArr) {
        xgr.a(type, "type == null");
        xgr.a(annotationArr, "annotations == null");
        int indexOf = this.c.indexOf(null) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            xgd<xam, T> a2 = ((defpackage.xgd.a) this.c.get(i)).a(type, annotationArr, this);
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
            sb.append(((defpackage.xgd.a) this.c.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final a a() {
        return new a(this);
    }

    /* access modifiers changed from: 0000 */
    public final xgq<?> a(Method method) {
        xgq<?> xgq;
        xgq<?> xgq2 = (xgq) this.g.get(method);
        if (xgq2 != null) {
            return xgq2;
        }
        synchronized (this.g) {
            xgq = (xgq) this.g.get(method);
            if (xgq == null) {
                xgn a2 = xgn.a(this, method);
                Type genericReturnType = method.getGenericReturnType();
                if (xgr.d(genericReturnType)) {
                    throw xgr.a(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                } else if (genericReturnType != Void.TYPE) {
                    xga a3 = xgg.a(this, method);
                    Type a4 = a3.a();
                    if (a4 == xgo.class || a4 == xal.class) {
                        StringBuilder sb = new StringBuilder("'");
                        sb.append(xgr.a(a4).getName());
                        sb.append("' is not a valid response body type. Did you mean ResponseBody?");
                        throw xgr.a(method, sb.toString(), new Object[0]);
                    }
                    if (a2.a.equals("HEAD")) {
                        if (!Void.class.equals(a4)) {
                            throw xgr.a(method, "HEAD method must use Void as response type.", new Object[0]);
                        }
                    }
                    xgq<?> xgg = new xgg<>(a2, this.a, a3, xgg.a(this, method, a4));
                    this.g.put(method, xgg);
                    xgq = xgg;
                } else {
                    throw xgr.a(method, "Service methods cannot return void.", new Object[0]);
                }
            }
        }
        return xgq;
    }
}
