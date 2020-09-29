package com.spotify.mobile.android.spotlets.collection.proto;

import com.spotify.mobile.android.spotlets.show.proto.ProtoImageGroup;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoTrackArtistMetadata extends Message<ProtoTrackArtistMetadata, Builder> {
    public static final ProtoAdapter<ProtoTrackArtistMetadata> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;
    public final String link;
    public final String name;
    public final ProtoImageGroup portraits;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackArtistMetadata, Builder> {
        public String link;
        public String name;
        public ProtoImageGroup portraits;

        public final ProtoTrackArtistMetadata build() {
            return new ProtoTrackArtistMetadata(this.link, this.name, this.portraits, super.buildUnknownFields());
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder portraits(ProtoImageGroup protoImageGroup) {
            this.portraits = protoImageGroup;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackArtistMetadata> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackArtistMetadata.class);
        }

        public final /* synthetic */ int a(Object obj) {
            int i;
            ProtoTrackArtistMetadata protoTrackArtistMetadata = (ProtoTrackArtistMetadata) obj;
            int i2 = 0;
            int a = protoTrackArtistMetadata.link != null ? ProtoAdapter.i.a(1, protoTrackArtistMetadata.link) : 0;
            if (protoTrackArtistMetadata.name != null) {
                boolean z = true & true;
                i = ProtoAdapter.i.a(2, protoTrackArtistMetadata.name);
            } else {
                i = 0;
            }
            int i3 = a + i;
            if (protoTrackArtistMetadata.portraits != null) {
                i2 = ProtoImageGroup.ADAPTER.a(3, protoTrackArtistMetadata.portraits);
            }
            return i3 + i2 + protoTrackArtistMetadata.a().h();
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
                    builder.link((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.name((String) ProtoAdapter.i.a(whg));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.portraits((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoTrackArtistMetadata protoTrackArtistMetadata = (ProtoTrackArtistMetadata) obj;
            if (protoTrackArtistMetadata.link != null) {
                ProtoAdapter.i.a(whh, 1, protoTrackArtistMetadata.link);
            }
            if (protoTrackArtistMetadata.name != null) {
                ProtoAdapter.i.a(whh, 2, protoTrackArtistMetadata.name);
            }
            if (protoTrackArtistMetadata.portraits != null) {
                ProtoImageGroup.ADAPTER.a(whh, 3, protoTrackArtistMetadata.portraits);
            }
            whh.a(protoTrackArtistMetadata.a());
        }
    }

    public ProtoTrackArtistMetadata(String str, String str2, ProtoImageGroup protoImageGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
        this.portraits = protoImageGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackArtistMetadata)) {
            return false;
        }
        ProtoTrackArtistMetadata protoTrackArtistMetadata = (ProtoTrackArtistMetadata) obj;
        return a().equals(protoTrackArtistMetadata.a()) && whk.a((Object) this.link, (Object) protoTrackArtistMetadata.link) && whk.a((Object) this.name, (Object) protoTrackArtistMetadata.name) && whk.a((Object) this.portraits, (Object) protoTrackArtistMetadata.portraits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            String str = this.link;
            int i2 = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ProtoImageGroup protoImageGroup = this.portraits;
            if (protoImageGroup != null) {
                i2 = protoImageGroup.hashCode();
            }
            i = hashCode3 + i2;
            this.hashCode = i;
        }
        return i;
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
        if (this.portraits != null) {
            String str = ",ass=t rtipr";
            sb.append(", portraits=");
            sb.append(this.portraits);
        }
        String str2 = "arTmtoaAtPitMra{ktatsdcoe";
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackArtistMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
