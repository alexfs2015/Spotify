package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistFormatListAttribute extends Message<ProtoPlaylistFormatListAttribute, Builder> {
    public static final ProtoAdapter<ProtoPlaylistFormatListAttribute> ADAPTER = new a();
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_VALUE = "";
    private static final long serialVersionUID = 0;
    public final String key;
    public final String value;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistFormatListAttribute, Builder> {
        public String key;
        public String value;

        public final Builder key(String str) {
            this.key = str;
            return this;
        }

        public final Builder value(String str) {
            this.value = str;
            return this;
        }

        public final ProtoPlaylistFormatListAttribute build() {
            return new ProtoPlaylistFormatListAttribute(this.key, this.value, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistFormatListAttribute> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute = (ProtoPlaylistFormatListAttribute) obj;
            int i = 0;
            int a = protoPlaylistFormatListAttribute.key != null ? ProtoAdapter.i.a(1, protoPlaylistFormatListAttribute.key) : 0;
            if (protoPlaylistFormatListAttribute.value != null) {
                i = ProtoAdapter.i.a(2, protoPlaylistFormatListAttribute.value);
            }
            return a + i + protoPlaylistFormatListAttribute.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute = (ProtoPlaylistFormatListAttribute) obj;
            if (protoPlaylistFormatListAttribute.key != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistFormatListAttribute.key);
            }
            if (protoPlaylistFormatListAttribute.value != null) {
                ProtoAdapter.i.a(vtb, 2, protoPlaylistFormatListAttribute.value);
            }
            vtb.a(protoPlaylistFormatListAttribute.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistFormatListAttribute.class);
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
                    builder.key((String) ProtoAdapter.i.a(vta));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.value((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistFormatListAttribute(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistFormatListAttribute)) {
            return false;
        }
        ProtoPlaylistFormatListAttribute protoPlaylistFormatListAttribute = (ProtoPlaylistFormatListAttribute) obj;
        return a().equals(protoPlaylistFormatListAttribute.a()) && vte.a((Object) this.key, (Object) protoPlaylistFormatListAttribute.key) && vte.a((Object) this.value, (Object) protoPlaylistFormatListAttribute.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.key;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.value;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistFormatListAttribute{");
        replace.append('}');
        return replace.toString();
    }
}
