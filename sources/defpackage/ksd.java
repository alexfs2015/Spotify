package defpackage;

import android.content.Intent;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: ksd reason: default package */
public final class ksd implements taa {
    private static final ImmutableMap<String, String> a;
    private static final ImmutableMap<String, String> b;

    static {
        String str = "home";
        String str2 = "yourlibrary";
        String str3 = "quicksilver";
        a = ImmutableMap.g().b(str, "https://app.adjust.com/twe2a2y?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b(str2, "https://app.adjust.com/2yzy8mq?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b(str3, "https://app.adjust.com/4ugii5n?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify%2Fbr").b();
        b = ImmutableMap.g().b(str, "https://app.adjust.com/kl8j9f5?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b(str2, "https://app.adjust.com/pz4lr3v?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b(str3, "https://app.adjust.com/d4jbiit?redirect=https%3A%2F%2Fanchor.fm%2Fgetonspotify").b();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        ImmutableMap<String, String> immutableMap;
        Optional optional;
        jva a2 = jva.a(intent.getDataString());
        if (krt.a(fqn)) {
            immutableMap = a;
        } else if (krt.b(fqn)) {
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
        return (tad) optional.a((Function<? super T, V>) $$Lambda$ksd$NbGFWZOsn0iNUOuJ3d7ZQ6mSySs.INSTANCE).a(new a());
    }

    /* access modifiers changed from: private */
    public static tad a(String str) {
        return tad.a((jqx) krr.b(str));
    }

    public final void a(szz szz) {
        szz.a(LinkType.ANCHOR_FUNNEL, "Anchor funnel landing page", (tae) $$Lambda$ksd$A4el23fsmS_ZPyUfYAdTfiGNuM.INSTANCE);
    }
}
