package defpackage;

import android.content.Intent;
import com.spotify.music.features.user.ProfilesListFragment;
import com.spotify.music.features.user.ProfilesListFragment.Type;

/* renamed from: jpy reason: default package */
public final class jpy {
    private jst a;
    private final Intent b;

    public jpy(jst jst, Intent intent) {
        this.a = jst;
        this.b = intent;
    }

    public final jol a() {
        switch (this.a.b) {
            case PROFILE_FOLLOWERS:
                return ProfilesListFragment.a(this.a.h(), Type.FOLLOWERS);
            case PROFILE_FOLLOWING:
                return ProfilesListFragment.a(this.a.h(), Type.FOLLOWING);
            case PROFILE_PLAYLIST_OVERVIEW:
                return qot.b(this.a.h());
            case PROFILE_ARTISTS:
                if (!qov.b(this.b)) {
                    return qov.b(this.a.h());
                }
                qov qov = new qov();
                jiu.a((jol) qov, this.b);
                return qov;
            case FOLLOW_FACEBOOK:
                return ProfilesListFragment.a(this.a.h(), Type.FOLLOW_FACEBOOK);
            case FOLLOW_ARTISTS:
                return ProfilesListFragment.a(this.a.h(), Type.FOLLOW_ARTISTS);
            default:
                return jol.c;
        }
    }
}
