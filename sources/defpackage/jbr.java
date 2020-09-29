package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jbr reason: default package */
public final class jbr {
    static Entry<Integer, jbn> a(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories_explicitly), jbp.a(R.id.share_app_facebook_stories_explicitly, R.string.share_app_facebook_stories, "facebook-stories", ShareCapability.STORY).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_facebook))).b(Optional.b("com.facebook.katana")).a());
    }

    static Entry<Integer, jbn> b(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jbp.a(R.id.share_app_facebook_feed_explicitly, R.string.share_app_facebook_feed, "facebook-feed-explicitly", ShareCapability.LINK).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_facebook))).b(Optional.b("com.facebook.katana")).a());
    }

    static Entry<Integer, jbn> c(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_twitter), jbp.a(R.id.share_app_twitter, R.string.share_app_twitter, "twitter", ShareCapability.MESSAGE).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_twitter_24))).b(Optional.b("com.twitter.android")).a());
    }

    static Entry<Integer, jbn> d(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_whats_app), jbp.a(R.id.share_app_whats_app, R.string.share_app_whats_app, "whats-app", ShareCapability.MESSAGE).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_whatsapp_24))).b(Optional.b("com.whatsapp")).a());
    }

    static Entry<Integer, jbn> e(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line), jbp.a(R.id.share_app_line, R.string.share_app_line, "line", ShareCapability.MESSAGE).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_line_24))).b(Optional.b("jp.naver.line.android")).a());
    }

    static Entry<Integer, jbn> f(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line_lite), jbp.a(R.id.share_app_line_lite, R.string.share_app_line_lite, "line-lite", ShareCapability.MESSAGE).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_line_24))).b(Optional.b("com.linecorp.linelite")).a());
    }

    static Entry<Integer, jbn> g(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_generic_sms), jbp.a(R.id.share_app_generic_sms, R.string.share_app_generic_sms, "sms", ShareCapability.MESSAGE).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_sms_56))).a());
    }

    static Entry<Integer, jbn> h(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jbp.a(R.id.share_app_facebook_messenger, R.string.share_app_facebook_messenger, "fb-messenger", ShareCapability.LINK).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_messenger_24))).b(Optional.b("com.facebook.orca")).a());
    }

    static Entry<Integer, jbn> i(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), jbp.a(R.id.share_app_instagram_stories, R.string.share_app_instagram_stories, "instagram-stories", ShareCapability.STORY).a(Optional.c(fr.a(context, (int) R.drawable.share_app_instagram_24))).b(Optional.b("com.instagram.android")).a());
    }

    static Entry<Integer, jbn> j(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), jbp.a(R.id.share_app_snapchat_stories, R.string.share_app_snapchat, "snapchat", ShareCapability.STORY).a(Optional.c(fr.a(context, (int) R.drawable.share_icn_snapchat_24))).b(Optional.b("com.snapchat.android")).a());
    }

    static Entry<Integer, jbn> a() {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_copy_link), jbp.a(R.id.share_app_copy_link, R.string.share_contextmenu_copy_link, "copylink", ShareCapability.LINK).a());
    }

    static Entry<Integer, jbn> b() {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_more), jbp.a(R.id.share_app_more, R.string.share_contextmenu_more, "more", ShareCapability.LINK).a());
    }

    static List<jbn> a(Set<Entry<Integer, jbn>> set, AndroidLibsShareProperties androidLibsShareProperties) {
        List<Integer> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ArrayList arrayList = new ArrayList();
        if (androidLibsShareProperties.a()) {
            list = jbo.b;
        } else {
            list = jbo.a;
        }
        for (Integer intValue : list) {
            jbn jbn = (jbn) linkedHashMap.get(Integer.valueOf(intValue.intValue()));
            if (jbn != null) {
                arrayList.add(jbn);
            }
        }
        return arrayList;
    }
}
