package defpackage;

/* renamed from: lcm reason: default package */
public final class lcm {

    /* renamed from: lcm$a */
    public static class a {
        public static final boolean a;

        static {
            boolean z;
            try {
                Class.forName("org.robolectric.Robolectric");
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            a = z;
        }
    }
}
