package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.wrapped2019.v1.proto.RankedEntity;
import com.spotify.wrapped2019.v1.proto.RankedEntityList;
import java.util.ArrayList;
import java.util.List;

public abstract class TopPodcastsTop implements Parcelable, JacksonModel {
    @JsonCreator
    public static TopPodcastsTop create(@JsonProperty("caption") String str, @JsonProperty("podcasts") List<Podcast> list) {
        return new AutoValue_TopPodcastsTop(str, list);
    }

    public static TopPodcastsTop fromProto(RankedEntityList rankedEntityList) {
        return create(rankedEntityList.d, podcastListFromProto(rankedEntityList.e));
    }

    private static List<Podcast> podcastListFromProto(List<RankedEntity> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (RankedEntity fromProto : list) {
            arrayList.add(Podcast.fromProto(fromProto));
        }
        return arrayList;
    }

    @JsonProperty("caption")
    public abstract String caption();

    @JsonProperty("podcasts")
    public abstract List<Podcast> podcasts();
}
