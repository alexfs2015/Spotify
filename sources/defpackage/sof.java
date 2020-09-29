package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sof reason: default package */
public class sof extends sin implements soc {
    public sop T;
    private Disposable U;
    public sog a;
    public sob b;

    public final int ai() {
        return R.layout.fragment_moderation;
    }

    public static sof a(soj soj) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("moderation_view_config", soj);
        sof sof = new sof();
        sof.g(bundle);
        return sof;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.a = this;
        ((SpotifyIconView) view.findViewById(R.id.moderation_close_button)).setOnClickListener(new $$Lambda$sof$DUElZQJvcFnBTowDjG8Dkby3Xu0(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a.a();
    }

    public final void B() {
        super.B();
        this.U.bf_();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(soj soj, Throwable th) {
        StringBuilder sb = new StringBuilder("Error rendering model for uri(s): ");
        sb.append(fau.a(",").a((Iterable<?>) soj.b()));
        Logger.e(th, sb.toString(), new Object[0]);
    }

    public final boolean ac_() {
        return this.b.a();
    }

    public final void a() {
        ka p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final void ah() {
        Bundle bundle = this.i;
        if (bundle != null) {
            soj soj = (soj) bundle.getParcelable("moderation_view_config");
            if (soj != null) {
                this.U = this.T.a().a((Consumer<? super T>) new $$Lambda$sof$gLhNyR6Cn7g9VzJSj2QZnda1RSA<Object>(this, soj), (Consumer<? super Throwable>) new $$Lambda$sof$g8XENHYHqysv5s9cI2RWtj9jA4E<Object>(soj));
                return;
            }
            throw new IllegalStateException("ViewConfig is missing");
        }
        throw new IllegalStateException("ModerationReportFragment has no arguments");
    }

    public final boolean b() {
        sij sij;
        WebView webView = this.W;
        if (webView != null && webView.canGoBack()) {
            sij = new sik(webView);
        } else {
            sij = new sil();
        }
        return sij.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(soj soj, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", str);
        sog sog = this.a;
        Builder buildUpon = Uri.parse("https://app-report.spotify.com/").buildUpon();
        String a2 = sog.a.a();
        StringBuilder sb = new StringBuilder("android-");
        sb.append(a2);
        String sb2 = sb.toString();
        String uri = buildUpon.appendQueryParameter("version", sb2).appendQueryParameter("platform", "Android").appendQueryParameter("view_uri", soj.a().toString()).appendQueryParameter("uris", fau.a(",").a((Iterable<?>) soj.b())).build().toString();
        if (this.W != null) {
            a(uri, (Map<String, String>) hashMap);
        }
    }
}
