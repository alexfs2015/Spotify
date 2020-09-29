package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Function;

/* renamed from: com.spotify.music.features.yourlibrary.musicpages.filterandsort.-$$Lambda$DtEvfn0Icv19eGJW_fHdFkt-5y4 reason: invalid class name */
public final /* synthetic */ class $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4 implements Function {
    public static final /* synthetic */ $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4 INSTANCE = new $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4();

    private /* synthetic */ $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4() {
    }

    public final Object apply(Object obj) {
        return ((SessionState) obj).currentUser();
    }
}
