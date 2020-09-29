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

public class AuthorizationActivity extends kyd implements jff, kjd<jev, jet> {
    public jfu g;
    public b<jev, jet> h;
    public jdy i;
    public uiv j;
    private jfi k;
    /* access modifiers changed from: private */
    public ProgressDialog l;
    /* access modifiers changed from: private */
    public boolean m;
    private boolean n;
    /* access modifiers changed from: private */
    public jei o;
    /* access modifiers changed from: private */
    public WebView p;
    /* access modifiers changed from: private */
    public String q = "";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        jfi jfi = null;
        if (callingPackage != null) {
            this.j.a(null, Uri.parse(callingPackage));
        }
        this.h.a(this);
        Intent intent = getIntent();
        String c = jfr.c(intent);
        if ("1".equals(c)) {
            jfi = new jfm();
        } else if ("sonos-v1".equals(c)) {
            jfi = new jfk();
        } else {
            if ("com.spotify.sso.action.START_GOOGLE_AUTH_FLOW_V1".equals(intent.getAction())) {
                jfi = new jfj();
            } else if (intent.getDataString() != null && jfr.a(intent.getDataString())) {
                jfi = new jfl();
            }
        }
        this.k = jfi;
        try {
            setContentView((int) R.layout.activity_sdk_sso);
        } catch (Exception e) {
            if (e.getMessage() == null || !e.getMessage().toLowerCase(Locale.ENGLISH).contains("webview")) {
                throw e;
            }
            a(ErrorMessage.g, "The system WebView is not available right now or is being updated. Try again later", "");
        }
        this.l = new ProgressDialog(this, 2132017712);
        this.l.setMessage(getString(R.string.placeholders_loading));
        this.l.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                AuthorizationActivity.this.a(dialogInterface);
            }
        });
        this.l.show();
        this.n = bundle != null;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.i.a((Intent) fay.a(intent));
    }

    public void onResume() {
        super.onResume();
        this.h.c();
        if (!this.n) {
            this.i.a((Intent) fay.a(getIntent()));
        }
    }

    public void onPause() {
        super.onPause();
        this.h.d();
    }

    public void k() {
        startActivityForResult(jfu.a(this), 1337);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        Logger.e("The user canceled", new Object[0]);
        l();
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

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                if (str.startsWith(str)) {
                    AuthorizationActivity.this.a(str);
                    return true;
                } else if (jef.a().equals(parse.getAuthority())) {
                    return false;
                } else {
                    AuthorizationActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                }
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                Logger.e("%s, code: %s, failing url: %s", str, Integer.valueOf(i), str2);
                AuthorizationActivity.this.a(ErrorMessage.ACCOUNTS_SERVICE_ERROR, (String) null, AuthorizationActivity.d(AuthorizationActivity.this));
            }
        });
        CookieManager.getInstance().setCookie(httpCookie.getDomain(), httpCookie.toString());
        this.p.loadUrl(uri.toString());
    }

    public final void a(ErrorMessage errorMessage, String str) {
        a(errorMessage, (String) null, str);
    }

    public final void a(ErrorMessage errorMessage, int i2, String str) {
        a(errorMessage, getString(i2), str);
    }

    public final void a(ErrorMessage errorMessage, String str, String str2) {
        if (!isFinishing()) {
            Logger.e(errorMessage.mMessage, new Object[0]);
            b(errorMessage, str);
            setResult(-2, m().a(errorMessage, str, str2));
            finish();
        }
    }

    private void l() {
        if (!isFinishing()) {
            b(ErrorMessage.CANCELLED, null);
            setResult(0);
            finish();
        }
    }

    private void b(ErrorMessage errorMessage, String str) {
        Uri a = m().a(Uri.parse(this.q), errorMessage, str);
        if (a != null) {
            startActivity(new Intent("android.intent.action.VIEW", a));
        }
    }

    public void onAttachedToWindow() {
        this.m = true;
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.m = false;
        super.onDetachedFromWindow();
    }

    public void onBackPressed() {
        l();
        Logger.e("The user canceled", new Object[0]);
        super.onBackPressed();
    }

    public void onDestroy() {
        this.h.b();
        ProgressDialog progressDialog = this.l;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        super.onDestroy();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == 0) {
            if (i2 == 1337) {
                Logger.e("The Login flow was canceled", new Object[0]);
            }
            l();
        }
        super.onActivityResult(i2, i3, intent);
    }

    private jfi m() {
        Assertion.a((Object) this.k, "The in-app protocol has not been set");
        return (jfi) fay.a(this.k);
    }

    public kje<jev> connect(kkn<jet> kkn) {
        return new kje<jev>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                AuthorizationRequest a2 = ((jev) obj).a();
                if (a2 != null) {
                    jei a3 = jei.a(a2);
                    AuthorizationActivity.this.q = a3.a.b();
                    AuthorizationActivity.this.o = a3;
                }
            }
        };
    }

    public final void a(String str) {
        jea a = jeb.a(Uri.parse(str));
        a.a((gcs<a>) new gcs(a) {
            private final /* synthetic */ jea f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (a) obj);
            }
        }, (gcs<b>) new gcs(a) {
            private final /* synthetic */ jea f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (b) obj);
            }
        }, (gcs<d>) new gcs(a) {
            private final /* synthetic */ jea f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (d) obj);
            }
        }, (gcs<e>) new gcs(a) {
            private final /* synthetic */ jea f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (e) obj);
            }
        }, (gcs<c>) new gcs(a) {
            private final /* synthetic */ jea f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AuthorizationActivity.this.a(this.f$1, (c) obj);
            }
        });
    }

    private void a(d dVar) {
        a(dVar.a, dVar.b, dVar.c);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jea jea, c cVar) {
        a((d) jea);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jea jea, e eVar) {
        a((d) jea);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jea jea, d dVar) {
        a((d) jea);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jea jea, b bVar) {
        b bVar2 = (b) jea;
        jfi m2 = m();
        Bundle a = m2.a(bVar2.a, bVar2.c);
        if (!isFinishing()) {
            Uri a2 = m().a(Uri.parse(this.q), bVar2);
            if (a2 != null) {
                startActivity(new Intent("android.intent.action.VIEW", a2));
            }
            setResult(-1, m2.a(a));
            finish();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jea jea, a aVar) {
        a aVar2 = (a) jea;
        jfi m2 = m();
        Bundle a = m2.a(aVar2.a, aVar2.c);
        if (!isFinishing()) {
            setResult(-1, m2.a(a));
            finish();
        }
    }

    static /* synthetic */ String d(AuthorizationActivity authorizationActivity) {
        jei jei = authorizationActivity.o;
        if (jei != null) {
            String g2 = jei.a.g();
            if (g2 != null) {
                return g2;
            }
        }
        return "";
    }
}
