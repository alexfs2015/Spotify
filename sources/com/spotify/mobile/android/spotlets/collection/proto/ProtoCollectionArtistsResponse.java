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
        public List<ProtoCollectionArtistsItem> item = vte.a();
        public Boolean loading_contents;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final Builder item(List<ProtoCollectionArtistsItem> list) {
            vte.a(list);
            this.item = list;
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

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final ProtoCollectionArtistsResponse build() {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = new ProtoCollectionArtistsResponse(this.item, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoCollectionArtistsResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionArtistsResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj;
            int i = 0;
            int a = ProtoCollectionArtistsItem.ADAPTER.a().a(1, protoCollectionArtistsResponse.item) + (protoCollectionArtistsResponse.unfiltered_length != null ? ProtoAdapter.c.a(2, protoCollectionArtistsResponse.unfiltered_length) : 0) + (protoCollectionArtistsResponse.unranged_length != null ? ProtoAdapter.c.a(3, protoCollectionArtistsResponse.unranged_length) : 0);
            if (protoCollectionArtistsResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(4, protoCollectionArtistsResponse.loading_contents);
            }
            return a + i + protoCollectionArtistsResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoCollectionArtistsResponse protoCollectionArtistsResponse = (ProtoCollectionArtistsResponse) obj;
            ProtoCollectionArtistsItem.ADAPTER.a().a(vtb, 1, protoCollectionArtistsResponse.item);
            if (protoCollectionArtistsResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(vtb, 2, protoCollectionArtistsResponse.unfiltered_length);
            }
            if (protoCollectionArtistsResponse.unranged_length != null) {
                ProtoAdapter.c.a(vtb, 3, protoCollectionArtistsResponse.unranged_length);
            }
            if (protoCollectionArtistsResponse.loading_contents != null) {
                ProtoAdapter.a.a(vtb, 4, protoCollectionArtistsResponse.loading_contents);
            }
            vtb.a(protoCollectionArtistsResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionArtistsResponse.class);
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
                    builder.item.add(ProtoCollectionArtistsItem.ADAPTER.a(vta));
                } else if (b == 2) {
                    builder.unfiltered_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 3) {
                    builder.unranged_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.loading_contents((Boolean) ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoCollectionArtistsResponse(List<ProtoCollectionArtistsItem> list, Integer num, Integer num2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = vte.a("item", list);
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
        return a().equals(protoCollectionArtistsResponse.a()) && this.item.equals(protoCollectionArtistsResponse.item) && vte.a((Object) this.unfiltered_length, (Object) protoCollectionArtistsResponse.unfiltered_length) && vte.a((Object) this.unranged_length, (Object) protoCollectionArtistsResponse.unranged_length) && vte.a((Object) this.loading_contents, (Object) protoCollectionArtistsResponse.loading_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
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
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionArtistsResponse{");
        replace.append('}');
        return replace.toString();
    }
}
