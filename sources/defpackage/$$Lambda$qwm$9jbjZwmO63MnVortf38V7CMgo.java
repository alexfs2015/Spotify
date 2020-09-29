package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filterandsort.MusicPagesFiltering;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: -$$Lambda$qwm$9jbjZwmO63MnVortf38-V7C-Mgo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qwm$9jbjZwmO63MnVortf38V7CMgo implements ObservableTransformer {
    private final /* synthetic */ Scheduler f$0;
    private final /* synthetic */ MusicPagesFiltering f$1;

    public /* synthetic */ $$Lambda$qwm$9jbjZwmO63MnVortf38V7CMgo(Scheduler scheduler, MusicPagesFiltering musicPagesFiltering) {
        this.f$0 = scheduler;
        this.f$1 = musicPagesFiltering;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a(this.f$0).h(new $$Lambda$qwm$IUtCXITBqu4YTBTkf3j_AdBW9aM(this.f$1)).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$22LS_KUJMBhctDiK7jhKXClXtbg.INSTANCE).a(this.f$0);
    }
}
