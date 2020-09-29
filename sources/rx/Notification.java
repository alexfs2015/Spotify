package rx;

public final class Notification<T> {
    private static final Notification<Void> d = new Notification<>(Kind.OnCompleted, null, null);
    public final Kind a;
    public final Throwable b;
    private final T c;

    public enum Kind {
        OnNext,
        OnError,
        OnCompleted
    }

    private Notification(Kind kind, T t, Throwable th) {
        this.c = t;
        this.b = th;
        this.a = kind;
    }

    public static <T> Notification<T> a() {
        return d;
    }

    public static <T> Notification<T> a(T t) {
        return new Notification<>(Kind.OnNext, null, null);
    }

    public static <T> Notification<T> a(Throwable th) {
        return new Notification<>(Kind.OnError, null, th);
    }

    private boolean c() {
        return (this.a == Kind.OnNext) && this.c != null;
    }

    private boolean d() {
        return b() && this.b != null;
    }

    public final boolean b() {
        return this.a == Kind.OnError;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Notification notification = (Notification) obj;
        if (notification.a == this.a) {
            T t = this.c;
            T t2 = notification.c;
            if (t == t2 || (t != null && t.equals(t2))) {
                Throwable th = this.b;
                Throwable th2 = notification.b;
                if (th == th2 || (th != null && th.equals(th2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        if (c()) {
            hashCode = (hashCode * 31) + this.c.hashCode();
        }
        return d() ? (hashCode * 31) + this.b.hashCode() : hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(this.a);
        if (c()) {
            sb.append(' ');
            sb.append(this.c);
        }
        if (d()) {
            sb.append(' ');
            sb.append(this.b.getMessage());
        }
        sb.append(']');
        return sb.toString();
    }
}
