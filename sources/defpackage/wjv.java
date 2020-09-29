package defpackage;

/* renamed from: wjv reason: default package */
public final class wjv {
    public final String a;
    public final Throwable b;
    private final Object[] c;

    static {
        new wjv(null);
    }

    wjv(String str) {
        this(str, null, null);
    }

    wjv(String str, Object[] objArr, Throwable th) {
        this.a = str;
        this.b = th;
        if (th == null) {
            this.c = objArr;
        } else if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        } else {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.c = objArr2;
        }
    }
}
