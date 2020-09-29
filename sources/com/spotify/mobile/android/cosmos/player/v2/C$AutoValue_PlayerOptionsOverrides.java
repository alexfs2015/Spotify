package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.mobile.android.cosmos.player.v2.$AutoValue_PlayerOptionsOverrides reason: invalid class name */
abstract class C$AutoValue_PlayerOptionsOverrides extends PlayerOptionsOverrides {
    private final Boolean repeatingContext;
    private final Boolean repeatingTrack;
    private final Boolean shufflingContext;

    C$AutoValue_PlayerOptionsOverrides(Boolean bool, Boolean bool2, Boolean bool3) {
        this.shufflingContext = bool;
        this.repeatingContext = bool2;
        this.repeatingTrack = bool3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1.equals(r6.shufflingContext()) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r1.equals(r6.repeatingContext()) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r1.equals(r6.repeatingTrack()) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 2
            r0 = 1
            r4 = 5
            if (r6 != r5) goto L_0x0007
            r4 = 2
            return r0
        L_0x0007:
            r4 = 4
            boolean r1 = r6 instanceof com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides
            r2 = 0
            if (r1 == 0) goto L_0x0061
            com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides r6 = (com.spotify.mobile.android.cosmos.player.v2.PlayerOptionsOverrides) r6
            r4 = 3
            java.lang.Boolean r1 = r5.shufflingContext
            if (r1 != 0) goto L_0x001e
            r4 = 0
            java.lang.Boolean r1 = r6.shufflingContext()
            r4 = 3
            if (r1 != 0) goto L_0x0061
            r4 = 7
            goto L_0x002b
        L_0x001e:
            r4 = 0
            java.lang.Boolean r3 = r6.shufflingContext()
            r4 = 0
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x0061
        L_0x002b:
            r4 = 5
            java.lang.Boolean r1 = r5.repeatingContext
            if (r1 != 0) goto L_0x0039
            java.lang.Boolean r1 = r6.repeatingContext()
            r4 = 3
            if (r1 != 0) goto L_0x0061
            r4 = 4
            goto L_0x0046
        L_0x0039:
            r4 = 3
            java.lang.Boolean r3 = r6.repeatingContext()
            r4 = 4
            boolean r1 = r1.equals(r3)
            r4 = 5
            if (r1 == 0) goto L_0x0061
        L_0x0046:
            r4 = 6
            java.lang.Boolean r1 = r5.repeatingTrack
            if (r1 != 0) goto L_0x0054
            java.lang.Boolean r6 = r6.repeatingTrack()
            r4 = 5
            if (r6 != 0) goto L_0x0061
            r4 = 2
            goto L_0x0060
        L_0x0054:
            java.lang.Boolean r6 = r6.repeatingTrack()
            r4 = 1
            boolean r6 = r1.equals(r6)
            r4 = 7
            if (r6 == 0) goto L_0x0061
        L_0x0060:
            return r0
        L_0x0061:
            r4 = 3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.C$AutoValue_PlayerOptionsOverrides.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Boolean bool = this.shufflingContext;
        int i = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        Boolean bool2 = this.repeatingContext;
        int hashCode2 = (hashCode ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.repeatingTrack;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode2 ^ i;
    }

    @JsonProperty("repeating_context")
    public Boolean repeatingContext() {
        return this.repeatingContext;
    }

    @JsonProperty("repeating_track")
    public Boolean repeatingTrack() {
        return this.repeatingTrack;
    }

    @JsonProperty("shuffling_context")
    public Boolean shufflingContext() {
        return this.shufflingContext;
    }

    public String toString() {
        String str = "OssrteitvtPriinhepdu{yosgesxarCOln=noffe";
        StringBuilder sb = new StringBuilder("PlayerOptionsOverrides{shufflingContext=");
        sb.append(this.shufflingContext);
        sb.append(", repeatingContext=");
        sb.append(this.repeatingContext);
        String str2 = "kc menT=tapg,rrae";
        sb.append(", repeatingTrack=");
        sb.append(this.repeatingTrack);
        String str3 = "}";
        sb.append("}");
        return sb.toString();
    }
}
