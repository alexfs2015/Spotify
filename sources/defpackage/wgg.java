package defpackage;

/* renamed from: wgg reason: default package */
public final class wgg {
    public static final wgg a = new wgg();
    private final Throwable b;

    private wgg() {
        this.b = null;
    }

    public wgg(Throwable th) {
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
