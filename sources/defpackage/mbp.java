package defpackage;

import android.net.Uri;
import com.spotify.music.libs.viewuri.ViewUris.SubView;

/* renamed from: mbp reason: default package */
abstract class mbp extends mbt {
    final SubView a;
    final String b;
    final Uri c;
    final boolean d;
    final String e;
    final Integer f;

    /* renamed from: mbp$a */
    static final class a extends defpackage.mbt.a {
        private SubView a;
        private String b;
        private Uri c;
        private Boolean d;
        private String e;
        private Integer f;

        a() {
        }

        public final defpackage.mbt.a a(SubView subView) {
            if (subView != null) {
                this.a = subView;
                return this;
            }
            throw new NullPointerException("Null subView");
        }

        public final defpackage.mbt.a a(String str) {
            this.b = str;
            return this;
        }

        public final defpackage.mbt.a a(Uri uri) {
            if (uri != null) {
                this.c = uri;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.mbt.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public final defpackage.mbt.a b(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null applicationId");
        }

        /* access modifiers changed from: 0000 */
        public final defpackage.mbt.a a(Integer num) {
            if (num != null) {
                this.f = num;
                return this;
            }
            throw new NullPointerException("Null applicationVersion");
        }

        public final mbt a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" subView");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uri");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" shouldPrependMarketCode");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" applicationId");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" applicationVersion");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                mbq mbq = new mbq(this.a, this.b, this.c, this.d.booleanValue(), this.e, this.f);
                return mbq;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    mbp(SubView subView, String str, Uri uri, boolean z, String str2, Integer num) {
        if (subView != null) {
            this.a = subView;
            this.b = str;
            if (uri != null) {
                this.c = uri;
                this.d = z;
                if (str2 != null) {
                    this.e = str2;
                    if (num != null) {
                        this.f = num;
                        return;
                    }
                    throw new NullPointerException("Null applicationVersion");
                }
                throw new NullPointerException("Null applicationId");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null subView");
    }

    public final SubView a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Uri c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final Integer f() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PremiumSignUpConfiguration{subView=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", uri=");
        sb.append(this.c);
        sb.append(", shouldPrependMarketCode=");
        sb.append(this.d);
        sb.append(", applicationId=");
        sb.append(this.e);
        sb.append(", applicationVersion=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbt) {
            mbt mbt = (mbt) obj;
            if (this.a.equals(mbt.a())) {
                String str = this.b;
                if (str != null ? str.equals(mbt.b()) : mbt.b() == null) {
                    return this.c.equals(mbt.c()) && this.d == mbt.d() && this.e.equals(mbt.e()) && this.f.equals(mbt.f());
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
