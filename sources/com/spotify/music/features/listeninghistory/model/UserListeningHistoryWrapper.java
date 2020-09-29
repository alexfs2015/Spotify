package com.spotify.music.features.listeninghistory.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

public abstract class UserListeningHistoryWrapper implements Parcelable, JacksonModel {
    @JsonCreator
    public static UserListeningHistoryWrapper create(@JsonProperty("sessionList") List<Session> list, @JsonProperty("lastSessionEndTime") long j) {
        return new AutoValue_UserListeningHistoryWrapper(ImmutableList.a((Collection<? extends E>) list), j);
    }

    public abstract long getLastSessionEndTime();

    public abstract List<Session> getSessionList();
}
