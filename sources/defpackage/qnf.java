package defpackage;

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

/* renamed from: qnf reason: default package */
public final class qnf implements a {
    public qng a;
    Disposable b = Disposables.b();
    private final String c;
    private final qnk d;
    private final Scheduler e;

    public qnf(String str, qnk qnk, Scheduler scheduler, a aVar) {
        this.c = str;
        this.d = qnk;
        this.e = scheduler;
        aVar.a(new c() {
            public final void a() {
                qnf.this.b.bf_();
            }
        });
    }

    public final void a() {
        this.a.f();
    }

    public final void b() {
        this.a.e();
        this.b.bf_();
        c();
    }

    public void c() {
        this.a.b();
        this.b = this.d.a(this.c.replaceFirst("spotify:track:", "")).a(this.e).a((Consumer<? super T>) new $$Lambda$qnf$QBwLbaJYtB_V2Ens0ivdoGdS2ZM<Object>(this), (Consumer<? super Throwable>) new $$Lambda$qnf$mY17j31RcC4nKdAmX6vhSFjCRA<Object>(this));
    }

    /* access modifiers changed from: private */
    public void a(TrackCredits trackCredits) {
        this.a.c();
        this.a.a(trackCredits.trackTitle());
        ArrayList a2 = Lists.a();
        for (RoleCredits roleCredits : trackCredits.roleCredits()) {
            a2.add(qnj.a(roleCredits.roleTitle(), ViewType.HEADER));
            if (roleCredits.artists().isEmpty()) {
                a2.add(qnj.a("–", ViewType.ROW));
            } else {
                for (Artist name : roleCredits.artists()) {
                    a2.add(qnj.a(name.name(), ViewType.ROW));
                }
            }
        }
        Source source = trackCredits.source();
        if (source != null) {
            a2.add(qnj.a(source.label(), ViewType.HEADER));
            a2.add(qnj.a(source.value(), ViewType.ROW));
        }
        a2.add(qnj.a("Report Error", ViewType.REPORT_ERROR));
        this.a.a((List<qnj>) a2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.a.c();
        this.a.d();
    }
}
