package com.spotify.mobile.android.playlist.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.util.List;
import okio.ByteString;

public final class ProtoPlaylistResponse extends Message<ProtoPlaylistResponse, Builder> {
    public static final ProtoAdapter<ProtoPlaylistResponse> ADAPTER = new a();
    public static final Boolean DEFAULT_CONTAINS_AUDIO_EPISODES = Boolean.FALSE;
    public static final Boolean DEFAULT_CONTAINS_EPISODES = Boolean.FALSE;
    public static final Boolean DEFAULT_CONTAINS_SPOTIFY_TRACKS = Boolean.FALSE;
    public static final Boolean DEFAULT_CONTAINS_TRACKS = Boolean.FALSE;
    public static final Long DEFAULT_DURATION;
    public static final Boolean DEFAULT_HAS_EXPLICIT_CONTENT = Boolean.FALSE;
    public static final Boolean DEFAULT_IS_ON_DEMAND_IN_FREE = Boolean.FALSE;
    public static final Long DEFAULT_LAST_MODIFICATION;
    public static final Boolean DEFAULT_LOADING_CONTENTS = Boolean.FALSE;
    public static final Integer DEFAULT_NUMBER_OF_EPISODES;
    public static final Integer DEFAULT_NUMBER_OF_TRACKS;
    public static final Integer DEFAULT_NUM_FOLLOWERS;
    public static final Boolean DEFAULT_ONLY_CONTAINS_EXPLICIT = Boolean.FALSE;
    public static final Integer DEFAULT_UNFILTERED_LENGTH;
    public static final Integer DEFAULT_UNRANGED_LENGTH;
    private static final long serialVersionUID = 0;
    public final Boolean contains_audio_episodes;
    public final Boolean contains_episodes;
    public final Boolean contains_spotify_tracks;
    public final Boolean contains_tracks;
    public final Long duration;
    public final Boolean has_explicit_content;
    public final Boolean is_on_demand_in_free;
    public final List<ProtoPlaylistItem> item;
    public final Long last_modification;
    public final Boolean loading_contents;
    public final Integer num_followers;
    public final Integer number_of_episodes;
    public final Integer number_of_tracks;
    public final Boolean only_contains_explicit;
    public final ProtoPlaylistHeader playlist;
    public final List<ProtoRecommendationItem> recommendations;
    public final Integer unfiltered_length;
    public final Integer unranged_length;

    public static final class Builder extends com.squareup.wire.Message.a<ProtoPlaylistResponse, Builder> {
        public Boolean contains_audio_episodes;
        public Boolean contains_episodes;
        public Boolean contains_spotify_tracks;
        public Boolean contains_tracks;
        public Long duration;
        public Boolean has_explicit_content;
        public Boolean is_on_demand_in_free;
        public List<ProtoPlaylistItem> item = whk.a();
        public Long last_modification;
        public Boolean loading_contents;
        public Integer num_followers;
        public Integer number_of_episodes;
        public Integer number_of_tracks;
        public Boolean only_contains_explicit;
        public ProtoPlaylistHeader playlist;
        public List<ProtoRecommendationItem> recommendations = whk.a();
        public Integer unfiltered_length;
        public Integer unranged_length;

        public final ProtoPlaylistResponse build() {
            ProtoPlaylistResponse protoPlaylistResponse;
            ProtoPlaylistResponse protoPlaylistResponse2 = r1;
            List<ProtoPlaylistItem> list = this.item;
            ProtoPlaylistHeader protoPlaylistHeader = this.playlist;
            Integer num = this.unfiltered_length;
            Integer num2 = this.unranged_length;
            Long l = this.duration;
            Boolean bool = this.loading_contents;
            Long l2 = this.last_modification;
            Integer num3 = this.num_followers;
            List<ProtoRecommendationItem> list2 = this.recommendations;
            Boolean bool2 = this.has_explicit_content;
            Boolean bool3 = this.contains_spotify_tracks;
            Boolean bool4 = this.contains_episodes;
            Boolean bool5 = this.only_contains_explicit;
            Boolean bool6 = this.contains_audio_episodes;
            ProtoPlaylistResponse protoPlaylistResponse3 = protoPlaylistResponse;
            Boolean bool7 = this.contains_tracks;
            Boolean bool8 = this.is_on_demand_in_free;
            Boolean bool9 = bool8;
            Boolean bool10 = bool8;
            Integer num4 = this.number_of_tracks;
            Integer num5 = num4;
            ProtoPlaylistResponse protoPlaylistResponse4 = new ProtoPlaylistResponse(list, protoPlaylistHeader, num, num2, l, bool, l2, num3, list2, bool2, bool3, bool4, bool5, bool6, bool7, bool10, num4, this.number_of_episodes, super.buildUnknownFields());
            return protoPlaylistResponse4;
        }

