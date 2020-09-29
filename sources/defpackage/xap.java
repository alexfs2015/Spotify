package defpackage;

/* renamed from: xap reason: default package */
public abstract class xap implements Runnable {
    private String a;

    public xap(String str, Object... objArr) {
        this.a = xaq.a(str, objArr);
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
