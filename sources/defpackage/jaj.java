package defpackage;

import com.spotify.music.R;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jaj reason: default package */
public interface jaj {

    /* renamed from: jaj$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Entry<Integer, jai> a(jaf jaf) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_whats_app), jaf);
        }

        public static Entry<Integer, jai> b(jaf jaf) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_twitter), jaf);
        }

        public static Entry<Integer, jai> c(jaf jaf) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line), jaf);
        }

        public static Entry<Integer, jai> d(jaf jaf) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line_lite), jaf);
        }

        public static Entry<Integer, jai> a(jah jah) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jah);
        }

        public static Entry<Integer, jai> a(jag jag) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jag);
        }

        public static Entry<Integer, jai> a(jae jae) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_copy_link), jae);
        }

        public static Entry<Integer, jai> a(jbc jbc) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_more), jbc);
        }

        public static Entry<Integer, jai> a(jay jay) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_generic_sms), jay);
        }

        public static Entry<Integer, jai> a(iyg iyg, jba jba) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), jba.a(iyg));
        }

        public static Entry<Integer, jai> a(iyb iyb, jba jba) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories_explicitly), jba.a(iyb));
        }

        public static Entry<Integer, jai> a(iyl iyl, jba jba) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), jba.a(iyl));
        }

        public static Map<Integer, jai> a(Set<Entry<Integer, jai>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
    }
}
