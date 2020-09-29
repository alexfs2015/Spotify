package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoPlaylistRootItem extends Message<ProtoPlaylistRootItem, Builder> {
    public static final ProtoAdapter<ProtoPlaylistRootItem> ADAPTER = new a();
    public static final String DEFAULT_HEADER_FIELD = "";
    private static final long serialVersionUID = 0;
    public final ProtoPlaylistRootFolder folder;
    public final String header_field;
    public final ProtoPlaylistRootPlaylist playlist;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistRootItem, Builder> {
        public ProtoPlaylistRootFolder folder;
        public String header_field;
        public ProtoPlaylistRootPlaylist playlist;

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder folder(ProtoPlaylistRootFolder protoPlaylistRootFolder) {
            this.folder = protoPlaylistRootFolder;
            return this;
        }

        public final Builder playlist(ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist) {
            this.playlist = protoPlaylistRootPlaylist;
            return this;
        }

        public final ProtoPlaylistRootItem build() {
            return new ProtoPlaylistRootItem(this.header_field, this.folder, this.playlist, super.buildUnknownFields());
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistRootItem> {
        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistRootItem protoPlaylistRootItem = (ProtoPlaylistRootItem) obj;
            int i = 0;
            int a = (protoPlaylistRootItem.header_field != null ? ProtoAdapter.i.a(1, protoPlaylistRootItem.header_field) : 0) + (protoPlaylistRootItem.folder != null ? ProtoPlaylistRootFolder.ADAPTER.a(2, protoPlaylistRootItem.folder) : 0);
            if (protoPlaylistRootItem.playlist != null) {
                i = ProtoPlaylistRootPlaylist.ADAPTER.a(3, protoPlaylistRootItem.playlist);
            }
            return a + i + protoPlaylistRootItem.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoPlaylistRootItem protoPlaylistRootItem = (ProtoPlaylistRootItem) obj;
            if (protoPlaylistRootItem.header_field != null) {
                ProtoAdapter.i.a(vtb, 1, protoPlaylistRootItem.header_field);
            }
            if (protoPlaylistRootItem.folder != null) {
                ProtoPlaylistRootFolder.ADAPTER.a(vtb, 2, protoPlaylistRootItem.folder);
            }
            if (protoPlaylistRootItem.playlist != null) {
                ProtoPlaylistRootPlaylist.ADAPTER.a(vtb, 3, protoPlaylistRootItem.playlist);
            }
            vtb.a(protoPlaylistRootItem.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistRootItem.class);
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
                    builder.header_field((String) ProtoAdapter.i.a(vta));
                } else if (b == 2) {
                    builder.folder((ProtoPlaylistRootFolder) ProtoPlaylistRootFolder.ADAPTER.a(vta));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = vta.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(vta));
                } else {
                    builder.playlist((ProtoPlaylistRootPlaylist) ProtoPlaylistRootPlaylist.ADAPTER.a(vta));
                }
            }
        }
    }

    public ProtoPlaylistRootItem(String str, ProtoPlaylistRootFolder protoPlaylistRootFolder, ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.folder = protoPlaylistRootFolder;
        this.playlist = protoPlaylistRootPlaylist;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistRootItem)) {
            return false;
        }
        ProtoPlaylistRootItem protoPlaylistRootItem = (ProtoPlaylistRootItem) obj;
        return a().equals(protoPlaylistRootItem.a()) && vte.a((Object) this.header_field, (Object) protoPlaylistRootItem.header_field) && vte.a((Object) this.folder, (Object) protoPlaylistRootItem.folder) && vte.a((Object) this.playlist, (Object) protoPlaylistRootItem.playlist);
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
        ProtoPlaylistRootFolder protoPlaylistRootFolder = this.folder;
        int hashCode3 = (hashCode2 + (protoPlaylistRootFolder != null ? protoPlaylistRootFolder.hashCode() : 0)) * 37;
        ProtoPlaylistRootPlaylist protoPlaylistRootPlaylist = this.playlist;
        if (protoPlaylistRootPlaylist != null) {
            i2 = protoPlaylistRootPlaylist.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.folder != null) {
            sb.append(", folder=");
            sb.append(this.folder);
        }
        if (this.playlist != null) {
            sb.append(", playlist=");
            sb.append(this.playlist);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistRootItem{");
        replace.append('}');
        return replace.toString();
    }
}
