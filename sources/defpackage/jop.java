package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;
import com.spotify.music.connection.OfflineReason;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;

/* renamed from: jop reason: default package */
public class jop extends jor {
    public jqs T;
    private TextView U;
    private int V;
    private final Runnable W = new $$Lambda$jop$TH_bVmfQBENA9D1An0k3SJwjFrE(this);
    private final Handler X = new Handler();
    private wuk Y;
    public kxz a;
    public heg b;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_offline_bar, viewGroup, false);
        this.V = o().getResources().getInteger(R.integer.offline_bar_show_delay);
        this.U = (TextView) inflate.findViewById(R.id.text);
        jqs jqs = this.T;
        if (jqs != null) {
            jqs.a(false);
        }
        return inflate;
    }

    public final void g() {
        super.g();
        this.Y = vun.a((ObservableSource<T>) this.a.a, BackpressureStrategy.BUFFER).a(vun.a(this.b.c())).a((wun<? super T>) new $$Lambda$jop$pwqZMcGSe7CMUpa5dudBxbqMzL8<Object>(this), (wun<Throwable>) $$Lambda$jop$6x5muKZnjTN7cXY3IFNP_OSEovg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(kxx kxx) {
        kxx.a((gcs<c>) new $$Lambda$jop$p9yFzieTP5ZlXfhtXLdtkR_wgHA<c>(this), (gcs<b>) new $$Lambda$jop$7Atl_BC0kxSahSJdt7ZoslPCXo0<b>(this), (gcs<a>) new $$Lambda$jop$J_MrKhd5DOtNqi0R_l1OjfTRoOY<a>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        c();
    }

    public final void h() {
        this.Y.unsubscribe();
        super.h();
    }

    public final void B() {
        this.X.removeCallbacks(this.W);
        super.B();
    }

    private void c() {
        this.U.setText(R.string.main_spotify_has_no_internet_connection);
        this.X.postDelayed(this.W, (long) this.V);
    }

    /* access modifiers changed from: private */
    public void e() {
        jqs jqs = this.T;
        if (jqs != null) {
            jqs.a(true);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (bVar.a == OfflineReason.FORCED_OFFLINE) {
            this.U.setText(R.string.main_spotify_is_in_offline_mode);
            this.X.post(this.W);
            return;
        }
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.X.removeCallbacks(this.W);
        jqs jqs = this.T;
        if (jqs != null) {
            jqs.a(false);
        }
    }
}
