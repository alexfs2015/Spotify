package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;

@Deprecated
/* renamed from: gxm reason: default package */
public final class gxm implements gwo {
    private static final ImmutableSet<String> a = ImmutableSet.a(HubsGlueCard.ENTITY.id(), HubsGlueRow.ENTITY.id(), HubsGlueRow.VIDEO.id());

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (defpackage.jva.a(r0, com.spotify.mobile.android.util.LinkType.ALBUM, com.spotify.mobile.android.util.LinkType.ARTIST, com.spotify.mobile.android.util.LinkType.PLAYLIST_V2, com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST, com.spotify.mobile.android.util.LinkType.SHOW_EPISODE, com.spotify.mobile.android.util.LinkType.SHOW_SHOW, com.spotify.mobile.android.util.LinkType.TRACK) != false) goto L_0x0013;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hcm decorate(defpackage.hcm r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.gyg.a(r8)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0015
            hcr r0 = r8.target()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.uri()
        L_0x0013:
            r3 = r0
            goto L_0x0062
        L_0x0015:
            boolean r0 = defpackage.gyg.b(r8)
            if (r0 != 0) goto L_0x0062
            com.google.common.collect.ImmutableSet<java.lang.String> r0 = a
            hck r4 = r8.componentId()
            java.lang.String r4 = r4.id()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x0062
            hcr r0 = r8.target()
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r0.uri()
            if (r0 == 0) goto L_0x0062
            r4 = 7
            com.spotify.mobile.android.util.LinkType[] r4 = new com.spotify.mobile.android.util.LinkType[r4]
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.ALBUM
            r4[r1] = r5
            com.spotify.mobile.android.util.LinkType r5 = com.spotify.mobile.android.util.LinkType.ARTIST
            r4[r2] = r5
            r5 = 2
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.PLAYLIST_V2
            r4[r5] = r6
            r5 = 3
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST
            r4[r5] = r6
            r5 = 4
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.SHOW_EPISODE
            r4[r5] = r6
            r5 = 5
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.SHOW_SHOW
            r4[r5] = r6
            r5 = 6
            com.spotify.mobile.android.util.LinkType r6 = com.spotify.mobile.android.util.LinkType.TRACK
            r4[r5] = r6
            boolean r4 = defpackage.jva.a(r0, r4)
            if (r4 == 0) goto L_0x0062
            goto L_0x0013
        L_0x0062:
            if (r3 == 0) goto L_0x00c5
            hci$a r0 = defpackage.hct.builder()
            java.lang.String r4 = "contextMenu"
            hci$a r0 = r0.a(r4)
            java.lang.String r4 = "uri"
            hci$a r0 = r0.a(r4, r3)
            hco r3 = r8.text()
            java.lang.String r3 = r3.title()
            java.lang.String r4 = "title"
            hci$a r0 = r0.a(r4, r3)
            hci r0 = r0.a()
            hcm$a r3 = r8.toBuilder()
            java.lang.String r4 = "longClick"
            hcm$a r3 = r3.a(r4, r0)
            com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow r4 = com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow.ENTITY
            java.lang.String r4 = r4.id()
            hck r5 = r8.componentId()
            java.lang.String r5 = r5.id()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b8
            com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow r4 = com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow.VIDEO
            java.lang.String r4 = r4.id()
            hck r8 = r8.componentId()
            java.lang.String r8 = r8.id()
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x00b9
        L_0x00b8:
            r1 = 1
        L_0x00b9:
            if (r1 == 0) goto L_0x00c1
            java.lang.String r8 = "rightAccessoryClick"
            hcm$a r3 = r3.a(r8, r0)
        L_0x00c1:
            hcm r8 = r3.a()
        L_0x00c5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxm.decorate(hcm):hcm");
    }
}
