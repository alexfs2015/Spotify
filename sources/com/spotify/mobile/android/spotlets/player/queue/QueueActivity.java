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

public class QueueActivity extends lbm implements a, a, uqq {
    public kk g;
    public Flowable<fqn> h;
    public Scheduler i;
    private final CompositeDisposable j = new CompositeDisposable();

    /* access modifiers changed from: private */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:58)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:48)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    public static /* synthetic */ void a(java.lang.Throwable r1) {
        /*
            r0 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.player.queue.QueueActivity.a(java.lang.Throwable):void");
    }

    /* access modifiers changed from: private */
    public void b(Fragment fragment) {
        kr a = this.g.a();
        a.b(R.id.container, fragment, null);
        a.c();
    }

    public final sso ae_() {
        return ViewUris.Y;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.NOWPLAYING_QUEUE, ViewUris.Y.toString());
    }

    public final uqm ag() {
        return uqo.aD;
    }

    public final gkq aj() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_queue);
    }

    public void onStart() {
        super.onStart();
        this.j.a(this.h.a(0).f($$Lambda$7FO4ermqbhNylb7WYSH4V0XpZs.INSTANCE).a(this.i).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                QueueActivity.this.b((iye) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$QueueActivity$ljG45Ue0mogRV54rr01RhiByl9M.INSTANCE));
    }

    public void onStop() {
        super.onStop();
        this.j.c();
    }
}
