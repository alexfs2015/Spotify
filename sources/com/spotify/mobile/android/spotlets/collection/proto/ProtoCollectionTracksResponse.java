package com.spotify.mobile.android.spotlets.collection.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoCollectionTracksResponse extends Message<ProtoCollectionTracksResponse, Builder> {
    public static final ProtoAdapter<ProtoCollectionTracksResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final String DEFAULT_OFFLINE = "";
    public static final Integer DEFAULT_SYNC_PROGRESS;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final List<ProtoGroupHeader> group_index;
    public final List<ProtoCollectionTracksItem> item;
    public final Boolean loading_contents;
    public final String offline;
    public final Integer sync_progress;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoCollectionTracksResponse, Builder> {
        public List<ProtoGroupHeader> group_index = vte.a();
        public List<ProtoCollectionTracksItem> item = vte.a();
        public Boolean loading_contents;
        public String offline;
        public Integer sync_progress;
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final Builder item(List<ProtoCollectionTracksItem> list) {
            vte.a(list);
            this.item = list;
            return this;
        }

        public final Builder unfiltered_length(Integer num) {
            this.unfiltered_length = num;
            return this;
        }

        public final Builder unranged_length(Integer num) {
            this.unranged_length = num;
            return this;
        }

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final Builder offline(String str) {
            this.offline = str;
            return this;
        }

        public final Builder sync_progress(Integer num) {
            this.sync_progress = num;
            return this;
        }

        public final Builder group_index(List<ProtoGroupHeader> list) {
            vte.a(list);
            this.group_index = list;
            return this;
        }

        public final ProtoCollectionTracksResponse build() {
            ProtoCollectionTracksResponse protoCollectionTracksResponse = new ProtoCollectionTracksResponse(this.item, this.unfiltered_length, this.unranged_length, this.loading_contents, this.offline, this.sync_progress, this.group_index, super.buildUnknownFields());
            return protoCollectionTracksResponse;
        }
    }

    static final class a extends ProtoAdapter<ProtoCollectionTracksResponse> {
        public final /* synthetic */ int a(Object obj) {
            ProtoCollectionTracksResponse protoCollectionTracksResponse = (ProtoCollectionTracksResponse) obj;
            int i = 0;
            int a = ProtoCollectionTracksItem.ADAPTER.a().a(1, protoCollectionTracksResponse.item) + (protoCollectionTracksResponse.unfiltered_length != null ? ProtoAdapter.c.a(2, protoCollectionTracksResponse.unfiltered_length) : 0) + (protoCollectionTracksResponse.unranged_length != null ? ProtoAdapter.c.a(3, protoCollectionTracksResponse.unranged_length) : 0) + (protoCollectionTracksResponse.loading_contents != null ? ProtoAdapter.a.a(4, protoCollectionTracksResponse.loading_contents) : 0) + (protoCollectionTracksResponse.offline != null ? ProtoAdapter.i.a(5, protoCollectionTracksResponse.offline) : 0);
            if (protoCollectionTracksResponse.sync_progress != null) {
                i = ProtoAdapter.c.a(6, protoCollectionTracksResponse.sync_progress);
            }
            return a + i + ProtoGroupHeader.ADAPTER.a().a(7, protoCollectionTracksResponse.group_index) + protoCollectionTracksResponse.a().h();
        }

        public final /* bridge */ /* synthetic */ void a(vtb vtb, Object obj) {
            ProtoCollectionTracksResponse protoCollectionTracksResponse = (ProtoCollectionTracksResponse) obj;
            ProtoCollectionTracksItem.ADAPTER.a().a(vtb, 1, protoCollectionTracksResponse.item);
            if (protoCollectionTracksResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(vtb, 2, protoCollectionTracksResponse.unfiltered_length);
            }
            if (protoCollectionTracksResponse.unranged_length != null) {
                ProtoAdapter.c.a(vtb, 3, protoCollectionTracksResponse.unranged_length);
            }
            if (protoCollectionTracksResponse.loading_contents != null) {
                ProtoAdapter.a.a(vtb, 4, protoCollectionTracksResponse.loading_contents);
            }
            if (protoCollectionTracksResponse.offline != null) {
                ProtoAdapter.i.a(vtb, 5, protoCollectionTracksResponse.offline);
            }
            if (protoCollectionTracksResponse.sync_progress != null) {
                ProtoAdapter.c.a(vtb, 6, protoCollectionTracksResponse.sync_progress);
            }
            ProtoGroupHeader.ADAPTER.a().a(vtb, 7, protoCollectionTracksResponse.group_index);
            vtb.a(protoCollectionTracksResponse.a());
        }

        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoCollectionTracksResponse.class);
        }

        public final /* synthetic */ Object a(vta vta) {
            Builder builder = new Builder();
            long a = vta.a();
            while (true) {
                int b = vta.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.item.add(ProtoCollectionTracksItem.ADAPTER.a(vta));
                            break;
                        case 2:
                            builder.unfiltered_length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 3:
                            builder.unranged_length((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 4:
                            builder.loading_contents((Boolean) ProtoAdapter.a.a(vta));
                            break;
                        case 5:
                            builder.offline((String) ProtoAdapter.i.a(vta));
                            break;
                        case 6:
                            builder.sync_progress((Integer) ProtoAdapter.c.a(vta));
                            break;
                        case 7:
                            builder.group_index.add(ProtoGroupHeader.ADAPTER.a(vta));
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

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
        DEFAULT_SYNC_PROGRESS = valueOf;
    }

    public ProtoCollectionTracksResponse(List<ProtoCollectionTracksItem> list, Integer num, Integer num2, Boolean bool, String str, Integer num3, List<ProtoGroupHeader> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item = vte.a("item", list);
        this.unfiltered_length = num;
        this.unranged_length = num2;
        this.loading_contents = bool;
        this.offline = str;
        this.sync_progress = num3;
        this.group_index = vte.a("group_index", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoCollectionTracksResponse)) {
            return false;
        }
        ProtoCollectionTracksResponse protoCollectionTracksResponse = (ProtoCollectionTracksResponse) obj;
        return a().equals(protoCollectionTracksResponse.a()) && this.item.equals(protoCollectionTracksResponse.item) && vte.a((Object) this.unfiltered_length, (Object) protoCollectionTracksResponse.unfiltered_length) && vte.a((Object) this.unranged_length, (Object) protoCollectionTracksResponse.unranged_length) && vte.a((Object) this.loading_contents, (Object) protoCollectionTracksResponse.loading_contents) && vte.a((Object) this.offline, (Object) protoCollectionTracksResponse.offline) && vte.a((Object) this.sync_progress, (Object) protoCollectionTracksResponse.sync_progress) && this.group_index.equals(protoCollectionTracksResponse.group_index);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
        Integer num = this.unfiltered_length;
        int i2 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.unranged_length;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool = this.loading_contents;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.offline;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num3 = this.sync_progress;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        int hashCode6 = ((hashCode5 + i2) * 37) + this.group_index.hashCode();
        this.hashCode = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.loading_contents != null) {
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        if (this.offline != null) {
            sb.append(", offline=");
            sb.append(this.offline);
        }
        if (this.sync_progress != null) {
            sb.append(", sync_progress=");
            sb.append(this.sync_progress);
        }
        if (!this.group_index.isEmpty()) {
            sb.append(", group_index=");
            sb.append(this.group_index);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoCollectionTracksResponse{");
        replace.append('}');
        return replace.toString();
    }
}
