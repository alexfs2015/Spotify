package defpackage;

import com.spotify.mobile.android.playlist.navigation.AllSongsConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;

/* renamed from: orl reason: default package */
final class orl extends orm {
    private final oha b;
    private final ogz c;
    private final ohf d;
    private final ohl e;
    private final ohd f;
    private final PlaylistDataSourceConfiguration g;
    private final ohb h;
    private final AllSongsConfiguration i;
    private final gjf j;

    /* renamed from: orl$a */
    static final class a implements defpackage.orm.a {
        private oha a;
        private ogz b;
        private ohf c;
        private ohl d;
        private ohd e;
        private PlaylistDataSourceConfiguration f;
        private ohb g;
        private AllSongsConfiguration h;
        private gjf i;

        /* synthetic */ a(orm orm, byte b2) {
            this(orm);
        }

        a() {
        }

        private a(orm orm) {
            this.a = orm.a();
            this.b = orm.b();
            this.c = orm.c();
            this.d = orm.d();
            this.e = orm.e();
            this.f = orm.f();
            this.g = orm.g();
            this.h = orm.h();
            this.i = orm.i();
        }

        public final defpackage.orm.a a(oha oha) {
            if (oha != null) {
                this.a = oha;
                return this;
            }
            throw new NullPointerException("Null emptyConfiguration");
        }

        public final defpackage.orm.a a(ogz ogz) {
            if (ogz != null) {
                this.b = ogz;
                return this;
            }
            throw new NullPointerException("Null componentConfiguration");
        }

        public final defpackage.orm.a a(ohf ohf) {
            if (ohf != null) {
                this.c = ohf;
                return this;
            }
            throw new NullPointerException("Null playerConfiguration");
        }

        public final defpackage.orm.a a(ohl ohl) {
            if (ohl != null) {
                this.d = ohl;
                return this;
            }
            throw new NullPointerException("Null trackCloudConfiguration");
        }

        public final defpackage.orm.a a(ohd ohd) {
            if (ohd != null) {
                this.e = ohd;
                return this;
            }
            throw new NullPointerException("Null playAndEditButtonConfiguration");
        }

        public final defpackage.orm.a a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
            if (playlistDataSourceConfiguration != null) {
                this.f = playlistDataSourceConfiguration;
                return this;
            }
            throw new NullPointerException("Null playlistDataSourceConfiguration");
        }

        public final defpackage.orm.a a(ohb ohb) {
            if (ohb != null) {
                this.g = ohb;
                return this;
            }
            throw new NullPointerException("Null filterAndSortConfiguration");
        }

        public final defpackage.orm.a a(AllSongsConfiguration allSongsConfiguration) {
            if (allSongsConfiguration != null) {
                this.h = allSongsConfiguration;
                return this;
            }
            throw new NullPointerException("Null allSongsConfiguration");
        }

        public final defpackage.orm.a a(gjf gjf) {
            if (gjf != null) {
                this.i = gjf;
                return this;
            }
            throw new NullPointerException("Null pageIdentifier");
        }

        public final orm a() {
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
                orl orl = new orl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, 0);
                return orl;
            }
            StringBuilder sb10 = new StringBuilder("Missing required properties:");
            sb10.append(str);
            throw new IllegalStateException(sb10.toString());
        }
    }

    /* synthetic */ orl(oha oha, ogz ogz, ohf ohf, ohl ohl, ohd ohd, PlaylistDataSourceConfiguration playlistDataSourceConfiguration, ohb ohb, AllSongsConfiguration allSongsConfiguration, gjf gjf, byte b2) {
        this(oha, ogz, ohf, ohl, ohd, playlistDataSourceConfiguration, ohb, allSongsConfiguration, gjf);
    }

    private orl(oha oha, ogz ogz, ohf ohf, ohl ohl, ohd ohd, PlaylistDataSourceConfiguration playlistDataSourceConfiguration, ohb ohb, AllSongsConfiguration allSongsConfiguration, gjf gjf) {
        this.b = oha;
        this.c = ogz;
        this.d = ohf;
        this.e = ohl;
        this.f = ohd;
        this.g = playlistDataSourceConfiguration;
        this.h = ohb;
        this.i = allSongsConfiguration;
        this.j = gjf;
    }

    public final oha a() {
        return this.b;
    }

    public final ogz b() {
        return this.c;
    }

    public final ohf c() {
        return this.d;
    }

    public final ohl d() {
        return this.e;
    }

    public final ohd e() {
        return this.f;
    }

    public final PlaylistDataSourceConfiguration f() {
        return this.g;
    }

    public final ohb g() {
        return this.h;
    }

    public final AllSongsConfiguration h() {
        return this.i;
    }

    public final gjf i() {
        return this.j;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof orm) {
            orm orm = (orm) obj;
            return this.b.equals(orm.a()) && this.c.equals(orm.b()) && this.d.equals(orm.c()) && this.e.equals(orm.d()) && this.f.equals(orm.e()) && this.g.equals(orm.f()) && this.h.equals(orm.g()) && this.i.equals(orm.h()) && this.j.equals(orm.i());
        }
    }

    public final int hashCode() {
        return ((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final defpackage.orm.a j() {
        return new a(this, 0);
    }
}
