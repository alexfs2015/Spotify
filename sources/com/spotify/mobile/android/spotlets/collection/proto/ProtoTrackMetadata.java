package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoTrackMetadata extends Message<ProtoTrackMetadata, Builder> {
    public static final ProtoAdapter<ProtoTrackMetadata> ADAPTER = new a();
    public static final Boolean DEFAULT_AVAILABLE = Boolean.FALSE;
    public static final Integer DEFAULT_DISC_NUMBER;
    public static final Boolean DEFAULT_HAS_LYRICS = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_EXPLICIT = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_LOCAL = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_PREMIUM_ONLY = Boolean.FALSE;
    public static final Integer DEFAULT_LENGTH;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLAYABLE_TRACK_URI = "";
    public static final String DEFAULT_PREVIEW_ID = "";
    public static final Integer DEFAULT_TRACK_NUMBER;
    private static final long serialVersionUID = 0;
    public final ProtoTrackAlbumMetadata album;
    public final List<ProtoTrackArtistMetadata> artist;
    public final Boolean available;
    public final Integer disc_number;
    public final Boolean has_lyrics;
    public final Boolean is_explicit;
    public final Boolean is_local;
    public final Boolean is_premium_only;
    public final Integer length;
    public final String link;
    public final String name;
    public final String playable_track_uri;
    public final String preview_id;
    public final Integer track_number;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackMetadata, Builder> {
        public ProtoTrackAlbumMetadata album;
        public List<ProtoTrackArtistMetadata> artist = whk.a();
        public Boolean available;
        public Integer disc_number;
        public Boolean has_lyrics;
        public Boolean is_explicit;
        public Boolean is_local;
        public Boolean is_premium_only;
        public Integer length;
        public String link;
        public String name;
        public String playable_track_uri;
        public String preview_id;
        public Integer track_number;

        public final Builder album(ProtoTrackAlbumMetadata protoTrackAlbumMetadata) {
            this.album = protoTrackAlbumMetadata;
            return this;
        }

        public final Builder artist(List<ProtoTrackArtistMetadata> list) {
            whk.a(list);
            this.artist = list;
            return this;
        }

        public final Builder available(Boolean bool) {
            this.available = bool;
            return this;
        }

        public final ProtoTrackMetadata build() {
            ProtoTrackMetadata protoTrackMetadata = r1;
            ProtoTrackMetadata protoTrackMetadata2 = new ProtoTrackMetadata(this.album, this.artist, this.link, this.name, this.length, this.available, this.disc_number, this.track_number, this.is_explicit, this.preview_id, this.is_local, this.has_lyrics, this.is_premium_only, this.playable_track_uri, super.buildUnknownFields());
            return protoTrackMetadata2;
        }

        public final Builder disc_number(Integer num) {
            this.disc_number = num;
            return this;
        }

        public final Builder has_lyrics(Boolean bool) {
            this.has_lyrics = bool;
            return this;
        }

        public final Builder is_explicit(Boolean bool) {
            this.is_explicit = bool;
            return this;
        }

        public final Builder is_local(Boolean bool) {
            this.is_local = bool;
            return this;
        }

        public final Builder is_premium_only(Boolean bool) {
            this.is_premium_only = bool;
            return this;
        }

        public final Builder length(Integer num) {
            this.length = num;
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

        public final Builder playable_track_uri(String str) {
            this.playable_track_uri = str;
            return this;
        }

        public final Builder preview_id(String str) {
            this.preview_id = str;
            return this;
        }

        public final Builder track_number(Integer num) {
            this.track_number = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            int i;
            ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj;
            int i2 = 0;
            int a = (protoTrackMetadata.album != null ? ProtoTrackAlbumMetadata.ADAPTER.a(1, protoTrackMetadata.album) : 0) + ProtoTrackArtistMetadata.ADAPTER.a().a(2, protoTrackMetadata.artist) + (protoTrackMetadata.link != null ? ProtoAdapter.i.a(3, protoTrackMetadata.link) : 0) + (protoTrackMetadata.name != null ? ProtoAdapter.i.a(4, protoTrackMetadata.name) : 0) + (protoTrackMetadata.length != null ? ProtoAdapter.c.a(5, protoTrackMetadata.length) : 0) + (protoTrackMetadata.available != null ? ProtoAdapter.a.a(6, protoTrackMetadata.available) : 0);
            if (protoTrackMetadata.disc_number != null) {
                int i3 = 4 >> 7;
                i = ProtoAdapter.c.a(7, protoTrackMetadata.disc_number);
            } else {
                i = 0;
            }
            int a2 = a + i + (protoTrackMetadata.track_number != null ? ProtoAdapter.c.a(8, protoTrackMetadata.track_number) : 0) + (protoTrackMetadata.is_explicit != null ? ProtoAdapter.a.a(9, protoTrackMetadata.is_explicit) : 0) + (protoTrackMetadata.preview_id != null ? ProtoAdapter.i.a(10, protoTrackMetadata.preview_id) : 0) + (protoTrackMetadata.is_local != null ? ProtoAdapter.a.a(11, protoTrackMetadata.is_local) : 0) + (protoTrackMetadata.has_lyrics != null ? ProtoAdapter.a.a(13, protoTrackMetadata.has_lyrics) : 0) + (protoTrackMetadata.is_premium_only != null ? ProtoAdapter.a.a(14, protoTrackMetadata.is_premium_only) : 0);
            if (protoTrackMetadata.playable_track_uri != null) {
                i2 = ProtoAdapter.i.a(16, protoTrackMetadata.playable_track_uri);
            }
            return a2 + i2 + protoTrackMetadata.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.album((ProtoTrackAlbumMetadata) ProtoTrackAlbumMetadata.ADAPTER.a(whg));
                            break;
                        case 2:
                            builder.artist.add(ProtoTrackArtistMetadata.ADAPTER.a(whg));
                            break;
                        case 3:
                            builder.link((String) ProtoAdapter.i.a(whg));
                            break;
                        case 4:
                            builder.name((String) ProtoAdapter.i.a(whg));
                            break;
                        case 5:
                            builder.length((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 6:
                            builder.available((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 7:
                            builder.disc_number((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 8:
                            builder.track_number((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 9:
                            builder.is_explicit((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 10:
                            builder.preview_id((String) ProtoAdapter.i.a(whg));
                            break;
                        case 11:
                            builder.is_local((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 13:
                            builder.has_lyrics((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 14:
                            builder.is_premium_only((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 16:
                            builder.playable_track_uri((String) ProtoAdapter.i.a(whg));
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
            ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj;
            if (protoTrackMetadata.album != null) {
                ProtoTrackAlbumMetadata.ADAPTER.a(whh, 1, protoTrackMetadata.album);
            }
            ProtoTrackArtistMetadata.ADAPTER.a().a(whh, 2, protoTrackMetadata.artist);
            if (protoTrackMetadata.link != null) {
                ProtoAdapter.i.a(whh, 3, protoTrackMetadata.link);
            }
            if (protoTrackMetadata.name != null) {
                ProtoAdapter.i.a(whh, 4, protoTrackMetadata.name);
            }
            if (protoTrackMetadata.length != null) {
                ProtoAdapter.c.a(whh, 5, protoTrackMetadata.length);
            }
            if (protoTrackMetadata.available != null) {
                ProtoAdapter.a.a(whh, 6, protoTrackMetadata.available);
            }
            if (protoTrackMetadata.disc_number != null) {
                ProtoAdapter.c.a(whh, 7, protoTrackMetadata.disc_number);
            }
            if (protoTrackMetadata.track_number != null) {
                ProtoAdapter.c.a(whh, 8, protoTrackMetadata.track_number);
            }
            if (protoTrackMetadata.is_explicit != null) {
                ProtoAdapter.a.a(whh, 9, protoTrackMetadata.is_explicit);
            }
            if (protoTrackMetadata.preview_id != null) {
                ProtoAdapter.i.a(whh, 10, protoTrackMetadata.preview_id);
            }
            if (protoTrackMetadata.is_local != null) {
                ProtoAdapter.a.a(whh, 11, protoTrackMetadata.is_local);
            }
            if (protoTrackMetadata.has_lyrics != null) {
                ProtoAdapter.a.a(whh, 13, protoTrackMetadata.has_lyrics);
            }
            if (protoTrackMetadata.is_premium_only != null) {
                ProtoAdapter.a.a(whh, 14, protoTrackMetadata.is_premium_only);
            }
            if (protoTrackMetadata.playable_track_uri != null) {
                ProtoAdapter.i.a(whh, 16, protoTrackMetadata.playable_track_uri);
            }
            whh.a(protoTrackMetadata.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_LENGTH = valueOf;
        DEFAULT_DISC_NUMBER = valueOf;
        DEFAULT_TRACK_NUMBER = valueOf;
    }

    public ProtoTrackMetadata(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, List<ProtoTrackArtistMetadata> list, String str, String str2, Integer num, Boolean bool, Integer num2, Integer num3, Boolean bool2, String str3, Boolean bool3, Boolean bool4, Boolean bool5, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.album = protoTrackAlbumMetadata;
        List<ProtoTrackArtistMetadata> list2 = list;
        this.artist = whk.a("artist", list);
        this.link = str;
        this.name = str2;
        this.length = num;
        this.available = bool;
        this.disc_number = num2;
        this.track_number = num3;
        this.is_explicit = bool2;
        this.preview_id = str3;
        this.is_local = bool3;
        this.has_lyrics = bool4;
        this.is_premium_only = bool5;
        this.playable_track_uri = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackMetadata)) {
            return false;
        }
        ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj;
        return a().equals(protoTrackMetadata.a()) && whk.a((Object) this.album, (Object) protoTrackMetadata.album) && this.artist.equals(protoTrackMetadata.artist) && whk.a((Object) this.link, (Object) protoTrackMetadata.link) && whk.a((Object) this.name, (Object) protoTrackMetadata.name) && whk.a((Object) this.length, (Object) protoTrackMetadata.length) && whk.a((Object) this.available, (Object) protoTrackMetadata.available) && whk.a((Object) this.disc_number, (Object) protoTrackMetadata.disc_number) && whk.a((Object) this.track_number, (Object) protoTrackMetadata.track_number) && whk.a((Object) this.is_explicit, (Object) protoTrackMetadata.is_explicit) && whk.a((Object) this.preview_id, (Object) protoTrackMetadata.preview_id) && whk.a((Object) this.is_local, (Object) protoTrackMetadata.is_local) && whk.a((Object) this.has_lyrics, (Object) protoTrackMetadata.has_lyrics) && whk.a((Object) this.is_premium_only, (Object) protoTrackMetadata.is_premium_only) && whk.a((Object) this.playable_track_uri, (Object) protoTrackMetadata.playable_track_uri);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoTrackAlbumMetadata protoTrackAlbumMetadata = this.album;
        int i2 = 0;
        int hashCode2 = (((hashCode + (protoTrackAlbumMetadata != null ? protoTrackAlbumMetadata.hashCode() : 0)) * 37) + this.artist.hashCode()) * 37;
        String str = this.link;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.length;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.available;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num2 = this.disc_number;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.track_number;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_explicit;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        String str3 = this.preview_id;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_local;
        int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.has_lyrics;
        int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.is_premium_only;
        int hashCode13 = (hashCode12 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        String str4 = this.playable_track_uri;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = hashCode13 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.album != null) {
            sb.append(", album=");
            sb.append(this.album);
        }
        if (!this.artist.isEmpty()) {
            String str = "t,sisat r";
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (this.link != null) {
            String str2 = "=,kmil ";
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.length != null) {
            String str3 = "nt,loeh g";
            sb.append(", length=");
            sb.append(this.length);
        }
        if (this.available != null) {
            sb.append(", available=");
            sb.append(this.available);
        }
        if (this.disc_number != null) {
            String str4 = "m u=_bd,sbreci";
            sb.append(", disc_number=");
            sb.append(this.disc_number);
        }
        if (this.track_number != null) {
            sb.append(", track_number=");
            sb.append(this.track_number);
        }
        if (this.is_explicit != null) {
            String str5 = "ii=pctb_ xilse";
            sb.append(", is_explicit=");
            sb.append(this.is_explicit);
        }
        if (this.preview_id != null) {
            String str6 = "=,id_eet ivrp";
            sb.append(", preview_id=");
            sb.append(this.preview_id);
        }
        if (this.is_local != null) {
            String str7 = "o =,llcipas";
            sb.append(", is_local=");
            sb.append(this.is_local);
        }
        if (this.has_lyrics != null) {
            String str8 = "s_rlcy=ihta, ";
            sb.append(", has_lyrics=");
            sb.append(this.has_lyrics);
        }
        if (this.is_premium_only != null) {
            String str9 = "= syn_mspero,mili_";
            sb.append(", is_premium_only=");
            sb.append(this.is_premium_only);
        }
        if (this.playable_track_uri != null) {
            sb.append(", playable_track_uri=");
            sb.append(this.playable_track_uri);
        }
        boolean z = false | true;
        String str10 = "ocamMrPtotdkaTe{taa";
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
