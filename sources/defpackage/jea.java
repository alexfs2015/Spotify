package defpackage;

import com.spotify.music.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: jea reason: default package */
final class jea {
    static final List<Integer> a;
    static final List<Integer> b;

    static {
        Integer valueOf = Integer.valueOf(R.id.share_app_snapchat_stories);
        Integer valueOf2 = Integer.valueOf(R.id.share_app_whats_app);
        Integer valueOf3 = Integer.valueOf(R.id.share_app_instagram_stories);
        Integer valueOf4 = Integer.valueOf(R.id.share_app_facebook_feed_explicitly);
        Integer valueOf5 = Integer.valueOf(R.id.share_app_facebook_stories_explicitly);
        Integer valueOf6 = Integer.valueOf(R.id.share_app_facebook_messenger);
        Integer valueOf7 = Integer.valueOf(R.id.share_app_twitter);
        a = Arrays.asList(new Integer[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, Integer.valueOf(R.id.share_app_line), Integer.valueOf(R.id.share_app_generic_sms), Integer.valueOf(R.id.share_app_copy_link), Integer.valueOf(R.id.share_app_more)});
        b = Arrays.asList(new Integer[]{Integer.valueOf(R.id.share_app_copy_link), valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, Integer.valueOf(R.id.share_app_line), Integer.valueOf(R.id.share_app_generic_sms), Integer.valueOf(R.id.share_app_more)});
    }
}
