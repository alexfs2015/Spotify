package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.playlist.Policy;

/* renamed from: uwx reason: default package */
abstract class uwx extends defpackage.uxc.a {
    final Optional<Policy> a;
    final Optional<vns> b;
    final String c;
    final Optional<Boolean> d;
    final Optional<Boolean> e;
    final Optional<Boolean> f;
    final Optional<Boolean> g;
    final boolean h;
    final boolean i;
    final Optional<Boolean> j;
    final Optional<Boolean> k;
    final Optional<uyd> l;
    final Optional<Integer> m;
    final int n;

    /* renamed from: uwx$a */
    static final class a implements C0081a {
        private Optional<Policy> a;
        private Optional<vns> b;
        private String c;
        private Optional<Boolean> d;
        private Optional<Boolean> e;
        private Optional<Boolean> f;
        private Optional<Boolean> g;
        private Boolean h;
        private Boolean i;
        private Optional<Boolean> j;
        private Optional<Boolean> k;
        private Optional<uyd> l;
        private Optional<Integer> m;
        private Integer n;

        /* synthetic */ a(defpackage.uxc.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.a = Optional.e();
            this.b = Optional.e();
            this.d = Optional.e();
            this.e = Optional.e();
            this.f = Optional.e();
            this.g = Optional.e();
            this.j = Optional.e();
            this.k = Optional.e();
            this.l = Optional.e();
            this.m = Optional.e();
        }

        private a(defpackage.uxc.a aVar) {
            this.a = Optional.e();
            this.b = Optional.e();
            this.d = Optional.e();
            this.e = Optional.e();
            this.f = Optional.e();
            this.g = Optional.e();
            this.j = Optional.e();
            this.k = Optional.e();
            this.l = Optional.e();
            this.m = Optional.e();
            this.a = aVar.a();
            this.b = aVar.b();
            this.c = aVar.c();
            this.d = aVar.d();
            this.e = aVar.e();
            this.f = aVar.f();
            this.g = aVar.g();
            this.h = Boolean.valueOf(aVar.h());
            this.i = Boolean.valueOf(aVar.i());
            this.j = aVar.j();
            this.k = aVar.k();
            this.l = aVar.l();
            this.m = aVar.m();
            this.n = Integer.valueOf(aVar.n());
        }

        public final C0081a a(Optional<Policy> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null policy");
        }

        public final C0081a b(Optional<vns> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null sortOrder");
        }

        public final C0081a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null textFilter");
        }

        public final C0081a c(Optional<Boolean> optional) {
            if (optional != null) {
                this.d = optional;
                return this;
            }
            throw new NullPointerException("Null availableOfflineOnly");
        }

        public final C0081a d(Optional<Boolean> optional) {
            if (optional != null) {
                this.e = optional;
                return this;
            }
            throw new NullPointerException("Null isBanned");
        }

        public final C0081a e(Optional<Boolean> optional) {
            if (optional != null) {
                this.f = optional;
                return this;
            }
            throw new NullPointerException("Null isExplicit");
        }

        public final C0081a f(Optional<Boolean> optional) {
            if (optional != null) {
                this.g = optional;
                return this;
            }
            throw new NullPointerException("Null isArtistBanned");
        }

