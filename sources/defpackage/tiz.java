package defpackage;

import android.graphics.Color;
import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;

/* renamed from: tiz reason: default package */
public final class tiz {
    /* access modifiers changed from: private */
    public static final Integer a = Integer.valueOf(-7829368);
    private final Flowable<PlayerTrack> b;
    private final Picasso c;

    public tiz(Flowable<PlayerTrack> flowable, Picasso picasso) {
        this.b = flowable;
        this.c = picasso;
    }

    private static Optional<Integer> a(PlayerTrack playerTrack) {
        String str = (String) playerTrack.metadata().get("primary_color");
        if (str == null) {
            return Optional.e();
        }
        try {
            return Optional.b(Integer.valueOf(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            return Optional.e();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(Integer num) {
        return num.intValue() == -1 ? a : num;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Picasso picasso, Uri uri, final SingleEmitter singleEmitter) {
        tiy tiy = new tiy((a) fbp.a(new a() {
            public final void a() {
                singleEmitter.a(tiz.a);
            }

            public final void a(int i) {
                singleEmitter.a(Integer.valueOf(i));
            }
        }));
        singleEmitter.a((Cancellable) new $$Lambda$tiz$WUHvjB7xwr71ht6PtedOPwTf628(picasso, tiy));
        picasso.a(uri).a((wgz) vhb.a).a((wgx) tiy);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(PlayerTrack playerTrack) {
        if (PlayerTrackUtil.isVideo(playerTrack)) {
            return Single.b(Integer.valueOf(-16777216));
        }
        Picasso picasso = this.c;
        Optional a2 = a(playerTrack);
        return a2.b() ? Single.b(a2.c()) : Single.a((SingleOnSubscribe<T>) new $$Lambda$tiz$Cj0m09FZ3nXenvJTfBwYliqkmM<T>(picasso, iyd.a(playerTrack)));
    }

    public final Flowable<Integer> a() {
        return this.b.a((Function<? super T, K>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).f(new $$Lambda$tiz$ffBGn0Bmtjni8SfK4XQtJXui27Y(this)).c((Function<? super T, ? extends R>) $$Lambda$tiz$e47EECkXSknBLlky1IaebzT30rw.INSTANCE);
    }
}
