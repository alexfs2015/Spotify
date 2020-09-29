package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uhl reason: default package */
public final class uhl implements wut<RadioStationTracksModel, wud<Optional<RadioStationTracksModel>>> {
    private final ugu a;
    private final String b;
    private final uhe c;
    private final b d;
    private final wud<PlayerState> e;

    public final /* synthetic */ Object call(Object obj) {
        return wud.b((wud<? extends T1>) ScalarSynchronousObservable.d((RadioStationTracksModel) obj), this.e.a(1), (wuu<? super T1, ? super T2, ? extends R>) new $$Lambda$uhl$N848GO7R47L0YVkJWr48rA29lQ<Object,Object,Object>(this));
    }

    public uhl(ugu ugu, String str, uhe uhe, b bVar, wud<PlayerState> wud) {
        this.a = ugu;
        this.b = str;
        this.c = uhe;
        this.d = bVar;
        this.e = wud;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(RadioStationTracksModel radioStationTracksModel, PlayerState playerState) {
        RadioStationModel radioStationModel = this.a.a;
        if (radioStationModel == null || !uhe.a(playerState, this.a, this.b)) {
            return Optional.e();
        }
        return Optional.b(new RadioStationTracksModel(this.d.a(playerState, radioStationTracksModel.tracks), uhq.a(radioStationModel.nextPageUrl, uhe.a(playerState), jrf.a.a())));
    }
}
