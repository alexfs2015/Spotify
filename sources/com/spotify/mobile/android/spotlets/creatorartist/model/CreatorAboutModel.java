package com.spotify.mobile.android.spotlets.creatorartist.model;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.List;

@JsonDeserialize(builder = Builder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CreatorAboutModel implements Parcelable, JacksonModel {

    public static abstract class Builder implements JacksonModel {
        /* access modifiers changed from: 0000 */
        public abstract CreatorAboutModel autoBuild();

        @JsonProperty("autobiography")
        public abstract Builder autobiography(Autobiography autobiography);

        @JsonProperty("biography")
        public abstract Builder biography(String str);

        /* access modifiers changed from: 0000 */
        public abstract Optional<Integer> globalChartPosition();

        @JsonProperty("globalChartPosition")
        public abstract Builder globalChartPosition(int i);

        /* access modifiers changed from: 0000 */
        public abstract Optional<List<ImageModel>> images();

        @JsonProperty("images")
        public abstract Builder images(List<ImageModel> list);

        @JsonProperty("mainImageUrl")
        public abstract Builder mainImageUrl(String str);

        /* access modifiers changed from: 0000 */
        public abstract Optional<Integer> monthlyListeners();

        @JsonProperty("monthlyListeners")
        public abstract Builder monthlyListeners(int i);

        @JsonProperty("name")
        public abstract Builder name(String str);

        @JsonCreator
        public static Builder create() {
            return new Builder();
        }

        public CreatorAboutModel build() {
            if (!images().b()) {
                images(Collections.emptyList());
            }
            if (!monthlyListeners().b()) {
                monthlyListeners(0);
            }
            if (!globalChartPosition().b()) {
                globalChartPosition(0);
            }
            return autoBuild();
        }
    }

    static final class a extends upv<ImageModel> {
        protected a() {
            super(CreatorAboutModel.getCreator());
        }
    }

    public abstract Autobiography autobiography();

    public abstract String biography();

    public abstract int globalChartPosition();

    public abstract List<ImageModel> images();

    public abstract String mainImageUrl();

    public abstract int monthlyListeners();

    public abstract String name();

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    public static Creator<? extends ImageModel> getCreator() {
        return AutoValue_ImageModel.CREATOR;
    }
}
