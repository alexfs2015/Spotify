package defpackage;

import com.spotify.mobile.android.util.LinkType;

@Deprecated
/* renamed from: mbs reason: default package */
public final class mbs implements taa {
    public final void a(szz szz) {
        $$Lambda$mbs$Q7hkarWakEEbv0NYAL31gSm5Jz0 r0 = $$Lambda$mbs$Q7hkarWakEEbv0NYAL31gSm5Jz0.INSTANCE;
        String str = "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.";
        szz.a(LinkType.BROWSE_RELEASES, str, (szh) r0);
        szz.a(LinkType.BROWSE_NEW_RELEASES, str, (szh) r0);
        String str2 = "Deprecated. This will redirect spotify:browse instead.";
        szz.a(LinkType.BROWSE_LINK, str2, (szh) r0);
        szz.a(LinkType.BROWSE_HUBS, str2, (szh) r0);
        szz.a(LinkType.BROWSE_IMAGESET, str2, (szh) r0);
        szz.a(LinkType.BROWSE_TOPPODCAST, str2, (szh) r0);
    }
}
