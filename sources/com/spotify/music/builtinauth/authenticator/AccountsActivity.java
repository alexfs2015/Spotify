package com.spotify.music.builtinauth.authenticator;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.sso.ErrorMessage;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

public class AccountsActivity extends Activity {
    private WebView a;

    class a extends WebViewClient {
        private final jgx a;

        public a(jgx jgx) {
            this.a = jgx;
        }

        private boolean a(Uri uri) {
            if (uri.toString().startsWith(this.a.a.b())) {
                AccountsActivity.a(AccountsActivity.this, uri);
                return true;
            } else if (jgu.a().equals(uri.getAuthority())) {
                return false;
            } else {
                AccountsActivity.this.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            Logger.c("Page loaded: %s", str);
            super.onPageFinished(webView, str);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.e("%s request failed with an error %s", webResourceRequest, webResourceError);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.mMessage);
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            Logger.e("%s received HTTP error %s", webResourceRequest, webResourceResponse);
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.mMessage);
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Logger.e("SSL error %s", sslError);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.mMessage);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl());
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(Uri.parse(str));
        }
    }

    public static Intent a(Context context, kwh kwh) {
        Intent intent = new Intent(context, AccountsActivity.class);
        intent.putExtra("params", kwh);
        intent.addFlags(335544320);
        return intent;
    }

    public static kwi a(Intent intent) {
        return (kwi) intent.getParcelableExtra("result");
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        mh.a(context).a(broadcastReceiver, new IntentFilter("accounts.actions"));
    }

    static /* synthetic */ void a(AccountsActivity accountsActivity, Uri uri) {
        accountsActivity.a((kwi) jgq.a(uri).a((gee<defpackage.jgp.a, R_>) $$Lambda$AccountsActivity$RQ7nVaeepyP6ZsfpTnOE9C56av4.INSTANCE, (gee<b, R_>) $$Lambda$AccountsActivity$PPEH1dUO3yYmDt2ne2nCl0PZrGA.INSTANCE, (gee<d, R_>) $$Lambda$AccountsActivity$SeL6kyPkY08gYbP3L6xKpKYdsHI.INSTANCE, (gee<e, R_>) $$Lambda$AccountsActivity$EJe_6aF8lZFUWzYVkflQZJw5vpY.INSTANCE, (gee<c, R_>) $$Lambda$AccountsActivity$hTYJYM_XZjkDxvB1PkOdOQA2HI.INSTANCE));
        accountsActivity.finish();
    }

    static /* synthetic */ void a(AccountsActivity accountsActivity, String str) {
        accountsActivity.a(new kwi(false, str, null));
        accountsActivity.finish();
    }

    private void a(kwi kwi) {
        mh a2 = mh.a(getApplicationContext());
        Intent intent = new Intent("accounts.actions");
        intent.putExtra("result", kwi);
        a2.a(intent);
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        mh.a(context).a(broadcastReceiver);
    }

    public void finish() {
        this.a.loadUrl("about:blank");
        super.finish();
    }

    public void onBackPressed() {
        a(new kwi(false, "Canceled", null));
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_accounts);
        kwh kwh = (kwh) getIntent().getParcelableExtra("params");
        Assertion.a((Object) kwh, "EXTRA_ACCOUNTS_PARAMS must be present!");
        jgx jgx = new jgx(kwh.a, kwh.b, kwh.c, kwh.d, null, kwh.e, false);
        this.a = (WebView) findViewById(R.id.com_spotify_sdk_login_webview);
        if (VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        this.a.setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.setWebViewClient(new a(jgx));
        CookieManager.getInstance().setCookie(kwh.f.getDomain(), kwh.f.toString());
        this.a.loadUrl(jgx.a().toString());
    }
}
