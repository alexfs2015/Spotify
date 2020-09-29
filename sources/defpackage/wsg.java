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

/* renamed from: wsg reason: default package */
class wsg {
    private static final wsg a = f();

    /* renamed from: wsg$a */
    static class a extends wsg {

        /* renamed from: wsg$a$a reason: collision with other inner class name */
        static class C0087a implements Executor {
            private final Handler a = new Handler(Looper.getMainLooper());

            C0087a() {
            }

            public final void execute(Runnable runnable) {
                this.a.post(runnable);
            }
        }

        a() {
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Method method) {
            if (VERSION.SDK_INT < 24) {
                return false;
            }
            return method.isDefault();
        }

        public final Executor b() {
            return new C0087a();
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.wrv.a> a(Executor executor) {
            if (executor != null) {
                wsa wsa = new wsa(executor);
                if (VERSION.SDK_INT < 24) {
                    return Collections.singletonList(wsa);
                }
                return Arrays.asList(new defpackage.wrv.a[]{wrx.a, wsa});
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        public final int c() {
            return VERSION.SDK_INT >= 24 ? 2 : 1;
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.wry.a> d() {
            if (VERSION.SDK_INT >= 24) {
                return Collections.singletonList(wse.a);
            }
            return Collections.emptyList();
        }

        /* access modifiers changed from: 0000 */
        public final int e() {
            return VERSION.SDK_INT >= 24 ? 1 : 0;
        }
    }

    /* renamed from: wsg$b */
    static class b extends wsg {
        /* access modifiers changed from: 0000 */
        public final int c() {
            return 2;
        }

        /* access modifiers changed from: 0000 */
        public final int e() {
            return 1;
        }

        b() {
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: 0000 */
        public final Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.wrv.a> a(Executor executor) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(wrx.a);
            if (executor != null) {
                arrayList.add(new wsa(executor));
            } else {
                arrayList.add(wrz.a);
            }
            return Collections.unmodifiableList(arrayList);
        }

        /* access modifiers changed from: 0000 */
        public final List<? extends defpackage.wry.a> d() {
            return Collections.singletonList(wse.a);
        }
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
    public int e() {
        return 0;
    }

    wsg() {
    }

    static wsg a() {
        return a;
    }

    private static wsg f() {
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
            return new wsg();
        }
    }

    /* access modifiers changed from: 0000 */
    public List<? extends defpackage.wrv.a> a(Executor executor) {
        if (executor != null) {
            return Collections.singletonList(new wsa(executor));
        }
        return Collections.singletonList(wrz.a);
    }

    /* access modifiers changed from: 0000 */
    public List<? extends defpackage.wry.a> d() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: 0000 */
    public Object a(Method method, Class<?> cls, Object obj, Object... objArr) {
        throw new UnsupportedOperationException();
    }
}
