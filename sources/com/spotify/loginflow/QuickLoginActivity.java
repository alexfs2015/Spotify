package com.spotify.loginflow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginOptions;
import com.spotify.cosmos.session.model.LoginOptions.Builder;
import com.spotify.cosmos.session.model.LoginOptions.PreAuthenticationSetting;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import dagger.android.DispatchingAndroidInjector;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class QuickLoginActivity extends jjs implements vtr {
    public SessionClient g;
    public DispatchingAndroidInjector<Object> h;
    public gnk i;

    public void onCreate(Bundle bundle) {
        setTheme(2132017719);
        fzx.a(this);
        vtj.a((Activity) this);
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
        this.i.start();
        Intent intent = getIntent();
        LoginCredentials password = LoginCredentials.password(intent.getStringExtra("username"), intent.getStringExtra("password"));
        Builder builder = LoginOptions.builder();
        builder.preAuthenticationSetting(PreAuthenticationSetting.REQUIRESUCCESS);
        this.g.login(LoginRequest.create(password, builder.build())).b((SingleObserver<? super T>) new SingleObserver<LoginResponse>() {
            public final void onSubscribe(Disposable disposable) {
                Logger.b("tada1", new Object[0]);
            }

            public final void onError(Throwable th) {
                Logger.b("tada3", new Object[0]);
            }

            public final /* synthetic */ void c_(Object obj) {
                QuickLoginActivity.this.startActivity(QuickLoginActivity.this.getPackageManager().getLaunchIntentForPackage(QuickLoginActivity.this.getPackageName()));
                QuickLoginActivity.this.finish();
            }
        });
    }

    public final vtk<Object> j() {
        return this.h;
    }
}
