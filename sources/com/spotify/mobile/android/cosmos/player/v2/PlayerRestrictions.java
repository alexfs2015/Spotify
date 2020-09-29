package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.Set;

@Deprecated
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerRestrictions implements Parcelable, JacksonModel {
    public static final Creator<PlayerRestrictions> CREATOR = new Creator<PlayerRestrictions>() {
        public final PlayerRestrictions createFromParcel(Parcel parcel) {
            return new PlayerRestrictions(parcel);
        }

        public final PlayerRestrictions[] newArray(int i) {
            return new PlayerRestrictions[i];
        }
    };
    @JsonProperty("disallow_inserting_into_context_tracks_reasons")
    private final Set<String> mDisallowInsertingIntoContextTracksReasons;
    @JsonProperty("disallow_inserting_into_next_tracks_reasons")
    private final Set<String> mDisallowInsertingIntoNextTracksReasons;
    @JsonProperty("disallow_pausing_reasons")
    private final Set<String> mDisallowPausingReasons;
    @JsonProperty("disallow_peeking_next_reasons")
    private final Set<String> mDisallowPeekingNextReasons;
    @JsonProperty("disallow_peeking_prev_reasons")
    private final Set<String> mDisallowPeekingPrevReasons;
    @JsonProperty("disallow_remote_control_reasons")
    private final Set<String> mDisallowRemoteControlReasons;
    @JsonProperty("disallow_removing_from_context_tracks_reasons")
    private final Set<String> mDisallowRemovingFromContextTracksReasons;
    @JsonProperty("disallow_removing_from_next_tracks_reasons")
    private final Set<String> mDisallowRemovingFromNextTracksReasons;
    @JsonProperty("disallow_reordering_in_context_tracks_reasons")
    private final Set<String> mDisallowReorderingInContextTracksReasons;
    @JsonProperty("disallow_reordering_in_next_tracks_reasons")
    private final Set<String> mDisallowReorderingInNextTracksReasons;
    @JsonProperty("disallow_resuming_reasons")
    private final Set<String> mDisallowResumingReasons;
    @JsonProperty("disallow_seeking_reasons")
    private final Set<String> mDisallowSeekingReasons;
    @JsonProperty("disallow_set_queue_reasons")
    private final Set<String> mDisallowSetQueueReasons;
    @JsonProperty("disallow_skipping_next_reasons")
    private final Set<String> mDisallowSkippingNextReasons;
    @JsonProperty("disallow_skipping_prev_reasons")
    private final Set<String> mDisallowSkippingPrevReasons;
    @JsonProperty("disallow_toggling_repeat_context_reasons")
    private final Set<String> mDisallowTogglingRepeatContextReasons;
    @JsonProperty("disallow_toggling_repeat_track_reasons")
    private final Set<String> mDisallowTogglingRepeatTrackReasons;
    @JsonProperty("disallow_toggling_shuffle_reasons")
    private final Set<String> mDisallowTogglingShuffleReasons;
    @JsonProperty("disallow_transferring_playback_reasons")
    private final Set<String> mDisallowTransferringPlaybackReasons;
    @JsonProperty("disallow_updating_context_reasons")
    private final Set<String> mDisallowUpdatingContextReasons;

    protected PlayerRestrictions(Parcel parcel) {
        this.mDisallowPeekingPrevReasons = juo.b(parcel);
        this.mDisallowPeekingNextReasons = juo.b(parcel);
        this.mDisallowSkippingPrevReasons = juo.b(parcel);
        this.mDisallowSkippingNextReasons = juo.b(parcel);
        this.mDisallowPausingReasons = juo.b(parcel);
        this.mDisallowResumingReasons = juo.b(parcel);
        this.mDisallowTogglingRepeatContextReasons = juo.b(parcel);
        this.mDisallowTogglingRepeatTrackReasons = juo.b(parcel);
        this.mDisallowTogglingShuffleReasons = juo.b(parcel);
        this.mDisallowSeekingReasons = juo.b(parcel);
        this.mDisallowTransferringPlaybackReasons = juo.b(parcel);
        this.mDisallowRemoteControlReasons = juo.b(parcel);
        this.mDisallowInsertingIntoNextTracksReasons = juo.b(parcel);
        this.mDisallowInsertingIntoContextTracksReasons = juo.b(parcel);
        this.mDisallowReorderingInNextTracksReasons = juo.b(parcel);
        this.mDisallowReorderingInContextTracksReasons = juo.b(parcel);
        this.mDisallowRemovingFromNextTracksReasons = juo.b(parcel);
        this.mDisallowRemovingFromContextTracksReasons = juo.b(parcel);
        this.mDisallowUpdatingContextReasons = juo.b(parcel);
        this.mDisallowSetQueueReasons = juo.b(parcel);
    }

    @JsonCreator
    public PlayerRestrictions(@JsonProperty("disallow_peeking_prev_reasons") Set<String> set, @JsonProperty("disallow_peeking_next_reasons") Set<String> set2, @JsonProperty("disallow_skipping_prev_reasons") Set<String> set3, @JsonProperty("disallow_skipping_next_reasons") Set<String> set4, @JsonProperty("disallow_pausing_reasons") Set<String> set5, @JsonProperty("disallow_resuming_reasons") Set<String> set6, @JsonProperty("disallow_toggling_repeat_context_reasons") Set<String> set7, @JsonProperty("disallow_toggling_repeat_track_reasons") Set<String> set8, @JsonProperty("disallow_toggling_shuffle_reasons") Set<String> set9, @JsonProperty("disallow_seeking_reasons") Set<String> set10, @JsonProperty("disallow_transferring_playback_reasons") Set<String> set11, @JsonProperty("disallow_remote_control_reasons") Set<String> set12, @JsonProperty("disallow_inserting_into_next_tracks_reasons") Set<String> set13, @JsonProperty("disallow_inserting_into_context_tracks_reasons") Set<String> set14, @JsonProperty("disallow_reordering_in_next_tracks_reasons") Set<String> set15, @JsonProperty("disallow_reordering_in_context_tracks_reasons") Set<String> set16, @JsonProperty("disallow_removing_from_next_tracks_reasons") Set<String> set17, @JsonProperty("disallow_removing_from_context_tracks_reasons") Set<String> set18, @JsonProperty("disallow_updating_context_reasons") Set<String> set19, @JsonProperty("disallow_set_queue_reasons") Set<String> set20) {
        this.mDisallowPeekingPrevReasons = unmodifiable(set);
        this.mDisallowPeekingNextReasons = unmodifiable(set2);
        this.mDisallowSkippingPrevReasons = unmodifiable(set3);
        this.mDisallowSkippingNextReasons = unmodifiable(set4);
        this.mDisallowPausingReasons = unmodifiable(set5);
        this.mDisallowResumingReasons = unmodifiable(set6);
        this.mDisallowTogglingRepeatContextReasons = unmodifiable(set7);
        this.mDisallowTogglingRepeatTrackReasons = unmodifiable(set8);
        this.mDisallowTogglingShuffleReasons = unmodifiable(set9);
        this.mDisallowSeekingReasons = unmodifiable(set10);
        this.mDisallowTransferringPlaybackReasons = unmodifiable(set11);
        this.mDisallowRemoteControlReasons = unmodifiable(set12);
        this.mDisallowInsertingIntoNextTracksReasons = unmodifiable(set13);
        this.mDisallowInsertingIntoContextTracksReasons = unmodifiable(set14);
        this.mDisallowReorderingInNextTracksReasons = unmodifiable(set15);
        this.mDisallowReorderingInContextTracksReasons = unmodifiable(set16);
        this.mDisallowRemovingFromNextTracksReasons = unmodifiable(set17);
        this.mDisallowRemovingFromContextTracksReasons = unmodifiable(set18);
        this.mDisallowUpdatingContextReasons = unmodifiable(set19);
        this.mDisallowSetQueueReasons = unmodifiable(set20);
    }

    public static PlayerRestrictions empty() {
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        return playerRestrictions;
    }

    private static Set<String> unmodifiable(Set<String> set) {
        if (set == null) {
            set = Collections.emptySet();
        }
        return Collections.unmodifiableSet(set);
    }

    public int describeContents() {
        return 0;
    }

    public Set<String> disallowInsertingIntoContextTracksReasons() {
        return this.mDisallowInsertingIntoContextTracksReasons;
    }

    public Set<String> disallowInsertingIntoNextTracksReasons() {
        return this.mDisallowInsertingIntoNextTracksReasons;
    }

    public Set<String> disallowPausingReasons() {
        return this.mDisallowPausingReasons;
    }

    public Set<String> disallowPeekingNextReasons() {
        return this.mDisallowPeekingNextReasons;
    }

    public Set<String> disallowPeekingPrevReasons() {
        return this.mDisallowPeekingPrevReasons;
    }

    public Set<String> disallowRemoteControlReasons() {
        return this.mDisallowRemoteControlReasons;
    }

    public Set<String> disallowRemovingFromContextTracksReasons() {
        return this.mDisallowRemovingFromContextTracksReasons;
    }

    public Set<String> disallowRemovingFromNextTracksReasons() {
        return this.mDisallowRemovingFromNextTracksReasons;
    }

    public Set<String> disallowReorderingInContextTracksReasons() {
        return this.mDisallowReorderingInContextTracksReasons;
    }

    public Set<String> disallowReorderingInNextTracksReasons() {
        return this.mDisallowReorderingInNextTracksReasons;
    }

    public Set<String> disallowResumingReasons() {
        return this.mDisallowResumingReasons;
    }

    public Set<String> disallowSeekingReasons() {
        return this.mDisallowSeekingReasons;
    }

    public Set<String> disallowSetQueueReasons() {
        return this.mDisallowSetQueueReasons;
    }

    public Set<String> disallowSkippingNextReasons() {
        return this.mDisallowSkippingNextReasons;
    }

    public Set<String> disallowSkippingPrevReasons() {
        return this.mDisallowSkippingPrevReasons;
    }

    public Set<String> disallowTogglingRepeatContextReasons() {
        return this.mDisallowTogglingRepeatContextReasons;
    }

    public Set<String> disallowTogglingRepeatTrackReasons() {
        return this.mDisallowTogglingRepeatTrackReasons;
    }

    public Set<String> disallowTogglingShuffleReasons() {
        return this.mDisallowTogglingShuffleReasons;
    }

    public Set<String> disallowTransferringPlaybackReasons() {
        return this.mDisallowTransferringPlaybackReasons;
    }

    public Set<String> disallowUpdatingContextReasons() {
        return this.mDisallowUpdatingContextReasons;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerRestrictions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = (PlayerRestrictions) obj;
        if (!this.mDisallowPausingReasons.equals(playerRestrictions.mDisallowPausingReasons)) {
            return false;
        }
        if (!this.mDisallowPeekingNextReasons.equals(playerRestrictions.mDisallowPeekingNextReasons)) {
            return false;
        }
        if (!this.mDisallowPeekingPrevReasons.equals(playerRestrictions.mDisallowPeekingPrevReasons)) {
            return false;
        }
        if (!this.mDisallowResumingReasons.equals(playerRestrictions.mDisallowResumingReasons)) {
            return false;
        }
        if (!this.mDisallowSeekingReasons.equals(playerRestrictions.mDisallowSeekingReasons)) {
            return false;
        }
        if (!this.mDisallowSkippingNextReasons.equals(playerRestrictions.mDisallowSkippingNextReasons)) {
            return false;
        }
        if (!this.mDisallowSkippingPrevReasons.equals(playerRestrictions.mDisallowSkippingPrevReasons)) {
            return false;
        }
        if (!this.mDisallowTogglingRepeatContextReasons.equals(playerRestrictions.mDisallowTogglingRepeatContextReasons) || !this.mDisallowTogglingRepeatTrackReasons.equals(playerRestrictions.mDisallowTogglingRepeatTrackReasons) || !this.mDisallowTogglingShuffleReasons.equals(playerRestrictions.mDisallowTogglingShuffleReasons) || !this.mDisallowTransferringPlaybackReasons.equals(playerRestrictions.mDisallowTransferringPlaybackReasons)) {
            return false;
        }
        if (!this.mDisallowRemoteControlReasons.equals(playerRestrictions.mDisallowRemoteControlReasons)) {
            return false;
        }
        if (!this.mDisallowInsertingIntoNextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoNextTracksReasons)) {
            return false;
        }
        if (!this.mDisallowInsertingIntoContextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoContextTracksReasons)) {
            return false;
        }
        if (!this.mDisallowReorderingInNextTracksReasons.equals(playerRestrictions.mDisallowReorderingInNextTracksReasons)) {
            return false;
        }
        if (!this.mDisallowReorderingInContextTracksReasons.equals(playerRestrictions.mDisallowReorderingInContextTracksReasons)) {
            return false;
        }
        if (this.mDisallowRemovingFromNextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromNextTracksReasons) && this.mDisallowRemovingFromContextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromContextTracksReasons) && this.mDisallowUpdatingContextReasons.equals(playerRestrictions.mDisallowUpdatingContextReasons)) {
            return this.mDisallowSetQueueReasons.equals(playerRestrictions.mDisallowSetQueueReasons);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.mDisallowPeekingPrevReasons.hashCode() * 31) + this.mDisallowPeekingNextReasons.hashCode()) * 31) + this.mDisallowSkippingPrevReasons.hashCode()) * 31) + this.mDisallowSkippingNextReasons.hashCode()) * 31) + this.mDisallowPausingReasons.hashCode()) * 31) + this.mDisallowResumingReasons.hashCode()) * 31) + this.mDisallowTogglingRepeatContextReasons.hashCode()) * 31) + this.mDisallowTogglingRepeatTrackReasons.hashCode()) * 31) + this.mDisallowTogglingShuffleReasons.hashCode()) * 31) + this.mDisallowSeekingReasons.hashCode()) * 31) + this.mDisallowTransferringPlaybackReasons.hashCode()) * 31) + this.mDisallowRemoteControlReasons.hashCode()) * 31) + this.mDisallowInsertingIntoNextTracksReasons.hashCode()) * 31) + this.mDisallowInsertingIntoContextTracksReasons.hashCode()) * 31) + this.mDisallowReorderingInNextTracksReasons.hashCode()) * 31) + this.mDisallowReorderingInContextTracksReasons.hashCode()) * 31) + this.mDisallowRemovingFromNextTracksReasons.hashCode()) * 31) + this.mDisallowRemovingFromContextTracksReasons.hashCode()) * 31) + this.mDisallowUpdatingContextReasons.hashCode()) * 31) + this.mDisallowSetQueueReasons.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        juo.a(parcel, this.mDisallowPeekingPrevReasons);
        juo.a(parcel, this.mDisallowPeekingNextReasons);
        juo.a(parcel, this.mDisallowSkippingPrevReasons);
        juo.a(parcel, this.mDisallowSkippingNextReasons);
        juo.a(parcel, this.mDisallowPausingReasons);
        juo.a(parcel, this.mDisallowResumingReasons);
        juo.a(parcel, this.mDisallowTogglingRepeatContextReasons);
        juo.a(parcel, this.mDisallowTogglingRepeatTrackReasons);
        juo.a(parcel, this.mDisallowTogglingShuffleReasons);
        juo.a(parcel, this.mDisallowSeekingReasons);
        juo.a(parcel, this.mDisallowTransferringPlaybackReasons);
        juo.a(parcel, this.mDisallowRemoteControlReasons);
        juo.a(parcel, this.mDisallowInsertingIntoNextTracksReasons);
        juo.a(parcel, this.mDisallowInsertingIntoContextTracksReasons);
        juo.a(parcel, this.mDisallowReorderingInNextTracksReasons);
        juo.a(parcel, this.mDisallowReorderingInContextTracksReasons);
        juo.a(parcel, this.mDisallowRemovingFromNextTracksReasons);
        juo.a(parcel, this.mDisallowRemovingFromContextTracksReasons);
        juo.a(parcel, this.mDisallowUpdatingContextReasons);
        juo.a(parcel, this.mDisallowSetQueueReasons);
    }
}
