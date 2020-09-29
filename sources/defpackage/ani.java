package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient.Result;
import com.facebook.login.LoginClient.Result.Code;
import com.facebook.login.LoginClient.a;
import com.facebook.login.LoginClient.b;
import com.facebook.login.LoginClient.c;
import com.spotify.music.R;

/* renamed from: ani reason: default package */
public final class ani extends Fragment {
    private c T;
    LoginClient a;
    private String b;

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.a = (LoginClient) bundle.getParcelable("loginClient");
            LoginClient loginClient = this.a;
            if (loginClient.b == null) {
                loginClient.b = this;
            } else {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
        } else {
            this.a = new LoginClient((Fragment) this);
        }
        this.a.c = new b() {
            public final void a(Result result) {
                ani.a(ani.this, result);
            }
        };
        ka p = p();
        if (p != null) {
            ComponentName callingActivity = p.getCallingActivity();
            if (callingActivity != null) {
                this.b = callingActivity.getPackageName();
            }
            Intent intent = p.getIntent();
            if (intent != null) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request");
                if (bundleExtra != null) {
                    this.T = (c) bundleExtra.getParcelable("request");
                }
            }
        }
    }

    public final void B() {
        LoginClient loginClient = this.a;
        if (loginClient.a >= 0) {
            loginClient.b().b();
        }
        super.B();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        final View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        this.a.d = new a() {
            public final void a() {
                findViewById.setVisibility(0);
            }

            public final void b() {
                findViewById.setVisibility(8);
            }
        };
        return inflate;
    }

    public final void z() {
        super.z();
        if (this.b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            p().finish();
            return;
        }
        this.a.a(this.T);
    }

    public final void A() {
        View view;
        super.A();
        if (this.H == null) {
            view = null;
        } else {
            view = this.H.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        LoginClient loginClient = this.a;
        if (loginClient.e != null) {
            loginClient.b().a(i, i2, intent);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("loginClient", this.a);
    }

    static /* synthetic */ void a(ani ani, Result result) {
        ani.T = null;
        int i = result.a == Code.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (ani.u()) {
            ani.p().setResult(i, intent);
            ani.p().finish();
        }
    }
}
