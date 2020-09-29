package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;

/* renamed from: mww reason: default package */
public abstract class mww {
    @JsonCreator
    public static mww create(@JsonProperty("id") String str, @JsonProperty("view_type") FeedItemDataType feedItemDataType, @JsonProperty("music_release") mwz mwz, @JsonProperty("follow_recs") mwy mwy) {
        return new mwq(str, feedItemDataType, mwz, mwy);
    }

    public abstract String a();

    public abstract FeedItemDataType b();

    public abstract mwz c();

    public abstract mwy d();
}