        public final Builder contains_audio_episodes(Boolean bool) {
            this.contains_audio_episodes = bool;
            return this;
        }

        public final Builder contains_episodes(Boolean bool) {
            this.contains_episodes = bool;
            return this;
        }

        public final Builder contains_spotify_tracks(Boolean bool) {
            this.contains_spotify_tracks = bool;
            return this;
        }

        public final Builder contains_tracks(Boolean bool) {
            this.contains_tracks = bool;
            return this;
        }

        public final Builder duration(Long l) {
            this.duration = l;
            return this;
        }

        public final Builder has_explicit_content(Boolean bool) {
            this.has_explicit_content = bool;
            return this;
        }

        public final Builder is_on_demand_in_free(Boolean bool) {
            this.is_on_demand_in_free = bool;
            return this;
        }

        public final Builder item(List<ProtoPlaylistItem> list) {
            whk.a(list);
            this.item = list;
            return this;
        }

        public final Builder last_modification(Long l) {
            this.last_modification = l;
            return this;
        }

        public final Builder loading_contents(Boolean bool) {
            this.loading_contents = bool;
            return this;
        }

        public final Builder num_followers(Integer num) {
            this.num_followers = num;
            return this;
        }

        public final Builder number_of_episodes(Integer num) {
            this.number_of_episodes = num;
            return this;
        }

        public final Builder number_of_tracks(Integer num) {
            this.number_of_tracks = num;
            return this;
        }

        public final Builder only_contains_explicit(Boolean bool) {
            this.only_contains_explicit = bool;
            return this;
        }

        public final Builder playlist(ProtoPlaylistHeader protoPlaylistHeader) {
            this.playlist = protoPlaylistHeader;
            return this;
        }

        public final Builder recommendations(List<ProtoRecommendationItem> list) {
            whk.a(list);
            this.recommendations = list;
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
    }

    static final class a extends ProtoAdapter<ProtoPlaylistResponse> {
        a() {
            super(FieldEncoding.LENGTH_DELIMITED, ProtoPlaylistResponse.class);
        }

        public final /* synthetic */ int a(Object obj) {
            ProtoPlaylistResponse protoPlaylistResponse = (ProtoPlaylistResponse) obj;
            int i = 0;
            int a = ProtoPlaylistItem.ADAPTER.a().a(1, protoPlaylistResponse.item) + (protoPlaylistResponse.playlist != null ? ProtoPlaylistHeader.ADAPTER.a(2, protoPlaylistResponse.playlist) : 0) + (protoPlaylistResponse.unfiltered_length != null ? ProtoAdapter.c.a(3, protoPlaylistResponse.unfiltered_length) : 0) + (protoPlaylistResponse.unranged_length != null ? ProtoAdapter.c.a(4, protoPlaylistResponse.unranged_length) : 0) + (protoPlaylistResponse.duration != null ? ProtoAdapter.f.a(5, protoPlaylistResponse.duration) : 0) + (protoPlaylistResponse.loading_contents != null ? ProtoAdapter.a.a(6, protoPlaylistResponse.loading_contents) : 0) + (protoPlaylistResponse.last_modification != null ? ProtoAdapter.f.a(7, protoPlaylistResponse.last_modification) : 0) + (protoPlaylistResponse.num_followers != null ? ProtoAdapter.c.a(8, protoPlaylistResponse.num_followers) : 0) + ProtoRecommendationItem.ADAPTER.a().a(10, protoPlaylistResponse.recommendations) + (protoPlaylistResponse.has_explicit_content != null ? ProtoAdapter.a.a(11, protoPlaylistResponse.has_explicit_content) : 0) + (protoPlaylistResponse.contains_spotify_tracks != null ? ProtoAdapter.a.a(12, protoPlaylistResponse.contains_spotify_tracks) : 0) + (protoPlaylistResponse.contains_episodes != null ? ProtoAdapter.a.a(13, protoPlaylistResponse.contains_episodes) : 0) + (protoPlaylistResponse.only_contains_explicit != null ? ProtoAdapter.a.a(14, protoPlaylistResponse.only_contains_explicit) : 0) + (protoPlaylistResponse.contains_audio_episodes != null ? ProtoAdapter.a.a(15, protoPlaylistResponse.contains_audio_episodes) : 0) + (protoPlaylistResponse.contains_tracks != null ? ProtoAdapter.a.a(16, protoPlaylistResponse.contains_tracks) : 0) + (protoPlaylistResponse.is_on_demand_in_free != null ? ProtoAdapter.a.a(17, protoPlaylistResponse.is_on_demand_in_free) : 0) + (protoPlaylistResponse.number_of_tracks != null ? ProtoAdapter.c.a(18, protoPlaylistResponse.number_of_tracks) : 0);
            if (protoPlaylistResponse.number_of_episodes != null) {
                i = ProtoAdapter.c.a(19, protoPlaylistResponse.number_of_episodes);
            }
            return a + i + protoPlaylistResponse.a().h();
        }

