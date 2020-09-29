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
    private final jyg b;
    private final rwi c;
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
        private final SortOrderLruCache<hfv, String> mSortMap;

        @JsonCreator
        public SortingModel(@JsonProperty("map") SortOrderLruCache<hfv, String> sortOrderLruCache) {
            this.mSortMap = sortOrderLruCache;
        }

        public SortOrderLruCache<hfv, String> getMap() {
            return this.mSortMap;
        }
    }

    public EntitySorting(Context context, jyg jyg, rwl rwl) {
        this.a = context;
        this.c = new rwi(rwl) {
            public final rwj a(rwj rwj) {
                return rwj.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        this.b = jyg;
    }

    private static hfv a(String str) {
        hfv hfv = new hfv(str);
        if (hfv.a() == null) {
            StringBuilder sb = new StringBuilder("Uri ");
            sb.append(str);
            String str2 = "lpsd/uodn.nsaiir tpv use";
            sb.append(" is invalid/unsupported.");
            Assertion.b(sb.toString());
        }
        return hfv;
    }

    private SortingModel b() {
        SortingModel sortingModel = this.d;
        if (sortingModel != null && sortingModel.getMap() != null) {
            return this.d;
        }
        String str = "";
        String a2 = this.b.b(this.a).a(a(), "");
        if (!TextUtils.isEmpty(a2)) {
            try {
                Class<SortingModel> cls = SortingModel.class;
                this.d = (SortingModel) this.c.a().readValue(a2, SortingModel.class);
            } catch (IOException unused) {
                String str2 = "cgrmfolsma  esFrotneo ie idfi ttth";
                Assertion.b("Failed to fetch sorting for items.");
            }
        }
        SortingModel sortingModel2 = this.d;
        if (sortingModel2 == null || sortingModel2.getMap() == null) {
            this.d = new SortingModel(new SortOrderLruCache(1000));
        }
        return this.d;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, way way) {
        return way != null && str.equals(way.a());
    }

    /* access modifiers changed from: protected */
    public abstract b<Object, String> a();

    public way a(String str, way way, List<way> list) {
        String str2 = (String) b().getMap().get(a(str));
        if (str2 == null) {
            return way;
        }
        int lastIndexOf = str2.lastIndexOf(" REVERSE");
        boolean z = false;
        if (lastIndexOf > 0) {
            str2 = str2.substring(0, lastIndexOf);
            z = true;
        }
        Optional c2 = fcp.a((Iterable<E>) list).c(new fbq(str2) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean apply(Object obj) {
                return EntitySorting.b(this.f$0, (way) obj);
            }
        });
        return !c2.b() ? way : ((way) c2.c()).d().a(z).a();
    }

    public void a(String str, way way) {
        String str2;
        SortingModel b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append(way.a());
        if (way.b()) {
            str2 = " REVERSE";
        } else {
            String str3 = "";
            str2 = "";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        hfv a2 = a(str);
        SortOrderLruCache map = b2.getMap();
        map.remove(a2);
        map.put(a2, sb2);
        String str4 = null;
        try {
            str4 = this.c.a().writeValueAsString(b2);
        } catch (JsonProcessingException e) {
            String str5 = "id toi gsriresn Fmelt ao oetortfwi ";
            StringBuilder sb3 = new StringBuilder("Failed to write sorting for items: ");
            sb3.append(e);
            Assertion.b(sb3.toString());
        }
        if (str4 != null) {
            this.b.b(this.a).a().a(a(), str4).b();
        }
    }
}
