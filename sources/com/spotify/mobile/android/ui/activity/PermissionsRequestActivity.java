package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Observable;

public class PermissionsRequestActivity extends Activity implements defpackage.ez.a, rlw, b {
    private gaq a;
    /* access modifiers changed from: private */
    public boolean b = true;
    private final defpackage.rlw.a c = new defpackage.rlw.a();

    public static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        private final String[] a;
        private final int[] b;

        protected a(Parcel parcel) {
            this.a = new String[parcel.readInt()];
            parcel.readStringArray(this.a);
            this.b = new int[parcel.readInt()];
            parcel.readIntArray(this.b);
        }

        public a(String[] strArr, int[] iArr) {
            this.a = strArr;
            this.b = iArr;
        }

        public final boolean a() {
            int[] iArr = this.b;
            boolean z = true;
            for (int i = 0; i < iArr.length; i++) {
                z &= iArr[i] == 0;
            }
            return z;
        }

        public final boolean a(String str) {
            int a2 = xdo.a((Object[]) this.a, (Object) str);
            return a2 != -1 && this.b[a2] == 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a.length);
            parcel.writeStringArray(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
        }
    }

    public static Intent a(Context context, String... strArr) {
        if (strArr.length != 0) {
            Class<PermissionsRequestActivity> cls = PermissionsRequestActivity.class;
            Intent intent = new Intent(context, PermissionsRequestActivity.class);
            String str = "EIsESU_RESEQSDMOPRSNI";
            intent.putExtra("REQUESTED_PERMISSIONS", strArr);
            return intent;
        }
        throw new IllegalArgumentException("Permissions list is empty");
    }

    public static a a(Intent intent) {
        return (a) intent.getParcelableExtra("permission_result");
    }

    public final void Z_() {
        this.c.Z_();
    }

    public final Observable<rmb> a() {
        return this.c.a;
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.REQUESTPERMISSIONS, ViewUris.bM.toString());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            final String[] stringArrayExtra = getIntent().getStringArrayExtra("REQUESTED_PERMISSIONS");
            String str = "il mp pitenmmtsoyserss";
            Assertion.a("empty permissions list", stringArrayExtra.length != 0);
            String string = getIntent().getExtras().getString("permission_rationale", "");
            String str2 = "wisroonoeo_weaastp_aisism_hlayln";
            boolean booleanExtra = getIntent().getBooleanExtra("permission_rationale_always_show", false);
            boolean z = booleanExtra;
            boolean z2 = booleanExtra;
            for (String a2 : stringArrayExtra) {
                z2 |= ez.a(this, a2);
            }
            if (!z2 || TextUtils.isEmpty(string)) {
                ez.a(this, stringArrayExtra, 49374);
            } else {
                setContentView(R.layout.empty_layout);
                setFinishOnTouchOutside(false);
                defpackage.gaq.a aVar = new defpackage.gaq.a(this, 2132017718);
                aVar.i = true;
                aVar.b = string;
                defpackage.gaq.a a3 = aVar.a((int) R.string.ok_with_exclamation_mark, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ez.a(PermissionsRequestActivity.this, stringArrayExtra, 49374);
                        PermissionsRequestActivity.this.b = false;
                        dialogInterface.dismiss();
                    }
                });
                a3.g = new OnDismissListener() {
                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PermissionsRequestActivity.this.b) {
                            ez.a(PermissionsRequestActivity.this, stringArrayExtra, 49374);
                        }
                    }
                };
                a3.a(this, PageIdentifiers.DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE.mPageIdentifier, ViewUris.bM.toString());
                this.a = aVar.a();
                this.a.show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        gaq gaq = this.a;
        if (gaq != null && gaq.isShowing()) {
            int i = 2 >> 0;
            this.b = false;
            this.a.dismiss();
            boolean z = true;
            this.a = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        a aVar = new a(strArr, iArr);
        Intent intent = new Intent();
        String str = "irio_bpetusrssnle";
        intent.putExtra("permission_result", aVar);
        setResult(-1, intent);
        finish();
    }
}
