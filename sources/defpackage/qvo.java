package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter.ViewType;
import com.spotify.music.features.trackcredits.model.Artist;
import com.spotify.music.features.trackcredits.model.RoleCredits;
import com.spotify.music.features.trackcredits.model.Source;
import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qvo reason: default package */
public final class qvo implements a {
    public qvp a;
    Disposable b = Disposables.b();
    private final String c;
    private final qvt d;
    private final Scheduler e;

    public qvo(String str, qvt qvt, Scheduler scheduler, a aVar) {
        this.c = str;
        this.d = qvt;
        this.e = scheduler;
        aVar.a(new c() {
            public final void a() {
                qvo.this.b.bd_();
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(TrackCredits trackCredits) {
        this.a.c();
        this.a.a(trackCredits.trackTitle());
        ArrayList a2 = Lists.a();
        for (RoleCredits roleCredits : trackCredits.roleCredits()) {
            a2.add(qvs.a(roleCredits.roleTitle(), ViewType.HEADER));
            if (roleCredits.artists().isEmpty()) {
                a2.add(qvs.a("–", ViewType.ROW));
            } else {
                for (Artist artist : roleCredits.artists()) {
                    String name = artist.name();
                    String externalUrl = artist.externalUrl();
                    ViewType viewType = ViewType.ROW;
                    a2.add(fbo.a(externalUrl) ? qvs.a(name, viewType) : new qvr(name, Optional.b(externalUrl), viewType));
                }
            }
        }
        Source source = trackCredits.source();
        if (source != null) {
            a2.add(qvs.a(source.label(), ViewType.HEADER));
            a2.add(qvs.a(source.value(), ViewType.ROW));
        }
        a2.add(qvs.a("Report Error", ViewType.REPORT_ERROR));
        this.a.a((List<qvs>) a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.c();
        this.a.d();
    }

    public final void a() {
        this.a.f();
    }

    public final void b() {
        this.a.e();
        this.b.bd_();
        c();
    }

    public void c() {
        this.a.b();
        this.b = this.d.a(this.c.replaceFirst("spotify:track:", "")).a(this.e).a((Consumer<? super T>) new $$Lambda$qvo$PX5tXTHM3n8wL5tizpGT8BXezqw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qvo$88Md880glhU4W_nbKRQggUfdhEU<Object>(this));
    }
}
