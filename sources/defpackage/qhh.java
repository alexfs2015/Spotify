package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.R;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse.Payload;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qhh reason: default package */
public final class qhh implements defpackage.qhg.a {
    private final qge a;
    private final spi b;
    private final Player c;
    private final gsu d;
    private final CompositeDisposable e = new CompositeDisposable();
    private b f;
    private final String g;

    /* renamed from: qhh$a */
    static final class a implements SingleOnSubscribe<String> {
        /* access modifiers changed from: private */
        public final Player a;
        private final PlayerContext b;
        private final String c;

        /* synthetic */ a(Player player, PlayerContext playerContext, String str, byte b2) {
            this(player, playerContext, str);
        }

        private a(Player player, PlayerContext playerContext, String str) {
            this.a = player;
            this.b = playerContext;
            this.c = str;
        }

        public final void subscribe(final SingleEmitter<String> singleEmitter) {
            this.a.playWithViewUri(this.b, null, this.c, new ActionCallback() {
                public final void onActionSuccess() {
                    a.this.a.fetchState(new $$Lambda$qhh$a$1$dWfNMnwlEjiCT3rGnvj3qR4EObc(singleEmitter));
                }

                public final void onActionForbidden(List<String> list) {
                    singleEmitter.a((Throwable) new RuntimeException(list.toString()));
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    public qhh(qge qge, spi spi, Player player, gsu gsu, String str) {
        this.a = qge;
        this.b = spi;
        this.c = player;
        this.d = gsu;
        this.g = str;
    }

    public final void a(b bVar, Payload payload) {
        List list;
        this.f = bVar;
        this.a.a(ViewUris.bS.toString(), ImpressionType.PAGE, RenderType.PAGE);
        if (payload == null) {
            list = Collections.emptyList();
        } else {
            List<qhf> results = payload.results();
            qhf fulfillment = payload.fulfillment();
            if (fulfillment == null || results == null || results.isEmpty()) {
                list = Collections.emptyList();
            } else {
                List arrayList = new ArrayList(results.size() + 2);
                arrayList.add(new defpackage.qhk.a(fulfillment, R.layout.list_entity_page_header));
                arrayList.add(new c(R.string.results_list_header, R.layout.list_result_page_header));
                for (qhf bVar2 : results) {
                    arrayList.add(new b(bVar2, 1251));
                }
                list = arrayList;
            }
        }
        bVar.a(list);
    }

    public final void a() {
        this.e.c();
        this.f = null;
    }

    public final void a(qhk qhk, int i) {
        qhk.a((gcs<c>) $$Lambda$qhh$faQP55AmvF17yspaJPMyrd2bJZ0.INSTANCE, (gcs<b>) new $$Lambda$qhh$48Umnf4PrDIkQV29w2vp71ZaDg<b>(this, i), (gcs<defpackage.qhk.a>) new $$Lambda$qhh$gYUR1nUXtv53TCyC4tzIx7WvGQ<defpackage.qhk.a>(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(String str, PlayerContext playerContext) {
        return Single.a((SingleOnSubscribe<T>) new a<T>(this.c, playerContext, str, 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, String str2) {
        this.a.a(this.g, ViewUris.bS.toString(), i, str, InteractionType.TAP, InteractionIntent.PLAY, str2, "");
        this.f.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, Throwable th) {
        this.a.a(this.g, ViewUris.bS.toString(), i, str, InteractionType.TAP, InteractionIntent.PLAY, "", "");
    }

    public final void b() {
        this.a.a(this.g, ViewUris.bS.toString(), 0, "", InteractionType.TAP, "dismiss", "", "");
        this.f.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, defpackage.qhk.a aVar) {
        String a2 = aVar.a.a();
        this.a.a(this.g, ViewUris.bS.toString(), i, a2, InteractionType.TAP, InteractionIntent.NAVIGATE, "", "");
        this.b.a(a2);
        this.f.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, b bVar) {
        String a2 = bVar.a.a();
        Optional a3 = this.d.a(a2);
        if (!a3.b()) {
            this.a.a(this.g, ViewUris.bS.toString(), i, a2, InteractionType.TAP, InteractionIntent.PLAY, "", "");
            return;
        }
        this.e.a(vun.b(((gst) a3.c()).resolve()).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$qhh$D62uHQNATBbG2iGaSqJmlr6LM0o<Object,Object>(this, a2), false).a((Consumer<? super T>) new $$Lambda$qhh$iTyV1f1x2LLQasslfuU2MmnmOSY<Object>(this, i, a2), (Consumer<? super Throwable>) new $$Lambda$qhh$uoCsw7Qqx_v7sfzDrRKXvM16y0<Object>(this, i, a2)));
    }
}
