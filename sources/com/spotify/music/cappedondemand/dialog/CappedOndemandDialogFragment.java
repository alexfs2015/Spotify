package com.spotify.music.cappedondemand.dialog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.cappedondemand.dialog.dialogv2.CappedOndemandDialogActivity;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.slate.SlateModalActivity;
import io.reactivex.disposables.Disposables;

public class CappedOndemandDialogFragment extends jry implements a, uqq {
    public kyw T;
    public kzy U;
    public mip V;
    /* access modifiers changed from: private */
    public DialogType W;
    /* access modifiers changed from: private */
    public uly X;
    public fqn a;
    private Context aa;
    private boolean ab;
    private BroadcastReceiver ac = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            CappedOndemandDialogFragment.this.V.b(intent);
            CappedOndemandDialogFragment.this.W = (DialogType) intent.getSerializableExtra("extra_dialog_type");
            CappedOndemandDialogFragment.this.X = (uly) intent.getParcelableExtra("extra_dialog_view_model");
            CappedOndemandDialogFragment.a(CappedOndemandDialogFragment.this);
        }
    };
    public CappedOndemandDialogLogger b;

    public enum DialogType {
        POST_CAP("post_cap"),
        UNDER_CAP("under_cap");
        
        private final String mType;

        private DialogType(String str) {
            this.mType = str;
        }

        public final String toString() {
            return this.mType;
        }
    }

    public static Intent a(DialogType dialogType, uly uly) {
        Intent intent = new Intent("com.spotify.music.internal.intent.view.CAPPED_ONDEMAND_DIALOG");
        intent.putExtra("extra_dialog_type", dialogType);
        intent.putExtra("extra_dialog_view_model", uly);
        return intent;
    }

    public static CappedOndemandDialogFragment a(fqn fqn) {
        CappedOndemandDialogFragment cappedOndemandDialogFragment = new CappedOndemandDialogFragment();
        fqo.a((Fragment) cappedOndemandDialogFragment, fqn);
        return cappedOndemandDialogFragment;
    }

    static /* synthetic */ void a(CappedOndemandDialogFragment cappedOndemandDialogFragment) {
        if (!cappedOndemandDialogFragment.ab && cappedOndemandDialogFragment.Y != null) {
            cappedOndemandDialogFragment.ab = true;
            cappedOndemandDialogFragment.Y.a((jry) cappedOndemandDialogFragment);
        }
    }

    public final void A() {
        super.A();
        this.V.a(this.ac);
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == this.Z) {
            if (this.W == DialogType.POST_CAP) {
                String dialogType = DialogType.POST_CAP.toString();
                uly uly = this.X;
                String str = null;
                umh a2 = uly != null ? uly.a() : null;
                if (i2 != 102) {
                    if (i2 != 103) {
                        switch (i2) {
                            case 1001:
                                break;
                            case 1002:
                                if (a2 instanceof kzl) {
                                    this.T.a(((kzl) a2).o());
                                    this.b.a(UserIntent.PREVIEW, dialogType);
                                    break;
                                }
                                break;
                            case 1003:
                                if (a2 instanceof kzl) {
                                    kzl kzl = (kzl) a2;
                                    Intent o = kzl.o();
                                    if (o != null) {
                                        str = o.getStringExtra("playlist_uri");
                                    }
                                    hct p = kzl.p();
                                    if (str != null) {
                                        this.U.a(str);
                                    } else if (p != null) {
                                        kzy kzy = this.U;
                                        if (p != null) {
                                            PlayerContext a3 = hbr.a(p.data());
                                            if (a3 != null) {
                                                kzy.a.playWithViewUri(a3, hbr.b(p.data()), ViewUris.R.toString());
                                            }
                                        }
                                    }
                                    this.b.a(UserIntent.SHUFFLE_PLAY, dialogType);
                                    break;
                                }
                                break;
                        }
                    } else {
                        this.b.a(dialogType);
                    }
                }
                this.T.a.a(szk.a(ViewUris.aQ.toString()).a());
                this.b.a(UserIntent.UPGRADE, dialogType);
            } else {
                this.b.a(DialogType.UNDER_CAP.toString());
            }
            this.ab = false;
        }
    }

    public final void a(Context context) {
        why.a(this);
        super.a(context);
    }

    public final sso ae_() {
        return ViewUris.R;
    }

    public final gkq aj() {
        return PageIdentifiers.CAPPED_ONDEMAND_DIALOG;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aa = (Context) fbp.a(n());
    }

    public final void c() {
        super.c();
        Bundle a2 = fb.a(this.aa, 17432576, 17432577).a();
        uly uly = this.X;
        umh a3 = uly != null ? uly.a() : null;
        if (a3 instanceof umj) {
            a(SlateModalActivity.a(this.aa, this.X), this.Z, a2);
            return;
        }
        if (a3 instanceof kzl) {
            a(CappedOndemandDialogActivity.a(this.aa, this.X), this.Z, a2);
        }
    }

    public final void h() {
        super.h();
        this.U.b.a(Disposables.b());
    }

    public final void z() {
        super.z();
        this.V.a(this.ac, new IntentFilter("com.spotify.music.internal.intent.view.CAPPED_ONDEMAND_DIALOG"));
    }
}
