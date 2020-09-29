package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextPage;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import io.reactivex.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: uss reason: default package */
public final class uss {
    private static final Set<String> a = new HashSet(Collections.singletonList("disallow-mft-radio"));
    private static final Set<String> b = new HashSet(Collections.singletonList("disallow-radio"));
    private static PlayerRestrictions c;
    private static PlayerRestrictions d;
    private final xii<fqn> e;

    static {
        Set<String> set = a;
        Set emptySet = Collections.emptySet();
        Set<String> set2 = a;
        Set emptySet2 = Collections.emptySet();
        Set emptySet3 = Collections.emptySet();
        Set emptySet4 = Collections.emptySet();
        Set<String> set3 = b;
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(set, emptySet, set2, emptySet2, emptySet3, emptySet4, set3, set3, set3, a, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        c = playerRestrictions;
        Set emptySet5 = Collections.emptySet();
        Set emptySet6 = Collections.emptySet();
        Set emptySet7 = Collections.emptySet();
        Set emptySet8 = Collections.emptySet();
        Set emptySet9 = Collections.emptySet();
        Set emptySet10 = Collections.emptySet();
        Set<String> set4 = b;
        PlayerRestrictions playerRestrictions2 = new PlayerRestrictions(emptySet5, emptySet6, emptySet7, emptySet8, emptySet9, emptySet10, set4, set4, set4, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        d = playerRestrictions2;
    }

    public uss(Flowable<fqn> flowable) {
        this.e = wit.a((xfk<T>) flowable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(RadioStationTracksModel radioStationTracksModel, RadioStationModel radioStationModel, PlayerRestrictions playerRestrictions) {
        PlayerContextPage playerContextPage = new PlayerContextPage(null, radioStationTracksModel.nextPageUrl, radioStationTracksModel.tracks, null);
        HashMap hashMap = new HashMap();
        String str = "";
        hashMap.put("context_description", jvi.a(radioStationModel.title, str));
        hashMap.put("image_url", jvi.a(radioStationModel.imageUri, str));
        PlayerContext playerContext = new PlayerContext(radioStationModel.getPlayerContextUri(), hashMap, playerRestrictions, new PlayerContextPage[]{playerContextPage}, null, null);
        return ScalarSynchronousObservable.d(playerContext);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ xii a(fqn fqn) {
        return jus.c(fqn) ? ScalarSynchronousObservable.d(d) : ScalarSynchronousObservable.d(c);
    }

    public static boolean a(PlayerState playerState, usi usi, String str) {
        RadioStationModel radioStationModel = usi.a;
        if (radioStationModel == null || !radioStationModel.isMyContext(playerState.contextUri())) {
            return false;
        }
        PlayerTrack track = playerState.track();
        return track == null || !str.equals(track.uri());
    }

    public static PlayerTrack[] a(PlayerState playerState) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, playerState.reverse());
        if (playerState.track() != null) {
            arrayList.add(playerState.track());
        }
        Collections.addAll(arrayList, playerState.future());
        return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
    }

    public static PlayerTrack[] a(String[] strArr, boolean z, PlayerTrack[] playerTrackArr) {
        ArrayList arrayList = new ArrayList(playerTrackArr.length);
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (PlayerTrack playerTrack : playerTrackArr) {
            if (!hashSet.contains(playerTrack.uri()) && (!z || !PlayerTrackUtil.isExplicit(playerTrack))) {
                arrayList.add(playerTrack);
            }
        }
        return (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]);
    }

    public final xii<PlayerContext> a(RadioStationModel radioStationModel, RadioStationTracksModel radioStationTracksModel) {
        return this.e.a(1).h($$Lambda$uss$zLXSy8IHjYv5PfxvKve8U5bZfSg.INSTANCE).h(new $$Lambda$uss$HKoXTbieXl4JtQKBpmmP_HtCN0(radioStationTracksModel, radioStationModel));
    }
}
