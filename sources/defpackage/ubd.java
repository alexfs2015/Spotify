package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b;
import com.spotify.music.sociallistening.model.Participant;

/* renamed from: ubd reason: default package */
public final class ubd extends b {
    private final boolean b;
    private final ImmutableList<Participant> c;
    private final boolean d;
    private final Optional<Integer> e;
    private final Optional<String> f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    /* renamed from: ubd$a */
    public static final class a extends com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a {
        private Boolean a;
        private ImmutableList<Participant> b;
        private Boolean c;
        private Optional<Integer> d;
        private Optional<String> e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }

        public a() {
            this.d = Optional.e();
            this.e = Optional.e();
        }

        private a(b bVar) {
            this.d = Optional.e();
            this.e = Optional.e();
            this.a = Boolean.valueOf(bVar.a());
            this.b = bVar.b();
            this.c = Boolean.valueOf(bVar.c());
            this.d = bVar.d();
            this.e = bVar.e();
            this.f = Boolean.valueOf(bVar.f());
            this.g = Boolean.valueOf(bVar.g());
            this.h = Boolean.valueOf(bVar.h());
            this.i = Boolean.valueOf(bVar.i());
            this.j = Boolean.valueOf(bVar.j());
            this.k = Boolean.valueOf(bVar.k());
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a a(ImmutableList<Participant> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null participants");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a a(Optional<Integer> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null scannableBgColor");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a b(Optional<String> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null scannableImageUrl");
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a d(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a f(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a g(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a h(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showing");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" participants");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isGroupSession");
                str = sb3.toString();
            }
            if (this.f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" loadingIndicatorVisible");
                str = sb4.toString();
            }
            if (this.g == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" scannableVisible");
                str = sb5.toString();
            }
            if (this.h == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" scanCodeButtonVisible");
                str = sb6.toString();
            }
            if (this.i == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" leaveButtonVisible");
                str = sb7.toString();
            }
            if (this.j == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" leaveEndVisible");
                str = sb8.toString();
            }
            if (this.k == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" errorVisible");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                ubd ubd = new ubd(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), 0);
                return ubd;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    /* synthetic */ ubd(boolean z, ImmutableList immutableList, boolean z2, Optional optional, Optional optional2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, byte b2) {
        this(z, immutableList, z2, optional, optional2, z3, z4, z5, z6, z7, z8);
    }

    private ubd(boolean z, ImmutableList<Participant> immutableList, boolean z2, Optional<Integer> optional, Optional<String> optional2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.b = z;
        this.c = immutableList;
        this.d = z2;
        this.e = optional;
        this.f = optional2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
    }

    public final boolean a() {
        return this.b;
    }

    public final ImmutableList<Participant> b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final Optional<Integer> d() {
        return this.e;
    }

    public final Optional<String> e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean j() {
        return this.k;
    }

    public final boolean k() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UIState{showing=");
        sb.append(this.b);
        sb.append(", participants=");
        sb.append(this.c);
        sb.append(", isGroupSession=");
        sb.append(this.d);
        sb.append(", scannableBgColor=");
        sb.append(this.e);
        sb.append(", scannableImageUrl=");
        sb.append(this.f);
        sb.append(", loadingIndicatorVisible=");
        sb.append(this.g);
        sb.append(", scannableVisible=");
        sb.append(this.h);
        sb.append(", scanCodeButtonVisible=");
        sb.append(this.i);
        sb.append(", leaveButtonVisible=");
        sb.append(this.j);
        sb.append(", leaveEndVisible=");
        sb.append(this.k);
        sb.append(", errorVisible=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.b == bVar.a() && this.c.equals(bVar.b()) && this.d == bVar.c() && this.e.equals(bVar.d()) && this.f.equals(bVar.e()) && this.g == bVar.f() && this.h == bVar.g() && this.i == bVar.h() && this.j == bVar.i() && this.k == bVar.j() && this.l == bVar.k();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final com.spotify.music.sociallistening.delegate.domain.SocialListeningDeviceModel.b.a l() {
        return new a(this, 0);
    }
}
