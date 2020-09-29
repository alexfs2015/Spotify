package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jce reason: default package */
public interface jce {

    /* renamed from: jce$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Entry<Integer, jcd> a(Context context, jam jam) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories), new jcp(context, jam));
        }

        public static Entry<Integer, jcd> a(Context context, jar jar) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), new jcp(context, jar));
        }

        public static Entry<Integer, jcd> a(Context context, jaw jaw) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), new jcp(context, jaw));
        }

        public static Entry<Integer, jcd> a(jcn jcn) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jcn);
        }

        public static Entry<Integer, jcd> a(jco jco) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jco);
        }

        public static Map<Integer, jcd> a(Set<Entry<Integer, jcd>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
    }
}
