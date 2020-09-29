package defpackage;

import org.apache.tomcat.jni.SSLContext;

/* renamed from: wfu reason: default package */
public final class wfu extends wfv {
    wfu(wgb wgb) {
        super(wgb);
    }

    public final void setSessionTimeout(int i) {
        if (i >= 0) {
            SSLContext.setSessionCacheTimeout(this.a.a, (long) i);
            return;
        }
        throw new IllegalArgumentException();
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

    public final int getSessionCacheSize() {
        return (int) SSLContext.getSessionCacheSize(this.a.a);
    }

    public final boolean a(byte[] bArr) {
        return SSLContext.setSessionIdContext(this.a.a, bArr);
    }
}
