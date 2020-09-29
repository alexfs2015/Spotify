package io.netty.util;

public final class Signal extends Error implements wvi<Signal> {
    private static final wvj<Signal> a = new wvj<Signal>() {
        public final /* synthetic */ wvi a(int i, String str) {
            return new Signal(i, str, 0);
        }
    };
    private static final long serialVersionUID = -221145131122459977L;
    private final a constant;

    static final class a extends wva<a> {
        a(int i, String str) {
            super(i, str);
        }
    }

    private Signal(int i, String str) {
        this.constant = new a(i, str);
    }

    /* synthetic */ Signal(int i, String str, byte b) {
        this(i, str);
    }

    public static Signal a(Class<?> cls, String str) {
        wvj<Signal> wvj = a;
        if (cls == null) {
            throw new NullPointerException("firstNameComponent");
        } else if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append('#');
            sb.append(str);
            return (Signal) wvj.a(sb.toString());
        } else {
            throw new NullPointerException("secondNameComponent");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        Signal signal = (Signal) obj;
        if (this == signal) {
            return 0;
        }
        return this.constant.compareTo(signal.constant);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final Throwable initCause(Throwable th) {
        return this;
    }

    public final String toString() {
        return this.constant.v;
    }
}
