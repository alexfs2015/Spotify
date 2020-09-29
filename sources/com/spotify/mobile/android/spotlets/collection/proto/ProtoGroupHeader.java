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

        public final ProtoGroupHeader build() {
            return new ProtoGroupHeader(this.header_field, this.index, this.length, super.buildUnknownFields());
        }

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
    }

    static final class a extends ProtoAdapter<ProtoGroupHeader> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoGroupHeader.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj;
            int i = 0;
            int a = (protoGroupHeader.header_field != null ? ProtoAdapter.i.a(1, protoGroupHeader.header_field) : 0) + (protoGroupHeader.index != null ? ProtoAdapter.c.a(2, protoGroupHeader.index) : 0);
            if (protoGroupHeader.length != null) {
                i = ProtoAdapter.c.a(3, protoGroupHeader.length);
            }
            return a + i + protoGroupHeader.a().h();
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
                    builder.header_field((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.index((Integer) ProtoAdapter.c.a(whg));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.length((Integer) ProtoAdapter.c.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoGroupHeader protoGroupHeader = (ProtoGroupHeader) obj;
            if (protoGroupHeader.header_field != null) {
                ProtoAdapter.i.a(whh, 1, protoGroupHeader.header_field);
            }
            if (protoGroupHeader.index != null) {
                ProtoAdapter.c.a(whh, 2, protoGroupHeader.index);
            }
            if (protoGroupHeader.length != null) {
                ProtoAdapter.c.a(whh, 3, protoGroupHeader.length);
            }
            whh.a(protoGroupHeader.a());
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
        return a().equals(protoGroupHeader.a()) && whk.a((Object) this.header_field, (Object) protoGroupHeader.header_field) && whk.a((Object) this.index, (Object) protoGroupHeader.index) && whk.a((Object) this.length, (Object) protoGroupHeader.length);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
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
            i = hashCode3 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            String str = "hese=edlrdfia_ ";
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.index != null) {
            String str2 = ", nmidxe";
            sb.append(", index=");
            sb.append(this.index);
        }
        if (this.length != null) {
            String str3 = "g=nlo,he ";
            sb.append(", length=");
            sb.append(this.length);
        }
        String str4 = "GP{robrHdrauoeeot";
        StringBuilder replace = sb.replace(0, 2, "ProtoGroupHeader{");
        replace.append('}');
        return replace.toString();
    }
}
