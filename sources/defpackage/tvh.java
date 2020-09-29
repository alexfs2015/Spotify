package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.rx.RxPlayerState;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: tvh reason: default package */
public final class tvh implements RxPlayerState {
    private final Map<ho<Integer, Integer>, a> a = new ConcurrentHashMap();
    private final Map<ho<Integer, Integer>, PlayerState> b = new ConcurrentHashMap();
    private final viy c;

    /* renamed from: tvh$a */
    static class a {
        final Observable<PlayerState> a;
        final vve<PlayerState> b;

        public a(Observable<PlayerState> observable, vve<PlayerState> vve) {
            this.a = observable;
            this.b = vve;
        }
    }

    public tvh(viy viy) {
        this.c = viy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar, PlayerState playerState) {
        this.b.put(hoVar, playerState);
    }

    public final PlayerState getMostRecentPlayerState() {
        Map<ho<Integer, Integer>, PlayerState> map = this.b;
        Integer valueOf = Integer.valueOf(2);
        return (PlayerState) map.get(ho.a(valueOf, valueOf));
    }

    public final Observable<PlayerState> getPlayerState() {
        return getPlayerState(2, 2);
    }

    public final Observable<PlayerState> getPlayerState(int i, int i2) {
        ho a2 = ho.a(Integer.valueOf(i), Integer.valueOf(i2));
        a aVar = (a) this.a.get(a2);
        if (aVar == null) {
            vve vve = new vve(RxPlayerState.class.getSimpleName(), this.c.a(i, i2).c((Function<? super T, ? extends R>) $$Lambda$rJVISIrzX4EEWsdRAgIPdfTMBHk.INSTANCE).j().b((Consumer<? super T>) new $$Lambda$tvh$W37xE_tyHLkRBwLTG7IkB7y1IHQ<Object>(this, ho.a(Integer.valueOf(i), Integer.valueOf(i2)))));
            aVar = new a(Observable.a((ObservableOnSubscribe<T>) vve), vve);
            this.a.put(a2, aVar);
        }
        return aVar.a;
    }

    public final List<vvj> unsubscribeAndReturnLeaks() {
        LinkedList linkedList = new LinkedList();
        for (a aVar : this.a.values()) {
            linkedList.addAll(aVar.b.a());
        }
        return linkedList;
    }
}
