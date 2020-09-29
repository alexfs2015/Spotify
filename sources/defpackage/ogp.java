package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.LongClickAction;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.Wiggle;

/* renamed from: ogp reason: default package */
public final class ogp extends ItemListConfiguration {
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
    private final Wiggle v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    /* renamed from: ogp$a */
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
        private Wiggle v;
        private Boolean w;
        private Boolean x;
        private Boolean y;
        private Boolean z;

        /* synthetic */ a(ItemListConfiguration itemListConfiguration, byte b2) {
            this(itemListConfiguration);
        }

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
            this.v = itemListConfiguration.v();
            this.w = Boolean.valueOf(itemListConfiguration.w());
            this.x = Boolean.valueOf(itemListConfiguration.x());
            this.y = Boolean.valueOf(itemListConfiguration.y());
            this.z = Boolean.valueOf(itemListConfiguration.z());
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(boolean z2) {
            this.a = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a b(boolean z2) {
            this.b = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a c(boolean z2) {
            this.c = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a d(boolean z2) {
            this.d = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a e(boolean z2) {
            this.e = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a f(boolean z2) {
            this.f = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a g(boolean z2) {
            this.g = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a h(boolean z2) {
            this.h = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a i(boolean z2) {
            this.i = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a j(boolean z2) {
            this.j = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a k(boolean z2) {
            this.k = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a l(boolean z2) {
            this.l = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a m(boolean z2) {
            this.m = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(LongClickAction longClickAction) {
            if (longClickAction != null) {
                this.n = longClickAction;
                return this;
            }
            throw new NullPointerException("Null longClickAction");
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a n(boolean z2) {
            this.o = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a o(boolean z2) {
            this.p = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a p(boolean z2) {
            this.q = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a q(boolean z2) {
            this.r = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(Optional<Boolean> optional) {
            if (optional != null) {
                this.s = optional;
                return this;
            }
            throw new NullPointerException("Null showTrackOrEpisodeArt");
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a r(boolean z2) {
            this.t = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a s(boolean z2) {
            this.u = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a a(Wiggle wiggle) {
            if (wiggle != null) {
                this.v = wiggle;
                return this;
            }
            throw new NullPointerException("Null wigglePlayButtonOnPreviewPlayback");
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a t(boolean z2) {
            this.w = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a u(boolean z2) {
            this.x = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a v(boolean z2) {
            this.y = Boolean.valueOf(z2);
            return this;
        }

        public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a w(boolean z2) {
            this.z = Boolean.valueOf(z2);
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
                sb21.append(" wigglePlayButtonOnPreviewPlayback");
                str = sb21.toString();
            }
            if (this.w == null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append(" showFooterForPreviewRows");
                str = sb22.toString();
            }
            if (this.x == null) {
                StringBuilder sb23 = new StringBuilder();
                sb23.append(str);
                sb23.append(" previewTextIsLabelKind");
                str = sb23.toString();
            }
            if (this.y == null) {
                StringBuilder sb24 = new StringBuilder();
                sb24.append(str);
                sb24.append(" showEducationOnPreviewPlayback");
                str = sb24.toString();
            }
            if (this.z == null) {
                StringBuilder sb25 = new StringBuilder();
                sb25.append(str);
                sb25.append(" showShuffleOnboarding");
                str = sb25.toString();
            }
            if (str.isEmpty()) {
                ogp ogp = new ogp(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n, this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r.booleanValue(), this.s, this.t.booleanValue(), this.u.booleanValue(), this.v, this.w.booleanValue(), this.x.booleanValue(), this.y.booleanValue(), this.z.booleanValue(), 0);
                return ogp;
            }
            StringBuilder sb26 = new StringBuilder("Missing required properties:");
            sb26.append(str);
            throw new IllegalStateException(sb26.toString());
        }
    }

    /* synthetic */ ogp(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, LongClickAction longClickAction, boolean z15, boolean z16, boolean z17, boolean z18, Optional optional, boolean z19, boolean z20, Wiggle wiggle, boolean z21, boolean z22, boolean z23, boolean z24, byte b2) {
        this(z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, longClickAction, z15, z16, z17, z18, optional, z19, z20, wiggle, z21, z22, z23, z24);
    }

    private ogp(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, LongClickAction longClickAction, boolean z15, boolean z16, boolean z17, boolean z18, Optional<Boolean> optional, boolean z19, boolean z20, Wiggle wiggle, boolean z21, boolean z22, boolean z23, boolean z24) {
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.e = z6;
        this.f = z7;
        this.g = z8;
        this.h = z9;
        this.i = z10;
        this.j = z11;
        this.k = z12;
        this.l = z13;
        this.m = z14;
        this.n = longClickAction;
        this.o = z15;
        this.p = z16;
        this.q = z17;
        this.r = z18;
        this.s = optional;
        this.t = z19;
        this.u = z20;
        this.v = wiggle;
        this.w = z21;
        this.x = z22;
        this.y = z23;
        this.z = z24;
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

    public final boolean u() {
        return this.u;
    }

    public final Wiggle v() {
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

    public final boolean z() {
        return this.z;
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
        sb.append(", wigglePlayButtonOnPreviewPlayback=");
        sb.append(this.v);
        sb.append(", showFooterForPreviewRows=");
        sb.append(this.w);
        sb.append(", previewTextIsLabelKind=");
        sb.append(this.x);
        sb.append(", showEducationOnPreviewPlayback=");
        sb.append(this.y);
        sb.append(", showShuffleOnboarding=");
        sb.append(this.z);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ItemListConfiguration) {
            ItemListConfiguration itemListConfiguration = (ItemListConfiguration) obj;
            return this.a == itemListConfiguration.a() && this.b == itemListConfiguration.b() && this.c == itemListConfiguration.c() && this.d == itemListConfiguration.d() && this.e == itemListConfiguration.e() && this.f == itemListConfiguration.f() && this.g == itemListConfiguration.g() && this.h == itemListConfiguration.h() && this.i == itemListConfiguration.i() && this.j == itemListConfiguration.j() && this.k == itemListConfiguration.k() && this.l == itemListConfiguration.l() && this.m == itemListConfiguration.m() && this.n.equals(itemListConfiguration.n()) && this.o == itemListConfiguration.o() && this.p == itemListConfiguration.p() && this.q == itemListConfiguration.q() && this.r == itemListConfiguration.r() && this.s.equals(itemListConfiguration.s()) && this.t == itemListConfiguration.t() && this.u == itemListConfiguration.u() && this.v.equals(itemListConfiguration.v()) && this.w == itemListConfiguration.w() && this.x == itemListConfiguration.x() && this.y == itemListConfiguration.y() && this.z == itemListConfiguration.z();
        }
    }

    public final int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (this.t ? 1231 : 1237)) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003) ^ this.v.hashCode()) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ (this.x ? 1231 : 1237)) * 1000003) ^ (this.y ? 1231 : 1237)) * 1000003;
        if (!this.z) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    public final com.spotify.music.features.playlistentity.configuration.ItemListConfiguration.a A() {
        return new a(this, 0);
    }
}
