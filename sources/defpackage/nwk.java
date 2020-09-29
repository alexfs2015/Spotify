package defpackage;

import com.spotify.music.features.listeninghistory.model.UserListeningHistoryWrapper;
import io.reactivex.Single;

/* renamed from: nwk reason: default package */
public interface nwk {
    @xhn(a = "taimu-mashin/v1/history/tracks/{endSeconds}")
    Single<UserListeningHistoryWrapper> a(@xia(a = "endSeconds") long j);
}
