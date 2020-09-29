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

/* renamed from: qpv reason: default package */
public final class qpv implements defpackage.qpu.a {
    private final qos a;
    private final szp b;
    private final Player c;
    private final gut d;
    private final CompositeDisposable e = new CompositeDisposable();
    private b f;
    private final String g;

    /* renamed from: qpv$a */
    static final class a implements SingleOnSubscribe<String> {
        /* access modifiers changed from: private */
        public final Player a;
        private final PlayerContext b;
        private final String c;

        private a(Player player, PlayerContext playerContext, String str) {
            this.a = player;
            this.b = playerContext;
            this.c = str;
        }

        /* synthetic */ a(Player player, PlayerContext playerContext, String str, byte b2) {
            this(player, playerContext, str);
        }

        public final void subscribe(final SingleEmitter<String> singleEmitter) {
            this.a.playWithViewUri(this.b, null, this.c, new ActionCallback() {
                public final void onActionForbidden(List<String> list) {
                    singleEmitter.a((Throwable) new RuntimeException(list.toString()));
                }

                public final void onActionSuccess() {
                    a.this.a.fetchState(new $$Lambda$qpv$a$1$TNumftT8hDZonVpO1uey36WvuxM(singleEmitter));
                }
            });
        }
    }

    public qpv(qos qos, szp szp, Player player, gut gut, String str) {
        this.a = qos;
        this.b = szp;
        this.c = player;
        this.d = gut;
        this.g = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Single a(String str, PlayerContext playerContext) {
        return Single.a((SingleOnSubscribe<T>) new a<T>(this.c, playerContext, str, 0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, String str2) {
        this.a.a(this.g, ViewUris.bR.toString(), i, str, InteractionType.TAP, InteractionIntent.PLAY, str2, "");
        this.f.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, String str, Throwable th) {
        this.a.a(this.g, ViewUris.bR.toString(), i, str, InteractionType.TAP, InteractionIntent.PLAY, "", "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, defpackage.qpy.a aVar) {
        String a2 = aVar.a.a();
        this.a.a(this.g, ViewUris.bR.toString(), i, a2, InteractionType.TAP, InteractionIntent.NAVIGATE, "", "");
        this.b.a(a2);
        this.f.k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i, b bVar) {
        String a2 = bVar.a.a();
        Optional a3 = this.d.a(a2);
        if (!a3.b()) {
            this.a.a(this.g, ViewUris.bR.toString(), i, a2, InteractionType.TAP, InteractionIntent.PLAY, "", "");
            return;
        }
        this.e.a(wit.b(((gus) a3.c()).resolve()).d((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$qpv$VkrNBCTz_zBKzwLMKQ3THJPcMCo<Object,Object>(this, a2), false).a((Consumer<? super T>) new $$Lambda$qpv$RTwLfD3cQfz1PQcWwotmMgkIMU<Object>(this, i, a2), (Consumer<? super Throwable>) new $$Lambda$qpv$J7XXRiEf_I5buU1xnp0ugQvIcc<Object>(this, i, a2)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    public final void a() {
        this.e.c();
        this.f = null;
    }

    public final void a(b bVar, Payload payload) {
        List list;
        this.f = bVar;
        this.a.a(ViewUris.bR.toString(), ImpressionType.PAGE, RenderType.PAGE);
        if (payload == null) {
            list = Collections.emptyList();
        } else {
            List<qpt> results = payload.results();
            qpt fulfillment = payload.fulfillment();
            if (fulfillment == null || results == null || results.isEmpty()) {
                list = Collections.emptyList();
            } else {
                List arrayList = new ArrayList(results.size() + 2);
                arrayList.add(new defpackage.qpy.a(fulfillment, R.layout.list_entity_page_header));
                arrayList.add(new c(R.string.results_list_header, R.layout.list_result_page_header));
                for (qpt bVar2 : results) {
                    arrayList.add(new b(bVar2, 1251));
                }
                list = arrayList;
            }
        }
        bVar.a(list);
    }

    public final void a(qpy qpy, int i) {
        qpy.a((ged<c>) $$Lambda$qpv$r2MuaoMTpcsEgA1exGmsYIcMCY.INSTANCE, (ged<b>) new $$Lambda$qpv$RLSD2Pka7SHSvYExF1vbEgDto2M<b>(this, i), (ged<defpackage.qpy.a>) new $$Lambda$qpv$yZ9jyM4CbQCLOHtSGyLXuLhJcjI<defpackage.qpy.a>(this, i));
    }

    public final void b() {
        this.a.a(this.g, ViewUris.bR.toString(), 0, "", InteractionType.TAP, "dismiss", "", "");
        this.f.k();
    }
}
