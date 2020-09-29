package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: rxd reason: default package */
public final class rxd extends hju {
    public static final fpq a = hjp.a("rollout_android_podcast_playback_order_asc", Overridable.ALWAYS);
    public static final fpr<RolloutFlag> b = hjp.a("rollout_android_podcast_video_split", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> c = hjp.a("rollout_android_podcast_use_action_cards_from_glue", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> d = hjp.a("rollout_android_podcast_lottie_animation", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> e = hjp.a("ab_android_podcast_show_header_v2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> f = hjp.a("ab_android_podcast_trailers", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> g = hjp.a("ab_android_podcast_contextual_episode", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fpr<RolloutFlag> h = hjp.a("rollout_topics_creator_extensions", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);

    static {
        hjp.a("rollout_continue_listening_shelf", Overridable.ALWAYS, "Enable");
    }
}
