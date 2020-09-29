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
        public List<ProtoAlbumArtistMetadata> artists = vte.a();
        public String copyright;
        public ProtoImageGroup covers;
        public String link;
        public String name;
        public Integer num_discs;
        public Integer num_tracks;
        public Boolean playability;
        public Integer year;

        public final Builder artists(List<ProtoAlbumArtistMetadata> list) {
            vte.a(list);
            this.artists = list;
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

        public final Builder copyright(String str) {
            this.copyright = str;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final Builder year(Integer num) {
            this.year = num;
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

        public final ProtoAlbumMetadata build() {
            ProtoAlbumMetadata protoAlbumMetadata = new ProtoAlbumMetadata(this.artists, this.link, this.name, this.copyright, this.covers, this.year, this.num_discs, this.num_tracks, this.playability, super.buildUnknownFields());
            return protoAlbumMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoAlbumMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj;
            int i = 0;
            int a = ProtoAlbumArtistMetadata.ADAPTER.a().a(1, protoAlbumMetadata.artists) + (protoAlbumMetadata.link != null ? ProtoAdapter.i.a(2, protoAlbumMetadata.link) : 0) + (protoAlbumMetadata.name != null ? ProtoAdapter.i.a(3, protoAlbumMetadata.name) : 0) + (protoAlbumMetadata.copyright != null ? ProtoAdapter.i.a(4, protoAlbumMetadata.copyright) : 0) + (protoAlbumMetadata.covers != null ? ProtoImageGroup.ADAPTER.a(5, protoAlbumMetadata.covers) : 0) + (protoAlbumMetadata.year != null ? ProtoAdapter.c.a(6, protoAlbumMetadata.year) : 0) + (protoAlbumMetadata.num_discs != null ? ProtoAdapter.c.a(7, protoAlbumMetadata.num_discs) : 0) + (protoAlbumMetadata.num_tracks != null ? ProtoAdapter.c.a(8, protoAlbumMetadata.num_tracks) : 0);
            if (protoAlbumMetadata.playability != null) {
                i = ProtoAdapter.a.a(9, protoAlbumMetadata.playability);
            }
            return a + i + protoAlbumMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoAlbumMetadata protoAlbumMetadata = (ProtoAlbumMetadata) obj;
            ProtoAlbumArtistMetadata.ADAPTER.a().a(vtb, 1, protoAlbumMetadata.artists);
            if (protoAlbumMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 2, protoAlbumMetadata.link);
            }
            if (protoAlbumMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 3, protoAlbumMetadata.name);
            }
            if (protoAlbumMetadata.copyright != null) {
                ProtoAdapter.i.a(vtb, 4, protoAlbumMetadata.copyright);
            }
            if (protoAlbumMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 5, protoAlbumMetadata.covers);
            }
            if (protoAlbumMetadata.year != null) {
                ProtoAdapter.c.a(vtb, 6, protoAlbumMetadata.year);
            }
            if (protoAlbumMetadata.num_discs != null) {
                ProtoAdapter.c.a(vtb, 7, protoAlbumMetadata.num_discs);
            }
            if (protoAlbumMetadata.num_tracks != null) {
                ProtoAdapter.c.a(vtb, 8, protoAlbumMetadata.num_tracks);
            }
            if (protoAlbumMetadata.playability != null) {
                ProtoAdapter.a.a(vtb, 9, protoAlbumMetadata.playability);
            }
            vtb.a(protoAlbumMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoAlbumMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.artists.add(ProtoAlbumArtistMetadata.ADAPTER.a(vta));
                            break;
                        case 2:
                            builder.link((String) ProtoAdapter.i.a(vta));
                            break;
                        case 3:
                            builder.name((String) ProtoAdapter.i.a(vta));
                            break;
                        case 4:
                            builder.copyright((String) ProtoAdapter.i.a(vta));
                            break;
                        case 5:
                            builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                            break;
                        case 6:
                            builder.year((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 7:
                            builder.num_discs((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 8:
                            builder.num_tracks((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 9:
                            builder.playability((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    vta.a(a);
                    return builder.build();
                }
            }
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
        this.artists = vte.a("artists", list);
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
        return a().equals(protoAlbumMetadata.a()) && this.artists.equals(protoAlbumMetadata.artists) && vte.a((Object) this.link, (Object) protoAlbumMetadata.link) && vte.a((Object) this.name, (Object) protoAlbumMetadata.name) && vte.a((Object) this.copyright, (Object) protoAlbumMetadata.copyright) && vte.a((Object) this.covers, (Object) protoAlbumMetadata.covers) && vte.a((Object) this.year, (Object) protoAlbumMetadata.year) && vte.a((Object) this.num_discs, (Object) protoAlbumMetadata.num_discs) && vte.a((Object) this.num_tracks, (Object) protoAlbumMetadata.num_tracks) && vte.a((Object) this.playability, (Object) protoAlbumMetadata.playability);
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
            sb.append(", artists=");
            sb.append(this.artists);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.copyright != null) {
            sb.append(", copyright=");
            sb.append(this.copyright);
        }
        if (this.covers != null) {
            sb.append(", covers=");
            sb.append(this.covers);
        }
        if (this.year != null) {
            sb.append(", year=");
            sb.append(this.year);
        }
        if (this.num_discs != null) {
            sb.append(", num_discs=");
            sb.append(this.num_discs);
        }
        if (this.num_tracks != null) {
            sb.append(", num_tracks=");
            sb.append(this.num_tracks);
        }
        if (this.playability != null) {
            sb.append(", playability=");
            sb.append(this.playability);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoAlbumMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
