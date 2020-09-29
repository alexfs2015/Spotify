package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering.a;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.BehaviorSubject;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class MusicPagesFiltering {
    public final BehaviorSubject<a> a;
    private final qww b;
    private final rnc c;
    private final Observable<String> d;
    private final Scheduler e;
    private final int f;
    private Observable<String> g;
    private String h;
    private FilteringModel i;

    static class FilteringLruCache<A, B> extends LinkedHashMap<A, B> implements JacksonModel {
        private static final long serialVersionUID = 5725615578088416848L;
        private int mMaxEntries;

        @JsonCreator
        public FilteringLruCache() {
            this(100);
        }

        FilteringLruCache(int i) {
            super(i, 1.0f, true);
            this.mMaxEntries = i;
        }

        /* access modifiers changed from: protected */
        public boolean removeEldestEntry(Entry<A, B> entry) {
            return size() > this.mMaxEntries;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class FilteringModel implements JacksonModel {
        @JsonProperty("states")
        private final FilteringLruCache<String, Map<String, Boolean>> mFilterMap;

        @JsonCreator
        public FilteringModel(@JsonProperty("states") FilteringLruCache<String, Map<String, Boolean>> filteringLruCache) {
            this.mFilterMap = filteringLruCache;
        }

        public FilteringLruCache<String, Map<String, Boolean>> getMap() {
            return this.mFilterMap;
        }

        public ImmutableMap<String, Boolean> getFilterState(String str) {
            return ImmutableMap.a((Map) fav.a(this.mFilterMap.get(str), ImmutableMap.f()));
        }

        public void setFilterState(String str, String str2, Boolean bool) {
            Map map = (Map) this.mFilterMap.get(str);
            if (map == null) {
                map = new HashMap();
                this.mFilterMap.put(str, map);
            }
            map.put(str2, bool);
        }
    }

    public static abstract class a {
        /* access modifiers changed from: private */
        public static final a a;

        public abstract String a();

        public abstract String b();

        public abstract Boolean c();

        protected a() {
        }

        static {
            String str = "";
            a = a(str, str, Boolean.FALSE);
        }

        public static a a(String str, String str2, Boolean bool) {
            return new qwq(str, str2, bool);
        }
    }

    private MusicPagesFiltering(qww qww, rnf rnf, Observable<String> observable, Scheduler scheduler, int i2) {
        this.a = BehaviorSubject.a();
        this.b = qww;
        this.c = new rnc(rnf) {
            public final rnd a(rnd rnd) {
                return rnd.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            }
        };
        this.d = observable;
        this.e = scheduler;
        this.f = 100;
    }

    public final Observable<ImmutableMap<String, Boolean>> a(String str) {
        if (this.g == null) {
            this.g = this.d.c(1).a(this.e).h(new Function() {
                public final Object apply(Object obj) {
                    return MusicPagesFiltering.this.b((String) obj);
                }
            }).a((Action) new Action() {
                public final void run() {
                    MusicPagesFiltering.this.b();
                }
            }).a(1).a();
        }
        return this.g.f((ObservableSource<? extends T>) this.i != null ? Observable.b("") : Observable.c()).a((Predicate<? super T>) new Predicate(str) {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return MusicPagesFiltering.b(this.f$0, (String) obj);
            }
        }).c((Function<? super T, ? extends R>) new Function(str) {
            private final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return MusicPagesFiltering.this.a(this.f$1, (String) obj);
            }
        }).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String a(a aVar) {
        if (aVar != a.a) {
            this.i.setFilterState(aVar.a(), aVar.b(), aVar.c());
            a();
        }
        return aVar.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.e.a((Runnable) new Runnable() {
            public final void run() {
                MusicPagesFiltering.this.a();
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str, String str2) {
        return str2.isEmpty() || str2.equals(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableMap a(String str, String str2) {
        FilteringModel filteringModel = this.i;
        if (filteringModel != null) {
            return filteringModel.getFilterState(str);
        }
        return ImmutableMap.f();
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.i != null && this.h != null) {
            String str = null;
            try {
                str = this.c.a().writeValueAsString(this.i);
            } catch (JsonProcessingException unused) {
                Assertion.b("Failed to write filter states.");
            }
            if (str != null) {
                this.b.a(this.h, str);
            }
        }
    }

    public MusicPagesFiltering(qwx qwx, rnf rnf, hvl hvl, Scheduler scheduler) {
        this(new qww() {
            public final String a(String str) {
                return (String) fay.a(qwx.this.c.a(qwx.this.b, str).a(qwx.a, ""));
            }

            public final void a(String str, String str2) {
                qwx.this.c.a(qwx.this.b, str).a().a(qwx.a, str2).b();
            }
        }, rnf, hvl.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).j(), scheduler, 100);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource b(String str) {
        if (this.i == null || !str.equals(this.h)) {
            FilteringModel filteringModel = null;
            String a2 = this.b.a(str);
            if (!fax.a(a2)) {
                try {
                    filteringModel = (FilteringModel) this.c.a().readValue(a2, FilteringModel.class);
                } catch (IOException unused) {
                    Assertion.b("Failed parsing filter states.");
                }
            }
            if (filteringModel == null) {
                filteringModel = new FilteringModel(new FilteringLruCache(this.f));
            }
            this.h = str;
            this.i = filteringModel;
        }
        return this.a.e(a.a).a(this.e).c((Function<? super T, ? extends R>) new Function() {
            public final Object apply(Object obj) {
                return MusicPagesFiltering.this.a((a) obj);
            }
        });
    }
}
