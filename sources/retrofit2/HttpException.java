package retrofit2;

public class HttpException extends RuntimeException {
    private final transient xgo<?> a;
    public final int code;
    private final String message;

    public HttpException(xgo<?> xgo) {
        xgr.a(xgo, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(xgo.a.c);
        sb.append(" ");
        sb.append(xgo.a.d);
        super(sb.toString());
        this.code = xgo.a.c;
        this.message = xgo.a.d;
        this.a = xgo;
    }
}
