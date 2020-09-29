package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoEpisodeShowMetadata extends Message<ProtoEpisodeShowMetadata, Builder> {
    public static final ProtoAdapter<ProtoEpisodeShowMetadata> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PUBLISHER = "";
    private static final long serialVersionUID = 0;
    public final ProtoImageGroup covers;
    public final String link;
    public final String name;
    public final String publisher;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoEpisodeShowMetadata, Builder> {
        public ProtoImageGroup covers;
        public String link;
        public String name;
        public String publisher;

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder publisher(String str) {
            this.publisher = str;
            return this;
        }

        public final Builder covers(ProtoImageGroup protoImageGroup) {
            this.covers = protoImageGroup;
            return this;
        }

        public final ProtoEpisodeShowMetadata build() {
            ProtoEpisodeShowMetadata protoEpisodeShowMetadata = new ProtoEpisodeShowMetadata(this.link, this.name, this.publisher, this.covers, super.buildUnknownFields());
            return protoEpisodeShowMetadata;
        }
    }

    static final class a extends ProtoAdapter<ProtoEpisodeShowMetadata> {
        public final /* synthetic */ int a(Object obj) {
            ProtoEpisodeShowMetadata protoEpisodeShowMetadata = (ProtoEpisodeShowMetadata) obj;
            int i = 0;
            int a = (protoEpisodeShowMetadata.link != null ? ProtoAdapter.i.a(1, protoEpisodeShowMetadata.link) : 0) + (protoEpisodeShowMetadata.name != null ? ProtoAdapter.i.a(2, protoEpisodeShowMetadata.name) : 0) + (protoEpisodeShowMetadata.publisher != null ? ProtoAdapter.i.a(3, protoEpisodeShowMetadata.publisher) : 0);
            if (protoEpisodeShowMetadata.covers != null) {
                i = ProtoImageGroup.ADAPTER.a(4, protoEpisodeShowMetadata.covers);
            }
            return a + i + protoEpisodeShowMetadata.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoEpisodeShowMetadata protoEpisodeShowMetadata = (ProtoEpisodeShowMetadata) obj;
            if (protoEpisodeShowMetadata.link != null) {
                ProtoAdapter.i.a(vtb, 1, protoEpisodeShowMetadata.link);
            }
            if (protoEpisodeShowMetadata.name != null) {
                ProtoAdapter.i.a(vtb, 2, protoEpisodeShowMetadata.name);
            }
            if (protoEpisodeShowMetadata.publisher != null) {
                ProtoAdapter.i.a(vtb, 3, protoEpisodeShowMetadata.publisher);
            }
            if (protoEpisodeShowMetadata.covers != null) {
                ProtoImageGroup.ADAPTER.a(vtb, 4, protoEpisodeShowMetadata.covers);
            }
            vtb.a(protoEpisodeShowMetadata.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoEpisodeShowMetadata.class);
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
                    builder.publisher((String) ProtoAdapter.i.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.covers((ProtoImageGroup) ProtoImageGroup.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoEpisodeShowMetadata(String str, String str2, String str3, ProtoImageGroup protoImageGroup, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = str;
        this.name = str2;
        this.publisher = str3;
        this.covers = protoImageGroup;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoEpisodeShowMetadata)) {
            return false;
        }
        ProtoEpisodeShowMetadata protoEpisodeShowMetadata = (ProtoEpisodeShowMetadata) obj;
        return a().equals(protoEpisodeShowMetadata.a()) && vte.a((Object) this.link, (Object) protoEpisodeShowMetadata.link) && vte.a((Object) this.name, (Object) protoEpisodeShowMetadata.name) && vte.a((Object) this.publisher, (Object) protoEpisodeShowMetadata.publisher) && vte.a((Object) this.covers, (Object) protoEpisodeShowMetadata.covers);
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
        String str3 = this.publisher;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
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
        if (this.publisher != null) {
            sb.append(", publisher=");
            sb.append(this.publisher);
        }
        if (this.covers != null) {
            sb.append(", covers=");
            sb.append(this.covers);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoEpisodeShowMetadata{");
        replace.append('}');
        return replace.toString();
    }
}
