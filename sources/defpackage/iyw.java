package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: iyw reason: default package */
public abstract class iyw extends kyd implements a {
    public izl g;
    public iya h;
    public Scheduler i;
    public jsz j;
    public ixv k;
    private Disposable l;
    private boolean m;

    public abstract int k();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.story_share_loader_layout);
    }

    private String l() {
        return getIntent().getStringExtra("spotify_link");
    }

    private String m() {
        return izl.a(getIntent().getStringExtra("complete_share_uri"), this.h.b(), this.h.c());
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("spotify_link", l());
        bundle.putString("complete_share_uri", m());
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.l = this.k.a(l(), m()).a(this.i).a((Consumer<? super T>) new $$Lambda$iyw$7w4AIgLtfWFsi9C50yB7jp6SE<Object>(this), (Consumer<? super Throwable>) new $$Lambda$iyw$LuHrj8iIRAYvViv0kxDeUaGFDQ<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent) {
        try {
            Logger.b("Shared Intent with Application (intent='%s')", intent);
            startActivityForResult(intent, 0);
            this.m = true;
        } catch (ActivityNotFoundException unused) {
            n();
        }
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        Logger.e("Unable to complete share with Application (throwable='%s')", th);
        n();
        finish();
    }

    private void n() {
        this.j.a(k(), 1, new Object[0]);
    }

    public void onPause() {
        super.onPause();
        if (!isChangingConfigurations()) {
            finish();
        }
    }

    public void onStop() {
        super.onStop();
        Disposable disposable = this.l;
        if (disposable != null && !disposable.b()) {
            this.l.bf_();
            this.l = null;
        }
    }
}
