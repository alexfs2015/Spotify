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

@cfp
/* renamed from: cti reason: default package */
public interface cti extends bjv, csh, cud, cue, cui, cul, cun, cuo, dly, dzx, eax {
    dio A();

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

    dur L();

    void M();

    void N();

    void a(int i);

    void a(Context context);

    void a(bhk bhk);

    void a(ctx ctx);

    void a(cuv cuv);

    void a(dur dur);

    void a(String str);

    void a(String str, bhc<? super cti> bhc);

    void a(String str, cag<bhc<? super cti>> cag);

    void a(String str, String str2, String str3);

    ctx b();

    void b(int i);

    void b(bhk bhk);

    void b(String str, bhc<? super cti> bhc);

    void b(boolean z);

    void c(boolean z);

    Activity d();

    void d(boolean z);

    void destroy();

    bkz e();

    void e(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    int getWidth();

    dts j();

    cpp k();

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

    bhk t();

    bhk u();

    cuv v();

    String w();

    cup x();

    WebViewClient y();

    boolean z();
}
