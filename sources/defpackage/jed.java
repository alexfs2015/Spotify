package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.spotlets.share.v2.ShareCapability;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jed reason: default package */
public final class jed {
    private static Drawable a(Context context, SpotifyIconV2 spotifyIconV2) {
        return new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(R.dimen.share_icon_size));
    }

    static List<jdz> a(Set<Entry<Integer, jdz>> set, AndroidLibsShareProperties androidLibsShareProperties) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
        for (Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : androidLibsShareProperties.a() ? jea.b : jea.a) {
            jdz jdz = (jdz) linkedHashMap.get(Integer.valueOf(intValue.intValue()));
            if (jdz != null) {
                arrayList.add(jdz);
            }
        }
        return arrayList;
    }

    static Entry<Integer, jdz> a(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories_explicitly), jeb.a(R.id.share_app_facebook_stories_explicitly, R.string.share_app_facebook_stories, "facebook-stories-explicitly", ShareCapability.STORY, fr.a(context, (int) R.drawable.share_icn_facebook)).a(Optional.b("com.facebook.katana")).a());
    }

    static Entry<Integer, jdz> b(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jeb.a(R.id.share_app_facebook_feed_explicitly, R.string.share_app_facebook_feed, "facebook-feed-explicitly", ShareCapability.LINK, fr.a(context, (int) R.drawable.share_icn_facebook)).a(Optional.b("com.facebook.katana")).a());
    }

    static Entry<Integer, jdz> c(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_twitter), jeb.a(R.id.share_app_twitter, R.string.share_app_twitter, "twitter", ShareCapability.MESSAGE, fr.a(context, (int) R.drawable.share_icn_twitter_24)).a(Optional.b("com.twitter.android")).a());
    }

    static Entry<Integer, jdz> d(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_whats_app), jeb.a(R.id.share_app_whats_app, R.string.share_app_whats_app, "whats-app", ShareCapability.MESSAGE, fr.a(context, (int) R.drawable.share_icn_whatsapp_24)).a(Optional.b("com.whatsapp")).a());
    }

    static Entry<Integer, jdz> e(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line), jeb.a(R.id.share_app_line, R.string.share_app_line, "line", ShareCapability.MESSAGE, fr.a(context, (int) R.drawable.share_icn_line_24)).a(Optional.b("jp.naver.line.android")).a());
    }

    static Entry<Integer, jdz> f(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line_lite), jeb.a(R.id.share_app_line_lite, R.string.share_app_line_lite, "line-lite", ShareCapability.MESSAGE, fr.a(context, (int) R.drawable.share_icn_line_24)).a(Optional.b("com.linecorp.linelite")).a());
    }

    static Entry<Integer, jdz> g(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_generic_sms), jeb.a(R.id.share_app_generic_sms, R.string.share_app_generic_sms, "sms", ShareCapability.MESSAGE, a(context, SpotifyIconV2.SMS)).a());
    }

    static Entry<Integer, jdz> h(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jeb.a(R.id.share_app_facebook_messenger, R.string.share_app_facebook_messenger, "fb-messenger", ShareCapability.LINK, fr.a(context, (int) R.drawable.share_icn_messenger_24)).a(Optional.b("com.facebook.orca")).a());
    }

    static Entry<Integer, jdz> i(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), jeb.a(R.id.share_app_instagram_stories, R.string.share_app_instagram_stories, "instagram-stories", ShareCapability.STORY, fr.a(context, (int) R.drawable.share_app_instagram_24)).a(Optional.b("com.instagram.android")).a());
    }

    static Entry<Integer, jdz> j(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), jeb.a(R.id.share_app_snapchat_stories, R.string.share_app_snapchat, "snapchat", ShareCapability.STORY, fr.a(context, (int) R.drawable.share_icn_snapchat_24)).a(Optional.b("com.snapchat.android")).a());
    }

    static Entry<Integer, jdz> k(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_copy_link), jeb.a(R.id.share_app_copy_link, R.string.share_contextmenu_copy_link, "copylink", ShareCapability.LINK, a(context, SpotifyIconV2.COPY)).a());
    }

    static Entry<Integer, jdz> l(Context context) {
        return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_more), jeb.a(R.id.share_app_more, R.string.share_contextmenu_more, "more", ShareCapability.MESSAGE, a(context, SpotifyIconV2.MORE)).a());
    }
}
