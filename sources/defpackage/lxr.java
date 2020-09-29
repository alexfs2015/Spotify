package defpackage;

import com.spotify.mobile.android.util.LinkType;

@Deprecated
/* renamed from: lxr reason: default package */
public final class lxr implements spt {
    public final void a(sps sps) {
        $$Lambda$lxr$f6JSOhSp1iMZvRhmUQaF5qbWA r0 = $$Lambda$lxr$f6JSOhSp1iMZvRhmUQaF5qbWA.INSTANCE;
        String str = "Deprecated. This will redirect spotify:browse instead. Use spotify:genre:new-releases.";
        sps.a(LinkType.BROWSE_RELEASES, str, (spa) r0);
        sps.a(LinkType.BROWSE_NEW_RELEASES, str, (spa) r0);
        String str2 = "Deprecated. This will redirect spotify:browse instead.";
        sps.a(LinkType.BROWSE_LINK, str2, (spa) r0);
        sps.a(LinkType.BROWSE_HUBS, str2, (spa) r0);
        sps.a(LinkType.BROWSE_IMAGESET, str2, (spa) r0);
        sps.a(LinkType.BROWSE_TOPPODCAST, str2, (spa) r0);
    }
}
