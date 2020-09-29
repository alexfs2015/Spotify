package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoOnlineData extends Message<ProtoOnlineData, Builder> {
    public static final ProtoAdapter<ProtoOnlineData> ADAPTER = new a();
    public static final Integer DEFAULT_NUM_FOLLOWERS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Integer num_followers;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoOnlineData, Builder> {
        public Integer num_followers;

        public final Builder num_followers(Integer num) {
            this.num_followers = num;
            return this;
        }

        public final ProtoOnlineData build() {
            return new ProtoOnlineData(this.num_followers, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoOnlineData> {
        public final /* synthetic */ int a(Object obj) {
            ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj;
            return (protoOnlineData.num_followers != null ? ProtoAdapter.c.a(1, protoOnlineData.num_followers) : 0) + protoOnlineData.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj;
            if (protoOnlineData.num_followers != null) {
                ProtoAdapter.c.a(vtb, 1, protoOnlineData.num_followers);
            }
            vtb.a(protoOnlineData.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoOnlineData.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.num_followers((Integer) ProtoAdapter.c.a(vta));
                }
            }
        }
    }

    public ProtoOnlineData(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.num_followers = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoOnlineData)) {
            return false;
        }
        ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj;
        return a().equals(protoOnlineData.a()) && vte.a((Object) this.num_followers, (Object) protoOnlineData.num_followers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Integer num = this.num_followers;
        int hashCode2 = hashCode + (num != null ? num.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.num_followers != null) {
            sb.append(", num_followers=");
            sb.append(this.num_followers);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoOnlineData{");
        replace.append('}');
        return replace.toString();
    }
}
