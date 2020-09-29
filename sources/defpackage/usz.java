package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: usz reason: default package */
public final class usz implements xiy<RadioStationTracksModel, xii<Optional<RadioStationTracksModel>>> {
    private final usi a;
    private final String b;
    private final uss c;
    private final b d;
    private final xii<PlayerState> e;

    public usz(usi usi, String str, uss uss, b bVar, xii<PlayerState> xii) {
        this.a = usi;
        this.b = str;
        this.c = uss;
        this.d = bVar;
        this.e = xii;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Optional a(RadioStationTracksModel radioStationTracksModel, PlayerState playerState) {
        RadioStationModel radioStationModel = this.a.a;
        if (radioStationModel == null || !uss.a(playerState, this.a, this.b)) {
            return Optional.e();
        }
        return Optional.b(new RadioStationTracksModel(this.d.a(playerState, radioStationTracksModel.tracks), ute.a(radioStationModel.nextPageUrl, uss.a(playerState), jtp.a.a())));
    }

    public final /* synthetic */ Object call(Object obj) {
        return xii.b((xii<? extends T1>) ScalarSynchronousObservable.d((RadioStationTracksModel) obj), this.e.a(1), (xiz<? super T1, ? super T2, ? extends R>) new $$Lambda$usz$29wtSWgHmBmNtU4bLF4IF8tGNI4<Object,Object,Object>(this));
    }
}
