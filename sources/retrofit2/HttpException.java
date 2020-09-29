package retrofit2;

public class HttpException extends RuntimeException {
    private final transient wsj<?> a;
    public final int code;
    private final String message;

    public HttpException(wsj<?> wsj) {
        wsm.a(wsj, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(wsj.a.c);
        sb.append(" ");
        sb.append(wsj.a.d);
        super(sb.toString());
        this.code = wsj.a.c;
        this.message = wsj.a.d;
        this.a = wsj;
    }
}
