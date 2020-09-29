package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoCollectionTracksItem extends Message<ProtoCollectionTracksItem, Builder> {
    public static final ProtoAdapter<ProtoCollectionTracksItem> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME;
    public static final Integer DEFAULT_HEADERLESS_INDEX;
    public static final String DEFAULT_HEADER_FIELD = "";
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final ProtoTrackCollectionState collection_state;
    public final String header_field;
    public final Integer headerless_index;
    public final ProtoTrackOfflineState offline_state;
    public final ProtoTrackPlayState play_state;
    public final ProtoTrackMetadata track_metadata;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionTracksItem, Builder> {
        public Integer add_time;
        public ProtoTrackCollectionState collection_state;
        public String header_field;
        public Integer headerless_index;
        public ProtoTrackOfflineState offline_state;
        public ProtoTrackPlayState play_state;
        public ProtoTrackMetadata track_metadata;

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final ProtoCollectionTracksItem build() {
            ProtoCollectionTracksItem protoCollectionTracksItem = r0;
            ProtoCollectionTracksItem protoCollectionTracksItem2 = new ProtoCollectionTracksItem(this.header_field, this.headerless_index, this.add_time, this.track_metadata, this.offline_state, this.play_state, this.collection_state, super.buildUnknownFields());
            return protoCollectionTracksItem2;
        }

        public final Builder collection_state(ProtoTrackCollectionState protoTrackCollectionState) {
            this.collection_state = protoTrackCollectionState;
            return this;
        }

        public final Builder header_field(String str) {
            this.header_field = str;
            return this;
        }

        public final Builder headerless_index(Integer num) {
            this.headerless_index = num;
            return this;
        }

        public final Builder offline_state(ProtoTrackOfflineState protoTrackOfflineState) {
            this.offline_state = protoTrackOfflineState;
            return this;
        }

        public final Builder play_state(ProtoTrackPlayState protoTrackPlayState) {
            this.play_state = protoTrackPlayState;
            return this;
        }

        public final Builder track_metadata(ProtoTrackMetadata protoTrackMetadata) {
            this.track_metadata = protoTrackMetadata;
            return this;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionTracksItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionTracksItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionTracksItem protoCollectionTracksItem = (ProtoCollectionTracksItem) obj;
            int i = 0;
            int a = (protoCollectionTracksItem.header_field != null ? ProtoAdapter.i.a(1, protoCollectionTracksItem.header_field) : 0) + (protoCollectionTracksItem.headerless_index != null ? ProtoAdapter.c.a(2, protoCollectionTracksItem.headerless_index) : 0) + (protoCollectionTracksItem.add_time != null ? ProtoAdapter.c.a(3, protoCollectionTracksItem.add_time) : 0) + (protoCollectionTracksItem.track_metadata != null ? ProtoTrackMetadata.ADAPTER.a(4, protoCollectionTracksItem.track_metadata) : 0) + (protoCollectionTracksItem.offline_state != null ? ProtoTrackOfflineState.ADAPTER.a(5, protoCollectionTracksItem.offline_state) : 0) + (protoCollectionTracksItem.play_state != null ? ProtoTrackPlayState.ADAPTER.a(6, protoCollectionTracksItem.play_state) : 0);
            if (protoCollectionTracksItem.collection_state != null) {
                i = ProtoTrackCollectionState.ADAPTER.a(7, protoCollectionTracksItem.collection_state);
            }
            return a + i + protoCollectionTracksItem.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.header_field((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.headerless_index((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 3:
                            builder.add_time((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 4:
                            builder.track_metadata((ProtoTrackMetadata) ProtoTrackMetadata.ADAPTER.a(whg));
                            break;
                        case 5:
                            builder.offline_state((ProtoTrackOfflineState) ProtoTrackOfflineState.ADAPTER.a(whg));
                            break;
                        case 6:
                            builder.play_state((ProtoTrackPlayState) ProtoTrackPlayState.ADAPTER.a(whg));
                            break;
                        case 7:
                            builder.collection_state((ProtoTrackCollectionState) ProtoTrackCollectionState.ADAPTER.a(whg));
                            break;
                        default:
                            FieldEncoding fieldEncoding = whg.b;
                            builder.addUnknownField(b, fieldEncoding, fieldEncoding.a().a(whg));
                            break;
                    }
                } else {
                    whg.a(a);
                    return builder.build();
                }
            }
        }

        public final /* bridge */ /* synthetic */ void a(whh whh, Object obj) {
            ProtoCollectionTracksItem protoCollectionTracksItem = (ProtoCollectionTracksItem) obj;
            if (protoCollectionTracksItem.header_field != null) {
                ProtoAdapter.i.a(whh, 1, protoCollectionTracksItem.header_field);
            }
            if (protoCollectionTracksItem.headerless_index != null) {
                ProtoAdapter.c.a(whh, 2, protoCollectionTracksItem.headerless_index);
            }
            if (protoCollectionTracksItem.add_time != null) {
                ProtoAdapter.c.a(whh, 3, protoCollectionTracksItem.add_time);
            }
            if (protoCollectionTracksItem.track_metadata != null) {
                ProtoTrackMetadata.ADAPTER.a(whh, 4, protoCollectionTracksItem.track_metadata);
            }
            if (protoCollectionTracksItem.offline_state != null) {
                ProtoTrackOfflineState.ADAPTER.a(whh, 5, protoCollectionTracksItem.offline_state);
            }
            if (protoCollectionTracksItem.play_state != null) {
                ProtoTrackPlayState.ADAPTER.a(whh, 6, protoCollectionTracksItem.play_state);
            }
            if (protoCollectionTracksItem.collection_state != null) {
                ProtoTrackCollectionState.ADAPTER.a(whh, 7, protoCollectionTracksItem.collection_state);
            }
            whh.a(protoCollectionTracksItem.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_HEADERLESS_INDEX = valueOf;
        DEFAULT_ADD_TIME = valueOf;
    }

    public ProtoCollectionTracksItem(String str, Integer num, Integer num2, ProtoTrackMetadata protoTrackMetadata, ProtoTrackOfflineState protoTrackOfflineState, ProtoTrackPlayState protoTrackPlayState, ProtoTrackCollectionState protoTrackCollectionState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header_field = str;
        this.headerless_index = num;
        this.add_time = num2;
        this.track_metadata = protoTrackMetadata;
        this.offline_state = protoTrackOfflineState;
        this.play_state = protoTrackPlayState;
        this.collection_state = protoTrackCollectionState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoCollectionTracksItem)) {
            return false;
        }
        ProtoCollectionTracksItem protoCollectionTracksItem = (ProtoCollectionTracksItem) obj;
        return a().equals(protoCollectionTracksItem.a()) && whk.a((Object) this.header_field, (Object) protoCollectionTracksItem.header_field) && whk.a((Object) this.headerless_index, (Object) protoCollectionTracksItem.headerless_index) && whk.a((Object) this.add_time, (Object) protoCollectionTracksItem.add_time) && whk.a((Object) this.track_metadata, (Object) protoCollectionTracksItem.track_metadata) && whk.a((Object) this.offline_state, (Object) protoCollectionTracksItem.offline_state) && whk.a((Object) this.play_state, (Object) protoCollectionTracksItem.play_state) && whk.a((Object) this.collection_state, (Object) protoCollectionTracksItem.collection_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            String str = this.header_field;
            int i2 = 0;
            int i3 = 4 << 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.headerless_index;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.add_time;
            int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
            ProtoTrackMetadata protoTrackMetadata = this.track_metadata;
            int hashCode5 = (hashCode4 + (protoTrackMetadata != null ? protoTrackMetadata.hashCode() : 0)) * 37;
            ProtoTrackOfflineState protoTrackOfflineState = this.offline_state;
            int hashCode6 = (hashCode5 + (protoTrackOfflineState != null ? protoTrackOfflineState.hashCode() : 0)) * 37;
            ProtoTrackPlayState protoTrackPlayState = this.play_state;
            int hashCode7 = (hashCode6 + (protoTrackPlayState != null ? protoTrackPlayState.hashCode() : 0)) * 37;
            ProtoTrackCollectionState protoTrackCollectionState = this.collection_state;
            if (protoTrackCollectionState != null) {
                i2 = protoTrackCollectionState.hashCode();
            }
            i = hashCode7 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header_field != null) {
            sb.append(", header_field=");
            sb.append(this.header_field);
        }
        if (this.headerless_index != null) {
            String str = "aesd,=lsieserx ednh";
            sb.append(", headerless_index=");
            sb.append(this.headerless_index);
        }
        if (this.add_time != null) {
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        if (this.track_metadata != null) {
            sb.append(", track_metadata=");
            sb.append(this.track_metadata);
        }
        if (this.offline_state != null) {
            String str2 = "ttlm eff,_oniaes";
            sb.append(", offline_state=");
            sb.append(this.offline_state);
        }
        if (this.play_state != null) {
            String str3 = "t_l oy,taps=e";
            sb.append(", play_state=");
            sb.append(this.play_state);
        }
        if (this.collection_state != null) {
            sb.append(", collection_state=");
            sb.append(this.collection_state);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionTracksItem{");
        replace.append('}');
        return replace.toString();
    }
}
