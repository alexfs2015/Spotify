package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.R;
import java.util.Map;

/* renamed from: ssu reason: default package */
public abstract class ssu extends Fragment {
    private View T;
    /* access modifiers changed from: private */
    public ProgressBar U;
    private TextView V;
    protected WebView W;
    protected boolean X = true;
    private TextView Y;
    private ssv Z;
    /* access modifiers changed from: private */
    public final Handler a = new Handler();
    /* access modifiers changed from: private */
    public Runnable aa;
    private Runnable ab;
    /* access modifiers changed from: private */
    public int ac = 0;
    /* access modifiers changed from: private */
    public boolean ad;
    private boolean ae;
    /* access modifiers changed from: private */
    public boolean af;
    /* access modifiers changed from: private */
    public boolean ag = true;
    private WebView b;

    static {
        b.a("webview_debug_custom_spotify_host");
        b.a("webview_debug_ignore_ssl_errors");
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.ae = z;
        if (z) {
            this.U.setVisibility(0);
            this.a.removeCallbacks(this.aa);
            this.aa = null;
            return;
        }
        if (this.aa == null) {
            this.aa = new Runnable() {
                public final void run() {
                    ssu.this.U.setVisibility(4);
                    ssu.this.a.removeCallbacks(ssu.this.aa);
                    ssu.this.aa = null;
                }
            };
            this.a.postDelayed(this.aa, 100);
        }
    }

    /* access modifiers changed from: private */
    public void d(int i) {
        boolean z = true;
        Logger.c("Changing state %d -> %d", Integer.valueOf(this.ac), Integer.valueOf(i));
        this.ac = i;
        boolean z2 = i == 0 || !(i == 1 || i == 3);
        WebView webView = this.W;
        int i2 = 8;
        if (webView != null) {
            webView.setVisibility(z2 ? 0 : 8);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(z2 ? 8 : 0);
        }
        TextView textView2 = this.Y;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 8 : 0);
        }
        if (this.T != null) {
            if (z2 || !this.X) {
                z = false;
            }
            View view = this.T;
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
            this.T.setEnabled(z);
        }
    }

    public void B() {
        super.B();
        WebView webView = this.W;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.W.setWebViewClient(null);
            this.W = null;
        }
        Runnable runnable = this.ab;
        if (runnable != null) {
            this.a.removeCallbacks(runnable);
            this.ab = null;
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = new Object[1];
        objArr[0] = this.b == null ? "" : " (using retained webview)";
        Logger.c("onCreateView()%s", objArr);
        kf p = p();
        View inflate = layoutInflater.inflate(ai(), viewGroup, false);
        this.T = (View) fbp.a(inflate.findViewById(R.id.button_reload));
        this.T.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                view.setEnabled(false);
                ssu.this.W.reload();
            }
        });
        WebView webView = this.b;
        if (webView != null) {
            this.W = webView;
            this.b = null;
        } else {
            this.W = (WebView) fbp.a(new WebView(p));
            if (VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            WebSettings settings = this.W.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            this.Z = new ssv(new $$Lambda$AcpnfuNuxtM3spsxMtN_VNTA0yg(this), new $$Lambda$GHLBGq_kft7WaaI0Ijxo0TFG36o(this));
            this.W.setWebChromeClient(this.Z);
            this.W.setWebViewClient(new WebViewClient(false) {
                private /* synthetic */ boolean a = false;

                private void a() {
                    if (!ssu.this.ag) {
                        ssu.this.af = true;
                    }
                    ssu.this.ag = false;
                }

                private boolean a(WebView webView, Uri uri) {
                    if (!ssu.this.a(uri)) {
                        a();
                        webView.loadUrl(uri.toString());
                    }
                    return true;
                }

                public final void onPageFinished(WebView webView, String str) {
                    Logger.c("Page finished loading: %s", str);
                    ssu.this.a(false);
                    if (ssu.this.af) {
                        ssu.this.af = false;
                    } else {
                        ssu.this.ag = true;
                        if (ssu.this.ac == 3 && !ssu.this.ad) {
                            ssu.this.d(2);
                        }
                    }
                    ssu.this.b_(str);
                }

                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    objArr[1] = ssu.this.ad ? " (error)" : "";
                    Logger.c("Page started loading: %s%s", objArr);
                    ssu.this.ad = false;
                    ssu.this.ag = false;
                    if (ssu.this.ac != 3) {
                        ssu.this.d(2);
                    }
                    ssu.this.a(true);
                }

                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    Logger.d("Error %d %s when loading: %s", Integer.valueOf(i), str, str2);
                    ssu.this.d(3);
                    ssu.this.ad = true;
                }

                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    Logger.d("SSL error: %s", sslError);
                    if (this.a) {
                        Logger.d("Ignoring SSL error due to setting", new Object[0]);
                        sslErrorHandler.proceed();
                        return;
                    }
                    ssu.this.d(3);
                    ssu.this.ad = true;
                    sslErrorHandler.cancel();
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return a(webView, webResourceRequest.getUrl());
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    return a(webView, Uri.parse(str));
                }
            });
        }
        ((ViewGroup) fbp.a(inflate.findViewById(R.id.webview_placeholder))).addView(this.W, -1, -1);
        this.V = (TextView) fbp.a(inflate.findViewById(R.id.error_title));
        this.Y = (TextView) fbp.a(inflate.findViewById(R.id.error_message));
        this.U = (ProgressBar) fbp.a(inflate.findViewById(R.id.progress));
        a(this.ae);
        d(this.ac);
        int i = this.ac;
        if (i == 0 || i == 1) {
            this.ab = new Runnable() {
                public final void run() {
                    if (ssu.this.ac == 0) {
                        ssu.this.d(1);
                    }
                }
            };
            this.a.postDelayed(this.ab, 1000);
            ah();
        }
        return inflate;
    }

    public final void a(int i, int i2, Intent intent) {
        ssx ssx = this.Z.b;
        Logger.b("onActivityResult %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i == 1780) {
            ssx.a(FileChooserParams.parseResult(i2, intent));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, Map<String, String> map) {
        this.a.removeCallbacks(this.ab);
        int i = this.ac;
        if (i == 0 || i == 1) {
            d(2);
            WebView webView = this.W;
            if (webView != null) {
                if (map == null) {
                    webView.loadUrl(str);
                    return;
                }
                webView.loadUrl(str, map);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Uri uri) {
        return false;
    }

    public boolean ac_() {
        WebView webView = this.W;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.W.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void ah();

    /* access modifiers changed from: protected */
    public int ai() {
        return R.layout.fragment_webview;
    }

    public void ak() {
        kf p = p();
        if (p != null) {
            p.finish();
        }
    }

    public void aw_() {
        Logger.c("onDestroyView()", new Object[0]);
        super.aw_();
        this.T = null;
        this.V = null;
        this.Y = null;
        if (this.W != null) {
            if (this.C) {
                ViewParent parent = this.W.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.W);
                    this.b = this.W;
                }
            }
            this.W = null;
        }
        ssv ssv = this.Z;
        if (ssv != null) {
            ssv.a.a();
            ssv.b.a((Uri[]) null);
        }
    }

    /* access modifiers changed from: protected */
    public void b_(String str) {
    }

    /* access modifiers changed from: protected */
    public final void d(String str) {
        a(str, null);
    }
}
