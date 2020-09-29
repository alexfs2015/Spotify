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
        private final jei a;

        public a(jei jei) {
            this.a = jei;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(Uri.parse(str));
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl());
        }

        private boolean a(Uri uri) {
            if (uri.toString().startsWith(this.a.a.b())) {
                AccountsActivity.a(AccountsActivity.this, uri);
                return true;
            } else if (jef.a().equals(uri.getAuthority())) {
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

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Logger.e("%s request failed with an error %s", webResourceRequest, webResourceError);
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            AccountsActivity.a(AccountsActivity.this, ErrorMessage.ACCOUNTS_SERVICE_ERROR.mMessage);
        }
    }

    public static Intent a(Context context, ksy ksy) {
        Intent intent = new Intent(context, AccountsActivity.class);
        intent.putExtra("params", ksy);
        intent.addFlags(335544320);
        return intent;
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        mc.a(context).a(broadcastReceiver, new IntentFilter("accounts.actions"));
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        mc.a(context).a(broadcastReceiver);
    }

    public static ksz a(Intent intent) {
        return (ksz) intent.getParcelableExtra("result");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_accounts);
        ksy ksy = (ksy) getIntent().getParcelableExtra("params");
        Assertion.a((Object) ksy, "EXTRA_ACCOUNTS_PARAMS must be present!");
        jei jei = new jei(ksy.a, ksy.b, ksy.c, ksy.d, null, ksy.e, false);
        this.a = (WebView) findViewById(R.id.com_spotify_sdk_login_webview);
        if (VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        this.a.setVisibility(0);
        this.a.getSettings().setJavaScriptEnabled(true);
        this.a.setWebViewClient(new a(jei));
        CookieManager.getInstance().setCookie(ksy.f.getDomain(), ksy.f.toString());
        this.a.loadUrl(jei.a().toString());
    }

    public void finish() {
        this.a.loadUrl("about:blank");
        super.finish();
    }

    private void a(ksz ksz) {
        mc a2 = mc.a(getApplicationContext());
        Intent intent = new Intent("accounts.actions");
        intent.putExtra("result", ksz);
        a2.a(intent);
    }

    public void onBackPressed() {
        a(new ksz(false, "Canceled", null));
        super.onBackPressed();
    }

    static /* synthetic */ void a(AccountsActivity accountsActivity, Uri uri) {
        accountsActivity.a((ksz) jeb.a(uri).a((gct<defpackage.jea.a, R_>) $$Lambda$AccountsActivity$_ZEXOgqYiW8Es981le8_y7Lroc.INSTANCE, (gct<b, R_>) $$Lambda$AccountsActivity$775sIuGwMCeSLcjtQ3NQLva7Njc.INSTANCE, (gct<d, R_>) $$Lambda$AccountsActivity$Om7A8VtAEDuwprmEI8fh_mHvCY.INSTANCE, (gct<e, R_>) $$Lambda$AccountsActivity$4C39GftR1XjvJyriHlUpM5eYPpg.INSTANCE, (gct<c, R_>) $$Lambda$AccountsActivity$CnF927EvhSiL2oy6Hddnlq2FFoE.INSTANCE));
        accountsActivity.finish();
    }

    static /* synthetic */ void a(AccountsActivity accountsActivity, String str) {
        accountsActivity.a(new ksz(false, str, null));
        accountsActivity.finish();
    }
}