        public final C0081a a(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final C0081a b(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final C0081a g(Optional<Boolean> optional) {
            if (optional != null) {
                this.j = optional;
                return this;
            }
            throw new NullPointerException("Null showUnavailable");
        }

        public final C0081a h(Optional<Boolean> optional) {
            if (optional != null) {
                this.k = optional;
                return this;
            }
            throw new NullPointerException("Null alwaysShowWindowed");
        }

        public final C0081a i(Optional<uyd> optional) {
            if (optional != null) {
                this.l = optional;
                return this;
            }
            throw new NullPointerException("Null range");
        }

        public final C0081a j(Optional<Integer> optional) {
            if (optional != null) {
                this.m = optional;
                return this;
            }
            throw new NullPointerException("Null originalIndexLessThan");
        }

        public final C0081a a(int i2) {
            this.n = Integer.valueOf(500);
            return this;
        }

        public final defpackage.uxc.a a() {
            String str = "";
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" textFilter");
                str = sb.toString();
            }
            if (this.h == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" includeEpisodes");
                str = sb2.toString();
            }
            if (this.i == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" includeRecs");
                str = sb3.toString();
            }
            if (this.n == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" updateThrottling");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                uwz uwz = new uwz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h.booleanValue(), this.i.booleanValue(), this.j, this.k, this.l, this.m, this.n.intValue());
                return uwz;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }

    uwx(Optional<Policy> optional, Optional<vns> optional2, String str, Optional<Boolean> optional3, Optional<Boolean> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, boolean z, boolean z2, Optional<Boolean> optional7, Optional<Boolean> optional8, Optional<uyd> optional9, Optional<Integer> optional10, int i2) {
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
                            if (optional5 != null) {
                                this.f = optional5;
                                if (optional6 != null) {
                                    this.g = optional6;
                                    this.h = z;
                                    this.i = z2;
                                    if (optional7 != null) {
                                        this.j = optional7;
                                        if (optional8 != null) {
                                            this.k = optional8;
                                            if (optional9 != null) {
                                                this.l = optional9;
                                                if (optional10 != null) {
                                                    this.m = optional10;
                                                    this.n = i2;
                                                    return;
                                                }
                                                throw new NullPointerException("Null originalIndexLessThan");
                                            }
                                            throw new NullPointerException("Null range");
                                        }
                                        throw new NullPointerException("Null alwaysShowWindowed");
                                    }
                                    throw new NullPointerException("Null showUnavailable");
                                }
                                throw new NullPointerException("Null isArtistBanned");
                            }
                            throw new NullPointerException("Null isExplicit");
                        }
                        throw new NullPointerException("Null isBanned");
                    }
                    throw new NullPointerException("Null availableOfflineOnly");
                }
                throw new NullPointerException("Null textFilter");
            }
            throw new NullPointerException("Null sortOrder");
        }
        throw new NullPointerException("Null policy");
    }

    public final Optional<Policy> a() {
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

    public final Optional<Boolean> f() {
        return this.f;
    }

    public final Optional<Boolean> g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final Optional<Boolean> j() {
        return this.j;
    }

    public final Optional<Boolean> k() {
        return this.k;
    }

    public final Optional<uyd> l() {
        return this.l;
    }

    public final Optional<Integer> m() {
        return this.m;
    }

    public final int n() {
        return this.n;
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
        sb.append(", isBanned=");
        sb.append(this.e);
        sb.append(", isExplicit=");
        sb.append(this.f);
        sb.append(", isArtistBanned=");
        sb.append(this.g);
        sb.append(", includeEpisodes=");
        sb.append(this.h);
        sb.append(", includeRecs=");
        sb.append(this.i);
        sb.append(", showUnavailable=");
        sb.append(this.j);
        sb.append(", alwaysShowWindowed=");
        sb.append(this.k);
        sb.append(", range=");
        sb.append(this.l);
        sb.append(", originalIndexLessThan=");
        sb.append(this.m);
        sb.append(", updateThrottling=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uxc.a) {
            defpackage.uxc.a aVar = (defpackage.uxc.a) obj;
            return this.a.equals(aVar.a()) && this.b.equals(aVar.b()) && this.c.equals(aVar.c()) && this.d.equals(aVar.d()) && this.e.equals(aVar.e()) && this.f.equals(aVar.f()) && this.g.equals(aVar.g()) && this.h == aVar.h() && this.i == aVar.i() && this.j.equals(aVar.j()) && this.k.equals(aVar.k()) && this.l.equals(aVar.l()) && this.m.equals(aVar.m()) && this.n == aVar.n();
        }
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003;
        if (!this.i) {
            i2 = 1237;
        }
        return ((((((((((hashCode ^ i2) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n;
    }

    public final C0081a o() {
        return new a(this, 0);
    }
}
