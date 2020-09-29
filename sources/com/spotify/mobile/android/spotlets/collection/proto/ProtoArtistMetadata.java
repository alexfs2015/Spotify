package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoArtistMetadata extends Message<ProtoArtistMetadata, Builder> {
    public static final ProtoAdapter<ProtoArtistMetadata> ADAPTER = new a();
    public static final Boolean DEFAULT_IS_VARIOUS_ARTISTS = Boolean.FALSE;
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final ProtoImageGroup covers;
    public final Boolean is_various_artists;
    public final String link;
    public final String name;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoArtistMetadata, Builder> {
        public ProtoImageGroup covers;
        public Boolean is_various_artists;
        public String link;
        public String name;

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder is_various_artists(Boolean bool) {
            this.is_various_artists = bool;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final ProtoArtistMetadata build() {
            ProtoArtistMetadata protoArtistMetadata = new ProtoArtistMetadata(this.link, this.name, this.is_various_artists, this.covers, super.buildUnknownFields());
            return protoArtistMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoArtistMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoArtistMetadata protoArtistMetadata = (ProtoArtistMetadata) obj;
            int i = 0;
            int a = (protoArtistMetadata.link != null ? ProtoAdapter.i.a(1, protoArtistMetadata.link) : 0) + (protoArtistMetadata.name != null ? ProtoAdapter.i.a(2, protoArtistMetadata.name) : 0) + (protoArtistMetadata.is_various_artists != null ? ProtoAdapter.a.a(3, protoArtistMetadata.is_various_artists) : 0);
            if (protoArtistMetadata.covers != null) {
                i = ProtoImageGroup.ADAPTER.a(4, protoArtistMetadata.covers);
            }
            return a + i + protoArtistMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoArtistMetadata protoArtistMetadata = (ProtoArtistMetadata) obj;
            if (protoArtistMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 1, protoArtistMetadata.link);
            }
            if (protoArtistMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 2, protoArtistMetadata.name);
            }
            if (protoArtistMetadata.is_various_artists != null) {
                ProtoAdapter.a.a(vtb, 3, protoArtistMetadata.is_various_artists);
            }
            if (protoArtistMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 4, protoArtistMetadata.covers);
            }
            vtb.a(protoArtistMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoArtistMetadata.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b == 1) {
                    builder.link((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.name((String) ProtoAdapter.i.a(vta));
                } else if (b == 3) {
                    builder.is_various_artists((Boolean) ProtoAdapter.a.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoArtistMetadata(String str, String str2, Boolean bool, ProtoImageGroup protoImageGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
        this.is_various_artists = bool;
        this.covers = protoImageGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoArtistMetadata)) {
            return false;
        }
        ProtoArtistMetadata protoArtistMetadata = (ProtoArtistMetadata) obj;
        return a().equals(protoArtistMetadata.a()) && vte.a((Object) this.link, (Object) protoArtistMetadata.link) && vte.a((Object) this.name, (Object) protoArtistMetadata.name) && vte.a((Object) this.is_various_artists, (Object) protoArtistMetadata.is_various_artists) && vte.a((Object) this.covers, (Object) protoArtistMetadata.covers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.link;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.is_various_artists;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        ProtoImageGroup protoImageGroup = this.covers;
        if (protoImageGroup != null) {
            i2 = protoImageGroup.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.is_various_artists != null) {
            sb.append(", is_various_artists=");
            sb.append(this.is_various_artists);
        }
        if (this.covers != null) {
            sb.append(", covers=");
            sb.append(this.covers);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoArtistMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
