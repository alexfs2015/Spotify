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

/* renamed from: mfx reason: default package */
public class mfx extends ssu implements a, a, a, a {
    public hhc T;
    public mgi U;
    public mge V;
    private Uri Y;
    private xip Z;
    public mfz a;
    private SpotifyIconView aa;
    public jlr b;

    public static mfx a(mfw mfw) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("premium_signup_configuration", mfw);
        mfx mfx = new mfx();
        mfx.g(bundle);
        return mfx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.b();
    }

    /* access modifiers changed from: private */
    public void c(String str) {
        if (this.W != null) {
            d(str);
        } else {
            Assertion.b("Attempted to render url while view was detached.");
        }
    }

    public final void a(Context context) {
        Uri uri;
        why.a(this);
        super.a(context);
        mfw c = c();
        if (c.d()) {
            mfv mfv = new mfv();
            uri = c.c();
            boolean z = false;
            if (uri.getHost().endsWith("spotify.com")) {
                Collection values = mfv.b.values();
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
                String str = (String) mfv.b.get(mfv.a);
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
        this.a = new mfz(this, new mfy(this.b, c.a()));
    }

    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.aa = (SpotifyIconView) view.findViewById(R.id.btn_close);
        this.aa.setOnClickListener(new $$Lambda$mfx$NpFSIix49JmVE7RZCpPRzym_w(this));
        this.aa.a(SpotifyIconV2.X);
        TextView textView = (TextView) view.findViewById(R.id.premium_signup_title);
        String b2 = c().b();
        if (b2 == null) {
            b2 = o().getResources().getString(R.string.premium_signup_title);
        }
        textView.setText(b2);
        if (bundle != null) {
            mfy mfy = this.a.a;
            mfy.a(new p(mfy.a));
        }
    }

    public final boolean a(Uri uri) {
        return this.U.a(uri);
    }

    public final boolean ac_() {
        return this.a.a();
    }

    public final void ae() {
        kf p = p();
        if (p != null) {
            p.finish();
        }
    }

    public final boolean af() {
        WebView webView = this.W;
        return (webView != null && webView.canGoBack() ? new a(webView, 0) : new b(0)).a();
    }

    public final void ah() {
        this.Z = this.V.a(this.Y).a(wit.a(this.T.c())).a(1).e((xiy<? super T, ? extends R>) $$Lambda$6DtGDRJJ5FINF_Ius5KHTj26ODs.INSTANCE).a((xis<? super T>) new $$Lambda$mfx$do1vnGMg5v1GNJ8XpAC0nCXETIk<Object>(this), (xis<Throwable>) $$Lambda$mfx$dFMWLttWe7qa5grqh7GmCibyZfg.INSTANCE);
    }

    public final int ai() {
        return R.layout.fragment_premium_signup;
    }

    public final void aw_() {
        hhf.a(this.Z);
        super.aw_();
    }

    public final void b(Intent intent) {
        a(intent);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        c_(true);
    }

    public final void b(String str) {
        Intent intent = new Intent();
        intent.putExtra("reason", str);
        kf p = p();
        if (p != null) {
            p.setResult(-1, intent);
            p.finish();
        }
    }

    public final mfw c() {
        Bundle bundle = this.i;
        if (bundle != null) {
            mfw mfw = (mfw) bundle.getParcelable("premium_signup_configuration");
            if (mfw != null) {
                return mfw;
            }
            throw new IllegalStateException("PremiumSignupFragment is not configured");
        }
        throw new IllegalStateException("PremiumSignupFragment has no arguments");
    }

    public final void c(Intent intent) {
        a(intent);
        this.W.stopLoading();
        kf p = p();
        if (p != null) {
            p.finish();
        }
    }
}
