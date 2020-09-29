package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class Episode extends Message<Episode, Builder> {
    public static final ProtoAdapter<Episode> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;
    public final String link;

    public static final class Builder extends com.squareup.wire.Message.a<Episode, Builder> {
        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_play_state;
        public String link;

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

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Episode build() {
            Episode episode = new Episode(this.episode_metadata, this.episode_collection_state, this.episode_offline_state, this.episode_play_state, this.link, super.buildUnknownFields());
            return episode;
        }
    }

    static final class a extends ProtoAdapter<Episode> {
        public final /* synthetic */ int a(Object obj) {
            Episode episode = (Episode) obj;
            int i = 0;
            int a = (episode.episode_metadata != null ? ProtoEpisodeMetadata.ADAPTER.a(1, episode.episode_metadata) : 0) + (episode.episode_collection_state != null ? ProtoEpisodeCollectionState.ADAPTER.a(2, episode.episode_collection_state) : 0) + (episode.episode_offline_state != null ? ProtoEpisodeOfflineState.ADAPTER.a(3, episode.episode_offline_state) : 0) + (episode.episode_play_state != null ? ProtoEpisodePlayState.ADAPTER.a(4, episode.episode_play_state) : 0);
            if (episode.link != null) {
                i = ProtoAdapter.i.a(5, episode.link);
            }
            return a + i + episode.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            Episode episode = (Episode) obj;
            if (episode.episode_metadata != null) {
                ProtoEpisodeMetadata.ADAPTER.a(vtb, 1, episode.episode_metadata);
            }
            if (episode.episode_collection_state != null) {
                ProtoEpisodeCollectionState.ADAPTER.a(vtb, 2, episode.episode_collection_state);
            }
            if (episode.episode_offline_state != null) {
                ProtoEpisodeOfflineState.ADAPTER.a(vtb, 3, episode.episode_offline_state);
            }
            if (episode.episode_play_state != null) {
                ProtoEpisodePlayState.ADAPTER.a(vtb, 4, episode.episode_play_state);
            }
            if (episode.link != null) {
                ProtoAdapter.i.a(vtb, 5, episode.link);
            }
            vtb.a(episode.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, Episode.class);
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
                    builder.episode_metadata((ProtoEpisodeMetadata) ProtoEpisodeMetadata.ADAPTER.a(vta));
                } else if (b == 2) {
                    builder.episode_collection_state((ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.ADAPTER.a(vta));
                } else if (b == 3) {
                    builder.episode_offline_state((ProtoEpisodeOfflineState) ProtoEpisodeOfflineState.ADAPTER.a(vta));
                } else if (b == 4) {
                    builder.episode_play_state((ProtoEpisodePlayState) ProtoEpisodePlayState.ADAPTER.a(vta));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.link((String) ProtoAdapter.i.a(vta));
                }
            }
        }
    }

    public Episode(ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeCollectionState protoEpisodeCollectionState, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodePlayState protoEpisodePlayState, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.episode_metadata = protoEpisodeMetadata;
        this.episode_collection_state = protoEpisodeCollectionState;
        this.episode_offline_state = protoEpisodeOfflineState;
        this.episode_play_state = protoEpisodePlayState;
        this.link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        return a().equals(episode.a()) && vte.a((Object) this.episode_metadata, (Object) episode.episode_metadata) && vte.a((Object) this.episode_collection_state, (Object) episode.episode_collection_state) && vte.a((Object) this.episode_offline_state, (Object) episode.episode_offline_state) && vte.a((Object) this.episode_play_state, (Object) episode.episode_play_state) && vte.a((Object) this.link, (Object) episode.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoEpisodeMetadata protoEpisodeMetadata = this.episode_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoEpisodeMetadata != null ? protoEpisodeMetadata.hashCode() : 0)) * 37;
        ProtoEpisodeCollectionState protoEpisodeCollectionState = this.episode_collection_state;
        int hashCode3 = (hashCode2 + (protoEpisodeCollectionState != null ? protoEpisodeCollectionState.hashCode() : 0)) * 37;
        ProtoEpisodeOfflineState protoEpisodeOfflineState = this.episode_offline_state;
        int hashCode4 = (hashCode3 + (protoEpisodeOfflineState != null ? protoEpisodeOfflineState.hashCode() : 0)) * 37;
        ProtoEpisodePlayState protoEpisodePlayState = this.episode_play_state;
        int hashCode5 = (hashCode4 + (protoEpisodePlayState != null ? protoEpisodePlayState.hashCode() : 0)) * 37;
        String str = this.link;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
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
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        StringBuilder replace = sb.replace(0, 2, "Episode{");
        replace.append('}');
        return replace.toString();
    }
}
