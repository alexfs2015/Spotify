package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: xgl reason: default package */
class xgl {
    private static final xgl a = f();

    /* renamed from: xgl$a */
    static class a extends xgl {

        /* renamed from: xgl$a$a reason: collision with other inner class name */
        static class C0090a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            C0090a() {
            }

            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.xga.a> a(Executor executor) {
            if (executor != null) {
                xgf xgf = new xgf(executor);
                if (VERSION.SDK_INT < 24) {
                    return Collections.singletonList(xgf);
                }
                return Arrays.asList(new defpackage.xga.a[]{xgc.a, xgf});
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Method method) {
            if (VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }

        public final Executor b() {
            return new C0090a();
        }

        /* access modifiers changed from: 0000 */
        public final int c() {
            return VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.xgd.a> d() {
            return VERSION.SDK_INT >= 24 ? Collections.singletonList(xgj.a) : Collections.emptyList();
        }

        /* access modifiers changed from: 0000 */
        public final int e() {
            return VERSION.SDK_INT >= 24 ? 1 : 0;
        }
    }

    /* renamed from: xgl$b */
    static class b extends xgl {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public final Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.xga.a> a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(xgc.a);
            if (executor != null) {
                arrayList.add(new xgf(executor));
            } else {
                arrayList.add(xge.a);
            }
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: 0000 */
        public final int c() {
            return 2;
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.xgd.a> d() {
            return Collections.singletonList(xgj.a);
        }

        /* access modifiers changed from: 0000 */
        public final int e() {
            return 1;
        }
    }

    xgl() {
    }

    static xgl a() {
        return a;
    }

    private static xgl f() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new b();
        } catch (ClassNotFoundException unused2) {
            return new xgl();
        }
    }

    /* access modifiers changed from: 0000 */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public List<? extends defpackage.xga.a> a(Executor executor) {
        return executor != null ? Collections.singletonList(new xgf(executor)) : Collections.singletonList(xge.a);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Method method) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    public Executor b() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public int c() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public List<? extends defpackage.xgd.a> d() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    public int e() {
        return 0;
    }
}
