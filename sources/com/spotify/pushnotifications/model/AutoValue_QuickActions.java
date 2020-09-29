package com.spotify.pushnotifications.model;

import java.util.List;

final class AutoValue_QuickActions extends QuickActions {
    private final List<QuickAction> actions;
    private final String category;

    AutoValue_QuickActions(String str, List<QuickAction> list) {
        if (str != null) {
            this.category = str;
            if (list != null) {
                this.actions = list;
                return;
            }
            throw new NullPointerException("Null actions");
        }
        throw new NullPointerException("Null category");
    }

    public final List<QuickAction> actions() {
        return this.actions;
    }

    public final String category() {
        return this.category;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof QuickActions) {
            QuickActions quickActions = (QuickActions) obj;
            return this.category.equals(quickActions.category()) && this.actions.equals(quickActions.actions());
        }
    }

    public final int hashCode() {
        return ((this.category.hashCode() ^ 1000003) * 1000003) ^ this.actions.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuickActions{category=");
        sb.append(this.category);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append("}");
        return sb.toString();
    }
}
