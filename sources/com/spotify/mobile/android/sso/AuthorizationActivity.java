package com.spotify.mobile.android.sso;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import java.net.HttpCookie;
import java.util.Locale;

public class AuthorizationActivity extends lbm implements jhu, kmm<jhk, jhi> {
    public jij g;
    public b<jhk, jhi> h;
    public jgn i;
    public uug j;
    private jhx k;
    /* access modifiers changed from: private */
    public ProgressDialog l;
    /* access modifiers changed from: private */
    public boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public jgx o;
    /* access modifiers changed from: private */
    public WebView p;
    /* access modifiers changed from: private */
    public String q = "";

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        String str = "nesrcc eaeluhd Ts";
        Logger.e("The user canceled", new Object[0]);
        l();
    }

    private void a(d dVar) {
        a(dVar.a, dVar.b, dVar.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jgp jgp, a aVar) {
        a aVar2 = (a) jgp;
        jhx m2 = m();
        Bundle a = m2.a(aVar2.a, aVar2.c);
        if (!isFinishing()) {
            setResult(-1, m2.a(a));
            finish();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jgp jgp, b bVar) {
        b bVar2 = (b) jgp;
        jhx m2 = m();
        Bundle a = m2.a(bVar2.a, bVar2.c);
        if (!isFinishing()) {
            Uri a2 = m().a(Uri.parse(this.q), bVar2);
            if (a2 != null) {
                String str = "tinm.ditniInearodEtc.Vno.a";
                startActivity(new Intent("android.intent.action.VIEW", a2));
            }
            setResult(-1, m2.a(a));
            finish();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jgp jgp, c cVar) {
        a((d) jgp);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jgp jgp, d dVar) {
        a((d) jgp);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jgp jgp, e eVar) {
        a((d) jgp);
    }

    private void b(ErrorMessage errorMessage, String str) {
        Uri a = m().a(Uri.parse(this.q), errorMessage, str);
        if (a != null) {
            startActivity(new Intent("android.intent.action.VIEW", a));
        }
    }

    static /* synthetic */ String d(AuthorizationActivity authorizationActivity) {
        jgx jgx = authorizationActivity.o;
        if (jgx != null) {
            String g2 = jgx.a.g();
            if (g2 != null) {
                return g2;
            }
        }
        return "";
    }

    private void l() {
        if (!isFinishing()) {
            b(ErrorMessage.CANCELLED, null);
            setResult(0);
            finish();
        }
    }

    private jhx m() {
        String str = "n pnoeoaoha ttirenlpo h so p-tcsb eT";
        Assertion.a((Object) this.k, "The in-app protocol has not been set");
        return (jhx) fbp.a(this.k);
    }

    public final void a(ErrorMessage errorMessage, int i2, String str) {
        a(errorMessage, getString(i2), str);
    }

    public final void a(ErrorMessage errorMessage, String str) {
        a(errorMessage, (String) null, str);
    }

    public final void a(ErrorMessage errorMessage, String str, String str2) {
        if (!isFinishing()) {
            Logger.e(errorMessage.mMessage, new Object[0]);
            b(errorMessage, str);
            setResult(-2, m().a(errorMessage, str, str2));
            finish();
        }
    }

    public final void a(String str) {
        jgp a = jgq.a(Uri.parse(str));
        a.a((ged<a>) new ged(a) {
            private final /* synthetic */ jgp f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (a) obj);
            }
        }, (ged<b>) new ged(a) {
            private final /* synthetic */ jgp f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (b) obj);
            }
        }, (ged<d>) new ged(a) {
            private final /* synthetic */ jgp f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (d) obj);
            }
        }, (ged<e>) new ged(a) {
            private final /* synthetic */ jgp f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (e) obj);
            }
        }, (ged<c>) new ged(a) {
            private final /* synthetic */ jgp f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (c) obj);
            }
        });
    }

    public final void a(HttpCookie httpCookie, Uri uri, final String str) {
        this.p = (WebView) findViewById(R.id.com_spotify_sdk_login_webview);
        WebSettings settings = this.p.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        this.p.setWebViewClient(new WebViewClient() {
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                AuthorizationActivity.this.p.setVisibility(0);
                if (AuthorizationActivity.this.m) {
                    AuthorizationActivity.this.l.dismiss();
                }
            }

            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (AuthorizationActivity.this.m) {
                    AuthorizationActivity.this.l.show();
                }
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                Logger.e("%s, code: %s, failing url: %s", str, Integer.valueOf(i), str2);
                AuthorizationActivity.this.a(ErrorMessage.ACCOUNTS_SERVICE_ERROR, (String) null, AuthorizationActivity.d(AuthorizationActivity.this));
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                if (str.startsWith(str)) {
                    AuthorizationActivity.this.a(str);
                    return true;
                } else if (jgu.a().equals(parse.getAuthority())) {
                    return false;
                } else {
                    String str2 = "ndstacaiotodIEriVinn..Wtn.";
                    AuthorizationActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                }
            }
        });
        CookieManager.getInstance().setCookie(httpCookie.getDomain(), httpCookie.toString());
        this.p.loadUrl(uri.toString());
    }

    public kmn<jhk> connect(knw<jhi> knw) {
        return new kmn<jhk>() {
            public final /* synthetic */ void accept(Object obj) {
                AuthorizationRequest a2 = ((jhk) obj).a();
                if (a2 != null) {
                    jgx a3 = jgx.a(a2);
                    AuthorizationActivity.this.q = a3.a.b();
                    AuthorizationActivity.this.o = a3;
                }
            }

            public final void dispose() {
            }
        };
    }

    public void k() {
        startActivityForResult(jij.a(this), 1337);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == 0) {
            if (i2 == 1337) {
                String str = "wcL lbaaTnoi  eghfensecwod ";
                Logger.e("The Login flow was canceled", new Object[0]);
            }
            l();
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onAttachedToWindow() {
        this.m = true;
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        l();
        String str = "acr nsbdheuecTlee";
        Logger.e("The user canceled", new Object[0]);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        jhx jhx = null;
        if (callingPackage != null) {
            this.j.a(null, Uri.parse(callingPackage));
        }
        this.h.a(this);
        Intent intent = getIntent();
        String c = jig.c(intent);
        String str = "1";
        if ("1".equals(c)) {
            jhx = new jib();
        } else {
            String str2 = "vs-oosnt";
            if ("sonos-v1".equals(c)) {
                jhx = new jhz();
            } else {
                if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
                    jhx = new jhy();
                } else if (intent.getDataString() != null && jig.a(intent.getDataString())) {
                    jhx = new jia();
                }
            }
        }
        this.k = jhx;
        try {
            setContentView((int) R.layout.activity_sdk_sso);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                String str3 = "epwbevw";
                if (e.getMessage().toLowerCase(Locale.ENGLISH).contains("webview")) {
                    String str4 = "ymrw aieVttylnne   T ieTb eutnlbi astno pghaseesah  libet . tWriedosrava  rigawigo";
                    String str5 = "";
                    a(ErrorMessage.g, "The system WebView is not available right now or is being updated. Try again later", "");
                }
            }
            throw e;
        }
        this.l = new ProgressDialog(this, 2132017715);
        this.l.setMessage(getString(R.string.placeholders_loading));
        this.l.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                AuthorizationActivity.this.a(dialogInterface);
            }
        });
        this.l.show();
        this.n = bundle != null;
    }

    public void onDestroy() {
        this.h.b();
        ProgressDialog progressDialog = this.l;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    public void onDetachedFromWindow() {
        this.m = false;
        super.onDetachedFromWindow();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.i.a((Intent) fbp.a(intent));
    }

    public void onPause() {
        super.onPause();
        this.h.d();
    }

    public void onResume() {
        super.onResume();
        this.h.c();
        if (!this.n) {
            this.i.a((Intent) fbp.a(getIntent()));
        }
    }
}
