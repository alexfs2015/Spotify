package defpackage;

/* renamed from: vud reason: default package */
public abstract class vud implements vum {

    /* renamed from: vud$a */
    public static abstract class a {
        public abstract a a(int i);

        /* access modifiers changed from: 0000 */
        public abstract vud a();
    }

    public static vud a(vuo vuo) {
        vud a2 = new a().a(700).a(vuo.a("feature-service", "abba_max_fetch_wait", 700, 701, 700)).a();
        if (a2.a() >= 700 && a2.a() <= 701) {
            return a2;
        }
        throw new IllegalArgumentException("Value for abbaMaxFetchWait() out of bounds");
    }

    public abstract int a();
}
