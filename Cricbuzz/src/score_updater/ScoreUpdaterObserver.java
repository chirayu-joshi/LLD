package score_updater;

import inning.BallDetails;

public interface ScoreUpdaterObserver {
    void update(BallDetails ballDetails);
}
