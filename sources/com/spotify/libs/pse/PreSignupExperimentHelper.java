package com.spotify.libs.pse;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.pse.model.PreSignupExperimentFlags;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public final class PreSignupExperimentHelper {
    private final SpSharedPreferences<Object> a;
    private final gmn b;
    private final gao c;
    private PreSignupExperimentFlags d;

    public enum LocalValuePropVariant {
        DE,
        BR,
        JP,
        PH,
        ID,
        TH,
        VN,
        TW,
        HK,
        CONTROL
    }

    public PreSignupExperimentHelper(SpSharedPreferences<Object> spSharedPreferences, gmn gmn, gao gao) {
        this.a = spSharedPreferences;
        this.b = gmn;
        this.c = gao;
    }

    public final Observable<PreSignupExperimentFlags> a(int i) {
        return this.b.a().c(3000, TimeUnit.MILLISECONDS).b((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                PreSignupExperimentHelper.this.a((PreSignupExperimentFlags) obj);
            }
        }).a((Consumer<? super Throwable>) $$Lambda$PreSignupExperimentHelper$JVPqrzKCIDhq0mXzQCxDCW7OiGE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PreSignupExperimentFlags preSignupExperimentFlags) {
        preSignupExperimentFlags.savePreference(this.a);
        String activeFlagsAsString = preSignupExperimentFlags.activeFlagsAsString();
        this.c.a(gaq.a((gar) new b(activeFlagsAsString)));
        Logger.b("PSES got enabled flags, %s", activeFlagsAsString);
    }

    public final PreSignupExperimentFlags a() {
        if (this.d == null) {
            try {
                this.d = PreSignupExperimentFlags.loadPreference(this.a);
            } catch (NoSuchElementException unused) {
                this.c.a(gaq.a((gar) new a()));
                this.d = new PreSignupExperimentFlags(ImmutableMap.f());
            }
        }
        return this.d;
    }

    public final boolean b() {
        return a().isEnabled(PreSignupExperimentFlags.FLAG_KEY_ENABLE_PHONE_NUMBER_SIGNUP);
    }
}
