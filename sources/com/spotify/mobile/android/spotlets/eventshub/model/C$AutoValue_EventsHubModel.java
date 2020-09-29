package com.spotify.mobile.android.spotlets.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.mobile.android.spotlets.eventshub.model.$AutoValue_EventsHubModel reason: invalid class name */
abstract class C$AutoValue_EventsHubModel extends EventsHubModel {
    private final List<EventResult> events;
    private final String headerImageUri;
    private final String userLocation;

    C$AutoValue_EventsHubModel(List<EventResult> list, String str, String str2) {
        if (list != null) {
            this.events = list;
            this.headerImageUri = str;
            this.userLocation = str2;
            return;
        }
        throw new NullPointerException("Null events");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1.equals(r6.getHeaderImageUri()) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1.equals(r6.getUserLocation()) != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            r0 = 1
            r4 = 7
            if (r6 != r5) goto L_0x0007
            r4 = 6
            return r0
        L_0x0007:
            r4 = 5
            boolean r1 = r6 instanceof com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel
            r4 = 4
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel r6 = (com.spotify.mobile.android.spotlets.eventshub.model.EventsHubModel) r6
            r4 = 0
            java.util.List<com.spotify.mobile.android.spotlets.eventshub.model.EventResult> r1 = r5.events
            r4 = 1
            java.util.List r3 = r6.getEvents()
            r4 = 7
            boolean r1 = r1.equals(r3)
            r4 = 0
            if (r1 == 0) goto L_0x0058
            r4 = 7
            java.lang.String r1 = r5.headerImageUri
            if (r1 != 0) goto L_0x002f
            r4 = 2
            java.lang.String r1 = r6.getHeaderImageUri()
            r4 = 7
            if (r1 != 0) goto L_0x0058
            r4 = 6
            goto L_0x003c
        L_0x002f:
            r4 = 5
            java.lang.String r3 = r6.getHeaderImageUri()
            r4 = 5
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x0058
        L_0x003c:
            r4 = 4
            java.lang.String r1 = r5.userLocation
            if (r1 != 0) goto L_0x004a
            java.lang.String r6 = r6.getUserLocation()
            r4 = 1
            if (r6 != 0) goto L_0x0058
            r4 = 3
            goto L_0x0057
        L_0x004a:
            r4 = 0
            java.lang.String r6 = r6.getUserLocation()
            r4 = 3
            boolean r6 = r1.equals(r6)
            r4 = 3
            if (r6 == 0) goto L_0x0058
        L_0x0057:
            return r0
        L_0x0058:
            r4 = 5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.eventshub.model.C$AutoValue_EventsHubModel.equals(java.lang.Object):boolean");
    }

    @JsonProperty("events")
    public List<EventResult> getEvents() {
        return this.events;
    }

    @JsonProperty("headerImageUri")
    public String getHeaderImageUri() {
        return this.headerImageUri;
    }

    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    public int hashCode() {
        int hashCode = (this.events.hashCode() ^ 1000003) * 1000003;
        String str = this.headerImageUri;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.userLocation;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        String str = "eusnt=nHlevEteoM{sbedv";
        StringBuilder sb = new StringBuilder("EventsHubModel{events=");
        sb.append(this.events);
        String str2 = "rhdmaeU=eiagmreI ";
        sb.append(", headerImageUri=");
        sb.append(this.headerImageUri);
        String str3 = "tcosoi,u=aLnro ";
        sb.append(", userLocation=");
        sb.append(this.userLocation);
        String str4 = "}";
        sb.append("}");
        return sb.toString();
    }
}
