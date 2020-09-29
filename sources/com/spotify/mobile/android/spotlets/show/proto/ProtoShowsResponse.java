package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoShowsResponse extends Message<ProtoShowsResponse, Builder> {
    public static final ProtoAdapter<ProtoShowsResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_NUM_OFFLINED_EPISODES;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoShowsRequestItem> item;
    public final Boolean loading_contents;
    public final Integer num_offlined_episodes;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowsResponse, Builder> {
        public List<ProtoShowsRequestItem> item = vte.a();
        public Boolean loading_contents;
        public Integer num_offlined_episodes;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final Builder item(List<ProtoShowsRequestItem> list) {
            vte.a(list);
            this.item = list;
            return this;
        }

        public final Builder num_offlined_episodes(Integer num) {
            this.num_offlined_episodes = num;
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

        public final ProtoShowsResponse build() {
            ProtoShowsResponse protoShowsResponse = new ProtoShowsResponse(this.item, this.num_offlined_episodes, this.unfiltered_length, this.unranged_length, this.loading_contents, super.buildUnknownFields());
            return protoShowsResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowsResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoShowsResponse protoShowsResponse = (ProtoShowsResponse) obj;
            int i = 0;
            int a = ProtoShowsRequestItem.ADAPTER.a().a(1, protoShowsResponse.item) + (protoShowsResponse.num_offlined_episodes != null ? ProtoAdapter.c.a(2, protoShowsResponse.num_offlined_episodes) : 0) + (protoShowsResponse.unfiltered_length != null ? ProtoAdapter.c.a(3, protoShowsResponse.unfiltered_length) : 0) + (protoShowsResponse.unranged_length != null ? ProtoAdapter.c.a(4, protoShowsResponse.unranged_length) : 0);
            if (protoShowsResponse.loading_contents != null) {
                i = ProtoAdapter.a.a(5, protoShowsResponse.loading_contents);
            }
            return a + i + protoShowsResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoShowsResponse protoShowsResponse = (ProtoShowsResponse) obj;
            ProtoShowsRequestItem.ADAPTER.a().a(vtb, 1, protoShowsResponse.item);
            if (protoShowsResponse.num_offlined_episodes != null) {
                ProtoAdapter.c.a(vtb, 2, protoShowsResponse.num_offlined_episodes);
            }
            if (protoShowsResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(vtb, 3, protoShowsResponse.unfiltered_length);
            }
            if (protoShowsResponse.unranged_length != null) {
                ProtoAdapter.c.a(vtb, 4, protoShowsResponse.unranged_length);
            }
            if (protoShowsResponse.loading_contents != null) {
                ProtoAdapter.a.a(vtb, 5, protoShowsResponse.loading_contents);
            }
            vtb.a(protoShowsResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowsResponse.class);
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
                    builder.item.add(ProtoShowsRequestItem.ADAPTER.a(vta));
                } else if (b == 2) {
                    builder.num_offlined_episodes((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 3) {
                    builder.unfiltered_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 4) {
                    builder.unranged_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b != 5) {
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
        DEFAULT_NUM_OFFLINED_EPISODES = valueOf;
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoShowsResponse(List<ProtoShowsRequestItem> list, Integer num, Integer num2, Integer num3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = vte.a("item", list);
        this.num_offlined_episodes = num;
        this.unfiltered_length = num2;
        this.unranged_length = num3;
        this.loading_contents = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowsResponse)) {
            return false;
        }
        ProtoShowsResponse protoShowsResponse = (ProtoShowsResponse) obj;
        return a().equals(protoShowsResponse.a()) && this.item.equals(protoShowsResponse.item) && vte.a((Object) this.num_offlined_episodes, (Object) protoShowsResponse.num_offlined_episodes) && vte.a((Object) this.unfiltered_length, (Object) protoShowsResponse.unfiltered_length) && vte.a((Object) this.unranged_length, (Object) protoShowsResponse.unranged_length) && vte.a((Object) this.loading_contents, (Object) protoShowsResponse.loading_contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
        Integer num = this.num_offlined_episodes;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.unfiltered_length;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.unranged_length;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool = this.loading_contents;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.num_offlined_episodes != null) {
            sb.append(", num_offlined_episodes=");
            sb.append(this.num_offlined_episodes);
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
        StringBuilder replace = sb.replace(0, 2, "ProtoShowsResponse{");
        replace.append('}');
        return replace.toString();
    }
}
