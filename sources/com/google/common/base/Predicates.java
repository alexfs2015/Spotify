package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public final class Predicates {

    static class AndPredicate<T> implements fbq<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends fbq<? super T>> components;

        private AndPredicate(List<? extends fbq<? super T>> list) {
            this.components = list;
        }

        /* synthetic */ AndPredicate(List list, byte b) {
            this(list);
        }

        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((fbq) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AndPredicate)) {
                return false;
            }
            return this.components.equals(((AndPredicate) obj).components);
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            List<? extends fbq<? super T>> list = this.components;
            StringBuilder sb = new StringBuilder("Predicates.");
            sb.append("and");
            sb.append('(');
            boolean z = true;
            for (Object next : list) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(next);
                z = false;
            }
            sb.append(')');
            return sb.toString();
        }
    }

    public static class CompositionPredicate<A, B> implements fbq<A>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<A, ? extends B> f;
        final fbq<B> p;

        private CompositionPredicate(fbq<B> fbq, Function<A, ? extends B> function) {
            this.p = (fbq) fbp.a(fbq);
            this.f = (Function) fbp.a(function);
        }

        public /* synthetic */ CompositionPredicate(fbq fbq, Function function, byte b) {
            this(fbq, function);
        }

        public boolean apply(A a) {
            return this.p.apply(this.f.apply(a));
        }

        public boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f.equals(compositionPredicate.f) && this.p.equals(compositionPredicate.p)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.p);
            sb.append("(");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    static class InstanceOfPredicate implements fbq<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) fbp.a(cls);
        }

        /* synthetic */ InstanceOfPredicate(Class cls, byte b) {
            this(cls);
        }

        public boolean apply(Object obj) {
            return this.clazz.isInstance(obj);
        }

        public boolean equals(Object obj) {
            if (obj instanceof InstanceOfPredicate) {
                if (this.clazz == ((InstanceOfPredicate) obj).clazz) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Predicates.instanceOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }
    }

    public enum ObjectPredicate implements fbq<Object> {
        ALWAYS_TRUE {
            public final boolean apply(Object obj) {
                return true;
            }

            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public final boolean apply(Object obj) {
                return false;
            }

            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public final boolean apply(Object obj) {
                return obj == null;
            }

            public final String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public final boolean apply(Object obj) {
                return obj != null;
            }

            public final String toString() {
                return "Predicates.notNull()";
            }
        }
    }

    public static <T> fbq<T> a(fbq<? super T> fbq, fbq<? super T> fbq2) {
        return new AndPredicate(Arrays.asList(new fbq[]{(fbq) fbp.a(fbq), (fbq) fbp.a(fbq2)}), 0);
    }

    public static fbq<Object> a(Class<?> cls) {
        return new InstanceOfPredicate(cls, 0);
    }
}
