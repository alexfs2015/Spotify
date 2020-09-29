package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_Album reason: invalid class name */
abstract class C$AutoValue_Album extends Album {
    private final String artistName;
    private final String imageUri;
    private final String name;
    private final String uri;

    C$AutoValue_Album(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.uri = str;
            this.name = str2;
            this.imageUri = str3;
            this.artistName = str4;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1.equals(r6.getName()) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1.equals(r6.getImageUri()) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r1.equals(r6.getArtistName()) != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 2
            r0 = 1
            r4 = 6
            if (r6 != r5) goto L_0x0007
            r4 = 1
            return r0
        L_0x0007:
            r4 = 1
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.Album
            r4 = 1
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r4 = 1
            com.spotify.mobile.android.spotlets.eventshub.model.Album r6 = (com.spotify.mobile.android.spotlets.eventshub.model.Album) r6
            java.lang.String r1 = r5.uri
            r4 = 3
            java.lang.String r3 = r6.getUri()
            boolean r1 = r1.equals(r3)
            r4 = 6
            if (r1 == 0) goto L_0x0074
            r4 = 4
            java.lang.String r1 = r5.name
            if (r1 != 0) goto L_0x002e
            r4 = 1
            java.lang.String r1 = r6.getName()
            r4 = 5
            if (r1 != 0) goto L_0x0074
            r4 = 7
            goto L_0x003b
        L_0x002e:
            r4 = 7
            java.lang.String r3 = r6.getName()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x0074
        L_0x003b:
            java.lang.String r1 = r5.imageUri
            r4 = 0
            if (r1 != 0) goto L_0x004a
            r4 = 5
            java.lang.String r1 = r6.getImageUri()
            r4 = 3
            if (r1 != 0) goto L_0x0074
            r4 = 3
            goto L_0x0057
        L_0x004a:
            r4 = 5
            java.lang.String r3 = r6.getImageUri()
            r4 = 6
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x0074
        L_0x0057:
            r4 = 2
            java.lang.String r1 = r5.artistName
            r4 = 3
            if (r1 != 0) goto L_0x0066
            java.lang.String r6 = r6.getArtistName()
            r4 = 3
            if (r6 != 0) goto L_0x0074
            r4 = 0
            goto L_0x0073
        L_0x0066:
            r4 = 2
            java.lang.String r6 = r6.getArtistName()
            r4 = 6
            boolean r6 = r1.equals(r6)
            r4 = 3
            if (r6 == 0) goto L_0x0074
        L_0x0073:
            return r0
        L_0x0074:
            r4 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_Album.equals(java.lang.Object):boolean");
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return this.artistName;
    }

    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.imageUri;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = (this.uri.hashCode() ^ 1000003) * 1000003;
        String str = this.name;
        int i = 0;
        boolean z = true | false;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.imageUri;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.artistName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        String str = "Ausir={ulb";
        StringBuilder sb = new StringBuilder("Album{uri=");
        sb.append(this.uri);
        sb.append(", name=");
        sb.append(this.name);
        String str2 = "mgrm,e U=ia";
        sb.append(", imageUri=");
        sb.append(this.imageUri);
        String str3 = "=a soaitN,rte";
        sb.append(", artistName=");
        sb.append(this.artistName);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
