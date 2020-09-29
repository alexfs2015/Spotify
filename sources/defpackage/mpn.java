package defpackage;

import com.spotify.music.features.findfriends.legacy.model.FindFriendsModel;
import io.reactivex.Single;

/* renamed from: mpn reason: default package */
public interface mpn {
    @wtr(a = "find-friends/v1/friends")
    Single<FindFriendsModel> a();
}
