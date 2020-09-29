package defpackage;

import android.util.Property;

/* renamed from: shr reason: default package */
public interface shr {
    public static final Property<shr, Float> c = new Property<shr, Float>(Float.class, "alpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(((shr) obj).e());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((shr) obj).a(((Float) obj2).floatValue());
        }
    };

    @FunctionalInterface
    /* renamed from: shr$a */
    public interface a {

        /* renamed from: shr$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(a aVar, boolean z) {
            }

            public static void $default$ah(a aVar) {
            }

            public static void $default$c(a aVar, String str) {
            }
        }

        void a(boolean z);

        void ah();

        void c(String str);

        void onQueryChanged(String str);
    }

    /* renamed from: shr$b */
    public interface b {
        boolean onToolbarUpButtonPressed();
    }

    void a();

    void a(float f);

    void a(int i);

    void a(String str, boolean z);

    void a(a aVar);

    void b(int i);

    void b(String str);

    void b(a aVar);

    void b(boolean z);

    float e();

    boolean f();

    String h();
}
