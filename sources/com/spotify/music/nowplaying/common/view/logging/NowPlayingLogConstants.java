package com.spotify.music.nowplaying.common.view.logging;

public final class NowPlayingLogConstants {

    public enum ImpressionType {
        PAGE("page"),
        WIDGET("widget");
        
        private final String mStrValue;

        private ImpressionType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum SectionId {
        ARTIST_NAME("artist_name"),
        BACKGROUND("background"),
        BACK_BUTTON("back_button"),
        BAN_BUTTON("ban_button"),
        CAROUSEL("carousel"),
        CLOSE_BUTTON("close_button"),
        CONNECT_BUTTON("connect_button"),
        CONTEXT_MENU("context_menu"),
        CONTEXT_MENU_BUTTON("context_menu_button"),
        HEADER_CONTEXT_TITLE("header_context_title"),
        HEART_BUTTON("heart_button"),
        NEXT_BUTTON("next_button"),
        PLAY_BUTTON("play_button"),
        PREVIOUS_BUTTON("previous_button"),
        QUEUE_BUTTON("queue_button"),
        REPEAT_BUTTON("repeat_button"),
        SAVE_BUTTON("save_button"),
        SCROLL("scroll"),
        SEEK_BACKWARD_BUTTON("seek_backward_button"),
        SEEK_BAR("seek_bar"),
        SEEK_FORWARD_BUTTON("seek_forward_button"),
        SHARE_BUTTON("share_button"),
        SHUFFLE_BUTTON("shuffle_button"),
        SLEEP_TIMER_BUTTON("sleep_timer_button"),
        SPEED_CONTROL_BUTTON("speed_control_button"),
        TRACK_TITLE("track_title");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        ADD_FEEDBACK("add_feedback"),
        CLOSE("close"),
        OPEN_ALBUM("open_album"),
        OPEN_ARTIST("open_artist"),
        OPEN_CONNECT("open_connect"),
        OPEN_CONTEXT_MENU("open_context_menu"),
        OPEN_PLAY_CONTEXT_PAGE("open_play_context_page"),
        OPEN_QUEUE("open_queue"),
        OPEN_SLEEP_TIMER_MENU("open_sleep_timer_menu"),
        OPEN_SPEED_CONTROL_MENU("open_speed_control_menu"),
        PAUSE("pause"),
        PLAY("play"),
        REMOVE_FEEDBACK("remove_feedback"),
        REPEAT_CONTEXT("repeat_context"),
        REPEAT_DISABLED("repeat_disabled"),
        REPEAT_ONE_TRACK("repeat_one_track"),
        SAVE("save"),
        SCROLL("scroll"),
        SEEK("seek"),
        SHARE("share"),
        SHUFFLE_DISABLED("shuffle_disabled"),
        SHUFFLE_ENABLED("shuffle_enabled"),
        SKIP_TO_NEXT("skip_to_next"),
        SKIP_TO_PREVIOUS("skip_to_previous"),
        UNSAVE("unsave");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }
}
