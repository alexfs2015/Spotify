package com.spotify.mobile.android.service.media;

import com.spotify.music.R;

public enum MediaAction {
    PLAY(0, R.drawable.mediaservice_vector_play),
    PAUSE(1, R.drawable.mediaservice_vector_pause),
    SKIP_TO_NEXT(2, R.drawable.mediaservice_vector_skip_next),
    SKIP_TO_PREVIOUS(3, R.drawable.mediaservice_vector_skip_previous),
    TURN_SHUFFLE_ON(4, R.drawable.mediaservice_vector_shuffle),
    TURN_SHUFFLE_OFF(5, R.drawable.mediaservice_vector_shuffle_active),
    THUMB_UP(6, R.drawable.mediaservice_vector_thumbs_up),
    THUMBS_UP_SELECTED(7, R.drawable.mediaservice_vector_thumbs_up_check),
    THUMB_DOWN(8, R.drawable.mediaservice_vector_thumbs_down),
    THUMB_DOWN_SELECTED(9, R.drawable.mediaservice_vector_thumbs_down_check),
    START_RADIO(10, R.drawable.mediaservice_vector_start_radio),
    ADD_TO_COLLECTION(11, R.drawable.mediaservice_vector_plus),
    REMOVE_FROM_COLLECTION(12, R.drawable.mediaservice_vector_check),
    TURN_REPEAT_ALL_ON(13, R.drawable.mediaservice_vector_repeat_off),
    TURN_REPEAT_ONE_ON(14, R.drawable.mediaservice_vector_repeat_all),
    TURN_REPEAT_ONE_OFF(15, R.drawable.mediaservice_vector_repeat_one),
    TURN_REPEAT_ALL_OFF(16, R.drawable.mediaservice_vector_repeat_all),
    SKIP_TO_NEXT_DISABLED(17, R.drawable.mediaservice_vector_skip_next),
    SKIP_TO_PREVIOUS_DISABLED(18, R.drawable.mediaservice_vector_skip_previous),
    SEEK_15_SECONDS_FORWARD(19, R.drawable.mediaservice_vector_seek_forward_15),
    SEEK_15_SECONDS_BACK(20, R.drawable.mediaservice_vector_seek_back_15),
    STOP(21, 0),
    PLAY_FROM_URI(22, 0),
    PREPARE_FROM_URI(23, 0),
    PLAY_FROM_SEARCH(24, 0),
    NO_ACTION(25, 0),
    TOGGLE_REPEAT(26, R.drawable.mediaservice_vector_repeat_off),
    TOGGLE_SHUFFLE(27, R.drawable.mediaservice_vector_shuffle),
    PLAYBACK_SPEED_0_5(28, R.drawable.mediaservice_vector_playback_speed_0_5),
    PLAYBACK_SPEED_0_8(29, R.drawable.mediaservice_vector_playback_speed_0_8),
    PLAYBACK_SPEED_1_0(30, R.drawable.mediaservice_vector_playback_speed_1_0),
    PLAYBACK_SPEED_1_2(31, R.drawable.mediaservice_vector_playback_speed_1_2),
    PLAYBACK_SPEED_1_5(32, R.drawable.mediaservice_vector_playback_speed_1_5),
    PLAYBACK_SPEED_2_0(33, R.drawable.mediaservice_vector_playback_speed_2_0),
    PLAYBACK_SPEED_3_0(34, R.drawable.mediaservice_vector_playback_speed_3_0),
    SEEK_TO(35, 0),
    SET_STANDARD_RATING(36, 0);
    
    public final int mIconRes;
    private final int mId;

    static {
        values();
    }

    private MediaAction(int i, int i2) {
        this.mId = i;
        this.mIconRes = i2;
    }
}
