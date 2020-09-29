package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

/* renamed from: wse reason: default package */
public final class wse {
    public static final wvc a = new wvc("authorization");
    public static final wvc b = new wvc("content-length");
    public static final wvc c = new wvc("content-type");
    public static final wvc d = new wvc("host");
    public static final wvc e = new wvc("sec-websocket-key1");
    public static final wvc f = new wvc("sec-websocket-key2");
    public static final wvc g = new wvc("sec-websocket-location");
    public static final wvc h = new wvc("sec-websocket-origin");
    public static final wvc i = new wvc("sec-websocket-accept");
    public static final wvc j = new wvc("trailer");
    public static final wvc k = new wvc("transfer-encoding");
    public static final wvc l = new wvc("upgrade");

    static {
        new wvc("accept");
        new wvc("accept-charset");
        new wvc("accept-encoding");
        new wvc("accept-language");
        new wvc("accept-ranges");
        new wvc("accept-patch");
        new wvc("access-control-allow-credentials");
        new wvc("access-control-allow-headers");
        new wvc("access-control-allow-methods");
        new wvc("access-control-allow-origin");
        new wvc("access-control-expose-headers");
        new wvc("access-control-max-age");
        new wvc("access-control-request-headers");
        new wvc("access-control-request-method");
        new wvc("age");
        new wvc("allow");
        new wvc("cache-control");
        new wvc("connection");
        new wvc("content-base");
        new wvc("content-encoding");
        new wvc("content-language");
        new wvc("content-location");
        new wvc("content-transfer-encoding");
        new wvc("content-disposition");
        new wvc("content-md5");
        new wvc("content-range");
        new wvc("cookie");
        new wvc("date");
        new wvc("etag");
        new wvc("expect");
        new wvc("expires");
        new wvc("from");
        new wvc("if-match");
        new wvc("if-modified-since");
        new wvc("if-none-match");
        new wvc("if-range");
        new wvc("if-unmodified-since");
        new wvc("keep-alive");
        new wvc("last-modified");
        new wvc("location");
        new wvc("max-forwards");
        new wvc("origin");
        new wvc("pragma");
        new wvc("proxy-authenticate");
        new wvc("proxy-authorization");
        new wvc("proxy-connection");
        new wvc("range");
        new wvc("referer");
        new wvc("retry-after");
        new wvc("sec-websocket-protocol");
        new wvc("sec-websocket-version");
        new wvc("sec-websocket-key");
        new wvc("sec-websocket-extensions");
        new wvc("server");
        new wvc("set-cookie");
        new wvc("set-cookie2");
        new wvc("te");
        new wvc("user-agent");
        new wvc("vary");
        new wvc("via");
        new wvc(LogMessage.SEVERITY_WARNING);
        new wvc("websocket-location");
        new wvc("websocket-origin");
        new wvc("websocket-protocol");
        new wvc("www-authenticate");
    }
}
