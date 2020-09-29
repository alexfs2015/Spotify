package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: mbu reason: default package */
public class mbu extends sin implements a, a, a, a {
    public heg T;
    public mcf U;
    public mcb V;
    private Uri Y;
    private wuk Z;
    public mbw a;
    private SpotifyIconView aa;
    public jjf b;

    public final int ai() {
        return R.layout.fragment_premium_signup;
    }

    public static mbu a(mbt mbt) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("premium_signup_configuration", mbt);
        mbu mbu = new mbu();
        mbu.g(bundle);
        return mbu;
    }

    public final void a(Context context) {
        Uri uri;
        vts.a(this);
        super.a(context);
        mbt c = c();
        if (c.d()) {
            mbs mbs = new mbs();
            uri = c.c();
            boolean z = false;
            if (uri.getHost().endsWith("spotify.com")) {
                Collection values = mbs.b.values();
                Iterator it = uri.getPathSegments().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (values.contains((String) it.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                String path = uri.getPath();
                String str = (String) mbs.b.get(mbs.a);
                if (str == null) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(path);
                uri = uri.buildUpon().path(sb.toString()).build();
            }
        } else {
            uri = c.c();
        }
        this.Y = uri;
        this.a = new mbw(this, new mbv(this.b, c.a()));
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.aa = (SpotifyIconView) view.findViewById(R.id.btn_close);
        this.aa.setOnClickListener(new $$Lambda$mbu$f6XHjv4cgjZKNA4QVSNMiiEOiV4(this));
        this.aa.a(SpotifyIconV2.X);
        TextView textView = (TextView) view.findViewById(R.id.premium_signup_title);
        String b2 = c().b();
        if (b2 == null) {
            b2 = o().getResources().getString(R.string.premium_signup_title);
        }
        textView.setText(b2);
        if (bundle != null) {
            mbv mbv = this.a.a;
            mbv.a(new p(mbv.a));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.b();
    }

    public final void ah() {
        this.Z = this.V.a(this.Y).a(vun.a(this.T.c())).a(1).f($$Lambda$OCJW9V6gjvAUXizEJ7WCwJGny2w.INSTANCE).a((wun<? super T>) new $$Lambda$mbu$jPfBRzAQlYDZhjDXlT3ajQnTwLw<Object>(this), (wun<Throwable>) $$Lambda$mbu$b9PPF3zIlQI2XjYDIo2Ew54XmZc.INSTANCE);
    }

    public final void ax_() {
        hej.a(this.Z);
        super.ax_();
    }

    public final boolean ac_() {
        return this.a.a();
    }

    public final boolean a(Uri uri) {
        return this.U.a(uri);
    }

    public final void ae() {
        ka p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final void b(Intent intent) {
        a(intent);
    }

    public final void c(Intent intent) {
        a(intent);
        this.W.stopLoading();
        ka p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final void b(String str) {
        Intent intent = new Intent();
        intent.putExtra("reason", str);
        ka p = p();
        if (p != null) {
            p.setResult(-1, intent);
            p.finish();
        }
    }

    public final mbt c() {
        Bundle bundle = this.i;
        if (bundle != null) {
            mbt mbt = (mbt) bundle.getParcelable("premium_signup_configuration");
            if (mbt != null) {
                return mbt;
            }
            throw new IllegalStateException("PremiumSignupFragment is not configured");
        }
        throw new IllegalStateException("PremiumSignupFragment has no arguments");
    }

    /* access modifiers changed from: private */
    public void c(String str) {
        if (this.W != null) {
            d(str);
        } else {
            Assertion.b("Attempted to render url while view was detached.");
        }
    }

    public final boolean af() {
        mbr mbr;
        WebView webView = this.W;
        if (webView != null && webView.canGoBack()) {
            mbr = new a(webView, 0);
        } else {
            mbr = new b(0);
        }
        return mbr.a();
    }
}
