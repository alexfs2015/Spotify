package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoCollectionAlbumsResponse extends Message<ProtoCollectionAlbumsResponse, Builder> {
    public static final ProtoAdapter<ProtoCollectionAlbumsResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoCollectionAlbumsItem> item;
    public final Boolean loading_contents;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionAlbumsResponse, Builder> {
        public List<ProtoCollectionAlbumsItem> item = whk.a();
        public Boolean loading_contents;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoCollectionAlbumsResponse build() {
            ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = new ProtoCollectionAlbumsResponse(this.item, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoCollectionAlbumsResponse;
        }

        public final Builder item(List<ProtoCollectionAlbumsItem> list) {
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

    static final class a extends ProtoAdapter<ProtoCollectionAlbumsResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionAlbumsResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = (ProtoCollectionAlbumsResponse) obj;
            int i = 0;
            int a = ProtoCollectionAlbumsItem.ADAPTER.a().a(1, protoCollectionAlbumsResponse.item) + (protoCollectionAlbumsResponse.unfiltered_length != null ? ProtoAdapter.c.a(2, protoCollectionAlbumsResponse.unfiltered_length) : 0) + (protoCollectionAlbumsResponse.unranged_length != null ? ProtoAdapter.c.a(3, protoCollectionAlbumsResponse.unranged_length) : 0);
            if (protoCollectionAlbumsResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(4, protoCollectionAlbumsResponse.loading_contents);
            }
            return a + i + protoCollectionAlbumsResponse.a().h();
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
                    builder.item.add(ProtoCollectionAlbumsItem.ADAPTER.a(whg));
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
            ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = (ProtoCollectionAlbumsResponse) obj;
            ProtoCollectionAlbumsItem.ADAPTER.a().a(whh, 1, protoCollectionAlbumsResponse.item);
            if (protoCollectionAlbumsResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(whh, 2, protoCollectionAlbumsResponse.unfiltered_length);
            }
            if (protoCollectionAlbumsResponse.unranged_length != null) {
                ProtoAdapter.c.a(whh, 3, protoCollectionAlbumsResponse.unranged_length);
            }
            if (protoCollectionAlbumsResponse.loading_contents != null) {
                ProtoAdapter.a.a(whh, 4, protoCollectionAlbumsResponse.loading_contents);
            }
            whh.a(protoCollectionAlbumsResponse.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoCollectionAlbumsResponse(List<ProtoCollectionAlbumsItem> list, Integer num, Integer num2, Boolean bool, ByteString byteString) {
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
        if (!(obj instanceof ProtoCollectionAlbumsResponse)) {
            return false;
        }
        ProtoCollectionAlbumsResponse protoCollectionAlbumsResponse = (ProtoCollectionAlbumsResponse) obj;
        return a().equals(protoCollectionAlbumsResponse.a()) && this.item.equals(protoCollectionAlbumsResponse.item) && whk.a((Object) this.unfiltered_length, (Object) protoCollectionAlbumsResponse.unfiltered_length) && whk.a((Object) this.unranged_length, (Object) protoCollectionAlbumsResponse.unranged_length) && whk.a((Object) this.loading_contents, (Object) protoCollectionAlbumsResponse.loading_contents);
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
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.unfiltered_length != null) {
            String str = "_ snu=tetrllfeedihng";
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            String str2 = "rnum,adene=tngl gh";
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            String str3 = "l=dootneagiontn _,c";
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        String str4 = "sslt{benemocPAlobnlipouCoReors";
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionAlbumsResponse{");
        replace.append('}');
        return replace.toString();
    }
}
