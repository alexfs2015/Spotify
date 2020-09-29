package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: sgn reason: default package */
public final class sgn extends hmm {
    public static final fqk a = hmh.a("rollout_android_podcast_playback_order_asc", Overridable.ALWAYS);
    public static final fql<RolloutFlag> b = hmh.a("rollout_android_podcast_use_action_cards_from_glue", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> c = hmh.a("ab_android_podcast_show_header_v2", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> d = hmh.a("ab_android_podcast_trailers", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> e = hmh.a("ab_android_podcast_contextual_episode", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> f = hmh.a("rollout_topics_creator_extensions", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.ALWAYS);
    public static final fql<RolloutFlag> g = hmh.a("rollout_unfinished_episodes_endpoint", RolloutFlag.class, RolloutFlag.CONTROL, Overridable.INTERNAL);
}
