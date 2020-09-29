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

/* renamed from: pcu reason: default package */
final class pcu {
    final CompositeDisposable a = new CompositeDisposable();
    final hec b;
    final pcq c;
    final String d;
    final oop e;
    oxw f;
    final kyt g;
    final CompletableSubject h = CompletableSubject.f();
    private final TrackCloudShuffling i;
    private final int j;
    private final a k;
    private final Scheduler l;
    private final BehaviorSubject<ho<oqf, oqg>> m = BehaviorSubject.a();
    private final SerialDisposable n = new SerialDisposable();
    private pcz o;

    public pcu(hec hec, pcq pcq, String str, TrackCloudShuffling trackCloudShuffling, a aVar, Random random, Scheduler scheduler, kyt kyt, oop oop) {
        this.b = hec;
        this.c = pcq;
        this.d = str;
        this.i = trackCloudShuffling;
        this.j = random.nextInt();
        this.l = scheduler;
        this.e = oop;
        this.k = aVar;
        this.g = kyt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        oqf oqf = (oqf) fbp.a(hoVar.a);
        oqg oqg = (oqg) fbp.a(hoVar.b);
        List a2 = oqf.a();
        if (this.e.h()) {
            a2 = ImmutableList.a(fcp.a((Iterable<E>) a2).a((fbq<? super E>) $$Lambda$pcu$DJNOQifTljO9HJu4AlDgUWBH0IY.INSTANCE).a());
        }
        if (!a2.isEmpty()) {
            List<vlf> list = (List) oqf.b().a(Collections.emptyList());
            ArrayList a3 = Lists.a();
            for (final vlf vlf : list) {
                if (!vlf.isBanned()) {
                    a3.add(new vle() {
                        public final vkv a() {
                            return null;
                        }

                        public final vlf b() {
                            return vlf;
                        }

                        public final ImmutableMap<String, String> c() {
                            return ImmutableMap.f();
                        }

                        public final String d() {
                            return null;
                        }

                        public final String getHeader() {
                            return null;
                        }

                        public final String getImageUri() {
                            return vlf.getImageUri();
                        }

                        public final String getImageUri(Size size) {
                            return vlf.getImageUri(size);
                        }

                        public final String getTargetUri() {
                            return vlf.getTargetUri();
                        }

                        public final String getTitle() {
                            return vlf.getTitle();
                        }

                        public final String getUri() {
                            return vlf.getUri();
                        }

                        public final boolean isHeader() {
                            return false;
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
            int j2 = oqg.j();
            int k2 = oqg.k();
            this.o.a(j2 > 0 && k2 > 0, k2, j2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Integer num) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(vle vle) {
        return (vle == null || vle.b() == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ho hoVar) {
        this.f.a(((oqf) fbp.a(hoVar.a)).a(), this.e.a(), this.e.b(), this.e.c(), this.e.d(), this.e.e(), 0, $$Lambda$pcu$lT2KxBUiSNGJuEZkyf2kncsKsoI.INSTANCE);
        this.m.onNext(hoVar);
        this.h.onComplete();
    }

    public final void a(a aVar) {
        this.f = this.k.a(aVar.a());
        this.a.c();
        CompositeDisposable compositeDisposable = this.a;
        Observable a2 = Observable.a((ObservableSource<? extends T1>) aVar.b().b(), (ObservableSource<? extends T2>) aVar.b().c(), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$XOFTafTE3HUAHpkswss2ae2f3w.INSTANCE).a(this.l);
        $$Lambda$pcu$V7yfvU8Zrs2ks5OkEtokt12YnXE r1 = new $$Lambda$pcu$V7yfvU8Zrs2ks5OkEtokt12YnXE(this);
        CompletableSubject completableSubject = this.h;
        completableSubject.getClass();
        compositeDisposable.a(a2.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) new $$Lambda$choprRsDTSvpwrZVpXc94jmfwE<Object>(completableSubject)));
    }

    public final void a(pcz pcz) {
        this.o = pcz;
        if (pcz != null) {
            this.n.a(this.m.d((Consumer<? super T>) new $$Lambda$pcu$iePxdEmNoAIljBfeBn80dpv4ek<Object>(this)));
        } else {
            this.n.a(Disposables.a());
        }
    }
}
