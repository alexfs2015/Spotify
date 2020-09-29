package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.yourlibrary.musicpages.datasource.SortOrder;
import java.util.Map;

final class AutoValue_PagePrefs extends PagePrefs {
    private final SortOrder activeSortOrder;
    private final Map<String, Boolean> filterStates;
    private final Map<String, String> options;
    private final Long timestamp;
    private final String uri;

    static final class a extends com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a {
        private String a;
        private Long b;
        private SortOrder c;
        private Map<String, Boolean> d;
        private Map<String, String> e;

        /* synthetic */ a(PagePrefs pagePrefs, byte b2) {
            this(pagePrefs);
        }

        a() {
        }

        private a(PagePrefs pagePrefs) {
            this.a = pagePrefs.uri();
            this.b = pagePrefs.timestamp();
            this.c = pagePrefs.activeSortOrder();
            this.d = pagePrefs.filterStates();
            this.e = pagePrefs.options();
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a a(Long l) {
            this.b = l;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a a(SortOrder sortOrder) {
            this.c = sortOrder;
            return this;
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a a(Map<String, Boolean> map) {
            if (map != null) {
                this.d = map;
                return this;
            }
            throw new NullPointerException("Null filterStates");
        }

        public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a b(Map<String, String> map) {
            if (map != null) {
                this.e = map;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        public final PagePrefs a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" filterStates");
                str = sb2.toString();
            }
            if (this.e == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" options");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                AutoValue_PagePrefs autoValue_PagePrefs = new AutoValue_PagePrefs(this.a, this.b, this.c, this.d, this.e);
                return autoValue_PagePrefs;
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private AutoValue_PagePrefs(String str, Long l, SortOrder sortOrder, Map<String, Boolean> map, Map<String, String> map2) {
        this.uri = str;
        this.timestamp = l;
        this.activeSortOrder = sortOrder;
        this.filterStates = map;
        this.options = map2;
    }

    @JsonProperty("uri")
    public final String uri() {
        return this.uri;
    }

    @JsonProperty("timestamp")
    public final Long timestamp() {
        return this.timestamp;
    }

    @JsonProperty("active_sort_order")
    public final SortOrder activeSortOrder() {
        return this.activeSortOrder;
    }

    @JsonProperty("filter_states")
    public final Map<String, Boolean> filterStates() {
        return this.filterStates;
    }

    @JsonProperty("options")
    public final Map<String, String> options() {
        return this.options;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagePrefs{uri=");
        sb.append(this.uri);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", activeSortOrder=");
        sb.append(this.activeSortOrder);
        sb.append(", filterStates=");
        sb.append(this.filterStates);
        sb.append(", options=");
        sb.append(this.options);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PagePrefs) {
            PagePrefs pagePrefs = (PagePrefs) obj;
            if (this.uri.equals(pagePrefs.uri())) {
                Long l = this.timestamp;
                if (l != null ? l.equals(pagePrefs.timestamp()) : pagePrefs.timestamp() == null) {
                    SortOrder sortOrder = this.activeSortOrder;
                    if (sortOrder != null ? sortOrder.equals(pagePrefs.activeSortOrder()) : pagePrefs.activeSortOrder() == null) {
                        return this.filterStates.equals(pagePrefs.filterStates()) && this.options.equals(pagePrefs.options());
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.uri.hashCode() ^ 1000003) * 1000003;
        Long l = this.timestamp;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        SortOrder sortOrder = this.activeSortOrder;
        if (sortOrder != null) {
            i = sortOrder.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.filterStates.hashCode()) * 1000003) ^ this.options.hashCode();
    }

    public final com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs.a toBuilder() {
        return new a(this, 0);
    }
}
