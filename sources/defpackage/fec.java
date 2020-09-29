package defpackage;

/* renamed from: fec reason: default package */
final class fec {
    private static final ThreadLocal<char[]> a = new ThreadLocal<char[]>() {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new char[1024];
        }
    };

    static char[] a() {
        return (char[]) a.get();
    }
}
