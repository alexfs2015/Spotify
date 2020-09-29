package com.spotify.mobile.android.spotlets.share;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import com.spotify.remoteconfig.AndroidLibsShareProperties.FacebookShareStoryVsFeed;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum AppShareDestination {
    FACEBOOK_DEFAULT(R.id.share_app_facebook_stories, "com.facebook.katana", R.string.share_app_facebook, R.drawable.share_icn_facebook, false, "facebook-stories") {
        public final boolean a(LinkType linkType) {
            return jaj.a.contains(linkType);
        }

        public final boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
            return AppShareDestination.a(androidLibsShareProperties, FacebookShareStoryVsFeed.CONTROL);
        }
    },
    FACEBOOK_POPUP(R.id.share_app_facebook_popup, "com.facebook.katana", R.string.share_app_facebook, R.drawable.share_icn_facebook, false, "facebook-popup") {
        public final boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
            return AppShareDestination.a(androidLibsShareProperties, FacebookShareStoryVsFeed.POP_UP);
        }
    },
    FACEBOOK_FEED(R.id.share_app_facebook_feed_explicitly, "com.facebook.katana", R.string.share_app_facebook_feed, R.drawable.share_icn_facebook, false, "facebook-feed-explicitly") {
        public final boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
            return AppShareDestination.a(androidLibsShareProperties, FacebookShareStoryVsFeed.SEPARATE_MENU_ITEMS);
        }
    },
    FACEBOOK_STORIES(R.id.share_app_facebook_stories_explicitly, "com.facebook.katana", R.string.share_app_facebook_stories, R.drawable.share_icn_facebook, false, "facebook-stories-explicitly") {
        public final boolean a(LinkType linkType) {
            return jaj.a.contains(linkType);
        }

        public final boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
            return AppShareDestination.a(androidLibsShareProperties, FacebookShareStoryVsFeed.SEPARATE_MENU_ITEMS);
        }
    },
    TWITTER(R.id.share_app_twitter, "com.twitter.android", R.string.share_app_twitter, R.drawable.share_icn_twitter_24, false, "twitter"),
    WHATS_APP(R.id.share_app_whats_app, "com.whatsapp", R.string.share_app_whats_app, R.drawable.share_icn_whatsapp_24, false, "whats-app"),
    LINE(R.id.share_app_line, "jp.naver.line.android", R.string.share_app_line, R.drawable.share_icn_line_24, false, "line"),
    LINE_LITE(R.id.share_app_line_lite, "com.linecorp.linelite", R.string.share_app_line_lite, false, "line-lite"),
    GENERIC_SMS(R.id.share_app_generic_sms, "com.android.sms", R.string.share_app_generic_sms, R.drawable.share_icn_sms_56, false, "sms"),
    FACEBOOK_MESSENGER(R.id.share_app_facebook_messenger, "com.facebook.orca", R.string.share_app_facebook_messenger, R.drawable.share_icn_messenger_24, false, "fb-messenger"),
    GENERIC_EMAIL(R.id.share_app_generic_email, "com.android.email", R.string.share_app_generic_email, false, "email"),
    GENERIC_MMS(R.id.share_app_generic_mms, "com.android.mms", R.string.share_app_generic_mms, false, "mms"),
    GOOGLE_DOCS(R.id.share_app_google_docs, "com.google.android.apps.docs", R.string.share_app_google_docs, false, "google-docs"),
    GOOGLE_HANGOUTS(R.id.share_app_google_hangouts, "com.google.android.talk", R.string.share_app_google_hangouts, false, "google-hangouts"),
    INSTAGRAM(R.id.share_app_instagram_stories, "com.instagram.android", R.string.share_app_instagram_stories, R.drawable.share_app_instagram_24, false, "instagram-stories") {
        public final boolean a(LinkType linkType) {
            return jaj.a.contains(linkType);
        }
    },
    SNAPCHAT_STORIES(R.id.share_app_snapchat_stories, "com.snapchat.android", R.string.share_app_snapchat, R.drawable.share_icn_snapchat_24, false, "snapchat") {
        public final boolean a(LinkType linkType) {
            return jaj.a.contains(linkType);
        }

        public final boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
            return true;
        }
    };
    
    public static final List<AppShareDestination> i = null;
    private static final FacebookShareStoryVsFeed[] r = null;
    public final int mIconResIdSmall;
    public final int mId;
    public final boolean mIsDeeplink;
    public final String mLogId;
    public final int mNameStringResId;
    public final String mPackageNameSpace;

    static {
        r = FacebookShareStoryVsFeed.values();
        i = Collections.unmodifiableList(Arrays.asList(new AppShareDestination[]{SNAPCHAT_STORIES, WHATS_APP, INSTAGRAM, FACEBOOK_DEFAULT, FACEBOOK_POPUP, FACEBOOK_FEED, FACEBOOK_STORIES, FACEBOOK_MESSENGER, TWITTER, LINE, GENERIC_SMS}));
    }

    private AppShareDestination(int i2, String str, int i3, int i4, boolean z, String str2) {
        this.mId = i2;
        this.mPackageNameSpace = str;
        this.mNameStringResId = i3;
        this.mIconResIdSmall = i4;
        this.mIsDeeplink = z;
        this.mLogId = str2;
    }

    private AppShareDestination(int i2, String str, int i3, boolean z, String str2) {
        this(r10, r11, i2, str, i3, -1, false, str2);
    }

    public static Intent a(Context context, a aVar) {
        fbp.a(context);
        fbp.a(aVar);
        Intent intent = new Intent(aVar.b());
        String str = "dtsnoEoieSa.acniDinN..nttr";
        intent.setAction("android.intent.action.SEND");
        return intent;
    }

    public final Drawable a(Context context) {
        return fr.a(context, this.mIconResIdSmall);
    }

    public boolean a(LinkType linkType) {
        return true;
    }

    public boolean a(AndroidLibsShareProperties androidLibsShareProperties) {
        return true;
    }
}
