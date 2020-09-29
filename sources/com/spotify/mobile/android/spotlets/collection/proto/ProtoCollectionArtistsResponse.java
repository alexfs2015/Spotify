package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoCollectionArtistsResponse extends Message<ProtoCollectionArtistsResponse, Builder> {
    public static final ProtoAdapter<ProtoCollectionArtistsResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoCollectionArtistsItem> item;
    public final Boolean loading_contents;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionArtistsResponse, Builder> {
        public List<ProtoCollectionArtistsItem> item = whk.a();
        public Boolean loading_contents;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoCollectionArtistsResponse build() {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = new ProtoCollectionArtistsResponse(this.item, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoCollectionArtistsResponse;
        }

        public final Builder item(List<ProtoCollectionArtistsItem> list) {
            whk.a(list);
            this.item = list;
            return this;
        }

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final Builder unfiltered_length(Integer num) {
            this.unfiltered_length = num;
            return this;
        }

        public final Builder unranged_length(Integer num) {
            this.unranged_length = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionArtistsResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionArtistsResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj;
            int i = 0;
            boolean z = true;
            int a = ProtoCollectionArtistsItem.ADAPTER.a().a(1, protoCollectionArtistsResponse.item) + (protoCollectionArtistsResponse.unfiltered_length != null ? ProtoAdapter.c.a(2, protoCollectionArtistsResponse.unfiltered_length) : 0) + (protoCollectionArtistsResponse.unranged_length != null ? ProtoAdapter.c.a(3, protoCollectionArtistsResponse.unranged_length) : 0);
            if (protoCollectionArtistsResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(4, protoCollectionArtistsResponse.loading_contents);
            }
            return a + i + protoCollectionArtistsResponse.a().h();
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
                    builder.item.add(ProtoCollectionArtistsItem.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.unfiltered_length((Integer) ProtoAdapter.c.a(whg));
                } else if (b == 3) {
                    builder.unranged_length((Integer) ProtoAdapter.c.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.loading_contents((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj;
            ProtoCollectionArtistsItem.ADAPTER.a().a(whh, 1, protoCollectionArtistsResponse.item);
            if (protoCollectionArtistsResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(whh, 2, protoCollectionArtistsResponse.unfiltered_length);
            }
            if (protoCollectionArtistsResponse.unranged_length != null) {
                ProtoAdapter.c.a(whh, 3, protoCollectionArtistsResponse.unranged_length);
            }
            if (protoCollectionArtistsResponse.loading_contents != null) {
                ProtoAdapter.a.a(whh, 4, protoCollectionArtistsResponse.loading_contents);
            }
            whh.a(protoCollectionArtistsResponse.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoCollectionArtistsResponse(List<ProtoCollectionArtistsItem> list, Integer num, Integer num2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = whk.a("item", list);
        this.unfiltered_length = num;
        this.unranged_length = num2;
        this.loading_contents = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoCollectionArtistsResponse)) {
            return false;
        }
        ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj;
        return a().equals(protoCollectionArtistsResponse.a()) && this.item.equals(protoCollectionArtistsResponse.item) && whk.a((Object) this.unfiltered_length, (Object) protoCollectionArtistsResponse.unfiltered_length) && whk.a((Object) this.unranged_length, (Object) protoCollectionArtistsResponse.unranged_length) && whk.a((Object) this.loading_contents, (Object) protoCollectionArtistsResponse.loading_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
            Integer num = this.unfiltered_length;
            int i2 = 0;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.unranged_length;
            int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool = this.loading_contents;
            if (bool != null) {
                i2 = bool.hashCode();
            }
            i = hashCode3 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            String str = "emsi, =";
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            String str2 = "=aemledgntu_,rghnn";
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            String str3 = "adtno ooi,gen_lsct=";
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        String str4 = "roptobt{esocCRlsiistnsroeetPnAl";
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionArtistsResponse{");
        replace.append('}');
        return replace.toString();
    }
}
