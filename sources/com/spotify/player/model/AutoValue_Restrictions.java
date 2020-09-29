package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;

final class AutoValue_Restrictions extends Restrictions {
    private final ImmutableSet<String> disallowInsertingIntoContextTracksReasons;
    private final ImmutableSet<String> disallowInsertingIntoNextTracksReasons;
    private final ImmutableSet<String> disallowInterruptingPlaybackReasons;
    private final ImmutableSet<String> disallowPausingReasons;
    private final ImmutableSet<String> disallowPeekingNextReasons;
    private final ImmutableSet<String> disallowPeekingPrevReasons;
    private final ImmutableSet<String> disallowRemoteControlReasons;
    private final ImmutableSet<String> disallowRemovingFromContextTracksReasons;
    private final ImmutableSet<String> disallowRemovingFromNextTracksReasons;
    private final ImmutableSet<String> disallowReorderingInContextTracksReasons;
    private final ImmutableSet<String> disallowReorderingInNextTracksReasons;
    private final ImmutableSet<String> disallowResumingReasons;
    private final ImmutableSet<String> disallowSeekingReasons;
    private final ImmutableSet<String> disallowSetQueueReasons;
    private final ImmutableSet<String> disallowSkippingNextReasons;
    private final ImmutableSet<String> disallowSkippingPrevReasons;
    private final ImmutableSet<String> disallowTogglingRepeatContextReasons;
    private final ImmutableSet<String> disallowTogglingRepeatTrackReasons;
    private final ImmutableSet<String> disallowTogglingShuffleReasons;
    private final ImmutableSet<String> disallowTransferringPlaybackReasons;
    private final ImmutableSet<String> disallowUpdatingContextReasons;

    static final class Builder extends com.spotify.player.model.Restrictions.Builder {
        private ImmutableSet<String> disallowInsertingIntoContextTracksReasons;
        private ImmutableSet<String> disallowInsertingIntoNextTracksReasons;
        private ImmutableSet<String> disallowInterruptingPlaybackReasons;
        private ImmutableSet<String> disallowPausingReasons;
        private ImmutableSet<String> disallowPeekingNextReasons;
        private ImmutableSet<String> disallowPeekingPrevReasons;
        private ImmutableSet<String> disallowRemoteControlReasons;
        private ImmutableSet<String> disallowRemovingFromContextTracksReasons;
        private ImmutableSet<String> disallowRemovingFromNextTracksReasons;
        private ImmutableSet<String> disallowReorderingInContextTracksReasons;
        private ImmutableSet<String> disallowReorderingInNextTracksReasons;
        private ImmutableSet<String> disallowResumingReasons;
        private ImmutableSet<String> disallowSeekingReasons;
        private ImmutableSet<String> disallowSetQueueReasons;
        private ImmutableSet<String> disallowSkippingNextReasons;
        private ImmutableSet<String> disallowSkippingPrevReasons;
        private ImmutableSet<String> disallowTogglingRepeatContextReasons;
        private ImmutableSet<String> disallowTogglingRepeatTrackReasons;
        private ImmutableSet<String> disallowTogglingShuffleReasons;
        private ImmutableSet<String> disallowTransferringPlaybackReasons;
        private ImmutableSet<String> disallowUpdatingContextReasons;

        Builder() {
        }

