package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoDecorateResponse extends Message<ProtoDecorateResponse, Builder> {
    public static final ProtoAdapter<ProtoDecorateResponse> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<ProtoDecorateEpisodeItem> episode;
    public final List<ProtoDecorateShowItem> show;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateResponse, Builder> {
        public List<ProtoDecorateEpisodeItem> episode = whk.a();
        public List<ProtoDecorateShowItem> show = whk.a();

        public final ProtoDecorateResponse build() {
            return new ProtoDecorateResponse(this.show, this.episode, super.buildUnknownFields());
        }

        public final Builder episode(List<ProtoDecorateEpisodeItem> list) {
            whk.a(list);
            this.episode = list;
            return this;
        }

        public final Builder show(List<ProtoDecorateShowItem> list) {
            whk.a(list);
            this.show = list;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            return ProtoDecorateShowItem.ADAPTER.a().a(1, protoDecorateResponse.show) + ProtoDecorateEpisodeItem.ADAPTER.a().a(2, protoDecorateResponse.episode) + protoDecorateResponse.a().h();
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
                    builder.show.add(ProtoDecorateShowItem.ADAPTER.a(whg));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.episode.add(ProtoDecorateEpisodeItem.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
            ProtoDecorateShowItem.ADAPTER.a().a(whh, 1, protoDecorateResponse.show);
            ProtoDecorateEpisodeItem.ADAPTER.a().a(whh, 2, protoDecorateResponse.episode);
            whh.a(protoDecorateResponse.a());
        }
    }

    public ProtoDecorateResponse(List<ProtoDecorateShowItem> list, List<ProtoDecorateEpisodeItem> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = whk.a("show", list);
        this.episode = whk.a("episode", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateResponse)) {
            return false;
        }
        ProtoDecorateResponse protoDecorateResponse = (ProtoDecorateResponse) obj;
        return a().equals(protoDecorateResponse.a()) && this.show.equals(protoDecorateResponse.show) && this.episode.equals(protoDecorateResponse.episode);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((a().hashCode() * 37) + this.show.hashCode()) * 37) + this.episode.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.show.isEmpty()) {
            String str = "shso,=w";
            sb.append(", show=");
            sb.append(this.show);
        }
        if (!this.episode.isEmpty()) {
            String str2 = "=spmedoe i";
            sb.append(", episode=");
            sb.append(this.episode);
        }
        String str3 = "tReooce{eorsooprsnteDa";
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateResponse{");
        replace.append('}');
        return replace.toString();
    }
}
