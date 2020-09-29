package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoGroupHeader extends Message<ProtoGroupHeader, Builder> {
    public static final ProtoAdapter<ProtoGroupHeader> ADAPTER = new a();
    public static final String DEFAULT_HEADER_FIELD = "";
    public static final Integer DEFAULT_INDEX;
    public static final Integer DEFAULT_LENGTH;
    private static final long serialVersionUID = 0;
    public final String header_field;
    public final Integer index;
    public final Integer length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoGroupHeader, Builder> {
        public String header_field;
        public Integer index;
        public Integer length;

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder index(Integer num) {
            this.index = num;
            return this;
        }

        public final Builder length(Integer num) {
            this.length = num;
            return this;
        }

        public final ProtoGroupHeader build() {
            return new ProtoGroupHeader(this.header_field, this.index, this.length, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoGroupHeader> {
        public final /* synthetic */ int a(Object obj) {
            ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj;
            int i = 0;
            int a = (protoGroupHeader.header_field != null ? ProtoAdapter.i.a(1, protoGroupHeader.header_field) : 0) + (protoGroupHeader.index != null ? ProtoAdapter.c.a(2, protoGroupHeader.index) : 0);
            if (protoGroupHeader.length != null) {
                i = ProtoAdapter.c.a(3, protoGroupHeader.length);
            }
            return a + i + protoGroupHeader.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj;
            if (protoGroupHeader.header_field != null) {
                ProtoAdapter.i.a(vtb, 1, protoGroupHeader.header_field);
            }
            if (protoGroupHeader.index != null) {
                ProtoAdapter.c.a(vtb, 2, protoGroupHeader.index);
            }
            if (protoGroupHeader.length != null) {
                ProtoAdapter.c.a(vtb, 3, protoGroupHeader.length);
            }
            vtb.a(protoGroupHeader.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoGroupHeader.class);
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
                    builder.header_field((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.index((Integer) ProtoAdapter.c.a(vta));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.length((Integer) ProtoAdapter.c.a(vta));
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_INDEX = valueOf;
        DEFAULT_LENGTH = valueOf;
    }

    public ProtoGroupHeader(String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.index = num;
        this.length = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoGroupHeader)) {
            return false;
        }
        ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj;
        return a().equals(protoGroupHeader.a()) && vte.a((Object) this.header_field, (Object) protoGroupHeader.header_field) && vte.a((Object) this.index, (Object) protoGroupHeader.index) && vte.a((Object) this.length, (Object) protoGroupHeader.length);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.header_field;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.index;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.length;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoGroupHeader{");
        replace.append('}');
        return replace.toString();
    }
}
