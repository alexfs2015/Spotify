package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
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

/* renamed from: anb reason: default package */
public final class anb extends jz {
    private View T;
    private TextView U;
    private TextView V;
    private anc W;
    /* access modifiers changed from: private */
    public AtomicBoolean X = new AtomicBoolean();
    private volatile ake Y;
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

    /* renamed from: anb$a */
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
        String b;
        String c;
        long d;
        long e;

        public final int describeContents() {
            return 0;
        }

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
            if (this.e != 0 && (new Date().getTime() - this.e) - (this.d * 1000) < 0) {
                return true;
            }
            return false;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    private static int j(boolean z) {
        return z ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = super.a(layoutInflater, viewGroup, bundle);
        this.W = (anc) ((ani) ((FacebookActivity) p()).h).a.b();
        if (bundle != null) {
            a aVar = (a) bundle.getParcelable("request_state");
            if (aVar != null) {
                a(aVar);
            }
        }
        return a2;
    }

    public final Dialog a(Bundle bundle) {
        this.ab = new Dialog(p(), R.style.com_facebook_auth_dialog);
        this.ab.setContentView(i(als.b() && !this.ad));
        return this.ab;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.ac) {
            ae();
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.aa != null) {
            bundle.putParcelable("request_state", this.aa);
        }
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
        sb.append(amx.b());
        sb.append("|");
        sb.append(amx.c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", als.a());
        akd akd = new akd(null, "device/login", bundle, HttpMethod.POST, new b() {
            public final void a(akg akg) {
                if (!anb.this.ac) {
                    if (akg.b != null) {
                        anb.this.a(akg.b.f);
                        return;
                    }
                    JSONObject jSONObject = akg.a;
                    a aVar = new a();
                    try {
                        String string = jSONObject.getString("user_code");
                        aVar.b = string;
                        aVar.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{string});
                        aVar.c = jSONObject.getString("code");
                        aVar.d = jSONObject.getLong("interval");
                        anb.this.a(aVar);
                    } catch (JSONException e) {
                        anb.this.a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        akd.a();
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        this.aa = aVar;
        this.U.setText(aVar.b);
        this.V.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(o().getResources(), als.b(aVar.a)), null, null);
        this.U.setVisibility(0);
        this.T.setVisibility(8);
        if (!this.ad && als.a(aVar.b)) {
            new akw(n()).a("fb_smart_login_service");
        }
        if (aVar.a()) {
            ag();
        } else {
            af();
        }
    }

    /* access modifiers changed from: protected */
    public final View i(boolean z) {
        View inflate = p().getLayoutInflater().inflate(j(z), null);
        this.T = inflate.findViewById(R.id.progress_bar);
        this.U = (TextView) inflate.findViewById(R.id.confirmation_code);
        ((Button) inflate.findViewById(R.id.cancel_button)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                anb.this.ae();
            }
        });
        this.V = (TextView) inflate.findViewById(R.id.com_facebook_device_auth_instructions);
        this.V.setText(Html.fromHtml(a((int) R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: private */
    public void af() {
        this.aa.e = new Date().getTime();
        this.Y = ah().a();
    }

    /* access modifiers changed from: private */
    public void ag() {
        this.Z = anc.c().schedule(new Runnable() {
            public final void run() {
                anb.this.af();
            }
        }, this.aa.d, TimeUnit.SECONDS);
    }

    private akd ah() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.aa.c);
        akd akd = new akd(null, "device/login_status", bundle, HttpMethod.POST, new b() {
            public final void a(akg akg) {
                if (!anb.this.X.get()) {
                    FacebookRequestError facebookRequestError = akg.b;
                    if (facebookRequestError != null) {
                        int i = facebookRequestError.c;
                        if (i != 1349152) {
                            switch (i) {
                                case 1349172:
                                case 1349174:
                                    anb.this.ag();
                                    return;
                                case 1349173:
                                    anb.this.ae();
                                    return;
                                default:
                                    anb.this.a(akg.b.f);
                                    return;
                            }
                        } else {
                            if (anb.this.aa != null) {
                                als.c(anb.this.aa.b);
                            }
                            if (anb.this.ae != null) {
                                anb anb = anb.this;
                                anb.a(anb.ae);
                                return;
                            }
                            anb.this.ae();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = akg.a;
                            anb.a(anb.this, jSONObject.getString("access_token"), Long.valueOf(jSONObject.getLong("expires_in")), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e) {
                            anb.this.a(new FacebookException((Throwable) e));
                        }
                    }
                }
            }
        });
        return akd;
    }

    /* access modifiers changed from: protected */
    public final void a(FacebookException facebookException) {
        if (this.X.compareAndSet(false, true)) {
            if (this.aa != null) {
                als.c(this.aa.b);
            }
            this.W.a((Exception) facebookException);
            this.ab.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void ae() {
        if (this.X.compareAndSet(false, true)) {
            if (this.aa != null) {
                als.c(this.aa.b);
            }
            anc anc = this.W;
            if (anc != null) {
                anc.i_();
            }
            this.ab.dismiss();
        }
    }

    static /* synthetic */ void a(anb anb, String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        aju aju = new aju(str, akc.k(), Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, null, null, null, date2, null, date);
        final String str2 = str;
        akd akd = new akd(aju, "me", bundle, HttpMethod.GET, new b() {
            public final void a(akg akg) {
                if (!anb.this.X.get()) {
                    if (akg.b != null) {
                        anb.this.a(akg.b.f);
                        return;
                    }
                    try {
                        JSONObject jSONObject = akg.a;
                        String string = jSONObject.getString("id");
                        c a2 = amw.a(jSONObject);
                        String string2 = jSONObject.getString("name");
                        als.c(anb.this.aa.b);
                        if (!FetchedAppSettingsManager.a(akc.k()).f.contains(SmartLoginOption.RequireConfirm) || anb.this.ad) {
                            anb.a(anb.this, string, a2, str2, date2, date);
                            return;
                        }
                        anb.this.ad = true;
                        anb.a(anb.this, string, a2, str2, string2, date2, date);
                    } catch (JSONException e) {
                        anb.this.a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        akd.a();
    }

    static /* synthetic */ void a(anb anb, String str, c cVar, String str2, Date date, Date date2) {
        anb anb2 = anb;
        c cVar2 = cVar;
        anb2.W.a(str2, akc.k(), str, cVar2.a, cVar2.b, cVar2.c, AccessTokenSource.DEVICE_AUTH, date, null, date2);
        anb2.ab.dismiss();
    }

    static /* synthetic */ void a(anb anb, String str, c cVar, String str2, String str3, Date date, Date date2) {
        String string = anb.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
        String string2 = anb.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
        String string3 = anb.o().getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(anb.n());
        Builder cancelable = builder.setMessage(string).setCancelable(true);
        final String str4 = str;
        final c cVar2 = cVar;
        final String str5 = str2;
        final Date date3 = date;
        final Date date4 = date2;
        AnonymousClass6 r5 = new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                anb.a(anb.this, str4, cVar2, str5, date3, date4);
            }
        };
        anb anb2 = anb;
        cancelable.setNegativeButton(format, r5).setPositiveButton(string3, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                anb.this.ab.setContentView(anb.this.i(false));
                anb anb = anb.this;
                anb.a(anb.ae);
            }
        });
        builder.create().show();
    }
}
