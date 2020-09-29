package defpackage;

/* renamed from: ajk reason: default package */
final class ajk {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final ajk d;

    public ajk(Throwable th, ajj ajj) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = ajj.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new ajk(cause, ajj) : null;
    }
}
