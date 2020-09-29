package defpackage;

import org.apache.tomcat.jni.SSLContext;

/* renamed from: wua reason: default package */
public final class wua extends wub {
    wua(wuh wuh) {
        super(wuh);
    }

    public final boolean a(byte[] bArr) {
        return SSLContext.setSessionIdContext(this.a.a, bArr);
    }

    public final int getSessionCacheSize() {
        return (int) SSLContext.getSessionCacheSize(this.a.a);
    }

    public final int getSessionTimeout() {
        return (int) SSLContext.getSessionCacheTimeout(this.a.a);
    }

    public final void setSessionCacheSize(int i) {
        if (i >= 0) {
            SSLContext.setSessionCacheSize(this.a.a, (long) i);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setSessionTimeout(int i) {
        if (i >= 0) {
            SSLContext.setSessionCacheTimeout(this.a.a, (long) i);
            return;
        }
        throw new IllegalArgumentException();
    }
}
