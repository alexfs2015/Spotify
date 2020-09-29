package defpackage;

import android.content.Context;
import android.content.Intent;
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

/* renamed from: sym reason: default package */
public class sym extends ssu implements syj {
    public syw T;
    private final Uri U = Uri.parse("https://www.spotify.com/is/legal/privacy-policy/");
    private Disposable V;
    public syn a;
    public syi b;

    public static sym a(syq syq) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("moderation_view_config", syq);
        sym sym = new sym();
        sym.g(bundle);
        return sym;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(syq syq, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", str);
        syn syn = this.a;
        Builder buildUpon = Uri.parse("https://app-report.spotify.com/").buildUpon();
        String a2 = syn.a.a();
        StringBuilder sb = new StringBuilder("android-");
        sb.append(a2);
        String sb2 = sb.toString();
        String uri = buildUpon.appendQueryParameter("version", sb2).appendQueryParameter("platform", "Android").appendQueryParameter("view_uri", syq.a().toString()).appendQueryParameter("uris", fbl.a(",").a((Iterable<?>) syq.b())).build().toString();
        if (this.W != null) {
            a(uri, (Map<String, String>) hashMap);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(syq syq, Throwable th) {
        StringBuilder sb = new StringBuilder("Error rendering model for uri(s): ");
        sb.append(fbl.a(",").a((Iterable<?>) syq.b()));
        Logger.e(th, sb.toString(), new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a.a();
    }

    public final void B() {
        super.B();
        this.V.bd_();
    }

    public final void a() {
        kf p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.b.a = this;
        ((SpotifyIconView) view.findViewById(R.id.moderation_close_button)).setOnClickListener(new $$Lambda$sym$wdFzcNmd_JFHp9N7jKg_nBUiCsk(this));
    }

    public final boolean a(Uri uri) {
        if (!uri.equals(this.U) || n() == null) {
            return super.a(uri);
        }
        n().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    public final boolean ac_() {
        return this.b.a();
    }

    public final void ah() {
        Bundle bundle = this.i;
        if (bundle != null) {
            syq syq = (syq) bundle.getParcelable("moderation_view_config");
            if (syq != null) {
                this.V = this.T.a().a((Consumer<? super T>) new $$Lambda$sym$ELoxfu3e29U37fKJmIaGwcdddZU<Object>(this, syq), (Consumer<? super Throwable>) new $$Lambda$sym$SKbS1vie_5e4qfW9smq9tYbOIMo<Object>(syq));
                return;
            }
            throw new IllegalStateException("ViewConfig is missing");
        }
        throw new IllegalStateException("ModerationReportFragment has no arguments");
    }

    public final int ai() {
        return R.layout.fragment_moderation;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final boolean b() {
        WebView webView = this.W;
        return (webView != null && webView.canGoBack() ? new ssr(webView) : new sss()).a();
    }
}
