package defpackage;

/* renamed from: wuz reason: default package */
public abstract class wuz<T> implements wuy<T> {
    final wwc a;

    protected wuz(wwc wwc) {
        this.a = (wwc) wxq.a(wwc, "executor");
    }

    private wwi<T> b(String str, wws<T> wws) {
        wxq.a(str, "inetHost");
        wxq.a(wws, "promise");
        try {
            a(str, wws);
            return wws;
        } catch (Exception e) {
            return wws.c((Throwable) e);
        }
    }

    public final wwi<T> a(String str) {
        return b(str, this.a.l());
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str, wws<T> wws);

    public void close() {
    }
}
