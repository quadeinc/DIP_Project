/*===========================================================================
COPYRIGHT 2013 Vinícius G. Mendonça ALL RIGHTS RESERVED.

This software cannot be copied, stored, distributed without
Vinícius G. Mendonça prior authorization.

This file was made available on https://github.com/ViniGodoy and it
is free to be redistributed or used under Creative Commons license 2.5 br:
http://creativecommons.org/licenses/by-sa/2.5/br/
============================================================================*/
package dip_project.morpho;

import dip_project.color.ARGBChannels;
import dip_project.processing.Processing;
import dip_project.transform.Subtraction;
import dip_project.util.IntMatrix;

import java.awt.image.BufferedImage;

public class ErosionGranulometry extends AbstractCombinedOperator {
    public ErosionGranulometry(IntMatrix structuringElement, int iterations) {
        super(structuringElement, iterations);
    }

    @Override
    protected Processing[] createOperations(IntMatrix structuringElement,
                                            int iterations, BufferedImage source) {
        return new Processing[]
                {
                        new Erosion(structuringElement, iterations),
                        new Reconstruction(source),
                        new Subtraction(source, true, ARGBChannels.colors())
                };
    }
}
