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

    public int describeContents() {
        return 0;
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

    private static Set<String> unmodifiable(Set<String> set) {
        if (set == null) {
            set = Collections.emptySet();
        }
        return Collections.unmodifiableSet(set);
    }

    public Set<String> disallowSetQueueReasons() {
        return this.mDisallowSetQueueReasons;
    }

    public Set<String> disallowPeekingPrevReasons() {
        return this.mDisallowPeekingPrevReasons;
    }

    public Set<String> disallowPeekingNextReasons() {
        return this.mDisallowPeekingNextReasons;
    }

    public Set<String> disallowSkippingPrevReasons() {
        return this.mDisallowSkippingPrevReasons;
    }

    public Set<String> disallowSkippingNextReasons() {
        return this.mDisallowSkippingNextReasons;
    }

    public Set<String> disallowPausingReasons() {
        return this.mDisallowPausingReasons;
    }

    public Set<String> disallowResumingReasons() {
        return this.mDisallowResumingReasons;
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

    public Set<String> disallowSeekingReasons() {
        return this.mDisallowSeekingReasons;
    }

    public Set<String> disallowTransferringPlaybackReasons() {
        return this.mDisallowTransferringPlaybackReasons;
    }

    public Set<String> disallowRemoteControlReasons() {
        return this.mDisallowRemoteControlReasons;
    }

    public Set<String> disallowInsertingIntoNextTracksReasons() {
        return this.mDisallowInsertingIntoNextTracksReasons;
    }

    public Set<String> disallowInsertingIntoContextTracksReasons() {
        return this.mDisallowInsertingIntoContextTracksReasons;
    }

    public Set<String> disallowReorderingInNextTracksReasons() {
        return this.mDisallowReorderingInNextTracksReasons;
    }

    public Set<String> disallowReorderingInContextTracksReasons() {
        return this.mDisallowReorderingInContextTracksReasons;
    }

    public Set<String> disallowRemovingFromNextTracksReasons() {
        return this.mDisallowRemovingFromNextTracksReasons;
    }

    public Set<String> disallowRemovingFromContextTracksReasons() {
        return this.mDisallowRemovingFromContextTracksReasons;
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
        return this.mDisallowPausingReasons.equals(playerRestrictions.mDisallowPausingReasons) && this.mDisallowPeekingNextReasons.equals(playerRestrictions.mDisallowPeekingNextReasons) && this.mDisallowPeekingPrevReasons.equals(playerRestrictions.mDisallowPeekingPrevReasons) && this.mDisallowResumingReasons.equals(playerRestrictions.mDisallowResumingReasons) && this.mDisallowSeekingReasons.equals(playerRestrictions.mDisallowSeekingReasons) && this.mDisallowSkippingNextReasons.equals(playerRestrictions.mDisallowSkippingNextReasons) && this.mDisallowSkippingPrevReasons.equals(playerRestrictions.mDisallowSkippingPrevReasons) && this.mDisallowTogglingRepeatContextReasons.equals(playerRestrictions.mDisallowTogglingRepeatContextReasons) && this.mDisallowTogglingRepeatTrackReasons.equals(playerRestrictions.mDisallowTogglingRepeatTrackReasons) && this.mDisallowTogglingShuffleReasons.equals(playerRestrictions.mDisallowTogglingShuffleReasons) && this.mDisallowTransferringPlaybackReasons.equals(playerRestrictions.mDisallowTransferringPlaybackReasons) && this.mDisallowRemoteControlReasons.equals(playerRestrictions.mDisallowRemoteControlReasons) && this.mDisallowInsertingIntoNextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoNextTracksReasons) && this.mDisallowInsertingIntoContextTracksReasons.equals(playerRestrictions.mDisallowInsertingIntoContextTracksReasons) && this.mDisallowReorderingInNextTracksReasons.equals(playerRestrictions.mDisallowReorderingInNextTracksReasons) && this.mDisallowReorderingInContextTracksReasons.equals(playerRestrictions.mDisallowReorderingInContextTracksReasons) && this.mDisallowRemovingFromNextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromNextTracksReasons) && this.mDisallowRemovingFromContextTracksReasons.equals(playerRestrictions.mDisallowRemovingFromContextTracksReasons) && this.mDisallowUpdatingContextReasons.equals(playerRestrictions.mDisallowUpdatingContextReasons) && this.mDisallowSetQueueReasons.equals(playerRestrictions.mDisallowSetQueueReasons);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.mDisallowPeekingPrevReasons.hashCode() * 31) + this.mDisallowPeekingNextReasons.hashCode()) * 31) + this.mDisallowSkippingPrevReasons.hashCode()) * 31) + this.mDisallowSkippingNextReasons.hashCode()) * 31) + this.mDisallowPausingReasons.hashCode()) * 31) + this.mDisallowResumingReasons.hashCode()) * 31) + this.mDisallowTogglingRepeatContextReasons.hashCode()) * 31) + this.mDisallowTogglingRepeatTrackReasons.hashCode()) * 31) + this.mDisallowTogglingShuffleReasons.hashCode()) * 31) + this.mDisallowSeekingReasons.hashCode()) * 31) + this.mDisallowTransferringPlaybackReasons.hashCode()) * 31) + this.mDisallowRemoteControlReasons.hashCode()) * 31) + this.mDisallowInsertingIntoNextTracksReasons.hashCode()) * 31) + this.mDisallowInsertingIntoContextTracksReasons.hashCode()) * 31) + this.mDisallowReorderingInNextTracksReasons.hashCode()) * 31) + this.mDisallowReorderingInContextTracksReasons.hashCode()) * 31) + this.mDisallowRemovingFromNextTracksReasons.hashCode()) * 31) + this.mDisallowRemovingFromContextTracksReasons.hashCode()) * 31) + this.mDisallowUpdatingContextReasons.hashCode()) * 31) + this.mDisallowSetQueueReasons.hashCode();
    }

    protected PlayerRestrictions(Parcel parcel) {
        this.mDisallowPeekingPrevReasons = jse.b(parcel);
        this.mDisallowPeekingNextReasons = jse.b(parcel);
        this.mDisallowSkippingPrevReasons = jse.b(parcel);
        this.mDisallowSkippingNextReasons = jse.b(parcel);
        this.mDisallowPausingReasons = jse.b(parcel);
        this.mDisallowResumingReasons = jse.b(parcel);
        this.mDisallowTogglingRepeatContextReasons = jse.b(parcel);
        this.mDisallowTogglingRepeatTrackReasons = jse.b(parcel);
        this.mDisallowTogglingShuffleReasons = jse.b(parcel);
        this.mDisallowSeekingReasons = jse.b(parcel);
        this.mDisallowTransferringPlaybackReasons = jse.b(parcel);
        this.mDisallowRemoteControlReasons = jse.b(parcel);
        this.mDisallowInsertingIntoNextTracksReasons = jse.b(parcel);
        this.mDisallowInsertingIntoContextTracksReasons = jse.b(parcel);
        this.mDisallowReorderingInNextTracksReasons = jse.b(parcel);
        this.mDisallowReorderingInContextTracksReasons = jse.b(parcel);
        this.mDisallowRemovingFromNextTracksReasons = jse.b(parcel);
        this.mDisallowRemovingFromContextTracksReasons = jse.b(parcel);
        this.mDisallowUpdatingContextReasons = jse.b(parcel);
        this.mDisallowSetQueueReasons = jse.b(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        jse.a(parcel, this.mDisallowPeekingPrevReasons);
        jse.a(parcel, this.mDisallowPeekingNextReasons);
        jse.a(parcel, this.mDisallowSkippingPrevReasons);
        jse.a(parcel, this.mDisallowSkippingNextReasons);
        jse.a(parcel, this.mDisallowPausingReasons);
        jse.a(parcel, this.mDisallowResumingReasons);
        jse.a(parcel, this.mDisallowTogglingRepeatContextReasons);
        jse.a(parcel, this.mDisallowTogglingRepeatTrackReasons);
        jse.a(parcel, this.mDisallowTogglingShuffleReasons);
        jse.a(parcel, this.mDisallowSeekingReasons);
        jse.a(parcel, this.mDisallowTransferringPlaybackReasons);
        jse.a(parcel, this.mDisallowRemoteControlReasons);
        jse.a(parcel, this.mDisallowInsertingIntoNextTracksReasons);
        jse.a(parcel, this.mDisallowInsertingIntoContextTracksReasons);
        jse.a(parcel, this.mDisallowReorderingInNextTracksReasons);
        jse.a(parcel, this.mDisallowReorderingInContextTracksReasons);
        jse.a(parcel, this.mDisallowRemovingFromNextTracksReasons);
        jse.a(parcel, this.mDisallowRemovingFromContextTracksReasons);
        jse.a(parcel, this.mDisallowUpdatingContextReasons);
        jse.a(parcel, this.mDisallowSetQueueReasons);
    }

    public static PlayerRestrictions empty() {
        PlayerRestrictions playerRestrictions = new PlayerRestrictions(Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet());
        return playerRestrictions;
    }
}
