package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: oyr reason: default package */
final class oyr extends oys {
    private final ooe b;
    private final ood c;
    private final ooj d;
    private final oop e;
    private final ooh f;
    private final PlaylistDataSourceConfiguration g;
    private final oof h;
    private final AllSongsConfiguration i;
    private final gkq j;

    /* renamed from: oyr$a */
    static final class a implements defpackage.oys.a {
        private ooe a;
        private ood b;
        private ooj c;
        private oop d;
        private ooh e;
        private PlaylistDataSourceConfiguration f;
        private oof g;
        private AllSongsConfiguration h;
        private gkq i;

        a() {
        }

        private a(oys oys) {
            this.a = oys.a();
            this.b = oys.b();
            this.c = oys.c();
            this.d = oys.d();
            this.e = oys.e();
            this.f = oys.f();
            this.g = oys.g();
            this.h = oys.h();
            this.i = oys.i();
        }

        /* synthetic */ a(oys oys, byte b2) {
            this(oys);
        }

        public final defpackage.oys.a a(AllSongsConfiguration allSongsConfiguration) {
            if (allSongsConfiguration != null) {
                this.h = allSongsConfiguration;
                return this;
            }
            throw new NullPointerException("Null allSongsConfiguration");
        }

        public final defpackage.oys.a a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
            if (playlistDataSourceConfiguration != null) {
                this.f = playlistDataSourceConfiguration;
                return this;
            }
            throw new NullPointerException("Null playlistDataSourceConfiguration");
        }

        public final defpackage.oys.a a(gkq gkq) {
            if (gkq != null) {
                this.i = gkq;
                return this;
            }
            throw new NullPointerException("Null pageIdentifier");
        }

        public final defpackage.oys.a a(ood ood) {
            if (ood != null) {
                this.b = ood;
                return this;
            }
            throw new NullPointerException("Null componentConfiguration");
        }

        public final defpackage.oys.a a(ooe ooe) {
            if (ooe != null) {
                this.a = ooe;
                return this;
            }
            throw new NullPointerException("Null emptyConfiguration");
        }

        public final defpackage.oys.a a(oof oof) {
            if (oof != null) {
                this.g = oof;
                return this;
            }
            throw new NullPointerException("Null filterAndSortConfiguration");
        }

        public final defpackage.oys.a a(ooh ooh) {
            if (ooh != null) {
                this.e = ooh;
                return this;
            }
            throw new NullPointerException("Null playAndEditButtonConfiguration");
        }

        public final defpackage.oys.a a(ooj ooj) {
            if (ooj != null) {
                this.c = ooj;
                return this;
            }
            throw new NullPointerException("Null playerConfiguration");
        }

        public final defpackage.oys.a a(oop oop) {
            if (oop != null) {
                this.d = oop;
                return this;
            }
            throw new NullPointerException("Null trackCloudConfiguration");
        }

        public final oys a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" emptyConfiguration");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" componentConfiguration");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playerConfiguration");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" trackCloudConfiguration");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" playAndEditButtonConfiguration");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" playlistDataSourceConfiguration");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" filterAndSortConfiguration");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" allSongsConfiguration");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" pageIdentifier");
                str = sb9.toString();
            }
            if (str.isEmpty()) {
                oyr oyr = new oyr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, 0);
                return oyr;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    private oyr(ooe ooe, ood ood, ooj ooj, oop oop, ooh ooh, PlaylistDataSourceConfiguration playlistDataSourceConfiguration, oof oof, AllSongsConfiguration allSongsConfiguration, gkq gkq) {
        this.b = ooe;
        this.c = ood;
        this.d = ooj;
        this.e = oop;
        this.f = ooh;
        this.g = playlistDataSourceConfiguration;
        this.h = oof;
        this.i = allSongsConfiguration;
        this.j = gkq;
    }

    /* synthetic */ oyr(ooe ooe, ood ood, ooj ooj, oop oop, ooh ooh, PlaylistDataSourceConfiguration playlistDataSourceConfiguration, oof oof, AllSongsConfiguration allSongsConfiguration, gkq gkq, byte b2) {
        this(ooe, ood, ooj, oop, ooh, playlistDataSourceConfiguration, oof, allSongsConfiguration, gkq);
    }

    public final ooe a() {
        return this.b;
    }

    public final ood b() {
        return this.c;
    }

    public final ooj c() {
        return this.d;
    }

    public final oop d() {
        return this.e;
    }

    public final ooh e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oys) {
            oys oys = (oys) obj;
            return this.b.equals(oys.a()) && this.c.equals(oys.b()) && this.d.equals(oys.c()) && this.e.equals(oys.d()) && this.f.equals(oys.e()) && this.g.equals(oys.f()) && this.h.equals(oys.g()) && this.i.equals(oys.h()) && this.j.equals(oys.i());
        }
    }

    public final PlaylistDataSourceConfiguration f() {
        return this.g;
    }

    public final oof g() {
        return this.h;
    }

    public final AllSongsConfiguration h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final gkq i() {
        return this.j;
    }

    public final defpackage.oys.a j() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations{emptyConfiguration=");
        sb.append(this.b);
        sb.append(", componentConfiguration=");
        sb.append(this.c);
        sb.append(", playerConfiguration=");
        sb.append(this.d);
        sb.append(", trackCloudConfiguration=");
        sb.append(this.e);
        sb.append(", playAndEditButtonConfiguration=");
        sb.append(this.f);
        sb.append(", playlistDataSourceConfiguration=");
        sb.append(this.g);
        sb.append(", filterAndSortConfiguration=");
        sb.append(this.h);
        sb.append(", allSongsConfiguration=");
        sb.append(this.i);
        sb.append(", pageIdentifier=");
        sb.append(this.j);
        sb.append("}");
        return sb.toString();
    }
}
