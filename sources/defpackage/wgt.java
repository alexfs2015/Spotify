package defpackage;

/* renamed from: wgt reason: default package */
public abstract class wgt<T> implements wgs<T> {
    final whw a;

    /* access modifiers changed from: protected */
    public abstract void a(String str, wim<T> wim);

    public void close() {
    }

    protected wgt(whw whw) {
        this.a = (whw) wjk.a(whw, "executor");
    }

    private wic<T> b(String str, wim<T> wim) {
        wjk.a(str, "inetHost");
        wjk.a(wim, "promise");
        try {
            a(str, wim);
            return wim;
        } catch (Exception e) {
            return wim.c((Throwable) e);
        }
    }

    public final wic<T> a(String str) {
        return b(str, this.a.l());
    }
}
