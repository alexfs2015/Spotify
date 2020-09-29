package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoPlaylistRootFolder extends Message<ProtoPlaylistRootFolder, Builder> {
    public static final ProtoAdapter<ProtoPlaylistRootFolder> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME = Integer.valueOf(0);
    public static final String DEFAULT_ROW_ID = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final ProtoFolderMetadata folder_metadata;
    public final List<ProtoPlaylistRootItem> item;
    public final String row_id;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistRootFolder, Builder> {
        public Integer add_time;
        public ProtoFolderMetadata folder_metadata;
        public List<ProtoPlaylistRootItem> item = whk.a();
        public String row_id;

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final ProtoPlaylistRootFolder build() {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = r0;
            ProtoPlaylistRootFolder protoPlaylistRootFolder2 = new ProtoPlaylistRootFolder(this.item, this.folder_metadata, this.row_id, this.add_time, super.buildUnknownFields());
            return protoPlaylistRootFolder2;
        }

        public final Builder folder_metadata(ProtoFolderMetadata protoFolderMetadata) {
            this.folder_metadata = protoFolderMetadata;
            return this;
        }

        public final Builder item(List<ProtoPlaylistRootItem> list) {
            whk.a(list);
            this.item = list;
            return this;
        }

        public final Builder row_id(String str) {
            this.row_id = str;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoPlaylistRootFolder> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistRootFolder.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = (ProtoPlaylistRootFolder) obj;
            int i = 0;
            int a = ProtoPlaylistRootItem.ADAPTER.a().a(1, protoPlaylistRootFolder.item) + (protoPlaylistRootFolder.folder_metadata != null ? ProtoFolderMetadata.ADAPTER.a(2, protoPlaylistRootFolder.folder_metadata) : 0) + (protoPlaylistRootFolder.row_id != null ? ProtoAdapter.i.a(3, protoPlaylistRootFolder.row_id) : 0);
            if (protoPlaylistRootFolder.add_time != null) {
                i = ProtoAdapter.c.a(4, protoPlaylistRootFolder.add_time);
            }
            return a + i + protoPlaylistRootFolder.a().h();
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
                    builder.item.add(ProtoPlaylistRootItem.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.folder_metadata((ProtoFolderMetadata) ProtoFolderMetadata.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.row_id((String) ProtoAdapter.i.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.add_time((Integer) ProtoAdapter.c.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoPlaylistRootFolder protoPlaylistRootFolder = (ProtoPlaylistRootFolder) obj;
            ProtoPlaylistRootItem.ADAPTER.a().a(whh, 1, protoPlaylistRootFolder.item);
            if (protoPlaylistRootFolder.folder_metadata != null) {
                boolean z = true ^ true;
                ProtoFolderMetadata.ADAPTER.a(whh, 2, protoPlaylistRootFolder.folder_metadata);
            }
            if (protoPlaylistRootFolder.row_id != null) {
                ProtoAdapter.i.a(whh, 3, protoPlaylistRootFolder.row_id);
            }
            if (protoPlaylistRootFolder.add_time != null) {
                ProtoAdapter.c.a(whh, 4, protoPlaylistRootFolder.add_time);
            }
            whh.a(protoPlaylistRootFolder.a());
        }
    }

    public ProtoPlaylistRootFolder(List<ProtoPlaylistRootItem> list, ProtoFolderMetadata protoFolderMetadata, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = whk.a("item", list);
        this.folder_metadata = protoFolderMetadata;
        this.row_id = str;
        this.add_time = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistRootFolder)) {
            return false;
        }
        ProtoPlaylistRootFolder protoPlaylistRootFolder = (ProtoPlaylistRootFolder) obj;
        return a().equals(protoPlaylistRootFolder.a()) && this.item.equals(protoPlaylistRootFolder.item) && whk.a((Object) this.folder_metadata, (Object) protoPlaylistRootFolder.folder_metadata) && whk.a((Object) this.row_id, (Object) protoPlaylistRootFolder.row_id) && whk.a((Object) this.add_time, (Object) protoPlaylistRootFolder.add_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
            ProtoFolderMetadata protoFolderMetadata = this.folder_metadata;
            int i2 = 0;
            int hashCode2 = (hashCode + (protoFolderMetadata != null ? protoFolderMetadata.hashCode() : 0)) * 37;
            String str = this.row_id;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.add_time;
            if (num != null) {
                i2 = num.hashCode();
            }
            i = hashCode3 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            String str = "ets, mi";
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.folder_metadata != null) {
            String str2 = "fedmratltd e_amao=";
            sb.append(", folder_metadata=");
            sb.append(this.folder_metadata);
        }
        if (this.row_id != null) {
            sb.append(", row_id=");
            sb.append(this.row_id);
        }
        if (this.add_time != null) {
            String str3 = "=td oemi,_a";
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        String str4 = "tParlboyroRioeltPsFdt{oo";
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistRootFolder{");
        replace.append('}');
        return replace.toString();
    }
}
