package _08_tda;

public enum GrainProcessingState {

    CLEANING,
    DRYING,
    BLENDING,
    STORAGING,
    SIZING;

    public boolean isInboundProcesingFinished() {
        return this != CLEANING && this != DRYING && this != BLENDING;
    }

}
