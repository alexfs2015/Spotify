package defpackage;

/* renamed from: ajy reason: default package */
final class ajy {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final ajy d;

    public ajy(Throwable th, ajx ajx) {
        this.a = th.getLocalizedMessage();
        this.b = th.getClass().getName();
        this.c = ajx.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.d = cause != null ? new ajy(cause, ajx) : null;
    }
}
