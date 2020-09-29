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

/* renamed from: aoj reason: default package */
public final class aoj extends ke {
    private static ScheduledThreadPoolExecutor Z;
    public apb T;
    private ProgressBar U;
    private TextView V;
    /* access modifiers changed from: private */
    public Dialog W;
    private volatile a X;
    private volatile ScheduledFuture Y;

    /* renamed from: aoj$a */
    static class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new a[i];
            }
        };
        String a;
        long b;

        a() {
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }
    }

    private void a(int i, Intent intent) {
        if (this.X != null) {
            amg.c(this.X.a);
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra(LogMessage.SEVERITY_ERROR);
        if (facebookRequestError != null) {
            Toast.makeText(n(), facebookRequestError.a(), 0).show();
        }
        if (u()) {
            kf p = p();
            p.setResult(-1, intent);
            p.finish();
        }
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.X = aVar;
        this.V.setText(aVar.a);
        this.V.setVisibility(0);
        this.U.setVisibility(8);
        this.Y = af().schedule(new Runnable() {
            public final void run() {
                aoj.this.W.dismiss();
            }
        }, aVar.b, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    public void a(FacebookRequestError facebookRequestError) {
        ae();
        Intent intent = new Intent();
        intent.putExtra(LogMessage.SEVERITY_ERROR, facebookRequestError);
        a(-1, intent);
    }

    private void ae() {
        if (u()) {
            this.t.a().a((Fragment) this).b();
        }
    }

    private static synchronized ScheduledThreadPoolExecutor af() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (aoj.class) {
            if (Z == null) {
                Z = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = Z;
        }
        return scheduledThreadPoolExecutor;
    }

    public final Dialog a(Bundle bundle) {
        this.W = new Dialog(p(), R.style.com_facebook_auth_dialog);
        Bundle bundle2 = null;
        View inflate = p().getLayoutInflater().inflate(R.layout.com_facebook_device_auth_dialog_fragment, null);
        this.U = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.V = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                aoj.this.W.dismiss();
            }
        });
        ((TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(a((int) R.string.com_facebook_device_auth_instructions)));
        this.W.setContentView(inflate);
        apb apb = this.T;
        if (apb != null) {
            if (apb instanceof apd) {
                bundle2 = aox.a((apd) apb);
            } else if (apb instanceof apk) {
                bundle2 = aox.a((apk) apb);
            }
        }
        Bundle bundle3 = bundle2;
        if (bundle3 == null || bundle3.size() == 0) {
            a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(anl.b());
        sb.append("|");
        sb.append(anl.c());
        bundle3.putString("access_token", sb.toString());
        bundle3.putString("device_info", amg.a());
        akr akr = new akr(null, "device/share", bundle3, HttpMethod.POST, new b() {
            public final void a(aku aku) {
                FacebookRequestError facebookRequestError = aku.b;
                if (facebookRequestError != null) {
                    aoj.this.a(facebookRequestError);
                    return;
                }
                JSONObject jSONObject = aku.a;
                a aVar = new a();
                try {
                    aVar.a = jSONObject.getString("user_code");
                    aVar.b = jSONObject.getLong("expires_in");
                    aoj.this.a(aVar);
                } catch (JSONException unused) {
                    aoj.this.a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        akr.a();
        return this.W;
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

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.X != null) {
            bundle.putParcelable("request_state", this.X);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.Y != null) {
            this.Y.cancel(true);
        }
        a(-1, new Intent());
    }
}
