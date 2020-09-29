package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: wfv reason: default package */
public abstract class wfv implements SSLSessionContext {
    private static final Enumeration<byte[]> b = new a(0);
    final wgb a;
    private final wfw c;

    /* renamed from: wfv$a */
    static final class a implements Enumeration<byte[]> {
        public final boolean hasMoreElements() {
            return false;
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object nextElement() {
            throw new NoSuchElementException();
        }
    }

    wfv(wgb wgb) {
        this.a = wgb;
        this.c = new wfw(wgb);
    }

    public SSLSession getSession(byte[] bArr) {
        if (bArr != null) {
            return null;
        }
        throw new NullPointerException("bytes");
    }

    public Enumeration<byte[]> getIds() {
        return b;
    }
}
