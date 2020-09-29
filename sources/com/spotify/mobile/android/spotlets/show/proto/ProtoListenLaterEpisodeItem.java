package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoListenLaterEpisodeItem extends Message<ProtoListenLaterEpisodeItem, Builder> {
    public static final ProtoAdapter<ProtoListenLaterEpisodeItem> ADAPTER = new a();
    public static final String DEFAULT_HEADER = "";
    private static final long serialVersionUID = 0;
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_played_state;
    public final String header;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoListenLaterEpisodeItem, Builder> {
        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_played_state;
        public String header;

        public final ProtoListenLaterEpisodeItem build() {
            ProtoListenLaterEpisodeItem protoListenLaterEpisodeItem = new ProtoListenLaterEpisodeItem(this.header, this.episode_metadata, this.episode_collection_state, this.episode_offline_state, this.episode_played_state, super.buildUnknownFields());
            return protoListenLaterEpisodeItem;
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

        public final Builder episode_played_state(ProtoEpisodePlayState protoEpisodePlayState) {
            this.episode_played_state = protoEpisodePlayState;
            return this;
        }

        public final Builder header(String str) {
            this.header = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoListenLaterEpisodeItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoListenLaterEpisodeItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoListenLaterEpisodeItem protoListenLaterEpisodeItem = (ProtoListenLaterEpisodeItem) obj;
            int i = 0;
            int a = (protoListenLaterEpisodeItem.header != null ? ProtoAdapter.i.a(1, protoListenLaterEpisodeItem.header) : 0) + (protoListenLaterEpisodeItem.episode_metadata != null ? ProtoEpisodeMetadata.ADAPTER.a(2, protoListenLaterEpisodeItem.episode_metadata) : 0) + (protoListenLaterEpisodeItem.episode_collection_state != null ? ProtoEpisodeCollectionState.ADAPTER.a(3, protoListenLaterEpisodeItem.episode_collection_state) : 0) + (protoListenLaterEpisodeItem.episode_offline_state != null ? ProtoEpisodeOfflineState.ADAPTER.a(4, protoListenLaterEpisodeItem.episode_offline_state) : 0);
            if (protoListenLaterEpisodeItem.episode_played_state != null) {
                i = ProtoEpisodePlayState.ADAPTER.a(5, protoListenLaterEpisodeItem.episode_played_state);
            }
            return a + i + protoListenLaterEpisodeItem.a().h();
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
                    builder.episode_played_state((ProtoEpisodePlayState) ProtoEpisodePlayState.ADAPTER.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoListenLaterEpisodeItem protoListenLaterEpisodeItem = (ProtoListenLaterEpisodeItem) obj;
            if (protoListenLaterEpisodeItem.header != null) {
                ProtoAdapter.i.a(whh, 1, protoListenLaterEpisodeItem.header);
            }
            if (protoListenLaterEpisodeItem.episode_metadata != null) {
                ProtoEpisodeMetadata.ADAPTER.a(whh, 2, protoListenLaterEpisodeItem.episode_metadata);
            }
            if (protoListenLaterEpisodeItem.episode_collection_state != null) {
                ProtoEpisodeCollectionState.ADAPTER.a(whh, 3, protoListenLaterEpisodeItem.episode_collection_state);
            }
            if (protoListenLaterEpisodeItem.episode_offline_state != null) {
                ProtoEpisodeOfflineState.ADAPTER.a(whh, 4, protoListenLaterEpisodeItem.episode_offline_state);
            }
            if (protoListenLaterEpisodeItem.episode_played_state != null) {
                ProtoEpisodePlayState.ADAPTER.a(whh, 5, protoListenLaterEpisodeItem.episode_played_state);
            }
            whh.a(protoListenLaterEpisodeItem.a());
        }
    }

    public ProtoListenLaterEpisodeItem(String str, ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeCollectionState protoEpisodeCollectionState, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodePlayState protoEpisodePlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = str;
        this.episode_metadata = protoEpisodeMetadata;
        this.episode_collection_state = protoEpisodeCollectionState;
        this.episode_offline_state = protoEpisodeOfflineState;
        this.episode_played_state = protoEpisodePlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoListenLaterEpisodeItem)) {
            return false;
        }
        ProtoListenLaterEpisodeItem protoListenLaterEpisodeItem = (ProtoListenLaterEpisodeItem) obj;
        return a().equals(protoListenLaterEpisodeItem.a()) && whk.a((Object) this.header, (Object) protoListenLaterEpisodeItem.header) && whk.a((Object) this.episode_metadata, (Object) protoListenLaterEpisodeItem.episode_metadata) && whk.a((Object) this.episode_collection_state, (Object) protoListenLaterEpisodeItem.episode_collection_state) && whk.a((Object) this.episode_offline_state, (Object) protoListenLaterEpisodeItem.episode_offline_state) && whk.a((Object) this.episode_played_state, (Object) protoListenLaterEpisodeItem.episode_played_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
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
            ProtoEpisodePlayState protoEpisodePlayState = this.episode_played_state;
            if (protoEpisodePlayState != null) {
                i2 = protoEpisodePlayState.hashCode();
            }
            i = hashCode5 + i2;
            this.hashCode = i;
        }
        return i;
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
            String str = "iostceapicdesloesl=_tnot _e";
            sb.append(", episode_collection_state=");
            sb.append(this.episode_collection_state);
        }
        if (this.episode_offline_state != null) {
            String str2 = "ot_mp nef,ioeai_ss=tefel";
            sb.append(", episode_offline_state=");
            sb.append(this.episode_offline_state);
        }
        if (this.episode_played_state != null) {
            sb.append(", episode_played_state=");
            sb.append(this.episode_played_state);
        }
        String str3 = "todEornpLtLrPiaoetIemieeosst";
        StringBuilder replace = sb.replace(0, 2, "ProtoListenLaterEpisodeItem{");
        replace.append('}');
        return replace.toString();
    }
}
