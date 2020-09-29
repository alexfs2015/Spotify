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

public class CappedOndemandDialogFragment extends jpm implements a, udv {
    public kvn T;
    public kwp U;
    public ueb V;
    /* access modifiers changed from: private */
    public DialogType W;
    /* access modifiers changed from: private */
    public tzd X;
    public fpt a;
    private Context aa;
    private boolean ab;
    private BroadcastReceiver ac = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            CappedOndemandDialogFragment.this.V.b(intent);
            CappedOndemandDialogFragment.this.W = (DialogType) intent.getSerializableExtra("extra_dialog_type");
            CappedOndemandDialogFragment.this.X = (tzd) intent.getParcelableExtra("extra_dialog_view_model");
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

    public static CappedOndemandDialogFragment a(fpt fpt) {
        CappedOndemandDialogFragment cappedOndemandDialogFragment = new CappedOndemandDialogFragment();
        fpu.a((Fragment) cappedOndemandDialogFragment, fpt);
        return cappedOndemandDialogFragment;
    }

    public static Intent a(DialogType dialogType, tzd tzd) {
        Intent intent = new Intent("com.spotify.music.internal.intent.view.CAPPED_ONDEMAND_DIALOG");
        intent.putExtra("extra_dialog_type", dialogType);
        intent.putExtra("extra_dialog_view_model", tzd);
        return intent;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        this.aa = (Context) fay.a(n());
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        if (i == this.Z) {
            if (this.W == DialogType.POST_CAP) {
                String dialogType = DialogType.POST_CAP.toString();
                tzd tzd = this.X;
                String str = null;
                tzm a2 = tzd != null ? tzd.a() : null;
                if (i2 != 102) {
                    if (i2 != 103) {
                        switch (i2) {
                            case 1001:
                                break;
                            case 1002:
                                if (a2 instanceof kwc) {
                                    this.T.a(((kwc) a2).o());
                                    this.b.a(UserIntent.PREVIEW, dialogType);
                                    break;
                                }
                                break;
                            case 1003:
                                if (a2 instanceof kwc) {
                                    kwc kwc = (kwc) a2;
                                    Intent o = kwc.o();
                                    if (o != null) {
                                        str = o.getStringExtra("playlist_uri");
                                    }
                                    haa p = kwc.p();
                                    if (str != null) {
                                        this.U.a(str);
                                    } else if (p != null) {
                                        kwp kwp = this.U;
                                        if (p != null) {
                                            PlayerContext a3 = gyy.a(p.data());
                                            if (a3 != null) {
                                                kwp.a.playWithViewUri(a3, gyy.b(p.data()), ViewUris.S.toString());
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
                this.T.a.a(spd.a(ViewUris.aR.toString()).a());
                this.b.a(UserIntent.UPGRADE, dialogType);
            } else {
                this.b.a(DialogType.UNDER_CAP.toString());
            }
            this.ab = false;
        }
    }

    public final void a(Context context) {
        vts.a(this);
        super.a(context);
    }

    public final void z() {
        super.z();
        this.V.a(this.ac, new IntentFilter("com.spotify.music.internal.intent.view.CAPPED_ONDEMAND_DIALOG"));
    }

    public final void A() {
        super.A();
        this.V.a(this.ac);
    }

    public final void h() {
        super.h();
        this.U.b.a(Disposables.b());
    }

    public final void c() {
        super.c();
        Bundle a2 = fb.a(this.aa, 17432576, 17432577).a();
        tzd tzd = this.X;
        tzm a3 = tzd != null ? tzd.a() : null;
        if (a3 instanceof tzo) {
            a(SlateModalActivity.a(this.aa, this.X), this.Z, a2);
            return;
        }
        if (a3 instanceof kwc) {
            a(CappedOndemandDialogActivity.a(this.aa, this.X), this.Z, a2);
        }
    }

    public final gjf aj() {
        return PageIdentifiers.CAPPED_ONDEMAND_DIALOG;
    }

    public final sih ae_() {
        return ViewUris.S;
    }

    static /* synthetic */ void a(CappedOndemandDialogFragment cappedOndemandDialogFragment) {
        if (!cappedOndemandDialogFragment.ab && cappedOndemandDialogFragment.Y != null) {
            cappedOndemandDialogFragment.ab = true;
            cappedOndemandDialogFragment.Y.a((jpm) cappedOndemandDialogFragment);
        }
    }
}
