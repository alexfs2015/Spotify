package defpackage;

import android.net.Uri;

/* renamed from: ulm reason: default package */
abstract class ulm extends uma {
    final Uri a;

    ulm(Uri uri) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uma)) {
            return false;
        }
        return this.a.equals(((uma) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UriImageSource{uri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
