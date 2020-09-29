package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;

/* renamed from: iwp reason: default package */
final class iwp extends ixc {
    private final ShareEventLogger a;
    private final ixd b;
    private final String c;
    private final String d;
    private final String e;
    private final Uri f;

    /* renamed from: iwp$a */
    static final class a extends defpackage.ixc.a {
        private ShareEventLogger a;
        private ixd b;
        private String c;
        private String d;
        private String e;
        private Uri f;

        a() {
        }

        public final defpackage.ixc.a a(ShareEventLogger shareEventLogger) {
            this.a = shareEventLogger;
            return this;
        }

        public final defpackage.ixc.a a(ixd ixd) {
            if (ixd != null) {
                this.b = ixd;
                return this;
            }
            throw new NullPointerException("Null shareable");
        }

        public final defpackage.ixc.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.ixc.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final defpackage.ixc.a c(String str) {
            this.e = str;
            return this;
        }

        public final defpackage.ixc.a a(Uri uri) {
            if (uri != null) {
                this.f = uri;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public final ixc a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" shareEventLogger");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" shareable");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" title");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" subtitle");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" imageUri");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                iwp iwp = new iwp(this.a, this.b, this.c, this.d, this.e, this.f, 0);
                return iwp;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ iwp(ShareEventLogger shareEventLogger, ixd ixd, String str, String str2, String str3, Uri uri, byte b2) {
        this(shareEventLogger, ixd, str, str2, str3, uri);
    }

    private iwp(ShareEventLogger shareEventLogger, ixd ixd, String str, String str2, String str3, Uri uri) {
        this.a = shareEventLogger;
        this.b = ixd;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = uri;
    }

    public final ShareEventLogger a() {
        return this.a;
    }

    public final ixd b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final Uri f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareSession{shareEventLogger=");
        sb.append(this.a);
        sb.append(", shareable=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", postToMessage=");
        sb.append(this.e);
        sb.append(", imageUri=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ixc) {
            ixc ixc = (ixc) obj;
            if (this.a.equals(ixc.a()) && this.b.equals(ixc.b()) && this.c.equals(ixc.c()) && this.d.equals(ixc.d())) {
                String str = this.e;
                if (str != null ? str.equals(ixc.e()) : ixc.e() == null) {
                    if (this.f.equals(ixc.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f.hashCode();
    }
}
