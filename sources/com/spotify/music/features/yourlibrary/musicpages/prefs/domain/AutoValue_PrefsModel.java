package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

final class AutoValue_PrefsModel extends PrefsModel {
    private final List<PagePrefs> pagePrefs;

    static final class a extends com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.a {
        private List<PagePrefs> a;

        /* synthetic */ a(PrefsModel prefsModel, byte b) {
            this(prefsModel);
        }

        a() {
        }

        private a(PrefsModel prefsModel) {
            this.a = prefsModel.pagePrefs();
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.a a(List<PagePrefs> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null pagePrefs");
        }

        public final PrefsModel a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" pagePrefs");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PrefsModel(this.a);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private AutoValue_PrefsModel(List<PagePrefs> list) {
        this.pagePrefs = list;
    }

    @JsonProperty("page_prefs")
    public final List<PagePrefs> pagePrefs() {
        return this.pagePrefs;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrefsModel{pagePrefs=");
        sb.append(this.pagePrefs);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrefsModel)) {
            return false;
        }
        return this.pagePrefs.equals(((PrefsModel) obj).pagePrefs());
    }

    public final int hashCode() {
        return this.pagePrefs.hashCode() ^ 1000003;
    }

    public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel.a toBuilder() {
        return new a(this, 0);
    }
}
