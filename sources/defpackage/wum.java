package defpackage;

/* renamed from: wum reason: default package */
public final class wum {
    public static final wum a = new wum();
    private final Throwable b;

    private wum() {
        this.b = null;
    }

    public wum(Throwable th) {
        if (th != null) {
            this.b = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public final String toString() {
        Throwable th = this.b;
        if (th == null) {
            return "SslHandshakeCompletionEvent(SUCCESS)";
        }
        StringBuilder sb = new StringBuilder("SslHandshakeCompletionEvent(");
        sb.append(th);
        sb.append(')');
        return sb.toString();
    }
}
