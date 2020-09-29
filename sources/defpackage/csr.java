package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@cey
/* renamed from: csr reason: default package */
public interface csr extends bje, crq, ctm, ctn, ctr, ctu, ctw, ctx, dlh, dzg, eag {
    dhx A();

    boolean B();

    int C();

    boolean D();

    void E();

    boolean F();

    boolean G();

    boolean H();

    void I();

    void J();

    OnClickListener K();

    dua L();

    void M();

    void N();

    void a(int i);

    void a(Context context);

    void a(bgt bgt);

    void a(ctg ctg);

    void a(cue cue);

    void a(dua dua);

    void a(String str);

    void a(String str, bgl<? super csr> bgl);

    void a(String str, bzp<bgl<? super csr>> bzp);

    void a(String str, String str2, String str3);

    ctg b();

    void b(int i);

    void b(bgt bgt);

    void b(String str, bgl<? super csr> bgl);

    void b(boolean z);

    void c(boolean z);

    Activity d();

    void d(boolean z);

    void destroy();

    bki e();

    void e(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    dtb j();

    coy k();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    WebView n();

    View o();

    void onPause();

    void onResume();

    void p();

    void q();

    void r();

    Context s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    bgt t();

    bgt u();

    cue v();

    String w();

    cty x();

    WebViewClient y();

    boolean z();
}
