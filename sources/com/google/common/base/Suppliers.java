package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

public final class Suppliers {

    static class MemoizingSupplier<T> implements fbd<T>, Serializable {
        private static final long serialVersionUID = 0;
        private volatile transient boolean a;
        private transient T b;
        final fbd<T> delegate;

        MemoizingSupplier(fbd<T> fbd) {
            this.delegate = (fbd) fay.a(fbd);
        }

        public T get() {
            if (!this.a) {
                synchronized (this) {
                    if (!this.a) {
                        T t = this.delegate.get();
                        this.b = t;
                        this.a = true;
                        return t;
                    }
                }
            }
            return this.b;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (this.a) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.b);
                sb2.append(">");
                obj = sb2.toString();
            } else {
                obj = this.delegate;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static class SupplierOfInstance<T> implements fbd<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        public T get() {
            return this.instance;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierOfInstance)) {
                return false;
            }
            return faw.a(this.instance, ((SupplierOfInstance) obj).instance);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.instance});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
            sb.append(this.instance);
            sb.append(")");
            return sb.toString();
        }
    }

    static class a<T> implements fbd<T> {
        private volatile fbd<T> a;
        private volatile boolean b;
        private T c;

        a(fbd<T> fbd) {
            this.a = (fbd) fay.a(fbd);
        }

        public final T get() {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        T t = this.a.get();
                        this.c = t;
                        this.b = true;
                        this.a = null;
                        return t;
                    }
                }
            }
            return this.c;
        }

        public final String toString() {
            Object obj = this.a;
            StringBuilder sb = new StringBuilder("Suppliers.memoize(");
            if (obj == null) {
                StringBuilder sb2 = new StringBuilder("<supplier that returned ");
                sb2.append(this.c);
                sb2.append(">");
                obj = sb2.toString();
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> fbd<T> a(fbd<T> fbd) {
        if ((fbd instanceof a) || (fbd instanceof MemoizingSupplier)) {
            return fbd;
        }
        return fbd instanceof Serializable ? new MemoizingSupplier(fbd) : new a(fbd);
    }

    public static <T> fbd<T> a(T t) {
        return new SupplierOfInstance(t);
    }
}
