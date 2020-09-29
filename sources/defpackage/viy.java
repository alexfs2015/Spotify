package defpackage;

import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: viy reason: default package */
public interface viy {
    Flowable<PlayerState> a();

    Flowable<PlayerState> a(int i, int i2);

    Observable<PlayerError> b();
}
