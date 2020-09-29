package defpackage;

/* renamed from: wmj reason: default package */
public abstract class wmj implements Runnable {
    private String a;

    /* access modifiers changed from: protected */
    public abstract void b();

    public wmj(String str, Object... objArr) {
        this.a = wmk.a(str, objArr);
    }

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
