package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistHeader extends Message<ProtoPlaylistHeader, Builder> {
    public static final ProtoAdapter<ProtoPlaylistHeader> ADAPTER = new a();
    private static final long serialVersionUID = 0;
    public final ProtoPlaylistMetadata playlist_metadata;
    public final ProtoPlaylistOfflineState playlist_offline_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistHeader, Builder> {
        public ProtoPlaylistMetadata playlist_metadata;
        public ProtoPlaylistOfflineState playlist_offline_state;

        public final Builder playlist_metadata(ProtoPlaylistMetadata protoPlaylistMetadata) {
            this.playlist_metadata = protoPlaylistMetadata;
            return this;
        }

        public final Builder playlist_offline_state(ProtoPlaylistOfflineState protoPlaylistOfflineState) {
            this.playlist_offline_state = protoPlaylistOfflineState;
            return this;
        }

        public final ProtoPlaylistHeader build() {
            return new ProtoPlaylistHeader(this.playlist_metadata, this.playlist_offline_state, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistHeader> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistHeader protoPlaylistHeader = (ProtoPlaylistHeader) obj;
            int i = 0;
            int a = protoPlaylistHeader.playlist_metadata != null ? ProtoPlaylistMetadata.ADAPTER.a(1, protoPlaylistHeader.playlist_metadata) : 0;
            if (protoPlaylistHeader.playlist_offline_state != null) {
                i = ProtoPlaylistOfflineState.ADAPTER.a(2, protoPlaylistHeader.playlist_offline_state);
            }
            return a + i + protoPlaylistHeader.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistHeader protoPlaylistHeader = (ProtoPlaylistHeader) obj;
            if (protoPlaylistHeader.playlist_metadata != null) {
                ProtoPlaylistMetadata.ADAPTER.a(vtb, 1, protoPlaylistHeader.playlist_metadata);
            }
            if (protoPlaylistHeader.playlist_offline_state != null) {
                ProtoPlaylistOfflineState.ADAPTER.a(vtb, 2, protoPlaylistHeader.playlist_offline_state);
            }
            vtb.a(protoPlaylistHeader.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistHeader.class);
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
                    builder.playlist_metadata((ProtoPlaylistMetadata) ProtoPlaylistMetadata.ADAPTER.a(vta));
                } else if (b != 2) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.playlist_offline_state((ProtoPlaylistOfflineState) ProtoPlaylistOfflineState.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistHeader(ProtoPlaylistMetadata protoPlaylistMetadata, ProtoPlaylistOfflineState protoPlaylistOfflineState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.playlist_metadata = protoPlaylistMetadata;
        this.playlist_offline_state = protoPlaylistOfflineState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistHeader)) {
            return false;
        }
        ProtoPlaylistHeader protoPlaylistHeader = (ProtoPlaylistHeader) obj;
        return a().equals(protoPlaylistHeader.a()) && vte.a((Object) this.playlist_metadata, (Object) protoPlaylistHeader.playlist_metadata) && vte.a((Object) this.playlist_offline_state, (Object) protoPlaylistHeader.playlist_offline_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoPlaylistMetadata protoPlaylistMetadata = this.playlist_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoPlaylistMetadata != null ? protoPlaylistMetadata.hashCode() : 0)) * 37;
        ProtoPlaylistOfflineState protoPlaylistOfflineState = this.playlist_offline_state;
        if (protoPlaylistOfflineState != null) {
            i2 = protoPlaylistOfflineState.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.playlist_metadata != null) {
            sb.append(", playlist_metadata=");
            sb.append(this.playlist_metadata);
        }
        if (this.playlist_offline_state != null) {
            sb.append(", playlist_offline_state=");
            sb.append(this.playlist_offline_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistHeader{");
        replace.append('}');
        return replace.toString();
    }
}
