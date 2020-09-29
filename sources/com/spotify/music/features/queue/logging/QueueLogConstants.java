package com.spotify.music.features.queue.logging;

public final class QueueLogConstants {

    public enum SectionId {
        BACK_BUTTON("back_button"),
        CLOSE_BUTTON("close_button"),
        CONTENT("content"),
        HEADER_CONTEXT_TITLE("header_context_title"),
        NEXT_BUTTON("next_button"),
        PLAY_BUTTON("play_button"),
        PREVIOUS_BUTTON("previous_button"),
        TRACKS("tracks");
        
        private final String mStrValue;

        private SectionId(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum UserIntent {
        ADD_TO_QUEUE("add_to_queue"),
        CHANGE_ORDER("change_order"),
        CLOSE("close"),
        DESELECT_TRACK("deselect_track"),
        MOVE_TO_NEXT_FROM("move_to_next_from"),
        MOVE_TO_UP_NEXT("move_to_up_next"),
        OPEN_PLAY_CONTEXT_PAGE("open_play_context_page"),
        PAUSE("pause"),
        PLAY("play"),
        REMOVE_FROM_QUEUE("remove_from_queue"),
        SCROLL("scroll"),
        SELECT_TRACK("select_track"),
        SKIP_TO_NEXT("skip_to_next"),
        SKIP_TO_PREVIOUS("skip_to_previous");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }
}
