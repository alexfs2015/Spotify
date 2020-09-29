package com.spotify.mobile.android.ui.activity.upsell;

import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: com.spotify.mobile.android.ui.activity.upsell.-$$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc implements wut {
    public static final /* synthetic */ $$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc INSTANCE = new $$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc();

    private /* synthetic */ $$Lambda$TrialActivationPresenter$malPS5DdABCUll6mLi9SsNeM7Gc() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf("premium".equals(((SessionState) obj).productType()));
    }
}
