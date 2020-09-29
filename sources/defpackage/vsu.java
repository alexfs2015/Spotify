package defpackage;

/* renamed from: vsu reason: default package */
public abstract class vsu implements vum {

    /* renamed from: vsu$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(boolean z);

        /* access modifiers changed from: 0000 */
        public abstract vsu a();

        public abstract a b(int i);

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a d(int i);
    }

    public static vsu a(vuo vuo) {
        int a2 = vuo.a("android-perf-tracking", "bad_view_load_time", 500, 9999, 900);
        int a3 = vuo.a("android-perf-tracking", "good_view_load_time", 0, 500, 300);
        int a4 = vuo.a("android-perf-tracking", "log_trim_memory_sample_interval", 1, 10000, 100);
        int a5 = vuo.a("android-perf-tracking", "log_trim_memory_threshold", 0, 100, 60);
        String str = "android-perf-tracking";
        boolean a6 = vuo.a(str, "should_log_trim_memory_warnings", false);
        vsu a7 = new a().a(900).b(300).c(100).d(60).a(false).b(true).a(a2).b(a3).c(a4).d(a5).a(a6).b(vuo.a(str, "should_wakelocking_be_enabled", true)).a();
        if (a7.a() < 500 || a7.a() > 9999) {
            throw new IllegalArgumentException("Value for badViewLoadTime() out of bounds");
        } else if (a7.b() < 0 || a7.b() > 500) {
            throw new IllegalArgumentException("Value for goodViewLoadTime() out of bounds");
        } else if (a7.c() <= 0 || a7.c() > 10000) {
            throw new IllegalArgumentException("Value for logTrimMemorySampleInterval() out of bounds");
        } else if (a7.d() >= 0 && a7.d() <= 100) {
            return a7;
        } else {
            throw new IllegalArgumentException("Value for logTrimMemoryThreshold() out of bounds");
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();
}