        public final /* synthetic */ Object a(whg whg) {
            Builder builder = new Builder();
            long a = whg.a();
            while (true) {
                int b = whg.b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            builder.item.add(ProtoPlaylistItem.ADAPTER.a(whg));
                            break;
                        case 2:
                            builder.playlist((ProtoPlaylistHeader) ProtoPlaylistHeader.ADAPTER.a(whg));
                            break;
                        case 3:
                            builder.unfiltered_length((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 4:
                            builder.unranged_length((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 5:
                            builder.duration((Long) ProtoAdapter.f.a(whg));
                            break;
                        case 6:
                            builder.loading_contents((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 7:
                            builder.last_modification((Long) ProtoAdapter.f.a(whg));
                            break;
                        case 8:
                            builder.num_followers((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 10:
                            builder.recommendations.add(ProtoRecommendationItem.ADAPTER.a(whg));
                            break;
                        case 11:
                            builder.has_explicit_content((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 12:
                            builder.contains_spotify_tracks((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 13:
                            builder.contains_episodes((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 14:
                            builder.only_contains_explicit((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 15:
                            builder.contains_audio_episodes((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 16:
                            builder.contains_tracks((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 17:
                            builder.is_on_demand_in_free((Boolean) ProtoAdapter.a.a(whg));
                            break;
                        case 18:
                            builder.number_of_tracks((Integer) ProtoAdapter.c.a(whg));
                            break;
                        case 19:
                            builder.number_of_episodes((Integer) ProtoAdapter.c.a(whg));
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
            ProtoPlaylistResponse protoPlaylistResponse = (ProtoPlaylistResponse) obj;
            ProtoPlaylistItem.ADAPTER.a().a(whh, 1, protoPlaylistResponse.item);
            if (protoPlaylistResponse.playlist != null) {
                ProtoPlaylistHeader.ADAPTER.a(whh, 2, protoPlaylistResponse.playlist);
            }
            if (protoPlaylistResponse.unfiltered_length != null) {
                ProtoAdapter.c.a(whh, 3, protoPlaylistResponse.unfiltered_length);
            }
            if (protoPlaylistResponse.unranged_length != null) {
                ProtoAdapter.c.a(whh, 4, protoPlaylistResponse.unranged_length);
            }
            if (protoPlaylistResponse.duration != null) {
                ProtoAdapter.f.a(whh, 5, protoPlaylistResponse.duration);
            }
            if (protoPlaylistResponse.loading_contents != null) {
                ProtoAdapter.a.a(whh, 6, protoPlaylistResponse.loading_contents);
            }
            if (protoPlaylistResponse.last_modification != null) {
                ProtoAdapter.f.a(whh, 7, protoPlaylistResponse.last_modification);
            }
            if (protoPlaylistResponse.num_followers != null) {
                ProtoAdapter.c.a(whh, 8, protoPlaylistResponse.num_followers);
            }
            ProtoRecommendationItem.ADAPTER.a().a(whh, 10, protoPlaylistResponse.recommendations);
            if (protoPlaylistResponse.has_explicit_content != null) {
                ProtoAdapter.a.a(whh, 11, protoPlaylistResponse.has_explicit_content);
            }
            if (protoPlaylistResponse.contains_spotify_tracks != null) {
                ProtoAdapter.a.a(whh, 12, protoPlaylistResponse.contains_spotify_tracks);
            }
            if (protoPlaylistResponse.contains_episodes != null) {
                ProtoAdapter.a.a(whh, 13, protoPlaylistResponse.contains_episodes);
            }
            if (protoPlaylistResponse.only_contains_explicit != null) {
                ProtoAdapter.a.a(whh, 14, protoPlaylistResponse.only_contains_explicit);
            }
            if (protoPlaylistResponse.contains_audio_episodes != null) {
                ProtoAdapter.a.a(whh, 15, protoPlaylistResponse.contains_audio_episodes);
            }
            if (protoPlaylistResponse.contains_tracks != null) {
                ProtoAdapter.a.a(whh, 16, protoPlaylistResponse.contains_tracks);
            }
            if (protoPlaylistResponse.is_on_demand_in_free != null) {
                ProtoAdapter.a.a(whh, 17, protoPlaylistResponse.is_on_demand_in_free);
            }
            if (protoPlaylistResponse.number_of_tracks != null) {
                ProtoAdapter.c.a(whh, 18, protoPlaylistResponse.number_of_tracks);
            }
            if (protoPlaylistResponse.number_of_episodes != null) {
                ProtoAdapter.c.a(whh, 19, protoPlaylistResponse.number_of_episodes);
            }
            whh.a(protoPlaylistResponse.a());
        }
    }

    static {
        Integer valueOf = Integer.valueOf(0);
        DEFAULT_UNFILTERED_LENGTH = valueOf;
        DEFAULT_UNRANGED_LENGTH = valueOf;
        Long valueOf2 = Long.valueOf(0);
        DEFAULT_DURATION = valueOf2;
        DEFAULT_LAST_MODIFICATION = valueOf2;
        DEFAULT_NUM_FOLLOWERS = valueOf;
        DEFAULT_NUMBER_OF_TRACKS = valueOf;
        DEFAULT_NUMBER_OF_EPISODES = valueOf;
    }

    public ProtoPlaylistResponse(List<ProtoPlaylistItem> list, ProtoPlaylistHeader protoPlaylistHeader, Integer num, Integer num2, Long l, Boolean bool, Long l2, Integer num3, List<ProtoRecommendationItem> list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num4, Integer num5, ByteString byteString) {
        super(ADAPTER, byteString);
        List<ProtoPlaylistItem> list3 = list;
        this.item = whk.a("item", list);
        this.playlist = protoPlaylistHeader;
        this.unfiltered_length = num;
        this.unranged_length = num2;
        this.duration = l;
        this.loading_contents = bool;
        this.last_modification = l2;
        this.num_followers = num3;
        List<ProtoRecommendationItem> list4 = list2;
        this.recommendations = whk.a("recommendations", list2);
        this.has_explicit_content = bool2;
        this.contains_spotify_tracks = bool3;
        this.contains_episodes = bool4;
        this.only_contains_explicit = bool5;
        this.contains_audio_episodes = bool6;
        this.contains_tracks = bool7;
        this.is_on_demand_in_free = bool8;
        this.number_of_tracks = num4;
        this.number_of_episodes = num5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProtoPlaylistResponse)) {
            return false;
        }
        ProtoPlaylistResponse protoPlaylistResponse = (ProtoPlaylistResponse) obj;
        return a().equals(protoPlaylistResponse.a()) && this.item.equals(protoPlaylistResponse.item) && whk.a((Object) this.playlist, (Object) protoPlaylistResponse.playlist) && whk.a((Object) this.unfiltered_length, (Object) protoPlaylistResponse.unfiltered_length) && whk.a((Object) this.unranged_length, (Object) protoPlaylistResponse.unranged_length) && whk.a((Object) this.duration, (Object) protoPlaylistResponse.duration) && whk.a((Object) this.loading_contents, (Object) protoPlaylistResponse.loading_contents) && whk.a((Object) this.last_modification, (Object) protoPlaylistResponse.last_modification) && whk.a((Object) this.num_followers, (Object) protoPlaylistResponse.num_followers) && this.recommendations.equals(protoPlaylistResponse.recommendations) && whk.a((Object) this.has_explicit_content, (Object) protoPlaylistResponse.has_explicit_content) && whk.a((Object) this.contains_spotify_tracks, (Object) protoPlaylistResponse.contains_spotify_tracks) && whk.a((Object) this.contains_episodes, (Object) protoPlaylistResponse.contains_episodes) && whk.a((Object) this.only_contains_explicit, (Object) protoPlaylistResponse.only_contains_explicit) && whk.a((Object) this.contains_audio_episodes, (Object) protoPlaylistResponse.contains_audio_episodes) && whk.a((Object) this.contains_tracks, (Object) protoPlaylistResponse.contains_tracks) && whk.a((Object) this.is_on_demand_in_free, (Object) protoPlaylistResponse.is_on_demand_in_free) && whk.a((Object) this.number_of_tracks, (Object) protoPlaylistResponse.number_of_tracks) && whk.a((Object) this.number_of_episodes, (Object) protoPlaylistResponse.number_of_episodes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((a().hashCode() * 37) + this.item.hashCode()) * 37;
        ProtoPlaylistHeader protoPlaylistHeader = this.playlist;
        int i2 = 0;
        int hashCode2 = (hashCode + (protoPlaylistHeader != null ? protoPlaylistHeader.hashCode() : 0)) * 37;
        Integer num = this.unfiltered_length;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.unranged_length;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Long l = this.duration;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 37;
        Boolean bool = this.loading_contents;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l2 = this.last_modification;
        int hashCode7 = (hashCode6 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num3 = this.num_followers;
        int hashCode8 = (((hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37) + this.recommendations.hashCode()) * 37;
        Boolean bool2 = this.has_explicit_content;
        int hashCode9 = (hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.contains_spotify_tracks;
        int hashCode10 = (hashCode9 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.contains_episodes;
        int hashCode11 = (hashCode10 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.only_contains_explicit;
        int hashCode12 = (hashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.contains_audio_episodes;
        int hashCode13 = (hashCode12 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.contains_tracks;
        int hashCode14 = (hashCode13 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.is_on_demand_in_free;
        int hashCode15 = (hashCode14 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Integer num4 = this.number_of_tracks;
        int hashCode16 = (hashCode15 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.number_of_episodes;
        if (num5 != null) {
            i2 = num5.hashCode();
        }
        int i3 = hashCode16 + i2;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.item.isEmpty()) {
            String str = "tms=i,e";
            sb.append(", item=");
            sb.append(this.item);
        }
        if (this.playlist != null) {
            String str2 = "ly=mptsail,";
            sb.append(", playlist=");
            sb.append(this.playlist);
        }
        if (this.unfiltered_length != null) {
            sb.append(", unfiltered_length=");
            sb.append(this.unfiltered_length);
        }
        if (this.unranged_length != null) {
            String str3 = "=rtnoe,dh_alnengug";
            sb.append(", unranged_length=");
            sb.append(this.unranged_length);
        }
        if (this.duration != null) {
            String str4 = ", uniboadtr";
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.loading_contents != null) {
            sb.append(", loading_contents=");
            sb.append(this.loading_contents);
        }
        if (this.last_modification != null) {
            sb.append(", last_modification=");
            sb.append(this.last_modification);
        }
        if (this.num_followers != null) {
            String str5 = "o=lfsubeml_n rwo";
            sb.append(", num_followers=");
            sb.append(this.num_followers);
        }
        if (!this.recommendations.isEmpty()) {
            String str6 = "nt=d,oitommcrn see";
            sb.append(", recommendations=");
            sb.append(this.recommendations);
        }
        if (this.has_explicit_content != null) {
            sb.append(", has_explicit_content=");
            sb.append(this.has_explicit_content);
        }
        if (this.contains_spotify_tracks != null) {
            sb.append(", contains_spotify_tracks=");
            sb.append(this.contains_spotify_tracks);
        }
        if (this.contains_episodes != null) {
            sb.append(", contains_episodes=");
            sb.append(this.contains_episodes);
        }
        if (this.only_contains_explicit != null) {
            String str7 = "l_nai,iop=tsixyo ecntcp_n";
            sb.append(", only_contains_explicit=");
            sb.append(this.only_contains_explicit);
        }
        if (this.contains_audio_episodes != null) {
            sb.append(", contains_audio_episodes=");
            sb.append(this.contains_audio_episodes);
        }
        if (this.contains_tracks != null) {
            String str8 = "n_cns=tort cita,sa";
            sb.append(", contains_tracks=");
            sb.append(this.contains_tracks);
        }
        if (this.is_on_demand_in_free != null) {
            String str9 = "n_seoma_n,sdr_ndiie _fe";
            sb.append(", is_on_demand_in_free=");
            sb.append(this.is_on_demand_in_free);
        }
        if (this.number_of_tracks != null) {
            String str10 = "s,umtr_kcnebamf _o=";
            sb.append(", number_of_tracks=");
            sb.append(this.number_of_tracks);
        }
        if (this.number_of_episodes != null) {
            sb.append(", number_of_episodes=");
            sb.append(this.number_of_episodes);
        }
        String str11 = "{estoRspoPyolilnseraoP";
        StringBuilder replace = sb.replace(0, 2, "ProtoPlaylistResponse{");
        replace.append('}');
        return replace.toString();
    }
}
