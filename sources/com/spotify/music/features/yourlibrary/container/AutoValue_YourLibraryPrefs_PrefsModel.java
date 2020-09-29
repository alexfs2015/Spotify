package com.spotify.music.features.yourlibrary.container;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PageIdSerializer;
import com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

final class AutoValue_YourLibraryPrefs_PrefsModel extends PrefsModel {
    private final Optional<YourLibraryPageId> focusedPageId;
    private final long timestamp;

    static final class a extends com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a {
        private Long a;
        private Optional<YourLibraryPageId> b;

        a() {
            this.b = Optional.e();
        }

        private a(PrefsModel prefsModel) {
            this.b = Optional.e();
            this.a = Long.valueOf(prefsModel.timestamp());
            this.b = prefsModel.focusedPageId();
        }

        /* synthetic */ a(PrefsModel prefsModel, byte b2) {
            this(prefsModel);
        }

        public final com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a a(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public final com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a a(Optional<YourLibraryPageId> optional) {
            if (optional != null) {
                this.b = optional;
                return this;
            }
            throw new NullPointerException("Null focusedPageId");
        }

        public final PrefsModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" timestamp");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_YourLibraryPrefs_PrefsModel(this.a.longValue(), this.b);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_YourLibraryPrefs_PrefsModel(long j, Optional<YourLibraryPageId> optional) {
        this.timestamp = j;
        this.focusedPageId = optional;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PrefsModel) {
            PrefsModel prefsModel = (PrefsModel) obj;
            return this.timestamp == prefsModel.timestamp() && this.focusedPageId.equals(prefsModel.focusedPageId());
        }
    }

    @JsonProperty("focused_page_id")
    @JsonSerialize(using = PageIdSerializer.class)
    public final Optional<YourLibraryPageId> focusedPageId() {
        return this.focusedPageId;
    }

    public final int hashCode() {
        long j = this.timestamp;
        return this.focusedPageId.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    @JsonProperty("timestamp")
    public final long timestamp() {
        return this.timestamp;
    }

    public final com.spotify.music.features.yourlibrary.container.YourLibraryPrefs.PrefsModel.a toBuilder() {
        return new a(this, 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrefsModel{timestamp=");
        sb.append(this.timestamp);
        sb.append(", focusedPageId=");
        sb.append(this.focusedPageId);
        sb.append("}");
        return sb.toString();
    }
}
