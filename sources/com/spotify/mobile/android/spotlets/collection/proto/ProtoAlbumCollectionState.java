package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoAlbumCollectionState extends Message<ProtoAlbumCollectionState, Builder> {
    public static final ProtoAdapter<ProtoAlbumCollectionState> ADAPTER = new a();
    public static final String DEFAULT_COLLECTION_LINK = "";
    public static final Boolean DEFAULT_COMPLETE = Boolean.FALSE;
    public static final Integer DEFAULT_NUM_TRACKS_IN_COLLECTION = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String collection_link;
    public final Boolean complete;
    public final Integer num_tracks_in_collection;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoAlbumCollectionState, Builder> {
        public String collection_link;
        public Boolean complete;
        public Integer num_tracks_in_collection;

        public final ProtoAlbumCollectionState build() {
            return new ProtoAlbumCollectionState(this.collection_link, this.num_tracks_in_collection, this.complete, super.buildUnknownFields());
        }

        public final Builder collection_link(String str) {
            this.collection_link = str;
            return this;
        }

        public final Builder complete(Boolean bool) {
            this.complete = bool;
            return this;
        }

        public final Builder num_tracks_in_collection(Integer num) {
            this.num_tracks_in_collection = num;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoAlbumCollectionState> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoAlbumCollectionState.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoAlbumCollectionState protoAlbumCollectionState = (ProtoAlbumCollectionState) obj;
            int i = 0;
            int a = (protoAlbumCollectionState.collection_link != null ? ProtoAdapter.i.a(1, protoAlbumCollectionState.collection_link) : 0) + (protoAlbumCollectionState.num_tracks_in_collection != null ? ProtoAdapter.c.a(2, protoAlbumCollectionState.num_tracks_in_collection) : 0);
            if (protoAlbumCollectionState.complete != null) {
                i = ProtoAdapter.a.a(3, protoAlbumCollectionState.complete);
            }
            return a + i + protoAlbumCollectionState.a().h();
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
                    builder.collection_link((String) ProtoAdapter.i.a(whg));
                } else if (b == 2) {
                    builder.num_tracks_in_collection((Integer) ProtoAdapter.c.a(whg));
                } else if (b != 3) {
                    FieldEncoding fieldEncoding = whg.b;
                    builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                } else {
                    builder.complete((Boolean) ProtoAdapter.a.a(whg));
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoAlbumCollectionState protoAlbumCollectionState = (ProtoAlbumCollectionState) obj;
            if (protoAlbumCollectionState.collection_link != null) {
                int i = 7 >> 1;
                ProtoAdapter.i.a(whh, 1, protoAlbumCollectionState.collection_link);
            }
            if (protoAlbumCollectionState.num_tracks_in_collection != null) {
                ProtoAdapter.c.a(whh, 2, protoAlbumCollectionState.num_tracks_in_collection);
            }
            if (protoAlbumCollectionState.complete != null) {
                ProtoAdapter.a.a(whh, 3, protoAlbumCollectionState.complete);
            }
            whh.a(protoAlbumCollectionState.a());
        }
    }

    public ProtoAlbumCollectionState(String str, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.collection_link = str;
        this.num_tracks_in_collection = num;
        this.complete = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoAlbumCollectionState)) {
            return false;
        }
        ProtoAlbumCollectionState protoAlbumCollectionState = (ProtoAlbumCollectionState) obj;
        return a().equals(protoAlbumCollectionState.a()) && whk.a((Object) this.collection_link, (Object) protoAlbumCollectionState.collection_link) && whk.a((Object) this.num_tracks_in_collection, (Object) protoAlbumCollectionState.num_tracks_in_collection) && whk.a((Object) this.complete, (Object) protoAlbumCollectionState.complete);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.collection_link;
        int i2 = 0;
        boolean z = true & false;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.num_tracks_in_collection;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.complete;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode3 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.collection_link != null) {
            String str = "kcs=tlliniec_oo,nl";
            sb.append(", collection_link=");
            sb.append(this.collection_link);
        }
        if (this.num_tracks_in_collection != null) {
            String str2 = " rimckalcumc,oenn_tit_nos_l";
            sb.append(", num_tracks_in_collection=");
            sb.append(this.num_tracks_in_collection);
        }
        if (this.complete != null) {
            sb.append(", complete=");
            sb.append(this.complete);
        }
        String str3 = "ouoromAeaoetoSibtlltn{tclP";
        StringBuilder replace = sb.replace(0, 2, "ProtoAlbumCollectionState{");
        replace.append('}');
        return replace.toString();
    }
}
