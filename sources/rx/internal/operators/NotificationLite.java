package rx.internal.operators;

import java.io.Serializable;

public final class NotificationLite {
    private static final Object a = new Serializable() {
        private static final long serialVersionUID = 1;

        public final String toString() {
            return "Notification=>Completed";
        }
    };
    private static final Object b = new Serializable() {
        private static final long serialVersionUID = 2;

        public final String toString() {
            return "Notification=>NULL";
        }
    };

    static final class OnErrorSentinel implements Serializable {
        private static final long serialVersionUID = 3;
        final Throwable e;

        public OnErrorSentinel(Throwable th) {
            this.e = th;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Notification=>Error:");
            sb.append(this.e);
            return sb.toString();
        }
    }

    public static <T> Object a(T t) {
        return t == null ? b : t;
    }

    public static Object a() {
        return a;
    }

    public static Object a(Throwable th) {
        return new OnErrorSentinel(th);
    }

    public static <T> boolean a(wue<? super T> wue, Object obj) {
        if (obj == a) {
            wue.onCompleted();
            return true;
        } else if (obj == b) {
            wue.onNext(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == OnErrorSentinel.class) {
            wue.onError(((OnErrorSentinel) obj).e);
            return true;
        } else {
            wue.onNext(obj);
            return false;
        }
    }

    public static boolean b(Object obj) {
        return obj == a;
    }

    public static boolean c(Object obj) {
        return obj instanceof OnErrorSentinel;
    }

    public static <T> T e(Object obj) {
        if (obj == b) {
            return null;
        }
        return obj;
    }

    public static Throwable f(Object obj) {
        return ((OnErrorSentinel) obj).e;
    }

    public static boolean d(Object obj) {
        return obj != null && !(obj instanceof OnErrorSentinel) && !b(obj);
    }
}
