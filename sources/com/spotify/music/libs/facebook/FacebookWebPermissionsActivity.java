package com.spotify.music.libs.facebook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class FacebookWebPermissionsActivity extends kyd {
    public rra g;
    private final SerialDisposable h = new SerialDisposable();
    private final SerialDisposable i = new SerialDisposable();
    private b j;
    private String k;
    /* access modifiers changed from: private */
    public String l;
    private String m;
    private boolean n;
    /* access modifiers changed from: private */
    public Uri o;
    /* access modifiers changed from: private */
    public boolean p;

    interface a {
        boolean a(Uri uri);

        void b(Uri uri);
    }

    public static class b extends sin {
        private boolean T;
        a a;
        private String b;

        public static b c() {
            b bVar = new b();
            fpu.a((Fragment) bVar, (fpt) new fpx("NoFlags, external web view"));
            return bVar;
        }

        public final void c(String str) {
            this.b = str;
            if (this.T) {
                d(this.b);
            }
        }

        public final void b(Bundle bundle) {
            super.b(bundle);
            c_(true);
        }

        public final void ah() {
            this.T = true;
            if (!fax.a(this.b)) {
                d(this.b);
            }
        }

        public final boolean a(Uri uri) {
            a aVar = this.a;
            return aVar != null && aVar.a(uri);
        }

        public final void b_(String str) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.b(Uri.parse(str));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_facebook_webview);
        if (bundle == null) {
            this.j = b.c();
            this.j.a = new a() {
                public final boolean a(Uri uri) {
                    if (!uri.toString().startsWith(FacebookWebPermissionsActivity.this.l)) {
                        return false;
                    }
                    if (FacebookWebPermissionsActivity.this.p) {
                        FacebookWebPermissionsActivity.this.a(uri);
                    } else {
                        FacebookWebPermissionsActivity.this.o = uri;
                    }
                    return true;
                }

                public final void b(Uri uri) {
                    if (FacebookWebPermissionsActivity.this.p) {
                        FacebookWebPermissionsActivity.this.a(uri);
                    } else {
                        FacebookWebPermissionsActivity.this.o = uri;
                    }
                }
            };
            i().a().b(R.id.fragment_facebook_webview, this.j, null).b();
            Intent intent = getIntent();
            if (intent != null) {
                String str = "auth_url";
                if (intent.hasExtra(str)) {
                    String str2 = "success_url";
                    if (intent.hasExtra(str2)) {
                        this.k = intent.getStringExtra(str);
                        this.l = intent.getStringExtra(str2);
                        this.j.c(this.k);
                        return;
                    }
                }
            }
            this.n = true;
        }
    }

    public void onResume() {
        super.onResume();
        this.p = true;
        if (this.n) {
            this.h.a(this.g.a(PermissionsRequest.builder().permissions(rqu.c).build()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new Consumer() {
                public final void accept(Object obj) {
                    FacebookWebPermissionsActivity.this.a((PermissionRequestResponse) obj);
                }
            }, (Consumer<? super Throwable>) $$Lambda$FacebookWebPermissionsActivity$djY1wsVMrmDHZKRzstD0UU5S9c.INSTANCE));
        }
        Uri uri = this.o;
        if (uri != null) {
            a(uri);
            this.o = null;
        }
    }

    public void onPause() {
        super.onPause();
        this.p = false;
        this.h.bf_();
        this.i.bf_();
    }

    /* access modifiers changed from: private */
    public void a(PermissionRequestResponse permissionRequestResponse) {
        this.k = permissionRequestResponse.requestPermissionsUrl();
        this.l = permissionRequestResponse.authSuccessUrl();
        this.j.c(this.k);
        this.n = false;
    }

    /* access modifiers changed from: protected */
    public final boolean a(Uri uri) {
        int i2 = 0;
        if (!uri.toString().startsWith(this.l)) {
            return false;
        }
        StringBuilder sb = new StringBuilder(this.l);
        if (!this.l.endsWith("?")) {
            sb.append('?');
        }
        sb.append(uri.getFragment());
        Uri parse = Uri.parse(sb.toString());
        String str = "access_token";
        this.m = a(parse, str, this.m);
        String str2 = "denied_scopes";
        String str3 = "";
        String a2 = a(parse, str2, str3);
        String str4 = "granted_scopes";
        String a3 = a(parse, str4, str3);
        SerialDisposable serialDisposable = this.i;
        rra rra = this.g;
        if (a3.contains("publish_actions")) {
            str3 = this.m;
        }
        serialDisposable.a(rra.a(str3).a((Action) $$Lambda$FacebookWebPermissionsActivity$Vtbm9BDQ4JriId7eHvX8gJfw6wc.INSTANCE, (Consumer<? super Throwable>) $$Lambda$FacebookWebPermissionsActivity$RpYLT1gVNSMAxIIdkyo0KKPApyU.INSTANCE));
        Intent intent = getIntent();
        intent.putExtra(str, this.m);
        intent.putExtra(str2, a2);
        intent.putExtra(str4, a3);
        if (!fax.a(this.m)) {
            i2 = -1;
        }
        setResult(i2, intent);
        finish();
        return true;
    }

    private static String a(Uri uri, String str, String str2) {
        return uri.getQueryParameterNames().contains(str) ? uri.getQueryParameter(str) : str2;
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.FACEBOOK_WEBVIEWPERMISSIONS, null);
    }
}
