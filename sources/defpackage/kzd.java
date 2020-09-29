package defpackage;

/* renamed from: kzd reason: default package */
public final class kzd {

    /* renamed from: kzd$a */
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
