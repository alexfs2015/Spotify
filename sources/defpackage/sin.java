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

/* renamed from: sin reason: default package */
public abstract class sin extends Fragment {
    private View T;
    /* access modifiers changed from: private */
    public ProgressBar U;
    private TextView V;
    protected WebView W;
    protected boolean X = true;
    private TextView Y;
    private sio Z;
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

    /* access modifiers changed from: protected */
    public boolean a(Uri uri) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void ah();

    /* access modifiers changed from: protected */
    public int ai() {
        return R.layout.fragment_webview;
    }

    /* access modifiers changed from: protected */
    public void b_(String str) {
    }

    static {
        b.a("webview_debug_custom_spotify_host");
        b.a("webview_debug_ignore_ssl_errors");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = new Object[1];
        objArr[0] = this.b == null ? "" : " (using retained webview)";
        Logger.c("onCreateView()%s", objArr);
        ka p = p();
        View inflate = layoutInflater.inflate(ai(), viewGroup, false);
        this.T = (View) fay.a(inflate.findViewById(R.id.button_reload));
        this.T.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                view.setEnabled(false);
                sin.this.W.reload();
            }
        });
        WebView webView = this.b;
        if (webView != null) {
            this.W = webView;
            this.b = null;
        } else {
            this.W = (WebView) fay.a(new WebView(p));
            if (VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(false);
            }
            WebSettings settings = this.W.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            this.Z = new sio(new $$Lambda$RSMU1kQp9aDAoL73gpfOS7WtLgY(this), new $$Lambda$SzA9mLA2C_eZsG95pWvKv0KLa_M(this));
            this.W.setWebChromeClient(this.Z);
            this.W.setWebViewClient(new WebViewClient(false) {
                private /* synthetic */ boolean a = false;

                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return a(webView, webResourceRequest.getUrl());
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    return a(webView, Uri.parse(str));
                }

                private boolean a(WebView webView, Uri uri) {
                    if (!sin.this.a(uri)) {
                        a();
                        webView.loadUrl(uri.toString());
                    }
                    return true;
                }

                private void a() {
                    if (!sin.this.ag) {
                        sin.this.af = true;
                    }
                    sin.this.ag = false;
                }

                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    Logger.d("SSL error: %s", sslError);
                    if (this.a) {
                        Logger.d("Ignoring SSL error due to setting", new Object[0]);
                        sslErrorHandler.proceed();
                        return;
                    }
                    sin.this.d(3);
                    sin.this.ad = true;
                    sslErrorHandler.cancel();
                }

                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    Object[] objArr = new Object[2];
                    objArr[0] = str;
                    objArr[1] = sin.this.ad ? " (error)" : "";
                    Logger.c("Page started loading: %s%s", objArr);
                    sin.this.ad = false;
                    sin.this.ag = false;
                    if (sin.this.ac != 3) {
                        sin.this.d(2);
                    }
                    sin.this.a(true);
                }

                public final void onPageFinished(WebView webView, String str) {
                    Logger.c("Page finished loading: %s", str);
                    sin.this.a(false);
                    if (sin.this.af) {
                        sin.this.af = false;
                    } else {
                        sin.this.ag = true;
                        if (sin.this.ac == 3 && !sin.this.ad) {
                            sin.this.d(2);
                        }
                    }
                    sin.this.b_(str);
                }

                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    Logger.d("Error %d %s when loading: %s", Integer.valueOf(i), str, str2);
                    sin.this.d(3);
                    sin.this.ad = true;
                }
            });
        }
        ((ViewGroup) fay.a(inflate.findViewById(R.id.webview_placeholder))).addView(this.W, -1, -1);
        this.V = (TextView) fay.a(inflate.findViewById(R.id.error_title));
        this.Y = (TextView) fay.a(inflate.findViewById(R.id.error_message));
        this.U = (ProgressBar) fay.a(inflate.findViewById(R.id.progress));
        a(this.ae);
        d(this.ac);
        int i = this.ac;
        if (i == 0 || i == 1) {
            this.ab = new Runnable() {
                public final void run() {
                    if (sin.this.ac == 0) {
                        sin.this.d(1);
                    }
                }
            };
            this.a.postDelayed(this.ab, 1000);
            ah();
        }
        return inflate;
    }

    public void ax_() {
        Logger.c("onDestroyView()", new Object[0]);
        super.ax_();
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
        sio sio = this.Z;
        if (sio != null) {
            sio.a.a();
            sio.b.a((Uri[]) null);
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
                    sin.this.U.setVisibility(4);
                    sin.this.a.removeCallbacks(sin.this.aa);
                    sin.this.aa = null;
                }
            };
            this.a.postDelayed(this.aa, 100);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        siq siq = this.Z.b;
        Logger.b("onActivityResult %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i == 1780) {
            siq.a(FileChooserParams.parseResult(i2, intent));
        }
    }

    /* access modifiers changed from: protected */
    public final void d(String str) {
        a(str, null);
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

    public boolean ac_() {
        WebView webView = this.W;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.W.goBack();
        return true;
    }

    public void ak() {
        ka p = p();
        if (p != null) {
            p.finish();
        }
    }
}
