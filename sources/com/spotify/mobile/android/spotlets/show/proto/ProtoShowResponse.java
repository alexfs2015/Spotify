package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoShowResponse extends Message<ProtoShowResponse, Builder> {
    public static final ProtoAdapter<ProtoShowResponse> ADAPTER = new a();
    public static final Integer DEFAULT_LENGTH;
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final AuxiliarySections auxiliary_sections;
    public final ProtoShowRequestHeader header;
    public final List<ProtoShowRequestItem> item;
    public final Integer length;
    public final Boolean loading_contents;
    public final ProtoOnlineData online_data;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowResponse, Builder> {
        public AuxiliarySections auxiliary_sections;
        public ProtoShowRequestHeader header;
        public List<ProtoShowRequestItem> item = vte.a();
        public Integer length;
        public Boolean loading_contents;
        public ProtoOnlineData online_data;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final Builder item(List<ProtoShowRequestItem> list) {
            vte.a(list);
            this.item = list;
            return this;
        }

        public final Builder header(ProtoShowRequestHeader protoShowRequestHeader) {
            this.header = protoShowRequestHeader;
            return this;
        }

        public final Builder online_data(ProtoOnlineData protoOnlineData) {
            this.online_data = protoOnlineData;
            return this;
        }

        public final Builder unfiltered_length(Integer num) {
            this.unfiltered_length = num;
            return this;
        }

        public final Builder length(Integer num) {
            this.length = num;
            return this;
        }

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final Builder unranged_length(Integer num) {
            this.unranged_length = num;
            return this;
        }

        public final Builder auxiliary_sections(AuxiliarySections auxiliarySections) {
            this.auxiliary_sections = auxiliarySections;
            return this;
        }

        public final ProtoShowResponse build() {
            ProtoShowResponse protoShowResponse = new ProtoShowResponse(this.item, this.header, this.online_data, this.unfiltered_length, this.length, this.loading_contents, this.unranged_length, this.auxiliary_sections, super.buildUnknownFields());
            return protoShowResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoShowResponse protoShowResponse = (ProtoShowResponse) obj;
            int i = 0;
            int a = ProtoShowRequestItem.ADAPTER.a().a(1, protoShowResponse.item) + (protoShowResponse.header != null ? ProtoShowRequestHeader.ADAPTER.a(2, protoShowResponse.header) : 0) + (protoShowResponse.online_data != null ? ProtoOnlineData.ADAPTER.a(3, protoShowResponse.online_data) : 0) + (protoShowResponse.unfiltered_length != null ? ProtoAdapter.c.a(4, protoShowResponse.unfiltered_length) : 0) + (protoShowResponse.length != null ? ProtoAdapter.c.a(5, protoShowResponse.length) : 0) + (protoShowResponse.loading_contents != null ? ProtoAdapter.a.a(6, protoShowResponse.loading_contents) : 0) + (protoShowResponse.unranged_length != null ? ProtoAdapter.c.a(7, protoShowResponse.unranged_length) : 0);
            if (protoShowResponse.auxiliary_sections != null) {
                i = AuxiliarySections.ADAPTER.a(8, protoShowResponse.auxiliary_sections);
            }
            return a + i + protoShowResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoShowResponse protoShowResponse = (ProtoShowResponse) obj;
            ProtoShowRequestItem.ADAPTER.a().a(vtb, 1, protoShowResponse.item);
            if (protoShowResponse.header != null) {
                ProtoShowRequestHeader.ADAPTER.a(vtb, 2, protoShowResponse.header);
            }
            if (protoShowResponse.online_data != null) {
                ProtoOnlineData.ADAPTER.a(vtb, 3, protoShowResponse.online_data);
            }
            if (protoShowResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(vtb, 4, protoShowResponse.unfiltered_length);
            }
            if (protoShowResponse.length != null) {
                ProtoAdapter.c.a(vtb, 5, protoShowResponse.length);
            }
            if (protoShowResponse.loading_contents != null) {
                ProtoAdapter.a.a(vtb, 6, protoShowResponse.loading_contents);
            }
            if (protoShowResponse.unranged_length != null) {
                ProtoAdapter.c.a(vtb, 7, protoShowResponse.unranged_length);
            }
            if (protoShowResponse.auxiliary_sections != null) {
                AuxiliarySections.ADAPTER.a(vtb, 8, protoShowResponse.auxiliary_sections);
            }
            vtb.a(protoShowResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowResponse.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.item.add(ProtoShowRequestItem.ADAPTER.a(vta));
                            break;
                        case 2:
                            builder.header((ProtoShowRequestHeader) ProtoShowRequestHeader.ADAPTER.a(vta));
                            break;
                        case 3:
                            builder.online_data((ProtoOnlineData) ProtoOnlineData.ADAPTER.a(vta));
                            break;
                        case 4:
                            builder.unfiltered_length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 5:
                            builder.length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 6:
                            builder.loading_contents((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 7:
                            builder.unranged_length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 8:
                            builder.auxiliary_sections((AuxiliarySections) AuxiliarySections.ADAPTER.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    vta.a(a);
                    return builder.build();
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoShowResponse(List<ProtoShowRequestItem> list, ProtoShowRequestHeader protoShowRequestHeader, ProtoOnlineData protoOnlineData, Integer num, Integer num2, Boolean bool, Integer num3, AuxiliarySections auxiliarySections, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = vte.a("item", list);
        this.header = protoShowRequestHeader;
        this.online_data = protoOnlineData;
        this.unfiltered_length = num;
        this.length = num2;
        this.loading_contents = bool;
        this.unranged_length = num3;
        this.auxiliary_sections = auxiliarySections;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowResponse)) {
            return false;
        }
        ProtoShowResponse protoShowResponse = (ProtoShowResponse) obj;
        return a().equals(protoShowResponse.a()) && this.item.equals(protoShowResponse.item) && vte.a((Object) this.header, (Object) protoShowResponse.header) && vte.a((Object) this.online_data, (Object) protoShowResponse.online_data) && vte.a((Object) this.unfiltered_length, (Object) protoShowResponse.unfiltered_length) && vte.a((Object) this.length, (Object) protoShowResponse.length) && vte.a((Object) this.loading_contents, (Object) protoShowResponse.loading_contents) && vte.a((Object) this.unranged_length, (Object) protoShowResponse.unranged_length) && vte.a((Object) this.auxiliary_sections, (Object) protoShowResponse.auxiliary_sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
        ProtoShowRequestHeader protoShowRequestHeader = this.header;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoShowRequestHeader != null ? protoShowRequestHeader.hashCode() : 0)) * 37;
        ProtoOnlineData protoOnlineData = this.online_data;
        int hashCode3 = (hashCode2 + (protoOnlineData != null ? protoOnlineData.hashCode() : 0)) * 37;
        Integer num = this.unfiltered_length;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.length;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool = this.loading_contents;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Integer num3 = this.unranged_length;
        int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 37;
        AuxiliarySections auxiliarySections = this.auxiliary_sections;
        if (auxiliarySections != null) {
            i2 = auxiliarySections.hashCode();
        }
        int i3 = hashCode7 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.online_data != null) {
            sb.append(", online_data=");
            sb.append(this.online_data);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        if (this.loading_contents != null) {
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.auxiliary_sections != null) {
            sb.append(", auxiliary_sections=");
            sb.append(this.auxiliary_sections);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowResponse{");
        replace.append('}');
        return replace.toString();
    }
}
