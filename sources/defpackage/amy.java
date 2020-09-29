package defpackage;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.spotify.music.R;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: amy reason: default package */
public class amy extends Dialog {
    private static final int f = 2132018090;
    private static volatile int m;
    /* access modifiers changed from: 0000 */
    public String a;
    c b;
    /* access modifiers changed from: 0000 */
    public WebView c;
    boolean d;
    /* access modifiers changed from: 0000 */
    public boolean e;
    /* access modifiers changed from: private */
    public String g;
    /* access modifiers changed from: private */
    public ProgressDialog h;
    /* access modifiers changed from: private */
    public ImageView i;
    /* access modifiers changed from: private */
    public FrameLayout j;
    private d k;
    /* access modifiers changed from: private */
    public boolean l;
    private LayoutParams n;

    /* renamed from: amy$a */
    public static class a {
        protected Context a;
        protected String b;
        public c c;
        protected Bundle d;
        private String e;
        private aju f;

        public a(Context context, String str, Bundle bundle) {
            this.f = aju.a();
            if (!aju.b()) {
                String a2 = amw.a(context);
                if (a2 != null) {
                    this.b = a2;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            a(context, str, bundle);
        }

        public a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = amw.a(context);
            }
            amx.a(str, "applicationId");
            this.b = str;
            a(context, str2, bundle);
        }

        public amy a() {
            aju aju = this.f;
            String str = "app_id";
            if (aju != null) {
                this.d.putString(str, aju.h);
                this.d.putString("access_token", this.f.e);
            } else {
                this.d.putString(str, this.b);
            }
            return amy.a(this.a, this.e, this.d, 0, this.c);
        }

        private void a(Context context, String str, Bundle bundle) {
            this.a = context;
            this.e = str;
            if (bundle != null) {
                this.d = bundle;
            } else {
                this.d = new Bundle();
            }
        }
    }

    /* renamed from: amy$b */
    class b extends WebViewClient {
        private b() {
        }

