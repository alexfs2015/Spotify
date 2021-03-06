package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wep reason: default package */
public final class wep {
    private final Charset a;
    private final String b;
    private final List<a> c;

    /* renamed from: wep$a */
    static final class a {
        final String a;
        final String b;

        a(String str, String str2) {
            this.b = str2;
            this.a = str;
        }
    }

    public wep(String str) {
        this(str, wdv.a);
    }

    private wep(String str, Charset charset) {
        this.c = new ArrayList();
        if (str == null) {
            throw new NullPointerException("getUri");
        } else if (charset != null) {
            this.b = str;
            this.a = charset;
        } else {
            throw new NullPointerException("charset");
        }
    }

    public final void a(String str, String str2) {
        this.c.add(new a(str, str2));
    }

    public final String toString() {
        if (this.c.isEmpty()) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(this.b);
        sb.append('?');
        for (int i = 0; i < this.c.size(); i++) {
            a aVar = (a) this.c.get(i);
            sb.append(a(aVar.a, this.a));
            if (aVar.b != null) {
                sb.append('=');
                sb.append(a(aVar.b, this.a));
            }
            if (i != this.c.size() - 1) {
                sb.append('&');
            }
        }
        return sb.toString();
    }

    private static String a(String str, Charset charset) {
        try {
            return URLEncoder.encode(str, charset.name()).replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
            throw new UnsupportedCharsetException(charset.name());
        }
    }
}
