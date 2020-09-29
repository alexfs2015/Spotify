package defpackage;

import com.spotify.music.R;
import com.spotify.music.connection.OfflineState;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.List;

/* renamed from: mhp reason: default package */
public final class mhp {
    public Disposable a = Disposables.b();
    public Disposable b = Disposables.b();
    public int c;
    public a d;
    private final mhh e;
    private final ufm f;
    private final Scheduler g;
    private boolean h;
    private boolean i;

    /* renamed from: mhp$a */
    public interface a {
        void onUpdate();
    }

    public mhp(mhh mhh, ufm ufm, Scheduler scheduler) {
        this.e = mhh;
        this.f = ufm;
        this.g = scheduler;
    }

    public final void a() {
        this.a = this.f.a.a((Consumer<? super T>) new $$Lambda$mhp$xGxPumiC1uxvyE2hbBlQ7nLWSNU<Object>(this), (Consumer<? super Throwable>) $$Lambda$mhp$1cwTp2wzl1Qnj0DHrDbvvTVius.INSTANCE);
        this.b = this.e.a().a(this.g).a((Consumer<? super T>) new $$Lambda$mhp$imGDlL_N8Q2gzV87GQ59IZU3EIg<Object>(this), (Consumer<? super Throwable>) $$Lambda$mhp$qhzdlogpi8KaaKx0x7XuqzNit00.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(OfflineState offlineState) {
        this.h = offlineState.offline();
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        this.i = list.size() > 0;
        if (list.size() == 1) {
            this.i = !((grz) list.get(0)).isSelf();
        }
        b();
    }

    private void b() {
        this.c = 0;
        if (this.h) {
            this.c = R.string.connect_picker_no_internet;
        } else if (!this.i) {
            this.c = R.string.connect_picker_no_device;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.onUpdate();
        }
    }
}
