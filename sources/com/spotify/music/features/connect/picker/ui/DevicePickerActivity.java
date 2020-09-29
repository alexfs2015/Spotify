package com.spotify.music.features.connect.picker.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposables;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class DevicePickerActivity extends jmj {
    public mlt i;
    public mmh j;
    public rym k;
    public fqn l;
    public mji m;
    public kk n;
    public Scheduler o;
    public unp p;
    public ToastieManager q;
    public mlq r;
    private final SerialDisposable s = new SerialDisposable();
    private final rly t = new rly();
    private final OnClickListener u = new OnClickListener() {
        public final void onClick(View view) {
            DevicePickerActivity.this.a(view);
        }
    };
    private final OnClickListener v = new OnClickListener() {
        public final void onClick(View view) {
            mlt mlt = DevicePickerActivity.this.i;
            mlt.a.a((Activity) DevicePickerActivity.this, Uri.parse("https://www.spotify.com/connect/?utm_source=spotify&utm_medium=android_app&utm_campaign=connect_devicemenu_helpicon"));
        }
    };

    public static Intent a(Context context, fqn fqn) {
        Intent intent = new Intent(context, DevicePickerActivity.class);
        fqo.a(intent, fqn);
        return intent;
    }

    public static mlk a(mlq mlq) {
        return mlk.a(mlq);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, DialogInterface dialogInterface, int i2) {
        finish();
        startActivityForResult(intent, 100);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        onBackPressed();
    }

    private void a(Fragment fragment, String str) {
        kr a = this.n.a();
        a.b(R.id.root, fragment, str);
        a.d();
    }

    private void a(boolean z) {
        String str = "tag_device_fragment";
        a((Fragment) mmn.a(this.l), str);
        this.j.b(str);
        if (!z) {
            l();
        }
    }

    private Fragment k() {
        return this.n.a((int) R.id.root);
    }

    private void l() {
        b(PageIdentifiers.CONNECT_DEVICEPICKER.mPageIdentifier, ViewUris.bo.toString());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void m() {
    }

    public final void a(Fragment fragment, String str, String str2) {
        kr a = this.n.a();
        a.a((int) R.anim.slide_in_right, (int) R.anim.slide_out_left, (int) R.anim.slide_in_left, (int) R.anim.slide_out_right);
        a.b(R.id.root, fragment, str);
        a.a((String) null);
        a.b();
        this.j.a(str, str2);
    }

    public final rmf af() {
        return rmf.a((a) this.t);
    }

    public final void b(String str, String str2) {
        this.t.a(str, str2);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.slide_out_to_bottom);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == 1001) {
            String str = "com.spotify.music.spotlets.scannables.RESULT";
            Logger.b("Social listening: Join session %s", jva.a(intent.getStringExtra(str)).b());
            this.s.a(this.p.a(jva.a(intent.getStringExtra(str)).b()).a(this.o).a((Action) $$Lambda$DevicePickerActivity$t4_LurexzSDYSMCoXtl7TITWmcw.INSTANCE, (Consumer<? super Throwable>) $$Lambda$DevicePickerActivity$IkvUyavyaMPxFlIfVz7uKifsi14.INSTANCE));
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        if (this.n.e() > 0) {
            this.n.d();
            this.j.a(k());
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        overridePendingTransition(R.anim.slide_in_from_bottom, 0);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_device);
        mmh mmh = this.j;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.toolbar_holder);
        fsy a = ftc.a(this, frameLayout);
        frameLayout.addView(a.getView());
        OnClickListener onClickListener = this.u;
        OnClickListener onClickListener2 = this.v;
        mmh.e = a;
        mmh.c = mmh.a(SpotifyIconV2.X, (int) R.id.actionbar_close);
        mmh.d = mmh.a(SpotifyIconV2.HELPCIRCLE, (int) R.id.actionbar_help);
        mmh.c.setOnClickListener(onClickListener);
        mmh.d.setOnClickListener(onClickListener2);
        mmh.e.a(ToolbarSide.START, mmh.c, R.id.actionbar_close);
        mmh.e.a(ToolbarSide.END, mmh.d, R.id.actionbar_help);
        mmh.a.a(mmh, mmh.b.getString(R.string.connect_picker_header_text));
        this.j.a(k());
        if (bundle == null) {
            a(false);
        }
        if (this.m.c) {
            int a2 = bso.a().a((Context) this);
            Intent a3 = bso.a().a((Context) this, a2, (String) null);
            if (a3 == null) {
                Assertion.c("Play Service not available, and no action can be taken. No dialog will be shown to the user.");
                return;
            }
            fts.a(this, bwz.c(this, a2)).a(bwz.e(this, a2), new DialogInterface.OnClickListener(a3) {
                private final /* synthetic */ Intent f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    DevicePickerActivity.this.a(this.f$1, dialogInterface, i);
                }
            }).a().a();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("key_current_fragment");
            if (string != null) {
                char c = 65535;
                int hashCode = string.hashCode();
                String str = "tag_education_steps_fragment";
                if (hashCode != -1126213772) {
                    if (hashCode == 1347834596 && string.equals(str)) {
                        c = 0;
                    }
                } else if (string.equals("tag_device_fragment")) {
                    c = 1;
                }
                if (c != 0) {
                    a(true);
                } else {
                    mlq mlq = (mlq) bundle.getParcelable("key_education_item");
                    if (mlq != null) {
                        a((Fragment) mlk.a(mlq), str);
                        this.j.a(str, mlq.b);
                    } else {
                        a(true);
                    }
                }
            }
        }
        super.onRestoreInstanceState(bundle);
    }

    public void onResume() {
        super.onResume();
        this.q.a((q) this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("FlagsArgumentHelper.Flags", this.l);
        Fragment k2 = k();
        if (k2 != null) {
            bundle.putString("key_current_fragment", k2.z);
        }
        bundle.putParcelable("key_education_item", this.r);
        super.onSaveInstanceState(bundle);
    }

    public void onStop() {
        super.onStop();
        this.s.a(Disposables.a());
    }
}
