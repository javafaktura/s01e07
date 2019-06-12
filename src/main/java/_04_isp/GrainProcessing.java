package _04_isp;

import _02_ocp.Grain;

public interface GrainProcessing {

    void clean(Grain grain);
    void dry(Grain grain);
    void blend(Grain grain);
    void batch(Grain grain);

}