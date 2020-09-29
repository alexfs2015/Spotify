package defpackage;

/* renamed from: vgy reason: default package */
public abstract class vgy implements vhh {

    /* renamed from: vgy$a */
    public static abstract class a {
        public abstract a a(int i);

        /* access modifiers changed from: 0000 */
        public abstract vgy a();
    }

    public abstract int a();

    public static vgy a(vhj vhj) {
        vgy a2 = new a().a(700).a(vhj.a("feature-service", "abba_max_fetch_wait", 700, 701, 700)).a();
        if (a2.a() >= 700 && a2.a() <= 701) {
            return a2;
        }
        throw new IllegalArgumentException("Value for abbaMaxFetchWait() out of bounds");
    }
}
