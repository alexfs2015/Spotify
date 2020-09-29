package com.spotify.mobile.android.webbrowser;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.InAppBrowserLogEvent;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebViewActivity extends kyd {
    public jjf g;
    public jrp h;
    private final Handler i = new Handler();
    private WebView j;
    private View k;
    private View l;
    private ProgressBar m;
    /* access modifiers changed from: private */
    public TextView n;
    private Runnable o;
    private Runnable p;
    private boolean q;
    /* access modifiers changed from: private */
    public int r = 0;
    /* access modifiers changed from: private */
    public String s;
    /* access modifiers changed from: private */
    public boolean t;

    public void onCreate(Bundle bundle) {
        fzx.a(this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_webview);
        this.j = (WebView) findViewById(R.id.webview);
        this.k = findViewById(R.id.error_info);
        this.l = findViewById(R.id.button_reload);
        this.l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AdWebViewActivity.this.b(view);
            }
        });
        this.m = (ProgressBar) findViewById(R.id.progress);
        a(this.q);
        SpotifyIconView spotifyIconView = (SpotifyIconView) findViewById(R.id.btn_close);
        spotifyIconView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                AdWebViewActivity.this.a(view);
            }
        });
        spotifyIconView.a(SpotifyIconV2.X);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        this.s = intent.getStringExtra("advertiser");
        this.n = (TextView) findViewById(R.id.webview_title);
        this.n.setText(this.s);
        TextView textView = (TextView) findViewById(R.id.webview_url);
        try {
            textView.setText(new URL(stringExtra).getHost());
        } catch (MalformedURLException unused) {
            textView.setText(stringExtra);
        }
        WebSettings settings = this.j.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        this.j.setWebViewClient(new WebViewClient() {
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                Logger.b("[AdBrowser]: Page load started", new Object[0]);
                AdWebViewActivity.this.t = false;
                if (AdWebViewActivity.this.r != 3) {
                    AdWebViewActivity.this.c(2);
                }
                AdWebViewActivity.this.a(true);
            }

            public final void onPageFinished(WebView webView, String str) {
                Logger.b("[AdBrowser]: Page load finished", new Object[0]);
                jjf jjf = AdWebViewActivity.this.g;
                ab abVar = new ab(AdWebViewActivity.this.h.a(), "android", InAppBrowserLogEvent.PAGE_LOADED.a(), "");
                jjf.a(abVar);
                AdWebViewActivity.this.a(false);
                if (AdWebViewActivity.this.r == 3 && !AdWebViewActivity.this.t) {
                    AdWebViewActivity.this.c(2);
                }
                if (TextUtils.isEmpty(AdWebViewActivity.this.s)) {
                    AdWebViewActivity.this.n.setText(webView.getTitle());
                }
            }

            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                Logger.b("[AdBrowser]: Page load error", new Object[0]);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("errorCode", String.valueOf(i));
                    jSONObject.put("errorReason", String.valueOf(str));
                } catch (JSONException e) {
                    Logger.e(e, "Unable to create json data", new Object[0]);
                }
                jjf jjf = AdWebViewActivity.this.g;
                ab abVar = new ab(AdWebViewActivity.this.h.a(), "android", InAppBrowserLogEvent.ERROR.a(), jSONObject.toString());
                jjf.a(abVar);
                AdWebViewActivity.this.c(3);
                AdWebViewActivity.this.t = true;
            }
        });
        c(this.r);
        int i2 = this.r;
        if (i2 == 0 || i2 == 1) {
            this.p = new Runnable() {
                public final void run() {
                    AdWebViewActivity.this.l();
                }
            };
            this.i.postDelayed(this.p, 1000);
            this.j.loadUrl(stringExtra);
        }
        Logger.b("[AdBrowser]: Web browser open", new Object[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("browserType", "webView");
        } catch (JSONException e) {
            Logger.e(e, "Unable to create json data", new Object[0]);
        }
        jjf jjf = this.g;
        ab abVar = new ab(this.h.a(), "android", InAppBrowserLogEvent.OPENED.a(), jSONObject.toString());
        jjf.a(abVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        view.setEnabled(false);
        this.j.reload();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        if (this.r == 0) {
            c(1);
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.q = z;
        if (z) {
            this.m.setVisibility(0);
            this.i.removeCallbacks(this.o);
            this.o = null;
            return;
        }
        if (this.o == null) {
            this.o = new Runnable() {
                public final void run() {
                    AdWebViewActivity.this.k();
                }
            };
            this.i.postDelayed(this.o, 100);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.m.setVisibility(4);
        this.i.removeCallbacks(this.o);
        this.o = null;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        Logger.c("Changing state %d -> %d", Integer.valueOf(this.r), Integer.valueOf(i2));
        this.r = i2;
        boolean z = i2 == 0 || !(i2 == 1 || i2 == 3);
        WebView webView = this.j;
        int i3 = 8;
        if (webView != null) {
            webView.setVisibility(z ? 0 : 8);
        }
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
        View view2 = this.l;
        if (view2 != null) {
            if (!z) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            this.l.setEnabled(!z);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.b("[AdBrowser]: Web browser closed", new Object[0]);
        jjf jjf = this.g;
        ab abVar = new ab(this.h.a(), "android", InAppBrowserLogEvent.CLOSED.a(), "");
        jjf.a(abVar);
        WebView webView = this.j;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.j.setWebViewClient(null);
            this.j = null;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            this.i.removeCallbacks(runnable);
            this.p = null;
        }
    }

    public void onBackPressed() {
        if (this.j.canGoBack()) {
            this.j.goBack();
        } else {
            finish();
        }
    }
}
