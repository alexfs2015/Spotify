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

        public final ProtoTrackPlayState build() {
            return new ProtoTrackPlayState(this.is_playable, super.buildUnknownFields());
        }

        public final Builder is_playable(Boolean bool) {
            this.is_playable = bool;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoTrackPlayState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoTrackPlayState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj;
            return (protoTrackPlayState.is_playable != null ? ProtoAdapter.a.a(1, protoTrackPlayState.is_playable) : 0) + protoTrackPlayState.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b == -1) {
                    whg.a(a);
                    return builder.build();
                } else if (b != 1) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.is_playable((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoTrackPlayState protoTrackPlayState = (ProtoTrackPlayState) obj;
            if (protoTrackPlayState.is_playable != null) {
                ProtoAdapter.a.a(whh, 1, protoTrackPlayState.is_playable);
            }
            whh.a(protoTrackPlayState.a());
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
        return a().equals(protoTrackPlayState.a()) && whk.a((Object) this.is_playable, (Object) protoTrackPlayState.is_playable);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            Boolean bool = this.is_playable;
            i = hashCode + (bool != null ? bool.hashCode() : 0);
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_playable != null) {
            sb.append(", is_playable=");
            sb.append(this.is_playable);
        }
        String str = "aPsytottcTSlrPe{rako";
        StringBuilder replace = sb.replace(0, 2, "ProtoTrackPlayState{");
        replace.append('}');
        return replace.toString();
    }
}
