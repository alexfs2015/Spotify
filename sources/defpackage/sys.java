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

/* renamed from: sys reason: default package */
public final class sys {
    /* access modifiers changed from: private */
    public static final Integer a = Integer.valueOf(-7829368);
    private final Flowable<PlayerTrack> b;
    private final Picasso c;

    public sys(Flowable<PlayerTrack> flowable, Picasso picasso) {
        this.b = flowable;
        this.c = picasso;
    }

    public final Flowable<Integer> a() {
        return this.b.a((Function<? super T, K>) $$Lambda$JSb0l8EbCs4tWmYc8vpglb3xNDg.INSTANCE).f(new $$Lambda$sys$ZR640S7bcmsIiXe6SXyOecl3Oso(this)).c((Function<? super T, ? extends R>) $$Lambda$sys$2Vg_gxyaCivkVL8s7ziAGMxHYs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource b(PlayerTrack playerTrack) {
        if (PlayerTrackUtil.isVideo(playerTrack)) {
            return Single.b(Integer.valueOf(-16777216));
        }
        Picasso picasso = this.c;
        Optional a2 = a(playerTrack);
        if (a2.b()) {
            return Single.b(a2.c());
        }
        return Single.a((SingleOnSubscribe<T>) new $$Lambda$sys$BHnKNPtfwGskZ5wNIMrIaKlEWE<T>(picasso, ivs.a(playerTrack)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Integer a(Integer num) {
        return num.intValue() == -1 ? a : num;
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
    public static /* synthetic */ void a(Picasso picasso, Uri uri, final SingleEmitter singleEmitter) {
        syr syr = new syr((a) fay.a(new a() {
            public final void a(int i) {
                singleEmitter.a(Integer.valueOf(i));
            }

            public final void a() {
                singleEmitter.a(sys.a);
            }
        }));
        singleEmitter.a((Cancellable) new $$Lambda$sys$WdpqzHCvvOZN6xUpWov5qSmuSw(picasso, syr));
        picasso.a(uri).a((vst) uvk.a).a((vsr) syr);
    }
}
