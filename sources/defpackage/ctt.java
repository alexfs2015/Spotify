package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.Map;
import org.json.JSONObject;

@cfp
/* renamed from: ctt reason: default package */
public final class ctt extends FrameLayout implements cti {
    private final cti a;
    private final cry b;

    public ctt(cti cti) {
        super(cti.getContext());
        this.a = cti;
        this.b = new cry(cti.s(), (ViewGroup) this, (cti) this);
        addView(this.a.o());
    }

    public final dio A() {
        return this.a.A();
    }

    public final boolean B() {
        return this.a.B();
    }

    public final int C() {
        return this.a.C();
    }

    public final boolean D() {
        return this.a.D();
    }

    public final void E() {
        this.b.b();
        this.a.E();
    }

    public final boolean F() {
        return this.a.F();
    }

    public final boolean G() {
        return this.a.G();
    }

    public final boolean H() {
        return this.a.H();
    }

    public final void I() {
        this.a.I();
    }

    public final void J() {
        this.a.J();
    }

    public final OnClickListener K() {
        return this.a.K();
    }

    public final dur L() {
        return this.a.L();
    }

    public final void M() {
        setBackgroundColor(0);
        this.a.setBackgroundColor(0);
    }

    public final void N() {
        TextView textView = new TextView(getContext());
        Resources d = bkc.i().d();
        textView.setText(d != null ? d.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final cry a() {
        return this.b;
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void a(Context context) {
        this.a.a(context);
    }

    public final void a(bhj bhj) {
        this.a.a(bhj);
    }

    public final void a(bhk bhk) {
        this.a.a(bhk);
    }

    public final void a(ctx ctx) {
        this.a.a(ctx);
    }

    public final void a(cuv cuv) {
        this.a.a(cuv);
    }

    public final void a(dlx dlx) {
        this.a.a(dlx);
    }

    public final void a(dur dur) {
        this.a.a(dur);
    }

    public final void a(String str) {
        this.a.a(str);
    }

    public final void a(String str, bhc<? super cti> bhc) {
        this.a.a(str, bhc);
    }

    public final void a(String str, cag<bhc<? super cti>> cag) {
        this.a.a(str, cag);
    }

    public final void a(String str, String str2, String str3) {
        this.a.a(str, str2, str3);
    }

    public final void a(String str, Map<String, ?> map) {
        this.a.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.a.a(str, jSONObject);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void a(boolean z, int i) {
        this.a.a(z, i);
    }

    public final void a(boolean z, int i, String str) {
        this.a.a(z, i, str);
    }

    public final void a(boolean z, int i, String str, String str2) {
        this.a.a(z, i, str, str2);
    }

    public final ctx b() {
        return this.a.b();
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void b(bhk bhk) {
        this.a.b(bhk);
    }

    public final void b(String str) {
        this.a.b(str);
    }

    public final void b(String str, bhc<? super cti> bhc) {
        this.a.b(str, bhc);
    }

    public final void b(String str, JSONObject jSONObject) {
        this.a.b(str, jSONObject);
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final dtr c() {
        return this.a.c();
    }

    public final void c(boolean z) {
        this.a.c(z);
    }

    public final Activity d() {
        return this.a.d();
    }

    public final void d(boolean z) {
        this.a.d(z);
    }

    public final void destroy() {
        this.a.destroy();
    }

    public final bkz e() {
        return this.a.e();
    }

    public final void e(boolean z) {
        this.a.e(z);
    }

    public final void f() {
        this.a.f();
    }

    public final String g() {
        return this.a.g();
    }

    public final dts j() {
        return this.a.j();
    }

    public final cpp k() {
        return this.a.k();
    }

    public final int l() {
        return getMeasuredHeight();
    }

    public final void loadData(String str, String str2, String str3) {
        this.a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.a.loadUrl(str);
    }

    public final int m() {
        return getMeasuredWidth();
    }

    public final WebView n() {
        return this.a.n();
    }

    public final View o() {
        return this;
    }

    public final void onPause() {
        cry cry = this.b;
        bxo.b("onPause must be called from the UI thread.");
        if (cry.d != null) {
            cry.d.i();
        }
        this.a.onPause();
    }

    public final void onResume() {
        this.a.onResume();
    }

    public final void p() {
        this.a.p();
    }

    public final void q() {
        this.a.q();
    }

    public final void r() {
        this.a.r();
    }

    public final Context s() {
        return this.a.s();
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.a.stopLoading();
    }

    public final bhk t() {
        return this.a.t();
    }

    public final bhk u() {
        return this.a.u();
    }

    public final cuv v() {
        return this.a.v();
    }

    public final String w() {
        return this.a.w();
    }

    public final cup x() {
        return this.a.x();
    }

    public final void x_() {
        this.a.x_();
    }

    public final WebViewClient y() {
        return this.a.y();
    }

    public final void y_() {
        this.a.y_();
    }

    public final boolean z() {
        return this.a.z();
    }
}
