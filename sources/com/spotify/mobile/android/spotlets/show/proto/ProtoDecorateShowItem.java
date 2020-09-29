package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoDecorateShowItem extends Message<ProtoDecorateShowItem, Builder> {
    public static final ProtoAdapter<ProtoDecorateShowItem> ADAPTER = new a();
    public static final String DEFAULT_LINK = "";
    private static final long serialVersionUID = 0;
    public final String link;
    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_play_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoDecorateShowItem, Builder> {
        public String link;
        public ProtoShowCollectionState show_collection_state;
        public ProtoShowMetadata show_metadata;
        public ProtoShowPlayState show_play_state;

        public final ProtoDecorateShowItem build() {
            ProtoDecorateShowItem protoDecorateShowItem = r0;
            ProtoDecorateShowItem protoDecorateShowItem2 = new ProtoDecorateShowItem(this.show_metadata, this.show_collection_state, this.show_play_state, this.link, super.buildUnknownFields());
            return protoDecorateShowItem2;
        }

        public final Builder link(String str) {
            this.link = str;
            return this;
        }

        public final Builder show_collection_state(ProtoShowCollectionState protoShowCollectionState) {
            this.show_collection_state = protoShowCollectionState;
            return this;
        }

        public final Builder show_metadata(ProtoShowMetadata protoShowMetadata) {
            this.show_metadata = protoShowMetadata;
            return this;
        }

        public final Builder show_play_state(ProtoShowPlayState protoShowPlayState) {
            this.show_play_state = protoShowPlayState;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoDecorateShowItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoDecorateShowItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoDecorateShowItem protoDecorateShowItem = (ProtoDecorateShowItem) obj;
            int i = 0;
            int a = (protoDecorateShowItem.show_metadata != null ? ProtoShowMetadata.ADAPTER.a(1, protoDecorateShowItem.show_metadata) : 0) + (protoDecorateShowItem.show_collection_state != null ? ProtoShowCollectionState.ADAPTER.a(2, protoDecorateShowItem.show_collection_state) : 0) + (protoDecorateShowItem.show_play_state != null ? ProtoShowPlayState.ADAPTER.a(3, protoDecorateShowItem.show_play_state) : 0);
            if (protoDecorateShowItem.link != null) {
                i = ProtoAdapter.i.a(4, protoDecorateShowItem.link);
            }
            return a + i + protoDecorateShowItem.a().h();
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
                    builder.show_metadata((ProtoShowMetadata) ProtoShowMetadata.ADAPTER.a(whg));
                } else if (b == 2) {
                    builder.show_collection_state((ProtoShowCollectionState) ProtoShowCollectionState.ADAPTER.a(whg));
                } else if (b == 3) {
                    builder.show_play_state((ProtoShowPlayState) ProtoShowPlayState.ADAPTER.a(whg));
                } else if (b != 4) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.link((String) ProtoAdapter.i.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoDecorateShowItem protoDecorateShowItem = (ProtoDecorateShowItem) obj;
            if (protoDecorateShowItem.show_metadata != null) {
                ProtoShowMetadata.ADAPTER.a(whh, 1, protoDecorateShowItem.show_metadata);
            }
            if (protoDecorateShowItem.show_collection_state != null) {
                ProtoShowCollectionState.ADAPTER.a(whh, 2, protoDecorateShowItem.show_collection_state);
            }
            if (protoDecorateShowItem.show_play_state != null) {
                ProtoShowPlayState.ADAPTER.a(whh, 3, protoDecorateShowItem.show_play_state);
            }
            if (protoDecorateShowItem.link != null) {
                ProtoAdapter.i.a(whh, 4, protoDecorateShowItem.link);
            }
            whh.a(protoDecorateShowItem.a());
        }
    }

    public ProtoDecorateShowItem(ProtoShowMetadata protoShowMetadata, ProtoShowCollectionState protoShowCollectionState, ProtoShowPlayState protoShowPlayState, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_metadata = protoShowMetadata;
        this.show_collection_state = protoShowCollectionState;
        this.show_play_state = protoShowPlayState;
        this.link = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoDecorateShowItem)) {
            return false;
        }
        ProtoDecorateShowItem protoDecorateShowItem = (ProtoDecorateShowItem) obj;
        return a().equals(protoDecorateShowItem.a()) && whk.a((Object) this.show_metadata, (Object) protoDecorateShowItem.show_metadata) && whk.a((Object) this.show_collection_state, (Object) protoDecorateShowItem.show_collection_state) && whk.a((Object) this.show_play_state, (Object) protoDecorateShowItem.show_play_state) && whk.a((Object) this.link, (Object) protoDecorateShowItem.link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        ProtoShowMetadata protoShowMetadata = this.show_metadata;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoShowMetadata != null ? protoShowMetadata.hashCode() : 0)) * 37;
        ProtoShowCollectionState protoShowCollectionState = this.show_collection_state;
        int hashCode3 = (hashCode2 + (protoShowCollectionState != null ? protoShowCollectionState.hashCode() : 0)) * 37;
        ProtoShowPlayState protoShowPlayState = this.show_play_state;
        int hashCode4 = (hashCode3 + (protoShowPlayState != null ? protoShowPlayState.hashCode() : 0)) * 37;
        String str = this.link;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_metadata != null) {
            sb.append(", show_metadata=");
            sb.append(this.show_metadata);
        }
        if (this.show_collection_state != null) {
            String str = "wlsns_ie,tcclotaoosht_=e";
            sb.append(", show_collection_state=");
            sb.append(this.show_collection_state);
        }
        if (this.show_play_state != null) {
            String str2 = "aesmatowp_sh,l= _t";
            sb.append(", show_play_state=");
            sb.append(this.show_play_state);
        }
        if (this.link != null) {
            String str3 = "i nkol,";
            sb.append(", link=");
            sb.append(this.link);
        }
        String str4 = "{IhoabomeoPwDerrStoetc";
        StringBuilder replace = sb.replace(0, 2, "ProtoDecorateShowItem{");
        replace.append('}');
        return replace.toString();
    }
}
