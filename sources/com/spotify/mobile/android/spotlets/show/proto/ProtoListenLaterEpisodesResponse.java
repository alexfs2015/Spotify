package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoListenLaterEpisodesResponse extends Message<ProtoListenLaterEpisodesResponse, Builder> {
    public static final ProtoAdapter<ProtoListenLaterEpisodesResponse> ADAPTER = new a();
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoListenLaterEpisodeItem> episode;
    public final List<ProtoListenLaterShowItem> show;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoListenLaterEpisodesResponse, Builder> {
        public List<ProtoListenLaterEpisodeItem> episode = vte.a();
        public List<ProtoListenLaterShowItem> show = vte.a();
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final Builder unfiltered_length(Integer num) {
            this.unfiltered_length = num;
            return this;
        }

        public final Builder unranged_length(Integer num) {
            this.unranged_length = num;
            return this;
        }

        public final Builder episode(List<ProtoListenLaterEpisodeItem> list) {
            vte.a(list);
            this.episode = list;
            return this;
        }

        public final Builder show(List<ProtoListenLaterShowItem> list) {
            vte.a(list);
            this.show = list;
            return this;
        }

        public final ProtoListenLaterEpisodesResponse build() {
            ProtoListenLaterEpisodesResponse protoListenLaterEpisodesResponse = new ProtoListenLaterEpisodesResponse(this.unfiltered_length, this.unranged_length, this.episode, this.show, super.buildUnknownFields());
            return protoListenLaterEpisodesResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoListenLaterEpisodesResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoListenLaterEpisodesResponse protoListenLaterEpisodesResponse = (ProtoListenLaterEpisodesResponse) obj;
            int i = 0;
            int a = protoListenLaterEpisodesResponse.unfiltered_length != null ? ProtoAdapter.c.a(1, protoListenLaterEpisodesResponse.unfiltered_length) : 0;
            if (protoListenLaterEpisodesResponse.unranged_length != null) {
                i = ProtoAdapter.c.a(2, protoListenLaterEpisodesResponse.unranged_length);
            }
            return a + i + ProtoListenLaterEpisodeItem.ADAPTER.a().a(3, protoListenLaterEpisodesResponse.episode) + ProtoListenLaterShowItem.ADAPTER.a().a(4, protoListenLaterEpisodesResponse.show) + protoListenLaterEpisodesResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoListenLaterEpisodesResponse protoListenLaterEpisodesResponse = (ProtoListenLaterEpisodesResponse) obj;
            if (protoListenLaterEpisodesResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(vtb, 1, protoListenLaterEpisodesResponse.unfiltered_length);
            }
            if (protoListenLaterEpisodesResponse.unranged_length != null) {
                ProtoAdapter.c.a(vtb, 2, protoListenLaterEpisodesResponse.unranged_length);
            }
            ProtoListenLaterEpisodeItem.ADAPTER.a().a(vtb, 3, protoListenLaterEpisodesResponse.episode);
            ProtoListenLaterShowItem.ADAPTER.a().a(vtb, 4, protoListenLaterEpisodesResponse.show);
            vtb.a(protoListenLaterEpisodesResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoListenLaterEpisodesResponse.class);
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
                    builder.unfiltered_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 2) {
                    builder.unranged_length((Integer) ProtoAdapter.c.a(vta));
                } else if (b == 3) {
                    builder.episode.add(ProtoListenLaterEpisodeItem.ADAPTER.a(vta));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.show.add(ProtoListenLaterShowItem.ADAPTER.a(vta));
                }
            }
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
    }

    public ProtoListenLaterEpisodesResponse(Integer num, Integer num2, List<ProtoListenLaterEpisodeItem> list, List<ProtoListenLaterShowItem> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unfiltered_length = num;
        this.unranged_length = num2;
        this.episode = vte.a("episode", list);
        this.show = vte.a("show", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoListenLaterEpisodesResponse)) {
            return false;
        }
        ProtoListenLaterEpisodesResponse protoListenLaterEpisodesResponse = (ProtoListenLaterEpisodesResponse) obj;
        return a().equals(protoListenLaterEpisodesResponse.a()) && vte.a((Object) this.unfiltered_length, (Object) protoListenLaterEpisodesResponse.unfiltered_length) && vte.a((Object) this.unranged_length, (Object) protoListenLaterEpisodesResponse.unranged_length) && this.episode.equals(protoListenLaterEpisodesResponse.episode) && this.show.equals(protoListenLaterEpisodesResponse.show);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Integer num = this.unfiltered_length;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.unranged_length;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        int hashCode3 = ((((hashCode2 + i2) * 37) + this.episode.hashCode()) * 37) + this.show.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (!this.episode.isEmpty()) {
            sb.append(", episode=");
            sb.append(this.episode);
        }
        if (!this.show.isEmpty()) {
            sb.append(", show=");
            sb.append(this.show);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoListenLaterEpisodesResponse{");
        replace.append('}');
        return replace.toString();
    }
}
