package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoAlbumMetadata extends Message<ProtoAlbumMetadata, Builder> {
    public static final ProtoAdapter<ProtoAlbumMetadata> ADAPTER = new a();
    public static final String DEFAULT_COPYRIGHT = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_NUM_DISCS;
    public static final Integer DEFAULT_NUM_TRACKS;
    public static final Boolean DEFAULT_PLAYABILITY = Boolean.FALSE;
    public static final Integer DEFAULT_YEAR;
    private static final long serialVersionUID = 0;
    public final List<ProtoAlbumArtistMetadata> artists;
    public final String copyright;
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;
    public final Integer num_discs;
    public final Integer num_tracks;
    public final Boolean playability;
    public final Integer year;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoAlbumMetadata, Builder> {
        public List<ProtoAlbumArtistMetadata> artists = whk.a();
        public String copyright;
        public ProtoImageGroup covers;
        public String link;
        public String name;
        public Integer num_discs;
        public Integer num_tracks;
        public Boolean playability;
        public Integer year;

        public final Builder artists(List<ProtoAlbumArtistMetadata> list) {
            whk.a(list);
            this.artists = list;
            return this;
        }

        public final ProtoAlbumMetadata build() {
            ProtoAlbumMetadata protoAlbumMetadata = r0;
            ProtoAlbumMetadata protoAlbumMetadata2 = new ProtoAlbumMetadata(this.artists, this.link, this.name, this.copyright, this.covers, this.year, this.num_discs, this.num_tracks, this.playability, super.buildUnknownFields());
            return protoAlbumMetadata2;
        }

        public final Builder copyright(String str) {
            this.copyright = str;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder num_discs(Integer num) {
            this.num_discs = num;
            return this;
        }

        public final Builder num_tracks(Integer num) {
            this.num_tracks = num;
            return this;
        }

        public final Builder playability(Boolean bool) {
            this.playability = bool;
            return this;
        }

        public final Builder year(Integer num) {
            this.year = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoAlbumMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoAlbumMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            int i;
            ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj;
            int i2 = 0;
            int a = ProtoAlbumArtistMetadata.ADAPTER.a().a(1, protoAlbumMetadata.artists) + (protoAlbumMetadata.link != null ? ProtoAdapter.i.a(2, protoAlbumMetadata.link) : 0);
            if (protoAlbumMetadata.name != null) {
                boolean z = true ^ true;
                i = ProtoAdapter.i.a(3, protoAlbumMetadata.name);
            } else {
                i = 0;
            }
            int a2 = a + i + (protoAlbumMetadata.copyright != null ? ProtoAdapter.i.a(4, protoAlbumMetadata.copyright) : 0) + (protoAlbumMetadata.covers != null ? ProtoImageGroup.ADAPTER.a(5, protoAlbumMetadata.covers) : 0) + (protoAlbumMetadata.year != null ? ProtoAdapter.c.a(6, protoAlbumMetadata.year) : 0) + (protoAlbumMetadata.num_discs != null ? ProtoAdapter.c.a(7, protoAlbumMetadata.num_discs) : 0) + (protoAlbumMetadata.num_tracks != null ? ProtoAdapter.c.a(8, protoAlbumMetadata.num_tracks) : 0);
            if (protoAlbumMetadata.playability != null) {
                i2 = ProtoAdapter.a.a(9, protoAlbumMetadata.playability);
            }
            return a2 + i2 + protoAlbumMetadata.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.artists.add(ProtoAlbumArtistMetadata.ADAPTER.a(whg));
                            break;
                        case 2:
                            builder.link((String) ProtoAdapter.i.a(whg));
                            break;
                        case 3:
                            builder.name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 4:
                            builder.copyright((String) ProtoAdapter.i.a(whg));
                            break;
                        case 5:
                            builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(whg));
                            break;
                        case 6:
                            builder.year((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 7:
                            builder.num_discs((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 8:
                            builder.num_tracks((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 9:
                            builder.playability((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj;
            ProtoAlbumArtistMetadata.ADAPTER.a().a(whh, 1, protoAlbumMetadata.artists);
            if (protoAlbumMetadata.link != null) {
                ProtoAdapter.i.a(whh, 2, protoAlbumMetadata.link);
            }
            if (protoAlbumMetadata.name != null) {
                ProtoAdapter.i.a(whh, 3, protoAlbumMetadata.name);
            }
            if (protoAlbumMetadata.copyright != null) {
                ProtoAdapter.i.a(whh, 4, protoAlbumMetadata.copyright);
            }
            if (protoAlbumMetadata.covers != null) {
                boolean z = true ^ true;
                ProtoImageGroup.ADAPTER.a(whh, 5, protoAlbumMetadata.covers);
            }
            if (protoAlbumMetadata.year != null) {
                ProtoAdapter.c.a(whh, 6, protoAlbumMetadata.year);
            }
            if (protoAlbumMetadata.num_discs != null) {
                ProtoAdapter.c.a(whh, 7, protoAlbumMetadata.num_discs);
            }
            if (protoAlbumMetadata.num_tracks != null) {
                ProtoAdapter.c.a(whh, 8, protoAlbumMetadata.num_tracks);
            }
            if (protoAlbumMetadata.playability != null) {
                ProtoAdapter.a.a(whh, 9, protoAlbumMetadata.playability);
            }
            whh.a(protoAlbumMetadata.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_YEAR = valueOf;
        DEFAULT_NUM_DISCS = valueOf;
        DEFAULT_NUM_TRACKS = valueOf;
    }

    public ProtoAlbumMetadata(List<ProtoAlbumArtistMetadata> list, String str, String str2, String str3, ProtoImageGroup protoImageGroup, Integer num, Integer num2, Integer num3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.artists = whk.a("artists", list);
        this.link = str;
        this.name = str2;
        this.copyright = str3;
        this.covers = protoImageGroup;
        this.year = num;
        this.num_discs = num2;
        this.num_tracks = num3;
        this.playability = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoAlbumMetadata)) {
            return false;
        }
        ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj;
        return a().equals(protoAlbumMetadata.a()) && this.artists.equals(protoAlbumMetadata.artists) && whk.a((Object) this.link, (Object) protoAlbumMetadata.link) && whk.a((Object) this.name, (Object) protoAlbumMetadata.name) && whk.a((Object) this.copyright, (Object) protoAlbumMetadata.copyright) && whk.a((Object) this.covers, (Object) protoAlbumMetadata.covers) && whk.a((Object) this.year, (Object) protoAlbumMetadata.year) && whk.a((Object) this.num_discs, (Object) protoAlbumMetadata.num_discs) && whk.a((Object) this.num_tracks, (Object) protoAlbumMetadata.num_tracks) && whk.a((Object) this.playability, (Object) protoAlbumMetadata.playability);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((a().hashCode() * 37) + this.artists.hashCode()) * 37;
        String str = this.link;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.copyright;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup = this.covers;
        int hashCode5 = (hashCode4 + (protoImageGroup != null ? protoImageGroup.hashCode() : 0)) * 37;
        Integer num = this.year;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.num_discs;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.num_tracks;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool = this.playability;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode8 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.artists.isEmpty()) {
            String str = "its =tssr,";
            sb.append(", artists=");
            sb.append(this.artists);
        }
        if (this.link != null) {
            String str2 = " ,=mnik";
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            String str3 = "nm aoe=";
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.copyright != null) {
            sb.append(", copyright=");
            sb.append(this.copyright);
        }
        if (this.covers != null) {
            String str4 = "o vscb,=e";
            sb.append(", covers=");
            sb.append(this.covers);
        }
        if (this.year != null) {
            String str5 = "=aery b";
            sb.append(", year=");
            sb.append(this.year);
        }
        if (this.num_discs != null) {
            String str6 = "=_cusimt,ds ";
            sb.append(", num_discs=");
            sb.append(this.num_discs);
        }
        if (this.num_tracks != null) {
            String str7 = "mn=tcu_aps,k ";
            sb.append(", num_tracks=");
            sb.append(this.num_tracks);
        }
        if (this.playability != null) {
            String str8 = "=ap t,blatiyli";
            sb.append(", playability=");
            sb.append(this.playability);
        }
        String str9 = "oestAdultrMbPtoa{aa";
        StringBuilder replace = sb.replace(0, 2, "ProtoAlbumMetadata{");
        replace.append('}');
        return replace.toString();
    }
}