package com.spotify.music.features.listeninghistory.domain;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.listeninghistory.model.Session;

public abstract class ListeningHistoryModel {
    public static final ListeningHistoryModel a = new defpackage.nqm.a().a(true).a(LoadState.LOADING).a("").a(ImmutableList.g().a()).a();

    public enum LoadState {
        LOADING,
        SUCCESS,
        FAILED
    }

    public interface a {
        a a(ImmutableList<Session> immutableList);

        a a(LoadState loadState);

        a a(String str);

        a a(boolean z);

        ListeningHistoryModel a();
    }

    public abstract ImmutableList<Session> a();

    public abstract String b();

    public abstract LoadState c();

    public abstract boolean d();

    public abstract a e();

    public final ListeningHistoryModel a(LoadState loadState) {
        return e().a(loadState).a();
    }

    public final ListeningHistoryModel a(boolean z) {
        return e().a(z).a();
    }
}
