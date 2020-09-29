package defpackage;

import android.content.Intent;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: kou reason: default package */
public final class kou implements spt {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableMap<String, String> b;

    static {
        String str = "home";
        String str2 = "yourlibrary";
        String str3 = "quicksilver";
        a = ImmutableMap.g().b(str, "https://app.adjust.com/twe2a2y?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b(str2, "https://app.adjust.com/2yzy8mq?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b(str3, "https://app.adjust.com/4ugii5n?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b();
        b = ImmutableMap.g().b(str, "https://app.adjust.com/kl8j9f5?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b(str2, "https://app.adjust.com/pz4lr3v?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b(str3, "https://app.adjust.com/d4jbiit?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b();
    }

    public final void a(sps sps) {
        sps.a(LinkType.ANCHOR_FUNNEL, "Anchor funnel landing page", (spx) $$Lambda$kou$owtpWibHHt27V6V9_MvqdVU6VIo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ spw a(Intent intent, fpt fpt, SessionState sessionState) {
        ImmutableMap<String, String> immutableMap;
        Optional optional;
        jst a2 = jst.a(intent.getDataString());
        if (kok.a(fpt)) {
            immutableMap = a;
        } else if (kok.b(fpt)) {
            immutableMap = b;
        } else {
            Logger.e("Request to launch Anchor funnel landing page without having any Anchor funnel feature enabled.", new Object[0]);
            immutableMap = null;
        }
        if (immutableMap == null) {
            optional = Optional.e();
        } else {
            String str = (String) immutableMap.get(a2.b());
            if (str == null) {
                Logger.e("Unknown landing page URL for navigation link %s", a2);
                optional = Optional.e();
            } else {
                optional = Optional.b(str);
            }
        }
        return (spw) optional.a((Function<? super T, V>) $$Lambda$kou$KkZ5aESTHODVr0p1MH5RQrrTIOc.INSTANCE).a(new a());
    }

    /* access modifiers changed from: private */
    public static spw a(String str) {
        return spw.a((jol) koi.b(str));
    }
}
