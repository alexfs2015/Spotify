package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Lists;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;

/* renamed from: riq reason: default package */
public final class riq implements kmm<MusicPagesModel, rey> {
    /* access modifiers changed from: private */
    public final ArrayList<rdh> a = Lists.a();
    private final rca<Type, MusicItem> b;
    private final rbz c;
    private final RecyclerView d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public a f;
    /* access modifiers changed from: private */
    public final int g;
    /* access modifiers changed from: private */
    public final int h;

    /* renamed from: riq$a */
    interface a {
        void onRangeChanged(int i, int i2);
    }

    public riq(rca<Type, MusicItem> rca, RecyclerView recyclerView, rbg rbg) {
        this.b = rca;
        fbp.a(rca instanceof rbz, (Object) "Adapter was not a PlayerStateConsumer");
        this.c = (rbz) rca;
        this.d = recyclerView;
        this.g = rbg.h;
        int i = this.g;
        this.h = i - (i / 4);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(MusicPagesModel musicPagesModel) {
        return new ho(musicPagesModel.v(), musicPagesModel.a().b().d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.c.a((rfa) hoVar.a, (String) hoVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final rdc rdc) {
        rca<Type, MusicItem> rca = this.b;
        rca.a = new b<Type, MusicItem>() {
            public final int a() {
                return rdc.k();
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ defpackage.rca.a a(int r6) {
                /*
                    r5 = this;
                    rdc r0 = r3
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r0.a(r6)
                    riq r1 = defpackage.riq.this
                    int r1 = r1.e
                    riq r2 = defpackage.riq.this
                    int r2 = r2.g
                    riq r3 = defpackage.riq.this
                    int r3 = r3.h
                    int r4 = r1 + r2
                    if (r6 < r4) goto L_0x0023
                    int r2 = r2 - r3
                    int r1 = r6 - r3
                    int r1 = r1 / r2
                L_0x0020:
                    int r1 = r1 * r2
                    goto L_0x002b
                L_0x0023:
                    if (r1 <= 0) goto L_0x002b
                    if (r6 >= r1) goto L_0x002b
                    int r2 = r2 - r3
                    int r1 = r6 / r2
                    goto L_0x0020
                L_0x002b:
                    riq r2 = defpackage.riq.this
                    int r2 = r2.e
                    if (r1 == r2) goto L_0x0055
                    riq r2 = defpackage.riq.this
                    r2.e = r1
                    riq r1 = defpackage.riq.this
                    riq$a r1 = r1.f
                    if (r1 == 0) goto L_0x0055
                    riq r1 = defpackage.riq.this
                    riq$a r1 = r1.f
                    riq r2 = defpackage.riq.this
                    int r2 = r2.e
                    riq r3 = defpackage.riq.this
                    int r3 = r3.g
                    r1.onRangeChanged(r2, r3)
                L_0x0055:
                    riq r1 = defpackage.riq.this
                    java.util.ArrayList r1 = r1.a
                    java.util.Iterator r1 = r1.iterator()
                L_0x005f:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0070
                    java.lang.Object r2 = r1.next()
                    rdh r2 = (defpackage.rdh) r2
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r2.a(r0, r6)
                    goto L_0x005f
                L_0x0070:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.riq.AnonymousClass2.a(int):rca$a");
            }
        };
        rca.d++;
        rca.e();
        if (this.d.c() == null) {
            this.d.a((androidx.recyclerview.widget.RecyclerView.a) this.b);
        }
    }

    public final void a(rdh rdh) {
        this.a.add(rdh);
    }

    public final kmn<MusicPagesModel> connect(knw<rey> knw) {
        this.f = new $$Lambda$riq$66KmilBNhVynU9VKWtqT4P_TOQ0(knw);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$fr8_PhYgJKCrClPWPpMPzR5bY54.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$riq$y79_G16T7YqJ2M3sX_NQKtmGP7w<Object>(this), (Consumer<? super Throwable>) $$Lambda$riq$edTMs0bcoEUrIP7Jt9McV76qts.INSTANCE);
        final Disposable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$riq$fWyoxZHNFBH72QKHCQDpdq9BZg.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$riq$_qd0HoJ07htvipV3tCtgqy0WiiU<Object>(this), (Consumer<? super Throwable>) $$Lambda$riq$spvQgLGMaIkE_XS6oqUShG8w4s.INSTANCE);
        return new kmn<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a3.bd_();
                a4.bd_();
                riq.this.f = null;
            }
        };
    }
}
