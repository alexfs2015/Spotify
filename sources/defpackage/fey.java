package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fey reason: default package */
public final class fey<T> {
    final Set<Class<? super T>> a;
    final Set<ffc> b;
    final ffa<T> c;
    final Set<Class<?>> d;
    private final int e;

    /* renamed from: fey$a */
    public static class a<T> {
        private final Set<Class<? super T>> a;
        private final Set<ffc> b;
        private int c;
        private ffa<T> d;
        private Set<Class<?>> e;

        /* synthetic */ a(Class cls, Class[] clsArr, byte b2) {
            this(cls, clsArr);
        }

        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.e = new HashSet();
            String str = "Null interface";
            bwx.a(cls, (Object) str);
            this.a.add(cls);
            for (Class<? super T> a2 : clsArr) {
                bwx.a(a2, (Object) str);
            }
            Collections.addAll(this.a, clsArr);
        }

        public final a<T> a(ffc ffc) {
            bwx.a(ffc, (Object) "Null dependency");
            bwx.b(!this.a.contains(ffc.a), "Components are not allowed to depend on interfaces they themselves provide.");
            this.b.add(ffc);
            return this;
        }

        public a<T> a(int i) {
            bwx.a(this.c == 0, (Object) "Instantiation type has already been set.");
            this.c = i;
            return this;
        }

        public final a<T> a(ffa<T> ffa) {
            this.d = (ffa) bwx.a(ffa, (Object) "Null factory");
            return this;
        }

        public final fey<T> a() {
            bwx.a(this.d != null, (Object) "Missing required property: factory.");
            fey fey = new fey(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, 0);
            return fey;
        }
    }

    /* synthetic */ fey(Set set, Set set2, int i, ffa ffa, Set set3, byte b2) {
        this(set, set2, i, ffa, set3);
    }

    private fey(Set<Class<? super T>> set, Set<ffc> set2, int i, ffa<T> ffa, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.e = i;
        this.c = ffa;
        this.d = Collections.unmodifiableSet(set3);
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

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0], 0);
    }

    private static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr, 0);
    }

    @SafeVarargs
    public static <T> fey<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        return a(cls, clsArr).a(ffe.a((Object) t)).a();
    }
}
