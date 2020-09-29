package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.Observable;

/* renamed from: kyd reason: default package */
public abstract class kyd extends jjs implements rcz, b, vtr {
    public gsm T;
    public gji U;
    public kyt V;
    public DispatchingAndroidInjector<Object> W;
    public kyg X;
    private final a g = new a();
    private final BroadcastReceiver h = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            kyd kyd = kyd.this;
            Assertion.a((Object) intent);
            Assertion.a("handleError() can only be called with an intent containing the com.spotify.music.collection.error.EPIC_COLLECTION_ERROR action.", "com.spotify.music.collection.error.EPIC_COLLECTION_ERROR".equals(intent.getAction()));
            a aVar = new a(context, 2132017711);
            aVar.a(R.string.collection_error_insufficient_storage_title);
            boolean hasExtra = intent.hasExtra("FlagsArgumentHelper.Flags");
            int i = R.string.collection_error_insufficient_storage_body;
            if (hasExtra) {
                i = iqk.a(fpu.a(intent), R.string.collection_error_insufficient_storage_body);
            }
            aVar.b(i);
            aVar.a((int) R.string.collection_error_insufficient_storage_ok, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            aVar.h = true;
            aVar.a(kyd, PageIdentifiers.DIALOG_COLLECTION_INSUFFICIENTSTORAGE.mPageIdentifier, ViewUris.bb.toString());
            aVar.a().show();
        }
    };
    private boolean i;

    public void onCreate(Bundle bundle) {
        fzx.a(this);
        vtj.a((Activity) this);
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
        }
        setVolumeControlStream(3);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            intent.setExtrasClassLoader(getClassLoader());
        }
    }

    public void onStart() {
        super.onStart();
        this.T.a();
        BroadcastReceiver broadcastReceiver = this.h;
        IntentFilter intentFilter = new IntentFilter("com.spotify.music.collection.error.EPIC_COLLECTION_ERROR");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        registerReceiver(broadcastReceiver, intentFilter);
        this.i = true;
    }

    public void onResume() {
        super.onResume();
        this.V.a();
    }

    public void onStop() {
        this.T.b();
        if (this.i) {
            unregisterReceiver(this.h);
        }
        super.onStop();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U.a((ViewGroup) findViewById(16908290), (MotionEvent) fay.a(motionEvent));
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.X.a(keyEvent) || this.T.a(keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    public final boolean o() {
        return i().h();
    }

    public final boolean p() {
        return !o();
    }

    public rdh af() {
        return rdh.a(getClass().getSimpleName());
    }

    public final Observable<rdd> a() {
        return this.g.a;
    }

    public final void a(String str, String str2) {
        this.g.a(str, str2);
    }

    public final void Z_() {
        this.g.Z_();
    }

    public final vtk<Object> j() {
        return this.W;
    }
}
