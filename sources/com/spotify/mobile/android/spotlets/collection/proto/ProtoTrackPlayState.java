package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoTrackPlayState extends Message<ProtoTrackPlayState, Builder> {
    public static final ProtoAdapter<ProtoTrackPlayState> ADAPTER = new a();
    public static final Boolean DEFAULT_IS_PLAYABLE = Boolean.FALSE;
    private static final long serialVersionUID = 0;
    public final Boolean is_playable;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoTrackPlayState, Builder> {
        public Boolean is_playable;

        public final Builder is_playable(Boolean bool) {
            this.is_playable = bool;
            return this;
        }

        public final ProtoTrackPlayState build() {
            return new ProtoTrackPlayState(this.is_playable, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackPlayState> {
        public final /* synthetic */ int a(Object obj) {
            ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj;
            return (protoTrackPlayState.is_playable != null ? ProtoAdapter.a.a(1, protoTrackPlayState.is_playable) : 0) + protoTrackPlayState.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj;
            if (protoTrackPlayState.is_playable != null) {
                ProtoAdapter.a.a(vtb, 1, protoTrackPlayState.is_playable);
            }
            vtb.a(protoTrackPlayState.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackPlayState.class);
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
                    builder.is_playable((Boolean) ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    public ProtoTrackPlayState(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_playable = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoTrackPlayState)) {
            return false;
        }
        ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj;
        return a().equals(protoTrackPlayState.a()) && vte.a((Object) this.is_playable, (Object) protoTrackPlayState.is_playable);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        Boolean bool = this.is_playable;
        int hashCode2 = hashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_playable != null) {
            sb.append(", is_playable=");
            sb.append(this.is_playable);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackPlayState{");
        replace.append('}');
        return replace.toString();
    }
}
