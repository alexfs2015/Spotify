package com.spotify.mobile.android.spotlets.creatorartist.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.creatorartist.model.$AutoValue_Autobiography reason: invalid class name */
abstract class C$AutoValue_Autobiography extends Autobiography {
    private final String body;
    private final LinksModel links;
    private final List<String> urls;

    C$AutoValue_Autobiography(String str, List<String> list, LinksModel linksModel) {
        this.body = str;
        if (list != null) {
            this.urls = list;
            this.links = linksModel;
            return;
        }
        throw new NullPointerException("Null urls");
    }

    @JsonProperty("body")
    public String body() {
        return this.body;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.equals(r6.body()) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1.equals(r6.links()) != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 3
            r0 = 1
            r4 = 4
            if (r6 != r5) goto L_0x0007
            r4 = 7
            return r0
        L_0x0007:
            r4 = 3
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography
            r2 = 0
            r4 = 2
            if (r1 == 0) goto L_0x0057
            r4 = 3
            com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography r6 = (com.spotify.mobile.android.spotlets.creatorartist.model.Autobiography) r6
            java.lang.String r1 = r5.body
            if (r1 != 0) goto L_0x001e
            r4 = 2
            java.lang.String r1 = r6.body()
            if (r1 != 0) goto L_0x0057
            r4 = 4
            goto L_0x002b
        L_0x001e:
            r4 = 3
            java.lang.String r3 = r6.body()
            r4 = 6
            boolean r1 = r1.equals(r3)
            r4 = 2
            if (r1 == 0) goto L_0x0057
        L_0x002b:
            r4 = 3
            java.util.List<java.lang.String> r1 = r5.urls
            r4 = 3
            java.util.List r3 = r6.urls()
            r4 = 3
            boolean r1 = r1.equals(r3)
            r4 = 3
            if (r1 == 0) goto L_0x0057
            r4 = 2
            com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel r1 = r5.links
            if (r1 != 0) goto L_0x0049
            com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel r6 = r6.links()
            r4 = 7
            if (r6 != 0) goto L_0x0057
            r4 = 2
            goto L_0x0055
        L_0x0049:
            com.spotify.mobile.android.spotlets.creatorartist.model.LinksModel r6 = r6.links()
            r4 = 1
            boolean r6 = r1.equals(r6)
            r4 = 2
            if (r6 == 0) goto L_0x0057
        L_0x0055:
            r4 = 3
            return r0
        L_0x0057:
            r4 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.creatorartist.model.C$AutoValue_Autobiography.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.body;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.urls.hashCode()) * 1000003;
        LinksModel linksModel = this.links;
        if (linksModel != null) {
            i = linksModel.hashCode();
        }
        return hashCode ^ i;
    }

    @JsonProperty("links")
    public LinksModel links() {
        return this.links;
    }

    public String toString() {
        String str = "t=sogihAbrooud{apby";
        StringBuilder sb = new StringBuilder("Autobiography{body=");
        sb.append(this.body);
        String str2 = " ,rml=s";
        sb.append(", urls=");
        sb.append(this.urls);
        String str3 = "=nikos,l";
        sb.append(", links=");
        sb.append(this.links);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }

    @JsonProperty("urls")
    public List<String> urls() {
        return this.urls;
    }
}
