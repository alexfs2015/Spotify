package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoTrackAlbumMetadata extends Message<ProtoTrackAlbumMetadata, Builder> {
    public static final ProtoAdapter<ProtoTrackAlbumMetadata> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final ProtoTrackAlbumArtistMetadata artist;
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackAlbumMetadata, Builder> {
        public ProtoTrackAlbumArtistMetadata artist;
        public ProtoImageGroup covers;
        public String link;
        public String name;

        public final Builder artist(ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata) {
            this.artist = protoTrackAlbumArtistMetadata;
            return this;
        }

        public final ProtoTrackAlbumMetadata build() {
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata = r0;
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata2 = new ProtoTrackAlbumMetadata(this.artist, this.link, this.name, this.covers, super.buildUnknownFields());
            return protoTrackAlbumMetadata2;
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
    }

    static final class a extends ProtoAdapter<ProtoTrackAlbumMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackAlbumMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata = (ProtoTrackAlbumMetadata) obj;
            int i = 0;
            int a = (protoTrackAlbumMetadata.artist != null ? ProtoTrackAlbumArtistMetadata.ADAPTER.a(1, protoTrackAlbumMetadata.artist) : 0) + (protoTrackAlbumMetadata.link != null ? ProtoAdapter.i.a(2, protoTrackAlbumMetadata.link) : 0) + (protoTrackAlbumMetadata.name != null ? ProtoAdapter.i.a(3, protoTrackAlbumMetadata.name) : 0);
            if (protoTrackAlbumMetadata.covers != null) {
                int i2 = 2 >> 4;
                i = ProtoImageGroup.ADAPTER.a(4, protoTrackAlbumMetadata.covers);
            }
            return a + i + protoTrackAlbumMetadata.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.artist((ProtoTrackAlbumArtistMetadata) ProtoTrackAlbumArtistMetadata.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.link((String) ProtoAdapter.i.a(whg));
                } else if (b == 3) {
                    builder.name((String) ProtoAdapter.i.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoTrackAlbumMetadata protoTrackAlbumMetadata = (ProtoTrackAlbumMetadata) obj;
            if (protoTrackAlbumMetadata.artist != null) {
                ProtoTrackAlbumArtistMetadata.ADAPTER.a(whh, 1, protoTrackAlbumMetadata.artist);
            }
            if (protoTrackAlbumMetadata.link != null) {
                ProtoAdapter.i.a(whh, 2, protoTrackAlbumMetadata.link);
            }
            if (protoTrackAlbumMetadata.name != null) {
                ProtoAdapter.i.a(whh, 3, protoTrackAlbumMetadata.name);
            }
            if (protoTrackAlbumMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(whh, 4, protoTrackAlbumMetadata.covers);
            }
            whh.a(protoTrackAlbumMetadata.a());
        }
    }

    public ProtoTrackAlbumMetadata(ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata, String str, String str2, ProtoImageGroup protoImageGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        this.artist = protoTrackAlbumArtistMetadata;
        this.link = str;
        this.name = str2;
        this.covers = protoImageGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackAlbumMetadata)) {
            return false;
        }
        ProtoTrackAlbumMetadata protoTrackAlbumMetadata = (ProtoTrackAlbumMetadata) obj;
        return a().equals(protoTrackAlbumMetadata.a()) && whk.a((Object) this.artist, (Object) protoTrackAlbumMetadata.artist) && whk.a((Object) this.link, (Object) protoTrackAlbumMetadata.link) && whk.a((Object) this.name, (Object) protoTrackAlbumMetadata.name) && whk.a((Object) this.covers, (Object) protoTrackAlbumMetadata.covers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            ProtoTrackAlbumArtistMetadata protoTrackAlbumArtistMetadata = this.artist;
            int i2 = 0;
            int hashCode2 = (hashCode + (protoTrackAlbumArtistMetadata != null ? protoTrackAlbumArtistMetadata.hashCode() : 0)) * 37;
            String str = this.link;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ProtoImageGroup protoImageGroup = this.covers;
            if (protoImageGroup != null) {
                i2 = protoImageGroup.hashCode();
            }
            i = hashCode4 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.artist != null) {
            String str = "=,si arts";
            sb.append(", artist=");
            sb.append(this.artist);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            String str2 = "=,emm n";
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.covers != null) {
            String str3 = "oc vo=,rs";
            sb.append(", covers=");
            sb.append(this.covers);
        }
        String str4 = "dotaMbatumebTPcAk{tlaorr";
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackAlbumMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
