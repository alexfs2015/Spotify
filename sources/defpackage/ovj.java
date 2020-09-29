package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.music.features.playlistentity.trackcloud.TrackCloudShuffling;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: ovj reason: default package */
final class ovj {
    final CompositeDisposable a = new CompositeDisposable();
    final hbj b;
    final ovf c;
    final String d;
    final ohl e;
    oqq f;
    final kvk g;
    final CompletableSubject h = CompletableSubject.f();
    private final TrackCloudShuffling i;
    private final int j;
    private final a k;
    private final Scheduler l;
    private final BehaviorSubject<ho<ojb, ojc>> m = BehaviorSubject.a();
    private final SerialDisposable n = new SerialDisposable();
    private ovo o;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Integer num) {
    }

    public ovj(hbj hbj, ovf ovf, String str, TrackCloudShuffling trackCloudShuffling, a aVar, Random random, Scheduler scheduler, kvk kvk, ohl ohl) {
        this.b = hbj;
        this.c = ovf;
        this.d = str;
        this.i = trackCloudShuffling;
        this.j = random.nextInt();
        this.l = scheduler;
        this.e = ohl;
        this.k = aVar;
        this.g = kvk;
    }

    public final void a(a aVar) {
        this.f = this.k.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$VXu11YQ9u2WEimH2XJKkQl3hTqY.INSTANCE).a(this.l);
        $$Lambda$ovj$aC1zclLlXV5PoWc4zVihys7pc8 r1 = new $$Lambda$ovj$aC1zclLlXV5PoWc4zVihys7pc8(this);
        CompletableSubject completableSubject = this.h;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.f.a(((ojb) fay.a(hoVar.a)).a(), this.e.a(), this.e.b(), this.e.c(), this.e.d(), this.e.e(), 0, $$Lambda$ovj$9OULe7TXT1e0SFTIUq77il_k5hY.INSTANCE);
        this.m.onNext(hoVar);
        this.h.onComplete();
    }

    public final void a(ovo ovo) {
        this.o = ovo;
        if (ovo != null) {
            this.n.a(this.m.d((Consumer<? super T>) new $$Lambda$ovj$UgLDJrJsdM2IzyX4DJgYbYU7fI<Object>(this)));
        } else {
            this.n.a(Disposables.a());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        ojb ojb = (ojb) fay.a(hoVar.a);
        ojc ojc = (ojc) fay.a(hoVar.b);
        List a2 = ojb.a();
        if (this.e.h()) {
            a2 = ImmutableList.a(fbx.a((Iterable<E>) a2).a((faz<? super E>) $$Lambda$ovj$gUGIkZntx8OJ0HnrdE7jtBpOnw.INSTANCE).a());
        }
        if (!a2.isEmpty()) {
            List<uzc> list = (List) ojb.b().a(Collections.emptyList());
            ArrayList a3 = Lists.a();
            for (final uzc uzc : list) {
                if (!uzc.isBanned()) {
                    a3.add(new uzb() {
                        public final uys a() {
                            return null;
                        }

                        public final String d() {
                            return null;
                        }

                        public final String getHeader() {
                            return null;
                        }

                        public final boolean isHeader() {
                            return false;
                        }

                        public final uzc b() {
                            return uzc;
                        }

                        public final ImmutableMap<String, String> c() {
                            return ImmutableMap.f();
                        }

                        public final String getUri() {
                            return uzc.getUri();
                        }

                        public final String getTitle() {
                            return uzc.getTitle();
                        }

                        public final String getTargetUri() {
                            return uzc.getTargetUri();
                        }

                        public final String getImageUri() {
                            return uzc.getImageUri();
                        }

                        public final String getImageUri(Size size) {
                            return uzc.getImageUri(size);
                        }
                    });
                }
            }
            this.o.a(this.e.f());
            if (this.e.g()) {
                this.o.a(TrackCloudShuffling.a(a2, a3, new Random((long) this.j)));
            } else {
                this.o.a(a2);
            }
            int j2 = ojc.j();
            int k2 = ojc.k();
            this.o.a(j2 > 0 && k2 > 0, k2, j2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(uzb uzb) {
        return (uzb == null || uzb.b() == null) ? false : true;
    }
}
