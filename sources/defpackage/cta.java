package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@cfp
/* renamed from: cta reason: default package */
public final class cta extends WebChromeClient {
    private final cti a;

    public cta(cti cti) {
        this.a = cti;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof cti)) {
            return webView.getContext();
        }
        cti cti = (cti) webView;
        Activity d = cti.d();
        return d != null ? d : cti.getContext();
    }

    private final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        Builder onCancelListener;
        try {
            if (!(this.a == null || this.a.x() == null || this.a.x().a() == null)) {
                bla a2 = this.a.x().a();
                if (a2 != null && !a2.a()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
                    sb.append("window.");
                    sb.append(str);
                    sb.append("('");
                    sb.append(str3);
                    sb.append("')");
                    a2.a(sb.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                onCancelListener = builder.setView(linearLayout).setPositiveButton(17039370, new ctg(jsPromptResult, editText)).setNegativeButton(17039360, new ctf(jsPromptResult)).setOnCancelListener(new cte(jsPromptResult));
            } else {
                onCancelListener = builder.setMessage(str3).setPositiveButton(17039370, new ctd(jsResult)).setNegativeButton(17039360, new ctc(jsResult)).setOnCancelListener(new ctb(jsResult));
            }
            onCancelListener.create().show();
        } catch (BadTokenException unused) {
            cpn.a(5);
        }
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof cti)) {
            cpn.a(5);
            return;
        }
        bhk t = ((cti) webView).t();
        if (t == null) {
            cpn.a(5);
        } else {
            t.a();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = cth.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            cml.a(sb2);
        } else if (i == 2) {
            cpn.a(5);
        } else if (i == 3 || i == 4) {
            cpn.a(4);
        } else if (i != 5) {
            cpn.a(4);
        } else {
            cpn.a(3);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.a.y() != null) {
            webView2.setWebViewClient(this.a.y());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        boolean z;
        if (callback != null) {
            bkc.e();
            if (!cmu.a(this.a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                bkc.e();
                if (!cmu.a(this.a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        bhk t = this.a.t();
        if (t == null) {
            cpn.a(5);
        } else {
            t.b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (caf.g()) {
            if (!((Boolean) dqe.f().a(dtg.aA)).booleanValue()) {
                cti cti = this.a;
                if (cti == null || cti.x() == null || this.a.x().l() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a2 = this.a.x().l().a(permissionRequest.getResources());
                if (a2.length > 0) {
                    permissionRequest.grant(a2);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        bhk t = this.a.t();
        if (t == null) {
            cpn.a(5);
            customViewCallback.onCustomViewHidden();
            return;
        }
        t.a(view, customViewCallback);
        t.a(i);
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
