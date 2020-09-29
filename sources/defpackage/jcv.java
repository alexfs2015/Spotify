package defpackage;

import com.spotify.music.R;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jcv reason: default package */
public interface jcv {

    /* renamed from: jcv$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Entry<Integer, jcu> a(jam jam, jdm jdm) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories_explicitly), jdm.a(jam));
        }

        public static Entry<Integer, jcu> a(jar jar, jdm jdm) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), jdm.a(jar));
        }

        public static Entry<Integer, jcu> a(jaw jaw, jdm jdm) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), jdm.a(jaw));
        }

        public static Entry<Integer, jcu> a(jcq jcq) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_copy_link), jcq);
        }

        public static Entry<Integer, jcu> a(jcr jcr) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_whats_app), jcr);
        }

        public static Entry<Integer, jcu> a(jcs jcs) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jcs);
        }

        public static Entry<Integer, jcu> a(jct jct) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jct);
        }

        public static Entry<Integer, jcu> a(jdk jdk) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_generic_sms), jdk);
        }

        public static Entry<Integer, jcu> a(jdo jdo) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_more), jdo);
        }

        public static Map<Integer, jcu> a(Set<Entry<Integer, jcu>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }

        public static Entry<Integer, jcu> b(jcr jcr) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_twitter), jcr);
        }

        public static Entry<Integer, jcu> c(jcr jcr) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line), jcr);
        }

        public static Entry<Integer, jcu> d(jcr jcr) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_line_lite), jcr);
        }
    }
}
