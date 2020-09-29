package com.spotify.mobile.android.playlist.proto;

import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackCollectionState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackMetadata;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackOfflineState;
import com.spotify.mobile.android.spotlets.collection.proto.ProtoTrackPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.ProtoEpisodePlayState;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoPlaylistItem extends Message<ProtoPlaylistItem, Builder> {
    public static final ProtoAdapter<ProtoPlaylistItem> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final String DEFAULT_HEADER_FIELD = "";
    public static final String DEFAULT_ROW_ID = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final ProtoUser added_by;
    public final ProtoEpisodeCollectionState episode_collection_state;
    public final ProtoEpisodeMetadata episode_metadata;
    public final ProtoEpisodeOfflineState episode_offline_state;
    public final ProtoEpisodePlayState episode_play_state;
    public final List<ProtoPlaylistFormatListAttribute> format_list_attributes;
    public final String header_field;
    public final String row_id;
    public final ProtoTrackCollectionState track_collection_state;
    public final ProtoTrackMetadata track_metadata;
    public final ProtoTrackOfflineState track_offline_state;
    public final ProtoTrackPlayState track_play_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistItem, Builder> {
        public Integer add_time;
        public ProtoUser added_by;
        public ProtoEpisodeCollectionState episode_collection_state;
        public ProtoEpisodeMetadata episode_metadata;
        public ProtoEpisodeOfflineState episode_offline_state;
        public ProtoEpisodePlayState episode_play_state;
        public List<ProtoPlaylistFormatListAttribute> format_list_attributes = vte.a();
        public String header_field;
        public String row_id;
        public ProtoTrackCollectionState track_collection_state;
        public ProtoTrackMetadata track_metadata;
        public ProtoTrackOfflineState track_offline_state;
        public ProtoTrackPlayState track_play_state;

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final Builder added_by(ProtoUser protoUser) {
            this.added_by = protoUser;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata protoTrackMetadata) {
            this.track_metadata = protoTrackMetadata;
            return this;
        }

        public final Builder track_collection_state(ProtoTrackCollectionState protoTrackCollectionState) {
            this.track_collection_state = protoTrackCollectionState;
            return this;
        }

        public final Builder track_offline_state(ProtoTrackOfflineState protoTrackOfflineState) {
            this.track_offline_state = protoTrackOfflineState;
            return this;
        }

        public final Builder row_id(String str) {
            this.row_id = str;
            return this;
        }

        public final Builder track_play_state(ProtoTrackPlayState protoTrackPlayState) {
            this.track_play_state = protoTrackPlayState;
            return this;
        }

        public final Builder format_list_attributes(List<ProtoPlaylistFormatListAttribute> list) {
            vte.a(list);
            this.format_list_attributes = list;
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

        public final Builder episode_collection_state(ProtoEpisodeCollectionState protoEpisodeCollectionState) {
            this.episode_collection_state = protoEpisodeCollectionState;
            return this;
        }

        public final Builder episode_play_state(ProtoEpisodePlayState protoEpisodePlayState) {
            this.episode_play_state = protoEpisodePlayState;
            return this;
        }

        public final ProtoPlaylistItem build() {
            ProtoPlaylistItem protoPlaylistItem = new ProtoPlaylistItem(this.header_field, this.add_time, this.added_by, this.track_metadata, this.track_collection_state, this.track_offline_state, this.row_id, this.track_play_state, this.format_list_attributes, this.episode_metadata, this.episode_offline_state, this.episode_collection_state, this.episode_play_state, super.buildUnknownFields());
            return protoPlaylistItem;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistItem> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistItem protoPlaylistItem = (ProtoPlaylistItem) obj;
            int i = 0;
            int a = (protoPlaylistItem.header_field != null ? ProtoAdapter.i.a(1, protoPlaylistItem.header_field) : 0) + (protoPlaylistItem.add_time != null ? ProtoAdapter.c.a(2, protoPlaylistItem.add_time) : 0) + (protoPlaylistItem.added_by != null ? ProtoUser.ADAPTER.a(3, protoPlaylistItem.added_by) : 0) + (protoPlaylistItem.track_metadata != null ? ProtoTrackMetadata.ADAPTER.a(4, protoPlaylistItem.track_metadata) : 0) + (protoPlaylistItem.track_collection_state != null ? ProtoTrackCollectionState.ADAPTER.a(5, protoPlaylistItem.track_collection_state) : 0) + (protoPlaylistItem.track_offline_state != null ? ProtoTrackOfflineState.ADAPTER.a(6, protoPlaylistItem.track_offline_state) : 0) + (protoPlaylistItem.row_id != null ? ProtoAdapter.i.a(7, protoPlaylistItem.row_id) : 0) + (protoPlaylistItem.track_play_state != null ? ProtoTrackPlayState.ADAPTER.a(8, protoPlaylistItem.track_play_state) : 0) + ProtoPlaylistFormatListAttribute.ADAPTER.a().a(9, protoPlaylistItem.format_list_attributes) + (protoPlaylistItem.episode_metadata != null ? ProtoEpisodeMetadata.ADAPTER.a(10, protoPlaylistItem.episode_metadata) : 0) + (protoPlaylistItem.episode_offline_state != null ? ProtoEpisodeOfflineState.ADAPTER.a(11, protoPlaylistItem.episode_offline_state) : 0) + (protoPlaylistItem.episode_collection_state != null ? ProtoEpisodeCollectionState.ADAPTER.a(12, protoPlaylistItem.episode_collection_state) : 0);
            if (protoPlaylistItem.episode_play_state != null) {
                i = ProtoEpisodePlayState.ADAPTER.a(13, protoPlaylistItem.episode_play_state);
            }
            return a + i + protoPlaylistItem.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistItem protoPlaylistItem = (ProtoPlaylistItem) obj;
            if (protoPlaylistItem.header_field != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistItem.header_field);
            }
            if (protoPlaylistItem.add_time != null) {
                ProtoAdapter.c.a(vtb, 2, protoPlaylistItem.add_time);
            }
            if (protoPlaylistItem.added_by != null) {
                ProtoUser.ADAPTER.a(vtb, 3, protoPlaylistItem.added_by);
            }
            if (protoPlaylistItem.track_metadata != null) {
                ProtoTrackMetadata.ADAPTER.a(vtb, 4, protoPlaylistItem.track_metadata);
            }
            if (protoPlaylistItem.track_collection_state != null) {
                ProtoTrackCollectionState.ADAPTER.a(vtb, 5, protoPlaylistItem.track_collection_state);
            }
            if (protoPlaylistItem.track_offline_state != null) {
                ProtoTrackOfflineState.ADAPTER.a(vtb, 6, protoPlaylistItem.track_offline_state);
            }
            if (protoPlaylistItem.row_id != null) {
                ProtoAdapter.i.a(vtb, 7, protoPlaylistItem.row_id);
            }
            if (protoPlaylistItem.track_play_state != null) {
                ProtoTrackPlayState.ADAPTER.a(vtb, 8, protoPlaylistItem.track_play_state);
            }
            ProtoPlaylistFormatListAttribute.ADAPTER.a().a(vtb, 9, protoPlaylistItem.format_list_attributes);
            if (protoPlaylistItem.episode_metadata != null) {
                ProtoEpisodeMetadata.ADAPTER.a(vtb, 10, protoPlaylistItem.episode_metadata);
            }
            if (protoPlaylistItem.episode_offline_state != null) {
                ProtoEpisodeOfflineState.ADAPTER.a(vtb, 11, protoPlaylistItem.episode_offline_state);
            }
            if (protoPlaylistItem.episode_collection_state != null) {
                ProtoEpisodeCollectionState.ADAPTER.a(vtb, 12, protoPlaylistItem.episode_collection_state);
            }
            if (protoPlaylistItem.episode_play_state != null) {
                ProtoEpisodePlayState.ADAPTER.a(vtb, 13, protoPlaylistItem.episode_play_state);
            }
            vtb.a(protoPlaylistItem.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistItem.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.header_field((String) ProtoAdapter.i.a(vta));
                            break;
                        case 2:
                            builder.add_time((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 3:
                            builder.added_by((ProtoUser) ProtoUser.ADAPTER.a(vta));
                            break;
                        case 4:
                            builder.track_metadata((ProtoTrackMetadata) ProtoTrackMetadata.ADAPTER.a(vta));
                            break;
                        case 5:
                            builder.track_collection_state((ProtoTrackCollectionState) ProtoTrackCollectionState.ADAPTER.a(vta));
                            break;
                        case 6:
                            builder.track_offline_state((ProtoTrackOfflineState) ProtoTrackOfflineState.ADAPTER.a(vta));
                            break;
                        case 7:
                            builder.row_id((String) ProtoAdapter.i.a(vta));
                            break;
                        case 8:
                            builder.track_play_state((ProtoTrackPlayState) ProtoTrackPlayState.ADAPTER.a(vta));
                            break;
                        case 9:
                            builder.format_list_attributes.add(ProtoPlaylistFormatListAttribute.ADAPTER.a(vta));
                            break;
                        case 10:
                            builder.episode_metadata((ProtoEpisodeMetadata) ProtoEpisodeMetadata.ADAPTER.a(vta));
                            break;
                        case 11:
                            builder.episode_offline_state((ProtoEpisodeOfflineState) ProtoEpisodeOfflineState.ADAPTER.a(vta));
                            break;
                        case 12:
                            builder.episode_collection_state((ProtoEpisodeCollectionState) ProtoEpisodeCollectionState.ADAPTER.a(vta));
                            break;
                        case 13:
                            builder.episode_play_state((ProtoEpisodePlayState) ProtoEpisodePlayState.ADAPTER.a(vta));
                            break;
                        default:
                            FieldEncoding fieldEncoding = vta.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                            break;
                    }
                } else {
                    vta.a(a);
                    return builder.build();
                }
            }
        }
    }

    public ProtoPlaylistItem(String str, Integer num, ProtoUser protoUser, ProtoTrackMetadata protoTrackMetadata, ProtoTrackCollectionState protoTrackCollectionState, ProtoTrackOfflineState protoTrackOfflineState, String str2, ProtoTrackPlayState protoTrackPlayState, List<ProtoPlaylistFormatListAttribute> list, ProtoEpisodeMetadata protoEpisodeMetadata, ProtoEpisodeOfflineState protoEpisodeOfflineState, ProtoEpisodeCollectionState protoEpisodeCollectionState, ProtoEpisodePlayState protoEpisodePlayState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.add_time = num;
        this.added_by = protoUser;
        this.track_metadata = protoTrackMetadata;
        this.track_collection_state = protoTrackCollectionState;
        this.track_offline_state = protoTrackOfflineState;
        this.row_id = str2;
        this.track_play_state = protoTrackPlayState;
        this.format_list_attributes = vte.a("format_list_attributes", list);
        this.episode_metadata = protoEpisodeMetadata;
        this.episode_offline_state = protoEpisodeOfflineState;
        this.episode_collection_state = protoEpisodeCollectionState;
        this.episode_play_state = protoEpisodePlayState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistItem)) {
            return false;
        }
        ProtoPlaylistItem protoPlaylistItem = (ProtoPlaylistItem) obj;
        return a().equals(protoPlaylistItem.a()) && vte.a((Object) this.header_field, (Object) protoPlaylistItem.header_field) && vte.a((Object) this.add_time, (Object) protoPlaylistItem.add_time) && vte.a((Object) this.added_by, (Object) protoPlaylistItem.added_by) && vte.a((Object) this.track_metadata, (Object) protoPlaylistItem.track_metadata) && vte.a((Object) this.track_collection_state, (Object) protoPlaylistItem.track_collection_state) && vte.a((Object) this.track_offline_state, (Object) protoPlaylistItem.track_offline_state) && vte.a((Object) this.row_id, (Object) protoPlaylistItem.row_id) && vte.a((Object) this.track_play_state, (Object) protoPlaylistItem.track_play_state) && this.format_list_attributes.equals(protoPlaylistItem.format_list_attributes) && vte.a((Object) this.episode_metadata, (Object) protoPlaylistItem.episode_metadata) && vte.a((Object) this.episode_offline_state, (Object) protoPlaylistItem.episode_offline_state) && vte.a((Object) this.episode_collection_state, (Object) protoPlaylistItem.episode_collection_state) && vte.a((Object) this.episode_play_state, (Object) protoPlaylistItem.episode_play_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.header_field;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.add_time;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        ProtoUser protoUser = this.added_by;
        int hashCode4 = (hashCode3 + (protoUser != null ? protoUser.hashCode() : 0)) * 37;
        ProtoTrackMetadata protoTrackMetadata = this.track_metadata;
        int hashCode5 = (hashCode4 + (protoTrackMetadata != null ? protoTrackMetadata.hashCode() : 0)) * 37;
        ProtoTrackCollectionState protoTrackCollectionState = this.track_collection_state;
        int hashCode6 = (hashCode5 + (protoTrackCollectionState != null ? protoTrackCollectionState.hashCode() : 0)) * 37;
        ProtoTrackOfflineState protoTrackOfflineState = this.track_offline_state;
        int hashCode7 = (hashCode6 + (protoTrackOfflineState != null ? protoTrackOfflineState.hashCode() : 0)) * 37;
        String str2 = this.row_id;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ProtoTrackPlayState protoTrackPlayState = this.track_play_state;
        int hashCode9 = (((hashCode8 + (protoTrackPlayState != null ? protoTrackPlayState.hashCode() : 0)) * 37) + this.format_list_attributes.hashCode()) * 37;
        ProtoEpisodeMetadata protoEpisodeMetadata = this.episode_metadata;
        int hashCode10 = (hashCode9 + (protoEpisodeMetadata != null ? protoEpisodeMetadata.hashCode() : 0)) * 37;
        ProtoEpisodeOfflineState protoEpisodeOfflineState = this.episode_offline_state;
        int hashCode11 = (hashCode10 + (protoEpisodeOfflineState != null ? protoEpisodeOfflineState.hashCode() : 0)) * 37;
        ProtoEpisodeCollectionState protoEpisodeCollectionState = this.episode_collection_state;
        int hashCode12 = (hashCode11 + (protoEpisodeCollectionState != null ? protoEpisodeCollectionState.hashCode() : 0)) * 37;
        ProtoEpisodePlayState protoEpisodePlayState = this.episode_play_state;
        if (protoEpisodePlayState != null) {
            i2 = protoEpisodePlayState.hashCode();
        }
        int i3 = hashCode12 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.add_time != null) {
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        if (this.added_by != null) {
            sb.append(", added_by=");
            sb.append(this.added_by);
        }
        if (this.track_metadata != null) {
            sb.append(", track_metadata=");
            sb.append(this.track_metadata);
        }
        if (this.track_collection_state != null) {
            sb.append(", track_collection_state=");
            sb.append(this.track_collection_state);
        }
        if (this.track_offline_state != null) {
            sb.append(", track_offline_state=");
            sb.append(this.track_offline_state);
        }
        if (this.row_id != null) {
            sb.append(", row_id=");
            sb.append(this.row_id);
        }
        if (this.track_play_state != null) {
            sb.append(", track_play_state=");
            sb.append(this.track_play_state);
        }
        if (!this.format_list_attributes.isEmpty()) {
            sb.append(", format_list_attributes=");
            sb.append(this.format_list_attributes);
        }
        if (this.episode_metadata != null) {
            sb.append(", episode_metadata=");
            sb.append(this.episode_metadata);
        }
        if (this.episode_offline_state != null) {
            sb.append(", episode_offline_state=");
            sb.append(this.episode_offline_state);
        }
        if (this.episode_collection_state != null) {
            sb.append(", episode_collection_state=");
            sb.append(this.episode_collection_state);
        }
        if (this.episode_play_state != null) {
            sb.append(", episode_play_state=");
            sb.append(this.episode_play_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistItem{");
        replace.append('}');
        return replace.toString();
    }
}
