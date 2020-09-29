package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class Response extends Message<Response, Builder> {
    public static final ProtoAdapter<Response> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final List<Episode> episode;
    public final List<Show> show;

    public static final class Builder extends com.squareup.wire.Message.a<Response, Builder> {
        public List<Episode> episode = vte.a();
        public List<Show> show = vte.a();

        public final Builder show(List<Show> list) {
            vte.a(list);
            this.show = list;
            return this;
        }

        public final Builder episode(List<Episode> list) {
            vte.a(list);
            this.episode = list;
            return this;
        }

        public final Response build() {
            return new Response(this.show, this.episode, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<Response> {
        public final /* synthetic */ int a(Object obj) {
            Response response = (Response) obj;
            return Show.ADAPTER.a().a(1, response.show) + Episode.ADAPTER.a().a(2, response.episode) + response.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            Response response = (Response) obj;
            Show.ADAPTER.a().a(vtb, 1, response.show);
            Episode.ADAPTER.a().a(vtb, 2, response.episode);
            vtb.a(response.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, Response.class);
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
                    builder.show.add(Show.ADAPTER.a(vta));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.episode.add(Episode.ADAPTER.a(vta));
                }
            }
        }
    }

    public Response(List<Show> list, List<Episode> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show = vte.a("show", list);
        this.episode = vte.a("episode", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        return a().equals(response.a()) && this.show.equals(response.show) && this.episode.equals(response.episode);
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
            sb.append(", show=");
            sb.append(this.show);
        }
        if (!this.episode.isEmpty()) {
            sb.append(", episode=");
            sb.append(this.episode);
        }
        StringBuilder replace = sb.replace(0, 2, "Response{");
        replace.append('}');
        return replace.toString();
    }
}
