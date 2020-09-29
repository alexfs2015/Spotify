package defpackage;

import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import java.util.List;

/* renamed from: jec reason: default package */
final class jec extends jeb {
    private final int a;
    private final int b;
    private final Drawable c;
    private final String d;
    private final ImmutableList<ShareCapability> e;
    private final Optional<String> f;

    /* renamed from: jec$a */
    static final class a implements defpackage.jeb.a {
        Integer a;
        private Integer b;
        private Drawable c;
        private String d;
        private ImmutableList<ShareCapability> e;
        private Optional<String> f = Optional.e();

        a() {
        }

        public final defpackage.jeb.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.jeb.a a(Drawable drawable) {
            if (drawable != null) {
                this.c = drawable;
                return this;
            }
            throw new NullPointerException("Null icon");
        }

        public final defpackage.jeb.a a(Optional<String> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null packageName");
        }

        public final defpackage.jeb.a a(ImmutableList<ShareCapability> immutableList) {
            if (immutableList != null) {
                this.e = immutableList;
                return this;
            }
            throw new NullPointerException("Null shareCapabilities");
        }

        public final defpackage.jeb.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null logId");
        }

        public final jeb a() {
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
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" icon");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" logId");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" shareCapabilities");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                jec jec = new jec(this.a.intValue(), this.b.intValue(), this.c, this.d, this.e, this.f, 0);
                return jec;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private jec(int i, int i2, Drawable drawable, String str, ImmutableList<ShareCapability> immutableList, Optional<String> optional) {
        this.a = i;
        this.b = i2;
        this.c = drawable;
        this.d = str;
        this.e = immutableList;
        this.f = optional;
    }

    /* synthetic */ jec(int i, int i2, Drawable drawable, String str, ImmutableList immutableList, Optional optional, byte b2) {
        this(i, i2, drawable, str, immutableList, optional);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Drawable c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Optional<String> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jeb) {
            jeb jeb = (jeb) obj;
            return this.a == jeb.a() && this.b == jeb.b() && this.c.equals(jeb.c()) && this.d.equals(jeb.d()) && this.e.equals(jeb.f()) && this.f.equals(jeb.e());
        }
    }

    public final /* bridge */ /* synthetic */ List f() {
        return this.e;
    }

    public final ImmutableList<ShareCapability> g() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
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
}
