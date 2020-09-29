package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoShowPlayState extends Message<ProtoShowPlayState, Builder> {
    public static final ProtoAdapter<ProtoShowPlayState> ADAPTER = new a();
    public static final String DEFAULT_LATEST_PLAYED_EPISODE_LINK = "";
    private static final long serialVersionUID = 0;
    public final String latest_played_episode_link;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowPlayState, Builder> {
        public String latest_played_episode_link;

        public final Builder latest_played_episode_link(String str) {
            this.latest_played_episode_link = str;
            return this;
        }

        public final ProtoShowPlayState build() {
            return new ProtoShowPlayState(this.latest_played_episode_link, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoShowPlayState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoShowPlayState protoShowPlayState = (ProtoShowPlayState) obj;
            return (protoShowPlayState.latest_played_episode_link != null ? ProtoAdapter.i.a(1, protoShowPlayState.latest_played_episode_link) : 0) + protoShowPlayState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoShowPlayState protoShowPlayState = (ProtoShowPlayState) obj;
            if (protoShowPlayState.latest_played_episode_link != null) {
                ProtoAdapter.i.a(vtb, 1, protoShowPlayState.latest_played_episode_link);
            }
            vtb.a(protoShowPlayState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowPlayState.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b == -1) {
                    vta.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.latest_played_episode_link((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public ProtoShowPlayState(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.latest_played_episode_link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowPlayState)) {
            return false;
        }
        ProtoShowPlayState protoShowPlayState = (ProtoShowPlayState) obj;
        return a().equals(protoShowPlayState.a()) && vte.a((Object) this.latest_played_episode_link, (Object) protoShowPlayState.latest_played_episode_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.latest_played_episode_link;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.latest_played_episode_link != null) {
            sb.append(", latest_played_episode_link=");
            sb.append(this.latest_played_episode_link);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowPlayState{");
        replace.append('}');
        return replace.toString();
    }
}
