package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ffs reason: default package */
public final class ffs<T> {
    final Set<Class<? super T>> a;
    final Set<ffw> b;
    final ffu<T> c;
    final Set<Class<?>> d;
    private final int e;

    /* renamed from: ffs$a */
    public static class a<T> {
        private final Set<Class<? super T>> a;
        private final Set<ffw> b;
        private int c;
        private ffu<T> d;
        private Set<Class<?>> e;

        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.e = new HashSet();
            String str = "Null interface";
            bxo.a(cls, (Object) str);
            this.a.add(cls);
            for (Class<? super T> a2 : clsArr) {
                bxo.a(a2, (Object) str);
            }
            Collections.addAll(this.a, clsArr);
        }

        /* synthetic */ a(Class cls, Class[] clsArr, byte b2) {
            this(cls, clsArr);
        }

        public a<T> a(int i) {
            bxo.a(this.c == 0, (Object) "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        public final a<T> a(ffu<T> ffu) {
            this.d = (ffu) bxo.a(ffu, (Object) "Null factory");
            return this;
        }

        public final a<T> a(ffw ffw) {
            bxo.a(ffw, (Object) "Null dependency");
            bxo.b(!this.a.contains(ffw.a), "Components are not allowed to depend on interfaces they themselves provide.");
            this.b.add(ffw);
            return this;
        }

        public final ffs<T> a() {
            bxo.a(this.d != null, (Object) "Missing required property: factory.");
            ffs ffs = new ffs(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, 0);
            return ffs;
        }
    }

    private ffs(Set<Class<? super T>> set, Set<ffw> set2, int i, ffu<T> ffu, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.e = i;
        this.c = ffu;
        this.d = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ ffs(Set set, Set set2, int i, ffu ffu, Set set3, byte b2) {
        this(set, set2, i, ffu, set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0], 0);
    }

    private static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    public static <T> ffs<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return a(cls, clsArr).a(ffy.a((Object) t)).a();
    }

    public final boolean a() {
        return this.e == 1;
    }

    public final boolean b() {
        return this.e == 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append(">{");
        sb.append(this.e);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
