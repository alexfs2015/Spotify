package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoShowRequestItem extends Message<ProtoShowRequestItem, Builder> {
    public static final ProtoAdapter<ProtoShowRequestItem> ADAPTER = new a();
    public static final String DEFAULT_HEADER = "";
    private static final long serialVersionUID = 0;
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;
    public final String header;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowRequestItem, Builder> {
        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_play_state;
        public String header;

        public final Builder header(String str) {
            this.header = str;
            return this;
        }

        public final Builder episode_metadata(ProtoEpisodeMetadata protoEpisodeMetadata) {
            this.episode_metadata = protoEpisodeMetadata;
            return this;
        }

        public final Builder episode_collection_state(ProtoEpisodeCollectionState protoEpisodeCollectionState) {
            this.episode_collection_state = protoEpisodeCollectionState;
            return this;
        }

        public final Builder episode_offline_state(ProtoEpisodeOfflineState protoEpisodeOfflineState) {
            this.episode_offline_state = protoEpisodeOfflineState;
            return this;
        }

        public final Builder episode_play_state(ProtoEpisodePlayState protoEpisodePlayState) {
            this.episode_play_state = protoEpisodePlayState;
            return this;
        }

        public final ProtoShowRequestItem build() {
            ProtoShowRequestItem protoShowRequestItem = new ProtoShowRequestItem(this.header, this.episode_metadata, this.episode_collection_state, this.episode_offline_state, this.episode_play_state, super.buildUnknownFields());
            return protoShowRequestItem;
        }
    }

    static final class a extends ProtoAdapter<ProtoShowRequestItem> {
        public final /* synthetic */ int a(Object obj) {
            ProtoShowRequestItem protoShowRequestItem = (ProtoShowRequestItem) obj;
            int i = 0;
            int a = (protoShowRequestItem.header != null ? ProtoAdapter.i.a(1, protoShowRequestItem.header) : 0) + (protoShowRequestItem.episode_metadata != null ? ProtoEpisodeMetadata.ADAPTER.a(2, protoShowRequestItem.episode_metadata) : 0) + (protoShowRequestItem.episode_collection_state != null ? ProtoEpisodeCollectionState.ADAPTER.a(3, protoShowRequestItem.episode_collection_state) : 0) + (protoShowRequestItem.episode_offline_state != null ? ProtoEpisodeOfflineState.ADAPTER.a(4, protoShowRequestItem.episode_offline_state) : 0);
            if (protoShowRequestItem.episode_play_state != null) {
                i = ProtoEpisodePlayState.ADAPTER.a(5, protoShowRequestItem.episode_play_state);
            }
            return a + i + protoShowRequestItem.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoShowRequestItem protoShowRequestItem = (ProtoShowRequestItem) obj;
            if (protoShowRequestItem.header != null) {
                ProtoAdapter.i.a(vtb, 1, protoShowRequestItem.header);
            }
            if (protoShowRequestItem.episode_metadata != null) {
                ProtoEpisodeMetadata.ADAPTER.a(vtb, 2, protoShowRequestItem.episode_metadata);
            }
            if (protoShowRequestItem.episode_collection_state != null) {
                ProtoEpisodeCollectionState.ADAPTER.a(vtb, 3, protoShowRequestItem.episode_collection_state);
            }
            if (protoShowRequestItem.episode_offline_state != null) {
                ProtoEpisodeOfflineState.ADAPTER.a(vtb, 4, protoShowRequestItem.episode_offline_state);
            }
            if (protoShowRequestItem.episode_play_state != null) {
                ProtoEpisodePlayState.ADAPTER.a(vtb, 5, protoShowRequestItem.episode_play_state);
            }
            vtb.a(protoShowRequestItem.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowRequestItem.class);
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
                    builder.header((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.episode_metadata((ProtoEpisodeMetadata) ProtoEpisodeMetadata.ADAPTER.a(vta));
                } else if (b == 3) {
                    builder.episode_collection_state((ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.ADAPTER.a(vta));
                } else if (b == 4) {
                    builder.episode_offline_state((ProtoEpisodeOfflineState) ProtoEpisodeOfflineState.ADAPTER.a(vta));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.episode_play_state((ProtoEpisodePlayState) ProtoEpisodePlayState.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoShowRequestItem(String str, ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeCollectionState protoEpisodeCollectionState, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodePlayState protoEpisodePlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = str;
        this.episode_metadata = protoEpisodeMetadata;
        this.episode_collection_state = protoEpisodeCollectionState;
        this.episode_offline_state = protoEpisodeOfflineState;
        this.episode_play_state = protoEpisodePlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowRequestItem)) {
            return false;
        }
        ProtoShowRequestItem protoShowRequestItem = (ProtoShowRequestItem) obj;
        return a().equals(protoShowRequestItem.a()) && vte.a((Object) this.header, (Object) protoShowRequestItem.header) && vte.a((Object) this.episode_metadata, (Object) protoShowRequestItem.episode_metadata) && vte.a((Object) this.episode_collection_state, (Object) protoShowRequestItem.episode_collection_state) && vte.a((Object) this.episode_offline_state, (Object) protoShowRequestItem.episode_offline_state) && vte.a((Object) this.episode_play_state, (Object) protoShowRequestItem.episode_play_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.header;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ProtoEpisodeMetadata protoEpisodeMetadata = this.episode_metadata;
        int hashCode3 = (hashCode2 + (protoEpisodeMetadata != null ? protoEpisodeMetadata.hashCode() : 0)) * 37;
        ProtoEpisodeCollectionState protoEpisodeCollectionState = this.episode_collection_state;
        int hashCode4 = (hashCode3 + (protoEpisodeCollectionState != null ? protoEpisodeCollectionState.hashCode() : 0)) * 37;
        ProtoEpisodeOfflineState protoEpisodeOfflineState = this.episode_offline_state;
        int hashCode5 = (hashCode4 + (protoEpisodeOfflineState != null ? protoEpisodeOfflineState.hashCode() : 0)) * 37;
        ProtoEpisodePlayState protoEpisodePlayState = this.episode_play_state;
        if (protoEpisodePlayState != null) {
            i2 = protoEpisodePlayState.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.episode_metadata != null) {
            sb.append(", episode_metadata=");
            sb.append(this.episode_metadata);
        }
        if (this.episode_collection_state != null) {
            sb.append(", episode_collection_state=");
            sb.append(this.episode_collection_state);
        }
        if (this.episode_offline_state != null) {
            sb.append(", episode_offline_state=");
            sb.append(this.episode_offline_state);
        }
        if (this.episode_play_state != null) {
            sb.append(", episode_play_state=");
            sb.append(this.episode_play_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowRequestItem{");
        replace.append('}');
        return replace.toString();
    }
}
