package defpackage;

import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.ProfileListItem.Type;

/* renamed from: prd reason: default package */
public abstract class prd extends ProfileListItem {
    final Type a;
    final String b;
    final String c;
    final String d;
    final String e;

    /* renamed from: prd$a */
    public static final class a extends com.spotify.music.features.profile.model.ProfileListItem.a {
        private Type a;
        private String b;
        private String c;
        private String d;
        private String e;

        public final com.spotify.music.features.profile.model.ProfileListItem.a a(Type type) {
            if (type != null) {
                this.a = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final com.spotify.music.features.profile.model.ProfileListItem.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final ProfileListItem a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" uri");
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
            if (str.isEmpty()) {
                prf prf = new prf(this.a, this.b, this.c, this.d, this.e);
                return prf;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final com.spotify.music.features.profile.model.ProfileListItem.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final com.spotify.music.features.profile.model.ProfileListItem.a c(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public final com.spotify.music.features.profile.model.ProfileListItem.a d(String str) {
            this.e = str;
            return this;
        }
    }

    prd(Type type, String str, String str2, String str3, String str4) {
        if (type != null) {
            this.a = type;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.d = str3;
                        this.e = str4;
                        return;
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null type");
    }

    public final Type a() {
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

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProfileListItem) {
            ProfileListItem profileListItem = (ProfileListItem) obj;
            if (this.a.equals(profileListItem.a()) && this.b.equals(profileListItem.b()) && this.c.equals(profileListItem.c()) && this.d.equals(profileListItem.d())) {
                String str = this.e;
                return str != null ? str.equals(profileListItem.e()) : profileListItem.e() == null;
            }
        }
    }

    public int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str = this.e;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ProfileListItem{type=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", imageUri=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
