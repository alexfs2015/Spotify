package com.spotify.mobile.android.spotlets.player.queue;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public class QueueActivity extends kyd implements a, a, udv {
    public kf g;
    public Flowable<fpt> h;
    public Scheduler i;
    private final CompositeDisposable j = new CompositeDisposable();

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_queue);
    }

    public void onStart() {
        super.onStart();
        this.j.a(this.h.a(0).f($$Lambda$Yuh94C9wFEVcP5bgwtJoYZ5nRE.INSTANCE).a(this.i).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                QueueActivity.this.b((ivt) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$QueueActivity$ljG45Ue0mogRV54rr01RhiByl9M.INSTANCE));
    }

    public void onStop() {
        super.onStop();
        this.j.c();
    }

    public final sih ae_() {
        return ViewUris.Z;
    }

    public final udr ag() {
        return udt.aD;
    }

    public final gjf aj() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    /* access modifiers changed from: private */
    public void b(Fragment fragment) {
        km a = this.g.a();
        a.b(R.id.container, fragment, null);
        a.c();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.NOWPLAYING_QUEUE, ViewUris.Z.toString());
    }
}
