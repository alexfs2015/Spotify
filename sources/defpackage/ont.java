package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;

/* renamed from: ont reason: default package */
public final class ont extends ItemListConfiguration {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final LongClickAction n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final Optional<Boolean> s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;

    /* renamed from: ont$a */
    public static final class a implements com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private LongClickAction n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private Boolean r;
        private Optional<Boolean> s;
        private Boolean t;
        private Boolean u;
        private Boolean v;
        private Boolean w;
        private Boolean x;
        private Boolean y;

        public a() {
            this.s = Optional.e();
        }

        private a(ItemListConfiguration itemListConfiguration) {
            this.s = Optional.e();
            this.a = Boolean.valueOf(itemListConfiguration.a());
            this.b = Boolean.valueOf(itemListConfiguration.b());
            this.c = Boolean.valueOf(itemListConfiguration.c());
            this.d = Boolean.valueOf(itemListConfiguration.d());
            this.e = Boolean.valueOf(itemListConfiguration.e());
            this.f = Boolean.valueOf(itemListConfiguration.f());
            this.g = Boolean.valueOf(itemListConfiguration.g());
            this.h = Boolean.valueOf(itemListConfiguration.h());
            this.i = Boolean.valueOf(itemListConfiguration.i());
            this.j = Boolean.valueOf(itemListConfiguration.j());
            this.k = Boolean.valueOf(itemListConfiguration.k());
            this.l = Boolean.valueOf(itemListConfiguration.l());
            this.m = Boolean.valueOf(itemListConfiguration.m());
            this.n = itemListConfiguration.n();
            this.o = Boolean.valueOf(itemListConfiguration.o());
            this.p = Boolean.valueOf(itemListConfiguration.p());
            this.q = Boolean.valueOf(itemListConfiguration.q());
            this.r = Boolean.valueOf(itemListConfiguration.r());
            this.s = itemListConfiguration.s();
            this.t = Boolean.valueOf(itemListConfiguration.t());
            this.u = Boolean.valueOf(itemListConfiguration.u());
            this.v = Boolean.valueOf(itemListConfiguration.v());
            this.w = Boolean.valueOf(itemListConfiguration.w());
            this.x = Boolean.valueOf(itemListConfiguration.x());
            this.y = Boolean.valueOf(itemListConfiguration.y());
        }

