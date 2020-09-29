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

/* renamed from: jrb reason: default package */
public class jrb extends jrd {
    public jtd T;
    private TextView U;
    private int V;
    private final Runnable W = new $$Lambda$jrb$OyhdI7N5ho10hFCuvsxZOcnpYSk(this);
    private final Handler X = new Handler();
    private xip Y;
    public lbi a;
    public hhc b;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        c();
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
        jtd jtd = this.T;
        if (jtd != null) {
            jtd.a(false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(lbg lbg) {
        lbg.a((ged<c>) new $$Lambda$jrb$lFxuwMdcvXoRoPjwzkDQcm_Hb8<c>(this), (ged<b>) new $$Lambda$jrb$DWB5Gk4J2wKf3c2HdMO_ejTOBWc<b>(this), (ged<a>) new $$Lambda$jrb$02PmMUv4FjDByxcIcS26i_9Gjqs<a>(this));
    }

    private void c() {
        this.U.setText(R.string.main_spotify_has_no_internet_connection);
        this.X.postDelayed(this.W, (long) this.V);
    }

    /* access modifiers changed from: private */
    public void e() {
        jtd jtd = this.T;
        if (jtd != null) {
            jtd.a(true);
        }
    }

    public final void B() {
        this.X.removeCallbacks(this.W);
        super.B();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_offline_bar, viewGroup, false);
        this.V = o().getResources().getInteger(R.integer.offline_bar_show_delay);
        this.U = (TextView) inflate.findViewById(R.id.text);
        jtd jtd = this.T;
        if (jtd != null) {
            jtd.a(false);
        }
        return inflate;
    }

    public final void aP_() {
        super.aP_();
        this.Y = wit.a((ObservableSource<T>) this.a.a, BackpressureStrategy.BUFFER).a(wit.a(this.b.c())).a((xis<? super T>) new $$Lambda$jrb$C6UQMNEGPcrjhTqfTXjBECRx2cY<Object>(this), (xis<Throwable>) $$Lambda$jrb$j2XjTBHoZ3mGSaMBT19QZHZWiEc.INSTANCE);
    }

    public final void h() {
        this.Y.unsubscribe();
        super.h();
    }
}
