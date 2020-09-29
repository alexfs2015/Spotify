package defpackage;

import com.spotify.music.features.listeninghistory.model.UserListeningHistoryWrapper;
import io.reactivex.Single;

/* renamed from: nqh reason: default package */
public interface nqh {
    @wti(a = "taimu-mashin/v1/history/tracks/{endSeconds}")
    Single<UserListeningHistoryWrapper> a(@wtv(a = "endSeconds") long j);
}
