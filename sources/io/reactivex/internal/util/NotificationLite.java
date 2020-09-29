package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.io.Serializable;

public enum NotificationLite {
    COMPLETE;

    static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final Disposable upstream;

        DisposableNotification(Disposable disposable) {
            this.upstream = disposable;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
            sb.append(this.upstream);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        ErrorNotification(Throwable th) {
            this.e = th;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Error[");
            sb.append(this.e);
            sb.append("]");
            return sb.toString();
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ErrorNotification)) {
                return false;
            }
            return ObjectHelper.a((Object) this.e, (Object) ((ErrorNotification) obj).e);
        }
    }

    static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final wrh upstream;

        SubscriptionNotification(wrh wrh) {
            this.upstream = wrh;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Subscription[");
            sb.append(this.upstream);
            sb.append("]");
            return sb.toString();
        }
    }

    public static <T> Object a(T t) {
        return t;
    }

    public static <T> T d(Object obj) {
        return obj;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static Object a() {
        return COMPLETE;
    }

    public static Object a(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Object a(wrh wrh) {
        return new SubscriptionNotification(wrh);
    }

    public static Object a(Disposable disposable) {
        return new DisposableNotification(disposable);
    }

    public static boolean b(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean c(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static Throwable e(Object obj) {
        return ((ErrorNotification) obj).e;
    }

    public static <T> boolean a(Object obj, wrg<? super T> wrg) {
        if (obj == COMPLETE) {
            wrg.c();
            return true;
        } else if (obj instanceof ErrorNotification) {
            wrg.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            wrg.b_(obj);
            return false;
        }
    }

    public static <T> boolean a(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            observer.onNext(obj);
            return false;
        }
    }

    public static <T> boolean b(Object obj, wrg<? super T> wrg) {
        if (obj == COMPLETE) {
            wrg.c();
            return true;
        } else if (obj instanceof ErrorNotification) {
            wrg.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            wrg.a(((SubscriptionNotification) obj).upstream);
            return false;
        } else {
            wrg.b_(obj);
            return false;
        }
    }

    public static <T> boolean b(Object obj, Observer<? super T> observer) {
        if (obj == COMPLETE) {
            observer.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        } else {
            observer.onNext(obj);
            return false;
        }
    }
}
