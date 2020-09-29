package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoAlbumArtistMetadata extends Message<ProtoAlbumArtistMetadata, Builder> {
    public static final ProtoAdapter<ProtoAlbumArtistMetadata> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String link;
    public final String name;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoAlbumArtistMetadata, Builder> {
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

        public final ProtoAlbumArtistMetadata build() {
            return new ProtoAlbumArtistMetadata(this.link, this.name, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoAlbumArtistMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoAlbumArtistMetadata protoAlbumArtistMetadata = (ProtoAlbumArtistMetadata) obj;
            int i = 0;
            int a = protoAlbumArtistMetadata.link != null ? ProtoAdapter.i.a(1, protoAlbumArtistMetadata.link) : 0;
            if (protoAlbumArtistMetadata.name != null) {
                i = ProtoAdapter.i.a(2, protoAlbumArtistMetadata.name);
            }
            return a + i + protoAlbumArtistMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoAlbumArtistMetadata protoAlbumArtistMetadata = (ProtoAlbumArtistMetadata) obj;
            if (protoAlbumArtistMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 1, protoAlbumArtistMetadata.link);
            }
            if (protoAlbumArtistMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 2, protoAlbumArtistMetadata.name);
            }
            vtb.a(protoAlbumArtistMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoAlbumArtistMetadata.class);
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
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.name((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public ProtoAlbumArtistMetadata(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoAlbumArtistMetadata)) {
            return false;
        }
        ProtoAlbumArtistMetadata protoAlbumArtistMetadata = (ProtoAlbumArtistMetadata) obj;
        return a().equals(protoAlbumArtistMetadata.a()) && vte.a((Object) this.link, (Object) protoAlbumArtistMetadata.link) && vte.a((Object) this.name, (Object) protoAlbumArtistMetadata.name);
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
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode2 + i2;
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
        StringBuilder replace = sb.replace(0, 2, "ProtoAlbumArtistMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
