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

        public final ProtoOnlineData build() {
            return new ProtoOnlineData(this.num_followers, super.buildUnknownFields());
        }

        public final Builder num_followers(Integer num) {
            this.num_followers = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoOnlineData> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoOnlineData.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj;
            return (protoOnlineData.num_followers != null ? ProtoAdapter.c.a(1, protoOnlineData.num_followers) : 0) + protoOnlineData.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.num_followers((Integer) ProtoAdapter.c.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoOnlineData protoOnlineData = (ProtoOnlineData) obj;
            if (protoOnlineData.num_followers != null) {
                ProtoAdapter.c.a(whh, 1, protoOnlineData.num_followers);
            }
            whh.a(protoOnlineData.a());
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
        return a().equals(protoOnlineData.a()) && whk.a((Object) this.num_followers, (Object) protoOnlineData.num_followers);
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
            String str = "e=s_su,mlo lowrn";
            sb.append(", num_followers=");
            sb.append(this.num_followers);
        }
        String str2 = "{oPmatanlDtoenir";
        StringBuilder replace = sb.replace(0, 2, "ProtoOnlineData{");
        replace.append('}');
        return replace.toString();
    }
}
