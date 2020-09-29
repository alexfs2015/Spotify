package com.spotify.mobile.android.wrapped2019.stories.endpoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.wrapped2019.stories.endpoint.$AutoValue_ConsumerResponse reason: invalid class name */
abstract class C$AutoValue_ConsumerResponse extends ConsumerResponse {
    private final List<String> order;
    private final TopArtist topArtist;
    private final TopPodcasts topPodcasts;

    C$AutoValue_ConsumerResponse(List<String> list, TopArtist topArtist2, TopPodcasts topPodcasts2) {
        if (list != null) {
            this.order = list;
            this.topArtist = topArtist2;
            this.topPodcasts = topPodcasts2;
            return;
        }
        throw new NullPointerException("Null order");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1.equals(r6.topArtist()) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r0 = 1
            r4 = 5
            if (r6 != r5) goto L_0x0007
            r4 = 5
            return r0
        L_0x0007:
            boolean r1 = r6 instanceof com.spotify.mobile.android.wrapped2019.stories.endpoint.ConsumerResponse
            r2 = 0
            r4 = r2
            if (r1 == 0) goto L_0x0058
            r4 = 1
            com.spotify.mobile.android.wrapped2019.stories.endpoint.ConsumerResponse r6 = (com.spotify.mobile.android.wrapped2019.stories.endpoint.ConsumerResponse) r6
            java.util.List<java.lang.String> r1 = r5.order
            r4 = 5
            java.util.List r3 = r6.order()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 4
            if (r1 == 0) goto L_0x0058
            r4 = 7
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist r1 = r5.topArtist
            r4 = 2
            if (r1 != 0) goto L_0x002f
            r4 = 5
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist r1 = r6.topArtist()
            r4 = 7
            if (r1 != 0) goto L_0x0058
            r4 = 2
            goto L_0x003b
        L_0x002f:
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopArtist r3 = r6.topArtist()
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x0058
        L_0x003b:
            r4 = 5
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts r1 = r5.topPodcasts
            r4 = 7
            if (r1 != 0) goto L_0x004a
            r4 = 6
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts r6 = r6.topPodcasts()
            r4 = 3
            if (r6 != 0) goto L_0x0058
            goto L_0x0056
        L_0x004a:
            r4 = 1
            com.spotify.mobile.android.wrapped2019.stories.endpoint.TopPodcasts r6 = r6.topPodcasts()
            boolean r6 = r1.equals(r6)
            r4 = 3
            if (r6 == 0) goto L_0x0058
        L_0x0056:
            r4 = 2
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.wrapped2019.stories.endpoint.C$AutoValue_ConsumerResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.order.hashCode() ^ 1000003) * 1000003;
        TopArtist topArtist2 = this.topArtist;
        int i = 0;
        int hashCode2 = (hashCode ^ (topArtist2 == null ? 0 : topArtist2.hashCode())) * 1000003;
        TopPodcasts topPodcasts2 = this.topPodcasts;
        if (topPodcasts2 != null) {
            i = topPodcasts2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("order")
    public List<String> order() {
        return this.order;
    }

    public String toString() {
        String str = "prsoenoeuRrrenm=oss{esC";
        StringBuilder sb = new StringBuilder("ConsumerResponse{order=");
        sb.append(this.order);
        String str2 = ",=pmsrtt Aoi";
        sb.append(", topArtist=");
        sb.append(this.topArtist);
        sb.append(", topPodcasts=");
        sb.append(this.topPodcasts);
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("topArtist")
    public TopArtist topArtist() {
        return this.topArtist;
    }

    @JsonProperty("podcasts")
    public TopPodcasts topPodcasts() {
        return this.topPodcasts;
    }
}
