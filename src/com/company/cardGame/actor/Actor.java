package com.company.cardGame.actor;

import com.company.cardGame.cardSharks.Run;

public interface Actor {
    int FREEZE = 1;
    int CHANGE_START_CARD = 2;

    String getName();
    int getAction(Run run);
}