        private Builder(Restrictions restrictions) {
            this.disallowPausingReasons = restrictions.disallowPausingReasons();
            this.disallowResumingReasons = restrictions.disallowResumingReasons();
            this.disallowSeekingReasons = restrictions.disallowSeekingReasons();
            this.disallowPeekingPrevReasons = restrictions.disallowPeekingPrevReasons();
            this.disallowPeekingNextReasons = restrictions.disallowPeekingNextReasons();
            this.disallowSkippingPrevReasons = restrictions.disallowSkippingPrevReasons();
            this.disallowSkippingNextReasons = restrictions.disallowSkippingNextReasons();
            this.disallowTogglingRepeatContextReasons = restrictions.disallowTogglingRepeatContextReasons();
            this.disallowTogglingRepeatTrackReasons = restrictions.disallowTogglingRepeatTrackReasons();
            this.disallowTogglingShuffleReasons = restrictions.disallowTogglingShuffleReasons();
            this.disallowSetQueueReasons = restrictions.disallowSetQueueReasons();
            this.disallowInterruptingPlaybackReasons = restrictions.disallowInterruptingPlaybackReasons();
            this.disallowTransferringPlaybackReasons = restrictions.disallowTransferringPlaybackReasons();
            this.disallowRemoteControlReasons = restrictions.disallowRemoteControlReasons();
            this.disallowInsertingIntoNextTracksReasons = restrictions.disallowInsertingIntoNextTracksReasons();
            this.disallowInsertingIntoContextTracksReasons = restrictions.disallowInsertingIntoContextTracksReasons();
            this.disallowReorderingInNextTracksReasons = restrictions.disallowReorderingInNextTracksReasons();
            this.disallowReorderingInContextTracksReasons = restrictions.disallowReorderingInContextTracksReasons();
            this.disallowRemovingFromNextTracksReasons = restrictions.disallowRemovingFromNextTracksReasons();
            this.disallowRemovingFromContextTracksReasons = restrictions.disallowRemovingFromContextTracksReasons();
            this.disallowUpdatingContextReasons = restrictions.disallowUpdatingContextReasons();
        }

