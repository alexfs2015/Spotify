package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.LoginClient.c;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.music.R;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anp reason: default package */
public final class anp extends ke {
    private View T;
    private TextView U;
    private TextView V;
    private anq W;
    /* access modifiers changed from: private */
    public AtomicBoolean X = new AtomicBoolean();
    private volatile aks Y;
    private volatile ScheduledFuture Z;
    /* access modifiers changed from: private */
    public volatile a aa;
    /* access modifiers changed from: private */
    public Dialog ab;
    /* access modifiers changed from: private */
    public boolean ac = false;
    /* access modifiers changed from: private */
    public boolean ad = false;
    /* access modifiers changed from: private */
    public c ae = null;

    /* renamed from: anp$a */
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
        String b;
        String c;
        long d;
        long e;

        a() {
        }

        protected a(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readLong();
            this.e = parcel.readLong();
        }

        public final boolean a() {
            return this.e != 0 && (new Date().getTime() - this.e) - (this.d * 1000) < 0;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.aa = aVar;
        this.U.setText(aVar.b);
        this.V.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(o().getResources(), amg.b(aVar.a)), null, null);
        this.U.setVisibility(0);
        this.T.setVisibility(8);
        if (!this.ad && amg.a(aVar.b)) {
            new alk(n()).a("fb_smart_login_service");
        }
        if (aVar.a()) {
            ag();
        } else {
            af();
        }
    }

    static /* synthetic */ void a(anp anp, String str, c cVar, String str2, String str3, Date date, Date date2) {
        String string = anp.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        String string2 = anp.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        String string3 = anp.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(anp.n());
        Builder cancelable = builder.setMessage(string).setCancelable(true);
        final String str4 = str;
        final c cVar2 = cVar;
        final String str5 = str2;
        final Date date3 = date;
        final Date date4 = date2;
        AnonymousClass6 r5 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                anp.a(anp.this, str4, cVar2, str5, date3, date4);
            }
        };
        anp anp2 = anp;
        cancelable.setNegativeButton(format, r5).setPositiveButton(string3, new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                anp.this.ab.setContentView(anp.this.i(false));
                anp anp = anp.this;
                anp.a(anp.ae);
            }
        });
        builder.create().show();
    }

    static /* synthetic */ void a(anp anp, String str, c cVar, String str2, Date date, Date date2) {
        anp anp2 = anp;
        c cVar2 = cVar;
        anp2.W.a(str2, akq.k(), str, cVar2.a, cVar2.b, cVar2.c, AccessTokenSource.DEVICE_AUTH, date, null, date2);
        anp2.ab.dismiss();
    }

    static /* synthetic */ void a(anp anp, String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        aki aki = new aki(str, akq.k(), Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, null, null, null, date2, null, date);
        final String str2 = str;
        akr akr = new akr(aki, "me", bundle, HttpMethod.GET, new b() {
            public final void a(aku aku) {
                if (!anp.this.X.get()) {
                    if (aku.b != null) {
                        anp.this.a(aku.b.f);
                        return;
                    }
                    try {
                        JSONObject jSONObject = aku.a;
                        String string = jSONObject.getString("id");
                        c a2 = ank.a(jSONObject);
                        String string2 = jSONObject.getString("name");
                        amg.c(anp.this.aa.b);
                        if (!FetchedAppSettingsManager.a(akq.k()).f.contains(SmartLoginOption.RequireConfirm) || anp.this.ad) {
                            anp.a(anp.this, string, a2, str2, date2, date);
                            return;
                        }
                        anp.this.ad = true;
                        anp.a(anp.this, string, a2, str2, string2, date2, date);
                    } catch (JSONException e) {
                        anp.this.a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        akr.a();
    }

    /* access modifiers changed from: private */
    public void af() {
        this.aa.e = new Date().getTime();
        this.Y = ah().a();
    }

    /* access modifiers changed from: private */
    public void ag() {
        this.Z = anq.c().schedule(new Runnable() {
            public final void run() {
                anp.this.af();
            }
        }, this.aa.d, TimeUnit.SECONDS);
    }

    private akr ah() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.aa.c);
        akr akr = new akr(null, "device/login_status", bundle, HttpMethod.POST, new b() {
            public final void a(aku aku) {
                if (!anp.this.X.get()) {
                    FacebookRequestError facebookRequestError = aku.b;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.c;
                        if (i != 1349152) {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    anp.this.ag();
                                    return;
                                case 1349173:
                                    anp.this.ae();
                                    return;
                                default:
                                    anp.this.a(aku.b.f);
                                    return;
                            }
                        } else {
                            if (anp.this.aa != null) {
                                amg.c(anp.this.aa.b);
                            }
                            if (anp.this.ae != null) {
                                anp anp = anp.this;
                                anp.a(anp.ae);
                                return;
                            }
                            anp.this.ae();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = aku.a;
                            anp.a(anp.this, jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e) {
                            anp.this.a(new FacebookException((Throwable) e));
                        }
                    }
                }
            }
        });
        return akr;
    }

    private static int j(boolean z) {
        return z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment;
    }

    public final void B() {
        this.ac = true;
        this.X.set(true);
        super.B();
        if (this.Y != null) {
            this.Y.cancel(true);
        }
        if (this.Z != null) {
            this.Z.cancel(true);
        }
    }

    public final Dialog a(Bundle bundle) {
        this.ab = new Dialog(p(), R.style.com_facebook_auth_dialog);
        this.ab.setContentView(i(amg.b() && !this.ad));
        return this.ab;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.W = (anq) ((anw) ((FacebookActivity) p()).h).a.b();
        if (bundle != null) {
            a aVar = (a) bundle.getParcelable("request_state");
            if (aVar != null) {
                a(aVar);
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final void a(FacebookException facebookException) {
        if (this.X.compareAndSet(false, true)) {
            if (this.aa != null) {
                amg.c(this.aa.b);
            }
            this.W.a((Exception) facebookException);
            this.ab.dismiss();
        }
    }

    public final void a(c cVar) {
        this.ae = cVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", cVar.b));
        String str = cVar.g;
        if (str != null) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = cVar.i;
        if (str2 != null) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(anl.b());
        sb.append("|");
        sb.append(anl.c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", amg.a());
        akr akr = new akr(null, "device/login", bundle, HttpMethod.POST, new b() {
            public final void a(aku aku) {
                if (!anp.this.ac) {
                    if (aku.b != null) {
                        anp.this.a(aku.b.f);
                        return;
                    }
                    JSONObject jSONObject = aku.a;
                    a aVar = new a();
                    try {
                        String string = jSONObject.getString("user_code");
                        aVar.b = string;
                        aVar.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                        aVar.c = jSONObject.getString("code");
                        aVar.d = jSONObject.getLong("interval");
                        anp.this.a(aVar);
                    } catch (JSONException e) {
                        anp.this.a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        akr.a();
    }

    /* access modifiers changed from: protected */
    public final void ae() {
        if (this.X.compareAndSet(false, true)) {
            if (this.aa != null) {
                amg.c(this.aa.b);
            }
            anq anq = this.W;
            if (anq != null) {
                anq.i_();
            }
            this.ab.dismiss();
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.aa != null) {
            bundle.putParcelable("request_state", this.aa);
        }
    }

    /* access modifiers changed from: protected */
    public final View i(boolean z) {
        View inflate = p().getLayoutInflater().inflate(j(z), null);
        this.T = inflate.findViewById(R.id.progress_bar);
        this.U = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                anp.this.ae();
            }
        });
        this.V = (TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.V.setText(Html.fromHtml(a((int) R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.ac) {
            ae();
        }
    }
}
