package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import java.util.List;

/* renamed from: rdu reason: default package */
final class rdu extends rdv {
    private final String a;
    private final String b;
    private final Optional<String> c;
    private final List<PlaylistModel> d;

    /* renamed from: rdu$a */
    static final class a extends defpackage.rdv.a {
        private String a;
        private String b;
        private Optional<String> c = Optional.e();
        private List<PlaylistModel> d;

        a() {
        }

        public final defpackage.rdv.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null username");
        }

        public final defpackage.rdv.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null displayName");
        }

        public final defpackage.rdv.a a(Optional<String> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null imageUrl");
        }

        public final defpackage.rdv.a a(List<PlaylistModel> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null playlists");
        }

        public final rdv a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" username");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" displayName");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playlists");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                rdu rdu = new rdu(this.a, this.b, this.c, this.d, 0);
                return rdu;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ rdu(String str, String str2, Optional optional, List list, byte b2) {
        this(str, str2, optional, list);
    }

    private rdu(String str, String str2, Optional<String> optional, List<PlaylistModel> list) {
        this.a = str;
        this.b = str2;
        this.c = optional;
        this.d = list;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Optional<String> c() {
        return this.c;
    }

    public final List<PlaylistModel> d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfilePage{username=");
        sb.append(this.a);
        sb.append(", displayName=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", playlists=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdv) {
            rdv rdv = (rdv) obj;
            return this.a.equals(rdv.a()) && this.b.equals(rdv.b()) && this.c.equals(rdv.c()) && this.d.equals(rdv.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