        public final com.spotify.player.model.Restrictions.Builder disallowPausingReasons(Set<String> set) {
            this.disallowPausingReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowResumingReasons(Set<String> set) {
            this.disallowResumingReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowSeekingReasons(Set<String> set) {
            this.disallowSeekingReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowPeekingPrevReasons(Set<String> set) {
            this.disallowPeekingPrevReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowPeekingNextReasons(Set<String> set) {
            this.disallowPeekingNextReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowSkippingPrevReasons(Set<String> set) {
            this.disallowSkippingPrevReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowSkippingNextReasons(Set<String> set) {
            this.disallowSkippingNextReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowTogglingRepeatContextReasons(Set<String> set) {
            this.disallowTogglingRepeatContextReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowTogglingRepeatTrackReasons(Set<String> set) {
            this.disallowTogglingRepeatTrackReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowTogglingShuffleReasons(Set<String> set) {
            this.disallowTogglingShuffleReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowSetQueueReasons(Set<String> set) {
            this.disallowSetQueueReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowInterruptingPlaybackReasons(Set<String> set) {
            this.disallowInterruptingPlaybackReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowTransferringPlaybackReasons(Set<String> set) {
            this.disallowTransferringPlaybackReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowRemoteControlReasons(Set<String> set) {
            this.disallowRemoteControlReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowInsertingIntoNextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoNextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowInsertingIntoContextTracksReasons(Set<String> set) {
            this.disallowInsertingIntoContextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowReorderingInNextTracksReasons(Set<String> set) {
            this.disallowReorderingInNextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowReorderingInContextTracksReasons(Set<String> set) {
            this.disallowReorderingInContextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowRemovingFromNextTracksReasons(Set<String> set) {
            this.disallowRemovingFromNextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowRemovingFromContextTracksReasons(Set<String> set) {
            this.disallowRemovingFromContextTracksReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final com.spotify.player.model.Restrictions.Builder disallowUpdatingContextReasons(Set<String> set) {
            this.disallowUpdatingContextReasons = ImmutableSet.a((Collection<? extends E>) set);
            return this;
        }

        public final Restrictions build() {
            String str = "";
            if (this.disallowPausingReasons == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" disallowPausingReasons");
                str = sb.toString();
            }
            if (this.disallowResumingReasons == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" disallowResumingReasons");
                str = sb2.toString();
            }
            if (this.disallowSeekingReasons == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" disallowSeekingReasons");
                str = sb3.toString();
            }
            if (this.disallowPeekingPrevReasons == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" disallowPeekingPrevReasons");
                str = sb4.toString();
            }
            if (this.disallowPeekingNextReasons == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" disallowPeekingNextReasons");
                str = sb5.toString();
            }
            if (this.disallowSkippingPrevReasons == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" disallowSkippingPrevReasons");
                str = sb6.toString();
            }
            if (this.disallowSkippingNextReasons == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" disallowSkippingNextReasons");
                str = sb7.toString();
            }
            if (this.disallowTogglingRepeatContextReasons == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" disallowTogglingRepeatContextReasons");
                str = sb8.toString();
            }
            if (this.disallowTogglingRepeatTrackReasons == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" disallowTogglingRepeatTrackReasons");
                str = sb9.toString();
            }
            if (this.disallowTogglingShuffleReasons == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" disallowTogglingShuffleReasons");
                str = sb10.toString();
            }
            if (this.disallowSetQueueReasons == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" disallowSetQueueReasons");
                str = sb11.toString();
            }
            if (this.disallowInterruptingPlaybackReasons == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" disallowInterruptingPlaybackReasons");
                str = sb12.toString();
            }
            if (this.disallowTransferringPlaybackReasons == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" disallowTransferringPlaybackReasons");
                str = sb13.toString();
            }
            if (this.disallowRemoteControlReasons == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" disallowRemoteControlReasons");
                str = sb14.toString();
            }
            if (this.disallowInsertingIntoNextTracksReasons == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" disallowInsertingIntoNextTracksReasons");
                str = sb15.toString();
            }
            if (this.disallowInsertingIntoContextTracksReasons == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" disallowInsertingIntoContextTracksReasons");
                str = sb16.toString();
            }
            if (this.disallowReorderingInNextTracksReasons == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" disallowReorderingInNextTracksReasons");
                str = sb17.toString();
            }
            if (this.disallowReorderingInContextTracksReasons == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" disallowReorderingInContextTracksReasons");
                str = sb18.toString();
            }
            if (this.disallowRemovingFromNextTracksReasons == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" disallowRemovingFromNextTracksReasons");
                str = sb19.toString();
            }
            if (this.disallowRemovingFromContextTracksReasons == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" disallowRemovingFromContextTracksReasons");
                str = sb20.toString();
            }
            if (this.disallowUpdatingContextReasons == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" disallowUpdatingContextReasons");
                str = sb21.toString();
            }
            if (str.isEmpty()) {
                AutoValue_Restrictions autoValue_Restrictions = new AutoValue_Restrictions(this.disallowPausingReasons, this.disallowResumingReasons, this.disallowSeekingReasons, this.disallowPeekingPrevReasons, this.disallowPeekingNextReasons, this.disallowSkippingPrevReasons, this.disallowSkippingNextReasons, this.disallowTogglingRepeatContextReasons, this.disallowTogglingRepeatTrackReasons, this.disallowTogglingShuffleReasons, this.disallowSetQueueReasons, this.disallowInterruptingPlaybackReasons, this.disallowTransferringPlaybackReasons, this.disallowRemoteControlReasons, this.disallowInsertingIntoNextTracksReasons, this.disallowInsertingIntoContextTracksReasons, this.disallowReorderingInNextTracksReasons, this.disallowReorderingInContextTracksReasons, this.disallowRemovingFromNextTracksReasons, this.disallowRemovingFromContextTracksReasons, this.disallowUpdatingContextReasons);
                return autoValue_Restrictions;
            }
            StringBuilder sb22 = new StringBuilder("Missing required properties:");
            sb22.append(str);
            throw new IllegalStateException(sb22.toString());
        }
    }

    private AutoValue_Restrictions(ImmutableSet<String> immutableSet, ImmutableSet<String> immutableSet2, ImmutableSet<String> immutableSet3, ImmutableSet<String> immutableSet4, ImmutableSet<String> immutableSet5, ImmutableSet<String> immutableSet6, ImmutableSet<String> immutableSet7, ImmutableSet<String> immutableSet8, ImmutableSet<String> immutableSet9, ImmutableSet<String> immutableSet10, ImmutableSet<String> immutableSet11, ImmutableSet<String> immutableSet12, ImmutableSet<String> immutableSet13, ImmutableSet<String> immutableSet14, ImmutableSet<String> immutableSet15, ImmutableSet<String> immutableSet16, ImmutableSet<String> immutableSet17, ImmutableSet<String> immutableSet18, ImmutableSet<String> immutableSet19, ImmutableSet<String> immutableSet20, ImmutableSet<String> immutableSet21) {
        this.disallowPausingReasons = immutableSet;
        this.disallowResumingReasons = immutableSet2;
        this.disallowSeekingReasons = immutableSet3;
        this.disallowPeekingPrevReasons = immutableSet4;
        this.disallowPeekingNextReasons = immutableSet5;
        this.disallowSkippingPrevReasons = immutableSet6;
        this.disallowSkippingNextReasons = immutableSet7;
        this.disallowTogglingRepeatContextReasons = immutableSet8;
        this.disallowTogglingRepeatTrackReasons = immutableSet9;
        this.disallowTogglingShuffleReasons = immutableSet10;
        this.disallowSetQueueReasons = immutableSet11;
        this.disallowInterruptingPlaybackReasons = immutableSet12;
        this.disallowTransferringPlaybackReasons = immutableSet13;
        this.disallowRemoteControlReasons = immutableSet14;
        this.disallowInsertingIntoNextTracksReasons = immutableSet15;
        this.disallowInsertingIntoContextTracksReasons = immutableSet16;
        this.disallowReorderingInNextTracksReasons = immutableSet17;
        this.disallowReorderingInContextTracksReasons = immutableSet18;
        this.disallowRemovingFromNextTracksReasons = immutableSet19;
        this.disallowRemovingFromContextTracksReasons = immutableSet20;
        this.disallowUpdatingContextReasons = immutableSet21;
    }

    @JsonProperty("disallow_pausing_reasons")
    public final ImmutableSet<String> disallowPausingReasons() {
        return this.disallowPausingReasons;
    }

    @JsonProperty("disallow_resuming_reasons")
    public final ImmutableSet<String> disallowResumingReasons() {
        return this.disallowResumingReasons;
    }

    @JsonProperty("disallow_seeking_reasons")
    public final ImmutableSet<String> disallowSeekingReasons() {
        return this.disallowSeekingReasons;
    }

    @JsonProperty("disallow_peeking_prev_reasons")
    public final ImmutableSet<String> disallowPeekingPrevReasons() {
        return this.disallowPeekingPrevReasons;
    }

    @JsonProperty("disallow_peeking_next_reasons")
    public final ImmutableSet<String> disallowPeekingNextReasons() {
        return this.disallowPeekingNextReasons;
    }

    @JsonProperty("disallow_skipping_prev_reasons")
    public final ImmutableSet<String> disallowSkippingPrevReasons() {
        return this.disallowSkippingPrevReasons;
    }

    @JsonProperty("disallow_skipping_next_reasons")
    public final ImmutableSet<String> disallowSkippingNextReasons() {
        return this.disallowSkippingNextReasons;
    }

    @JsonProperty("disallow_toggling_repeat_context_reasons")
    public final ImmutableSet<String> disallowTogglingRepeatContextReasons() {
        return this.disallowTogglingRepeatContextReasons;
    }

    @JsonProperty("disallow_toggling_repeat_track_reasons")
    public final ImmutableSet<String> disallowTogglingRepeatTrackReasons() {
        return this.disallowTogglingRepeatTrackReasons;
    }

    @JsonProperty("disallow_toggling_shuffle_reasons")
    public final ImmutableSet<String> disallowTogglingShuffleReasons() {
        return this.disallowTogglingShuffleReasons;
    }

    @JsonProperty("disallow_set_queue_reasons")
    public final ImmutableSet<String> disallowSetQueueReasons() {
        return this.disallowSetQueueReasons;
    }

    @JsonProperty("disallow_interrupting_playback_reasons")
    public final ImmutableSet<String> disallowInterruptingPlaybackReasons() {
        return this.disallowInterruptingPlaybackReasons;
    }

    @JsonProperty("disallow_transferring_playback_reasons")
    public final ImmutableSet<String> disallowTransferringPlaybackReasons() {
        return this.disallowTransferringPlaybackReasons;
    }

    @JsonProperty("disallow_remote_control_reasons")
    public final ImmutableSet<String> disallowRemoteControlReasons() {
        return this.disallowRemoteControlReasons;
    }

    @JsonProperty("disallow_inserting_into_next_tracks_reasons")
    public final ImmutableSet<String> disallowInsertingIntoNextTracksReasons() {
        return this.disallowInsertingIntoNextTracksReasons;
    }

    @JsonProperty("disallow_inserting_into_context_tracks_reasons")
    public final ImmutableSet<String> disallowInsertingIntoContextTracksReasons() {
        return this.disallowInsertingIntoContextTracksReasons;
    }

    @JsonProperty("disallow_reordering_in_next_tracks_reasons")
    public final ImmutableSet<String> disallowReorderingInNextTracksReasons() {
        return this.disallowReorderingInNextTracksReasons;
    }

    @JsonProperty("disallow_reordering_in_context_tracks_reasons")
    public final ImmutableSet<String> disallowReorderingInContextTracksReasons() {
        return this.disallowReorderingInContextTracksReasons;
    }

    @JsonProperty("disallow_removing_from_next_tracks_reasons")
    public final ImmutableSet<String> disallowRemovingFromNextTracksReasons() {
        return this.disallowRemovingFromNextTracksReasons;
    }

    @JsonProperty("disallow_removing_from_context_tracks_reasons")
    public final ImmutableSet<String> disallowRemovingFromContextTracksReasons() {
        return this.disallowRemovingFromContextTracksReasons;
    }

    @JsonProperty("disallow_updating_context_reasons")
    public final ImmutableSet<String> disallowUpdatingContextReasons() {
        return this.disallowUpdatingContextReasons;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Restrictions{disallowPausingReasons=");
        sb.append(this.disallowPausingReasons);
        sb.append(", disallowResumingReasons=");
        sb.append(this.disallowResumingReasons);
        sb.append(", disallowSeekingReasons=");
        sb.append(this.disallowSeekingReasons);
        sb.append(", disallowPeekingPrevReasons=");
        sb.append(this.disallowPeekingPrevReasons);
        sb.append(", disallowPeekingNextReasons=");
        sb.append(this.disallowPeekingNextReasons);
        sb.append(", disallowSkippingPrevReasons=");
        sb.append(this.disallowSkippingPrevReasons);
        sb.append(", disallowSkippingNextReasons=");
        sb.append(this.disallowSkippingNextReasons);
        sb.append(", disallowTogglingRepeatContextReasons=");
        sb.append(this.disallowTogglingRepeatContextReasons);
        sb.append(", disallowTogglingRepeatTrackReasons=");
        sb.append(this.disallowTogglingRepeatTrackReasons);
        sb.append(", disallowTogglingShuffleReasons=");
        sb.append(this.disallowTogglingShuffleReasons);
        sb.append(", disallowSetQueueReasons=");
        sb.append(this.disallowSetQueueReasons);
        sb.append(", disallowInterruptingPlaybackReasons=");
        sb.append(this.disallowInterruptingPlaybackReasons);
        sb.append(", disallowTransferringPlaybackReasons=");
        sb.append(this.disallowTransferringPlaybackReasons);
        sb.append(", disallowRemoteControlReasons=");
        sb.append(this.disallowRemoteControlReasons);
        sb.append(", disallowInsertingIntoNextTracksReasons=");
        sb.append(this.disallowInsertingIntoNextTracksReasons);
        sb.append(", disallowInsertingIntoContextTracksReasons=");
        sb.append(this.disallowInsertingIntoContextTracksReasons);
        sb.append(", disallowReorderingInNextTracksReasons=");
        sb.append(this.disallowReorderingInNextTracksReasons);
        sb.append(", disallowReorderingInContextTracksReasons=");
        sb.append(this.disallowReorderingInContextTracksReasons);
        sb.append(", disallowRemovingFromNextTracksReasons=");
        sb.append(this.disallowRemovingFromNextTracksReasons);
        sb.append(", disallowRemovingFromContextTracksReasons=");
        sb.append(this.disallowRemovingFromContextTracksReasons);
        sb.append(", disallowUpdatingContextReasons=");
        sb.append(this.disallowUpdatingContextReasons);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Restrictions) {
            Restrictions restrictions = (Restrictions) obj;
            return this.disallowPausingReasons.equals(restrictions.disallowPausingReasons()) && this.disallowResumingReasons.equals(restrictions.disallowResumingReasons()) && this.disallowSeekingReasons.equals(restrictions.disallowSeekingReasons()) && this.disallowPeekingPrevReasons.equals(restrictions.disallowPeekingPrevReasons()) && this.disallowPeekingNextReasons.equals(restrictions.disallowPeekingNextReasons()) && this.disallowSkippingPrevReasons.equals(restrictions.disallowSkippingPrevReasons()) && this.disallowSkippingNextReasons.equals(restrictions.disallowSkippingNextReasons()) && this.disallowTogglingRepeatContextReasons.equals(restrictions.disallowTogglingRepeatContextReasons()) && this.disallowTogglingRepeatTrackReasons.equals(restrictions.disallowTogglingRepeatTrackReasons()) && this.disallowTogglingShuffleReasons.equals(restrictions.disallowTogglingShuffleReasons()) && this.disallowSetQueueReasons.equals(restrictions.disallowSetQueueReasons()) && this.disallowInterruptingPlaybackReasons.equals(restrictions.disallowInterruptingPlaybackReasons()) && this.disallowTransferringPlaybackReasons.equals(restrictions.disallowTransferringPlaybackReasons()) && this.disallowRemoteControlReasons.equals(restrictions.disallowRemoteControlReasons()) && this.disallowInsertingIntoNextTracksReasons.equals(restrictions.disallowInsertingIntoNextTracksReasons()) && this.disallowInsertingIntoContextTracksReasons.equals(restrictions.disallowInsertingIntoContextTracksReasons()) && this.disallowReorderingInNextTracksReasons.equals(restrictions.disallowReorderingInNextTracksReasons()) && this.disallowReorderingInContextTracksReasons.equals(restrictions.disallowReorderingInContextTracksReasons()) && this.disallowRemovingFromNextTracksReasons.equals(restrictions.disallowRemovingFromNextTracksReasons()) && this.disallowRemovingFromContextTracksReasons.equals(restrictions.disallowRemovingFromContextTracksReasons()) && this.disallowUpdatingContextReasons.equals(restrictions.disallowUpdatingContextReasons());
        }
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((this.disallowPausingReasons.hashCode() ^ 1000003) * 1000003) ^ this.disallowResumingReasons.hashCode()) * 1000003) ^ this.disallowSeekingReasons.hashCode()) * 1000003) ^ this.disallowPeekingPrevReasons.hashCode()) * 1000003) ^ this.disallowPeekingNextReasons.hashCode()) * 1000003) ^ this.disallowSkippingPrevReasons.hashCode()) * 1000003) ^ this.disallowSkippingNextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatContextReasons.hashCode()) * 1000003) ^ this.disallowTogglingRepeatTrackReasons.hashCode()) * 1000003) ^ this.disallowTogglingShuffleReasons.hashCode()) * 1000003) ^ this.disallowSetQueueReasons.hashCode()) * 1000003) ^ this.disallowInterruptingPlaybackReasons.hashCode()) * 1000003) ^ this.disallowTransferringPlaybackReasons.hashCode()) * 1000003) ^ this.disallowRemoteControlReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoNextTracksReasons.hashCode()) * 1000003) ^ this.disallowInsertingIntoContextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInNextTracksReasons.hashCode()) * 1000003) ^ this.disallowReorderingInContextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromNextTracksReasons.hashCode()) * 1000003) ^ this.disallowRemovingFromContextTracksReasons.hashCode()) * 1000003) ^ this.disallowUpdatingContextReasons.hashCode();
    }

    public final com.spotify.player.model.Restrictions.Builder toBuilder() {
        return new Builder(this);
    }
}
