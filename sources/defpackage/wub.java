package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: wub reason: default package */
public abstract class wub implements SSLSessionContext {
    private static final Enumeration<byte[]> b = new a(0);
    final wuh a;
    private final wuc c;

    /* renamed from: wub$a */
    static final class a implements Enumeration<byte[]> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final boolean hasMoreElements() {
            return false;
        }

        public final /* synthetic */ Object nextElement() {
            throw new NoSuchElementException();
        }
    }

    wub(wuh wuh) {
        this.a = wuh;
        this.c = new wuc(wuh);
    }

    public Enumeration<byte[]> getIds() {
        return b;
    }

    public SSLSession getSession(byte[] bArr) {
        if (bArr != null) {
            return null;
        }
        throw new NullPointerException("bytes");
    }
}
