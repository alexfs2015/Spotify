package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistRootPlaylist extends Message<ProtoPlaylistRootPlaylist, Builder> {
    public static final ProtoAdapter<ProtoPlaylistRootPlaylist> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final Boolean DEFAULT_IS_ON_DEMAND_IN_FREE = Boolean.FALSE;
    public static final String DEFAULT_ROW_ID = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final Boolean is_on_demand_in_free;
    public final ProtoPlaylistMetadata playlist_metadata;
    public final ProtoPlaylistOfflineState playlist_offline_state;
    public final String row_id;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistRootPlaylist, Builder> {
        public Integer add_time;
        public Boolean is_on_demand_in_free;
        public ProtoPlaylistMetadata playlist_metadata;
        public ProtoPlaylistOfflineState playlist_offline_state;
        public String row_id;

        public final Builder row_id(String str) {
            this.row_id = str;
            return this;
        }

        public final Builder playlist_metadata(ProtoPlaylistMetadata protoPlaylistMetadata) {
            this.playlist_metadata = protoPlaylistMetadata;
            return this;
        }

        public final Builder playlist_offline_state(ProtoPlaylistOfflineState protoPlaylistOfflineState) {
            this.playlist_offline_state = protoPlaylistOfflineState;
            return this;
        }

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final Builder is_on_demand_in_free(Boolean bool) {
            this.is_on_demand_in_free = bool;
            return this;
        }

        public final ProtoPlaylistRootPlaylist build() {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = new ProtoPlaylistRootPlaylist(this.row_id, this.playlist_metadata, this.playlist_offline_state, this.add_time, this.is_on_demand_in_free, super.buildUnknownFields());
            return protoPlaylistRootPlaylist;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistRootPlaylist> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = (ProtoPlaylistRootPlaylist) obj;
            int i = 0;
            int a = (protoPlaylistRootPlaylist.row_id != null ? ProtoAdapter.i.a(1, protoPlaylistRootPlaylist.row_id) : 0) + (protoPlaylistRootPlaylist.playlist_metadata != null ? ProtoPlaylistMetadata.ADAPTER.a(2, protoPlaylistRootPlaylist.playlist_metadata) : 0) + (protoPlaylistRootPlaylist.playlist_offline_state != null ? ProtoPlaylistOfflineState.ADAPTER.a(3, protoPlaylistRootPlaylist.playlist_offline_state) : 0) + (protoPlaylistRootPlaylist.add_time != null ? ProtoAdapter.c.a(4, protoPlaylistRootPlaylist.add_time) : 0);
            if (protoPlaylistRootPlaylist.is_on_demand_in_free != null) {
                i = ProtoAdapter.a.a(5, protoPlaylistRootPlaylist.is_on_demand_in_free);
            }
            return a + i + protoPlaylistRootPlaylist.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = (ProtoPlaylistRootPlaylist) obj;
            if (protoPlaylistRootPlaylist.row_id != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistRootPlaylist.row_id);
            }
            if (protoPlaylistRootPlaylist.playlist_metadata != null) {
                ProtoPlaylistMetadata.ADAPTER.a(vtb, 2, protoPlaylistRootPlaylist.playlist_metadata);
            }
            if (protoPlaylistRootPlaylist.playlist_offline_state != null) {
                ProtoPlaylistOfflineState.ADAPTER.a(vtb, 3, protoPlaylistRootPlaylist.playlist_offline_state);
            }
            if (protoPlaylistRootPlaylist.add_time != null) {
                ProtoAdapter.c.a(vtb, 4, protoPlaylistRootPlaylist.add_time);
            }
            if (protoPlaylistRootPlaylist.is_on_demand_in_free != null) {
                ProtoAdapter.a.a(vtb, 5, protoPlaylistRootPlaylist.is_on_demand_in_free);
            }
            vtb.a(protoPlaylistRootPlaylist.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistRootPlaylist.class);
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
                    builder.row_id((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.playlist_metadata((ProtoPlaylistMetadata) ProtoPlaylistMetadata.ADAPTER.a(vta));
                } else if (b == 3) {
                    builder.playlist_offline_state((ProtoPlaylistOfflineState) ProtoPlaylistOfflineState.ADAPTER.a(vta));
                } else if (b == 4) {
                    builder.add_time((Integer) ProtoAdapter.c.a(vta));
                } else if (b != 5) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.is_on_demand_in_free((Boolean) ProtoAdapter.a.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistRootPlaylist(String str, ProtoPlaylistMetadata protoPlaylistMetadata, ProtoPlaylistOfflineState protoPlaylistOfflineState, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.row_id = str;
        this.playlist_metadata = protoPlaylistMetadata;
        this.playlist_offline_state = protoPlaylistOfflineState;
        this.add_time = num;
        this.is_on_demand_in_free = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistRootPlaylist)) {
            return false;
        }
        ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = (ProtoPlaylistRootPlaylist) obj;
        return a().equals(protoPlaylistRootPlaylist.a()) && vte.a((Object) this.row_id, (Object) protoPlaylistRootPlaylist.row_id) && vte.a((Object) this.playlist_metadata, (Object) protoPlaylistRootPlaylist.playlist_metadata) && vte.a((Object) this.playlist_offline_state, (Object) protoPlaylistRootPlaylist.playlist_offline_state) && vte.a((Object) this.add_time, (Object) protoPlaylistRootPlaylist.add_time) && vte.a((Object) this.is_on_demand_in_free, (Object) protoPlaylistRootPlaylist.is_on_demand_in_free);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.row_id;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ProtoPlaylistMetadata protoPlaylistMetadata = this.playlist_metadata;
        int hashCode3 = (hashCode2 + (protoPlaylistMetadata != null ? protoPlaylistMetadata.hashCode() : 0)) * 37;
        ProtoPlaylistOfflineState protoPlaylistOfflineState = this.playlist_offline_state;
        int hashCode4 = (hashCode3 + (protoPlaylistOfflineState != null ? protoPlaylistOfflineState.hashCode() : 0)) * 37;
        Integer num = this.add_time;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.is_on_demand_in_free;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode5 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.row_id != null) {
            sb.append(", row_id=");
            sb.append(this.row_id);
        }
        if (this.playlist_metadata != null) {
            sb.append(", playlist_metadata=");
            sb.append(this.playlist_metadata);
        }
        if (this.playlist_offline_state != null) {
            sb.append(", playlist_offline_state=");
            sb.append(this.playlist_offline_state);
        }
        if (this.add_time != null) {
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        if (this.is_on_demand_in_free != null) {
            sb.append(", is_on_demand_in_free=");
            sb.append(this.is_on_demand_in_free);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistRootPlaylist{");
        replace.append('}');
        return replace.toString();
    }
}
