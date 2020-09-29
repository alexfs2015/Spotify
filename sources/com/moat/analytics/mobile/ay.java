package com.moat.analytics.mobile;

import com.moat.analytics.mobile.ay$com.moat.analytics.mobile.bb;
import com.moat.analytics.mobile.base.asserts.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;

class ay<T> implements InvocationHandler {
    /* access modifiers changed from: private */
    public static final Object[] a = new Object[0];
    private final ap b;
    private final ba<T> c;
    private final bc<T> d;
    private final LinkedList<bb> e = new LinkedList<>();
    private final LinkedList<bb> f = new LinkedList<>();
    /* access modifiers changed from: private */
    public boolean g;
    private T h;

    ay(ap apVar, ba<T> baVar, bc<T> bcVar) {
        a.a(apVar);
        a.a(baVar);
        a.a(bcVar);
        this.b = apVar;
        this.c = baVar;
        this.d = bcVar;
        apVar.a(new az(this));
    }

    static <T> T a(ap apVar, ba<T> baVar, bc<T> bcVar) {
        Class a2 = bcVar.a();
        ClassLoader classLoader = a2.getClassLoader();
        ay ayVar = new ay(apVar, baVar, bcVar);
        return Proxy.newProxyInstance(classLoader, new Class[]{a2}, ayVar);
    }

    private Object a(Method method) {
        try {
            if (Boolean.TYPE.equals(method.getReturnType())) {
                return Boolean.TRUE;
            }
        } catch (Exception e2) {
            com.moat.analytics.mobile.base.exception.a.a(e2);
        }
        return null;
    }

    private Object a(Method method, Object[] objArr) {
        if (Object.class.equals(method.getDeclaringClass())) {
            String name = method.getName();
            Class a2 = this.d.a();
            if ("getClass".equals(name)) {
                return a2;
            }
            boolean equals = "toString".equals(name);
            Object invoke = method.invoke(this, objArr);
            if (equals) {
                String name2 = ay.class.getName();
                String name3 = a2.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(invoke);
                invoke = sb.toString().replace(name2, name3);
            }
            return invoke;
        } else if (!this.g || this.h != null) {
            if (this.b.a() == ar.ON) {
                b();
                T t = this.h;
                if (t != null) {
                    return method.invoke(t, objArr);
                }
            }
            if (this.b.a() == ar.OFF && (!this.g || this.h != null)) {
                b(method, objArr);
            }
            return a(method);
        } else {
            c();
            return a(method);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (!this.g) {
            try {
                this.h = this.c.a().c(null);
            } catch (Exception unused) {
            }
            this.g = true;
        }
        if (this.h != null) {
            LinkedList<LinkedList> linkedList = new LinkedList<>();
            linkedList.add(this.e);
            linkedList.add(this.f);
            for (LinkedList linkedList2 : linkedList) {
                Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    bb bbVar = (bb) it.next();
                    try {
                        Object[] objArr = new Object[bbVar.b.length];
                        WeakReference[] a2 = bbVar.b;
                        int length = a2.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            objArr[i2] = a2[i].get();
                            i++;
                            i2 = i3;
                        }
                        bbVar.c.invoke(this.h, objArr);
                    } catch (Exception unused2) {
                    }
                }
                linkedList2.clear();
            }
        }
    }

    private void b(Method method, Object[] objArr) {
        LinkedList<bb> linkedList;
        bb bbVar;
        if (this.e.size() < 5) {
            linkedList = this.e;
            bbVar = new bb(this, method, objArr, null);
        } else {
            if (this.f.size() >= 10) {
                this.f.removeFirst();
            }
            linkedList = this.f;
            bbVar = new bb(this, method, objArr, null);
        }
        linkedList.add(bbVar);
    }

    private void c() {
        this.e.clear();
        this.f.clear();
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return a(method, objArr);
        } catch (Exception e2) {
            com.moat.analytics.mobile.base.exception.a.a(e2);
            return a(method);
        }
    }
}
