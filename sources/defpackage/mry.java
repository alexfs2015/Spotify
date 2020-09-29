package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.music.features.followfeed.network.models.FeedItemDataType;
import java.util.List;

/* renamed from: mry reason: default package */
public abstract class mry {
    public abstract String a();

    public abstract FeedItemDataType b();

    public abstract Optional<String> c();

    public abstract Optional<String> d();

    public abstract List<mrr> e();

    public abstract Optional<String> f();

    public abstract Optional<String> g();

    public abstract Optional<String> h();

    public abstract Optional<String> i();

    public abstract Optional<Boolean> j();

    public abstract List<msc> k();

    public abstract Optional<String> l();

    @JsonCreator
    public static mry create(@JsonProperty("id") String str, @JsonProperty("type") FeedItemDataType feedItemDataType, @JsonProperty("artist_pick_message") Optional<String> optional, @JsonProperty("release_date") Optional<String> optional2, @JsonProperty("artists") List<mrr> list, @JsonProperty("title") Optional<String> optional3, @JsonProperty("subtitle") Optional<String> optional4, @JsonProperty("image_url") Optional<String> optional5, @JsonProperty("entity_uri") Optional<String> optional6, @JsonProperty("played") Optional<Boolean> optional7, @JsonProperty("tracks") List<msc> list2, @JsonProperty("section_title") Optional<String> optional8) {
        mrt mrt = new mrt(str, feedItemDataType, optional, optional2, list, optional3, optional4, optional5, optional6, optional7, list2, optional8);
        return mrt;
    }
}