        /* synthetic */ b(amy amy, byte b) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Redirect URL: "
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r0 = "FacebookSDK.WebDialog"
                defpackage.amw.b(r0, r6)
                amy r6 = defpackage.amy.this
                java.lang.String r6 = r6.a
                boolean r6 = r7.startsWith(r6)
                r0 = 1
                if (r6 == 0) goto L_0x00b3
                amy r6 = defpackage.amy.this
                android.os.Bundle r6 = r6.a(r7)
                java.lang.String r7 = "error"
                java.lang.String r7 = r6.getString(r7)
                if (r7 != 0) goto L_0x0034
                java.lang.String r7 = "error_type"
                java.lang.String r7 = r6.getString(r7)
            L_0x0034:
                java.lang.String r1 = "error_msg"
                java.lang.String r1 = r6.getString(r1)
                if (r1 != 0) goto L_0x0042
                java.lang.String r1 = "error_message"
                java.lang.String r1 = r6.getString(r1)
            L_0x0042:
                if (r1 != 0) goto L_0x004a
                java.lang.String r1 = "error_description"
                java.lang.String r1 = r6.getString(r1)
            L_0x004a:
                java.lang.String r2 = "error_code"
                java.lang.String r2 = r6.getString(r2)
                boolean r3 = defpackage.amw.a(r2)
                r4 = -1
                if (r3 != 0) goto L_0x005c
                int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x005c }
                goto L_0x005d
            L_0x005c:
                r2 = -1
            L_0x005d:
                boolean r3 = defpackage.amw.a(r7)
                if (r3 == 0) goto L_0x0081
                boolean r3 = defpackage.amw.a(r1)
                if (r3 == 0) goto L_0x0081
                if (r2 != r4) goto L_0x0081
                amy r7 = defpackage.amy.this
                amy$c r1 = r7.b
                if (r1 == 0) goto L_0x00b2
                boolean r1 = r7.d
                if (r1 != 0) goto L_0x00b2
                r7.d = r0
                amy$c r1 = r7.b
                r2 = 0
                r1.a(r6, r2)
                r7.dismiss()
                goto L_0x00b2
            L_0x0081:
                if (r7 == 0) goto L_0x0099
                java.lang.String r6 = "access_denied"
                boolean r6 = r7.equals(r6)
                if (r6 != 0) goto L_0x0093
                java.lang.String r6 = "OAuthAccessDeniedException"
                boolean r6 = r7.equals(r6)
                if (r6 == 0) goto L_0x0099
            L_0x0093:
                amy r6 = defpackage.amy.this
                r6.cancel()
                goto L_0x00b2
            L_0x0099:
                r6 = 4201(0x1069, float:5.887E-42)
                if (r2 != r6) goto L_0x00a3
                amy r6 = defpackage.amy.this
                r6.cancel()
                goto L_0x00b2
            L_0x00a3:
                com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
                r6.<init>(r2, r7, r1)
                amy r7 = defpackage.amy.this
                com.facebook.FacebookServiceException r2 = new com.facebook.FacebookServiceException
                r2.<init>(r6, r1)
                r7.a(r2)
            L_0x00b2:
                return r0
            L_0x00b3:
                java.lang.String r6 = "fbconnect://cancel"
                boolean r6 = r7.startsWith(r6)
                if (r6 == 0) goto L_0x00c1
                amy r6 = defpackage.amy.this
                r6.cancel()
                return r0
            L_0x00c1:
                java.lang.String r6 = "touch"
                boolean r6 = r7.contains(r6)
                r1 = 0
                if (r6 == 0) goto L_0x00cb
                return r1
            L_0x00cb:
                amy r6 = defpackage.amy.this     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                android.content.Context r6 = r6.getContext()     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                java.lang.String r3 = "android.intent.action.VIEW"
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                r2.<init>(r3, r7)     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00e0 }
                return r0
            L_0x00e0:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.amy.b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            amy.this.a((Throwable) new FacebookDialogException(str, i, str2));
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            amy.this.a((Throwable) new FacebookDialogException(null, -11, null));
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder("Webview loading URL: ");
            sb.append(str);
            amw.b("FacebookSDK.WebDialog", sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!amy.this.l) {
                amy.this.h.show();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!amy.this.l) {
                amy.this.h.dismiss();
            }
            amy.this.j.setBackgroundColor(0);
            amy.this.c.setVisibility(0);
            amy.this.i.setVisibility(0);
            amy.this.e = true;
        }
    }

    /* renamed from: amy$c */
    public interface c {
        void a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: amy$d */
    class d extends AsyncTask<Void, Void, String[]> {
        private String a;
        private Bundle b;
        /* access modifiers changed from: private */
        public Exception[] c;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Exception[] excArr;
            String[] strArr = (String[]) obj;
            amy.this.h.dismiss();
            for (Exception exc : this.c) {
                if (exc != null) {
                    amy.this.a((Throwable) exc);
                    return;
                }
            }
            String str = "Failed to stage photos for web dialog";
            if (strArr == null) {
                amy.this.a((Throwable) new FacebookException(str));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                amy.this.a((Throwable) new FacebookException(str));
                return;
            }
            amw.a(this.b, "media", (Object) new JSONArray(asList));
            String a2 = amu.a();
            StringBuilder sb = new StringBuilder();
            sb.append(akc.h());
            sb.append("/dialog/");
            sb.append(this.a);
            amy.this.g = amw.a(a2, sb.toString(), this.b).toString();
            amy.this.b((amy.this.i.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        d(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        private String[] a() {
            akd akd;
            String[] stringArray = this.b.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.c = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            aju a2 = aju.a();
            final int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (amw.b(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        AnonymousClass1 r9 = new defpackage.akd.b() {
                            public final void a(akg akg) {
                                try {
                                    FacebookRequestError facebookRequestError = akg.b;
                                    String str = "Error staging photo.";
                                    if (facebookRequestError != null) {
                                        String a2 = facebookRequestError.a();
                                        if (a2 == null) {
                                            a2 = str;
                                        }
                                        throw new FacebookGraphResponseException(akg, a2);
                                    }
                                    JSONObject jSONObject = akg.a;
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("uri");
                                        if (optString != null) {
                                            strArr[i] = optString;
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        throw new FacebookException(str);
                                    }
                                    throw new FacebookException(str);
                                } catch (Exception e) {
                                    d.this.c[i] = e;
                                }
                            }
                        };
                        String str = "file";
                        String str2 = "image/png";
                        if (amw.d(parse)) {
                            e eVar = new e(ParcelFileDescriptor.open(new File(parse.getPath()), 268435456), str2);
                            Bundle bundle = new Bundle(1);
                            bundle.putParcelable(str, eVar);
                            akd = new akd(a2, "me/staging_resources", bundle, HttpMethod.POST, r9);
                        } else if (amw.c(parse)) {
                            e eVar2 = new e(parse, str2);
                            Bundle bundle2 = new Bundle(1);
                            bundle2.putParcelable(str, eVar2);
                            akd = new akd(a2, "me/staging_resources", bundle2, HttpMethod.POST, r9);
                        } else {
                            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
                        }
                        concurrentLinkedQueue.add(akd.a());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }
    }

    protected static void a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || m != 0)) {
                    a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    public static amy a(Context context, String str, Bundle bundle, int i2, c cVar) {
        a(context);
        amy amy = new amy(context, str, bundle, i2, cVar);
        return amy;
    }

    private static void a(int i2) {
        if (i2 == 0) {
            i2 = f;
        }
        m = i2;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            cancel();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void dismiss() {
        WebView webView = this.c;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.l) {
            ProgressDialog progressDialog = this.h;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.h.dismiss();
            }
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        d dVar = this.k;
        if (dVar == null || dVar.getStatus() != Status.PENDING) {
            a();
            return;
        }
        this.k.execute(new Void[0]);
        this.h.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        d dVar = this.k;
        if (dVar != null) {
            dVar.cancel(true);
            this.h.dismiss();
        }
        super.onStop();
    }

    public void onDetachedFromWindow() {
        this.l = true;
        super.onDetachedFromWindow();
    }

    public void onAttachedToWindow() {
        this.l = false;
        if (amw.d(getContext())) {
            LayoutParams layoutParams = this.n;
            if (layoutParams != null && layoutParams.token == null) {
                this.n.token = getOwnerActivity().getWindow().getAttributes().token;
                StringBuilder sb = new StringBuilder("Set token on onAttachedToWindow(): ");
                sb.append(this.n.token);
                amw.b("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = new ProgressDialog(getContext());
        this.h.requestWindowFeature(1);
        this.h.setMessage(getContext().getString(R.string.com_facebook_loading));
        this.h.setCanceledOnTouchOutside(false);
        this.h.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                amy.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.j = new FrameLayout(getContext());
        a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        this.i = new ImageView(getContext());
        this.i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                amy.this.cancel();
            }
        });
        this.i.setImageDrawable(getContext().getResources().getDrawable(R.drawable.com_facebook_close));
        this.i.setVisibility(4);
        if (this.g != null) {
            b((this.i.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.j.addView(this.i, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.j);
    }

    /* access modifiers changed from: protected */
    public Bundle a(String str) {
        Uri parse = Uri.parse(str);
        Bundle d2 = amw.d(parse.getQuery());
        d2.putAll(amw.d(parse.getFragment()));
        return d2;
    }

    public final void a() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    private static int a(int i2, float f2, int i3, int i4) {
        int i5 = (int) (((float) i2) / f2);
        double d2 = 0.5d;
        if (i5 <= i3) {
            d2 = 1.0d;
        } else if (i5 < i4) {
            double d3 = (double) (i4 - i5);
            double d4 = (double) (i4 - i3);
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = 0.5d + ((d3 / d4) * 0.5d);
        }
        double d5 = (double) i2;
        Double.isNaN(d5);
        return (int) (d5 * d2);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        FacebookException facebookException;
        if (this.b != null && !this.d) {
            this.d = true;
            if (th instanceof FacebookException) {
                facebookException = (FacebookException) th;
            } else {
                facebookException = new FacebookException(th);
            }
            this.b.a(null, facebookException);
            dismiss();
        }
    }

    public void cancel() {
        if (this.b != null && !this.d) {
            a((Throwable) new FacebookOperationCanceledException());
        }
    }

    /* access modifiers changed from: private */
    public void b(int i2) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.c = new WebView(getContext()) {
            public final void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setWebViewClient(new b(this, 0));
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.loadUrl(this.g);
        this.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.c.setVisibility(4);
        this.c.getSettings().setSavePassword(false);
        this.c.getSettings().setSaveFormData(false);
        this.c.setFocusable(true);
        this.c.setFocusableInTouchMode(true);
        this.c.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i2, i2, i2, i2);
        linearLayout.addView(this.c);
        linearLayout.setBackgroundColor(-872415232);
        this.j.addView(linearLayout);
    }

    protected amy(Context context, String str) {
        amx.a();
        this(context, str, m);
    }

    private amy(Context context, String str, int i2) {
        if (i2 == 0) {
            amx.a();
            i2 = m;
        }
        super(context, i2);
        this.a = "fbconnect://success";
        this.d = false;
        this.l = false;
        this.e = false;
        this.g = str;
    }

    private amy(Context context, String str, Bundle bundle, int i2, c cVar) {
        if (i2 == 0) {
            amx.a();
            i2 = m;
        }
        super(context, i2);
        String str2 = "fbconnect://success";
        this.a = str2;
        this.d = false;
        this.l = false;
        this.e = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (amw.f(context)) {
            str2 = "fbconnect://chrome_os_success";
        }
        this.a = str2;
        bundle.putString("redirect_uri", this.a);
        bundle.putString("display", "touch");
        bundle.putString("client_id", akc.k());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{akc.i()}));
        this.b = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String a2 = amu.a();
            StringBuilder sb = new StringBuilder();
            sb.append(akc.h());
            sb.append("/dialog/");
            sb.append(str);
            this.g = amw.a(a2, sb.toString(), bundle).toString();
            return;
        }
        this.k = new d(str, bundle);
    }
}
