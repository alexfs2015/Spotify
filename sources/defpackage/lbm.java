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

/* renamed from: lbm reason: default package */
public abstract class lbm extends jme implements rlx, b, whx {
    public gkt T;
    public lcc U;
    public DispatchingAndroidInjector<Object> V;
    public lcv W;
    private final a g = new a();
    private final BroadcastReceiver h = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            lbm lbm = lbm.this;
            Assertion.a((Object) intent);
            Assertion.a("handleError() can only be called with an intent containing the com.spotify.music.collection.error.EPIC_COLLECTION_ERROR action.", "com.spotify.music.collection.error.EPIC_COLLECTION_ERROR".equals(intent.getAction()));
            a aVar = new a(context, 2132017714);
            aVar.a(R.string.collection_error_insufficient_storage_title);
            boolean hasExtra = intent.hasExtra("FlagsArgumentHelper.Flags");
            int i = R.string.collection_error_insufficient_storage_body;
            if (hasExtra) {
                i = isx.a(fqo.a(intent), R.string.collection_error_insufficient_storage_body);
            }
            aVar.b(i);
            aVar.a((int) R.string.collection_error_insufficient_storage_ok, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            aVar.h = true;
            aVar.a(lbm, PageIdentifiers.DIALOG_COLLECTION_INSUFFICIENTSTORAGE.mPageIdentifier, ViewUris.ba.toString());
            aVar.a().show();
        }
    };
    private boolean i;

    public final void Z_() {
        this.g.Z_();
    }

    public final Observable<rmb> a() {
        return this.g.a;
    }

    public final void a(String str, String str2) {
        this.g.a(str, str2);
    }

    public rmf af() {
        return rmf.a(getClass().getSimpleName());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.T.a((ViewGroup) findViewById(16908290), (MotionEvent) fbp.a(motionEvent));
        return super.dispatchTouchEvent(motionEvent);
    }

    public final whq<Object> j() {
        return this.V;
    }

    public final boolean o() {
        return i().i();
    }

    public void onCreate(Bundle bundle) {
        gar.a(this);
        whp.a((Activity) this);
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
        }
        setVolumeControlStream(3);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        for (a a : this.W.a()) {
            if (a.a(keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            intent.setExtrasClassLoader(getClassLoader());
        }
    }

    public void onResume() {
        super.onResume();
        this.U.a();
    }

    public void onStart() {
        super.onStart();
        BroadcastReceiver broadcastReceiver = this.h;
        IntentFilter intentFilter = new IntentFilter("com.spotify.music.collection.error.EPIC_COLLECTION_ERROR");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        registerReceiver(broadcastReceiver, intentFilter);
        this.i = true;
    }

    public void onStop() {
        if (this.i) {
            unregisterReceiver(this.h);
        }
        super.onStop();
    }

    public final boolean p() {
        return !o();
    }
}
