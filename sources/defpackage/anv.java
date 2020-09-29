package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import com.spotify.music.R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anv reason: default package */
public final class anv extends jz {
    private static ScheduledThreadPoolExecutor Z;
    public aon T;
    private ProgressBar U;
    private TextView V;
    /* access modifiers changed from: private */
    public Dialog W;
    private volatile a X;
    private volatile ScheduledFuture Y;

    /* renamed from: anv$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }
        };
        String a;
        long b;

        public final int describeContents() {
            return 0;
        }

        a() {
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            a aVar = (a) bundle.getParcelable("request_state");
            if (aVar != null) {
                a(aVar);
            }
        }
        return a2;
    }

    public final Dialog a(Bundle bundle) {
        this.W = new Dialog(p(), R.style.com_facebook_auth_dialog);
        Bundle bundle2 = null;
        View inflate = p().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, null);
        this.U = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.V = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                anv.this.W.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(a((int) R.string.com_facebook_device_auth_instructions)));
        this.W.setContentView(inflate);
        aon aon = this.T;
        if (aon != null) {
            if (aon instanceof aop) {
                bundle2 = aoj.a((aop) aon);
            } else if (aon instanceof aow) {
                bundle2 = aoj.a((aow) aon);
            }
        }
        Bundle bundle3 = bundle2;
        if (bundle3 == null || bundle3.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(amx.b());
        sb.append("|");
        sb.append(amx.c());
        bundle3.putString("access_token", sb.toString());
        bundle3.putString("device_info", als.a());
        akd akd = new akd(null, "device/share", bundle3, HttpMethod.POST, new b() {
            public final void a(akg akg) {
                FacebookRequestError facebookRequestError = akg.b;
                if (facebookRequestError != null) {
                    anv.this.a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = akg.a;
                a aVar = new a();
                try {
                    aVar.a = jSONObject.getString("user_code");
                    aVar.b = jSONObject.getLong("expires_in");
                    anv.this.a(aVar);
                } catch (JSONException unused) {
                    anv.this.a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        akd.a();
        return this.W;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.Y != null) {
            this.Y.cancel(true);
        }
        a(-1, new Intent());
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.X != null) {
            bundle.putParcelable("request_state", this.X);
        }
    }

    private void a(int i, Intent intent) {
        if (this.X != null) {
            als.c(this.X.a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra(LogMessage.SEVERITY_ERROR);
        if (facebookRequestError != null) {
            Toast.makeText(n(), facebookRequestError.a(), 0).show();
        }
        if (u()) {
            ka p = p();
            p.setResult(-1, intent);
            p.finish();
        }
    }

    private void ae() {
        if (u()) {
            this.t.a().a((Fragment) this).b();
        }
    }

    /* access modifiers changed from: private */
    public void a(FacebookRequestError facebookRequestError) {
        ae();
        Intent intent = new Intent();
        intent.putExtra(LogMessage.SEVERITY_ERROR, facebookRequestError);
        a(-1, intent);
    }

    private static synchronized ScheduledThreadPoolExecutor af() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (anv.class) {
            if (Z == null) {
                Z = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = Z;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.X = aVar;
        this.V.setText(aVar.a);
        this.V.setVisibility(0);
        this.U.setVisibility(8);
        this.Y = af().schedule(new Runnable() {
            public final void run() {
                anv.this.W.dismiss();
            }
        }, aVar.b, TimeUnit.SECONDS);
    }
}
