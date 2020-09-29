package com.spotify.mobile.android.util;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public abstract class EntitySorting {
    private final Context a;
    private final jvy b;
    private final rnc c;
    private SortingModel d;

    static class SortOrderLruCache<A, B> extends LinkedHashMap<A, B> implements JacksonModel {
        private static final long serialVersionUID = -6935808408745498897L;
        private final int mMaxEntries;

        @JsonCreator
        public SortOrderLruCache() {
            this(1000);
        }

        public SortOrderLruCache(int i) {
            super(Math.max(i + 1, 0), 1.0f, true);
            this.mMaxEntries = i;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Entry<A, B> entry) {
            return size() > this.mMaxEntries;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class SortingModel implements JacksonModel {
        @JsonProperty("map")
        private final SortOrderLruCache<String, String> mSortMap;

        @JsonCreator
        public SortingModel(@JsonProperty("map") SortOrderLruCache<String, String> sortOrderLruCache) {
            this.mSortMap = sortOrderLruCache;
        }

        public SortOrderLruCache<String, String> getMap() {
            return this.mSortMap;
        }
    }

    /* access modifiers changed from: protected */
    public abstract b<Object, String> a();

    public EntitySorting(Context context, jvy jvy, rnf rnf) {
        this.a = context;
        this.c = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        this.b = jvy;
    }

    private SortingModel b() {
        SortingModel sortingModel = this.d;
        if (sortingModel != null && sortingModel.getMap() != null) {
            return this.d;
        }
        String a2 = this.b.b(this.a).a(a(), "");
        if (!TextUtils.isEmpty(a2)) {
            try {
                this.d = (SortingModel) this.c.a().readValue(a2, SortingModel.class);
            } catch (IOException unused) {
                Assertion.b("Failed to fetch sorting for items.");
            }
        }
        SortingModel sortingModel2 = this.d;
        if (sortingModel2 == null || sortingModel2.getMap() == null) {
            this.d = new SortingModel(new SortOrderLruCache(1000));
        }
        return this.d;
    }

    @Deprecated
    public final void a(String str, String str2) {
        String str3;
        SortingModel b2 = b();
        SortOrderLruCache map = b2.getMap();
        map.remove(str);
        map.put(str, str2);
        try {
            str3 = this.c.a().writeValueAsString(b2);
        } catch (JsonProcessingException e) {
            StringBuilder sb = new StringBuilder("Failed to write sorting for items: ");
            sb.append(e);
            Assertion.b(sb.toString());
            str3 = null;
        }
        if (str3 != null) {
            this.b.b(this.a).a().a(a(), str3).b();
        }
    }

    @Deprecated
    public final SortOption a(String str, SortOption sortOption, List<SortOption> list) {
        return (SortOption) jtc.a(SortOption.a((String) b().getMap().get(str), list), sortOption);
    }
}
