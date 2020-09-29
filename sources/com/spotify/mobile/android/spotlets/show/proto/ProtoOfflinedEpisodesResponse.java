package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoOfflinedEpisodesResponse extends Message<ProtoOfflinedEpisodesResponse, Builder> {
    public static final ProtoAdapter<ProtoOfflinedEpisodesResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoOfflinedEpisodesRequestItem> item;
    public final Boolean loading_contents;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoOfflinedEpisodesResponse, Builder> {
        public List<ProtoOfflinedEpisodesRequestItem> item = whk.a();
        public Boolean loading_contents;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoOfflinedEpisodesResponse build() {
            ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = new ProtoOfflinedEpisodesResponse(this.item, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoOfflinedEpisodesResponse;
        }

        public final Builder item(List<ProtoOfflinedEpisodesRequestItem> list) {
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

    static final class a extends ProtoAdapter<ProtoOfflinedEpisodesResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoOfflinedEpisodesResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = (ProtoOfflinedEpisodesResponse) obj;
            int i = 0;
            int a = ProtoOfflinedEpisodesRequestItem.ADAPTER.a().a(1, protoOfflinedEpisodesResponse.item) + (protoOfflinedEpisodesResponse.unfiltered_length != null ? ProtoAdapter.c.a(2, protoOfflinedEpisodesResponse.unfiltered_length) : 0) + (protoOfflinedEpisodesResponse.unranged_length != null ? ProtoAdapter.c.a(3, protoOfflinedEpisodesResponse.unranged_length) : 0);
            if (protoOfflinedEpisodesResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(4, protoOfflinedEpisodesResponse.loading_contents);
            }
            return a + i + protoOfflinedEpisodesResponse.a().h();
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
                    builder.item.add(ProtoOfflinedEpisodesRequestItem.ADAPTER.a(whg));
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
            ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = (ProtoOfflinedEpisodesResponse) obj;
            ProtoOfflinedEpisodesRequestItem.ADAPTER.a().a(whh, 1, protoOfflinedEpisodesResponse.item);
            if (protoOfflinedEpisodesResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(whh, 2, protoOfflinedEpisodesResponse.unfiltered_length);
            }
            if (protoOfflinedEpisodesResponse.unranged_length != null) {
                ProtoAdapter.c.a(whh, 3, protoOfflinedEpisodesResponse.unranged_length);
            }
            if (protoOfflinedEpisodesResponse.loading_contents != null) {
                ProtoAdapter.a.a(whh, 4, protoOfflinedEpisodesResponse.loading_contents);
            }
            whh.a(protoOfflinedEpisodesResponse.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoOfflinedEpisodesResponse(List<ProtoOfflinedEpisodesRequestItem> list, Integer num, Integer num2, Boolean bool, ByteString byteString) {
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
        if (!(obj instanceof ProtoOfflinedEpisodesResponse)) {
            return false;
        }
        ProtoOfflinedEpisodesResponse protoOfflinedEpisodesResponse = (ProtoOfflinedEpisodesResponse) obj;
        return a().equals(protoOfflinedEpisodesResponse.a()) && this.item.equals(protoOfflinedEpisodesResponse.item) && whk.a((Object) this.unfiltered_length, (Object) protoOfflinedEpisodesResponse.unfiltered_length) && whk.a((Object) this.unranged_length, (Object) protoOfflinedEpisodesResponse.unranged_length) && whk.a((Object) this.loading_contents, (Object) protoOfflinedEpisodesResponse.loading_contents);
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
            String str = ",esitm ";
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.unfiltered_length != null) {
            String str2 = "fe=mnt_etelnrld ugi,";
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            String str3 = "gdhno netlngr=,u_a";
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            String str4 = "iog tbea_ot=ncdlnns";
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoOfflinedEpisodesResponse{");
        replace.append('}');
        return replace.toString();
    }
}
