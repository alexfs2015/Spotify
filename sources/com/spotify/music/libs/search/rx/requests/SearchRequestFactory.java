package com.spotify.music.libs.search.rx.requests;

public final class SearchRequestFactory {
    public final SearchRequestType a;
    public final sli b;

    /* renamed from: com.spotify.music.libs.search.rx.requests.SearchRequestFactory$1 reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[SearchRequestType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType[] r0 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4_NFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4_ASSISTED_CURATION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4_DRILLDOWN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4_DRILLDOWN_NFT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.music.libs.search.rx.requests.SearchRequestFactory$SearchRequestType r1 = com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType.SEARCH_V4_DRILLDOWN_ASSISTED_CURATION     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.search.rx.requests.SearchRequestFactory.AnonymousClass1.<clinit>():void");
        }
    }

    public enum SearchRequestType {
        SEARCH_V4,
        SEARCH_V4_NFT,
        SEARCH_V4_ASSISTED_CURATION,
        SEARCH_V4_DRILLDOWN,
        SEARCH_V4_DRILLDOWN_NFT,
        SEARCH_V4_DRILLDOWN_ASSISTED_CURATION
    }

    public SearchRequestFactory(SearchRequestType searchRequestType, sli sli) {
        this.a = (SearchRequestType) fbp.a(searchRequestType);
        this.b = sli;
    }

    public static sqs a(sqk sqk, sli sli, boolean z, boolean z2) {
        if (!z) {
            sli = sli.a(sqk.a());
        }
        return new sqs(sqk, sli.a(), z2);
    }
}
