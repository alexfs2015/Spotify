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
        public List<ProtoTrackArtistMetadata> artist = vte.a();
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
            vte.a(list);
            this.artist = list;
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

        public final Builder length(Integer num) {
            this.length = num;
            return this;
        }

        public final Builder available(Boolean bool) {
            this.available = bool;
            return this;
        }

        public final Builder disc_number(Integer num) {
            this.disc_number = num;
            return this;
        }

        public final Builder track_number(Integer num) {
            this.track_number = num;
            return this;
        }

        public final Builder is_explicit(Boolean bool) {
            this.is_explicit = bool;
            return this;
        }

        public final Builder preview_id(String str) {
            this.preview_id = str;
            return this;
        }

        public final Builder is_local(Boolean bool) {
            this.is_local = bool;
            return this;
        }

        public final Builder has_lyrics(Boolean bool) {
            this.has_lyrics = bool;
            return this;
        }

        public final Builder is_premium_only(Boolean bool) {
            this.is_premium_only = bool;
            return this;
        }

        public final Builder playable_track_uri(String str) {
            this.playable_track_uri = str;
            return this;
        }

        public final ProtoTrackMetadata build() {
            ProtoTrackMetadata protoTrackMetadata = new ProtoTrackMetadata(this.album, this.artist, this.link, this.name, this.length, this.available, this.disc_number, this.track_number, this.is_explicit, this.preview_id, this.is_local, this.has_lyrics, this.is_premium_only, this.playable_track_uri, super.buildUnknownFields());
            return protoTrackMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj;
            int i = 0;
            int a = (protoTrackMetadata.album != null ? ProtoTrackAlbumMetadata.ADAPTER.a(1, protoTrackMetadata.album) : 0) + ProtoTrackArtistMetadata.ADAPTER.a().a(2, protoTrackMetadata.artist) + (protoTrackMetadata.link != null ? ProtoAdapter.i.a(3, protoTrackMetadata.link) : 0) + (protoTrackMetadata.name != null ? ProtoAdapter.i.a(4, protoTrackMetadata.name) : 0) + (protoTrackMetadata.length != null ? ProtoAdapter.c.a(5, protoTrackMetadata.length) : 0) + (protoTrackMetadata.available != null ? ProtoAdapter.a.a(6, protoTrackMetadata.available) : 0) + (protoTrackMetadata.disc_number != null ? ProtoAdapter.c.a(7, protoTrackMetadata.disc_number) : 0) + (protoTrackMetadata.track_number != null ? ProtoAdapter.c.a(8, protoTrackMetadata.track_number) : 0) + (protoTrackMetadata.is_explicit != null ? ProtoAdapter.a.a(9, protoTrackMetadata.is_explicit) : 0) + (protoTrackMetadata.preview_id != null ? ProtoAdapter.i.a(10, protoTrackMetadata.preview_id) : 0) + (protoTrackMetadata.is_local != null ? ProtoAdapter.a.a(11, protoTrackMetadata.is_local) : 0) + (protoTrackMetadata.has_lyrics != null ? ProtoAdapter.a.a(13, protoTrackMetadata.has_lyrics) : 0) + (protoTrackMetadata.is_premium_only != null ? ProtoAdapter.a.a(14, protoTrackMetadata.is_premium_only) : 0);
            if (protoTrackMetadata.playable_track_uri != null) {
                i = ProtoAdapter.i.a(16, protoTrackMetadata.playable_track_uri);
            }
            return a + i + protoTrackMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoTrackMetadata protoTrackMetadata = (ProtoTrackMetadata) obj;
            if (protoTrackMetadata.album != null) {
                ProtoTrackAlbumMetadata.ADAPTER.a(vtb, 1, protoTrackMetadata.album);
            }
            ProtoTrackArtistMetadata.ADAPTER.a().a(vtb, 2, protoTrackMetadata.artist);
            if (protoTrackMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 3, protoTrackMetadata.link);
            }
            if (protoTrackMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 4, protoTrackMetadata.name);
            }
            if (protoTrackMetadata.length != null) {
                ProtoAdapter.c.a(vtb, 5, protoTrackMetadata.length);
            }
            if (protoTrackMetadata.available != null) {
                ProtoAdapter.a.a(vtb, 6, protoTrackMetadata.available);
            }
            if (protoTrackMetadata.disc_number != null) {
                ProtoAdapter.c.a(vtb, 7, protoTrackMetadata.disc_number);
            }
            if (protoTrackMetadata.track_number != null) {
                ProtoAdapter.c.a(vtb, 8, protoTrackMetadata.track_number);
            }
            if (protoTrackMetadata.is_explicit != null) {
                ProtoAdapter.a.a(vtb, 9, protoTrackMetadata.is_explicit);
            }
            if (protoTrackMetadata.preview_id != null) {
                ProtoAdapter.i.a(vtb, 10, protoTrackMetadata.preview_id);
            }
            if (protoTrackMetadata.is_local != null) {
                ProtoAdapter.a.a(vtb, 11, protoTrackMetadata.is_local);
            }
            if (protoTrackMetadata.has_lyrics != null) {
                ProtoAdapter.a.a(vtb, 13, protoTrackMetadata.has_lyrics);
            }
            if (protoTrackMetadata.is_premium_only != null) {
                ProtoAdapter.a.a(vtb, 14, protoTrackMetadata.is_premium_only);
            }
            if (protoTrackMetadata.playable_track_uri != null) {
                ProtoAdapter.i.a(vtb, 16, protoTrackMetadata.playable_track_uri);
            }
            vtb.a(protoTrackMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.album((ProtoTrackAlbumMetadata) ProtoTrackAlbumMetadata.ADAPTER.a(vta));
                            break;
                        case 2:
                            builder.artist.add(ProtoTrackArtistMetadata.ADAPTER.a(vta));
                            break;
                        case 3:
                            builder.link((String) ProtoAdapter.i.a(vta));
                            break;
                        case 4:
                            builder.name((String) ProtoAdapter.i.a(vta));
                            break;
                        case 5:
                            builder.length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 6:
                            builder.available((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 7:
                            builder.disc_number((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 8:
                            builder.track_number((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 9:
                            builder.is_explicit((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 10:
                            builder.preview_id((String) ProtoAdapter.i.a(vta));
                            break;
                        case 11:
                            builder.is_local((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 13:
                            builder.has_lyrics((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 14:
                            builder.is_premium_only((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 16:
                            builder.playable_track_uri((String) ProtoAdapter.i.a(vta));
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
        DEFAULT_LENGTH = valueOf;
        DEFAULT_DISC_NUMBER = valueOf;
        DEFAULT_TRACK_NUMBER = valueOf;
    }

    public ProtoTrackMetadata(ProtoTrackAlbumMetadata protoTrackAlbumMetadata, List<ProtoTrackArtistMetadata> list, String str, String str2, Integer num, Boolean bool, Integer num2, Integer num3, Boolean bool2, String str3, Boolean bool3, Boolean bool4, Boolean bool5, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.album = protoTrackAlbumMetadata;
        List<ProtoTrackArtistMetadata> list2 = list;
        this.artist = vte.a("artist", list);
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
        return a().equals(protoTrackMetadata.a()) && vte.a((Object) this.album, (Object) protoTrackMetadata.album) && this.artist.equals(protoTrackMetadata.artist) && vte.a((Object) this.link, (Object) protoTrackMetadata.link) && vte.a((Object) this.name, (Object) protoTrackMetadata.name) && vte.a((Object) this.length, (Object) protoTrackMetadata.length) && vte.a((Object) this.available, (Object) protoTrackMetadata.available) && vte.a((Object) this.disc_number, (Object) protoTrackMetadata.disc_number) && vte.a((Object) this.track_number, (Object) protoTrackMetadata.track_number) && vte.a((Object) this.is_explicit, (Object) protoTrackMetadata.is_explicit) && vte.a((Object) this.preview_id, (Object) protoTrackMetadata.preview_id) && vte.a((Object) this.is_local, (Object) protoTrackMetadata.is_local) && vte.a((Object) this.has_lyrics, (Object) protoTrackMetadata.has_lyrics) && vte.a((Object) this.is_premium_only, (Object) protoTrackMetadata.is_premium_only) && vte.a((Object) this.playable_track_uri, (Object) protoTrackMetadata.playable_track_uri);
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
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        if (this.available != null) {
            sb.append(", available=");
            sb.append(this.available);
        }
        if (this.disc_number != null) {
            sb.append(", disc_number=");
            sb.append(this.disc_number);
        }
        if (this.track_number != null) {
            sb.append(", track_number=");
            sb.append(this.track_number);
        }
        if (this.is_explicit != null) {
            sb.append(", is_explicit=");
            sb.append(this.is_explicit);
        }
        if (this.preview_id != null) {
            sb.append(", preview_id=");
            sb.append(this.preview_id);
        }
        if (this.is_local != null) {
            sb.append(", is_local=");
            sb.append(this.is_local);
        }
        if (this.has_lyrics != null) {
            sb.append(", has_lyrics=");
            sb.append(this.has_lyrics);
        }
        if (this.is_premium_only != null) {
            sb.append(", is_premium_only=");
            sb.append(this.is_premium_only);
        }
        if (this.playable_track_uri != null) {
            sb.append(", playable_track_uri=");
            sb.append(this.playable_track_uri);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
