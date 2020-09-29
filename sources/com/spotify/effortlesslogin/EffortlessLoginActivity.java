package com.spotify.effortlesslogin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.effortlesslogin.LoginState.Type;
import com.spotify.music.R;

public class EffortlessLoginActivity extends q implements b {
    public gem g;
    public gbp h;
    private TextView i;
    private TextView j;
    private ProgressBar k;
    private Button l;
    private gel m;
    private String n;

    /* renamed from: com.spotify.effortlesslogin.EffortlessLoginActivity$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.effortlesslogin.LoginState$Type[] r0 = com.spotify.effortlesslogin.LoginState.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.effortlesslogin.LoginState$Type r1 = com.spotify.effortlesslogin.LoginState.Type.LOGGED_IN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.effortlesslogin.LoginState$Type r1 = com.spotify.effortlesslogin.LoginState.Type.LOGGING_IN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.effortlesslogin.LoginState$Type r1 = com.spotify.effortlesslogin.LoginState.Type.LOGIN_FAILED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.effortlesslogin.EffortlessLoginActivity.AnonymousClass1.<clinit>():void");
        }
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, EffortlessLoginActivity.class);
        intent.putExtra("username", str);
        return intent;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(LoginState loginState) {
        int i2 = AnonymousClass1.a[loginState.a().ordinal()];
        if (i2 == 1) {
            this.h.a(gbr.b(new h()));
            c(-1);
        } else if (i2 != 2) {
            if (i2 == 3) {
                this.h.a(gbr.a((gbo) new h(), (gbk) new m(), (gbl) new d(), loginState.b()));
                this.i.setText(R.string.effortless_login_fail_title);
                this.j.setText(R.string.effortless_login_fail_subtitle);
                this.k.setVisibility(8);
                this.j.setVisibility(0);
                this.l.setVisibility(0);
                this.l.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        EffortlessLoginActivity.this.a(view);
                    }
                });
            }
        } else {
            j();
        }
    }

    private void c(int i2) {
        setResult(i2);
        finish();
    }

    private void j() {
        String str = this.n;
        if (str != null) {
            this.i.setText(getString(R.string.effortless_login_logging_in, new Object[]{str}));
        } else {
            this.i.setText(R.string.effortless_login_logging_in_no_username);
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
        this.l.setVisibility(8);
    }

    public final rmf af() {
        return rmf.a(getClass().getSimpleName());
    }

    public void onBackPressed() {
        c(0);
    }

    public void onCreate(Bundle bundle) {
        whp.a((Activity) this);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_effortless_login);
        this.h.a(gbr.a((gbo) new h()));
        this.n = getIntent().getStringExtra("username");
        this.i = (TextView) findViewById(R.id.title);
        this.j = (TextView) findViewById(R.id.subtitle);
        this.k = (ProgressBar) findViewById(R.id.progress_bar);
        this.l = (Button) findViewById(R.id.login_spotify_button);
        b bVar = this.g;
        Application a = ma.a(this);
        if (bVar == null) {
            bVar = a.a(a);
        }
        this.m = (gel) new lz(aq_(), bVar).a(gel.class);
        this.m.a.a(this, new lt() {
            public final void onChanged(Object obj) {
                EffortlessLoginActivity.this.a((LoginState) obj);
            }
        });
        this.m.c();
        j();
    }
}
