package com.spotify.mobile.android.playlist.sorting;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
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
        private final SortOrderLruCache<hcz, String> mSortMap;

        @JsonCreator
        public SortingModel(@JsonProperty("map") SortOrderLruCache<hcz, String> sortOrderLruCache) {
            this.mSortMap = sortOrderLruCache;
        }

        public SortOrderLruCache<hcz, String> getMap() {
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

    public void a(String str, vns vns) {
        SortingModel b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append(vns.a());
        sb.append(vns.b() ? " REVERSE" : "");
        String sb2 = sb.toString();
        hcz a2 = a(str);
        SortOrderLruCache map = b2.getMap();
        map.remove(a2);
        map.put(a2, sb2);
        String str2 = null;
        try {
            str2 = this.c.a().writeValueAsString(b2);
        } catch (JsonProcessingException e) {
            StringBuilder sb3 = new StringBuilder("Failed to write sorting for items: ");
            sb3.append(e);
            Assertion.b(sb3.toString());
        }
        if (str2 != null) {
            this.b.b(this.a).a().a(a(), str2).b();
        }
    }

    public vns a(String str, vns vns, List<vns> list) {
        String str2 = (String) b().getMap().get(a(str));
        if (str2 == null) {
            return vns;
        }
        int lastIndexOf = str2.lastIndexOf(" REVERSE");
        boolean z = false;
        if (lastIndexOf > 0) {
            str2 = str2.substring(0, lastIndexOf);
            z = true;
        }
        Optional c2 = fbx.a((Iterable<E>) list).c(new faz(str2) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean apply(Object obj) {
                return EntitySorting.b(this.f$0, (vns) obj);
            }
        });
        if (!c2.b()) {
            return vns;
        }
        return ((vns) c2.c()).d().a(z).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, vns vns) {
        return vns != null && str.equals(vns.a());
    }

    private static hcz a(String str) {
        hcz hcz = new hcz(str);
        if (hcz.a() == null) {
            StringBuilder sb = new StringBuilder("Uri ");
            sb.append(str);
            sb.append(" is invalid/unsupported.");
            Assertion.b(sb.toString());
        }
        return hcz;
    }
}
