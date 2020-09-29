package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoOfflinedEpisodesRequestItem extends Message<ProtoOfflinedEpisodesRequestItem, Builder> {
    public static final ProtoAdapter<ProtoOfflinedEpisodesRequestItem> ADAPTER = new a();
    public static final String DEFAULT_HEADER = "";
    private static final long serialVersionUID = 0;
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;
    public final String header;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoOfflinedEpisodesRequestItem, Builder> {
        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_play_state;
        public String header;

        public final ProtoOfflinedEpisodesRequestItem build() {
            ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = r0;
            ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem2 = new ProtoOfflinedEpisodesRequestItem(this.header, this.episode_metadata, this.episode_collection_state, this.episode_offline_state, this.episode_play_state, super.buildUnknownFields());
            return protoOfflinedEpisodesRequestItem2;
        }

        public final Builder episode_collection_state(ProtoEpisodeCollectionState protoEpisodeCollectionState) {
            this.episode_collection_state = protoEpisodeCollectionState;
            return this;
        }

        public final Builder episode_metadata(ProtoEpisodeMetadata protoEpisodeMetadata) {
            this.episode_metadata = protoEpisodeMetadata;
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

        public final Builder header(String str) {
            this.header = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoOfflinedEpisodesRequestItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoOfflinedEpisodesRequestItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = (ProtoOfflinedEpisodesRequestItem) obj;
            int i = 0;
            int a = (protoOfflinedEpisodesRequestItem.header != null ? ProtoAdapter.i.a(1, protoOfflinedEpisodesRequestItem.header) : 0) + (protoOfflinedEpisodesRequestItem.episode_metadata != null ? ProtoEpisodeMetadata.ADAPTER.a(2, protoOfflinedEpisodesRequestItem.episode_metadata) : 0) + (protoOfflinedEpisodesRequestItem.episode_collection_state != null ? ProtoEpisodeCollectionState.ADAPTER.a(3, protoOfflinedEpisodesRequestItem.episode_collection_state) : 0) + (protoOfflinedEpisodesRequestItem.episode_offline_state != null ? ProtoEpisodeOfflineState.ADAPTER.a(4, protoOfflinedEpisodesRequestItem.episode_offline_state) : 0);
            if (protoOfflinedEpisodesRequestItem.episode_play_state != null) {
                i = ProtoEpisodePlayState.ADAPTER.a(5, protoOfflinedEpisodesRequestItem.episode_play_state);
            }
            return a + i + protoOfflinedEpisodesRequestItem.a().h();
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
                    builder.header((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.episode_metadata((ProtoEpisodeMetadata) ProtoEpisodeMetadata.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.episode_collection_state((ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.ADAPTER.a(whg));
                } else if (b == 4) {
                    builder.episode_offline_state((ProtoEpisodeOfflineState) ProtoEpisodeOfflineState.ADAPTER.a(whg));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.episode_play_state((ProtoEpisodePlayState) ProtoEpisodePlayState.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = (ProtoOfflinedEpisodesRequestItem) obj;
            if (protoOfflinedEpisodesRequestItem.header != null) {
                ProtoAdapter.i.a(whh, 1, protoOfflinedEpisodesRequestItem.header);
            }
            if (protoOfflinedEpisodesRequestItem.episode_metadata != null) {
                ProtoEpisodeMetadata.ADAPTER.a(whh, 2, protoOfflinedEpisodesRequestItem.episode_metadata);
            }
            if (protoOfflinedEpisodesRequestItem.episode_collection_state != null) {
                ProtoEpisodeCollectionState.ADAPTER.a(whh, 3, protoOfflinedEpisodesRequestItem.episode_collection_state);
            }
            if (protoOfflinedEpisodesRequestItem.episode_offline_state != null) {
                ProtoEpisodeOfflineState.ADAPTER.a(whh, 4, protoOfflinedEpisodesRequestItem.episode_offline_state);
            }
            if (protoOfflinedEpisodesRequestItem.episode_play_state != null) {
                ProtoEpisodePlayState.ADAPTER.a(whh, 5, protoOfflinedEpisodesRequestItem.episode_play_state);
            }
            whh.a(protoOfflinedEpisodesRequestItem.a());
        }
    }

    public ProtoOfflinedEpisodesRequestItem(String str, ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeCollectionState protoEpisodeCollectionState, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodePlayState protoEpisodePlayState, ByteString byteString) {
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
        if (!(obj instanceof ProtoOfflinedEpisodesRequestItem)) {
            return false;
        }
        ProtoOfflinedEpisodesRequestItem protoOfflinedEpisodesRequestItem = (ProtoOfflinedEpisodesRequestItem) obj;
        return a().equals(protoOfflinedEpisodesRequestItem.a()) && whk.a((Object) this.header, (Object) protoOfflinedEpisodesRequestItem.header) && whk.a((Object) this.episode_metadata, (Object) protoOfflinedEpisodesRequestItem.episode_metadata) && whk.a((Object) this.episode_collection_state, (Object) protoOfflinedEpisodesRequestItem.episode_collection_state) && whk.a((Object) this.episode_offline_state, (Object) protoOfflinedEpisodesRequestItem.episode_offline_state) && whk.a((Object) this.episode_play_state, (Object) protoOfflinedEpisodesRequestItem.episode_play_state);
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
            String str = "sts_ede,celn socooaiett=pli";
            sb.append(", episode_collection_state=");
            sb.append(this.episode_collection_state);
        }
        if (this.episode_offline_state != null) {
            String str2 = "aefmold,epeei ns=tftio_s";
            sb.append(", episode_offline_state=");
            sb.append(this.episode_offline_state);
        }
        if (this.episode_play_state != null) {
            String str3 = "e,ptoea soi=tplsdye_a";
            sb.append(", episode_play_state=");
            sb.append(this.episode_play_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoOfflinedEpisodesRequestItem{");
        replace.append('}');
        return replace.toString();
    }
}
