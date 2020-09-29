package com.spotify.mobile.android.spotlets.show.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okio.ByteString;

public final class ProtoShowsRequestItem extends Message<ProtoShowsRequestItem, Builder> {
    public static final ProtoAdapter<ProtoShowsRequestItem> ADAPTER = new a();
    public static final Integer DEFAULT_ADD_TIME;
    public static final Boolean DEFAULT_HAS_NEW_EPISODES = Boolean.FALSE;
    public static final String DEFAULT_HEADER = "";
    public static final Integer DEFAULT_HEADERLESS_INDEX;
    public static final Long DEFAULT_LATEST_PUBLISHED_EPISODE_DATE = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Integer add_time;
    public final Boolean has_new_episodes;
    public final String header;
    public final Integer headerless_index;
    public final Long latest_published_episode_date;
    public final ProtoShowCollectionState show_collection_state;
    public final ProtoShowMetadata show_metadata;
    public final ProtoShowPlayState show_play_state;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoShowsRequestItem, Builder> {
        public Integer add_time;
        public Boolean has_new_episodes;
        public String header;
        public Integer headerless_index;
        public Long latest_published_episode_date;
        public ProtoShowCollectionState show_collection_state;
        public ProtoShowMetadata show_metadata;
        public ProtoShowPlayState show_play_state;

        public final Builder add_time(Integer num) {
            this.add_time = num;
            return this;
        }

        public final ProtoShowsRequestItem build() {
            ProtoShowsRequestItem protoShowsRequestItem = new ProtoShowsRequestItem(this.header, this.show_metadata, this.show_collection_state, this.show_play_state, this.headerless_index, this.add_time, this.has_new_episodes, this.latest_published_episode_date, super.buildUnknownFields());
            return protoShowsRequestItem;
        }

        public final Builder has_new_episodes(Boolean bool) {
            this.has_new_episodes = bool;
            return this;
        }

        public final Builder header(String str) {
            this.header = str;
            return this;
        }

        public final Builder headerless_index(Integer num) {
            this.headerless_index = num;
            return this;
        }

        public final Builder latest_published_episode_date(Long l) {
            this.latest_published_episode_date = l;
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

    static final class a extends ProtoAdapter<ProtoShowsRequestItem> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoShowsRequestItem.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoShowsRequestItem protoShowsRequestItem = (ProtoShowsRequestItem) obj;
            int i = 0;
            int a = (protoShowsRequestItem.header != null ? ProtoAdapter.i.a(1, protoShowsRequestItem.header) : 0) + (protoShowsRequestItem.show_metadata != null ? ProtoShowMetadata.ADAPTER.a(2, protoShowsRequestItem.show_metadata) : 0) + (protoShowsRequestItem.show_collection_state != null ? ProtoShowCollectionState.ADAPTER.a(3, protoShowsRequestItem.show_collection_state) : 0) + (protoShowsRequestItem.show_play_state != null ? ProtoShowPlayState.ADAPTER.a(4, protoShowsRequestItem.show_play_state) : 0) + (protoShowsRequestItem.headerless_index != null ? ProtoAdapter.c.a(5, protoShowsRequestItem.headerless_index) : 0) + (protoShowsRequestItem.add_time != null ? ProtoAdapter.c.a(6, protoShowsRequestItem.add_time) : 0) + (protoShowsRequestItem.has_new_episodes != null ? ProtoAdapter.a.a(7, protoShowsRequestItem.has_new_episodes) : 0);
            if (protoShowsRequestItem.latest_published_episode_date != null) {
                i = ProtoAdapter.f.a(8, protoShowsRequestItem.latest_published_episode_date);
            }
            return a + i + protoShowsRequestItem.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.header((String) ProtoAdapter.i.a(whg));
                            break;
                        case 2:
                            builder.show_metadata((ProtoShowMetadata) ProtoShowMetadata.ADAPTER.a(whg));
                            break;
                        case 3:
                            builder.show_collection_state((ProtoShowCollectionState) ProtoShowCollectionState.ADAPTER.a(whg));
                            break;
                        case 4:
                            builder.show_play_state((ProtoShowPlayState) ProtoShowPlayState.ADAPTER.a(whg));
                            break;
                        case 5:
                            builder.headerless_index((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 6:
                            builder.add_time((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 7:
                            builder.has_new_episodes((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 8:
                            builder.latest_published_episode_date((Long) ProtoAdapter.f.a(whg));
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
            ProtoShowsRequestItem protoShowsRequestItem = (ProtoShowsRequestItem) obj;
            if (protoShowsRequestItem.header != null) {
                ProtoAdapter.i.a(whh, 1, protoShowsRequestItem.header);
            }
            if (protoShowsRequestItem.show_metadata != null) {
                boolean z = false ^ true;
                ProtoShowMetadata.ADAPTER.a(whh, 2, protoShowsRequestItem.show_metadata);
            }
            if (protoShowsRequestItem.show_collection_state != null) {
                ProtoShowCollectionState.ADAPTER.a(whh, 3, protoShowsRequestItem.show_collection_state);
            }
            if (protoShowsRequestItem.show_play_state != null) {
                ProtoShowPlayState.ADAPTER.a(whh, 4, protoShowsRequestItem.show_play_state);
            }
            if (protoShowsRequestItem.headerless_index != null) {
                ProtoAdapter.c.a(whh, 5, protoShowsRequestItem.headerless_index);
            }
            if (protoShowsRequestItem.add_time != null) {
                ProtoAdapter.c.a(whh, 6, protoShowsRequestItem.add_time);
            }
            if (protoShowsRequestItem.has_new_episodes != null) {
                ProtoAdapter.a.a(whh, 7, protoShowsRequestItem.has_new_episodes);
            }
            if (protoShowsRequestItem.latest_published_episode_date != null) {
                ProtoAdapter.f.a(whh, 8, protoShowsRequestItem.latest_published_episode_date);
            }
            whh.a(protoShowsRequestItem.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_HEADERLESS_INDEX = valueOf;
        DEFAULT_ADD_TIME = valueOf;
    }

    public ProtoShowsRequestItem(String str, ProtoShowMetadata protoShowMetadata, ProtoShowCollectionState protoShowCollectionState, ProtoShowPlayState protoShowPlayState, Integer num, Integer num2, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = str;
        this.show_metadata = protoShowMetadata;
        this.show_collection_state = protoShowCollectionState;
        this.show_play_state = protoShowPlayState;
        this.headerless_index = num;
        this.add_time = num2;
        this.has_new_episodes = bool;
        this.latest_published_episode_date = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoShowsRequestItem)) {
            return false;
        }
        ProtoShowsRequestItem protoShowsRequestItem = (ProtoShowsRequestItem) obj;
        return a().equals(protoShowsRequestItem.a()) && whk.a((Object) this.header, (Object) protoShowsRequestItem.header) && whk.a((Object) this.show_metadata, (Object) protoShowsRequestItem.show_metadata) && whk.a((Object) this.show_collection_state, (Object) protoShowsRequestItem.show_collection_state) && whk.a((Object) this.show_play_state, (Object) protoShowsRequestItem.show_play_state) && whk.a((Object) this.headerless_index, (Object) protoShowsRequestItem.headerless_index) && whk.a((Object) this.add_time, (Object) protoShowsRequestItem.add_time) && whk.a((Object) this.has_new_episodes, (Object) protoShowsRequestItem.has_new_episodes) && whk.a((Object) this.latest_published_episode_date, (Object) protoShowsRequestItem.latest_published_episode_date);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            int hashCode = a().hashCode() * 37;
            String str = this.header;
            int i2 = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ProtoShowMetadata protoShowMetadata = this.show_metadata;
            int hashCode3 = (hashCode2 + (protoShowMetadata != null ? protoShowMetadata.hashCode() : 0)) * 37;
            ProtoShowCollectionState protoShowCollectionState = this.show_collection_state;
            int hashCode4 = (hashCode3 + (protoShowCollectionState != null ? protoShowCollectionState.hashCode() : 0)) * 37;
            ProtoShowPlayState protoShowPlayState = this.show_play_state;
            int hashCode5 = (hashCode4 + (protoShowPlayState != null ? protoShowPlayState.hashCode() : 0)) * 37;
            Integer num = this.headerless_index;
            int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 37;
            Integer num2 = this.add_time;
            int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
            Boolean bool = this.has_new_episodes;
            int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
            Long l = this.latest_published_episode_date;
            if (l != null) {
                i2 = l.hashCode();
            }
            i = hashCode8 + i2;
            this.hashCode = i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.header != null) {
            String str = "=asdhr, e";
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.show_metadata != null) {
            String str2 = " e=mw_,oatamdats";
            sb.append(", show_metadata=");
            sb.append(this.show_metadata);
        }
        if (this.show_collection_state != null) {
            String str3 = "loosoohecitna=_ _lt,tesc";
            sb.append(", show_collection_state=");
            sb.append(this.show_collection_state);
        }
        if (this.show_play_state != null) {
            String str4 = "a=sylbpso ha__ewtt";
            sb.append(", show_play_state=");
            sb.append(this.show_play_state);
        }
        if (this.headerless_index != null) {
            sb.append(", headerless_index=");
            sb.append(this.headerless_index);
        }
        if (this.add_time != null) {
            String str5 = "ea=i _bdm,d";
            sb.append(", add_time=");
            sb.append(this.add_time);
        }
        if (this.has_new_episodes != null) {
            String str6 = "ie_nhsotp,esads=_ e";
            sb.append(", has_new_episodes=");
            sb.append(this.has_new_episodes);
        }
        if (this.latest_published_episode_date != null) {
            sb.append(", latest_published_episode_date=");
            sb.append(this.latest_published_episode_date);
        }
        StringBuilder replace = sb.replace(0, 2, "ProtoShowsRequestItem{");
        replace.append('}');
        return replace.toString();
    }
}
