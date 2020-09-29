package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class CustomTabMainActivity extends Activity {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private boolean e = true;
    private BroadcastReceiver f;

    static {
        Class<CustomTabMainActivity> cls = CustomTabMainActivity.class;
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append(".extra_params");
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.getSimpleName());
        sb2.append(".extra_chromePackage");
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(cls.getSimpleName());
        sb3.append(".extra_url");
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(cls.getSimpleName());
        sb4.append(".action_refresh");
        d = sb4.toString();
    }

    public static final String a() {
        StringBuilder sb = new StringBuilder("fb");
        sb.append(akc.k());
        sb.append("://authorize");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CustomTabActivity.a.equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle == null) {
            Bundle bundleExtra = getIntent().getBundleExtra(a);
            String stringExtra = getIntent().getStringExtra(b);
            alx alx = new alx("oauth", bundleExtra);
            de a2 = new a().a();
            a2.a.setPackage(stringExtra);
            a2.a.addFlags(1073741824);
            a2.a(this, alx.a);
            this.e = false;
            this.f = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    Intent intent2 = new Intent(CustomTabMainActivity.this, CustomTabMainActivity.class);
                    intent2.setAction(CustomTabMainActivity.d);
                    intent2.putExtra(CustomTabMainActivity.c, intent.getStringExtra(CustomTabMainActivity.c));
                    intent2.addFlags(603979776);
                    CustomTabMainActivity.this.startActivity(intent2);
                }
            };
            mc.a((Context) this).a(this.f, new IntentFilter(CustomTabActivity.a));
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (d.equals(intent.getAction())) {
            mc.a((Context) this).a(new Intent(CustomTabActivity.b));
            a(-1, intent);
            return;
        }
        if (CustomTabActivity.a.equals(intent.getAction())) {
            a(-1, intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.e) {
            a(0, null);
        }
        this.e = true;
    }

    private void a(int i, Intent intent) {
        mc.a((Context) this).a(this.f);
        if (intent != null) {
            setResult(i, intent);
        } else {
            setResult(i);
        }
        finish();
    }
}
