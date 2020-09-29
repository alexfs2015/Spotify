package com.spotify.music.ondemandsharing;

import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.base.Optional;

public final class OnDemandSharingUtils {
    public final tis a;

    enum AcceptedReferrers {
        SLACK("Slack"),
        INSTAGRAM_STORIES("com.instagram.android"),
        WHATSAPP("com.whatsapp"),
        FACEBOOK_MESSENGER("com.facebook.orca"),
        FACEBOOK("com.facebook.katana");
        
        private final String mReferrerPackagingName;

        private AcceptedReferrers(String str) {
            this.mReferrerPackagingName = str;
        }
    }

    public OnDemandSharingUtils(tis tis) {
        this.a = tis;
    }

    public static boolean a(Uri uri) {
        return ((Boolean) Optional.c(uri).a((Function<? super T, V>) $$Lambda$zLyREtksBbd4Pvostu2221OSfoA.INSTANCE).a((Function<? super T, V>) $$Lambda$OnDemandSharingUtils$bDIwOKjuj6igHtA9ZzsupXwqddA.INSTANCE).a(Boolean.FALSE)).booleanValue();
    }
}
