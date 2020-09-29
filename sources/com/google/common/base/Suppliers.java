package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

public final class Suppliers {

    static class MemoizingSupplier<T> implements fbu<T>, Serializable {
        private static final long serialVersionUID = 0;
        private volatile transient boolean a;
        private transient T b;
        final fbu<T> delegate;

        MemoizingSupplier(fbu<T> fbu) {
            this.delegate = (fbu) fbp.a(fbu);
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

    static class SupplierOfInstance<T> implements fbu<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SupplierOfInstance)) {
                return false;
            }
            return fbn.a(this.instance, ((SupplierOfInstance) obj).instance);
        }

        public T get() {
            return this.instance;
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

    static class a<T> implements fbu<T> {
        private volatile fbu<T> a;
        private volatile boolean b;
        private T c;

        a(fbu<T> fbu) {
            this.a = (fbu) fbp.a(fbu);
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

    public static <T> fbu<T> a(fbu<T> fbu) {
        return ((fbu instanceof a) || (fbu instanceof MemoizingSupplier)) ? fbu : fbu instanceof Serializable ? new MemoizingSupplier(fbu) : new a(fbu);
    }

    public static <T> fbu<T> a(T t) {
        return new SupplierOfInstance(t);
    }
}
