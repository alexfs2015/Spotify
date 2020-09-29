package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: izs reason: default package */
public interface izs {

    /* renamed from: izs$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Entry<Integer, izr> a(jab jab) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_feed_explicitly), jab);
        }

        public static Entry<Integer, izr> a(Context context, iyb iyb) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_stories), new jad(context, iyb));
        }

        public static Entry<Integer, izr> a(jac jac) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_facebook_messenger), jac);
        }

        public static Entry<Integer, izr> a(Context context, iyg iyg) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_instagram_stories), new jad(context, iyg));
        }

        public static Entry<Integer, izr> a(Context context, iyl iyl) {
            return new SimpleImmutableEntry(Integer.valueOf(R.id.share_app_snapchat_stories), new jad(context, iyl));
        }

        public static Map<Integer, izr> a(Set<Entry<Integer, izr>> set) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(set.size());
            for (Entry entry : set) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            return linkedHashMap;
        }
    }
}
