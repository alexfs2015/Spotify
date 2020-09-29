package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Observable;
import java.util.List;

public interface QueueManager {
    Observable<Response> addToQueue(PlayerTrack playerTrack, boolean z);

    Observable<Response> addTracksToQueue(List<PlayerTrack> list);

    Observable<PlayerQueue> getQueue();

    Observable<Response> setQueue(PlayerQueue playerQueue);

    Observable<Response> setQueue(PlayerQueue playerQueue, boolean z);
}
