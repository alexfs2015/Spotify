package defpackage;

/* renamed from: xon reason: default package */
public final class xon {
    private static final a a = new a();

    /* renamed from: xon$a */
    static final class a implements xip {
        a() {
        }

        public final boolean isUnsubscribed() {
            return true;
        }

        public final void unsubscribe() {
        }
    }

    public static xip a() {
        return xoj.a();
    }

    public static xip a(xir xir) {
        return xoj.a(xir);
    }

    public static xok a(xip... xipArr) {
        return new xok(xipArr);
    }

    public static xip b() {
        return a;
    }
}
