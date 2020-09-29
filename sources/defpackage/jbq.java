package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import java.util.List;

/* renamed from: jbq reason: default package */
final class jbq extends jbp {
    private final int a;
    private final int b;
    private final Optional<Drawable> c;
    private final String d;
    private final ImmutableList<ShareCapability> e;
    private final Optional<String> f;

    /* renamed from: jbq$a */
    static final class a implements defpackage.jbp.a {
        Integer a;
        private Integer b;
        private Optional<Drawable> c = Optional.e();
        private String d;
        private ImmutableList<ShareCapability> e;
        private Optional<String> f = Optional.e();

        a() {
        }

        public final defpackage.jbp.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.jbp.a a(Optional<Drawable> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        public final defpackage.jbp.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null logId");
        }

        public final defpackage.jbp.a a(ImmutableList<ShareCapability> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null shareCapabilities");
        }

        public final defpackage.jbp.a b(Optional<String> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null packageName");
        }

        public final jbp a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" titleResId");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" logId");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" shareCapabilities");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                jbq jbq = new jbq(this.a.intValue(), this.b.intValue(), this.c, this.d, this.e, this.f, 0);
                return jbq;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    /* synthetic */ jbq(int i, int i2, Optional optional, String str, ImmutableList immutableList, Optional optional2, byte b2) {
        this(i, i2, optional, str, immutableList, optional2);
    }

    private jbq(int i, int i2, Optional<Drawable> optional, String str, ImmutableList<ShareCapability> immutableList, Optional<String> optional2) {
        this.a = i;
        this.b = i2;
        this.c = optional;
        this.d = str;
        this.e = immutableList;
        this.f = optional2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Optional<Drawable> f() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final ImmutableList<ShareCapability> g() {
        return this.e;
    }

    public final Optional<String> d() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppShareDestinationImpl{id=");
        sb.append(this.a);
        sb.append(", titleResId=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", logId=");
        sb.append(this.d);
        sb.append(", shareCapabilities=");
        sb.append(this.e);
        sb.append(", packageName=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbp) {
            jbp jbp = (jbp) obj;
            return this.a == jbp.a() && this.b == jbp.b() && this.c.equals(jbp.f()) && this.d.equals(jbp.c()) && this.e.equals(jbp.e()) && this.f.equals(jbp.d());
        }
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final /* bridge */ /* synthetic */ List e() {
        return this.e;
    }
}
