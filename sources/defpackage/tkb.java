package defpackage;

import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.music.playlist.ui.ItemConfiguration.HeartAndBan;
import com.spotify.music.playlist.ui.ItemConfiguration.LongClickAction;

/* renamed from: tkb reason: default package */
public final class tkb extends ItemConfiguration {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final HeartAndBan d;
    private final LongClickAction e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;

    /* renamed from: tkb$a */
    public static final class a implements com.spotify.music.playlist.ui.ItemConfiguration.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private HeartAndBan d;
        private LongClickAction e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;
        private Boolean o;
        private Boolean p;

        /* synthetic */ a(ItemConfiguration itemConfiguration, byte b2) {
            this(itemConfiguration);
        }

        public a() {
        }

        private a(ItemConfiguration itemConfiguration) {
            this.a = Boolean.valueOf(itemConfiguration.a());
            this.b = Boolean.valueOf(itemConfiguration.b());
            this.c = Boolean.valueOf(itemConfiguration.c());
            this.d = itemConfiguration.d();
            this.e = itemConfiguration.e();
            this.f = Boolean.valueOf(itemConfiguration.f());
            this.g = Boolean.valueOf(itemConfiguration.g());
            this.h = Boolean.valueOf(itemConfiguration.h());
            this.i = Boolean.valueOf(itemConfiguration.i());
            this.j = Boolean.valueOf(itemConfiguration.j());
            this.k = Boolean.valueOf(itemConfiguration.k());
            this.l = Boolean.valueOf(itemConfiguration.l());
            this.m = Boolean.valueOf(itemConfiguration.m());
            this.n = Boolean.valueOf(itemConfiguration.n());
            this.o = Boolean.valueOf(itemConfiguration.o());
            this.p = Boolean.valueOf(itemConfiguration.p());
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a a(HeartAndBan heartAndBan) {
            if (heartAndBan != null) {
                this.d = heartAndBan;
                return this;
            }
            throw new NullPointerException("Null heartAndBanOnTrackRows");
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a a(LongClickAction longClickAction) {
            if (longClickAction != null) {
                this.e = longClickAction;
                return this;
            }
            throw new NullPointerException("Null longClickAction");
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a f(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a h(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a i(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a j(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a k(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a l(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a m(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.playlist.ui.ItemConfiguration.a n(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public final ItemConfiguration a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" prependTitleWithNumber");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" prependWithAddedByName");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showAlbumInSubtitle");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" heartAndBanOnTrackRows");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" longClickAction");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showLyricsLabels");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" disableExplicitItems");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" showBannedTracksAsDisabled");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" showBanAsBlock");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" showTrackOrEpisodeArt");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" loadImageForPodcastEpisodeRow");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" openContextMenuOnAudioEpisodeClick");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" showPreviewOverlay");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" showFooterForPreviewRows");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" previewTextOnPreviewRowsIsALabel");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" showEducationOnPreviewRowsWhenActive");
                str = sb16.toString();
            }
            if (str.isEmpty()) {
                tkb tkb = new tkb(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), 0);
                return tkb;
            }
            StringBuilder sb17 = new StringBuilder("Missing required properties:");
            sb17.append(str);
            throw new IllegalStateException(sb17.toString());
        }
    }

    /* synthetic */ tkb(boolean z, boolean z2, boolean z3, HeartAndBan heartAndBan, LongClickAction longClickAction, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte b2) {
        this(z, z2, z3, heartAndBan, longClickAction, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14);
    }

    private tkb(boolean z, boolean z2, boolean z3, HeartAndBan heartAndBan, LongClickAction longClickAction, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = heartAndBan;
        this.e = longClickAction;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
        this.n = z12;
        this.o = z13;
        this.p = z14;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final HeartAndBan d() {
        return this.d;
    }

    public final LongClickAction e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.m;
    }

    public final boolean n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemConfiguration{prependTitleWithNumber=");
        sb.append(this.a);
        sb.append(", prependWithAddedByName=");
        sb.append(this.b);
        sb.append(", showAlbumInSubtitle=");
        sb.append(this.c);
        sb.append(", heartAndBanOnTrackRows=");
        sb.append(this.d);
        sb.append(", longClickAction=");
        sb.append(this.e);
        sb.append(", showLyricsLabels=");
        sb.append(this.f);
        sb.append(", disableExplicitItems=");
        sb.append(this.g);
        sb.append(", showBannedTracksAsDisabled=");
        sb.append(this.h);
        sb.append(", showBanAsBlock=");
        sb.append(this.i);
        sb.append(", showTrackOrEpisodeArt=");
        sb.append(this.j);
        sb.append(", loadImageForPodcastEpisodeRow=");
        sb.append(this.k);
        sb.append(", openContextMenuOnAudioEpisodeClick=");
        sb.append(this.l);
        sb.append(", showPreviewOverlay=");
        sb.append(this.m);
        sb.append(", showFooterForPreviewRows=");
        sb.append(this.n);
        sb.append(", previewTextOnPreviewRowsIsALabel=");
        sb.append(this.o);
        sb.append(", showEducationOnPreviewRowsWhenActive=");
        sb.append(this.p);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ItemConfiguration) {
            ItemConfiguration itemConfiguration = (ItemConfiguration) obj;
            return this.a == itemConfiguration.a() && this.b == itemConfiguration.b() && this.c == itemConfiguration.c() && this.d.equals(itemConfiguration.d()) && this.e.equals(itemConfiguration.e()) && this.f == itemConfiguration.f() && this.g == itemConfiguration.g() && this.h == itemConfiguration.h() && this.i == itemConfiguration.i() && this.j == itemConfiguration.j() && this.k == itemConfiguration.k() && this.l == itemConfiguration.l() && this.m == itemConfiguration.m() && this.n == itemConfiguration.n() && this.o == itemConfiguration.o() && this.p == itemConfiguration.p();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003;
        if (!this.p) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final com.spotify.music.playlist.ui.ItemConfiguration.a q() {
        return new a(this, 0);
    }
}
