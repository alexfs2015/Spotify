package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.music.nowplaying.drivingmode.presenter.pivot.PivotSubtitleIcon;

/* renamed from: tfc reason: default package */
final class tfc extends tfg {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final hcz e;
    private final PlayerContextIndex f;
    private final long g;
    private final String h;
    private final PivotSubtitleIcon i;
    private final boolean j;

    /* renamed from: tfc$a */
    public static final class a implements defpackage.tfg.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private hcz e;
        private PlayerContextIndex f;
        private Long g;
        private String h;
        private PivotSubtitleIcon i;
        private Boolean j;

        public final defpackage.tfg.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public final defpackage.tfg.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null spaceId");
        }

        public final defpackage.tfg.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public final defpackage.tfg.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null subtitleText");
        }

        public final defpackage.tfg.a a(hcz hcz) {
            this.e = hcz;
            return this;
        }

        public final defpackage.tfg.a a(PlayerContextIndex playerContextIndex) {
            if (playerContextIndex != null) {
                this.f = playerContextIndex;
                return this;
            }
            throw new NullPointerException("Null playerContextIndex");
        }

        public final defpackage.tfg.a a(long j2) {
            this.g = Long.valueOf(j2);
            return this;
        }

        public final defpackage.tfg.a e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public final defpackage.tfg.a a(PivotSubtitleIcon pivotSubtitleIcon) {
            if (pivotSubtitleIcon != null) {
                this.i = pivotSubtitleIcon;
                return this;
            }
            throw new NullPointerException("Null subtitleIcon");
        }

        public final defpackage.tfg.a a(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final tfg a() {
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
                sb2.append(" spaceId");
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
                sb4.append(" subtitleText");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" contextUri");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" playerContextIndex");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" positionAsOfTimestamp");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" imageUri");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" subtitleIcon");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" isAlwaysOnDemand");
                str = sb10.toString();
            }
            if (str.isEmpty()) {
                tfc tfc = new tfc(this.a, this.b, this.c, this.d, this.e, this.f, this.g.longValue(), this.h, this.i, this.j.booleanValue(), 0);
                return tfc;
            }
            StringBuilder sb11 = new StringBuilder("Missing required properties:");
            sb11.append(str);
            throw new IllegalStateException(sb11.toString());
        }
    }

    /* synthetic */ tfc(String str, String str2, String str3, String str4, hcz hcz, PlayerContextIndex playerContextIndex, long j2, String str5, PivotSubtitleIcon pivotSubtitleIcon, boolean z, byte b2) {
        this(str, str2, str3, str4, hcz, playerContextIndex, j2, str5, pivotSubtitleIcon, z);
    }

    private tfc(String str, String str2, String str3, String str4, hcz hcz, PlayerContextIndex playerContextIndex, long j2, String str5, PivotSubtitleIcon pivotSubtitleIcon, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hcz;
        this.f = playerContextIndex;
        this.g = j2;
        this.h = str5;
        this.i = pivotSubtitleIcon;
        this.j = z;
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

    public final hcz e() {
        return this.e;
    }

    public final PlayerContextIndex f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }

    public final PivotSubtitleIcon i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PivotItem{id=");
        sb.append(this.a);
        sb.append(", spaceId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitleText=");
        sb.append(this.d);
        sb.append(", contextUri=");
        sb.append(this.e);
        sb.append(", playerContextIndex=");
        sb.append(this.f);
        sb.append(", positionAsOfTimestamp=");
        sb.append(this.g);
        sb.append(", imageUri=");
        sb.append(this.h);
        sb.append(", subtitleIcon=");
        sb.append(this.i);
        sb.append(", isAlwaysOnDemand=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfg) {
            tfg tfg = (tfg) obj;
            return this.a.equals(tfg.a()) && this.b.equals(tfg.b()) && this.c.equals(tfg.c()) && this.d.equals(tfg.d()) && this.e.equals(tfg.e()) && this.f.equals(tfg.f()) && this.g == tfg.g() && this.h.equals(tfg.h()) && this.i.equals(tfg.i()) && this.j == tfg.j();
        }
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        long j2 = this.g;
        return ((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.j ? 1231 : 1237);
    }
}
