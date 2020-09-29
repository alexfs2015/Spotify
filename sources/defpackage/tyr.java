package defpackage;

import android.net.Uri;

/* renamed from: tyr reason: default package */
abstract class tyr extends tzf {
    final Uri a;

    tyr(Uri uri) {
        if (uri != null) {
            this.a = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* access modifiers changed from: protected */
    public final Uri a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UriImageSource{uri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tzf)) {
            return false;
        }
        return this.a.equals(((tzf) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
