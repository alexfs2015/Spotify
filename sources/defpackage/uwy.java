package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;

/* renamed from: uwy reason: default package */
abstract class uwy extends defpackage.uxn.a {
    final Optional<RootlistRequestPayload> a;
    final Optional<vns> b;
    final String c;
    final Optional<Boolean> d;
    final Optional<Boolean> e;
    final boolean f;
    final Optional<uyd> g;
    final int h;

    /* renamed from: uwy$a */
    static final class a implements C0082a {
        private Optional<RootlistRequestPayload> a = Optional.e();
        private Optional<vns> b = Optional.e();
        private String c;
        private Optional<Boolean> d = Optional.e();
        private Optional<Boolean> e = Optional.e();
        private Boolean f;
        private Optional<uyd> g = Optional.e();
        private Integer h;

        a() {
        }

        public final C0082a a(Optional<RootlistRequestPayload> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null policy");
        }

        public final C0082a b(Optional<vns> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final C0082a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final C0082a c(Optional<Boolean> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null availableOfflineOnly");
        }

        public final C0082a d(Optional<Boolean> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null isWritable");
        }

        public final C0082a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final C0082a e(Optional<uyd> optional) {
            if (optional != null) {
                this.g = optional;
                return this;
            }
            throw new NullPointerException("Null range");
        }

        public final C0082a a(int i) {
            this.h = Integer.valueOf(i);
            return this;
        }

        public final defpackage.uxn.a a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" textFilter");
                str = sb.toString();
            }
            if (this.f == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" flattenTree");
                str = sb2.toString();
            }
            if (this.h == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" updateThrottling");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                uxb uxb = new uxb(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g, this.h.intValue());
                return uxb;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    uwy(Optional<RootlistRequestPayload> optional, Optional<vns> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, boolean z, Optional<uyd> optional5, int i) {
        if (optional != null) {
            this.a = optional;
            if (optional2 != null) {
                this.b = optional2;
                if (str != null) {
                    this.c = str;
                    if (optional3 != null) {
                        this.d = optional3;
                        if (optional4 != null) {
                            this.e = optional4;
                            this.f = z;
                            if (optional5 != null) {
                                this.g = optional5;
                                this.h = i;
                                return;
                            }
                            throw new NullPointerException("Null range");
                        }
                        throw new NullPointerException("Null isWritable");
                    }
                    throw new NullPointerException("Null availableOfflineOnly");
                }
                throw new NullPointerException("Null textFilter");
            }
            throw new NullPointerException("Null sortOrder");
        }
        throw new NullPointerException("Null policy");
    }

    public final Optional<RootlistRequestPayload> a() {
        return this.a;
    }

    public final Optional<vns> b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Optional<Boolean> d() {
        return this.d;
    }

    public final Optional<Boolean> e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final Optional<uyd> g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration{policy=");
        sb.append(this.a);
        sb.append(", sortOrder=");
        sb.append(this.b);
        sb.append(", textFilter=");
        sb.append(this.c);
        sb.append(", availableOfflineOnly=");
        sb.append(this.d);
        sb.append(", isWritable=");
        sb.append(this.e);
        sb.append(", flattenTree=");
        sb.append(this.f);
        sb.append(", range=");
        sb.append(this.g);
        sb.append(", updateThrottling=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uxn.a) {
            defpackage.uxn.a aVar = (defpackage.uxn.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c()) && this.d.equals(aVar.d()) && this.e.equals(aVar.e()) && this.f == aVar.f() && this.g.equals(aVar.g()) && this.h == aVar.h();
        }
    }

    public int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }
}
