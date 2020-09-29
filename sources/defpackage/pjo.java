package defpackage;

import com.spotify.music.features.profile.domain.ProfileModel;
import com.spotify.music.features.profile.domain.ProfileModel.LoadingState;

/* renamed from: pjo reason: default package */
public abstract class pjo extends ProfileModel {
    final String a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final int g;
    final int h;
    final int i;
    final boolean j;
    final LoadingState k;

    /* renamed from: pjo$a */
    public static final class a extends com.spotify.music.features.profile.domain.ProfileModel.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Boolean e;
        private Boolean f;
        private Integer g;
        private Integer h;
        private Integer i;
        private Boolean j;
        private LoadingState k;

        /* synthetic */ a(ProfileModel profileModel, byte b2) {
            this(profileModel);
        }

        public a() {
        }

        private a(ProfileModel profileModel) {
            this.a = profileModel.a();
            this.b = profileModel.b();
            this.c = profileModel.c();
            this.d = profileModel.d();
            this.e = Boolean.valueOf(profileModel.e());
            this.f = Boolean.valueOf(profileModel.f());
            this.g = Integer.valueOf(profileModel.g());
            this.h = Integer.valueOf(profileModel.h());
            this.i = Integer.valueOf(profileModel.i());
            this.j = Boolean.valueOf(profileModel.j());
            this.k = profileModel.k();
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a a(String str) {
            this.a = str;
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a d(String str) {
            this.d = str;
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a b(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a a(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a b(int i2) {
            this.h = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a c(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a c(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.profile.domain.ProfileModel.a a(LoadingState loadingState) {
            if (loadingState != null) {
                this.k = loadingState;
                return this;
            }
            throw new NullPointerException("Null loadingState");
        }

        public final ProfileModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" userUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" username");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" displayName");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" verified");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" followed");
                str = sb5.toString();
            }
            if (this.g == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" playlistsCount");
                str = sb6.toString();
            }
            if (this.h == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" followersCount");
                str = sb7.toString();
            }
            if (this.i == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" followingCount");
                str = sb8.toString();
            }
            if (this.j == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" currentUsersProfile");
                str = sb9.toString();
            }
            if (this.k == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" loadingState");
                str = sb10.toString();
            }
            if (str.isEmpty()) {
                pjp pjp = new pjp(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.booleanValue(), this.k);
                return pjp;
            }
            StringBuilder sb11 = new StringBuilder("Missing required properties:");
            sb11.append(str);
            throw new IllegalStateException(sb11.toString());
        }
    }

    pjo(String str, String str2, String str3, String str4, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, LoadingState loadingState) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    this.d = str4;
                    this.e = z;
                    this.f = z2;
                    this.g = i2;
                    this.h = i3;
                    this.i = i4;
                    this.j = z3;
                    if (loadingState != null) {
                        this.k = loadingState;
                        return;
                    }
                    throw new NullPointerException("Null loadingState");
                }
                throw new NullPointerException("Null displayName");
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null userUri");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final LoadingState k() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileModel{userUri=");
        sb.append(this.a);
        sb.append(", username=");
        sb.append(this.b);
        sb.append(", displayName=");
        sb.append(this.c);
        sb.append(", imageUrl=");
        sb.append(this.d);
        sb.append(", verified=");
        sb.append(this.e);
        sb.append(", followed=");
        sb.append(this.f);
        sb.append(", playlistsCount=");
        sb.append(this.g);
        sb.append(", followersCount=");
        sb.append(this.h);
        sb.append(", followingCount=");
        sb.append(this.i);
        sb.append(", currentUsersProfile=");
        sb.append(this.j);
        sb.append(", loadingState=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProfileModel) {
            ProfileModel profileModel = (ProfileModel) obj;
            if (this.a.equals(profileModel.a()) && this.b.equals(profileModel.b()) && this.c.equals(profileModel.c())) {
                String str = this.d;
                if (str != null ? str.equals(profileModel.d()) : profileModel.d() == null) {
                    return this.e == profileModel.e() && this.f == profileModel.f() && this.g == profileModel.g() && this.h == profileModel.h() && this.i == profileModel.i() && this.j == profileModel.j() && this.k.equals(profileModel.k());
                }
            }
        }
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 1231;
        int hashCode2 = (((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003;
        if (!this.j) {
            i2 = 1237;
        }
        return ((hashCode2 ^ i2) * 1000003) ^ this.k.hashCode();
    }

    public final com.spotify.music.features.profile.domain.ProfileModel.a l() {
        return new a(this, 0);
    }
}