        /* synthetic */ a(ItemListConfiguration itemListConfiguration, byte b2) {
            this(itemListConfiguration);
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.s = optional;
                return this;
            }
            throw new NullPointerException("Null showTrackOrEpisodeArt");
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(LongClickAction longClickAction) {
            if (longClickAction != null) {
                this.n = longClickAction;
                return this;
            }
            throw new NullPointerException("Null longClickAction");
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ItemListConfiguration a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showHeartAndBanOnTrackRows");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" showBanAsBlock");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" showGoToPlaylistRadioContextMenuOption");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" showAddToQueueContextMenuOption");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" showBrowseAlbumContextMenuOption");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" showBanContextMenuOption");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" showGoToShowForVideoEpisodesContextMenuOption");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" allowAutoPlayTrack");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" allowAutoPlayEpisode");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" allowAutoPlay");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" openNpvWhenStartingPlaybackOfNonVideoItem");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" openNpvWhenStartingPlaybackOfVideoItem");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" contextAwareSharing");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" longClickAction");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" showBannedTracksAsDisabled");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" showAlbumInSubtitle");
                str = sb16.toString();
            }
            if (this.q == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" showLyricsLabelForTracks");
                str = sb17.toString();
            }
            if (this.r == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" showOnlyEpisodes");
                str = sb18.toString();
            }
            if (this.t == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" openPodcastEpisodeEntityPageOnAudioEpisodeClick");
                str = sb19.toString();
            }
            if (this.u == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" tracksArePreviewsOnly");
                str = sb20.toString();
            }
            if (this.v == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" showFooterForPreviewRows");
                str = sb21.toString();
            }
            if (this.w == null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append(" previewTextIsLabelKind");
                str = sb22.toString();
            }
            if (this.x == null) {
                StringBuilder sb23 = new StringBuilder();
                sb23.append(str);
                sb23.append(" showEducationOnPreviewPlayback");
                str = sb23.toString();
            }
            if (this.y == null) {
                StringBuilder sb24 = new StringBuilder();
                sb24.append(str);
                sb24.append(" showShuffleOnboarding");
                str = sb24.toString();
            }
            if (str.isEmpty()) {
                ont ont = new ont(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n, this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.booleanValue(), this.s, this.t.booleanValue(), this.u.booleanValue(), this.v.booleanValue(), this.w.booleanValue(), this.x.booleanValue(), this.y.booleanValue(), 0);
                return ont;
            }
            StringBuilder sb25 = new StringBuilder("Missing required properties:");
            sb25.append(str);
            throw new IllegalStateException(sb25.toString());
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a j(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a k(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a l(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a m(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a n(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a o(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a p(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a q(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a r(boolean z) {
            this.t = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a s(boolean z) {
            this.u = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a t(boolean z) {
            this.v = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a u(boolean z) {
            this.w = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a v(boolean z) {
            this.x = Boolean.valueOf(z);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a w(boolean z) {
            this.y = Boolean.valueOf(z);
            return this;
        }
    }

    private ont(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, LongClickAction longClickAction, boolean z14, boolean z15, boolean z16, boolean z17, Optional<Boolean> optional, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = longClickAction;
        this.o = z14;
        this.p = z15;
        this.q = z16;
        this.r = z17;
        this.s = optional;
        this.t = z18;
        this.u = z19;
        this.v = z20;
        this.w = z21;
        this.x = z22;
        this.y = z23;
    }

    /* synthetic */ ont(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, LongClickAction longClickAction, boolean z14, boolean z15, boolean z16, boolean z17, Optional optional, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, byte b2) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, longClickAction, z14, z15, z16, z17, optional, z18, z19, z20, z21, z22, z23);
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

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ItemListConfiguration) {
            ItemListConfiguration itemListConfiguration = (ItemListConfiguration) obj;
            return this.a == itemListConfiguration.a() && this.b == itemListConfiguration.b() && this.c == itemListConfiguration.c() && this.d == itemListConfiguration.d() && this.e == itemListConfiguration.e() && this.f == itemListConfiguration.f() && this.g == itemListConfiguration.g() && this.h == itemListConfiguration.h() && this.i == itemListConfiguration.i() && this.j == itemListConfiguration.j() && this.k == itemListConfiguration.k() && this.l == itemListConfiguration.l() && this.m == itemListConfiguration.m() && this.n.equals(itemListConfiguration.n()) && this.o == itemListConfiguration.o() && this.p == itemListConfiguration.p() && this.q == itemListConfiguration.q() && this.r == itemListConfiguration.r() && this.s.equals(itemListConfiguration.s()) && this.t == itemListConfiguration.t() && this.u == itemListConfiguration.u() && this.v == itemListConfiguration.v() && this.w == itemListConfiguration.w() && this.x == itemListConfiguration.x() && this.y == itemListConfiguration.y();
        }
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

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (this.t ? 1231 : 1237)) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003) ^ (this.v ? 1231 : 1237)) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ (this.x ? 1231 : 1237)) * 1000003;
        if (!this.y) {
            i2 = 1237;
        }
        return hashCode ^ i2;
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

    public final LongClickAction n() {
        return this.n;
    }

    public final boolean o() {
        return this.o;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final boolean r() {
        return this.r;
    }

    public final Optional<Boolean> s() {
        return this.s;
    }

    public final boolean t() {
        return this.t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemListConfiguration{showHeartAndBanOnTrackRows=");
        sb.append(this.a);
        sb.append(", showBanAsBlock=");
        sb.append(this.b);
        sb.append(", showGoToPlaylistRadioContextMenuOption=");
        sb.append(this.c);
        sb.append(", showAddToQueueContextMenuOption=");
        sb.append(this.d);
        sb.append(", showBrowseAlbumContextMenuOption=");
        sb.append(this.e);
        sb.append(", showBanContextMenuOption=");
        sb.append(this.f);
        sb.append(", showGoToShowForVideoEpisodesContextMenuOption=");
        sb.append(this.g);
        sb.append(", allowAutoPlayTrack=");
        sb.append(this.h);
        sb.append(", allowAutoPlayEpisode=");
        sb.append(this.i);
        sb.append(", allowAutoPlay=");
        sb.append(this.j);
        sb.append(", openNpvWhenStartingPlaybackOfNonVideoItem=");
        sb.append(this.k);
        sb.append(", openNpvWhenStartingPlaybackOfVideoItem=");
        sb.append(this.l);
        sb.append(", contextAwareSharing=");
        sb.append(this.m);
        sb.append(", longClickAction=");
        sb.append(this.n);
        sb.append(", showBannedTracksAsDisabled=");
        sb.append(this.o);
        sb.append(", showAlbumInSubtitle=");
        sb.append(this.p);
        sb.append(", showLyricsLabelForTracks=");
        sb.append(this.q);
        sb.append(", showOnlyEpisodes=");
        sb.append(this.r);
        sb.append(", showTrackOrEpisodeArt=");
        sb.append(this.s);
        sb.append(", openPodcastEpisodeEntityPageOnAudioEpisodeClick=");
        sb.append(this.t);
        sb.append(", tracksArePreviewsOnly=");
        sb.append(this.u);
        sb.append(", showFooterForPreviewRows=");
        sb.append(this.v);
        sb.append(", previewTextIsLabelKind=");
        sb.append(this.w);
        sb.append(", showEducationOnPreviewPlayback=");
        sb.append(this.x);
        sb.append(", showShuffleOnboarding=");
        sb.append(this.y);
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return this.u;
    }

    public final boolean v() {
        return this.v;
    }

    public final boolean w() {
        return this.w;
    }

    public final boolean x() {
        return this.x;
    }

    public final boolean y() {
        return this.y;
    }

    public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a z() {
        return new a(this, 0);
    }
}
